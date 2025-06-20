package com.example.VotingApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("userlist")
public class SimpleUserList implements UserList  {
	
	private List<User> userlist;
	
	
	public SimpleUserList() {
		this.userlist=new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		userlist.add(user);
		
	}

	@Override
	public List<User> getUsersList() {
		
		return this.userlist;
	}

}
