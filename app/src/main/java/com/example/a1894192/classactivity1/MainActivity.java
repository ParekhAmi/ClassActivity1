package com.example.a1894192.classactivity1;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    String tag;
    EditText Name,Password,Email;
    Button Submit,Clear;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Name);
        Password = findViewById(R.id.Password);
        Email = findViewById(R.id.Email);

        Submit = findViewById(R.id.Submit);
        Clear = findViewById(R.id.Clear);

        Submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.i(tag, Name.toString());
                Log.i(tag, Password.toString());
                Log.i(tag, Email.toString());

                Toast.makeText(getApplicationContext(), "Registration Successfull", Toast.LENGTH_SHORT).show();
                Snackbar snackbar = Snackbar.make(layout,text: "")

            }
        });
                }

        }