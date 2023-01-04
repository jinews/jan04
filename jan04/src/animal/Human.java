package animal;

import java.util.Set;

import dog01.Dog;

public class Human extends Animal{
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
		
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		// -기호 빼기
		ssn = ssn.replaceAll("-", "");
		//모자란 자리수만큼 *로 입력해서 저장하기
			while (ssn.length() < 13) {
				ssn += "*";
		}
		this.ssn = ssn;
	}

	//add()
	int add(int num1, int num2){
		return num1 + num2;
	}
	
	@Override
	public void sound() {
		//super.sound();
		System.out.println("아...추움...");
	}
	
	public static void main(String[] args) {
		
		Human human = new Human();
		
		Human.check = 5000; //static붙은 녀석들은 클래스명.변수명으로 처리
		//human.check = 100;// 
		//Human.NUM = 15015; final 선언값 (상수) 변환불가 
		
		int result = human.add(15, 30);
		human.setSsn ("840506"); //저장
		System.out.println(human.getSsn()); //출력
		

	
		
		//Object h = new Human();
//		// 부모 		자식
//		Animal h2 = new Human();
		
	}
}
