package edu.aku.hassannaqvi.epi_register.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.epi_register.R;
import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.database.DatabaseHelper;
import edu.aku.hassannaqvi.epi_register.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.epi_register.models.Form;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> districtNames;
    private ArrayList<String> districtCodes;
    private ArrayList<String> cityNames;
    private ArrayList<String> cityCodes;
    private Intent openIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        bi.setCallback(this);
        db = MainApp.appInfo.dbHelper;
        populateSpinner();

        openIntent = new Intent();
        switch (MainApp.idType) {
          /*  case 1:
                bi.btnContinue.setText(R.string.open_hh_form);
                MainApp.form = new Form();
                openIntent = new Intent(this, SectionH1Activity.class);
                break;*/


        }

        bi.h103.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                bi.h104.setText(null);
                bi.hhhead.setText(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.checkHousehold.setEnabled(true);
            }
        });

        bi.h104.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                bi.hhhead.setText(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.checkHousehold.setEnabled(true);
            }
        });

    }

    private void populateSpinner() {

     /*   Collection<Clusters> district = db.getAllDistricts();
        districtNames = new ArrayList<>();
        districtCodes = new ArrayList<>();

        districtNames.add("...");
        districtCodes.add("...");
        for (Clusters c : district) {
            districtNames.add(c.getDistrictName());
            districtCodes.add(c.getDistrictCode());
        }

        // Apply the adapter to the spinner
        bi.h101.setAdapter(new ArrayAdapter(IdentificationActivity.this, R.layout.custom_spinner, districtNames));

        bi.h101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.h102.setAdapter(null);
                bi.h103.setText(null);
                bi.h104.setText(null);
                bi.hhhead.setText(null);
                bi.h103.setEnabled(false);
                bi.h104.setEnabled(false);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.checkHousehold.setEnabled(true);
                if (position == 0) return;
                Collection<Clusters> city = db.getCitiesByDistrict(districtCodes.get(position));
                cityNames = new ArrayList<>();
                cityCodes = new ArrayList<>();
                cityNames.add("...");
                cityCodes.add("...");
                for (Clusters c : city) {
                    cityNames.add(c.getCityName());
                    cityCodes.add(c.getCityCode());
                }

                // Apply the adapter to the spinner
                bi.h102.setAdapter(new ArrayAdapter(IdentificationActivity.this, R.layout.custom_spinner, cityNames));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.h102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.h103.setText(null);
                bi.h104.setText(null);
                bi.hhhead.setText(null);

                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.checkHousehold.setEnabled(true);
                bi.h103.setEnabled(false);
                bi.h104.setEnabled(false);
                if (position == 0) return;
                bi.h103.setEnabled(true);
                bi.h104.setEnabled(true);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
*/
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        switch (MainApp.idType) {
            case 1:
                if (!hhExists())
                    saveDraftForm();
                finish();
                startActivity(openIntent);
                break;
        /*    case 2:
                if (hhExists()) {
                    saveDraftAnthro();
                    finish();
                    startActivity(openIntent);
                } else {
                    Toast.makeText(this, getString(R.string.info_hh_form_not_exist), Toast.LENGTH_LONG).show();
                }
                break;
            case 3:
            case 4:
                if (hhExists()) {
                    saveDraftSamples();
                    finish();
                    startActivity(openIntent);
                } else {
                    Toast.makeText(this, getString(R.string.info_hh_form_not_exist), Toast.LENGTH_LONG).show();
                }
                break;*/

        }


    }


    private void saveDraftForm() {
        MainApp.form = new Form();

        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.form.setH101(districtCodes.get(bi.h101.getSelectedItemPosition()));
        MainApp.form.setH102(cityCodes.get(bi.h102.getSelectedItemPosition()));
        MainApp.form.setH103(bi.h103.getText().toString());
        MainApp.form.setH104(bi.h104.getText().toString());

    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkHousehold(View view) {
      /*  RandomHH hhFound = db.checkHousehold(bi.h103.getText().toString(), bi.h104.getText().toString());
        if (hhFound != null) {
            bi.hhhead.setTextColor(ContextCompat.getColor(this, android.R.color.black));
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);
            bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.gray));
            bi.checkHousehold.setEnabled(false);

            bi.hhhead.setText(hhFound.getHeadhh());
            Toast.makeText(this, hhFound.getHeadhh(), Toast.LENGTH_SHORT).show();


        } else {
            bi.hhhead.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark));
            bi.hhhead.setText(R.string.hh_not_found);
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.gray));
            bi.btnContinue.setEnabled(false);


        }*/
    }

    private boolean hhExists() {

        switch (MainApp.idType) {
            case 1:
                MainApp.form = new Form();
                try {
                    MainApp.form = db.getFormByClusterHHNo(bi.h103.getText().toString(), bi.h104.getText().toString());
                } catch (JSONException e) {
                    Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
                    Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                return MainApp.form != null;

            case 2:
            case 3:
            case 4:
                MainApp.form = new Form();
                try {
                    MainApp.form = db.getFormByClusterHHNo(bi.h103.getText().toString(), bi.h104.getText().toString());
                    // Populate Subject Names for spinner Adapter in Samples Activity.
                    if (MainApp.form != null) {
                        MainApp.subjectNames = new ArrayList<>();
                        MainApp.subjectNames.add("...");

                        // Add woman if exist
                        if (!MainApp.form.getW100Name().equals("")) {
                            MainApp.subjectNames.add(MainApp.form.getW100Name() + " (" + MainApp.form.getW105() + ")");
                            // Add child if both woman and child exist
                            if (!MainApp.form.getC100Name().equals("")) {
                                MainApp.subjectNames.add(MainApp.form.getC100Name());
                            } else {
                                Toast.makeText(this, R.string.child_info_missing, Toast.LENGTH_SHORT).show();
                                return MainApp.form != null;

                            }
                        } else {
                            Toast.makeText(this, R.string.woman_child_info_missing, Toast.LENGTH_SHORT).show();
                            return MainApp.form != null;

                        }
                    } else {
                        return MainApp.form != null;
                    }
             /*       MainApp.samples = new Samples();
                    MainApp.anthro = new Anthro();*/
                    //MainApp.samples = db.getSamplesByClusterHHNo(bi.h103.getText().toString(), bi.h103.getText().toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
                    Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                return MainApp.form != null && MainApp.subjectNames != null;

            default:
                return false;

        }
    }
}