package com.example.ushanth94.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void caladd(View v){
        EditText num1text =(EditText)findViewById(R.id.num1text);
        EditText num2text =(EditText)findViewById(R.id.num2text);
        Integer num1 =Integer.parseInt(num1text.getText().toString()) , num2=Integer.parseInt(num2text.getText().toString());
        Integer the_ans = num1 + num2;
        TextView answer = (TextView)findViewById(R.id.ans);
        answer.setText("Answer:"+the_ans.toString());

    }
    public void calsub(View v){
        EditText num1text =(EditText)findViewById(R.id.num1text);
        EditText num2text =(EditText)findViewById(R.id.num2text);
        Integer num1 =Integer.parseInt(num1text.getText().toString()) , num2=Integer.parseInt(num2text.getText().toString());
        Integer the_ans = num1 - num2;
        TextView answer = (TextView)findViewById(R.id.ans);
        answer.setText("Answer:"+the_ans.toString());
    }
    public void caldivide(View v){
        EditText num1text =(EditText)findViewById(R.id.num1text);
        EditText num2text =(EditText)findViewById(R.id.num2text);
        Integer num1 =Integer.parseInt(num1text.getText().toString()) , num2=Integer.parseInt(num2text.getText().toString());
        Integer the_ans = num1 / num2;
        TextView answer = (TextView)findViewById(R.id.ans);
        answer.setText("Answer:"+the_ans.toString());
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
