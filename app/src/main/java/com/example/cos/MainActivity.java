package com.example.cos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ImageView zdjecie;
    private ToggleButton Zielony,Niebieski,Czerwony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zdjecie = (ImageView) findViewById(R.id.zdjecie);
        Zielony = (ToggleButton) findViewById(R.id.Zielony);
        Niebieski = (ToggleButton) findViewById(R.id.Niebieski);
        Czerwony = (ToggleButton) findViewById(R.id.Czerwony);

        Zielony.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Czerwony.setChecked(false);
                    Niebieski.setChecked(false);
                    zdjecie.setColorFilter(getResources().getColor(R.color.green));
                } else {
                    zdjecie.setColorFilter(null);
                }
            }
        });
        Niebieski.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Zielony.setChecked(false);
                    Czerwony.setChecked(false);
                    zdjecie.setColorFilter(getResources().getColor(R.color.blue));
                } else {
                    zdjecie.setColorFilter(null);
                }
            }
        });
        Czerwony.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Zielony.setChecked(false);
                    Niebieski.setChecked(false);
                    zdjecie.setColorFilter(getResources().getColor(R.color.red));
                } else {
                    zdjecie.setColorFilter(null);//a
                }
            }
        });
    }
}