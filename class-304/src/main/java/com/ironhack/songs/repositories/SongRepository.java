package com.ironhack.songs.repositories;

import com.ironhack.songs.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
}
