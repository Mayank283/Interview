package algorithm.geometry;

public class Geometry {

	public static int orientation(Point p, Point q, Point r){
		
		int val;
		
		val = ((q.getY()-p.getY()) * (r.getX()-q.getX())) - ((r.getY()-q.getY())*(q.getX()-p.getX()));
				
			if (val==0) 
				return 0;
			
				return (val>0)?1:2;
	}
	
	public static int intersect(){
		return 0;
	}

}