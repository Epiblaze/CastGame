package pts3.castgame.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pts3.castgame.R;

public class ChoixPersonnageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_perso);
        getIntent();
    }

    public void choisirCarte(View view) {
        Intent intent = new Intent(this, ChoixMethodeActivity.class);
        startActivity(intent);
    }

    public void voirMap(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}