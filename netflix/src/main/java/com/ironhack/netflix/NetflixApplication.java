package com.ironhack.netflix;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class NetflixApplication implements CommandLineRunner {

    @Autowired
    SeriesRepository seriesRepository;

    public static void main(String[] args) {
        SpringApplication.run(NetflixApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la serie:");
        String  name = scanner.nextLine();
        System.out.println("Introduce el año");
        Integer year = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el número de temporadas");
        Integer numberOfSeasons = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el numero de capitulos");
        Integer numberOfEpisodes = Integer.parseInt(scanner.nextLine());

        seriesRepository.save(new Series(name, year, numberOfSeasons, numberOfEpisodes));

    }
}
