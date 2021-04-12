package com.example.softwaredesign;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    public Button q1;
    public Button q2;
    public Button q3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

       q1 = (Button) findViewById(R.id.q1);
       q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        q2 = (Button) findViewById(R.id.q2);
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        q3 = (Button) findViewById(R.id.q3);
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity1() {
        Intent intent = new Intent(this, love.class);
        startActivity(intent);
    }
    public void openActivity2() {
        Intent intent = new Intent(this, family.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, bible.class);
        startActivity(intent);
    }


}
