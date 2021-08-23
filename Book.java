/*
Do the following tasks:
write a JAVA class named Book with the attributes, mentioned here. Furthermore, add a method called 
showInfo(), that prints a full description of the book object. This method should not return anything.
 Add a main method.
 Create three Book objects with the names: book1, book2, book3.
 Set the following information accordingly:
book1
JAVA for Beginners 3rd edition
By Prof. David
537 pages
Price: 299 tk
Easy Coding Publications
book2
Omega Point 12th edition
By Humayun Ahmed
122 pages
Price: 128 tk
Shomoy Prokashoni
book3
Digital Fortress 5th edition
By Dan Brown
356 pages
Price: 520 tk
St. Martin Press
 Call showInfo() method for all books.
 Print the memory address of all objects.
 Set book1 = book3.
 Set the edition to 1 for book1.
 Call showInfo() method for book3 again.
 Print the memory address of all objects again.
*/

public class Book {
String BookNo;	
String Title;
String Edition;
String Author;
String Publisher;
String Pages;
String Price;

Book(){
BookNo="NULL";
Title="NULL";
Edition="NULL";
Author="NULL";
Publisher="NULL";
Pages="NULL";
Price="NULL";
}

void showInfo(){
System.out.println("\n"+BookNo+"\nTitle : " +Title+ "\nEdition : "+ Edition
+ "\nAuthor : "+Author + "\nPublisher : "+Publisher
+ "\nNmuber of pages : "+Pages + "\nPrice : "+Price);
}
public static void main(String args[]){
	Book book1;
	book1= new Book();
	book1.BookNo="book1";
	book1.Title="JAVA for Beginners";
	book1.Edition = "3rd Edition";
        book1.Author ="Prof.David";
	book1.Pages= "537 pages ";
        book1.Price= "299 Taka";
        book1.Publisher = "Easy Coding Publications";
		
	Book book2;
	book2 =new Book();
	book2.BookNo="book2";
	book2.Title="Omega Point";
	book2.Edition = "12th Edition";
        book2.Author ="Humayun Ahmed";
	book2.Pages= "122 pages ";
        book2.Price= "128 Taka";
        book2.Publisher = "Shomoy Prokashoni";
		
	Book book3;
	book3 =new Book();
	book3.BookNo="book3";
	book3.Title="Digital Fortress";
	book3.Edition = "5th Edition";
        book3.Author ="Dan Brown";
	book3.Pages= "356 pages ";
        book3.Price= "520 Taka";
        book3.Publisher = "St.Martin Press";
		
        book1.showInfo();
	book2.showInfo();
	book3.showInfo();
	System.out.println("\n");
	System.out.println(book1);
	System.out.println(book2);
	System.out.println(book3);
	System.out.println("\n");
		
	book1=book3;
	book1.Edition="1st Edition";
		
	book3.showInfo();
	System.out.println("\n");
	//printing memory address
	System.out.println(book1);
	System.out.println(book2);
	System.out.println(book3);
	}
}
