package com.ironhack.netflix;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NetflixApplicationTests {

    @Autowired
    MovieRepository movieRepository;
    @Autowired
    SeriesRepository seriesRepository;
    @Autowired
    PlanRepository planRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserRepository userRepository;

    Movie movie;
    Series series;
    Plan plan;
    Account account;
    User user;

    @BeforeEach
    void setUp() {
        movie = movieRepository.save(new Movie("Eternal Sunshine of the Spotless Mind", 2003, 137));
        series = seriesRepository.save(new Series("Breaking Bad", 2013, 6, 12));
        plan = planRepository.save(new Plan("Premium", 14.99));
        account = accountRepository.save(new Account("jaume@jaume.com", "MyPassword", plan));
        user = userRepository.save(new User("Jaume", "https://mypicture.com/me", account));


    }

    @AfterEach
    void tearDown() {
/*

        userRepository.deleteAll();
        accountRepository.deleteAll();
        planRepository.deleteAll();
        movieRepository.deleteAll();
        seriesRepository.deleteAll();

 */
    }

    @Test
    void moviesAndSeriesAreStored_WhenMethodSaveCalled() {

        Assertions.assertEquals("Eternal Sunshine of the Spotless Mind", movieRepository.findAll().get(0).getName());

        Assertions.assertEquals("Breaking Bad", seriesRepository.findAll().get(0).getName());

    }

    @Test
    void shouldCreatePlan_whenSaveMethodCalled() {
        Assertions.assertEquals("Premium", planRepository.findAll().get(0).getName());

    }

    @Test
    void shouldCreateAccount_whenSaveIsCalled() {
        Assertions.assertEquals("jaume@jaume.com", accountRepository.findAll().get(0).getEmail());

    }

    @Test
    void shouldCreateUser_whenUserIsSaved() {
        Assertions.assertEquals("Jaume", userRepository.findAll().get(0).getName());
    }

    @Test
    void shouldShowUserInfo_whenAccountIsRetrieved() {

        Assertions.assertEquals("Jaume", accountRepository.findAll().get(0).getUsers().get(0).getName());
    }

    @Test
    void shouldStoreInFavorites_WhenUserAddsFavoriteMedia() {
        user.addToFavorites(movie);
        userRepository.save(user);

        Assertions.assertEquals("Eternal Sunshine of the Spotless Mind", userRepository.findAll().get(0).getFavoriteMedia().get(0).getName());

    }

}
