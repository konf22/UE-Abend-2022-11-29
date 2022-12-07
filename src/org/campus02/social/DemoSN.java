package org.campus02.social;

import java.util.ArrayList;
import java.util.Comparator;

public class DemoSN {

	public static void main(String[] args) {
		
		SocialNetwork sn = SocialNetwork.generateDemoNetwork();
		
		//TODO 1: geben Sie alle User des Social Networks basierend
		//auf Ihrer geschriebenen .toString() Methode aus
		for (User user : sn.getUsers()) {
			System.out.println(user);
		}
	
		//TODO 2: probieren Sie die implementierte rekursive Methode
		//der Klasse SocialNetwork für verschiedene Benutzer und
		//Werte für maxDepth aus.
		User user = sn.getUsers().get(0);
		ArrayList<User> allFriends = sn.findAllFriends(user, 1, 2);

		ArrayList<User> allFriends2 = sn.findAllFriends2(user, 1, 2);
		System.out.println("allFriends = " + allFriends);
		System.out.println("allFriends2 = " + allFriends2);
		
	}
	
}
