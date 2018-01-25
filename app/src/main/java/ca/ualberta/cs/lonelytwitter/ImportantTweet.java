package ca.ualberta.cs.lonelytwitter;

/**
 * Created by aapae on 1/24/2018.
 */

import java.util.Date;

public class ImportantTweet extends Tweet{

    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message,date);
    }


    @Override
    public boolean isImportant(){
        return true;
    }
}