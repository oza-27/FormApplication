package com.example.formapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView etfn, etln, etId, etGen, etNum, etPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfn = (EditText) findViewById(R.id.etFirstName);
        etln = (EditText) findViewById(R.id.etLastName);
        etId = (EditText) findViewById(R.id.etEmail);
        etGen = (EditText) findViewById(R.id.etGender);
        etNum = (EditText) findViewById(R.id.etPhone);
        etPwd = (EditText) findViewById(R.id.etPwd);

        Bundle bundle = getIntent().getExtras();

        String Firstname = bundle.getString("etfn");
        String Lastname = bundle.getString("etln");
        String Email = bundle.getString("etId");
        String Password = bundle.getString("etPwd");
        String Phone = bundle.getString("etNum");
        String Gender = bundle.getString("etGen");

        etfn.setText(Firstname);
        etln.setText(Lastname);
        etId.setText(Email);
        etGen.setText(Gender);
        etNum.setText(Phone);
        etPwd.setText(Password);
    }
}