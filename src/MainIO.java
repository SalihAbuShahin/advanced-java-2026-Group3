import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String file1 = "C:\\Users\\u31_7007\\Downloads\\output.txt";
        PrintWriter out = null;
        Person [] p = new Person[3];
        p[0] = new Person("Avi", 45);
        p[1] = new Person("AA", 23);
        p[2] = new Person("BB", 32);
        System.out.println(Person.count);
        try{
            out = new PrintWriter(file1);
            out.println(29.5);
            for (Person p1: p)
                out.println(p1);
            out.println("kdvgsagvdia");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if(out !=null)
                out.close();
        }

        Scanner in = null;
        try{
            in = new Scanner(new File(file1));
            int i = 1;
            while(in.hasNextLine()){
                System.out.println(i+" : " + in.nextLine());
                i++;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if(in!=null)
                in.close();
        }


        ObjectOutputStream out2 = null;
        try{
            out2 = new ObjectOutputStream(new FileOutputStream("C:\\Users\\u31_7007\\Downloads\\pesron.ser"));
            out2.writeObject(new Person("SA",125));
            //out2.writeObject(new Person("SA",125));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if(out2!=null) {
                try {
                    out2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try(ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("C:\\Users\\u31_7007\\Downloads\\pesron.ser")) ){
            //Person [] ser_p = (Person [])in2.readObject();
            Person p3 = (Person) in2.readObject();
            System.out.println(p3);
           /* for(Person ps:p)
                System.out.println(ps);
            */
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}