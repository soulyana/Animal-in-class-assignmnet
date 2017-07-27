/*
 * All bears are animals but not all animals are bears
 */
public class Bear extends Animal {
	public Bear() {
		System.out.print("A cub is born in a cave...");
	}
	
	@Override 
	public String sleep() {
		return "A bear hibernates during the winter in a dark cave..."; 
	}
	
	@Override 
	public String eat() {
		return "A bear eats honey..."; 
	}
	
	public String play() {
		return "A bear play fights with his/her family to grow stronger..."; 
	}
	
	public String roar() {
		return "A bear roars to ward off intruders or to announce a fight..."; 
	}
}
