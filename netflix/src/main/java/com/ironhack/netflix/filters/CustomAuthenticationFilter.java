package com.ironhack.netflix.filters;

import com.auth0.jwt.*;
import com.auth0.jwt.algorithms.*;
import com.fasterxml.jackson.databind.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import lombok.extern.slf4j.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.web.authentication.*;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static org.springframework.http.MediaType.*;

@Slf4j
public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private final AuthenticationManager authenticationManager;

    /**
     * Constructor for CustomAuthenticationFilter
     *
     * @param authenticationManager
     */
    public CustomAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    /**
     * Attempts to authenticate the user with given credentials
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @return Authentication object if successful, otherwise throws an exception
     * @throws AuthenticationException
     */

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        /*
        log.error(request.getHeader("Authorization").substring(6));

        String base64Header = request.getHeader("Authorization").substring(6);
        String decodedHeader = new String(Base64.getDecoder().decode(base64Header));
        log.error(decodedHeader);
        String[] usernameAndPassword = decodedHeader.split(":");
        log.info(usernameAndPassword[0]);
        log.info(usernameAndPassword[1]);
         */


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        log.info("Username is: {}", username);
        log.info("Password is: {}", password);
        // Creating an Authentication token with given username and password
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        System.out.println(authenticationToken.getPrincipal());
        System.out.println(authenticationToken.getAuthorities());

        // Attempting to authenticate the user with the given credentials
        return authenticationManager.authenticate(authenticationToken);
    }

    /**
     * Method is called if the user is successfully authenticated
     *
     * @param request        HttpServletRequest
     * @param response       HttpServletResponse
     * @param chain          FilterChain
     * @param authentication Authentication
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {
        // Cast the authentication principal to User object
        User user = (User) authentication.getPrincipal();
        // Creating an HMAC256 encoded JWT with secret key
        Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
        // Adding user details and roles to the token
        String access_token = JWT.create()
                .withSubject(user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                .withIssuer(request.getRequestURL().toString())
                .withClaim("roles", user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .sign(algorithm);
        // Creating a map with the generated token
        Map<String, String> tokens = new HashMap<>();
        tokens.put("access_token", access_token);
        // Setting the response type to application/json
        response.setContentType(APPLICATION_JSON_VALUE);
        // Writing the token as response
        new ObjectMapper().writeValue(response.getOutputStream(), tokens);
    }

}
