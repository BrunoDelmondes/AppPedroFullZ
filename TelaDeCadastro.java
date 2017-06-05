package com.example.delmo.apppedrofull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaDeCadastro extends AppCompatActivity {

    private static String usuario;
    private static String senha;
    private static String lembrete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);

        final EditText edtUsuario = (EditText) findViewById(R.id.edtUsuarioDaTelaCadastro);
        final EditText edtSenha = (EditText) findViewById(R.id.edtSenhaDaTelaCadastro);
        final EditText edtRepetirSenha = (EditText) findViewById(R.id.edtSenhaRepetirSenhaTelaCadastro);
        Button botaoCadastrar = (Button) findViewById(R.id.btCadastrarDaTelaCadastro);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUsuario.getText().toString().isEmpty() || edtSenha.getText().toString().isEmpty() || edtRepetirSenha.getText().toString().isEmpty()) {
                    Toast.makeText(TelaDeCadastro.this,"Preencha tudo.",Toast.LENGTH_SHORT).show();
                } else{LembreteDAO aqui = new LembreteDAO(TelaDeCadastro.this);




                }
            }




        });
    }
}