package com.ex.level2_10;

public class Sphere {
	/**
	 * Given a variable containing the radius of a sphere:

		float r = 10.3;
		Get the volume and surface area of ​​this sphere.
	 */

	public static void main(String args[]) {
		
		float r = 10.3f;
		
		double sphereVolume = (4.0/3.0)*3.1415*Math.pow(r,3);
		
		double sphereSurfase = 4*3.1415*Math.pow(r,2);
		
		
		System.out.println("Volume of ​​this sphere is " + String.format("%.2f", sphereVolume));
		System.out.println("Surface area of ​​this sphere is " + String.format("%.2f", sphereSurfase));
		
	}
	
}
