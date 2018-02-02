/*
 * Copyright (c) 2018 Team x. CMPUT 301. University of Alberta. All Rights Reserved.
 *  You may use, distribute or modify this code under the terms and conditions of the
 *  Code of Student Behaviour at the University of Alberta
 *  <You can find a copy of the license in this project> Otherwise please see <http://www.gnu.org/licenses/>
 */
//JavaDoc @param @return @delete - expected behaviour for method
//@author @version /** */
package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Aidan Paetsch on 1/24/2018.
 */

import java.util.Date;
/**
 * Class for representation of a tweet
 * @author Aidan Paetsch
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    /**
     * Constructs a tweet
     */
    Tweet(){

    }

    /**
     * Constructs a tweet
     * @param message string for tweet message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet
     * @param message string for a tweet message
     * @param date date for a tweet message
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Getter for the date of a tweet
     * @return the date for a tweet
     */
    public Date getDate(){
        return date;

    }

    /**
     * gets the tweet message
     * @return returns the tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * sets a tweet message and checks if the message is under 160 characters
     * @param message input tweet message
     * @throws TweetTooLongException thrown if the tweet exceeds 160 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets the date of a tweet
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * checks if the tweet is important
     * @return returns true or false
     */
    public abstract boolean isImportant();

    @Override
    public String toString(){
        return message;
    }
}