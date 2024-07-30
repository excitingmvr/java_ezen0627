package com.mycompany.ch04;

public class Switch2 {

	public static void main(String[] args) {

	// 사장, 부장, 과장, 대리, 주임, 사원, 나
	// 사장의 연봉은 얼마 입니다. 
		
		String position = "대리";
		
		switch (position) {
		case "사원": // if(position.equals("부장"))
			System.out.println("연봉은 5,000 입니다.");
			break;
		case "대리":
			System.out.println("연봉은 6,000 입니다.");
			break;
		case "과장":
			System.out.println("연봉은 8,000 입니다.");
			break;
		case "부장":
			System.out.println("연봉은 11,000 입니다.");
			break;
		case "사장":
			System.out.println("연봉은 20,000 입니다.");
			break;
		default:
			System.out.println("없는 position 입니다. 다시 입력해 주세요");
			break;
		}
		
		if (position == "사장") {
			
		}
	}

}
