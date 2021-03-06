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
public class floor {

    private int floornumber;
    room rooms[] = new room[4];

    public floor(int nos) {
        floornumber = nos;
        room r1 = new room(1);
        room r2 = new room(2);
        room r3 = new room(3);
        room r4 = new room(4);

        rooms[0] = r1;
        rooms[1] = r2;
        rooms[2] = r3;
        rooms[3] = r4;
    }

    public void displayFloor() {
        System.out.println("Floor " + floornumber);
        for (int counter = 0; counter < rooms.length; counter++) {
            rooms[counter].display(floornumber);
        }
    }

    public void findaRoomtoBook() {
        Scanner kboard = new Scanner(System.in);
        int nos;
        int counter = 0;
        boolean found = false;
        System.out.println("Please enter room number: ");
        nos = kboard.nextInt();
        System.out.println("Floor: " + floornumber);
        for (counter = 0; counter < rooms.length; counter++) {
            System.out.println(rooms.length);
            if (nos == rooms[counter].returnRoomNos()) {
                found = true;
                rooms[counter].bookroom();
                break;
            }
        }
        if (found == false) {
            System.out.println("No such room number");
        }
    }

    public void findaRoomtoCancel() {
        Scanner kboard = new Scanner(System.in);
        int nos;
        int counter = 0;
        boolean found = false;
        System.out.println("Please enter room number: ");
        nos = kboard.nextInt();
        for (counter = 0; counter < rooms.length; counter++) {
            if (nos == rooms[counter].returnRoomNos()) {
                found = true;
                rooms[counter].cancelRoom();
                break;
            }
        }
        if (found == false) {
            System.out.println("No such room number");
        }
    }
}
