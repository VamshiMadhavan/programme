
public class HelloWorld {
	
	static String sentence;
	
	public void   SetHelloWorld(String sentence) {
		this.sentence = sentence;
	}
	
	public static String   GetHelloWorld() {
		return sentence;
		
	}
	
	public static void display() {
		HelloWorld.sentence="helloworld";
		System.out.println();
		
	}



	public static void main(String args[]) {

	}

}
