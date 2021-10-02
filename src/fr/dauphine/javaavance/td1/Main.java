package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Main {
	
	public static boolean contains(Point p, Circle ...circles){
		for(Circle circle : circles) {
			if(circle.contains(p)) return true;
		}
		return false;
	}
	
	public static boolean contains(Point p, Ring ...rings){
		for(Ring ring : rings) {
			if(ring.contains(p)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point x = new Point(2,2);
		x.afficher();
		
		Point x2 = new Point(x);
		x2.afficher();
		System.out.println(x2);
		
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		System.out.println(p1.isSameAs(p3));
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		PolyLine poly = new PolyLine(4);
		poly.add(x);
		poly.add(p1);
		//poly.add(null);
		System.out.println(poly.contains(p3));
		System.out.println(poly.nbPoints());
		
		Circle c=new Circle(new Point(1,3),1);
		Circle c2=new Circle(new Point(1,3),2);
		c2.translate(1,1);
		System.out.println(c+" "+c2);

		Circle c3=new Circle(new Point(1,2), 1);
		c3.getCenter().translate(1,1);
		System.out.println(c3);
		
		System.out.println(c3.contains(p1));
		System.out.println(contains(p1, c2, c3));
		
		Ring r = new Ring(new Point(1,2), 2, 1);
		System.out.println(r);
	}
}
