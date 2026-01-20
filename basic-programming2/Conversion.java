import java.util.Scanner;
class Conversion{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter kilometer :");
double km=sc.nextDouble();
double miles=km*1.6;
System.out.println("conversion is :"+miles);
}
}

