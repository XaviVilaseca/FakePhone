package com.example.xaviervilasecagarc.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        Button btn_0 = (Button)findViewById(R.id.btn_0);
        Button btn_1 = (Button)findViewById(R.id.btn_1);
        Button btn_2 = (Button)findViewById(R.id.btn_2);
        Button btn_3 = (Button)findViewById(R.id.btn_3);
        Button btn_4 = (Button)findViewById(R.id.btn_4);
        Button btn_5 = (Button)findViewById(R.id.btn_5);
        Button btn_6 = (Button)findViewById(R.id.btn_6);
        Button btn_7 = (Button)findViewById(R.id.btn_7);
        Button btn_8 = (Button)findViewById(R.id.btn_8);
        Button btn_9 = (Button)findViewById(R.id.btn_9);
        Button btn_borrar = (Button)findViewById(R.id.btn_borrar);
        Button btn_llamar = (Button)findViewById(R.id.btn_llamar);
        final TextView numero = (TextView)findViewById(R.id.edit_num);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"0");
            }

        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText()+"9");
            }
        });
        btn_borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText("");
            }
        });
        btn_llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText
                        (FakePhoneActivity.this,"Llamando a "+ numero.getText(),Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
