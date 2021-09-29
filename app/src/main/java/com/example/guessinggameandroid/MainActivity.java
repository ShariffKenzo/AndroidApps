package com.example.guessinggameandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }







        public int reset () {
            Random ran = new Random();

            return ran.nextInt(10);


        }

        int randnum = reset();

        int i = 5;



        public void CheckAnswer (View view){

        TextView outputdisplay = findViewById(R.id.display);
        EditText usernumber = findViewById((R.id.Number));



        //NO INPUT
        if (usernumber.getText().toString().length() == 0) {
            usernumber.setText("0");
        }
        //NUMBER CONVERSION;
        int num = Integer.parseInt(usernumber.getText().toString());

        // calculations;

        if (randnum == num) {
            outputdisplay.setText("congratz, next round");
            i = 5;
            randnum=reset();


        } else if (randnum > num) {
            outputdisplay.setText("Number is too low, " + i + " tries left");
        } else {

            outputdisplay.setText("Number is too high " + i + " tries left");
        }


        if (i == 0) {
            outputdisplay.setText("GAME OVER");
            randnum = reset();
            i = 5;

        }

            i--;

            ////// END OF COMMENT LINE

            /////DEBUGGING
            /*
            i--;

            if(i ==3){
                randnum = reset();
            }
            if(i ==0){
                i=5;
              //  randnum = reset();
            }
          outputdisplay.setText(String.valueOf("value of count: " + i + " value of randnum: " + randnum));
            */

    }



}