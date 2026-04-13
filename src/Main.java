import org.w3c.dom.Text;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> lst = new ArrayList<>();
        Rectangle r1 = new TextRectangle(5.2,7.3,"CCC");
        TextRectangle r2 = new TextRectangle(5.2, 7.3, "ABA");
        r1.display();
        System.out.println();
        r2.display();
        f(r1);
        f(r2);
        Rectangle r3 = new Rectangle();
        f(r3);
        System.out.println(r1.getClass());
        System.out.println(r3.getClass().getName());
        System.out.println(hashCode("Haifa City"));
        System.out.println(hashCode("City Haifa"));
        System.out.println(r1.equals(r2));
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
        lst.add(r1);
        lst.add(r2);
        lst.add(r3);
        lst.add(new Rectangle(5.3,7.8));
        lst.add(new Circle(5.6));
        for(Shape s:lst){
            s.display();
            System.out.println();
        }




    }

    public static void f(Rectangle r){
        if( r instanceof TextRectangle)
            System.out.println(((TextRectangle)r).getText());

    }

    public static int hashCode(String s){
        int h = 0;
        for(int i = 0 ;i<s.length();i++ ){
            h = h*7+s.charAt(i);
        }
        return h;
    }
}