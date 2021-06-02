package com.bda.systest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bda.systest.entity.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

}
