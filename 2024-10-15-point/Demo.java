public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.pow((Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)), 0.5);
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
	Point p4 = new Point(p3);
    Point origin = new Point(0, 0);
	Point p5 = new Point(5, 12);
	Point p6 = new Point(p5);
	// Test for Point(Point other)
    System.out.println("Original point is " + p3);
    System.out.println("Point returned from Point(Point other) is " + p4);
	System.out.println("Original point is " + p5);
    System.out.println("Point returned from Point(Point other) is " + p6);
	// Tests for distance(Point a, Point b)
    System.out.println("The distance between " + p1 + " and " + p2 + " according to distance is " + distance(p1,p2));
	System.out.println("The distance between " + p3 + " and " + origin +" according to distance is " + distance(p3, origin));
	System.out.println("The distance between " + p5 + " and " + origin + " according to distance is " + distance(p5, origin));
	System.out.println("The distance between " + p5 + " and " + p5 + " according to distance is " + distance(p5, p5));
	// Tests for distanceTo(Point other)
    System.out.println("The distance between " + p1 + " and " + p2 + " according to distanceTo is " + p1.distanceTo(p2));
	System.out.println("The distance between " + p3 + " and " + origin + " according to distanceTo is " + p3.distanceTo(origin));
	System.out.println("The distance between " + p5 + " and " + origin + " according to distanceTo is " + p5.distanceTo(origin));
	System.out.println("The distance between " + p5 + " and " + p5 + " according to distanceTo is " + p5.distanceTo(p5));
	// Tests for Point.distance(Point a, Point b)
    System.out.println("The distance between " + p1 + " and " + p2 + " according to Point.distance is " + Point.distance(p1,p2));
	System.out.println("The distance between " + p3 + " and " + origin + " according to Point.distance is " + Point.distance(p3,origin));
	System.out.println("The distance between " + p5 + " and " + origin + " according to Point.distance is " + Point.distance(p5,origin));
	System.out.println("The distance between " + p5 + " and " + p5 + " according to Point.distance is " + Point.distance(p5,p5));
  }
}
