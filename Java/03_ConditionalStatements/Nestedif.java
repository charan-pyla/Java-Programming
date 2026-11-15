import java.util.Scanner;
class Nestedif{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("enter the age");
int age = sc.nextInt();

System.out.println("do u have hall ticket yes=1,no=0");
int hallticket = sc.nextInt();

if (age >=18){
    if (hallticket ==1){
    System.out.println(" you can enter th exam");
    }else{

    System.out.println("no hallticket entry denied");
}
}
else 
{
System.out.println("you are under age entry denied");
}
}
}








