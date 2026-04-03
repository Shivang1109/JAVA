public class main {
    public static void main(String[] args) {
       int a=10,b=20,c=30;
       String result= (a>b && a>c)? "A is greatest" : ((b>a && b>c)?"B is greatest":"C is greatest");
        System.out.println(result);
    }
}