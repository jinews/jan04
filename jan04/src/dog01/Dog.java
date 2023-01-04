package dog01;

import java.util.HashSet;
import java.util.Set;

import animal.Animal;
import animal.Human;

public class Dog extends Animal {

	//1 ~ 45 숫자 6개를 뽑아주는 개
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>();//중복제거
		while (lotto.size() < 6) {
			lotto.add(   (int) (Math.random() * 45) + 1);
		}
		return lotto;
	}
	
	@Override
	public void sound() {
		//super.sound();
		System.out.println("멍멍....");
	}
	
	public static void main(String[] args) {
		
		Animal ani = new Animal();//
		ani.sound();
		
		Dog dog = new Dog();
		dog.age = 10;
		dog.name = "오";
		
		
		Human human = new Human();
		
		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
		
		System.out.println(dog.lotto());
		
	}

}
