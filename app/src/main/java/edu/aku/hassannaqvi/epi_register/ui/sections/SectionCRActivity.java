package edu.aku.hassannaqvi.epi_register.ui.sections;

import static edu.aku.hassannaqvi.epi_register.core.MainApp.cbCheck;
import static edu.aku.hassannaqvi.epi_register.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.epi_register.R;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts;
import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.database.DatabaseHelper;
import edu.aku.hassannaqvi.epi_register.databinding.ActivitySectionCrBinding;
import edu.aku.hassannaqvi.epi_register.models.Form;
import edu.aku.hassannaqvi.epi_register.ui.EndingActivity;

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

        bi.crAddressPrevious.setOnCheckedChangeListener((compoundButton, b) -> {
            Clear.clearAllFields(bi.crAddress, !b);
        });

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

    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        long updcount = db.addForm(form);
        form.setId(String.valueOf(updcount));
        updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_CR, form.getcR());
        db.updatesFormColumn(TableContracts.FormsTable.COLUMN_ISTATUS, "1");
        if (updcount > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            long count = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
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
            startActivity(new Intent(this, SectionCRActivity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveDraft() throws JSONException {

        form = new Form();

        form.setCr_dmu_register(bi.crDmuRegister.getText().toString());

        form.setCr_reg_number(bi.crRegNumber.getText().toString());

        form.setCr_page_number(bi.crPageNumber.getText().toString());

        form.setCr_rsno(bi.crRsno.getText().toString());

        form.setCr_card_number(bi.crCardNumber.getText().toString());

        form.setCr_child_name(bi.crChildName.getText().toString());

        form.setCr_father_name(bi.crFatherName.getText().toString());

        form.setCr_age_months(bi.crAgeMonths.getText().toString());

        form.setCr_age_years(bi.crAgeYears.getText().toString());

        form.setCr_age_days(bi.crAgeDays.getText().toString());

        form.setCr_gender(bi.crGender1.isChecked() ? "1"
                : bi.crGender2.isChecked() ? "2"
                : "-1");

        form.setCr_address(bi.crAddressPrevious.getText().toString());

        form.setCr_phone(bi.crPhone.getText().toString());

        form.setCr_bcg(bi.crBcg.getText().toString());

        form.setCr_bcg_d1(bi.crBcgD1.isChecked() ? "" : "-1");

        form.setCr_bcg_d2(bi.crBcgD2.isChecked() ? "" : "-1");

        form.setCr_hep_b(bi.crHepB.getText().toString());

        form.setCr_hep_b1(bi.crHepB1.isChecked() ? "1" : "-1");

        form.setCr_hep_b2(bi.crHepB2.isChecked() ? "2" : "-1");

        form.setCr_opv0(bi.crOpv0.getText().toString());

        form.setCr_opv0_d1(bi.crOpv0D1.isChecked() ? "1" : "-1");

        form.setCr_opv0_d2(bi.crOpv0D2.isChecked() ? "2" : "-1");

        form.setCr_opv1(bi.crOpv1.getText().toString());

        form.setCr_opv1_d1(bi.crOpv1D1.isChecked() ? "1" : "-1");

        form.setCr_opv1_d2(bi.crOpv1D2.isChecked() ? "2" : "-1");

        form.setCr_opv2(bi.crOpv2.getText().toString());

        form.setCr_opv2_d1(bi.crOpv2D1.isChecked() ? "1" : "-1");

        form.setCr_opv2_d2(bi.crOpv2D2.isChecked() ? "2" : "-1");

        form.setCr_opv3(bi.crOpv3.getText().toString());

        form.setCr_opv3_d1(bi.crOpv3D1.isChecked() ? "1" : "-1");

        form.setCr_opv3_d2(bi.crOpv3D2.isChecked() ? "2" : "-1");

        form.setCr_rota1(bi.crRota1.getText().toString());

        form.setCr_rota1_d1(bi.crRota1D1.isChecked() ? "1" : "-1");

        form.setCr_rota1_d2(bi.crRota1D2.isChecked() ? "2" : "-1");

        form.setCr_rota2(bi.crRota2.getText().toString());

        form.setCr_rota2_d1(bi.crRota2D1.isChecked() ? "1" : "-1");

        form.setCr_rota2_d2(bi.crRota2D2.isChecked() ? "2" : "-1");

        form.setCr_ipv(bi.crIpv.getText().toString());

        form.setCr_ipv_d1(bi.crIpvD1.isChecked() ? "1" : "-1");

        form.setCr_ipv_d2(bi.crIpvD2.isChecked() ? "2" : "-1");

        form.setCr_pcv1(bi.crPcv1.getText().toString());

        form.setCr_pcv1_d1(bi.crPcv1D1.isChecked() ? "1" : "-1");

        form.setCr_pcv1_d2(bi.crPcv1D2.isChecked() ? "2" : "-1");

        form.setCr_pcv2(bi.crPcv2.getText().toString());

        form.setCr_pcv2_d1(bi.crPcv2D1.isChecked() ? "1" : "-1");

        form.setCr_pcv2_d1(bi.crPcv2D2.isChecked() ? "2" : "-1");

        form.setCr_pcv3(bi.crPcv3.getText().toString());

        form.setCr_pcv3_d1(bi.crPcv3D1.isChecked() ? "1" : "-1");

        form.setCr_pcv3_d2(bi.crPcv3D2.isChecked() ? "2" : "-1");

        form.setCr_penta1(bi.crPenta1.getText().toString());

        form.setCr_penta1_d1(bi.crPenta1D1.isChecked() ? "1" : "-1");

        form.setCr_penta1_d2(bi.crPenta1D2.isChecked() ? "2" : "-1");

        form.setCr_penta2(bi.crPenta2.getText().toString());

        form.setCr_penta2_d1(bi.crPenta2D1.isChecked() ? "1" : "-1");

        form.setCr_penta2_d2(bi.crPenta2D2.isChecked() ? "2" : "-1");

        form.setCr_penta3(bi.crPenta3.getText().toString());

        form.setCr_penta3_d1(bi.crPenta3D1.isChecked() ? "1" : "-1");

        form.setCr_penta3_d2(bi.crPenta3D2.isChecked() ? "2" : "-1");

        form.setCr_measles1(bi.crMeasles1.getText().toString());

        form.setCr_measles1_d1(bi.crMeasles1D1.isChecked() ? "1" : "-1");

        form.setCr_measles1_d2(bi.crMeasles1D2.isChecked() ? "2" : "-1");

        form.setCr_measles2(bi.crMeasles2.getText().toString());

        form.setCr_measles2_d1(bi.crMeasles2D1.isChecked() ? "1" : "-1");

        form.setCr_measles2_d2(bi.crMeasles2D2.isChecked() ? "2" : "-1");

        form.setCr_birth_status(bi.crBirthStatus1.isChecked() ? "1"
                : bi.crBirthStatus2.isChecked() ? "2"
                : "-1");

        form.setCr_comments(bi.crComments.getText().toString());

        form.setcR(form.cRtoString());

    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}