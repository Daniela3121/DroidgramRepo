package com.example.droidgram;

public class Post {

    int picture;
    int likes;
    String userName;
    String caption;

    //constructor
 public Post(int picture, int likes, String userName, String caption){
     this.picture = picture;
     this.likes = likes;
     this.userName = userName;
     this.caption = caption;

 }
    //gets and sets

public void setPicture(int newPicture) { //setter
    this.picture = newPicture;
}

public int getpicture(){ //getter

        return this.picture;
    }



 public void setLikes(int newLikes) { //setter
     this.likes = newLikes;
 }
 public int getLikes(){
         return this.likes;
     }



public void setcaption(String newCaption) {
    this.caption = newCaption;
}
    public String getCaption(){
        return this.caption;
    }


    public void setuserName(String newuserName) {
        this.userName = newuserName;
    }
        public String getUserName(){
            return this.userName;
        }


}
