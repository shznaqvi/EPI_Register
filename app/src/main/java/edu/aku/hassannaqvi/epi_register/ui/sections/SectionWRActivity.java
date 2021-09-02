package edu.aku.hassannaqvi.epi_register.ui.sections;

import static edu.aku.hassannaqvi.epi_register.core.MainApp.cbCheck;
import static edu.aku.hassannaqvi.epi_register.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.epi_register.R;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts;
import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.database.DatabaseHelper;
import edu.aku.hassannaqvi.epi_register.databinding.ActivitySectionWrBinding;
import edu.aku.hassannaqvi.epi_register.models.Form;
import edu.aku.hassannaqvi.epi_register.ui.EndingActivity;

public class SectionWRActivity extends AppCompatActivity {
    private static final String TAG = "SectionWRActivity";
    ActivitySectionWrBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppThemeEnglish1);
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_wr);
        bi.setCallback(this);
        setupSkips();
       /* bi.setForm(form);
        if (form == null) form = new Form();*/
//        bi.setForm(form);
//        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
    }

    private void setupSkips() {
        cbCheck(bi.wrTtd1ds1, bi.wrTtd1ds2, bi.wrTtd1);
        cbCheck(bi.wrTtd1ds2, bi.wrTtd1ds1, bi.wrTtd1);

        cbCheck(bi.wrTtd2ds1, bi.wrTtd2ds2, bi.wrTtd2);
        cbCheck(bi.wrTtd2ds2, bi.wrTtd2ds1, bi.wrTtd2);

        cbCheck(bi.wrTtd3ds1, bi.wrTtd3ds2, bi.wrTtd3);
        cbCheck(bi.wrTtd3ds2, bi.wrTtd3ds1, bi.wrTtd3);

        cbCheck(bi.wrTtd4ds1, bi.wrTtd4ds2, bi.wrTtd4);
        cbCheck(bi.wrTtd4ds2, bi.wrTtd4ds1, bi.wrTtd4);

        cbCheck(bi.wrTtd5ds1, bi.wrTtd5ds2, bi.wrTtd5);
        cbCheck(bi.wrTtd5ds2, bi.wrTtd5ds1, bi.wrTtd5);
    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        long updcount = db.addForm(form);
        form.setId(String.valueOf(updcount));
        form.setUid(form.getDeviceId() + form.getId());
        long count = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
        if (count > 0) {
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_WR, form.getwR());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_ISTATUS, "1");
            return true;
        } else {
            Toast.makeText(this, "Updating Database… ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        try {
            saveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionWRActivity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveDraft() throws JSONException {

        form = new Form();
        form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        form.setUserName(MainApp.user.getUserName());
        form.setDeviceId(MainApp.appInfo.getDeviceID());
        form.setDeviceTag(MainApp.appInfo.getTagName());
        form.setAppver(MainApp.appInfo.getAppVersion());

        form.setWr_dmu_register(bi.wrDmuRegister.getText().toString());

        form.setWr_reg_number(bi.wrRegNumber.getText().toString());

        form.setWr_page_number(bi.wrPageNumber.getText().toString());

        form.setWr_rsno(bi.wrRsno.getText().toString());

        form.setWr_card_number(bi.wrCardNumber.getText().toString());

        form.setWr_women_name(bi.wrWomenName.getText().toString());

        form.setWr_husband_name(bi.wrHusbandName.getText().toString());

        form.setWr_age_years(bi.wrAgeYears.getText().toString());

        form.setWr_address(bi.wrAddress.getText().toString());

        form.setWr_address_previous(bi.wrAddressPrevious.isChecked() ? "1" : "-1");

        form.setWr_phone(bi.wrPhone.getText().toString());

        form.setWr_ttd1(bi.wrTtd1.getText().toString());

        form.setWr_ttd1ds1(bi.wrTtd1ds1.isChecked() ? "1" : "-1");

        form.setWr_ttd1ds2(bi.wrTtd1ds2.isChecked() ? "2" : "-1");

        form.setWr_ttd2(bi.wrTtd2.getText().toString());

        form.setWr_ttd2ds1(bi.wrTtd2ds1.isChecked() ? "1" : "-1");

        form.setWr_ttd2ds2(bi.wrTtd2ds2.isChecked() ? "2" : "-1");

        form.setWr_ttd3(bi.wrTtd3.getText().toString());

        form.setWr_ttd3ds1(bi.wrTtd3ds1.isChecked() ? "1" : "-1");

        form.setWr_ttd3ds2(bi.wrTtd3ds2.isChecked() ? "2" : "-1");

        form.setWr_ttd4(bi.wrTtd4.getText().toString());

        form.setWr_ttd4ds1(bi.wrTtd4ds1.isChecked() ? "1" : "-1");

        form.setWr_ttd4ds2(bi.wrTtd4ds2.isChecked() ? "2" : "-1");

        form.setWr_ttd5(bi.wrTtd5.getText().toString());

        form.setWr_ttd5ds1(bi.wrTtd5ds1.isChecked() ? "1" : "-1");

        form.setWr_ttd5ds2(bi.wrTtd5ds2.isChecked() ? "2" : "-1");

        form.setWr_comments(bi.wrComments.getText().toString());

        form.setwR(form.wRtoString());
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}