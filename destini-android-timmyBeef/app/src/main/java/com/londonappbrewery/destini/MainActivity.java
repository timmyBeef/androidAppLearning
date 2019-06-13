package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mButtomButton;
    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        t1Story();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    t3Story();
                } else if (mStoryIndex == 2) {
                    t3Story();
                } else {
                    t6End();
                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    t2Story();
                } else if (mStoryIndex == 2) {
                    t4End();
                } else {
                    t5End();
                }
            }
        });

    }

    private void t1Story() {
        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mButtomButton = findViewById(R.id.buttonBottom);
        mStoryIndex = 1;
    }

    private void t2Story() {
        mStoryTextView.setText(R.string.T2_Story);
        mTopButton.setText(R.string.T2_Ans1);
        mButtomButton.setText(R.string.T2_Ans2);
        mStoryIndex = 2;
    }

    private void t3Story() {
        mStoryTextView.setText(R.string.T3_Story);
        mTopButton.setText(R.string.T3_Ans1);
        mButtomButton.setText(R.string.T3_Ans2);
        mStoryIndex = 3;
    }

    private void t4End() {
        mStoryTextView.setText(R.string.T4_End);
        mTopButton.setVisibility(View.GONE);
        mButtomButton.setVisibility(View.GONE);
    }

    private void t5End() {
        mStoryTextView.setText(R.string.T5_End);
        mTopButton.setVisibility(View.GONE);
        mButtomButton.setVisibility(View.GONE);
    }

    private void t6End() {
        mStoryTextView.setText(R.string.T6_End);
        mTopButton.setVisibility(View.GONE);
        mButtomButton.setVisibility(View.GONE);
    }
}
