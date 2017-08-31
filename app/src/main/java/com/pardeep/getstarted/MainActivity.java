package com.pardeep.getstarted;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                String fact = "ostriches are run faster then horses.";
                mTextView.setText(fact);
            }
        };

        mButtonView.setOnClickListener(listner);
    }
}
