package edu.aku.hassannaqvi.epi_register.ui.sections;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Calendar;

import edu.aku.hassannaqvi.epi_register.R;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts;
import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.database.DatabaseHelper;
import edu.aku.hassannaqvi.epi_register.databinding.ActivitySectionH1Binding;
import edu.aku.hassannaqvi.epi_register.models.Form;
import edu.aku.hassannaqvi.epi_register.ui.EndingActivity;
import edu.aku.hassannaqvi.epi_register.ui.SyncActivity;

import static edu.aku.hassannaqvi.epi_register.core.MainApp.form;


public class SectionH1Activity extends AppCompatActivity {
    private static final String TAG = "SectionH1Activity";
    ActivitySectionH1Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h1);
        bi.setCallback(this);
        if (form == null) form = new Form();
        bi.setForm(form);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        //bi.toolbar.setNavigationIcon(R.drawable.ic_settings);
        db = MainApp.appInfo.dbHelper;

        // IMPORTANT: this is for opening form in Edit Mode
        bi.h204.setEnabled(false);

    }


    public void ageCal(CharSequence s, int i, int i1, int i2) {

/*        if (TextUtils.isEmpty(bi.h203d.getText()) || TextUtils.isEmpty(bi.h203m.getText()) || TextUtils.isEmpty(bi.h203y.getText()))
            return;
        if (bi.h203y.getText().toString().equals("9998")) {
            bi.h204.setText("");
            bi.h204.setEnabled(true);
        } else {
            bi.h204.setText("");
            if (Integer.parseInt(bi.h203y.getText().toString()) >= 1972) {
                bi.h204.setText(String.valueOf(DateUtilsKt.getAgeInYears(Integer.parseInt(bi.h203y.getText().toString()))));
                bi.h204.setEnabled(false);
            }
        }*/

        bi.h204.setText("");
        bi.h204.setEnabled(true);

        // Return VOID if zero length
        if (i == 0) return;
        int dobYear = Integer.parseInt(s.toString());

        int curYear = Calendar.getInstance().get(Calendar.YEAR);

        if (dobYear > 1900 && dobYear < curYear) {
            String ageInYears = String.valueOf(curYear - dobYear);
            Log.d(TAG, getString(R.string.agecal) + ageInYears);
            Toast.makeText(this, getString(R.string.agecal) + ageInYears, Toast.LENGTH_SHORT).show();
            bi.h204.setText(ageInYears);
            bi.h204.setEnabled(false);
        } else bi.h204.setText("00");
        // Single-Line Solution
        //bi.h204.setText(dobYear > 1900 && dobYear < curYear ? String.valueOf(Calendar .getInstance().get(Calendar.YEAR) - Integer.parseInt(s.toString())) : "");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        MenuCompat.setGroupDividerEnabled(menu, true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.action_data_sync:
                if (isNetworkAvailable()) {
                    startActivity(new Intent(this, SyncActivity.class));
                } else
                    Toast.makeText(this, R.string.network_conn_error, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.secH1:
                startActivity(new Intent(this, SectionH1Activity.class));
                return true;

            /*case R.id.formsReportDate -> {
                startActivity(new Intent(this, FormsReportDate.class));
                return true;
            }
            case R.id.lhwsReportDate -> {
                startActivity(new Intent(this, HHIDReportDate.class));
                return true;
            }
            case R.id.formsReportPending -> {
                startActivity(new Intent(this, FormsReportPending.class));
                return true;
            }

            case R.id.formsReportCluster -> {
                startActivity(new Intent(this, FormsReportLHW.class));
                return true;
            }
            case R.id.action_database -> {
                startActivity(new Intent(this, AndroidManager.class));
                return true;
            }*/


            default:
                return super.onOptionsItemSelected(item);
        }

    }


    private void setupSkips() {

    }


    private boolean insertNewRecord() {
        if (!form.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addForm(form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SH1, form.sH1toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        saveDraft();
        if (updateDB()) {
       /*     Intent i;
            if (bi.h111a.isChecked()) {
                i = new Intent(this, SectionH2bActivity.class).putExtra("complete", true);
            } else {
                i = new Intent(this, EndingActivity.class).putExtra("complete", false);
            }
            finish();
            startActivity(i);*/
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    private void saveDraft() {
        //    MainApp.form = new Form();
/*
        form.setUserName(MainApp.user.getUserName());
        form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        form.setDeviceId(MainApp.deviceid);
        form.setAppver(MainApp.versionName + "." + MainApp.versionCode);


       *//* form.setH101(bi.h101.getSelectedItem().toString());
        form.setH102(bi.h102.getSelectedItem().toString());
        form.setH103(bi.h103.getSelectedItem().toString());
        form.setH104(bi.h104.getSelectedItem().toString());*//*

         *//* form.setH106d(bi.h106d.getText().toString().isEmpty() ? "-1" : bi.h106d.getText().toString());
        form.setH106m(bi.h106m.getText().toString().isEmpty() ? "-1" : bi.h106m.getText().toString());
        form.setH106y(bi.h106y.getText().toString().isEmpty() ? "-1" : bi.h106y.getText().toString());
        form.setH107h(bi.h107h.getText().toString().isEmpty() ? "-1" : bi.h107h.getText().toString());
        form.setH107m(bi.h107m.getText().toString().isEmpty() ? "-1" : bi.h107m.getText().toString());*//*

        form.setH108(bi.h106.getText().toString().isEmpty() ? "-1" : bi.h106.getText().toString());
        form.setH108(bi.h107.getText().toString().isEmpty() ? "-1" : bi.h107.getText().toString());
        form.setH108(bi.h108.getText().toString().isEmpty() ? "-1" : bi.h108.getText().toString());
        form.setH109(bi.h109.getText().toString().isEmpty() ? "-1" : bi.h109.getText().toString());

        form.setH110(bi.h110a.isChecked() ? "1"
                : bi.h110b.isChecked() ? "2"
                : "-1");

        form.setH111(bi.h111a.isChecked() ? "1"
                : bi.h111b.isChecked() ? "2"
                : "-1");
        form.setH201(bi.h201.getText().toString().isEmpty() ? "-1" : bi.h201.getText().toString());

        form.setH202(bi.h202a.isChecked() ? "1"
                : bi.h202b.isChecked() ? "2"
                : "-1");

        form.setH203d(bi.h203d.getText().toString().isEmpty() ? "-1" : bi.h203d.getText().toString());
        form.setH203m(bi.h203m.getText().toString().isEmpty() ? "-1" : bi.h203m.getText().toString());
        form.setH203y(bi.h203y.getText().toString().isEmpty() ? "-1" : bi.h203y.getText().toString());

        form.setH204(bi.h204.getText().toString().isEmpty() ? "-1" : bi.h204.getText().toString());

        form.setH205(bi.h205a.isChecked() ? "1"
                : bi.h205b.isChecked() ? "2"
                : bi.h205c.isChecked() ? "3"
                : bi.h205d.isChecked() ? "4"
                : bi.h205e.isChecked() ? "5"
                : "-1");

        form.setH206(bi.h206a.isChecked() ? "1"
                : bi.h206b.isChecked() ? "2"
                : bi.h206c.isChecked() ? "3"
                : bi.h206d.isChecked() ? "4"
                : bi.h206e.isChecked() ? "5"
                : bi.h206f.isChecked() ? "6"
                : bi.h206g.isChecked() ? "7"
                : bi.h206h.isChecked() ? "8"
                : bi.h206i.isChecked() ? "9"
                : bi.h206j.isChecked() ? "10"
                : bi.h20698.isChecked() ? "98"
                : "-1");

        form.setH207(bi.h207a.isChecked() ? "1"
                : bi.h207b.isChecked() ? "2"
                : bi.h207c.isChecked() ? "3"
                : bi.h207d.isChecked() ? "4"
                : bi.h207e.isChecked() ? "5"
                : bi.h207f.isChecked() ? "6"
                : bi.h207g.isChecked() ? "7"
                : bi.h207h.isChecked() ? "8"
                : bi.h207i.isChecked() ? "9"
                : bi.h20798.isChecked() ? "98"
                : "-1");

        form.setH208(bi.h208a.isChecked() ? "1"
                : bi.h208b.isChecked() ? "2"
                : "-1");*/
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    /*@Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }*/

    private boolean isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            // connected to the internet
            switch (activeNetwork.getType()) {
                case ConnectivityManager.TYPE_WIFI:
                    // connected to wifi
                    return true;
                case ConnectivityManager.TYPE_MOBILE:
                    // connected to mobile data
                    break;
                default:
                    break;
            }
        } else {
            // not connected to the internet
        }
        return false;
    }
}