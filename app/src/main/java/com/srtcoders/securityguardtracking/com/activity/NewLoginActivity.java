package com.srtcoders.securityguardtracking.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.srtcoders.securityguardtracking.R;

public class NewLoginActivity extends AppCompatActivity {
    TextView forgotpassTextView;
    Button signinButton;
    EditText emailEditText, passwordEditText;
    ImageView fbButton, gmailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_login_activity);
        init();
        clickEvent();
    }

    private void init() {
        forgotpassTextView = (TextView) findViewById(R.id.tv_forgotpass_signin);
        signinButton = (Button) findViewById(R.id.btn_signin_signin);
        emailEditText = (EditText) findViewById(R.id.et_txtemail_signin);
        passwordEditText = (EditText) findViewById(R.id.et_txtpass_signin);
        fbButton = (ImageView) findViewById(R.id.fb_btn_signin);
        gmailButton = (ImageView) findViewById(R.id.google_btn_signin);
    }

    private void clickEvent() {
        forgotpassTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewLoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
    }



}
