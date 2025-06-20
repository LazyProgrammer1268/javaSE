package com.example.VotingApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class SimpleUser implements User {
	
	private String username;
	 				
	private PoliticalParty party;
	
	@Override
	public void setuserName(String username) {
		this.username=username;
	}

	@Override
	public String getusername() {
		return this.username;
	}

	@Override
	public void setPoliticalParty(PoliticalParty party) {
		this.party=party;
	}

	@Override
	public PoliticalParty getpoliticalParty() {
		return party;
	}
	

}
