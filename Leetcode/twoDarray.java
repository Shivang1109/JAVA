package Leetcode;

public class twoDarray {
    static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }
    public static void main(String[] args) {
        
    
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }
    transpose(arr);
    System.out.println();
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }
    } 
}
