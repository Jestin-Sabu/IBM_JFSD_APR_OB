package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Album;
import com.ibm.repo.AlbumRepository;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumRepository repo;
	
	@Override
	public int save(Album a) {
		repo.save(a);
		return a.getId();
	}

	@Override
	public Album find(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Album> list() {
		return repo.findAll();
	}

	@Override
	public boolean remove(int id) {
		repo.deleteById(id);
		return true;
	}
	
	@Override
	public Album findByTitle(String title) {
		return repo.findByTitle(title);
	}

	@Override
	public List<Album> byArtist(String artist) {
		return repo.findByArtist(artist);
	}

	@Override
	public List<Album> byGenre(String genre) {
		return repo.findByGenre(genre);
	}

}
