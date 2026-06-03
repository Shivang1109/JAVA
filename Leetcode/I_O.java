package Leetcode;

import java.io.FileInputStream;
import java.io.IOException;

public class I_O {
    public static void main(String[] args) throws IOException {
        FileInputStream fin= new FileInputStream("Shivang.txt");
        int i;
        try{
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
