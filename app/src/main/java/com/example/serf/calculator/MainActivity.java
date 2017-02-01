package com.example.serf.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String op;
    float  x;
    float  y;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    private TextView Display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b10=(Button)findViewById(R.id.b10);
        b11=(Button)findViewById(R.id.b11);
        b12=(Button)findViewById(R.id.b12);
        b13=(Button)findViewById(R.id.b13);
        b14=(Button)findViewById(R.id.b14);
        b15=(Button)findViewById(R.id.b15);
        b16=(Button)findViewById(R.id.b16);
        Display=(TextView)findViewById(R.id.textView);


    }

    public void num1(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
        Display.setText("1");
        else
        Display.setText(Display.getText()+"1");

    }

    public void num2(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("2");
        else
            Display.setText(Display.getText()+"2");

    }

    public void num3(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("3");
        else
            Display.setText(Display.getText()+"3");

    }

    public void num4(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("4");
        else
            Display.setText(Display.getText()+"4");

    }

    public void num5(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("5");
        else
            Display.setText(Display.getText()+"5");

    }

    public void num6(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("6");
        else
            Display.setText(Display.getText()+"6");

    }

    public void num7(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("7");
        else
            Display.setText(Display.getText()+"7");

    }

    public void num8(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("8");
        else
            Display.setText(Display.getText()+"8");

    }

    public void num9(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("9");
        else
            Display.setText(Display.getText()+"9");

    }

    public void num0(View view){

        if(Display.getText().equals("0")|| Display.getText().equals("+")|| Display.getText().equals("-") || Display.getText().equals("/") || Display.getText().equals("*") )
            Display.setText("0");
        else
            Display.setText(Display.getText()+"0");

    }

    public void sum(View view){
        op = "+";
        if(Display.getText().equals("*")|| Display.getText().equals("+") || Display.getText().equals("-")|| Display.getText().equals("/")){}
        else {
            x = Float.parseFloat((String)Display.getText());
            Display.setText("+");}

    }

    public void res(View view){
        op = "-";
        if(Display.getText().equals("*")|| Display.getText().equals("+") || Display.getText().equals("-")|| Display.getText().equals("/")){}
        else {
            x = Float.parseFloat((String)Display.getText());
            Display.setText("-");}

    }

    public void mul(View view){
        op = "*";
        if(Display.getText().equals("*")|| Display.getText().equals("+") || Display.getText().equals("-")|| Display.getText().equals("/")){}
        else {
        x = Float.parseFloat((String)Display.getText());
        Display.setText("*");}

    }

    public void Div(View view){
        op = "/";
        if(Display.getText().equals("*")|| Display.getText().equals("+") || Display.getText().equals("-")|| Display.getText().equals("/")){}
        else {
            x = Float.parseFloat((String)Display.getText());
            Display.setText("/");}

    }

    public  void delet(View view){
        op="";
        x=0;
        y=0;
        Display.setText("");
    }

    public void operate(View view){
        y = Float.parseFloat((String)Display.getText());
        switch(op){
            case "+":
                x = x + y;
                break;
            case "-":
                x = x - y;
                break;
            case "*":
                x = x * y;
                break;
            case "/":
                if(y!=0)
                  x =  x / y;
                else {
                    x = 0;
                    Toast.makeText(this,"Division entre cero",Toast.LENGTH_SHORT);
                }
                break;
        }
        Display.setText(String.valueOf(x));
    }
}
