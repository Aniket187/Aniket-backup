package com.cybage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cybage.model.Player;
import com.cybage.model.Team;
import com.cybage.repository.PlayerRepository;
import com.cybage.repository.TeamRepository;


@Service
public class SoccerServiceImpl implements SoccerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private TeamRepository teamRepository;
   /* public List<String> getAllTeamPlayers(long teamId) {
        List<String> result = new ArrayList<String>();
        Optional<Player> players = playerRepository.findById(teamId);
        for (Player player : players) {
            result.add(player.getName());
        }
        return result;
    }*/
    public void addBarcelonaPlayer(String name, String position, int number) {
    	
    	//Optional<Team> barcelona =teamRepository.findById((1L);
    	Team barcelona=new Team();
    	barcelona.setId(1L);
    	barcelona.setName("barcelona");
       	Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        //System.out.println(barcelona);
        newPlayer.setTeam(barcelona);
        playerRepository.save(newPlayer);
    }
	@Override
	public List<String> getAllTeamPlayers(int teamId) {
		 List<String> result = new ArrayList<String>();
	        List<Player> players = playerRepository.findByTeamId(teamId);
	        for (Player player : players) {
	            result.add(player.getName());
	        }
	        return result;
	}
}