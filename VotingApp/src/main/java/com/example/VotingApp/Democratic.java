package com.example.VotingApp;

import org.springframework.stereotype.Component;

@Component("democratic")
public class Democratic implements PoliticalParty {

	private String partyname="democratic";
		
	
	public String getPartyName() {
		return partyname;
	}

}
