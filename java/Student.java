public class Student{
int age;
String rollno;
String name;

// public Student()
// {

// }
public Student (int age, String rollno, String name){
    this.age=age;
    this.rollno=rollno;
    this.name=name;
}
public static void main (String args[]){
Student s1=new Student(24,"22scse1012583","aman");
System.out.println(s1.name+" your age is " +s1.age + " and your rollno is"+ s1.rollno);
}
}