package com.example.android.tourguide;

/**
 * {@link ItemActivity} is an activity one can do in the city. It can be a restaurant, a place to go,
 * a park, a museum, or anything else.
 */
public class ItemActivity {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * The name of the activity one can do in the city
     */
    private String mActivityName;
    /**
     * The description of the activity one can do in the city
     */
    private String mActivityDescription;
    /**
     * The ID for the image of the activity one can do in the city
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * @param ActivityName        is the name of the activity one can do in the city
     * @param ActivityDescription is the description of the activity one can do in the city
     * @param ImageResourceId     is the ID of the image for the activity one can do in the city
     */
    public ItemActivity(String ActivityName, String ActivityDescription, int ImageResourceId) {
        mActivityName = ActivityName;
        mActivityDescription = ActivityDescription;
        mImageResourceId = ImageResourceId;
    }

    /**
     * @return the name of the activity one can do in the city
     */
    public String getActivityName() {
        return mActivityName;
    }

    /**
     * @return the description of the activity one can do in the city
     */
    public String getActivityDescription() {
        return mActivityDescription;
    }

    /**
     * @return the ID of the activity one can do in the city
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return whether the item has an image or not
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
