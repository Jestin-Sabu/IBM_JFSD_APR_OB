package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Player;
import com.ibm.service.PlayerService;
import com.ibm.vo.ResponseTemplate;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService service;
	
	@PostMapping(value="/player", consumes="application/json")
	public String addPlayer(@RequestBody Player player) {
		service.save(player);
		return "Player Added";
	}
	
	@GetMapping(value="/player/{id}", produces="application/json")
	public Player getPlayer(@PathVariable int id) {
		return service.fetch(id);
	}
	
	@GetMapping(value="/playerWithTeam/{id}", produces="application/json")
	public ResponseTemplate getPlayerWithTeam(@PathVariable int id) {
		return service.fetchPlayerWithTeam(id);
	}
	
}
