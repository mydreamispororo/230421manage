package main;

import model.Member;


public class Register {

	public static void main(String[] args) {
		//new Member(); 생성자를 만드는 코드 : 초기화 작업
		// - 처음값으로 어떤 값을 지정할 건지?? 해도 되고 안해도 되고
		
		Member insa1 = new Member(); //빈값으로 초기화
		System.out.println(insa1);
		Member insa2 = new Member("Busanit Academy"); //아이디만 넣고 초기화
		Member insa3 = new Member("busanit", "12345"); //아이디, 비번만 넣고 초기화

		Member insa = new Member();
		insa.setUserid("koreait");
		System.out.println(insa.getUserid());
		
		insa.setPasswd("123456789");
		System.out.println(insa.getPasswd());
		
		//나이는 음수를 입력할 수 없음 -> 0보다 작은 값 넣으면 20살로 초기화
		
		insa.setAge(10);
		System.out.println(insa.getAge());
		
	
		
		
	}

}
