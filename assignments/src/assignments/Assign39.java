package assignments;


	class Shape {
	    public void draw() {
	        System.out.println("Drawing a generic shape");
	    }
	}

	class Circle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a Circle");
	    }
	}

	class Rectangle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a Rectangle");
	    }
	}

	class Triangle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a Triangle");
	    }
	}

	public class Assign39 {
	    public static void main(String[] args) {
	        System.out.println("=== 51. Dynamic Data Binding Using Super/Subclass Objects ===");

	        Shape shape1 = new Circle();
	        Shape shape2 = new Rectangle();
	        Shape shape3 = new Triangle();

	        shape1.draw();  
	        shape2.draw();  
	        shape3.draw();  

	        System.out.println("\n=== 52. Executing Same Function on Different Objects at Runtime ===");

	        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};

	        for (Shape shape : shapes) {
	            shape.draw();  
	        }
	    }
	}



