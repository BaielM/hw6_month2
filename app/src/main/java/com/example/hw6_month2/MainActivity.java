package com.example.hw6_month2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editEmail;
    EditText editPassword;
    Button button1;
    TextView text4;
    TextView text5;
    TextView tv_enterSign;
    TextView tv_welcome;
    TextView tv_exit;
    LinearLayout linearLayout;
    LinearLayout linearLayout2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        button1 = findViewById(R.id.button1);
        tv_enterSign = findViewById(R.id.tv_enterSign);
        tv_welcome = findViewById(R.id.tv_welcome);
        tv_exit = findViewById(R.id.tv_exit);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        linearLayout = findViewById(R.id.ll_container);
        linearLayout2 = findViewById(R.id.ll_container_2);

        editEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editEmail.getText().toString().isEmpty()){
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
                } else {
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }
        });

        editEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editPassword.getText().toString().isEmpty()){
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
                } else
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editEmail.getText().toString().equals("admin") && editPassword.getText().toString().equals("admin")){
                    editEmail.setVisibility(View.GONE);
                    editPassword.setVisibility(View.GONE);
                    tv_enterSign.setVisibility(View.GONE);
                    tv_exit.setVisibility(View.GONE);
                    text4.setVisibility(View.GONE);
                    text5.setVisibility(View.GONE);
                    button1.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,
                            "Вы успешно вошли в аккаунт", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_LONG).show();
                }
            }
        });

        editEmail.setOnClickListener(view -> {
            if(linearLayout2.getVisibility() == View.GONE){
                linearLayout2.setVisibility(View.VISIBLE);
            }else{
                linearLayout2.setVisibility(View.GONE);
            }
        });
    }
}