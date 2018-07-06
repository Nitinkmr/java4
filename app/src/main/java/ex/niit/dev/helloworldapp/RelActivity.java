package ex.niit.dev.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RelActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText passWordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel);
        EditText emailEditText = (EditText)findViewById(R.id.emailEditText);
        passWordEditText = (EditText)findViewById(R.id.passWordEditText);
        Button saveBtn = (Button)findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(this);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            String emailTxt = bundle.getString(Util.EMAIL);
            emailEditText.setText(emailTxt);
        }

    }



    public void onBackBtnPressed(View view){
        finish();
    }


    @Override
    public void onClick(View v) {
        //
        Intent intent = new Intent();
        intent.putExtra(Util.PASSWORD,passWordEditText.getText().toString());
        setResult(Util.REG_RES_CODE,intent);
        finish();
    }
}
