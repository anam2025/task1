import java.util.*;
public class Star{
    public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter a number: ");
int n= sc.nextInt();
int c=1;
for(int i=n;i>=1;i--){
    for(int space=1;space<=n-i;space++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-i;j++){
        System.out.print(" * "+" ");

    }
    System.out.println();
  }
 }
}