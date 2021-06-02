package com.bda.systest.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bda.systest.entity.Playlist;
import com.bda.systest.entity.Song;

public interface PlaylistInterface {

	List<Playlist> getAll();

	Playlist savePlaylist(Playlist pl);

	List<Song> saveSongs(List<Song> songs);

	String removePlaylist(int id);

	String removeSong(int id);

	Playlist modifyPlaylist(Playlist pl, int id);


}
