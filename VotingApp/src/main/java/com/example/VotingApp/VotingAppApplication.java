package com.example.VotingApp;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class VotingAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(VotingAppApplication.class, args);
							
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext("com.example.VotingApp");
		
		//beaN  of authority counter
		AuthorityCounter authorityCounter = 
				context.getBean(AuthorityCounter.class);
		while(true) {
		System.out.println("---Welcome User---");
		System.out.println("choose from below \n 1. i want to vote \n 2.see all votes");
		Scanner scan = new Scanner(System.in);
		int userselect=scan.nextInt();
		
		String beanid="";
		
		switch(userselect) {
		case 1:{
			System.out.println("enter your username");
			
			String name = scan.next();
			User user=(User)context.getBean("user");
			user.setuserName(name);
			System.out.println(user.getusername()+"----");
			
			System.out.println("choose the party you want to vote for:"
					+ "\n 1. democratic \n 2.republic \n 3.independent");
			
			int partyselect = scan.nextInt();
			switch(partyselect) {
			case 1:{
				beanid="democratic";
				break;
			}
			case 2:{
				beanid="republic";
				break;
			}
			case 3:{
				beanid="independent";
				break;
			}
			
			}
			
			PoliticalParty party =(PoliticalParty) context.getBean(beanid);
			user.setPoliticalParty(party);
			UserList userlist= (UserList)context.getBean("userlist");
			userlist.addUser(user);
			authorityCounter.setUserList(userlist);
			System.out.println("thank you");
			break;
		}
		case 2:{
			List<User> usersList = authorityCounter.getUserList().getUsersList();
			usersList.forEach(item-> System.out.println(item.getusername()+" voted for "+item.getpoliticalParty().getPartyName()));
	
							
			break;
		}
		}
		}
	}

}
