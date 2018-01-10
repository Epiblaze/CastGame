package pts3.castgame.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pts3.castgame.R;
import pts3.castgame.fragments.CardFragment;
import pts3.castgame.fragments.GameTypeFragment;
import pts3.castgame.fragments.AnswerCompanionFragment;
import pts3.castgame.fragments.ResultatPapierFragment;
import pts3.castgame.fragments.TemplateFragment;
import pts3.castgame.models.lien.FacadeMoteur;

public class MainActivity extends AppCompatActivity {

    Intent intentMap;
    FacadeMoteur facade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentMap = new Intent(this, MapActivity.class);
        facade = new FacadeMoteur();
    }

    public FacadeMoteur getFacade() {
        return facade;
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // On remplace l'ancien fragment par le nouveau.
        transaction.add(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        // On commit la transaction.

        transaction.commit();
    }

    public void selectEasyMode(View view) {
        GameTypeFragment newFragment = new GameTypeFragment();
        setFragment(newFragment);
        intentMap.putExtra("isHard", false);
    }

    public void selectHardMode(View view) {
        GameTypeFragment newFragment = new GameTypeFragment();
        setFragment(newFragment);
        intentMap.putExtra("isHard", true);
    }

    public void selectCompanionMode(View view) {
        TemplateFragment newFragment = new TemplateFragment();
        setFragment(newFragment);
    }

    public void selectCompanionMode() {
        TemplateFragment newFragment = new TemplateFragment();
        setFragment(newFragment);
    }

    public void choisirReponsePapier() {
        ResultatPapierFragment newFragment = new ResultatPapierFragment();
        setFragment(newFragment);
    }

    /**
     * Sélectionne une carte, tant qu'il reste des cartes à sélectionner (voir dans le fragment associé).
     */
    public void selectCard() {
        CardFragment newFragment = new CardFragment();
        setFragment(newFragment);
    }

    public void seleectMethod(View view) {
        AnswerCompanionFragment newFragment = new AnswerCompanionFragment();
        setFragment(newFragment);
    }

    public void choisirReponse(View view) {
        TemplateFragment newFragment = new TemplateFragment();
        setFragment(newFragment);
    }

    public void showMap(View view) {
        startActivity(intentMap);
    }

}
