/*
 * All monkeys are Animals but all Animals are not Monkeys
 */
public class Monkey extends Animal {
	public Monkey() {
		System.out.println("A monkey is born...");
	}
	
	@Override
	public String sleep() {
		return "A monkey sleeps in a tree with his family..."; 
	}
	
	@Override
	public String eat() {
		return  "A monkey eats bananas and steals fruits from tourists..."; 
	}
	
	public String scratch() {
		return "A monkey scratches his family member's back... "; 
	}
	
	public String climb() {
		return "A monkey climbs trees using his paws and legs..."; 
	}
}