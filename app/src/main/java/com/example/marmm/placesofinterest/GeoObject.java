package com.example.marmm.placesofinterest;

public class GeoObject {

    private String mGeoName;
    private int mGeoImageName;
    private boolean isInEuropa;

    public GeoObject(String mGeoName, int mGeoImageName, boolean isInEuropa) {

        this.mGeoName = mGeoName;
        this.mGeoImageName = mGeoImageName;
        this.isInEuropa = isInEuropa;
    }

    public String getmGeoName() {
        return mGeoName;
    }

    public void setmGeoName(String mGeoName) {
        this.mGeoName = mGeoName;
    }

    public int getmGeoImageName() {
        return mGeoImageName;
    }

    public void setmGeoImageName(int mGeoImageName) {
        this.mGeoImageName = mGeoImageName;
    }

    public boolean getisInEuropa() { return isInEuropa; }

    public static final String[] PRE_DEFINED_GEO_OBJECT_NAMES = {

            "Denemarken",
            "Canada",
            "Bangladesh",
            "Kazachstan",
            "Colombia",
            "Polen",
            "Malta",
            "Thailand"
    };


    public static final int[] PRE_DEFINED_GEO_OBJECT_IMAGE_IDS = {

            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };

    public static final boolean[] PRE_DEFINED_GEO_OBJECT_BOOLEANS = {

            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };
}