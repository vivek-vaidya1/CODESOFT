import java.util.*;
class Student2_Ex
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int marks[]=new int[5];
float total=0, avg;
for(int i=0; i<5; i++)
{
System.out.println("Enter the marks of Student"+(i+1)+":");
marks[i]= sc.nextInt();
total=total+marks[i];
System.out.println("total marks is"+total);
}
avg=total/5;
System.out.println("The Average is"+avg);
if(avg>=80 && avg<=100)
{
System.out.println("Grade is A");
}
else if(avg>=60 && avg<80)
{
System.out.println("Grade is B");
}
else if(avg>=40 && avg<60)
{
System.out.println("Grade is C");
}
else
{
System.out.println("Grade is D");
}
}
}
