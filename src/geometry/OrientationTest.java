package geometry;

public class OrientationTest {

	public static void main(String[] args) {

		Point p = new Point();
		Point q = new Point();
		Point r = new Point();

		p.setX(-1);
		p.setY(-2);
		
		q.setX(1);
		q.setY(-1);
		
		r.setX(0);
		r.setY(0);
		
		int orientation = Geometry.orientation(p, q, r);

		if (orientation == 2) {
			System.out.println("CounterClockwise");
		} else if (orientation == 0) {
			System.out.println("Collinear");
		} else
			System.out.println("Clockwise");

	}

}