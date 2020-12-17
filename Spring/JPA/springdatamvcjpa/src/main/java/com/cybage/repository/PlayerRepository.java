package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

	
	 List<Player> findByTeamId(long teamId);
	 
	}
