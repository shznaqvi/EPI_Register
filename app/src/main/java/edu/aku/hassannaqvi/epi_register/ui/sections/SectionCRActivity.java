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
import edu.aku.hassannaqvi.epi_register.models.Form;
import edu.aku.hassannaqvi.epi_register.ui.EndingActivity;

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
        bi.setForm(form);
        if (form == null) form = new Form();
//        bi.setForm(form);
//        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

    }

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