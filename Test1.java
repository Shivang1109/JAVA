import java.io.*;

class Test1 {
    public static void main(String args[]) throws IOException {
        FileInputStream fin = new FileInputStream("input.txt");

        int i;
        while((i = fin.read()) != -1) {
            System.out.print((char)i);
        }

        fin.close();
    }
}