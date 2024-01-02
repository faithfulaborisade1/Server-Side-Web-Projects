package decorators;

public class ShapeDecorator extends Shape {
	
	protected Shape decoratedShape;
	
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		// TODO Auto-generated method stub
		
	}
	
	

}
