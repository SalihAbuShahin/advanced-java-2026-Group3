public class ExceptionExamples {

    public static void main(String[] args) {
        int [] arr = {5,12,45,76};

       try{
           System.out.println(arr[10]);
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

       int x = 10, y = 0;


       try{
           divide1(x);
       }
       catch(Exception e){
           System.out.println(e);
           e.printStackTrace();
       }



       System.out.println("The End!!!");

    }

    public static void divide1(int x) throws Exception{
        System.out.println("divide1");

        divide2(x);

    }

    public static void divide2(int x) throws Exception{
        System.out.println("divide2");
        System.out.println(x/0);

    }
}
