package com.example.gustavo.square_triangular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

class Number{

    public static boolean isSquare(int number) {
            boolean square =false ;

            if (Math.sqrt(number)==Math.ceil(Math.sqrt(number)) ) {
                square = true;
                return square;
            }
        return square ;
    }


    public static boolean isTriangular(int number){
        boolean triangular =false;
        for (int i=1 ;;i++){
        number=number-i;
        if(number==0){
            triangular =true;
            break;
        }
        else if (number <0){
            break;
        }
    }

    return  triangular;
}

}


public class MainActivity extends AppCompatActivity {

    public void isGeo(View view){
        EditText text1 =(EditText)findViewById(R.id.editText);
        int value= Integer.parseInt(text1.getText().toString());

        if(Number.isSquare(value)&&Number.isTriangular(value)) {
            Toast.makeText(MainActivity.this, "It is both", Toast.LENGTH_SHORT).show();
            return;
        }
         if(Number.isSquare(value)) {
            Toast.makeText(MainActivity.this, "It is just square", Toast.LENGTH_SHORT).show();
            return;
         }

        if(Number.isTriangular(value)) {
            Toast.makeText(MainActivity.this, "It is  triangular", Toast.LENGTH_SHORT).show();
            return;
        }
           Toast.makeText(MainActivity.this, "It is none", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

