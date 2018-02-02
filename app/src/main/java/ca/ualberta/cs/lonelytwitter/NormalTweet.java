package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Aidan Paetsch on 1/24/2018.
 */

import java.util.Date;

/**
 * Class for a normal tweet extending tweet class
 * represents a normal tweet
 * @author Aidan Paetsch
 * @date February 2, 2018
 * @see Tweet
 */
public class NormalTweet extends Tweet {
    /**
     * constructor for a normal tweet object
     * @param message is passed to the superclass tweet
     */
    NormalTweet(String message){
        super(message);

    }

    /**
     * constructor method for a normal tweet object with both a message and a date
     * @param message is passed to super class tweet
     * @param date is passed to super class tweet
     */
    NormalTweet(String message, Date date){
        super(message,date);
    }

    /**
     * checks if tweet is an important tweet or not
     * @return returns true if tweet is important
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}