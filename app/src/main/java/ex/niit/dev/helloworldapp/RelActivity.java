package ex.niit.dev.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel);
        EditText emailEditText = (EditText)findViewById(R.id.emailEditText);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            String emailTxt = bundle.getString(Util.EMAIL);
            emailEditText.setText(emailTxt);
        }

    }

    public void onBackBtnPressed(View view){
        finish();
    }
}
