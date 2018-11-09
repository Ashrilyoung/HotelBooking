/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

/**
 *
 * @author 16007873
 */
public class room {

    private int roomNos;
    private Customer occupier;
    private boolean status;

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
            Customer newperson = new Customer();   //this line creates an instance of customer
            newperson.getname();			// then we get the details
            newperson.getemail();
            status = false;				//makes sure nobody else can too the room
            occupier = newperson;			// attaches the new customers details to the room
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
