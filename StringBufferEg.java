package checkDefault;


//create str, mutable, synchronus thread safe
public class StringBufferEg {

	public static void main(String args[]) {
		StringBuffer name = new StringBuffer("hello");
		StringBuffer name1 = new StringBuffer();
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
