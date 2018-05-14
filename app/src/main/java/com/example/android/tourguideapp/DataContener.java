package com.example.android.tourguideapp;

public class DataContener {

    private String mFragmentName;
    private String mTitle;
    private String mSmallText;
    private String mLongText;
    private int mImageID;

    public DataContener(String FragmentName, String Title, String SmallText, String LongText, int ImageID) {
        this.mFragmentName = FragmentName;
        this.mTitle = Title;
        this.mSmallText = SmallText;
        this.mLongText = LongText;
        this.mImageID = ImageID;
    }

    public String getFragmentName() {
        return mFragmentName;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSmallText() {
        return mSmallText;
    }

    public String getLongText() {
        return mLongText;
    }

    public int getImageID() {
        return mImageID;
    }

}
