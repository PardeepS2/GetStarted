package com.pardeep.getstarted;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Declare our view variables

    private TextView mTextView;
    private Button mButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign values to variables.
        mTextView = (TextView) findViewById(R.id.textView);
        mButtonView = (Button) findViewById(R.id.button);
        View.OnClickListener listner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked and we will get a new fact.
                String[] facts = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can run faster than horses.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones; by the time you are an adult you will have 206.",
                        "It takes about 8 minutes for light from the Sun to reach Earth.",
                        "Some bamboo plants can grow almost a meter in just one day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 meters out of the water.",
                        "On average, it takes 66 days to form a new habit.",
                        "Mammoths still walked the earth when the Great Pyramid was being built." };

                String fact = "";
                // Randomly generated new fact.
                Random rnd = new Random();
                int rndnumber = rnd.nextInt(facts.length);
                fact = facts[rndnumber];
                mTextView.setText(fact);
            }
        };

        mButtonView.setOnClickListener(listner);
    }
}
