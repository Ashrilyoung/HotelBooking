/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

import java.util.Scanner;

/**
 *
 * @author 16007873
 */
public class GoldCustomer extends Customer{

    private final double discount=0.8;
    
    public GoldCustomer(){
        
        customerName = this.getName();
        customerEmail = this.getEmail();
    }
    
    public void display(){
    
    }
    
    public String getName(){
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your name");
        customerName = kboard.nextLine();
        return customerName;
    }
    
    public String getEmail(){
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your contact details");
        customerEmail = kboard.nextLine();
        return customerEmail;
    }
    
    public void calcCost(double cost){
        double finalCost = cost * discount;
        System.out.println(finalCost);
    }
    
}
