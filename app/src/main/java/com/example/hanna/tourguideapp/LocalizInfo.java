package com.example.hanna.tourguideapp;


/**
 * Created by Hanna on 24.03.2018.
 */

public class LocalizInfo {

    private String mPlaceName;
    private String mPlaceAdress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this localizinfo */
    private static final int NO_IMAGE_PROVIDED = -1;

    public LocalizInfo(String placeName, String placeAdress) {
        mPlaceName = placeName;
        mPlaceAdress = placeAdress;
    }

    public LocalizInfo(String placeName, String placeAdress, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceAdress = placeAdress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Return the name of the localizinfo.
     */
    public String getmPlaceName() {
        return mPlaceName;
    }

    /**
     * Return the adress of the localizinfo.
     */
    public String getmPlaceAdress() {
        return mPlaceAdress;
    }

    public int getImageResourceId(){return mImageResourceId;}

    /**
     * Returns whether or not there is an image for this localizinfo.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the localizinfo.
     */
}
