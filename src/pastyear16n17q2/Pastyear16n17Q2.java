/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear16n17q2;

/**
 *
 * @author Ai Ai
 */
public class Pastyear16n17Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Staff staff=new Staff();
        Income income=new Income();
        System.out.println("Staff name; " +staff.getName());
        System.out.println("Staff Id: " +staff.getId());
        System.out.println("Income type: " +income.getIncomeType());
        income.setAmount(1000);
        income.setTax(10.0);
        income.gettotaltax();
        staff.displayStaffInfo();
        staff.displayIncomeInfo();
        System.out.println("Amount: " +"RM "+income.getAmount());
        System.out.println("Tax: " +income.getTax() +" %");
        System.out.println("Total Tax Paid: " +"RM " +income.gettotaltax());
        System.out.println("Total Nex Income: " +"RM " +staff.calculateNetIncome());
        
    }
    
}
