package manu.dev.gradingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextText);
        buttonLogin = findViewById(R.id.button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();

                // Check if a username has been entered
                if (!username.isEmpty()) {
                    // Successful login
                    Toast.makeText(getApplicationContext(), "Login Successful for " + username, Toast.LENGTH_SHORT).show();

                    // start the home activity
                    Intent grade=new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(grade);
                } else {
                    // Failed login
                    Toast.makeText(getApplicationContext(), "Please enter a valid username.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}