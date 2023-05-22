package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer>{


	Album findByTitle(String title);
	
	List<Album> findByArtist(String artist);
	
	List<Album> findByGenre(String genre);
}
