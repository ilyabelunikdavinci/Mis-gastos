package com.example.misgastos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    EditText edAmount;
    Button btnAdd;

    EditText edDescription;

    double total = 0;

    TextView txtTotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edAmount = findViewById(R.id.edAmount);
        edDescription = findViewById(R.id.edDescription);
        btnAdd = findViewById(R.id.btnAdd);
        txtTotal = findViewById(R.id.txtTotal);

        btnAdd.setOnClickListener(v -> {

            String description = edDescription.getText().toString();

            String texto = edAmount.getText().toString();
            double amount = Double.parseDouble(texto);

            TextView movimiento = new TextView(this);
            movimiento.setText(description + "    $" + amount);
            LinearLayout layoutMovimientos = findViewById(R.id.layoutMovimientos);
            layoutMovimientos.addView(movimiento);

            total = total + amount;
            txtTotal.setText("$ " + total);


        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}