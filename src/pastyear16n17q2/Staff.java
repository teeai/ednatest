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
public class Staff extends Income{
    //data member
    private String name;
    private String id;
    private Income incomes;
    private double totalnexincome;
    
    //constructor
    public Staff(){
        name="";
        id="";        
    }
    public Staff(String name, String id, Income income){
        this.name=name;
        this.id=id;
        this.income=new Income();        
    }
    
    //method
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public double calculateNetIncome(){
        totalnexincome=amount-totaltax;
        return totalnexincome;
    }
    public void displayStaffInfo(){
        
    }
    public void displayIncomeInfo(){
        
    }

    
            
    
    
    
    

    
    
}
