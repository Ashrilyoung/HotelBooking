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
public abstract class Customer {

    String customerName;
    String customerEmail;
    
    abstract public void display();
    abstract public String getName();
    abstract public String getEmail();
    abstract public void calcCost(double cost);
    

//    public Customer() {
//    }
//    
//
//    public Customer(String cname, String cemail) {
//        customerName = cname;
//        customerEmail = cemail;
//    }
//
//    public void display() {
//        System.out.println("Details are " + customerName + " " + customerEmail);
//    }
//
//    public void getname() {
//        Scanner kboard = new Scanner(System.in);
//        System.out.println("Please enter your name");
//        customerName = kboard.nextLine();
//    }
//
//    public void getemail() {
//        Scanner kboard = new Scanner(System.in);
//        System.out.println("Please enter your contact details");
//        customerEmail = kboard.nextLine();
//    }
}
