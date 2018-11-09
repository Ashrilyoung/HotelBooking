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
public class HotelBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Hotel h1 = new Hotel(101, "The Grand");

        Scanner choiceboard = new Scanner(System.in);
        System.out.println("What service would you like?");
        System.out.println("1: Book A room");
        System.out.println("2: Cancel a booking");
        System.out.println("3: View Available rooms");
        System.out.println("4: Exit");
        
        int choice = 0;
        choice = (int) choiceboard.nextInt();

        switch (choice) {
            case 1:
                h1.bookARoom();
                break;
            case 2:
                h1.CancelARoom();
                break;
            case 3:
                h1.display();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("That was not a valid input please follow the instructions on the screen");
        }

//        h1.display();
//        h1.bookARoom();
//        h1.display();
//        h1.CancelARoom();
//        h1.display();

//		double cost =100;
//		Customer occupiers[] = new Customer[10];
//		occupiers[0] = new OrdinaryCustomer();
//		occupiers[1] = new GoldCustomer();
//
//		occupiers[0].display();
//		occupiers[0].calcCost(cost);
//		
//		occupiers[1].display();
//		occupiers[1].calcCost(cost);


    }

}
