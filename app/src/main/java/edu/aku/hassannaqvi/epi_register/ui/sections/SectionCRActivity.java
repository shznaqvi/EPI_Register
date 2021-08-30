package edu.aku.hassannaqvi.epi_register.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.epi_register.R;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts;
import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.database.DatabaseHelper;
import edu.aku.hassannaqvi.epi_register.databinding.ActivitySectionCrBinding;
import edu.aku.hassannaqvi.epi_register.ui.EndingActivity;

import static edu.aku.hassannaqvi.epi_register.core.MainApp.cbCheck;
import static edu.aku.hassannaqvi.epi_register.core.MainApp.form;

public class SectionCRActivity extends AppCompatActivity {
    private static final String TAG = "SectionCRActivity";
    ActivitySectionCrBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cr);
        bi.setCallback(this);
        setupSkips();
/*        bi.setForm(form);
        if (form == null) form = new Form();*/
//        bi.setForm(form);
//        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

    }

    private void setupSkips() {

        cbCheck(bi.crBcgD1, bi.crBcgD2, bi.crBcg);
        cbCheck(bi.crBcgD2, bi.crBcgD1, bi.crBcg);

        cbCheck(bi.crHepB1, bi.crHepB2, bi.crHepB);
        cbCheck(bi.crHepB2, bi.crHepB1, bi.crHepB);

        cbCheck(bi.crOpv0D1, bi.crOpv0D2, bi.crOpv0);
        cbCheck(bi.crOpv0D2, bi.crOpv0D1, bi.crOpv0);

        cbCheck(bi.crOpv1D1, bi.crOpv1D2, bi.crOpv1);
        cbCheck(bi.crOpv1D2, bi.crOpv1D1, bi.crOpv1);

        cbCheck(bi.crOpv2D1, bi.crOpv2D2, bi.crOpv2);
        cbCheck(bi.crOpv2D2, bi.crOpv2D1, bi.crOpv2);

        cbCheck(bi.crOpv3D1, bi.crOpv3D2, bi.crOpv3);
        cbCheck(bi.crOpv3D2, bi.crOpv3D1, bi.crOpv3);

        cbCheck(bi.crRota1D1, bi.crRota1D2, bi.crRota1);
        cbCheck(bi.crRota1D2, bi.crRota1D1, bi.crRota1);

        cbCheck(bi.crRota2D1, bi.crRota2D2, bi.crRota2);
        cbCheck(bi.crRota2D2, bi.crRota2D1, bi.crRota2);

        cbCheck(bi.crIpvD1, bi.crIpvD2, bi.crIpv);
        cbCheck(bi.crIpvD2, bi.crIpvD1, bi.crIpv);

        cbCheck(bi.crPcv1D1, bi.crPcv1D2, bi.crPcv1);
        cbCheck(bi.crPcv1D2, bi.crPcv1D1, bi.crPcv1);

        cbCheck(bi.crPcv2D1, bi.crPcv2D2, bi.crPcv2);
        cbCheck(bi.crPcv2D2, bi.crPcv2D1, bi.crPcv2);

        cbCheck(bi.crPcv3D1, bi.crPcv3D2, bi.crPcv3);
        cbCheck(bi.crPcv3D2, bi.crPcv3D1, bi.crPcv3);

        cbCheck(bi.crPenta1D1, bi.crPenta1D2, bi.crPenta1);
        cbCheck(bi.crPenta1D2, bi.crPenta1D1, bi.crPenta1);

        cbCheck(bi.crPenta2D1, bi.crPenta2D2, bi.crPenta2);
        cbCheck(bi.crPenta2D2, bi.crPenta2D1, bi.crPenta2);

        cbCheck(bi.crPenta3D1, bi.crPenta3D2, bi.crPenta3);
        cbCheck(bi.crPenta3D2, bi.crPenta3D1, bi.crPenta3);

        cbCheck(bi.crMeasles1D1, bi.crMeasles1D2, bi.crMeasles1);
        cbCheck(bi.crMeasles1D2, bi.crMeasles1D1, bi.crMeasles1);

        cbCheck(bi.crMeasles2D1, bi.crMeasles2D2, bi.crMeasles2);
        cbCheck(bi.crMeasles2D2, bi.crMeasles2D1, bi.crMeasles2);

    }


/*    private void cbCheck(CheckBox cb1, CheckBox cb2, EditTextPicker edt) {
        cb1.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                Clear.clearAllFields(edt, false);
                cb2.setChecked(false);
                cb2.setEnabled(false);
            } else {
                Clear.clearAllFields(edt, true);
                cb2.setEnabled(true);
            }
        });
    }*/

    private boolean insertNewRecord() {
        if (!form.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addForm(form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Database Exception... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
        form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, "Updating Database… ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_CR, form.cRtoString());
        } catch (JSONException e) {
            Toast.makeText(this, "Updating Database...\\t " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database… ERROR!", Toast.LENGTH_SHORT).show();
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
            finish();
            startActivity(new Intent(this, SectionCRActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveDraft() {

    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}