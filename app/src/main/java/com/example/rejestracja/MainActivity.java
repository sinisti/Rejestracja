package com.example.rejestracja;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
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
    private TextView editmsg;
    private Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        email= findViewById(R.id.email);
        haslo = findViewById(R.id.password);
        haslo2 = findViewById(R.id.password2);
        editmsg = findViewById(R.id.editmsg);
        confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                confirm();
            }
        });
    }
    private void confirm() {
        if (!email.getText().toString().contains("@")) {
            editmsg.setText("Nieprawidłowy adres e-mail");
        } else if (!haslo.getText().toString().equals(haslo2.getText().toString())) {
            editmsg.setText("Hasła się różnią");
        } else {
            editmsg.setText("Witaj " + email.getText().toString());
        }
    }
}
