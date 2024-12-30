import java.util.scanner;
public class Reverse{
    public static void main (string[] args){
   Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int number= sc.nextInt;
    int rem=0;

    while(number>0){
    rem=number%10;
    number=number*10+rem;
    number=number/10;}
    System.out.println(number);








    }
    
}