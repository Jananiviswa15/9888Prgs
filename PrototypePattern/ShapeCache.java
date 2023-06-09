package PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	public static Shape getShape(String shapeId) { //2
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();  //circle
	}
	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes
	public static void loadCache() {
		Circle circle = new Circle(); //type = "corcle
		circle.setId("1");
		shapeMap.put(circle.getId(),circle);  //1,circle obj
		Square squareObj = new Square();
		squareObj.setId("2");
		shapeMap.put(squareObj.getId(),squareObj);  //2, square
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}