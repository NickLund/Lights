package com.example.nick_lund.lights;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class SetPattern extends AppCompatActivity {

    TextView tvProgressLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_pattern);

        Intent intent = getIntent();
        String Speed = intent.getStringExtra(Menu.EXTRA_TEXT);
        String LEDColor = intent.getStringExtra(Menu.EXTRA_TEXT2);

        TextView textViewSpeed = (TextView) findViewById(R.id.Speed);
        TextView textViewColor = (TextView) findViewById(R.id.Color);
        textViewSpeed.setText(Speed);
        textViewColor.setText(LEDColor);

        // set a change listener on the SeekBar
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(seekBarChangeListener);

        int progress = seekBar.getProgress();
        tvProgressLabel = findViewById(R.id.textView);
        tvProgressLabel.setText("Progress: " + progress);
    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            tvProgressLabel.setText("Progress: " + progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };
}