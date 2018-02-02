package ca.ualberta.cs.lonelytwitter;

/**
 * Created by aapae on 1/24/2018.
 */

import java.util.Date;

/**
 * class for important tweet object
 * @author Aidan Paetsch
 * @see Tweet
 *
 */
public class ImportantTweet extends Tweet{
    /**
     * constructor for important tweet object
     * @param message sends message string to superclass tweet
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * constructor for important tweet object
     * @param message sends message string to superclass tweet
     * @param date sends date to superclass tweet
     */
    ImportantTweet(String message, Date date){
        super(message,date);
    }

    /**
     * checks if tweet is important
     * @return returns true if tweet is important
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}