import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String reg1= "/\\*(([a-zA-Z0-9])*|(\\s)*)|(([a-zA-Z0-9])*|(\\s)*)\\*/";
        String reg2= "//.*";
        Pattern p1 = Pattern.compile(reg1, Pattern.DOTALL);
        Pattern p2 = Pattern.compile(reg2);
        try(BufferedReader br = new BufferedReader(new FileReader("Lab.txt"));
        BufferedWriter bt = new BufferedWriter( new FileWriter("rez.txt"))){
            String text;

        while ((text = br.readLine()) != null) {


            text= p1.matcher(text).replaceAll("");
            text =p2.matcher(text).replaceAll("");
            bt.write(text);
            bt.newLine();
        }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}