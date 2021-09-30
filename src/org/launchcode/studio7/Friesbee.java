package org.launchcode.studio7;

public class Friesbee implements Disk{
    private static final String type = "Frisbee";
    @Override
    public void spinDisc() {
        System.out.println("Frisbee disk spin on air after the player throw while spinning.");
    }

    @Override
    public String toString() {
        return "\nType: "+ type;
    }
}
