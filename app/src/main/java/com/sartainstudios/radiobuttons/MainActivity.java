package com.sartainstudios.radiobuttons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.change_on_button_click_button).setOnClickListener(buttonClickListener);
        findViewById(R.id.direct_change_button).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.change_on_button_click_button:
                    Intent changeOnButtonClick = new Intent(MainActivity.this, ChangeOnButtonClick.class);
                    startActivity(changeOnButtonClick);
                    break;
                case R.id.direct_change_button:
                    Intent directChange = new Intent(MainActivity.this, DirectChange.class);
                    startActivity(directChange);
                    break;
            }
        }
    };
}