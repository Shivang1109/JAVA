import java.io.*;
public class output {
    public static void main(String[] args){
        try{
            FileOutputStream fout= new FileOutputStream("result.txt");
            String s1="Hello";
            byte b[]= s1.getBytes();
            fout.write(b);
            fout.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
