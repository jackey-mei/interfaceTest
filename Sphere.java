public class Sphere extends Circle implements Volume {
    public Sphere(double radius, String name){
	super(radius, name);
    }

    public double getVolume() {
	return 4.0 / 3.0 * Math.PI * Math.pow(getRadius(), 3);
    }
    
    public String toString(){
	return "Sphere " + getName() + " with radius of " + getRadius();
    }
}
