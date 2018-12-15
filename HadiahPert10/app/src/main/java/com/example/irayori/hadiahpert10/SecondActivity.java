package com.example.irayori.hadiahpert10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        TextView txthasil = (TextView) findViewById(R.id.txt_hasil);

        Bundle bundle = getIntent().getExtras();
        txthasil.setText(bundle.getString("hasil"));

    }
}
