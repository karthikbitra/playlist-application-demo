package com.bda.systest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bda.systest.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {

}
