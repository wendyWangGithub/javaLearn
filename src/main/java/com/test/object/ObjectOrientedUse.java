package com.test.object;

public class ObjectOrientedUse {
	
	double x;
	double y;
	double z;
	double distance;
	
	ObjectOrientedUse(double _x, double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setX(double _x) {
		x = _x;
	}
	
	public void setY(double _y) {
		y = _y;
	}
	
	public void setZ(double _z) {
		z = _z;
	}
	
	public double getDistance(double _x, double _y, double _z) {
		distance = (_x - x) * (_x - x) +(_y - y) * (_y - y) + (_z - z) * (_z - z);
		return distance;
	}
	
	public static void main (String[] args) {
		ObjectOrientedUse o = new ObjectOrientedUse(0.0, 0.0, 0.0);
		System.out.println("distance1=" + o.getDistance(1.0, 2.0, 3.0));
 		o.setX(5.0);
		System.out.println("distance2=" + o.getDistance(1.0, 1.0, 1.0));
	}
	
}