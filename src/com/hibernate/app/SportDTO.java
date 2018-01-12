package com.hibernate.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports_table")
public class SportDTO implements Serializable{

	@Id
	@Column(name="sports_name")
	private String sportName;
	
	@Column(name="sports_type")
	private String sportType;
	
	@Column(name="no_of_players")
	private int noOfPlayers;
	
	@Column(name= "sports_duration")
	private int duration;
	
	//constructor
	public SportDTO(){
		
	}
	
	//generate getters and setters method
	//Alt+shift+S+R
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public String getSportType() {
		return sportType;
	}
	public void setSportType(String sportType) {
		this.sportType = sportType;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
