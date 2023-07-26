package com.ibm.service;

import com.ibm.entity.Player;
import com.ibm.vo.ResponseTemplate;

public interface PlayerService {

	Player save(Player p);

	Player fetch(int id);
	
	ResponseTemplate fetchPlayerWithTeam(int id);
}

