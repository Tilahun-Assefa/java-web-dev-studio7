package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<BaseDisc> disks = new ArrayList<>();
        // TODO: Declare and initialize a CD and a DVD object.
        DVD dvd = new DVD("Java in 21 days", new ArrayList<>(Arrays.asList("Introduction", "Data Types")));
        CD cd = new CD("Angular for Beginner", new ArrayList<>(Arrays.asList("Introduction to typescript", "HTTP ", "Collection")));

        // TODO: Call each CD and DVD method to verify that they work as expected.
        dvd.storeData("Interface and polymorphism");
        cd.storeData("Routing");
        disks.add(dvd);
        disks.add(cd);

        System.out.println(dvd);
        dvd.spinDisc();
        cd.spinDisc();
        for (BaseDisc disc : disks) {
            System.out.println(disc);
        }
        ArrayList<Disk> wheels = new ArrayList<>();
        Disk wheel = new Wheel();
        wheels.add(wheel);
        Disk lps = new LPS("Gone with the wind", new ArrayList<>(Arrays.asList("Song1", "song2")));
        wheels.add(lps);
        Disk friesbee = new Friesbee();
        wheels.add(friesbee);
        Disk floppy = new FloppyDisc("Automation", new ArrayList<>(Arrays.asList("Unit1", "Unit2")));
        wheels.add(floppy);
        Disk myCD = new CD("Automation", new ArrayList<>(Arrays.asList("Unit1", "Unit2")));
        wheels.add(myCD);
        for (Disk d : wheels) {
            d.spinDisc();
        }

    }
}
