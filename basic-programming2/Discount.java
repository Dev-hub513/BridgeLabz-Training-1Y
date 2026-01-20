import java.util.Scanner;
class Discount{
public static void main(String args []){
Scanner sc = new Scanner(System.in);
System.out.println("enter the fees");
int fee=sc.nextInt();
System.out.println("enter dis");
int dis=sc.nextInt();
int discount=(fee*dis)/100;
System.out.println(discount);
}
}