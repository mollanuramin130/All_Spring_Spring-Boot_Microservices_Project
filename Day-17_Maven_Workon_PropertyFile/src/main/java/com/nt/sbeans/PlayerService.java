package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("playerService")
public class PlayerService {
	@Autowired
	@Qualifier("player")
	private Player player;
	
	public void displayPlayerInfo() {
		System.out.println(player.toString());
	}
	
}
