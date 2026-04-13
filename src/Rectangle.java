public class Rectangle extends Shape implements Colorable {
    protected double length;
    protected double width;
    protected String color;

    public Rectangle(double length, double width){
       try{
           this.setLength(length);
           this.setWidth(width);
       }
       catch(IllegalLength e){
           System.out.println(e);
           this.length = 120;
       }
       catch(IllegalWidth e){
           System.out.println(e);
           this.width = 80;
       }
       catch(Exception e){
           System.out.println(e);
       }

        this.color = "Blue";
    }
    public Rectangle(double size){
        this.length = size;
        this.width = size;
        this.color = "White";
    }

    public Rectangle(){
        this.length = Math.random()*100+1;
        this.width  = Math.random()*100+1;
        this.color = "Green";
    }

    public Rectangle(Rectangle other){
        this.length = other.length;
        this.width = other.width;
        this.color = other.color;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalLength{
        if(length<=0 || length>1000){
            throw new IllegalLength(length +"is Illegal, valid length is (0,1000]");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }


    public void setWidth(double width) throws IllegalWidth{
        if(width<=0 || width>500){
            throw new IllegalWidth(width +" Illegal width, valid width is (0,500]");
        }
        this.width = width;
    }
    public String getColor(){ return this.color;}
    public void setColor(String color){this.color = color;}


    public double computeArea(){ return width*length;}
    public double computeScope(){ return 2*(width+length);}

    public void display(){
        System.out.print("[length = " + length+", width = " + width +
                ", area = "+this.computeArea()+", scope = " + computeScope()+", color = "+this.color+"]");
    }

    public boolean equals(Object o){
        if(! (o instanceof Rectangle))
            return false;
        Rectangle r = (Rectangle) o;
        return this.length==r.length&& this.width==r.width;
    }

    public int hashCode(){
        int h = 0;
        h = 31*h + Double.hashCode(length);
        h = 31*h + Double.hashCode(width);
        return h;
    }


}
