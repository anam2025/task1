
 public class abstractDemo extends employee{
    @Override
    public void show(){
        System.out.println("inside abstractDemo class");


        
    }public static void main(String[] args){
        abstractDemo obj=new abstractDemo();
        obj.show();
        obj.print();
    }
 }