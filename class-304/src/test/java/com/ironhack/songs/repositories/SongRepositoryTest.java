package com.ironhack.songs.repositories;

import com.ironhack.songs.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SongRepositoryTest {

    @Autowired
    SongRepository songRepository;
    Song song;

    @BeforeEach
    void setUp() {
        song = new Song("Back in black", "Back in black", "ACDC");
        System.out.println(song.getId());
        song = songRepository.save(song);
        System.out.println(song.getId());

    }

    @AfterEach
    void tearDown() {
        songRepository.deleteAll();
    }


    @Test
    void shouldAddNewSong_WhenMethodSaveCalled() {
        assertEquals("Back in black", songRepository.findById(song.getId()).get().getSongTitle());
        assertEquals(1, songRepository.findAll().size());

    }

}
