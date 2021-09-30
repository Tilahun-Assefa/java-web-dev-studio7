package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{

    // Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570-1600 rpm.");
    }
    // Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    static final String storageCapacity = "4.7 GB";
    private static final String type= "DVD";
    public DVD(String title, ArrayList<String> contents) {
        super(title, contents);
    }

    @Override
    public void storeData(String addContent) {
        getContents().add(addContent);
    }

    @Override
    public String toString() {
        String str = "\nTitle: "+ getTitle() + "\nDisk Type: "+ type + "\nCapacity: " + storageCapacity +"\nContents: ";
        for(String content: getContents()){
            str +=  content + ",\t";
        }
        return str;
    }
    @Override
    public void ReadData() {
        System.out.println("Data is read from DVD");
    }

    @Override
    public void WriteData() {
        System.out.println("Data is written on DVD");
    }
}
