package practisedcodes;

class details {
	public void sound() {
		System.out.println("this is sound method");
	}
	public details() {
		System.out.println("This is constrcutor block");	}
}

public class car{
	public static void main(String args[]) {
		details obj = new details();
		obj.sound();
	}
}