/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_testdo;

/**
 *
 * @author Ai Ai
 */
//class Book
public class Book {
    //data member
    private String author;
    private String title;
    private double price;
    private int numOfPages;

//constructor first
public Book(){
    author="";
    title="";
    price=0.0;
    numOfPages=0;
   
}  
//constructor second
public Book(String auth, String tit, double pri, int numOfP){
    author=auth;
    title=tit;
    price=pri;
    numOfPages=numOfP;
    
}
//method(get n set)
// first method
public void setAuthor(String autho){
    author=autho;
    
}
public String getAuthor(){
    return author;
    
}
//second method
public void setTitle(String titlename){
    title=titlename;
    
}
public String getTitle(){
    return title;
    
}
//third method
public void setPrice(double pric){
    price=pric;
    
}
public double getPrice(){
    return price;
    
}
//fourth methos
public void setNumberOfPage(int numOPg){
    numOfPages=numOPg;
    
}
public int getNumberOfPage(){
    return numOfPages;
}
}

