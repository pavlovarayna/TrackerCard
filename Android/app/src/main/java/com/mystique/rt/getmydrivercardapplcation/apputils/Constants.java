package com.mystique.rt.getmydrivercardapplcation.apputils;

/**
 * <h1>Constants class</h1>
 *
 * <b>Description: </b> This class contains all constant values used throughout
 * the application. Constants are reusable and publicly available. Their names
 * are self-explanatory.
 *
 * @author  Mystique Team
 * @version 1.0
 * @since   2018-11-12
 */
public class Constants {
    public static final String BASE_SERVER_URL = "http://10.121.189.165:8080/api";

    public static final int STATUS_CHECK_CODE_LENGTH = 10;

    public static final String LAST_UPDATED_TRUE = "yes";

    public static final String EMAIL_SUBJECT = "Your Tachograph Card Application";
    public static final String EMAIL_MESSAGE = "Your unique code for checking the status of your application is: ";

    public static final String STATUS_EMAIL_SUBJECT = "Your Tachograph Card Application new status";
    public static final String STATUS_EMAIL_MESSAGE1 = "Your Tachograph Card Application status is changed to: ";
    public static final String STATUS_EMAIL_MESSAGE2 = "You could receive it in our office in ";

    // APPLICATION RENEWAL REASONS
    public static final String RENEWAL_REASON_FIRST = "N/A";
    public static final String RENEWAL_REASON_LOST = "lost card";
    public static final String RENEWAL_REASON_STOLEN = "stolen card";
    public static final String RENEWAL_REASON_EUTOBG = "exchanging EU for BG card";
    public static final String RENEWAL_REASON_NAME = "name change";
    public static final String RENEWAL_REASON_ADDRESS = "address change";
    public static final String RENEWAL_REASON_SELFIE = "personal photograph change";
    public static final String RENEWAL_REASON_EXPIRED = "card expired";
    public static final String RENEWAL_REASON_SUSPENDED = "card suspended";
    public static final String RENEWAL_REASON_DAMAGED = "card damaged";
    public static final String RENEWAL_REASON_MALFUNCTIONING = "card malfunctioning";

    // APPLICATION TYPES
    public static final String APP_TYPE_FIRST = "first application";
    public static final String APP_TYPE_EUTOBG = "exchanging EU card for BG card";
    public static final String APP_TYPE_REPLACEMENT_CARD = "replacement of card due to problems with card";
    public static final String APP_TYPE_REPLACEMENT_PERSON = "replacement of card due to change in personal details";
    public static final String APP_TYPE_RENEWAL = "renewal of card";



    // APPLICATION STATUSES
    public static final String STATUS_NEW = "new";


    //todo put constants to all fields
    public static final int PERSONAL_NUMBER_MAX_LENGTH = 45;
    public static final int FIRST_NAME_MAX_LENGTH = 200;
    public static final int LAST_NAME_MAX_LENGTH = 50;
    public static final int ADDRESS_MAX_LENGTH = 500;
    public static final int ADDRESS_MIN_LENGTH = 10;
    public static final int PHONE_NUMBER_MAX_LENGTH = 20;
    public static final int PHONE_NUMBER_MIN_LENGTH = 9;
    public static final int EMAIL_MAX_LENGTH = 30;
    public static final int EMAIL_MIN_LENGTH = 7;
    public static final int EIGHTEEN_YEARS_IN_DAYS = 6574;


   public static final String[] STATUS_FIELDS = {"---", "approved", "rejected", "completed" };

    public static final String LONDON = "LondonCentral";

    public static final double LONDON_CENTRAL_LATITUDE = 42.6912445620777;
    public static final double LONDON_CENTRAL_LONGITUDE = 23.330605030059818;


}
