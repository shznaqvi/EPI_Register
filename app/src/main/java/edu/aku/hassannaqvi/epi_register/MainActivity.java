package edu.aku.hassannaqvi.epi_register;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.epi_register.models.Form;
import edu.aku.hassannaqvi.epi_register.ui.sections.SectionCRActivity;
import edu.aku.hassannaqvi.epi_register.ui.sections.SectionWRActivity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.username.setText("Welcome, " + MainApp.user.getFullname() + "!");
    }

    public void sectionPress(View view) {

        switch (view.getId()) {
            case R.id.openChildForm:
                MainApp.idType = 1;
                break;
            case R.id.openWomenForm:
                MainApp.idType = 2;
                break;

            case R.id.updateBlood:
                MainApp.idType = 3;
                break;

            case R.id.updateStool:
                MainApp.idType = 4;
                break;
            default:
                MainApp.idType = 0;

        }


        switch (view.getId()) {

            case R.id.openChildForm:
            case R.id.openWomenForm:
            case R.id.updateBlood:

            case R.id.seccr:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCRActivity.class));
                break;

            case R.id.secwr:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionWRActivity.class));
                break;
        }
    }
}