package ca.ualberta.cs.lonelytwitter;

/**
 * Created by aapae on 1/24/2018.
 */

import java.util.Date;

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);

    }

    NormalTweet(String message, Date date){
        super(message,date);
    }

    @Override
    public boolean isImportant(){
        return false;
    }
}