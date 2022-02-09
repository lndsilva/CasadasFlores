package br.com.local.casadasflores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);


        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Senac Largo Treze");

        pessoa.getNome();
    }
}