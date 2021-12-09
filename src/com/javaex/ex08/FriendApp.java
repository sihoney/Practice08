package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요.");
		
		Friend[] fArr = new Friend[3]; // 배열 선언 (객체 생성 X)
		
		for(int i = 0; i < 3; i++) {
		
			String str = sc.nextLine();
			
			String[] arr = str.split(" ");
			
			/*
			fArr[i].setName(arr[0]);
			fArr[i].setHp(arr[1]);
			fArr[i].setSchool(arr[2]);
			*/
			fArr[i] = new Friend(arr[0], arr[1], arr[2]);
		}
		
		for(Friend f : fArr) {
			System.out.println(f.toString());
		}
		
		sc.close();
	}
}
