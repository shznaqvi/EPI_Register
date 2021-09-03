package edu.aku.hassannaqvi.epi_register.ui.sections;

import static edu.aku.hassannaqvi.epi_register.core.MainApp.cbCheck;
import static edu.aku.hassannaqvi.epi_register.core.MainApp.cr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.epi_register.MainActivity;
import edu.aku.hassannaqvi.epi_register.R;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts;
import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.database.DatabaseHelper;
import edu.aku.hassannaqvi.epi_register.databinding.ActivitySectionCrBinding;
import edu.aku.hassannaqvi.epi_register.models.FormCR;

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
       setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        String dmuReg = getIntent().getStringExtra("dmureg");
        String reg = getIntent().getStringExtra("reg");
        bi.crDmuRegister.setText(dmuReg);
        bi.crRegNumber.setText(reg);

    }


    private void setupSkips() {

        bi.crAddressPrevious.setOnCheckedChangeListener((compoundButton, b) -> {
            Clear.clearAllFields(bi.crAddress, !b);
        });

        bi.crPhoneNa.setOnCheckedChangeListener((compoundButton, b) -> {
            Clear.clearAllFields(bi.crPhone, !b);
        });

        cbCheck(bi.crBcgD1, bi.crBcgD2, bi.crBcgNa, bi.crBcg);
        cbCheck(bi.crBcgD2, bi.crBcgD1, bi.crBcgNa, bi.crBcg);
        cbCheck(bi.crBcgNa, bi.crBcgD2, bi.crBcgD1, bi.crBcg);

        cbCheck(bi.crHepB1, bi.crHepB2, bi.crHepBna, bi.crHepB);
        cbCheck(bi.crHepB2, bi.crHepB1, bi.crHepBna, bi.crHepB);
        cbCheck(bi.crHepBna, bi.crHepB2, bi.crHepB1, bi.crHepB);

        cbCheck(bi.crOpv0D1, bi.crOpv0D2, bi.crOpv0Na, bi.crOpv0);
        cbCheck(bi.crOpv0D2, bi.crOpv0D1, bi.crOpv0Na, bi.crOpv0);
        cbCheck(bi.crOpv0Na, bi.crOpv0D2, bi.crOpv0D1, bi.crOpv0);

        cbCheck(bi.crOpv1D1, bi.crOpv1D2, bi.crOpv1Na, bi.crOpv1);
        cbCheck(bi.crOpv1D2, bi.crOpv1D1, bi.crOpv1Na, bi.crOpv1);
        cbCheck(bi.crOpv1Na, bi.crOpv1D2, bi.crOpv1D1, bi.crOpv1);

        cbCheck(bi.crOpv2D1, bi.crOpv2D2, bi.crOpv2Na, bi.crOpv2);
        cbCheck(bi.crOpv2D2, bi.crOpv2D1, bi.crOpv2Na, bi.crOpv2);
        cbCheck(bi.crOpv2Na, bi.crOpv2D2, bi.crOpv2D1, bi.crOpv2);

        cbCheck(bi.crOpv3D1, bi.crOpv3D2, bi.crOpv3Na, bi.crOpv3);
        cbCheck(bi.crOpv3D2, bi.crOpv3D1, bi.crOpv3Na, bi.crOpv3);
        cbCheck(bi.crOpv3Na, bi.crOpv3D2, bi.crOpv3D1, bi.crOpv3);

        cbCheck(bi.crRota1D1, bi.crRota1D2, bi.crRota1Na, bi.crRota1);
        cbCheck(bi.crRota1D2, bi.crRota1D1, bi.crRota1Na, bi.crRota1);
        cbCheck(bi.crRota1Na, bi.crRota1D2, bi.crRota1D1, bi.crRota1);

        cbCheck(bi.crRota2D1, bi.crRota2D2, bi.crRota2Na, bi.crRota2);
        cbCheck(bi.crRota2D2, bi.crRota2D1, bi.crRota2Na, bi.crRota2);
        cbCheck(bi.crRota2Na, bi.crRota2D2, bi.crRota2D1, bi.crRota2);

        cbCheck(bi.crIpvD1, bi.crIpvD2, bi.crIpvNa, bi.crIpv);
        cbCheck(bi.crIpvD2, bi.crIpvD1, bi.crIpvNa, bi.crIpv);
        cbCheck(bi.crIpvNa, bi.crIpvD2, bi.crIpvD1, bi.crIpv);

        cbCheck(bi.crPcv1D1, bi.crPcv1D2, bi.crPcv1Na, bi.crPcv1);
        cbCheck(bi.crPcv1D2, bi.crPcv1D1, bi.crPcv1Na, bi.crPcv1);
        cbCheck(bi.crPcv1Na, bi.crPcv1D2, bi.crPcv1D1, bi.crPcv1);

        cbCheck(bi.crPcv2D1, bi.crPcv2D2, bi.crPcv2Na, bi.crPcv2);
        cbCheck(bi.crPcv2D2, bi.crPcv2D1, bi.crPcv2Na, bi.crPcv2);
        cbCheck(bi.crPcv2Na, bi.crPcv2D2, bi.crPcv2D1, bi.crPcv2);

        cbCheck(bi.crPcv3D1, bi.crPcv3D2, bi.crPcv3Na, bi.crPcv3);
        cbCheck(bi.crPcv3D2, bi.crPcv3D1, bi.crPcv3Na, bi.crPcv3);
        cbCheck(bi.crPcv3Na, bi.crPcv3D2, bi.crPcv3D1, bi.crPcv3);

        cbCheck(bi.crPenta1D1, bi.crPenta1D2, bi.crPenta1Na, bi.crPenta1);
        cbCheck(bi.crPenta1D2, bi.crPenta1D1, bi.crPenta1Na, bi.crPenta1);
        cbCheck(bi.crPenta1Na, bi.crPenta1D2, bi.crPenta1D1, bi.crPenta1);

        cbCheck(bi.crPenta2D1, bi.crPenta2D2, bi.crPenta2Na, bi.crPenta2);
        cbCheck(bi.crPenta2D2, bi.crPenta2D1, bi.crPenta2Na, bi.crPenta2);
        cbCheck(bi.crPenta2Na, bi.crPenta2D2, bi.crPenta2D1, bi.crPenta2);

        cbCheck(bi.crPenta3D1, bi.crPenta3D2, bi.crPenta3Na, bi.crPenta3);
        cbCheck(bi.crPenta3D2, bi.crPenta3D1, bi.crPenta3Na, bi.crPenta3);
        cbCheck(bi.crPenta3Na, bi.crPenta3D2, bi.crPenta3D1, bi.crPenta3);

        cbCheck(bi.crMeasles1D1, bi.crMeasles1D2, bi.crMeasles1Na, bi.crMeasles1);
        cbCheck(bi.crMeasles1D2, bi.crMeasles1D1, bi.crMeasles1Na, bi.crMeasles1);
        cbCheck(bi.crMeasles1Na, bi.crMeasles1D2, bi.crMeasles1D1, bi.crMeasles1);

        cbCheck(bi.crMeasles2D1, bi.crMeasles2D2, bi.crMeasles2Na, bi.crMeasles2);
        cbCheck(bi.crMeasles2D2, bi.crMeasles2D1, bi.crMeasles2Na, bi.crMeasles2);
        cbCheck(bi.crMeasles2Na, bi.crMeasles2D2, bi.crMeasles2D1, bi.crMeasles2);

    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        long updcount = db.addCR(cr);
        cr.setId(String.valueOf(updcount));
        cr.setUid(cr.getDeviceId() + cr.getId());
        long count = db.updateCrColumn(TableContracts.FormCRTable.COLUMN_UID, cr.getUid());
        if (count > 0) {
            db.updateCrColumn(TableContracts.FormCRTable.COLUMN_CR, cr.getcR());
            db.updateCrColumn(TableContracts.FormCRTable.COLUMN_ISTATUS, "1");
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
            startActivity(new Intent(this, SectionCRActivity.class)
                    .putExtra("dmureg", bi.crDmuRegister.getText().toString())
                    .putExtra("reg", bi.crRegNumber.getText().toString()));
        } else Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() throws JSONException {

        cr = new FormCR();
        cr.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        cr.setUserName(MainApp.user.getUserName());
        cr.setDeviceId(MainApp.appInfo.getDeviceID());
        cr.setDeviceTag(MainApp.appInfo.getTagName());
        cr.setAppver(MainApp.appInfo.getAppVersion());

        cr.setCr_dmu_register(bi.crDmuRegister.getText().toString());

        cr.setCr_reg_number(bi.crRegNumber.getText().toString());

        cr.setCr_page_number(bi.crPageNumber.getText().toString());

        cr.setCr_rsno(bi.crRsno.getText().toString());

        cr.setCr_card_number(bi.crCardNumber.getText().toString());

        cr.setCr_child_name(bi.crChildName.getText().toString());

        cr.setCr_father_name(bi.crFatherName.getText().toString());

        cr.setCr_age_months(bi.crAgeMonths.getText().toString());

        cr.setCr_age_years(bi.crAgeYears.getText().toString());

        cr.setCr_age_days(bi.crAgeDays.getText().toString());

        cr.setCr_gender(bi.crGender1.isChecked() ? "1"
                : bi.crGender2.isChecked() ? "2"
                : "-1");

        cr.setCr_address(bi.crAddress.getText().toString());

        cr.setCr_address(bi.crAddressPrevious.isChecked() ? "1" : "-1");

        cr.setCr_phone(bi.crPhone.getText().toString());

        cr.setCr_phone_na(bi.crPhoneNa.isChecked() ? "1" : "-1");

        cr.setCr_bcg(bi.crBcg.getText().toString());

        cr.setCr_bcg_d1(bi.crBcgD1.isChecked() ? "1" : "-1");

        cr.setCr_bcg_d2(bi.crBcgD2.isChecked() ? "2" : "-1");

        cr.setCr_bcg_na(bi.crBcgNa.isChecked() ? "97" : "-1");

        cr.setCr_hep_b(bi.crHepB.getText().toString());

        cr.setCr_hep_b1(bi.crHepB1.isChecked() ? "1" : "-1");

        cr.setCr_hep_b2(bi.crHepB2.isChecked() ? "2" : "-1");

        cr.setCr_hep_bna(bi.crHepBna.isChecked() ? "97" : "-1");

        cr.setCr_opv0(bi.crOpv0.getText().toString());

        cr.setCr_opv0_d1(bi.crOpv0D1.isChecked() ? "1" : "-1");

        cr.setCr_opv0_d2(bi.crOpv0D2.isChecked() ? "2" : "-1");

        cr.setCr_opv0_na(bi.crOpv0Na.isChecked() ? "97" : "-1");

        cr.setCr_opv1(bi.crOpv1.getText().toString());

        cr.setCr_opv1_d1(bi.crOpv1D1.isChecked() ? "1" : "-1");

        cr.setCr_opv1_d2(bi.crOpv1D2.isChecked() ? "2" : "-1");

        cr.setCr_opv1_na(bi.crOpv1Na.isChecked() ? "97" : "-1");

        cr.setCr_opv2(bi.crOpv2.getText().toString());

        cr.setCr_opv2_d1(bi.crOpv2D1.isChecked() ? "1" : "-1");

        cr.setCr_opv2_d2(bi.crOpv2D2.isChecked() ? "2" : "-1");

        cr.setCr_opv2_na(bi.crOpv2Na.isChecked() ? "97" : "-1");

        cr.setCr_opv3(bi.crOpv3.getText().toString());

        cr.setCr_opv3_d1(bi.crOpv3D1.isChecked() ? "1" : "-1");

        cr.setCr_opv3_d2(bi.crOpv3D2.isChecked() ? "2" : "-1");

        cr.setCr_opv3_na(bi.crOpv3Na.isChecked() ? "97" : "-1");

        cr.setCr_rota1(bi.crRota1.getText().toString());

        cr.setCr_rota1_d1(bi.crRota1D1.isChecked() ? "1" : "-1");

        cr.setCr_rota1_d2(bi.crRota1D2.isChecked() ? "2" : "-1");

        cr.setCr_rota1_na(bi.crRota1Na.isChecked() ? "97" : "-1");

        cr.setCr_rota2(bi.crRota2.getText().toString());

        cr.setCr_rota2_d1(bi.crRota2D1.isChecked() ? "1" : "-1");

        cr.setCr_rota2_d2(bi.crRota2D2.isChecked() ? "2" : "-1");

        cr.setCr_rota2_na(bi.crRota2Na.isChecked() ? "97" : "-1");

        cr.setCr_ipv(bi.crIpv.getText().toString());

        cr.setCr_ipv_d1(bi.crIpvD1.isChecked() ? "1" : "-1");

        cr.setCr_ipv_d2(bi.crIpvD2.isChecked() ? "2" : "-1");

        cr.setCr_ipv_na(bi.crIpvNa.isChecked() ? "97" : "-1");

        cr.setCr_pcv1(bi.crPcv1.getText().toString());

        cr.setCr_pcv1_d1(bi.crPcv1D1.isChecked() ? "1" : "-1");

        cr.setCr_pcv1_d2(bi.crPcv1D2.isChecked() ? "2" : "-1");

        cr.setCr_pcv1_na(bi.crPcv1Na.isChecked() ? "97" : "-1");

        cr.setCr_pcv2(bi.crPcv2.getText().toString());

        cr.setCr_pcv2_d1(bi.crPcv2D1.isChecked() ? "1" : "-1");

        cr.setCr_pcv2_d1(bi.crPcv2D2.isChecked() ? "2" : "-1");

        cr.setCr_pcv2_na(bi.crPcv2Na.isChecked() ? "97" : "-1");

        cr.setCr_pcv3(bi.crPcv3.getText().toString());

        cr.setCr_pcv3_d1(bi.crPcv3D1.isChecked() ? "1" : "-1");

        cr.setCr_pcv3_d2(bi.crPcv3D2.isChecked() ? "2" : "-1");

        cr.setCr_pcv3_na(bi.crPcv3Na.isChecked() ? "97" : "-1");

        cr.setCr_penta1(bi.crPenta1.getText().toString());

        cr.setCr_penta1_d1(bi.crPenta1D1.isChecked() ? "1" : "-1");

        cr.setCr_penta1_d2(bi.crPenta1D2.isChecked() ? "2" : "-1");

        cr.setCr_penta1_na(bi.crPenta1Na.isChecked() ? "97" : "-1");

        cr.setCr_penta2(bi.crPenta2.getText().toString());

        cr.setCr_penta2_d1(bi.crPenta2D1.isChecked() ? "1" : "-1");

        cr.setCr_penta2_d2(bi.crPenta2D2.isChecked() ? "2" : "-1");

        cr.setCr_penta2_na(bi.crPenta2Na.isChecked() ? "97" : "-1");

        cr.setCr_penta3(bi.crPenta3.getText().toString());

        cr.setCr_penta3_d1(bi.crPenta3D1.isChecked() ? "1" : "-1");

        cr.setCr_penta3_d2(bi.crPenta3D2.isChecked() ? "2" : "-1");

        cr.setCr_penta3_na(bi.crPenta3Na.isChecked() ? "97" : "-1");

        cr.setCr_measles1(bi.crMeasles1.getText().toString());

        cr.setCr_measles1_d1(bi.crMeasles1D1.isChecked() ? "1" : "-1");

        cr.setCr_measles1_d2(bi.crMeasles1D2.isChecked() ? "2" : "-1");

        cr.setCr_measles1_na(bi.crMeasles1Na.isChecked() ? "97" : "-1");

        cr.setCr_measles2(bi.crMeasles2.getText().toString());

        cr.setCr_measles2_d1(bi.crMeasles2D1.isChecked() ? "1" : "-1");

        cr.setCr_measles2_d2(bi.crMeasles2D2.isChecked() ? "2" : "-1");

        cr.setCr_measles2_na(bi.crMeasles2Na.isChecked() ? "97" : "-1");

        cr.setCr_birth_status(bi.crBirthStatus1.isChecked() ? "1"
                : bi.crBirthStatus2.isChecked() ? "2"
                : "-1");

        cr.setCr_comments(bi.crComments.getText().toString());

        cr.setcR(cr.cRtoString());

    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}