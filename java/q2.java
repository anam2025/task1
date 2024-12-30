import java.util.*;
public class q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a para: ");
        String para=sc.next();
        int count=1;
        for(int i=0;i<args.length; i++){
            if(para.charAt(i)==' '){
                count++;
            }
        }
System.out.println("total number of char is :" +count);

    }
}