package com.example.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ImageButton btn_Dado =  (ImageButton) findViewById(R.id.imageButton);
        TextView txt_Result = (TextView) findViewById(R.id.txt_result);

        btn_Dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // int valor[] = {1,2,3,4,5,6};
                Random random = new Random();
                int randomNumber = random.nextInt(7 - 1) + 1;
                String aString = Integer.toString(randomNumber);




                txt_Result.setText(" " +aString);




               // valor = Random.nextInt(max -min+1 )+min;
            }
        });




    }
}