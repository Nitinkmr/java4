package ex.niit.dev.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText = (EditText)findViewById(R.id.emailEditText);
    }

    public void onRegisterClicked(View view){
        Intent intent = new Intent(this,RelActivity.class);
        intent.putExtra(Util.EMAIL,emailEditText.getText().toString());
        startActivity(intent);
    }
}
