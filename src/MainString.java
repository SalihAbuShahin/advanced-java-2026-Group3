import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class MainString {

    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("-------");
        String line = input.nextLine();
        StringTokenizer st = new StringTokenizer(line, ",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken().trim());
        }
         */
        String file = "C:\\Users\\u31_7007\\Downloads\\data.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line, name, date;
            line = br.readLine();
            while(line!= null){
                StringTokenizer st = new StringTokenizer(line,",");
                name = st.nextToken();
                date = st.nextToken();
                System.out.println("Name: "+ name + ", Date: " +date);
                line = br.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }






    }
}
