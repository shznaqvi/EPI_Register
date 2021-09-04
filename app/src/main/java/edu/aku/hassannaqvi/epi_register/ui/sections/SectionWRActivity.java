package edu.aku.hassannaqvi.epi_register.ui.sections;

import static edu.aku.hassannaqvi.epi_register.core.MainApp.cbCheck;
import static edu.aku.hassannaqvi.epi_register.core.MainApp.wr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
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
import edu.aku.hassannaqvi.epi_register.databinding.ActivitySectionWrBinding;
import edu.aku.hassannaqvi.epi_register.models.FormWR;

public class SectionWRActivity extends AppCompatActivity {
    private static final String TAG = "SectionWRActivity";
    ActivitySectionWrBinding bi;
    private DatabaseHelper db;
    String st = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppThemeUrdu);
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_wr);
        bi.setCallback(this);
        setupSkips();
        st = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(new Date().getTime());
       /* bi.setForm(form);
        if (form == null) form = new Form();*/
//        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        String dmuReg = getIntent().getStringExtra("dmureg");
        String reg = getIntent().getStringExtra("reg");
        bi.wrDmuRegister.setText(dmuReg);
        bi.wrRegNumber.setText(reg);

        if (MainApp.wrAddress.trim().equals(""))
            bi.wrAddressPrevious.setVisibility(View.GONE);
        bi.wrAddressPrevious.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.wrAddress.setText(MainApp.wrAddress);
                } else {
                    bi.wrAddress.setText("");

                }
            }
        });
    }


    private void setupSkips() {

        bi.wrAddressPrevious.setOnCheckedChangeListener((compoundButton, b) -> {
            Clear.clearAllFields(bi.wrAddress, !b);
        });

        bi.wrPhoneNa.setOnCheckedChangeListener((compoundButton, b) -> {
            Clear.clearAllFields(bi.wrPhone, !b);
        });

        cbCheck(bi.wrTtd1ds1, bi.wrTtd1ds2, bi.wrTtd1na, bi.wrTtd1);
        cbCheck(bi.wrTtd1ds2, bi.wrTtd1ds1, bi.wrTtd1na, bi.wrTtd1);
        cbCheck(bi.wrTtd1na, bi.wrTtd1ds2, bi.wrTtd1ds1, bi.wrTtd1);

        cbCheck(bi.wrTtd2ds1, bi.wrTtd2ds2, bi.wrTtd2na, bi.wrTtd2);
        cbCheck(bi.wrTtd2ds2, bi.wrTtd2ds1, bi.wrTtd2na, bi.wrTtd2);
        cbCheck(bi.wrTtd2na, bi.wrTtd2ds2, bi.wrTtd2ds1, bi.wrTtd2);

        cbCheck(bi.wrTtd3ds1, bi.wrTtd3ds2, bi.wrTtd3na, bi.wrTtd3);
        cbCheck(bi.wrTtd3ds2, bi.wrTtd3ds1, bi.wrTtd3na, bi.wrTtd3);
        cbCheck(bi.wrTtd3na, bi.wrTtd3ds2, bi.wrTtd3ds1, bi.wrTtd3);

        cbCheck(bi.wrTtd4ds1, bi.wrTtd4ds2, bi.wrTtd4na, bi.wrTtd4);
        cbCheck(bi.wrTtd4ds2, bi.wrTtd4ds1, bi.wrTtd4na, bi.wrTtd4);
        cbCheck(bi.wrTtd4na, bi.wrTtd4ds2, bi.wrTtd4ds1, bi.wrTtd4);

        cbCheck(bi.wrTtd5ds1, bi.wrTtd5ds2, bi.wrTtd5na, bi.wrTtd5);
        cbCheck(bi.wrTtd5ds2, bi.wrTtd5ds1, bi.wrTtd5na, bi.wrTtd5);
        cbCheck(bi.wrTtd5na, bi.wrTtd5ds2, bi.wrTtd5ds1, bi.wrTtd5);
    }


    private boolean insertRecord() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        long rowId = 0;

        try {
            rowId = db.addWR(wr);

            if (rowId > 0) {
                long updCount = 0;

                wr.setId(String.valueOf(rowId));
                wr.setUid(wr.getDeviceId() + wr.getId());

                updCount = db.updateWrColumn(TableContracts.FormWRTable.COLUMN_UID, wr.getUid());

                if (updCount > 0) {
                    return true;
                }

            } else {
                Toast.makeText(this, "Updating Database… ERROR!", Toast.LENGTH_SHORT).show();
                return false;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(WR):" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        return false;
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        try {
            saveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (insertRecord()) {
            finish();
            startActivity(new Intent(this, SectionWRActivity.class)
                    .putExtra("dmureg", bi.wrDmuRegister.getText().toString())
                    .putExtra("reg", bi.wrRegNumber.getText().toString()));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    private void saveDraft() throws JSONException {

        wr = new FormWR();
        wr.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        wr.setUserName(MainApp.user.getUserName());
        wr.setDeviceId(MainApp.appInfo.getDeviceID());
        wr.setDeviceTag(MainApp.appInfo.getTagName());
        wr.setAppver(MainApp.appInfo.getAppVersion());

        wr.setStartTime(st);
        wr.setEndTime(new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));

        wr.setWr_dmu_register(bi.wrDmuRegister.getText().toString());

        wr.setWr_reg_number(bi.wrRegNumber.getText().toString());

        wr.setWr_page_number(bi.wrPageNumber.getText().toString());

        wr.setWr_rsno(bi.wrRsno.getText().toString());

        wr.setWr_card_number(bi.wrCardNumber.getText().toString());

        wr.setWr_women_name(bi.wrWomenName.getText().toString());

        wr.setWr_husband_name(bi.wrHusbandName.getText().toString());

        wr.setWr_age_years(bi.wrAgeYears.getText().toString());

        wr.setWr_address(bi.wrAddress.getText().toString());
        MainApp.wrAddress = bi.wrAddress.getText().toString();

        wr.setWr_address_previous(bi.wrAddressPrevious.isChecked() ? "1" : "-1");

        wr.setWr_phone(bi.wrPhone.getText().toString());

        wr.setWr_phone_na(bi.wrPhoneNa.isChecked() ? "1" : "-1");

        wr.setWr_ttd1(bi.wrTtd1.getText().toString());

        wr.setWr_ttd1ds1(bi.wrTtd1ds1.isChecked() ? "1" : "-1");

        wr.setWr_ttd1ds2(bi.wrTtd1ds2.isChecked() ? "2" : "-1");

        wr.setWr_ttd1na(bi.wrTtd1na.isChecked() ? "97" : "-1");

        wr.setWr_ttd2(bi.wrTtd2.getText().toString());

        wr.setWr_ttd2ds1(bi.wrTtd2ds1.isChecked() ? "1" : "-1");

        wr.setWr_ttd2ds2(bi.wrTtd2ds2.isChecked() ? "2" : "-1");

        wr.setWr_ttd2na(bi.wrTtd2na.isChecked() ? "97" : "-1");

        wr.setWr_ttd3(bi.wrTtd3.getText().toString());

        wr.setWr_ttd3ds1(bi.wrTtd3ds1.isChecked() ? "1" : "-1");

        wr.setWr_ttd3ds2(bi.wrTtd3ds2.isChecked() ? "2" : "-1");

        wr.setWr_ttd3na(bi.wrTtd3na.isChecked() ? "97" : "-1");

        wr.setWr_ttd4(bi.wrTtd4.getText().toString());

        wr.setWr_ttd4ds1(bi.wrTtd4ds1.isChecked() ? "1" : "-1");

        wr.setWr_ttd4ds2(bi.wrTtd4ds2.isChecked() ? "2" : "-1");

        wr.setWr_ttd4na(bi.wrTtd4na.isChecked() ? "97" : "-1");

        wr.setWr_ttd5(bi.wrTtd5.getText().toString());

        wr.setWr_ttd5ds1(bi.wrTtd5ds1.isChecked() ? "1" : "-1");

        wr.setWr_ttd5ds2(bi.wrTtd5ds2.isChecked() ? "2" : "-1");

        wr.setWr_ttd5na(bi.wrTtd5na.isChecked() ? "97" : "-1");

        wr.setWr_comments(bi.wrComments.getText().toString());

        wr.setwR(wr.wRtoString());
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