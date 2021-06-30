package com.example.droidgram;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.*;



public class MainActivity extends AppCompatActivity {


    int likess = 0;
    int index = 0;
    ArrayList<Post> posts = new ArrayList<Post>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Post post1 = new Post(R.drawable.spoon, 0, "Someoene", "A spoon");
        final Post post2 = new Post(R.drawable.fork, 0, "me", "A fork");
        final Post post3 = new Post(R.drawable.knife,5, "knifeLover", "Can't touch my knife");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);




        final EditText newCaption = findViewById(R.id.captionHolder);


        final TextView likes = findViewById(R.id.likes);
        final TextView messages = findViewById(R.id.commentSection);

        //linking the imageViews

        final ImageView newImage = findViewById(R.id.postHolder);

        newImage.setImageResource(R.drawable.spoon);

        //linking buttons

        //  Button button = findViewById(R.id.dislike);
        Button like = findViewById(R.id.like);
        Button sendmsg = findViewById(R.id.sendmsg);
        Button next = findViewById(R.id.nextPost);

        //linking the scrollViwes

        ScrollView scrollView = findViewById(R.id.scrollView);

        //

        newImage.setImageResource(post1.getpicture());
        likes.setText(post1.getLikes()+"");


        //

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posts.get(index).getLikes()==0){
                    posts.get(index).setLikes(posts.get(index).getLikes()+1);
                likes.setText(" " + posts.get(index).getLikes());

                }
                else{
                    posts.get(index).setLikes(posts.get(index).getLikes()-1);
                    likes.setText(" "+posts.get(index).getLikes());
                }

            }


        });
        sendmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newMessage = newCaption.getText().toString() + "\n";
                messages.append(newMessage);
                newCaption.getText().clear();


            }
        });

        // When button clicked
        //USe next post
        //fill in all new info
        //   newImage.setImageResource(posts.get(1).getpicture());
        //        likes.setText(post1.getLikes()+"");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index++;
                if(index>2){
                    index=0;
                }
                newImage.setImageResource(posts.get(index).getpicture());
                likes.setText(posts.get(index).getLikes()+"");


            }

        });

    }

    }





