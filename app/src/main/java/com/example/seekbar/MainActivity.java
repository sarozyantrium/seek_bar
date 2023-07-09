package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seek_bar;
    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seek_bar=(SeekBar) findViewById(R.id.seek_bar);
        text_view=(TextView) findViewById(R.id.text_view);

        //setting seekbar on event
        seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            //this is to show value in textview

            int progress_value=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                progress_value=i;
                text_view.setText(progress_value+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}