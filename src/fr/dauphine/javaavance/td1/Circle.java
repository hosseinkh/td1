package fr.dauphine.javaavance.td1;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(Point p, int r) {
		// TODO Auto-generated constructor stub
		this.center = p; 
		/*(Faite attention, La class point est en generale mutable (les valeurs de x et y pouvent changer avec la methode translate
		    Vous devez d'abords definir les attribus de la classe point comme (final private), après changé definition de la method translate 
		afin de retourner un autre point(au lieu de modifier le point actuelle) de plus il faut que vous utilisiez le technique de copie défensive.//
		dans la constracteur de Circle*/
		this.radius = r;
	}
	
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "centre : (" + this.center.getX() + "," + this.center.getY() + "), radius : " + this.radius + " area : " + this.area();
	}
	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	public Point getCenter() {
		return this.center;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public boolean contains(Point p) {
		double temp, temp2;
		temp = p.getX() - this.center.getX();
		temp = Math.pow(temp, 2);
		temp2 = p.getY() - this.center.getY();
		temp2 = Math.pow(temp2, 2);
		temp = temp + temp2;
		if (temp < Math.pow(this.radius, 2)) return true;
		return false;
	}
}
