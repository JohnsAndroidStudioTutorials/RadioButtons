package com.sartainstudios.radiobuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupJohnsAndroidStudioTutorialsPreference;
    Button buttonSubmit;
    TextView textViewResults;
    String selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupJohnsAndroidStudioTutorialsPreference = (RadioGroup) findViewById(R.id.radio_group_johns_android_studio_tutorials_preference);
        buttonSubmit = (Button) findViewById(R.id.button_submit);
        textViewResults = (TextView) findViewById(R.id.text_view_results);

        radioGroupJohnsAndroidStudioTutorialsPreference.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                switch (rb.getId()) {
                    case R.id.radio_button_I_passionately_love_them:
                        //textViewResults.setText("Well I love you too");
                        selection = "Well I love you too";
                        break;
                    case R.id.radio_button_I_somewhat_like_them:
                        selection = "Well I somewhat like you";
                        break;
                    case R.id.radio_button_I_think_they_are_okay:
                        selection = "Well I think you're okay";
                        break;
                    case R.id.radio_button_I_have_a_disintrest_in_them:
                        selection = "Well I have a disinterest in you";
                        break;
                    case R.id.radio_button_I_have_no_opinion_on_them:
                        selection = "The only opinion I have on u is you need to make up your mind";
                        break;
                    default:
                        selection = "Do you not know how to select an option?";
                }
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResults.setText(selection);
            }
        });
    }
}