package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc  {
    private int diskId;
    private static int staticId = 1;
    private String title ;
    private ArrayList<String> contents;

    public BaseDisc(String title, ArrayList<String> contents) {
        this.diskId = staticId;
        staticId++;
        this.title = title;
        this.contents = contents;
    }

    public abstract void storeData(String addContent);

    public int getDiskId() {
        return diskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }
}
