package com.example.deliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button btn_ir_crearCuenta;
    TextView txt_Rcontraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_ir_crearCuenta=findViewById(R.id.btn_ir_crearCuenta);
        txt_Rcontraseña = (TextView) findViewById(R.id.txt_contraseña);

        txt_Rcontraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,ResetPasswordActivity.class));
                finish();
            }
        });

        btn_ir_crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,SignUpActivity.class));
                finish();
            }
        });
    }
}