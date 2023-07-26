package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Album;
import com.ibm.service.AlbumService;

@CrossOrigin
@RestController
public class AlbumController {
	
	@Autowired
	private AlbumService service;
	
	@PostMapping(value="/add", consumes="application/json")
	public String add(@RequestBody Album a) {
		int id = service.save(a);
		return "Album added. ID=" + id;
	}
	
	@GetMapping(value="/album/{id}", produces="application/json")
	public Album get(@PathVariable int id) {
		return service.find(id);
	}
	
	@GetMapping(value="/albums", produces="application/json")
	public List<Album> list(){
		return service.list();
	}
	
	@DeleteMapping("/album/{id}")
	public String delete(@PathVariable int id) {
		return service.remove(id)?"Album deleted":"Album not found";
	}
	
	@GetMapping(value="/album/title/{title}", produces="application/json")
	public Album title(@PathVariable String title) {
		return service.findByTitle(title);
	}
	
	@GetMapping(value="/album/artist/{artist}", produces="application/json")
	public List<Album> artists(@PathVariable String artist){
		return service.byArtist(artist);
	}
	
	@GetMapping(value="/album/genre/{genre}", produces="application/json")
	public List<Album> genre(@PathVariable String genre){
		return service.byGenre(genre);
	}


}
