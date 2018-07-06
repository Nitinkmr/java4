package ex.niit.dev.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate called");

        resultView = (TextView) findViewById(R.id.resultView);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                MainActivity.this.resultView.setText("1");
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume called");
    }

    public void onBtnPressed(View view) {
        //
        Button button = (Button) view;
        if (button.getText().equals("4")) {

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy called");
    }

    @Override
    public void onClick(View v) {
        // String text = resultView.getText().toString();
        switch (v.getId()) {
            case R.id.btn2:
                //
                resultView.append("2");
                break;

            case R.id.btn3:
                resultView.append("3");
                break;
        }
    }
}
