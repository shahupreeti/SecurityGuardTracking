package com.srtcoders.securityguardtracking.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.srtcoders.securityguardtracking.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    ImageView backForgotpass;
    EditText emailEditText;
    Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_activity);
        init();
        clickEvent();
    }

    private void init() {
        backForgotpass = (ImageView) findViewById(R.id.back_arrow_forgotPass);
        emailEditText = (EditText) findViewById(R.id.txt_success_email);
        submit = (Button) findViewById(R.id.btn_forgotpass);
    }

    private void clickEvent() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        backForgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ForgotPasswordActivity.this,NewLoginActivity.class);
                startActivity(intent);
            }
        });

    }


}
