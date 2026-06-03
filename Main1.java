import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            m-=i;
            if(m<i){
                System.out.println(m);
                return;
            }
            
        }
        
        
    }
}