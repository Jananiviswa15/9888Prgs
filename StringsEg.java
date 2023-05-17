package checkDefault;

public class StringsEg {
//NPDT, contin / seq of cha --> "priya", "455"
	//String ,StringBuffer, StringBuilder 
	
	//String class --> java.lang
	//String literal , new keyword
	public static void main(String args[]) {
		
		String name = "JANnani";  //lit
		String emptyStr = "";
		
		String blankStr = "  fgfgfg      ";
		String name1 = new String("janani");   //obj
		System.out.println(name1.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.charAt(0));  //'J'
		//System.out.println(name.charAt(20));  //'J'
		System.out.println(name.indexOf('e'));
		
//		System.out.println(name.equals(name1));
		System.out.println("janani".equalsIgnoreCase("JANANI"));
		System.out.println("==========");
		System.out.println(name.isEmpty());
		System.out.println(emptyStr.isEmpty());
		
		System.out.println(blankStr.isBlank());
		System.out.println(blankStr.stripLeading());
		System.out.println(blankStr.stripTrailing());
		System.out.println(blankStr.strip());
		
		System.out.println(name.concat(blankStr));
		System.out.println(name.replace('a', '9'));
		
		System.out.println(name.getClass().getName());
		System.out.println(name.getClass().getSuperclass().getName());
		
		
		
		
		
	}
}
