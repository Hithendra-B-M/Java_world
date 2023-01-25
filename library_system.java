/*a class Book which contains four members: name, author, price, num of_pages. 
Include a constructor to set the values for the members. Include methods to set and get the 
details of the objects. Include a toString( ) method that could display the complete details of the 
book*/
import java.util.Scanner;
class Book {
String name,author;
double price;
int numberOfPages;
Book(String name, String author, double price, int numberOfPages) {
this.name = name;
this.author = author;
this.price = price;
this.numberOfPages = numberOfPages;
}
String getName() {
return name;
}
void setName(String name) {
this.name = name;
}
String getAuthor() {
return author;
}
void setAuthor(String author) {
this.author = author;
}
 double getPrice() {
return price;
}
void setPrice(double price) {
this.price = price;
}
public int getNumberOfPages() {
return numberOfPages;
}
void setNumberOfPages(int numberOfPages) {
this.numberOfPages = numberOfPages;
}
public String toString() {
return "Book [Name=" + name + ", Author=" + author + ", Price=" + price + ", 
Pages=" + numberOfPages + "]";
}
}
class Bookstore {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int numberOfBooks,numberOfPages;
String name,author;
double price;
System.out.println("Enter the number of books:");
numberOfBooks= Integer.parseInt(input.nextLine());
Book myBooks[]=new Book[numberOfBooks];
for(int i=0;i<numberOfBooks;i++)
{
System.out.println("Enter book details");
System.out.print("Book Title:");
name=input.nextLine();
System.out.print("Book Author:");
author=input.nextLine();
System.out.print("Price:");
price=Double.parseDouble(input.nextLine());
System.out.print("Total number of pages:");
numberOfPages=Integer.parseInt(input.nextLine());
myBooks[i]=new Book(name,author,price,numberOfPages);
}
System.out.println("--------------------------------------");
System.out.println("************Book catalog**************");
for(Book b:myBooks)
{
System.out.println(b);
}
}
}
