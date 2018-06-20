package com.example.android.tourguide;

/**
 * {@link Place} is an activity one can do in the city. It can be a restaurant, a place to go,
 * a park, a museum, or anything else.
 */
class Place {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * The name of the activity one can do in the city
     */
    private final String activityName;
    /**
     * The description of the activity one can do in the city
     */
    private final String activityDescription;
    /**
     * The ID for the image of the activity one can do in the city
     */
    private final int imageResourceId;

    /**
     * @param newActivityName        is the name of the activity one can do in the city
     * @param newActivityDescription is the description of the activity one can do in the city
     * @param newImageResourceId     is the ID of the image for the activity one can do in the city
     */
    public Place(String newActivityName, String newActivityDescription, int newImageResourceId) {
        activityName = newActivityName;
        activityDescription = newActivityDescription;
        imageResourceId = newImageResourceId;
    }

    /**
     * @return the name of the activity one can do in the city
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * @return the description of the activity one can do in the city
     */
    public String getActivityDescription() {
        return activityDescription;
    }

    /**
     * @return the ID of the activity one can do in the city
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * @return whether the item has an image or not
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
