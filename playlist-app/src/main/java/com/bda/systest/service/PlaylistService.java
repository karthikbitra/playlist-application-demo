package com.bda.systest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bda.systest.entity.Playlist;
import com.bda.systest.entity.Song;
import com.bda.systest.interfaces.PlaylistInterface;
import com.bda.systest.repository.PlaylistRepository;
import com.bda.systest.repository.SongRepository;
@Service
public class PlaylistService implements PlaylistInterface {
	@Autowired
	private PlaylistRepository playlistRepository;
	@Autowired
	private SongRepository songRepository;
	@Override
	public List<Playlist> getAll() {
		// TODO Auto-generated method stub
		return playlistRepository.findAll();
	}

	@Override
	public Playlist savePlaylist(Playlist pl) {
		// TODO Auto-generated method stub
		return playlistRepository.save(pl);
	}

	@Override
	public List<Song> saveSongs(List<Song> songs) {
		// TODO Auto-generated method stub
		songRepository.saveAll(songs);
		return songs;
	}

	@Override
	public String removePlaylist(int id) {
		// TODO Auto-generated method stub
		playlistRepository.deleteById(id);
		return id+" is deleted successfully";
	}

	@Override
	public String removeSong(int id) {
		// TODO Auto-generated method stub
		songRepository.deleteById(id);
		return id+" is deleted successfully";
	}

	@Override
	public Playlist modifyPlaylist(Playlist pl, int id) {
		// TODO Auto-generated method stub
		Optional<Playlist> playlistOptional = playlistRepository.findById(id);

		if (!playlistOptional.isPresent())
			return null ;

		pl.setId(id);
		
		playlistRepository.save(pl);

		return pl;

		
	}
	
}
