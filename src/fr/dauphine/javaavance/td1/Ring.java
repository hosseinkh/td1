package fr.dauphine.javaavance.td1;

public class Ring extends Circle{
	private int internRadius;
	
	public Ring(Point p, int r, int ir){
		// TODO Auto-generated constructor stub
		super(p, r);
		this.internRadius = ir;
		if(ir>r) {
			System.out.println("Attention le rayon interieur doit etre inferieur au rayon exterieur");
		}
	}
	
	public int getIntRadius() {
		return this.internRadius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ring) {
			Ring r = (Ring) obj;
			if(this.getCenter().isSameAs(r.getCenter()) && this.getRadius()==r.getRadius() && this.internRadius==r.getIntRadius()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "centre : (" + this.getCenter().getX() + "," + this.getCenter().getY() + "), radius exterieur: " + this.getRadius() + ", radius interieur: " + this.internRadius;
	}
	
	@Override
	public boolean contains(Point p) {
		double temp, temp2;
		temp = p.getX() - this.getCenter().getX();
		temp = Math.pow(temp, 2);
		temp2 = p.getY() - this.getCenter().getY();
		temp2 = Math.pow(temp2, 2);
		temp = temp + temp2;
		if (temp < Math.pow(this.getRadius(), 2) && temp < Math.pow(this.internRadius, 2)) return true;
		return false;
	}
}
