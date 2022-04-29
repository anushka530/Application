package com.edumentor.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    ImageView next;
    EditText name, email, code, confirmcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        next = findViewById(R.id.next);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        code = findViewById(R.id.code);
        confirmcode = findViewById(R.id.confirmcode);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.length() == 0 || email.length() == 0 || code.length() == 0 || confirmcode.length() == 0)
                    Toast.makeText(RegisterActivity.this, "All are required fields", Toast.LENGTH_SHORT).show();
                else
                   startActivity(new Intent(RegisterActivity.this,ProfileActivity.class));
            }
        });
    }
}