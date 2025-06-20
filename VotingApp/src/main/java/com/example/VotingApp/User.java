package com.example.VotingApp;

public interface User {
	
	void setuserName(String username);
	String getusername();
	void setPoliticalParty(PoliticalParty party);
	PoliticalParty getpoliticalParty();

}
