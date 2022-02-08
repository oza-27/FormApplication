package com.example.formapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register_activity extends AppCompatActivity {
    EditText etFn, etLn, etId, etNum, etPass, etGen;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFn = (EditText) findViewById(R.id.etfn);
        etLn = (EditText) findViewById(R.id.etln);
        etId = (EditText) findViewById(R.id.etEmail);
        etGen = (EditText) findViewById(R.id.etGen);
        etNum = (EditText) findViewById(R.id.etPhone);
        etPass = (EditText) findViewById(R.id.etPwd);
        submit = (Button) findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("etFn", etFn.getText().toString());
                bundle.putString("etLn", etLn.getText().toString());
                bundle.putString("etGen", etGen.getText().toString());
                bundle.putString("etNum", etNum.getText().toString());
                bundle.putString("etPass", etPass.getText().toString());

                Intent intent = new Intent(Register_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}