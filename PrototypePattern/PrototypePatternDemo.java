package PrototypePattern;

public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache(); //map --> 3 val 1 cir,  2 sqr, 3 rect 
		Shape clonedShape = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape.getType());
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
}