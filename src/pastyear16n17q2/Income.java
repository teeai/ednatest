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
public class Income {
    //data member
    private String incomeType;
    double amount;
    private double tax;
    public double totaltax;
    
    //constructor
    public Income(){
        incomeType="";
        amount=0.0;
        tax=0.0;
        totaltax=0.0;
    }
    public Income(String incomeType, double amount, double tax){
        this.incomeType=incomeType;
        this.amount=amount;
        this.tax=tax; 
    }
    //method
    public void setIncomeType(String incoTy){
        incomeType=incoTy;      
    }
    public String getIncomeType(){
        return incomeType;
    }
    public void setAmount(double amo){
        amount=amo;
    }
    public double getAmount(){
        return amount;
    }
    public void setTax(double taxx){
        tax=taxx;        
    }
    public double getTax(){
        return tax;
    }
    public double gettotaltax(){
        totaltax=(tax/100)*amount;
        return totaltax;
    }
}
