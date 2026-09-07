package com.ornek.javasayac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView tvTitle;
    private TextView tvResult;
    private Button btnAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);
        tvResult = findViewById(R.id.tvResult);
        btnAction = findViewById(R.id.btnAction);

        tvTitle.setText("Grok Destekli Java APK");
        tvResult.setText("Sayaç Değeri: 0");
        btnAction.setText("Sayacı Artır (+1)");

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tvResult.setText("Sayaç Değeri: " + counter);
                Toast.makeText(MainActivity.this, "Tıklandı! Yeni Değer: " + counter, Toast.LENGTH_SHORT).show();
            }
        });
    }
}