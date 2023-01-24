package com.ironhack.songs.repositories;

import com.ironhack.songs.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SongRepositoryTest {

    @Autowired
    SongRepository songRepository;
    Song song;
    Song song2;
    Song song3;
    Song song4;

    @BeforeEach
    void setUp() {
        song = new Song("Back in black", "Back in black", "ACDC");
        song2 = new Song("Thunderstruck", "Back in black", "ACDC");
        song3 = new Song("I will possess your Heart", "DC", "Death Cab for Cutie");
        song4 = new Song("I am the antichrist", "String", "Kishie Bashie");

        songRepository.saveAll(List.of(song, song2, song3, song4));


    }

    @AfterEach
    void tearDown() {
        songRepository.deleteAll();
    }


    @Test
    void shouldAddNewSong_WhenMethodSaveCalled() {
        Optional<Song> newSongOptional = songRepository.findById(8l);

        if (newSongOptional.isPresent()) {
            Song  song = newSongOptional.get();
        }
        assertEquals("Back in black", songRepository.findById(song.getId()).get().getSongTitle());
        assertEquals(1, songRepository.findAll().size());

    }

    @Test
    void shouldFindSongsByArtist_WhenArtistIsGiven() {
        List<Song> acdcSongs = songRepository.findByArtistContaining("AC");
        assertEquals(2, acdcSongs.size());

        System.out.println(acdcSongs.get(0).getSongTitle());

        //Song mySong = songRepository.findBySongTitle("Back in Black");

    }

}
