package org.launchcode.studio7;

public class Wheel implements Disk {
    private static final String type = "Wheel";
    @Override
    public void spinDisc() {
        System.out.println("Wheel spins driven by motor.");
    }

    @Override
    public String toString() {
        return "\nType: "+ type;
    }
}
