package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);


        final EditText edittext1 = (EditText) findViewById(R.id.editText_input);
        final Button btn_1 = (Button) findViewById(R.id.btn_guess);
        Button btn_good = (Button) findViewById(R.id.btn_good);



         btn_1.setEnabled(false);
         btn_1.setClickable(false);
        edittext1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (edittext1.getText().length() == 4) {
                    btn_1.setClickable(true);
                    btn_1.setEnabled(true);
                } else {
                    btn_1.setClickable(false);
                    btn_1.setEnabled(false);
                }
            }
        });
    }
    public int Randomnum()
    {
        int a;
        a=(int)Math.round(Math.random()*9999);
        return a;
    }
     public void Onclickcheck(View v)
    {
      final EditText edittext1=(EditText)findViewById(R.id.editText_input);
       final Button btn_1=(Button)findViewById(R.id.btn_guess);
     // edittext_good=(EditText)findViewById(R.id.editText_user);
      Button btn_good=(Button)findViewById(R.id.btn_good);
       if(Integer.parseInt(edittext1.getText().toString())==5318) {
             setContentView(R.layout.guessgood);
        }
        else if (Integer.parseInt(edittext1.getText().toString())<5318)
       {
           setContentView(R.layout.guessbad);
       }
        else {
           setContentView(R.layout.guessbadbig);
       }


       }

       public void Onclickbad(View v)
       {
           setContentView(R.layout.welcome);
       }

}
