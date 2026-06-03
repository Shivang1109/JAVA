public class solution1 {
    public static void main(String[] args){


        int n=34;
        int k=6;
        int i=0;
        int baseK=0;
        while(n!=0){
            int rem=n%k;
            baseK+=rem*(int)Math.pow(k,i);
            n/=k;
            i++;

        }
        System.out.print(baseK);
    }


}