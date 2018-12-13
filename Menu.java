package com.example.nick_lund.lights;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nick_lund.lights.Colors.Blue;
import com.example.nick_lund.lights.Colors.Green;
import com.example.nick_lund.lights.Colors.Orange;
import com.example.nick_lund.lights.Colors.Purple;
import com.example.nick_lund.lights.Colors.StartButton;
import com.example.nick_lund.lights.Colors.Yellow;
import com.example.nick_lund.lights.Patterns.All;
import com.example.nick_lund.lights.Patterns.Rainbow;
import com.example.nick_lund.lights.Patterns.Reconfig;
import com.example.nick_lund.lights.Patterns.Stack;
import com.example.nick_lund.lights.Speed.Fast;
import com.example.nick_lund.lights.Speed.Medium;
import com.example.nick_lund.lights.Speed.Slow;

import retrofit2.http.PUT;

public class Menu extends AppCompatActivity {
    Button click;

    public static Button slow;
    public static Button medium;
    public static Button fast;

    public static TextView Speed;
    public static TextView LEDColor;

    public static Button etName;
    public static Button orange;
    public static Button yellow;
    public static Button green;
    public static Button blue;
    public static Button purple;

    public static Button all;
    public static Button reconfig;
    public static Button rainbow;
    public static Button stacker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        click = findViewById(R.id.button);

        slow = findViewById(R.id.button8);
        medium = findViewById(R.id.button9);
        fast = findViewById(R.id.button10);

        Speed = findViewById(R.id.Speed);
        LEDColor = findViewById(R.id.Color);

        etName = findViewById(R.id.button2);
        orange = findViewById(R.id.button3);
        yellow = findViewById(R.id.button4);
        green = findViewById(R.id.button5);
        blue = findViewById(R.id.button6);
        purple = findViewById(R.id.button7);

        all = findViewById(R.id.button11);
        reconfig = findViewById(R.id.button12);
        rainbow = findViewById(R.id.button13);
        stacker = findViewById(R.id.button14);

        slow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Slow process = new Slow();
                process.execute("http://192.168.101.85:5000/change-speed");
            }
        });
        medium.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Medium process = new Medium();
                process.execute("http://192.168.101.85:5000/change-speed");
            }
        });
        fast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Fast process = new Fast();
                process.execute("http://192.168.101.85:5000/change-speed");
            }
        });

        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fetchData process = new fetchData();
                process.execute();
            }
        });

        etName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                StartButton process = new StartButton();
                process.execute("http://192.168.101.85:5000/change-color");
            }
        });
        orange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Orange process = new Orange();
                process.execute("http://192.168.101.85:5000/change-color");
            }
        });
        yellow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Yellow process = new Yellow();
                process.execute("http://192.168.101.85:5000/change-color");
            }
        });
        green.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Green process = new Green();
                process.execute("http://192.168.101.85:5000/change-color");
            }
        });
        blue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Blue process = new Blue();
                process.execute("http://192.168.101.85:5000/change-color");
            }
        });
        purple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Purple process = new Purple();
                process.execute("http://192.168.101.85:5000/change-color");
            }
        });

        all.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                All process = new All();
                process.execute();
            }
        });
        rainbow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Rainbow process = new Rainbow();
                process.execute();
            }
        });
        reconfig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Reconfig process = new Reconfig();
                process.execute();
            }
        });
        stacker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Stack process = new Stack();
                process.execute();
            }
        });

    }
}
