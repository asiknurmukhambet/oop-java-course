import java.awt.Color;

class Square extends Shape{
	  public double a;
	  public Square (Color color, int x){
	    super(color, x);
	  }
	  public void draw() {
		  for(int i = 0; i < x; i++) {
			  System.out.print(" ");
		  }
	    if(color == Color.RED) {
	      System.err.println("[]");
	    } else {
	      System.out.println("[]");
	    }
	  }
	  public double getArea(double a) {
	    return a*a;
	  }
	}