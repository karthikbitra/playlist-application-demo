package com.bda.systest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bda.systest.entity.Playlist;
import com.bda.systest.entity.Song;
import com.bda.systest.interfaces.PlaylistInterface;

@RestController
@RequestMapping("playlist-app")
public class PlaylistController {
	@Autowired
	private PlaylistInterface playlistInterface;
	@GetMapping("/getAll")
	public List<Playlist> getAllPlaylists(){
		return playlistInterface.getAll(); 
	}
	@PostMapping("/addPlaylist")
	public Playlist addPlaylist(@RequestBody Playlist pl) {
		return playlistInterface.savePlaylist(pl);
	}
	@PatchMapping("/updatePlaylist/{id}")
	public Playlist updatePlaylist(@RequestBody Playlist pl, @PathVariable("id") int id) {
		return playlistInterface.modifyPlaylist(pl, id);
	}
	@PostMapping("/addSongs")
	public List<Song> addSongs(@RequestBody List<Song> songs){
		return playlistInterface.saveSongs(songs);
	}
	@DeleteMapping("/deletePlaylist/{id}")
	public String deletePlaylist(@PathVariable("id") int id) {
		return playlistInterface.removePlaylist(id);
	}
	@DeleteMapping("/deleteSong/{id}")
	public String deleteSong(@PathVariable("id") int id) {
		return playlistInterface.removeSong(id);
	}
}
