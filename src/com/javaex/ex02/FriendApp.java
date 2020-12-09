package com.javaex.ex02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Friend> lFriend = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	for(int i=0;i<3;i++) {
    		String[]friend = (sc.nextLine()).split(" ");
    		lFriend.add(new Friend(friend[0],friend[1],friend[2]));
    	}
    	for(Friend f:lFriend) {
    		f.show();
    	}
    	
    	sc.close();
    }

}
