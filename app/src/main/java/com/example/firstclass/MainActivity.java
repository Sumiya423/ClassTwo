package com.example.firstclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private Button loginButton;
    private EditText editText;
    private ImageView imageView;
    private Button imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.textViewId);
        button=findViewById(R.id.buttonId);
        loginButton=findViewById(R.id.loginButtonId);
        editText=findViewById(R.id.editTextId);
        imageButton=findViewById(R.id.imageButtonId);
        imageView=findViewById(R.id.imageViewId);

        textView.setText("You Are Gorgeous !");
        button.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        imageButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.buttonId) {
            Toast.makeText(this, "DIU", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.loginButtonId){
            String text = editText.getEditableText().toString();

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.imageButtonId){
            imageView.setImageResource(R.drawable.camera);
        }
    }
}