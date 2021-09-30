package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{

    // Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200-500 rpm");
    }

    // Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    static final String storageCapacity = "700 MB";
    private static final String type= "CD";
    public CD(String title, ArrayList<String> contents) {
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
        System.out.println("Data is read from CD");
    }

    @Override
    public void WriteData() {
    System.out.println("Data is written on CD");
    }
}
