/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear16n17q1;

import java.util.Scanner;

/**
 *
 * @author Ai Ai
 */
public class Pastyear16n17Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student();
        student.setStudentName("Mohd Ismail");
        student.setMatricNo("CA12345");
        student.setYearOfStudy(2);
        student.setNumberOfSubject(3);
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Matric no: " + student.getMatricNo());
        System.out.println("Year of study: " + student.getYearOfStudy());
        System.out.println("Number of study: " + student.getNumberOfSubject());

        //Ask user for number of loops & number of subjects for array declaration
        System.out.println("Please enter the number of subjects taken:");
        //Get input
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        //Declare array to store subjects and print afterward
        Subject[] subjects = new Subject[i];
        //Make loop(since question does not specify which type, any loop is allowed)
        int x = 1;
        do {
            System.out.println("Please enter the subject " + x + " name:");
            String subjectname = s.next();
            System.out.println("Please enter the credit hours for this subject:");
            int credithours = s.nextInt();
            System.out.println("Please enter the subject grade:");
            String subjectgrade = s.next();
            subjects[x] = new Subject(subjectname, credithours, subjectgrade);
        } while (x++ < i);

        //Output
        

    
    }
}
