package MDGF.edu.tesoem.itics.proyectomdgf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class impresoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impresora);
    }

    public void sig120(View v) {
        Intent sig120 = new Intent(this, MenuActivity.class);
        startActivity(sig120);
    }}