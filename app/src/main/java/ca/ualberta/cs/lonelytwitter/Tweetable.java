package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Aidan Paetsch on 1/24/2018.
 */

/**
 * Interface telling any class that implements to include
 * the methods get message and set message
 *
 * @author Aidan Paetsch
 */
public interface Tweetable {
    /**
     * getter for a message
     * @return a message
     */
    public String getMessage();

    /**
     * setter for a message
     * @param message needs a string message when called
     * @throws TweetTooLongException if the message is over 160 characters
     */
    public void setMessage(String message) throws TweetTooLongException;
}