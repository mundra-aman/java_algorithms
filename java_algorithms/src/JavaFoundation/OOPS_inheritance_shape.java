package JavaFoundation;

	class Shape
	{
	 
	    public Shape()
	    {
	        System.out.println("Shape");
	    }
	 
	    public void draw()
	    {
	        System.out.println("Drawing Shape");
	    }
	}
	 
	 
	class Circle extends Shape
	{
	    int r;
	 
	    public Circle()
	    {
	        System.out.println("Circle");
	    }
	 
	    public void draw()
	    {
	        System.out.println("Drawing Circle");
	    }
	}
	 
	 
	 
	class Triangle extends Shape
	{
	    public int a,b,c;
	 
	    public Triangle()
	    {
	        System.out.println("Triangle");
	    }
	 
	    public void draw()
	    {
	        System.out.println("Drawing Triangle");
	    }
	}
	 
	public class OOPS_inheritance_shape {
	
	    public static void main(String[] args)
	    {
	            Shape[] objects = { new Shape(),
	                                    new Circle(),
	                                    new Triangle()
	                  };
	 
	        System.out.println("\n\nNow Drawing Objects\n");
	 
	            for(int i = 0; i < 3; i++)
	                  objects[i].draw(); // // This line explains the concept of polymorphism
	       
	 
	        System.out.println("\n");
	    }
	}