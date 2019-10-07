package MDGF.edu.tesoem.itics.proyectomdgf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sillaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silla);
    }

    public void sig19(View v) {
        Intent sig19 = new Intent(this, MenuActivity.class);
        startActivity(sig19);
    }}
