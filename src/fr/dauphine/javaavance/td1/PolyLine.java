package fr.dauphine.javaavance.td1;

//import java.util.Objects;
//import java.util.ArrayList;
import java.util.LinkedList;

public class PolyLine {
	private int max;
	private LinkedList<Point> points;
	
	public PolyLine(int max) {
		// TODO Auto-generated constructor stub
		this.max = max;
		points = new LinkedList<>();
	}
	
	public boolean add(Point p) {
		if(points.size()+1 > max) return false;
		else {
			//Objects.requireNonNull(p, "p must not be null");
			points.add(p);
			return true;
		}
	}

	public int pointCapacity() {
		return max;
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point p){
		for (Point point : points) {
            if(point.equals(p)) return true;
        }
		return false;
	}
}
