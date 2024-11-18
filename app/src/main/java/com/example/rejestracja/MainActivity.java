package com.example.rejestracja;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText haslo;
    private EditText haslo2;
    private Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        email = findViewById(R.id.email);
        haslo = findViewById(R.id.password);
        haslo2 = findViewById(R.id.password2);
        confirm = findViewById(R.id.confirm);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        };
    }
