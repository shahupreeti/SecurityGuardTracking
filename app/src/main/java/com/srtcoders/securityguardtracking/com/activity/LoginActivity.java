package com.srtcoders.securityguardtracking.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.srtcoders.securityguardtracking.R;

public class LoginActivity extends AppCompatActivity {

    EditText user_id_EditText,password_EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialization();
    }

    public void initialization(){
        user_id_EditText = (EditText) findViewById(R.id.user_id_et);
        user_id_EditText.setHint("#fff");
        password_EditText = (EditText) findViewById(R.id.password_et);
        password_EditText.setHint("#fff");
    }
    //edited by pooja
}
