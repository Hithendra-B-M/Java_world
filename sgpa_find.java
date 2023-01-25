/*a class Student with members usn, name, an array credits 
and an array marks. Include methods to accept and display details and a method to calculate 
SGPA of a student.*/
import java.util.Scanner;
public class Students
{
 String usn;
 String name;
int[] credits=new int[5];
 int[] marks=new int[5];
double sgpa;
public void read()
{
Scanner input = new Scanner(System.in);
int i;
System.out.println("Enter the USN:");
 usn=input.nextLine();
System.out.println("Enter the Name:");
 name=input.nextLine();
 System.out.println("Enter the Credits of 5 subjects:");
for(i=0;i<5;i++)
 {
 credits[i]=input.nextInt(); 
 }
System.out.println("Enter the Marks of 5 subjects:");
 for(i=0;i<5;i++)
 {
 marks[i]=input.nextInt(); 
 }
 }
public void display()
{
int i;
System.out.println("Usn:"+usn);
 System.out.println("Name:"+name);
 System.out.print("Credits:");
 for(i=0;i<5;i++)
 System.out.print(credits[i]+"\t");
 System.out.print("\nMarks:");
 for(i=0;i<5;i++)
 System.out.print(marks[i]+"\t");
System.out.println(String.format("Sgpa:%.1f",sgpa));
}
public void calculate()
{
int i,num=0,denom=0;
 int [] points=new int[5];
for(i=0;i<5;i++)
 {
 if(marks[i]>=95 && marks[i]<=100)
 points[i]=10;
 else if(marks[i]>=90 && marks[i]<=94)
 points[i]=9; 
 else if(marks[i]>=85 && marks[i]<=89)
 points[i]=8;
 else if(marks[i]>=80 && marks[i]<=84)
 points[i]=7;
 else if(marks[i]>=70 && marks[i]<=79)
 points[i]=6;
 else if(marks[i]>=60 && marks[i]<=69)
 points[i]=5;
 else if(marks[i]>=50 && marks[i]<=59)
 points[i]=4;
 else if(marks[i]>=0 && marks[i]<=49)
 points[i]=0;
 else
 System.out.println("Invalid marks");
 }
for(i=0;i<5;i++)
 {
 num+=(credits[i]*points[i]);
 if(points[i]!=0)
 denom+=credits[i];
 }
if(denom!=0)
sgpa=(double)num/denom;
}
public static void main(String[] args) 
{
int n,i;
Scanner input = new Scanner(System.in);
 System.out.print("Enter the number of students:");
 n=input.nextInt();
Students[] s=new Students[n];
for(i=0;i<n;i++)
 {
 s[i]=new Students();
 s[i].read();
 s[i].calculate();
 s[i].display();
 }
}
}
