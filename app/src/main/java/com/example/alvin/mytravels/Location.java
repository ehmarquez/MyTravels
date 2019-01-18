package com.example.alvin.mytravels;

public class Location {

    //Private variables
    private String mName;
    private int mDescResourceId;
    private int mImageResourceId = NO_IMAGE;       //Assume no image at first
    private static final int NO_IMAGE = -1;

    /**
     * Constructor for Locations without image
     * @param name Location name
     * @param desc Description of location resource id
     */
    public Location(String name, int desc){
       mName = name;
       mDescResourceId = desc;
    }

    /**
     * Constructor for Locations with associated image
     * @param name Location name
     * @param desc Description of location resource id
     * @param imageSourceId Image associated with location
     */
    public Location(String name, int desc, int imageSourceId){
        mName = name;
        mDescResourceId = desc;
        mImageResourceId = imageSourceId;
    }

    /**
     * Check if location has an associated image
     * @return true if associated image exists
     */
    public boolean hasImage() {
        return (mImageResourceId != NO_IMAGE);
    }

    //Getters
    public String getmName() {
        return mName;
    }

    public int getmDescResourceId() {
        return mDescResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
