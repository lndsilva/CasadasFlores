package br.com.local.casadasflores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Toast.makeText(getApplicationContext(),"Carregou!!!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(
                        Splash_Activity.this, Login_Activity.class
                ));
                finish();

                startActivity(new Intent(getApplicationContext(),Login_Activity.class));


            }
        }, 2000);


    }

    public void meuMetodo(String nome){
        nome = "Senac Largo Treze";
    }


}