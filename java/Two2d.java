import java.util.*;
public class Two2d{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n=sc.nextInt();
        System.out.println("enter the number of coloumns");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("enter the element of index "+i + j + " :");
                arr[i][j]=sc.nextInt();

    
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
            
            
        

        



        

    }
}