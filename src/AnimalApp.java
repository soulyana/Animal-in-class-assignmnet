
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		Monkey m = new Monkey(); 
		print(m.eat());
		print(m.sleep()); 
		print(m.climb()); 
		print(m.scratch()); 
		
		Bear be = new Bear(); 
		print(be.eat()); 
		print(be.sleep()); 
		print(be.play()); 
		print(be.roar()); 

	}
	private static void print(String s){
		System.out.println(s);
	}
}
