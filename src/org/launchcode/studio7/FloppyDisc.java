package org.launchcode.studio7;

import java.util.ArrayList;

public class FloppyDisc extends BaseDisc implements Disk {
    static final String storageCapacity = "1.4 MB";
    private static final String type= "Floppy Disk";

    public FloppyDisc(String title, ArrayList<String> contents) {
        super(title, contents);
    }

    @Override
    public void storeData(String addContent) {
        this.getContents().add(addContent);
    }

    @Override
    public void spinDisc() {
        System.out.println("Floppy Disc spin at 300-360rpm");
    }

    @Override
    public String toString() {
        String str = "\nTitle: "+ getTitle() + "\nDisk Type: "+ type+ "\nCapacity: " + storageCapacity +"\nContents: ";
        for(String content: getContents()){
            str +=  content + ",\t";
        }
        return str;
    }
}
