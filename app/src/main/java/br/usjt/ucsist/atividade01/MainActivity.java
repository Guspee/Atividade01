package br.usjt.ucsist.atividade01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void insiraNome(View view){
        EditText insiraNome = findViewById(R.id.insiraNome);
        String nome = insiraNome.getText().toString();
        Intent intent = new Intent(this, pagina02.class);
        intent.putExtra("msg", nome);
        startActivity(intent);
    }
}