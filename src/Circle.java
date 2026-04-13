public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea(){ return Math.PI*radius*radius;}
    public double computeScope(){ return 2*Math.PI*radius;}
    public void display(){
        System.out.println("[ radius = " + this.radius + ", area = "+ this.computeArea()+", scope = "+computeScope()+"]");
    }

}
