package com.example.VotingApp;

import org.springframework.stereotype.Component;

@Component("republic")
public class Republic implements PoliticalParty {

		private String partyname="republic";
	@Override
	public String getPartyName() {
		return partyname;
	}

}
