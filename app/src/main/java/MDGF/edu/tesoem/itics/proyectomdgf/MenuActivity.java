package MDGF.edu.tesoem.itics.proyectomdgf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void sig3(View v) {
        Intent sig3 = new Intent(this, hpActivity.class);
        startActivity(sig3);
    }

    public void sig4(View v) {
        Intent sig4 = new Intent(this, macActivity.class);
        startActivity(sig4);
    }


    public void sig5(View v) {
        Intent sig5 = new Intent(this, acerActivity.class);
        startActivity(sig5);

    }
    public void sig6(View v) {
        Intent sig6 = new Intent(this, huaweiActivity.class);
        startActivity(sig6);

    }
    public void sig7(View v) {
        Intent sig7 = new Intent(this, dellActivity.class);
        startActivity(sig7);

    }
    public void sig8(View v) {
        Intent sig8 = new Intent(this, lenovoActivity.class);
        startActivity(sig8);

    }
    public void sig9(View v) {
        Intent sig9 = new Intent(this, mouseActivity.class);
        startActivity(sig9);

    }

    public void sig10(View v) {
        Intent sig10 = new Intent(this, mouseActivity.class);
        startActivity(sig10);

    }
    public void sig11(View v) {
        Intent sig11 = new Intent(this, tecladoActivity.class);
        startActivity(sig11);

    }
    public void sig12(View v) {
        Intent sig12 = new Intent(this, sillaActivity.class);
        startActivity(sig12);

    }
    public void sig13(View v) {
        Intent sig13 = new Intent(this, impresoraActivity.class);
        startActivity(sig13);

    }
}