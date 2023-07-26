package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.entity.Player;
import com.ibm.repo.PlayerRepository;
import com.ibm.vo.ResponseTemplate;
import com.ibm.vo.Team;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repo;
	
	@Autowired
	private RestTemplate rest;
	
	@Override
	public Player save(Player p) {
		return repo.save(p);
	}

	@Override
	public Player fetch(int id) {
		return repo.findById(id).get();
	}

	@Override
	public ResponseTemplate fetchPlayerWithTeam(int id) {
		ResponseTemplate response = new ResponseTemplate();
		Player p = repo.findById(id).get();
		response.setPlayer(p);
		Team t = rest.getForObject("http://localhost:9091/team/" + p.getTeamId(), Team.class);
		response.setTeam(t);
		return response;
	}

}
