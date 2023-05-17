package checkDefault;


//create str, mutable, non synchronus not thread safe
public class StringBuilderEg {

	public static void main(String args[]) {
		StringBuilder name = new StringBuilder("hello");
		StringBuilder name1 = new StringBuilder();
		name1.append("hi"); 
		System.out.println(name);
		System.out.println(name1);
		
		System.out.println(name.reverse());
		System.out.println(name);
		
		System.out.println(name.delete(1, 2));
		System.out.println(name.getClass().getName());
		//stringBuffer -->. abstrBuilder --> object
		System.out.println(name.getClass().getSuperclass().getSuperclass().getName());
		
		System.out.println(name.replace(0, 3, "a"));
		
		System.out.println(name.insert(0, "heloooo"));
		
		System.out.println(name.length());
		System.out.println(name.substring(2));
		System.out.println(name.capacity());
	}
}
