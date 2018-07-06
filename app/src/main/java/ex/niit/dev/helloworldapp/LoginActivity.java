package ex.niit.dev.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText = (EditText)findViewById(R.id.emailEditText);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);
    }

    public void onRegisterClicked(View view){
        passwordEditText.setText("");
        Intent intent = new Intent(this,RelActivity.class);
        intent.putExtra(Util.EMAIL,emailEditText.getText().toString());
        startActivityForResult(intent,Util.REG_REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (requestCode == Util.REG_REQ_CODE){
            if (resultCode == Util.REG_RES_CODE){
                //there is a result // user pressed Save btn
                Bundle bundle = intent.getExtras();
                passwordEditText.setText(bundle.getString(Util.PASSWORD));

            }else{
                // back // dismissed
            }
        }
    }
}
