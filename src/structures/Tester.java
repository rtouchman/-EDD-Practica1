package structures;

public class Tester {

	public static void main(String[] args) {
		
		List<String, Integer> list = new List<String, Integer>();
		
		list.add("hola", 4);
		list.add("mundo", 3);
		list.add("holaa", 2);
		list.add("mundoo", 1);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
	}
	
}
