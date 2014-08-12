package com.codekart.FB;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class RestFB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookClient facebookClient = new DefaultFacebookClient("accessToken");
		User me = facebookClient.fetchObject("userId", com.restfb.types.User.class);
		System.out.println(me.getBio());
		System.out.println(me.getBirthday()+":"+me.getEmail());
		System.out.println("Interested in:-");
		for(String s:me.getInterestedIn())
			System.out.println(s);
	}

}
