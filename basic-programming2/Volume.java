import java.util.Scanner;
class Volume{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter radius :");
double r =sc.nextDouble();
System.out.println("enter pie :");
double pie=sc.nextDouble();
double volume =4/3*pie*r*r*r;
System.out.println("volume of sphere is :"+volume);
}
}