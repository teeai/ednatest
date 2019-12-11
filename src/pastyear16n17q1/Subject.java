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
public class Subject {
    private String subjectname;
    private int credithours;
    private String subjectgrade;
    
    //constructor
    public Subject(){
        subjectname="";
        credithours=0;
        subjectgrade="";
    }
    public Subject(String subjectname, int credithours, String subjectgrade){
        this.subjectname=subjectname;
        this.credithours=credithours;
        this.subjectgrade=subjectgrade;
    }
    //method
    public void setSubjectName(String subName){
        subjectname=subName;
    }
    public String getSubjectName(){
        return subjectname;
    }
    public void setCreditHours(int crehour){
        credithours=crehour;
    }
    public int getCreditHours(){
        return credithours;
    }
    
    
}
