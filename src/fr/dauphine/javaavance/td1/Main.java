package fr.dauphine.javaavance.td1;

public class Main {
	
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
	}

}
