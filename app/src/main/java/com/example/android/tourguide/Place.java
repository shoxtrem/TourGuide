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
    private final String ActivityName;
    /**
     * The description of the activity one can do in the city
     */
    private final String ActivityDescription;
    /**
     * The ID for the image of the activity one can do in the city
     */
    private final int ImageResourceId;

    /**
     * @param newActivityName        is the name of the activity one can do in the city
     * @param newActivityDescription is the description of the activity one can do in the city
     * @param newImageResourceId     is the ID of the image for the activity one can do in the city
     */
    public Place(String newActivityName, String newActivityDescription, int newImageResourceId) {
        ActivityName = newActivityName;
        ActivityDescription = newActivityDescription;
        ImageResourceId = newImageResourceId;
    }

    /**
     * @return the name of the activity one can do in the city
     */
    public String getActivityName() {
        return ActivityName;
    }

    /**
     * @return the description of the activity one can do in the city
     */
    public String getActivityDescription() {
        return ActivityDescription;
    }

    /**
     * @return the ID of the activity one can do in the city
     */
    public int getImageResourceId() {
        return ImageResourceId;
    }

    /**
     * @return whether the item has an image or not
     */
    public boolean hasImage() {
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }
}
