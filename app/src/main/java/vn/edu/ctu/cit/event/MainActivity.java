package vn.edu.ctu.cit.event;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2=findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Button clicked")
                        .setMessage("Event from method")
                        .setPositiveButton("OK",null)
                        .create()
                        .show();
            }
        });


        Button btn3=findViewById(R.id.btn_3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        new AlertDialog.Builder(this)
                .setTitle("Button clicked")
                .setMessage("Event from implements")
                .setPositiveButton("OK",null)
                .create()
                .show();
    }

    public void btn1Click(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Button clicked")
                .setMessage("Event from layout")
                .setPositiveButton("OK",null)
                .create()
                .show();
    }
}