package com.example.VotingApp;

import org.springframework.stereotype.Component;

@Component("independent")
public class Independent implements PoliticalParty {
	
	private String partyname="independent";
	@Override
	public String getPartyName() {
		return partyname;
	}

}
