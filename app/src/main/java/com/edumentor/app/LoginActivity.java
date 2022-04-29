package com.edumentor.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView register;
    Button login;
    EditText code, mobile, loks, vidhans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register = findViewById(R.id.signup_bt);
        login = findViewById(R.id.login_bt);
        code = findViewById(R.id.code);
        mobile = findViewById(R.id.mobile);
        loks = findViewById(R.id.loks);
        vidhans = findViewById(R.id.vidhans);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(code.length()==0 || mobile.length() == 0 || loks.length() == 0 || vidhans.length() == 0)
                    Toast.makeText(LoginActivity.this, "All are required fields", Toast.LENGTH_SHORT).show();
                else
                    startActivity(new Intent(LoginActivity.this,ProfileActivity.class));
            }
        });
    }
}