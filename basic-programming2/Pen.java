import java.util.Scanner;
class Pen{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter pen :");
	int pen=sc.nextInt();
System.out.println("enter student :");
int student=sc.nextInt();
int distributed=pen/student;
int remaining=pen%student;
System.out.println("pen distributed is :"+distributed);
System.out.println("pen remaining is :"+remaining);
}
}