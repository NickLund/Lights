package com.example.nick_lund.lights;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu extends AppCompatActivity {
    Button click;
    public static TextView Speed;
    public static TextView LEDColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        click = (Button) findViewById(R.id.button);
        //data = (TextView) findViewById(R.id.fetcheddata);
        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fetchData process = new fetchData();
                process.execute();
            }
        });
    }
    public void SetPattern() {
        Intent intent = new Intent(this, SetPattern.class);
        startActivity(intent);
    }
}
