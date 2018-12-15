package com.example.irayori.hadiahpert10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtBil1;
    private EditText edtBil2;
    private Button btnJumlah;
    private Button btnKurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtBil1 = (EditText) findViewById(R.id.et_bil1);
        edtBil2 = (EditText) findViewById(R.id.et_bil2);
        btnJumlah = (Button) findViewById(R.id.bt_jumlah);
        btnKurang = (Button) findViewById(R.id.bt_kurang);

        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bil1 = edtBil1.getText().toString().trim();
                String bil2 = edtBil2.getText().toString().trim();

                int bilangan1 = Integer.parseInt(bil1);
                int bilangan2 = Integer.parseInt(bil2);

                int jumlah = bilangan1 + bilangan2;

                Bundle bundle = new Bundle();
                bundle.putString("hasil",String.valueOf(jumlah));
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bil1 = edtBil1.getText().toString().trim();
                String bil2 = edtBil2.getText().toString().trim();

                int bilangan1 = Integer.parseInt(bil1);
                int bilangan2 = Integer.parseInt(bil2);

                int kurang = bilangan1 - bilangan2;

                Bundle bundle = new Bundle();
                bundle.putString("hasil",String.valueOf(kurang));
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
