package com.javaex.ex03;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.javaex.ex02.Friend;

public class GoodsApp {

    public static void main(String[] args) {
    	System.out.println("상품을 입력해주세요(종료 q)");
    	Scanner sc = new Scanner(System.in);
    	List<Goods> lGoods = new ArrayList<Goods>();
    	int sum = 0;
    	
    	while(true) {
    	String s = sc.nextLine(); 
    		if(s.equals("q")) {
    			break;
    		}else {
    			String[]good = s.split(",");
    			lGoods.add(new Goods(good[0],Integer.parseInt(good[1]),Integer.parseInt(good[2])));
    		}
    	}
    	sc.close();
    	for(Goods g : lGoods) {
    		g.show();
    		sum += g.getCount();
    	}
    	System.out.println("모든 상품의 갯수는 "+sum+"개 입니다.");
    }

}
