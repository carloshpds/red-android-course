package com.gestta.gestta_app;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.activity_login_input_user)
    protected TextInputLayout inputUser;

    @BindView(R.id.activity_login_password_input)
    protected TextInputLayout inputPassword;

    @BindView(R.id.activity_login_forgot_password_button)
    protected Button fogotPasswordButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        if(savedInstanceState != null){
            inputUser.getEditText().setText(savedInstanceState.getString("user"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("user", inputUser.getEditText().getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if(savedInstanceState != null){
            inputUser.getEditText().setText(savedInstanceState.getString("user"));
        }
    }

    @OnClick(R.id.activity_login_login_button)
    protected void performLogin() {
        Intent goToMain = new Intent(this, MainActivity.class);
        goToMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(goToMain);
    }

    @OnClick(R.id.activity_login_forgot_password_button)
    protected void openForgotActivity() {
        Intent goToForgotPassword = new Intent(this, ForgotPassActivity.class);
        startActivity(goToForgotPassword);
    }



}
