package br.com.digitalhousehouse.recyclerviewlistener.ContatoActivity.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.digitalhousehouse.recyclerviewlistener.ContatoActivity.model.Contato;
import br.com.digitalhousehouse.recyclerviewlistener.R;

public class DetalheContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_contato);

        //Valido se veio alguma coisa na intent
        if (getIntent() != null && getIntent().getExtras() != null) {
            Contato contato = getIntent().getParcelableExtra("CONTATO");

            if (contato != null) {
                //Posso usar o contato para mostrar os dados da tela
            }
        }
    }
}