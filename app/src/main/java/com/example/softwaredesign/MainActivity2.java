package com.example.softwaredesign;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    public Button git;
    public Button git1;
    public Button git2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        git = (Button) findViewById(R.id.git);
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        git1 = (Button) findViewById(R.id.git1);
        git1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        git2 = (Button) findViewById(R.id.git2);
        git2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity1() {
        Intent intent = new Intent(this, command.class);
        startActivity(intent);
    }
    public void openActivity2() {
        Intent intent = new Intent(this, command1.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, command2.class);
        startActivity(intent);
    }

}