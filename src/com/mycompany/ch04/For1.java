package com.mycompany.ch04;

public class For1 {

	public static void main(String[] args) {

		for(int a=1; a<=3; a++) {
			System.out.println("a: "+ a);
		}
		System.out.println("----------------------");
		for(int i=1; i<=3; i++) {
			System.out.println("i: "+ i);
		}
//		System.out.println("i: "+ i);
		
		// 2단 부터 출력 되는 구구단 프로그래을 작성하시요
		// 각 단계 마다 구분선을 넣어 주세요.
		// 2 * 1 = 2
		
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
			if(i != 9) {
				System.out.println("----------------------");
			} else {
//				by pass
			}
		}
		
	}

}
