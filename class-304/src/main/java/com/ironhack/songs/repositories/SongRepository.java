package com.ironhack.songs.repositories;

import com.ironhack.songs.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    //SELECT * from song where artist = "ACDC"
    List<Song> findByArtistContaining(String artist);
    List<Song> findByArtistAndAlbumTitle(String artist, String albumTitle);
    Song findBySongTitle(String songTitle);

}
