/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear16n17q1;

/**
 *
 * @author Ai Ai
 */
public class Student {
    //data member
    private String studentname;
    private String matricno;
    private int yearofstudy;
    private int numberofsubject;
    
    //constructor
    public Student(){
        studentname="";
        matricno="";
        yearofstudy=0;
        numberofsubject=0;
        
    }
    public Student(String studentname, String matricno, int yearofstudy, int numberofsubject){
        this.studentname=studentname;
        this.matricno=matricno;
        this.yearofstudy=yearofstudy;
        this.numberofsubject=numberofsubject;
        
    }
    //method
    public void setStudentName(String name){
        studentname=name;
    }
    public String getStudentName(){
        return studentname;
    }
    public void setMatricNo(String number){
        matricno=number;
    }
    public String getMatricNo(){
        return matricno;
    }
    public void setYearOfStudy(int year){
        yearofstudy=year;
    }
    public int getYearOfStudy(){
        return yearofstudy;
    }
    public void setNumberOfSubject(int numbersubject){
        numberofsubject=numbersubject;
   }
    public int getNumberOfSubject(){
        return numberofsubject;
    }
    
}

