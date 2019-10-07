package MDGF.edu.tesoem.itics.proyectomdgf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class acerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acer);
    }

    public void sig13(View v) {
        Intent sig13 = new Intent(this, MenuActivity.class);
        startActivity(sig13);
}}
