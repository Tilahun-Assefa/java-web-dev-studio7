package org.launchcode.studio7;

import java.util.ArrayList;

public class LPS extends BaseDisc implements Disk {
    private static final String type = "Vinyl Tape(LPS)";
    static final String storageCapacity = "23 min music play";

    public LPS(String title, ArrayList<String> contents) {
        super(title, contents);
    }

    @Override
    public void storeData(String addContent) {
        getContents().add(addContent);
    }

    @Override
    public void spinDisc() {
        System.out.println("LPS 33 spin at 33rpm.");
    }

    @Override
    public String toString() {
        String str = "\nTitle: " + getTitle() + "\nDisk Type: " + type + "\nCapacity: " + storageCapacity + "\nContents: ";
        for (String content : getContents()) {
            str += content + ",\t";
        }
        return str;
    }
}
