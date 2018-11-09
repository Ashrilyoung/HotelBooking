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
public class room {

    private int roomNos;
    private Customer occupier;
    private boolean status;
    private int cost = 100;         //the cost of a room

    public room(int rnos) {
        roomNos = rnos;
        status = true; //free
    }

    public void display() {
        System.out.println("Room number: " + roomNos);
        if (status == true) {
            System.out.println("Room is free");
        } else {
            occupier.display();
        }
    }

    public void bookroom(Customer newperson) {
        if (status == true) {
            status = false;
            occupier = newperson;
        } else {
            System.out.println("Sorry room booked");
        }
    }

    public void bookroom() {
        System.out.println("Room " + roomNos);
        if (status == true) // checks to see if room is free
        {
            Scanner kboard = new Scanner(System.in);
            System.out.println("Are you a 1. Regular or 2. Gold customer?");
            int newchoice = kboard.nextInt();

            switch (newchoice) {
                case 1:
                    Customer newPerson = new OrdinaryCustomer();   //this line creates an instance of customer
                    status = false;				//makes sure nobody else can too the room
                    occupier = newPerson;			// attaches the new customers details to the room
                    newPerson.calcCost(cost);
                    break;
                case 2:
                    Customer goldPerson = new GoldCustomer();
                    status = false;				//makes sure nobody else can too the room
                    occupier = goldPerson;			// attaches the new customers details to the room
                    goldPerson.calcCost(cost);
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Sorry room booked");
        }
    }

    public void cancelRoom() {
        status = true;
        occupier = null;
        System.out.println("Room cancelled");
    }

    public int returnRoomNos() {
        return (roomNos);
    }

}
