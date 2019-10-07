package MDGF.edu.tesoem.itics.proyectomdgf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class macActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac);
    }
    public void sig12(View v) {
        Intent sig12 = new Intent(this, MenuActivity.class);
        startActivity(sig12);
    }
}
