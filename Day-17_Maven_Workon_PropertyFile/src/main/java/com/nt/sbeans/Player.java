package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("player")
@PropertySource("com/nt/commons/player.properties")
public class Player {
//	@Value("${player.id}")
	private int playerId;
//	@Value("${player.name}")
	private String playerName;
//	@Value("${player.yearsNumber}")
	private int yearsNumber;
//	@Value("${team.name}")
	private String teamName;
	
	public int getPlayerId() {
		return playerId;
	}
	
	@Autowired
	public void setPlayerId(@Value("${player.id}") int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	
	@Autowired
	public void setPlayerName(@Value("${player.name}") String playerName) {
		this.playerName = playerName;
	}
	public int getYearsNumber() {
		return yearsNumber;
	}
	
	@Autowired
	public void setYearsNumber(@Value("${player.yearsNumber}") int yearsNumber) {
		this.yearsNumber = yearsNumber;
	}
	public String getTeamName() {
		return teamName;
	}
	
	@Autowired
	public void setTeamName(@Value("${team.name}") String teamName) {
		this.teamName = teamName;
	}
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", yearsNumber=" + yearsNumber
				+ ", teamName=" + teamName + "]";
	}
	
	
}
