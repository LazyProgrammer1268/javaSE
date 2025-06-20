package com.example.VotingApp;

import org.springframework.stereotype.Component;

@Component("authoritycounter")
public class SimpleAuthorityCounter implements AuthorityCounter {
	
	private UserList userlist;
	@Override
	public void setUserList(UserList userlist) {
		this.userlist=userlist;
	}

	@Override
	public UserList getUserList() {
		return userlist;
	}

}
