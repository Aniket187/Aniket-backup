package com.cybage.service;

import java.util.List;

import org.springframework.stereotype.Component;


public interface SoccerService{
//    /public List<String> getAllTeamPlayers(long teamId);
    public void addBarcelonaPlayer(String name, String position, int number);

	public List<String> getAllTeamPlayers(int i);
}