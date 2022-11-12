
public class Main {
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new LinkedBasedStack<Integer>();
		s.push(5);
		s.push(2);
		s.push(4);
		s.push(7);
		s.push(9);
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}

}
