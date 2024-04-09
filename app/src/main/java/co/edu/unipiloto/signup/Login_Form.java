package co.edu.unipiloto.signup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
    }

    public void btn_signupForm(View view) {
        Intent intent = new Intent(Login_Form.this, Signup_Form.class);
        startActivity(intent);
    }
}