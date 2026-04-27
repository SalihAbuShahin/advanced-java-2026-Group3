//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int int1 = 5, int2 = 6;
        Number num1 =5;
        System.out.println(num1.doubleValue());
        double double1 = 5.2, double2 = 3.6;
        String str1 = "A", str2 = "B";

        showData(int1,int2);
        showData(double1,double2);
        showData(str1,str2);
        Box<Integer> b1 = new Box<>(3);
        Box<Double> b2 = new Box<>(-3.0);
        Box<Float> b3 = new Box<>(-3.0f);
        System.out.println(b1.absEquals(b2));
        System.out.println(b1.absEquals(b3));
        showData(b1,b2);
        //System.out.println( findMax(b1,b2));


    }


/*
    public static void showData(int a, int b){
        System.out.println(a);
        System.out.println(b);

    }

    public static void showData(double a, double b){
        System.out.println(a);
        System.out.println(b);

    }
    public static void showData(String  a, String b){
        System.out.println(a);
        System.out.println(b);

    }
  */

    public static<T> void showData( T o1, T o2){
        System.out.println(o1);
        System.out.println(o2);
    }

    public static <T extends  Comparable<T>> T findMax(T obj1, T obj2){
         if(obj1.compareTo(obj2)>0)
            return obj1;

        return obj2;
    }
}