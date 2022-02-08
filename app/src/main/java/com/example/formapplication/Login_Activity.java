package com.example.formapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    EditText uname, pass;
    Button login_button, register_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uname = (EditText) findViewById(R.id.etUsername);
        pass = (EditText) findViewById(R.id.etPassword);
        login_button = (Button) findViewById(R.id.login);
        register_button = (Button) findViewById(R.id.register);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname.getText().toString().equals("admin") || pass.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Login Fail:/", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}