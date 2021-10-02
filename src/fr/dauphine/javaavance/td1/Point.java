package fr.dauphine.javaavance.td1;

public class Point {
	private int x;
	private int y;
	public static int i = 0;
	
	public Point(int px, int py) {
		// TODO Auto-generated constructor stub
		this.x = px;
		this.y = py;
		i ++;
	}
	
	public Point(Point p2) {
		// TODO Auto-generated constructor stub
		this.x = p2.x;
		this.y = p2.y;
		i++;
	}
	
	public void afficher() {
		//Point p = new Point();
		System.out.println(this.x + " " + this.y + " i: " + i);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + "," + this.y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSameAs(Point p) {
		if(p.x == this.x && p.y==this.y) return true;
		return false;
	}
	
	public void translate(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
	
}
