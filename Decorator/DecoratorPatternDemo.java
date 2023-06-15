package Decorator;

public class DecoratorPatternDemo {
public static void main(String[] args) {
Shape circle = new Circle();  //rt
Shape redCircle = new RedShapeDecorator(new Circle()); //new Rectamngle
Shape redRectangle = new RedShapeDecorator(new Rectangle());
System.out.println("Circle with normal border");
circle.draw();
System.out.println("\nCircle of red border");
redCircle.draw();
System.out.println("\nRectangle of red border");
redRectangle.draw();
}
}
