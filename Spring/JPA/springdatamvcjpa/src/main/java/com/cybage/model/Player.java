package com.cybage.model;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Player {

	 	@Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
	    @SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	    private Long id;
	 
	 
	    @Column(name = "name")
	    private String name;
	    
	    
	    @Column(name = "num")
	    private int num;
	    
	    @Column(name = "position")
	    private String position;
	    
	    
	    @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "team_id", nullable = false)
	    private Team team;
	    
	    
	    public Player() {
	    }
	       
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public Team getTeam() {
			return team;
		}
		public void setTeam(Team barcelona) {
			this.team = barcelona;
		}

		public void setTeam(Optional<Team> barcelona) {
			// TODO Auto-generated method stub
			
		}
		
}

//Create table player(id int primary key, team_id int, name varchar(20), num  int, position varchar(20),CONSTRAINT fk_team_id  FOREIGN KEY (team_id)  REFERENCES team(id))

