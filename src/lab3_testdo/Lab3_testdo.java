/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_testdo;

/**
 *
 * @author Ai Ai
 */
public class Lab3_testdo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1= new Book();
        Book book2= new Book();
        book1.setAuthor("John Dow");
        book1.setTitle("Introduction to OOP");
        book1.setPrice(99.44);
        book1.setNumberOfPage(444);
        System.out.println("+++ Object 1 +++");
        System.out.println("Author name:" +book1.getAuthor());
        System.out.println("Book title: " +book1.getTitle());
        System.out.println("Book price :" +book1.getPrice());
        System.out.println("Number of pages: " +book1.getNumberOfPage());
//        System.out.println("+++ Object 1 +++");
//        System.out.println("Author name : " +book1.author);
//        System.out.println("Book title : " +book1.title);
//        System.out.println("Book price : " +book1.price);
//        System.out.println("Number of pages : " +book1.numOfPages);
        
        book2.setAuthor("Jane Dow");
        book2.setTitle("Java 101");
        book2.setPrice(100.44);
        book2.setNumberOfPage(1000);
        System.out.println("+++ Object 2 +++");
        System.out.println("Author name:" +book2.getAuthor());
        System.out.println("Book title: " +book2.getTitle());
        System.out.println("Book price :" +book2.getPrice());
        System.out.println("Number of pages: " +book2.getNumberOfPage());
        
        
    }
    
}
