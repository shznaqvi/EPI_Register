package edu.aku.hassannaqvi.epi_register.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.epi_register.BR;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.FormCRTable;
import edu.aku.hassannaqvi.epi_register.core.MainApp;

public class FormCR extends BaseObservable {

    private final String TAG = "FormCR";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String startTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;

    // SECTION VARIABLES
    private String sH1 = StringUtils.EMPTY;
    // FIELD VARIABLES
    //  Section CR
    private String cr_dmu_register = StringUtils.EMPTY;
    private String cr_reg_number = StringUtils.EMPTY;
    private String cr_page_number = StringUtils.EMPTY;
    private String cr_rsno = StringUtils.EMPTY;
    private String cr_card_number = StringUtils.EMPTY;
    private String cr_child_name = StringUtils.EMPTY;
    private String cr_father_name = StringUtils.EMPTY;
    private String cr_age_months = StringUtils.EMPTY;
    private String cr_age_years = StringUtils.EMPTY;
    private String cr_age_days = StringUtils.EMPTY;
    private String cr_gender = StringUtils.EMPTY;
    private String cr_address = StringUtils.EMPTY;
    private String cr_address_previous = StringUtils.EMPTY;
    private String cr_phone = StringUtils.EMPTY;
    private String cr_phone_na = StringUtils.EMPTY;
    private String cr_bcg = StringUtils.EMPTY;
    private String cr_bcg_d = StringUtils.EMPTY;
    private String cr_bcg_d1 = StringUtils.EMPTY;
    private String cr_bcg_d2 = StringUtils.EMPTY;
    private String cr_bcg_na = StringUtils.EMPTY;
    private String cr_hep_b = StringUtils.EMPTY;
    private String cr_hep_bd = StringUtils.EMPTY;
    private String cr_hep_b1 = StringUtils.EMPTY;
    private String cr_hep_b2 = StringUtils.EMPTY;
    private String cr_hep_bna = StringUtils.EMPTY;
    private String cr_opv0 = StringUtils.EMPTY;
    private String cr_opv0_d = StringUtils.EMPTY;
    private String cr_opv0_d1 = StringUtils.EMPTY;
    private String cr_opv0_d2 = StringUtils.EMPTY;
    private String cr_opv0_na = StringUtils.EMPTY;
    private String cr_opv1 = StringUtils.EMPTY;
    private String cr_opv1_d = StringUtils.EMPTY;
    private String cr_opv1_d1 = StringUtils.EMPTY;
    private String cr_opv1_d2 = StringUtils.EMPTY;
    private String cr_opv1_na = StringUtils.EMPTY;
    private String cr_opv2 = StringUtils.EMPTY;
    private String cr_opv2_d = StringUtils.EMPTY;
    private String cr_opv2_d1 = StringUtils.EMPTY;
    private String cr_opv2_d2 = StringUtils.EMPTY;
    private String cr_opv2_na = StringUtils.EMPTY;
    private String cr_opv3 = StringUtils.EMPTY;
    private String cr_opv3_d = StringUtils.EMPTY;
    private String cr_opv3_d1 = StringUtils.EMPTY;
    private String cr_opv3_d2 = StringUtils.EMPTY;
    private String cr_opv3_na = StringUtils.EMPTY;
    private String cr_rota1 = StringUtils.EMPTY;
    private String cr_rota1_d = StringUtils.EMPTY;
    private String cr_rota1_d1 = StringUtils.EMPTY;
    private String cr_rota1_d2 = StringUtils.EMPTY;
    private String cr_rota1_na = StringUtils.EMPTY;
    private String cr_rota2 = StringUtils.EMPTY;
    private String cr_rota2_d = StringUtils.EMPTY;
    private String cr_rota2_d1 = StringUtils.EMPTY;
    private String cr_rota2_d2 = StringUtils.EMPTY;
    private String cr_rota2_na = StringUtils.EMPTY;
    private String cr_ipv = StringUtils.EMPTY;
    private String cr_ipv_d = StringUtils.EMPTY;
    private String cr_ipv_d1 = StringUtils.EMPTY;
    private String cr_ipv_d2 = StringUtils.EMPTY;
    private String cr_ipv_na = StringUtils.EMPTY;
    private String cr_pcv1 = StringUtils.EMPTY;
    private String cr_pcv1_d = StringUtils.EMPTY;
    private String cr_pcv1_d1 = StringUtils.EMPTY;
    private String cr_pcv1_d2 = StringUtils.EMPTY;
    private String cr_pcv1_na = StringUtils.EMPTY;
    private String cr_pcv2 = StringUtils.EMPTY;
    private String cr_pcv2_d = StringUtils.EMPTY;
    private String cr_pcv2_d1 = StringUtils.EMPTY;
    private String cr_pcv2_d2 = StringUtils.EMPTY;
    private String cr_pcv2_na = StringUtils.EMPTY;
    private String cr_pcv3 = StringUtils.EMPTY;
    private String cr_pcv3_d = StringUtils.EMPTY;
    private String cr_pcv3_d1 = StringUtils.EMPTY;
    private String cr_pcv3_d2 = StringUtils.EMPTY;
    private String cr_pcv3_na = StringUtils.EMPTY;
    private String cr_penta1 = StringUtils.EMPTY;
    private String cr_penta1_d = StringUtils.EMPTY;
    private String cr_penta1_d1 = StringUtils.EMPTY;
    private String cr_penta1_d2 = StringUtils.EMPTY;
    private String cr_penta1_na = StringUtils.EMPTY;
    private String cr_penta2 = StringUtils.EMPTY;
    private String cr_penta2_d = StringUtils.EMPTY;
    private String cr_penta2_d1 = StringUtils.EMPTY;
    private String cr_penta2_d2 = StringUtils.EMPTY;
    private String cr_penta2_na = StringUtils.EMPTY;
    private String cr_penta3 = StringUtils.EMPTY;
    private String cr_penta3_d = StringUtils.EMPTY;
    private String cr_penta3_d1 = StringUtils.EMPTY;
    private String cr_penta3_d2 = StringUtils.EMPTY;
    private String cr_penta3_na = StringUtils.EMPTY;
    private String cr_measles1 = StringUtils.EMPTY;
    private String cr_measles1_d = StringUtils.EMPTY;
    private String cr_measles1_d1 = StringUtils.EMPTY;
    private String cr_measles1_d2 = StringUtils.EMPTY;
    private String cr_measles1_na = StringUtils.EMPTY;
    private String cr_measles2 = StringUtils.EMPTY;
    private String cr_measles2_d = StringUtils.EMPTY;
    private String cr_measles2_d1 = StringUtils.EMPTY;
    private String cr_measles2_d2 = StringUtils.EMPTY;
    private String cr_measles2_na = StringUtils.EMPTY;
    private String cr_birth_status = StringUtils.EMPTY;
    private String cr_comments = StringUtils.EMPTY;
    private String cR = StringUtils.EMPTY;


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getsH1() {
        return sH1;
    }

    public void setsH1(String sH1) {
        this.sH1 = sH1;
    }

    public String getcR() {
        return cR;
    }

    public void setcR(String cR) {
        this.cR = cR;
    }

    @Bindable
    public String getCr_dmu_register() {
        return cr_dmu_register;
    }

    public void setCr_dmu_register(String cr_dmu_register) {
        this.cr_dmu_register = cr_dmu_register;
        notifyPropertyChanged(BR.cr_dmu_register);
    }

    @Bindable
    public String getCr_reg_number() {
        return cr_reg_number;
    }

    public void setCr_reg_number(String cr_reg_number) {
        this.cr_reg_number = cr_reg_number;
        notifyPropertyChanged(BR.cr_reg_number);
    }

    @Bindable
    public String getCr_page_number() {
        return cr_page_number;
    }

    public void setCr_page_number(String cr_page_number) {
        this.cr_page_number = cr_page_number;
        notifyPropertyChanged(BR.cr_page_number);
    }

    @Bindable
    public String getCr_rsno() {
        return cr_rsno;
    }

    public void setCr_rsno(String cr_rsno) {
        this.cr_rsno = cr_rsno;
        notifyPropertyChanged(BR.cr_rsno);
    }

    @Bindable
    public String getCr_card_number() {
        return cr_card_number;
    }

    public void setCr_card_number(String cr_card_number) {
        this.cr_card_number = cr_card_number;
        notifyPropertyChanged(BR.cr_card_number);
    }

    @Bindable
    public String getCr_child_name() {
        return cr_child_name;
    }

    public void setCr_child_name(String cr_child_name) {
        this.cr_child_name = cr_child_name;
        notifyPropertyChanged(BR.cr_child_name);
    }

    @Bindable
    public String getCr_father_name() {
        return cr_father_name;
    }

    public void setCr_father_name(String cr_father_name) {
        this.cr_father_name = cr_father_name;
        notifyPropertyChanged(BR.cr_father_name);
    }

    @Bindable
    public String getCr_age_months() {
        return cr_age_months;
    }

    public void setCr_age_months(String cr_age_months) {
        this.cr_age_months = cr_age_months;
        notifyPropertyChanged(BR.cr_age_months);
    }

    @Bindable
    public String getCr_age_years() {
        return cr_age_years;
    }

    public void setCr_age_years(String cr_age_years) {
        this.cr_age_years = cr_age_years;
        notifyPropertyChanged(BR.cr_age_years);
    }

    @Bindable
    public String getCr_age_days() {
        return cr_age_days;
    }

    public void setCr_age_days(String cr_age_days) {
        this.cr_age_days = cr_age_days;
        notifyPropertyChanged(BR.cr_age_days);
    }

    @Bindable
    public String getCr_gender() {
        return cr_gender;
    }

    public void setCr_gender(String cr_gender) {
        this.cr_gender = cr_gender;
        notifyPropertyChanged(BR.cr_gender);
    }

    @Bindable
    public String getCr_address() {
        return cr_address;
    }

    public void setCr_address(String cr_address) {
        this.cr_address = cr_address;
        notifyPropertyChanged(BR.cr_address);
    }

    @Bindable
    public String getCr_address_previous() {
        return cr_address_previous;
    }

    public void setCr_address_previous(String cr_address_previous) {
        this.cr_address_previous = cr_address_previous;
        notifyPropertyChanged(BR.cr_address_previous);
    }

    @Bindable
    public String getCr_phone() {
        return cr_phone;
    }

    public void setCr_phone(String cr_phone) {
        this.cr_phone = cr_phone;
        notifyPropertyChanged(BR.cr_phone);
    }

    @Bindable
    public String getCr_phone_na() {
        return cr_phone_na;
    }

    public void setCr_phone_na(String cr_phone_na) {
        this.cr_phone_na = cr_phone_na;
        notifyPropertyChanged(BR.cr_phone_na);
    }

    @Bindable
    public String getCr_bcg() {
        return cr_bcg;
    }

    public void setCr_bcg(String cr_bcg) {
        this.cr_bcg = cr_bcg;
        notifyPropertyChanged(BR.cr_bcg);
    }

    @Bindable
    public String getCr_bcg_d() {
        return cr_bcg_d;
    }

    public void setCr_bcg_d(String cr_bcg_d) {
        this.cr_bcg_d = cr_bcg_d;
        notifyPropertyChanged(BR.cr_bcg_d);
    }

    @Bindable
    public String getCr_bcg_d1() {
        return cr_bcg_d1;
    }

    public void setCr_bcg_d1(String cr_bcg_d1) {
        this.cr_bcg_d1 = cr_bcg_d1;
        notifyPropertyChanged(BR.cr_bcg_d1);
    }

    @Bindable
    public String getCr_bcg_d2() {
        return cr_bcg_d2;
    }

    public void setCr_bcg_d2(String cr_bcg_d2) {
        this.cr_bcg_d2 = cr_bcg_d2;
        notifyPropertyChanged(BR.cr_bcg_d2);
    }

    @Bindable
    public String getCr_hep_b() {
        return cr_hep_b;
    }

    public void setCr_hep_b(String cr_hep_b) {
        this.cr_hep_b = cr_hep_b;
        notifyPropertyChanged(BR.cr_hep_b);
    }

    @Bindable
    public String getCr_hep_bd() {
        return cr_hep_bd;
    }

    public void setCr_hep_bd(String cr_hep_bd) {
        this.cr_hep_bd = cr_hep_bd;
        notifyPropertyChanged(BR.cr_hep_bd);
    }

    @Bindable
    public String getCr_hep_b1() {
        return cr_hep_b1;
    }

    public void setCr_hep_b1(String cr_hep_b1) {
        this.cr_hep_b1 = cr_hep_b1;
        notifyPropertyChanged(BR.cr_hep_b1);
    }

    @Bindable
    public String getCr_hep_b2() {
        return cr_hep_b2;
    }

    public void setCr_hep_b2(String cr_hep_b2) {
        this.cr_hep_b2 = cr_hep_b2;
        notifyPropertyChanged(BR.cr_hep_b2);
    }

    @Bindable
    public String getCr_opv0() {
        return cr_opv0;
    }

    public void setCr_opv0(String cr_opv0) {
        this.cr_opv0 = cr_opv0;
        notifyPropertyChanged(BR.cr_opv0);
    }

    @Bindable
    public String getCr_opv0_d() {
        return cr_opv0_d;
    }

    public void setCr_opv0_d(String cr_opv0_d) {
        this.cr_opv0_d = cr_opv0_d;
        notifyPropertyChanged(BR.cr_opv0_d);
    }

    @Bindable
    public String getCr_opv0_d1() {
        return cr_opv0_d1;
    }

    public void setCr_opv0_d1(String cr_opv0_d1) {
        this.cr_opv0_d1 = cr_opv0_d1;
        notifyPropertyChanged(BR.cr_opv0_d1);
    }

    @Bindable
    public String getCr_opv0_d2() {
        return cr_opv0_d2;
    }

    public void setCr_opv0_d2(String cr_opv0_d2) {
        this.cr_opv0_d2 = cr_opv0_d2;
        notifyPropertyChanged(BR.cr_opv0_d2);
    }

    @Bindable
    public String getCr_opv1() {
        return cr_opv1;
    }

    public void setCr_opv1(String cr_opv1) {
        this.cr_opv1 = cr_opv1;
        notifyPropertyChanged(BR.cr_opv1);
    }

    @Bindable
    public String getCr_opv1_d() {
        return cr_opv1_d;
    }

    public void setCr_opv1_d(String cr_opv1_d) {
        this.cr_opv1_d = cr_opv1_d;
        notifyPropertyChanged(BR.cr_opv1_d);
    }

    @Bindable
    public String getCr_opv1_d1() {
        return cr_opv1_d1;
    }

    public void setCr_opv1_d1(String cr_opv1_d1) {
        this.cr_opv1_d1 = cr_opv1_d1;
        notifyPropertyChanged(BR.cr_opv1_d1);
    }

    @Bindable
    public String getCr_opv1_d2() {
        return cr_opv1_d2;
    }

    public void setCr_opv1_d2(String cr_opv1_d2) {
        this.cr_opv1_d2 = cr_opv1_d2;
        notifyPropertyChanged(BR.cr_opv1_d2);
    }

    @Bindable
    public String getCr_opv2() {
        return cr_opv2;
    }

    public void setCr_opv2(String cr_opv2) {
        this.cr_opv2 = cr_opv2;
        notifyPropertyChanged(BR.cr_opv2);
    }

    @Bindable
    public String getCr_opv2_d() {
        return cr_opv2_d;
    }

    public void setCr_opv2_d(String cr_opv2_d) {
        this.cr_opv2_d = cr_opv2_d;
        notifyPropertyChanged(BR.cr_opv2_d);
    }

    @Bindable
    public String getCr_opv2_d1() {
        return cr_opv2_d1;
    }

    public void setCr_opv2_d1(String cr_opv2_d1) {
        this.cr_opv2_d1 = cr_opv2_d1;
        notifyPropertyChanged(BR.cr_opv2_d1);
    }

    @Bindable
    public String getCr_opv2_d2() {
        return cr_opv2_d2;
    }

    public void setCr_opv2_d2(String cr_opv2_d2) {
        this.cr_opv2_d2 = cr_opv2_d2;
        notifyPropertyChanged(BR.cr_opv2_d2);
    }

    @Bindable
    public String getCr_opv3() {
        return cr_opv3;
    }

    public void setCr_opv3(String cr_opv3) {
        this.cr_opv3 = cr_opv3;
        notifyPropertyChanged(BR.cr_opv3);
    }

    @Bindable
    public String getCr_opv3_d() {
        return cr_opv3_d;
    }

    public void setCr_opv3_d(String cr_opv3_d) {
        this.cr_opv3_d = cr_opv3_d;
        notifyPropertyChanged(BR.cr_opv3_d);
    }

    @Bindable
    public String getCr_opv3_d1() {
        return cr_opv3_d1;
    }

    public void setCr_opv3_d1(String cr_opv3_d1) {
        this.cr_opv3_d1 = cr_opv3_d1;
        notifyPropertyChanged(BR.cr_opv3_d1);
    }

    @Bindable
    public String getCr_opv3_d2() {
        return cr_opv3_d2;
    }

    public void setCr_opv3_d2(String cr_opv3_d2) {
        this.cr_opv3_d2 = cr_opv3_d2;
        notifyPropertyChanged(BR.cr_opv3_d2);
    }

    @Bindable
    public String getCr_rota1() {
        return cr_rota1;
    }

    public void setCr_rota1(String cr_rota1) {
        this.cr_rota1 = cr_rota1;
        notifyPropertyChanged(BR.cr_rota1);
    }

    @Bindable
    public String getCr_rota1_d() {
        return cr_rota1_d;
    }

    public void setCr_rota1_d(String cr_rota1_d) {
        this.cr_rota1_d = cr_rota1_d;
        notifyPropertyChanged(BR.cr_rota1_d);
    }

    @Bindable
    public String getCr_rota1_d1() {
        return cr_rota1_d1;
    }

    public void setCr_rota1_d1(String cr_rota1_d1) {
        this.cr_rota1_d1 = cr_rota1_d1;
        notifyPropertyChanged(BR.cr_rota1_d1);
    }

    @Bindable
    public String getCr_rota1_d2() {
        return cr_rota1_d2;
    }

    public void setCr_rota1_d2(String cr_rota1_d2) {
        this.cr_rota1_d2 = cr_rota1_d2;
        notifyPropertyChanged(BR.cr_rota1_d2);
    }

    @Bindable
    public String getCr_rota2() {
        return cr_rota2;
    }

    public void setCr_rota2(String cr_rota2) {
        this.cr_rota2 = cr_rota2;
        notifyPropertyChanged(BR.cr_rota2);
    }

    @Bindable
    public String getCr_rota2_d() {
        return cr_rota2_d;
    }

    public void setCr_rota2_d(String cr_rota2_d) {
        this.cr_rota2_d = cr_rota2_d;
        notifyPropertyChanged(BR.cr_rota2_d);
    }

    @Bindable
    public String getCr_rota2_d1() {
        return cr_rota2_d1;
    }

    public void setCr_rota2_d1(String cr_rota2_d1) {
        this.cr_rota2_d1 = cr_rota2_d1;
        notifyPropertyChanged(BR.cr_rota2_d1);
    }

    @Bindable
    public String getCr_rota2_d2() {
        return cr_rota2_d2;
    }

    public void setCr_rota2_d2(String cr_rota2_d2) {
        this.cr_rota2_d2 = cr_rota2_d2;
        notifyPropertyChanged(BR.cr_rota2_d2);
    }

    @Bindable
    public String getCr_ipv() {
        return cr_ipv;
    }

    public void setCr_ipv(String cr_ipv) {
        this.cr_ipv = cr_ipv;
        notifyPropertyChanged(BR.cr_ipv);
    }

    @Bindable
    public String getCr_ipv_d() {
        return cr_ipv_d;
    }

    public void setCr_ipv_d(String cr_ipv_d) {
        this.cr_ipv_d = cr_ipv_d;
        notifyPropertyChanged(BR.cr_ipv_d);
    }

    @Bindable
    public String getCr_ipv_d1() {
        return cr_ipv_d1;
    }

    public void setCr_ipv_d1(String cr_ipv_d1) {
        this.cr_ipv_d1 = cr_ipv_d1;
        notifyPropertyChanged(BR.cr_ipv_d1);
    }

    @Bindable
    public String getCr_ipv_d2() {
        return cr_ipv_d2;
    }

    public void setCr_ipv_d2(String cr_ipv_d2) {
        this.cr_ipv_d2 = cr_ipv_d2;
        notifyPropertyChanged(BR.cr_ipv_d2);
    }

    @Bindable
    public String getCr_pcv1() {
        return cr_pcv1;
    }

    public void setCr_pcv1(String cr_pcv1) {
        this.cr_pcv1 = cr_pcv1;
        notifyPropertyChanged(BR.cr_pcv1);
    }

    @Bindable
    public String getCr_pcv1_d() {
        return cr_pcv1_d;
    }

    public void setCr_pcv1_d(String cr_pcv1_d) {
        this.cr_pcv1_d = cr_pcv1_d;
        notifyPropertyChanged(BR.cr_pcv1_d);
    }

    @Bindable
    public String getCr_pcv1_d1() {
        return cr_pcv1_d1;
    }

    public void setCr_pcv1_d1(String cr_pcv1_d1) {
        this.cr_pcv1_d1 = cr_pcv1_d1;
        notifyPropertyChanged(BR.cr_pcv1_d1);
    }

    @Bindable
    public String getCr_pcv1_d2() {
        return cr_pcv1_d2;
    }

    public void setCr_pcv1_d2(String cr_pcv1_d2) {
        this.cr_pcv1_d2 = cr_pcv1_d2;
        notifyPropertyChanged(BR.cr_pcv1_d2);
    }

    @Bindable
    public String getCr_pcv2() {
        return cr_pcv2;
    }

    public void setCr_pcv2(String cr_pcv2) {
        this.cr_pcv2 = cr_pcv2;
        notifyPropertyChanged(BR.cr_pcv2);
    }

    @Bindable
    public String getCr_pcv2_d() {
        return cr_pcv2_d;
    }

    public void setCr_pcv2_d(String cr_pcv2_d) {
        this.cr_pcv2_d = cr_pcv2_d;
        notifyPropertyChanged(BR.cr_pcv2_d);
    }

    @Bindable
    public String getCr_pcv2_d1() {
        return cr_pcv2_d1;
    }

    public void setCr_pcv2_d1(String cr_pcv2_d1) {
        this.cr_pcv2_d1 = cr_pcv2_d1;
        notifyPropertyChanged(BR.cr_pcv2_d1);
    }

    @Bindable
    public String getCr_pcv2_d2() {
        return cr_pcv2_d2;
    }

    public void setCr_pcv2_d2(String cr_pcv2_d2) {
        this.cr_pcv2_d2 = cr_pcv2_d2;
        notifyPropertyChanged(BR.cr_pcv2_d2);
    }

    @Bindable
    public String getCr_pcv3() {
        return cr_pcv3;
    }

    public void setCr_pcv3(String cr_pcv3) {
        this.cr_pcv3 = cr_pcv3;
        notifyPropertyChanged(BR.cr_pcv3);
    }

    @Bindable
    public String getCr_pcv3_d() {
        return cr_pcv3_d;
    }

    public void setCr_pcv3_d(String cr_pcv3_d) {
        this.cr_pcv3_d = cr_pcv3_d;
        notifyPropertyChanged(BR.cr_pcv3_d);
    }

    @Bindable
    public String getCr_pcv3_d1() {
        return cr_pcv3_d1;
    }

    public void setCr_pcv3_d1(String cr_pcv3_d1) {
        this.cr_pcv3_d1 = cr_pcv3_d1;
        notifyPropertyChanged(BR.cr_pcv3_d1);
    }

    @Bindable
    public String getCr_pcv3_d2() {
        return cr_pcv3_d2;
    }

    public void setCr_pcv3_d2(String cr_pcv3_d2) {
        this.cr_pcv3_d2 = cr_pcv3_d2;
        notifyPropertyChanged(BR.cr_pcv3_d2);
    }

    @Bindable
    public String getCr_penta1() {
        return cr_penta1;
    }

    public void setCr_penta1(String cr_penta1) {
        this.cr_penta1 = cr_penta1;
        notifyPropertyChanged(BR.cr_penta1);
    }

    @Bindable
    public String getCr_penta1_d() {
        return cr_penta1_d;
    }

    public void setCr_penta1_d(String cr_penta1_d) {
        this.cr_penta1_d = cr_penta1_d;
        notifyPropertyChanged(BR.cr_penta1_d);
    }

    @Bindable
    public String getCr_penta1_d1() {
        return cr_penta1_d1;
    }

    public void setCr_penta1_d1(String cr_penta1_d1) {
        this.cr_penta1_d1 = cr_penta1_d1;
        notifyPropertyChanged(BR.cr_penta1_d1);
    }

    @Bindable
    public String getCr_penta1_d2() {
        return cr_penta1_d2;
    }

    public void setCr_penta1_d2(String cr_penta1_d2) {
        this.cr_penta1_d2 = cr_penta1_d2;
        notifyPropertyChanged(BR.cr_penta1_d2);
    }

    @Bindable
    public String getCr_penta2() {
        return cr_penta2;
    }

    public void setCr_penta2(String cr_penta2) {
        this.cr_penta2 = cr_penta2;
        notifyPropertyChanged(BR.cr_penta2);
    }

    @Bindable
    public String getCr_penta2_d() {
        return cr_penta2_d;
    }

    public void setCr_penta2_d(String cr_penta2_d) {
        this.cr_penta2_d = cr_penta2_d;
        notifyPropertyChanged(BR.cr_penta2_d);
    }

    @Bindable
    public String getCr_penta2_d1() {
        return cr_penta2_d1;
    }

    public void setCr_penta2_d1(String cr_penta2_d1) {
        this.cr_penta2_d1 = cr_penta2_d1;
        notifyPropertyChanged(BR.cr_penta2_d1);
    }

    @Bindable
    public String getCr_penta2_d2() {
        return cr_penta2_d2;
    }

    public void setCr_penta2_d2(String cr_penta2_d2) {
        this.cr_penta2_d2 = cr_penta2_d2;
        notifyPropertyChanged(BR.cr_penta2_d2);
    }

    @Bindable
    public String getCr_penta3() {
        return cr_penta3;
    }

    public void setCr_penta3(String cr_penta3) {
        this.cr_penta3 = cr_penta3;
        notifyPropertyChanged(BR.cr_penta3);
    }

    @Bindable
    public String getCr_penta3_d() {
        return cr_penta3_d;
    }

    public void setCr_penta3_d(String cr_penta3_d) {
        this.cr_penta3_d = cr_penta3_d;
        notifyPropertyChanged(BR.cr_penta3_d);
    }

    @Bindable
    public String getCr_penta3_d1() {
        return cr_penta3_d1;
    }

    public void setCr_penta3_d1(String cr_penta3_d1) {
        this.cr_penta3_d1 = cr_penta3_d1;
        notifyPropertyChanged(BR.cr_penta3_d1);
    }

    @Bindable
    public String getCr_penta3_d2() {
        return cr_penta3_d2;
    }

    public void setCr_penta3_d2(String cr_penta3_d2) {
        this.cr_penta3_d2 = cr_penta3_d2;
        notifyPropertyChanged(BR.cr_penta3_d2);
    }

    @Bindable
    public String getCr_measles1() {
        return cr_measles1;
    }

    public void setCr_measles1(String cr_measles1) {
        this.cr_measles1 = cr_measles1;
        notifyPropertyChanged(BR.cr_measles1);
    }

    @Bindable
    public String getCr_measles1_d() {
        return cr_measles1_d;
    }

    public void setCr_measles1_d(String cr_measles1_d) {
        this.cr_measles1_d = cr_measles1_d;
        notifyPropertyChanged(BR.cr_measles1_d);
    }

    @Bindable
    public String getCr_measles1_d1() {
        return cr_measles1_d1;
    }

    public void setCr_measles1_d1(String cr_measles1_d1) {
        this.cr_measles1_d1 = cr_measles1_d1;
        notifyPropertyChanged(BR.cr_measles1_d1);
    }

    @Bindable
    public String getCr_measles1_d2() {
        return cr_measles1_d2;
    }

    public void setCr_measles1_d2(String cr_measles1_d2) {
        this.cr_measles1_d2 = cr_measles1_d2;
        notifyPropertyChanged(BR.cr_measles1_d2);
    }

    @Bindable
    public String getCr_measles2() {
        return cr_measles2;
    }

    public void setCr_measles2(String cr_measles2) {
        this.cr_measles2 = cr_measles2;
        notifyPropertyChanged(BR.cr_measles2);
    }

    @Bindable
    public String getCr_measles2_d() {
        return cr_measles2_d;
    }

    public void setCr_measles2_d(String cr_measles2_d) {
        this.cr_measles2_d = cr_measles2_d;
        notifyPropertyChanged(BR.cr_measles2_d);
    }

    @Bindable
    public String getCr_measles2_d1() {
        return cr_measles2_d1;
    }

    public void setCr_measles2_d1(String cr_measles2_d1) {
        this.cr_measles2_d1 = cr_measles2_d1;
        notifyPropertyChanged(BR.cr_measles2_d1);
    }

    @Bindable
    public String getCr_measles2_d2() {
        return cr_measles2_d2;
    }

    public void setCr_measles2_d2(String cr_measles2_d2) {
        this.cr_measles2_d2 = cr_measles2_d2;
        notifyPropertyChanged(BR.cr_measles2_d2);
    }

    @Bindable
    public String getCr_birth_status() {
        return cr_birth_status;
    }

    public void setCr_birth_status(String cr_birth_status) {
        this.cr_birth_status = cr_birth_status;
        notifyPropertyChanged(BR.cr_birth_status);
    }

    @Bindable
    public String getCr_comments() {
        return cr_comments;
    }

    public void setCr_comments(String cr_comments) {
        this.cr_comments = cr_comments;
        notifyPropertyChanged(BR.cr_comments);
    }

    @Bindable
    public String getCr_bcg_na() {
        return cr_bcg_na;
    }

    public void setCr_bcg_na(String cr_bcg_na) {
        this.cr_bcg_na = cr_bcg_na;
        notifyPropertyChanged(BR.cr_bcg_na);
    }

    @Bindable
    public String getCr_hep_bna() {
        return cr_hep_bna;
    }

    public void setCr_hep_bna(String cr_hep_bna) {
        this.cr_hep_bna = cr_hep_bna;
        notifyPropertyChanged(BR.cr_hep_bna);
    }

    @Bindable
    public String getCr_opv0_na() {
        return cr_opv0_na;
    }

    public void setCr_opv0_na(String cr_opv0_na) {
        this.cr_opv0_na = cr_opv0_na;
        notifyPropertyChanged(BR.cr_opv0_na);
    }

    @Bindable
    public String getCr_opv1_na() {
        return cr_opv1_na;
    }

    public void setCr_opv1_na(String cr_opv1_na) {
        this.cr_opv1_na = cr_opv1_na;
        notifyPropertyChanged(BR.cr_opv1_na);
    }

    @Bindable
    public String getCr_opv2_na() {
        return cr_opv2_na;
    }

    public void setCr_opv2_na(String cr_opv2_na) {
        this.cr_opv2_na = cr_opv2_na;
        notifyPropertyChanged(BR.cr_opv2_na);
    }

    @Bindable
    public String getCr_opv3_na() {
        return cr_opv3_na;
    }

    public void setCr_opv3_na(String cr_opv3_na) {
        this.cr_opv3_na = cr_opv3_na;
        notifyPropertyChanged(BR.cr_opv3_na);
    }

    @Bindable
    public String getCr_rota1_na() {
        return cr_rota1_na;
    }

    public void setCr_rota1_na(String cr_rota1_na) {
        this.cr_rota1_na = cr_rota1_na;
        notifyPropertyChanged(BR.cr_rota1_na);
    }

    @Bindable
    public String getCr_rota2_na() {
        return cr_rota2_na;
    }

    public void setCr_rota2_na(String cr_rota2_na) {
        this.cr_rota2_na = cr_rota2_na;
        notifyPropertyChanged(BR.cr_rota2_na);
    }

    @Bindable
    public String getCr_ipv_na() {
        return cr_ipv_na;
    }

    public void setCr_ipv_na(String cr_ipv_na) {
        this.cr_ipv_na = cr_ipv_na;
        notifyPropertyChanged(BR.cr_ipv_na);
    }

    @Bindable
    public String getCr_pcv1_na() {
        return cr_pcv1_na;
    }

    public void setCr_pcv1_na(String cr_pcv1_na) {
        this.cr_pcv1_na = cr_pcv1_na;
        notifyPropertyChanged(BR.cr_pcv1_na);
    }

    @Bindable
    public String getCr_pcv2_na() {
        return cr_pcv2_na;
    }

    public void setCr_pcv2_na(String cr_pcv2_na) {
        this.cr_pcv2_na = cr_pcv2_na;
        notifyPropertyChanged(BR.cr_pcv2_na);
    }

    @Bindable
    public String getCr_pcv3_na() {
        return cr_pcv3_na;
    }

    public void setCr_pcv3_na(String cr_pcv3_na) {
        this.cr_pcv3_na = cr_pcv3_na;
        notifyPropertyChanged(BR.cr_pcv3_na);
    }

    @Bindable
    public String getCr_penta1_na() {
        return cr_penta1_na;
    }

    public void setCr_penta1_na(String cr_penta1_na) {
        this.cr_penta1_na = cr_penta1_na;
        notifyPropertyChanged(BR.cr_penta1_na);
    }

    @Bindable
    public String getCr_penta2_na() {
        return cr_penta2_na;
    }

    public void setCr_penta2_na(String cr_penta2_na) {
        this.cr_penta2_na = cr_penta2_na;
        notifyPropertyChanged(BR.cr_penta2_na);
    }

    @Bindable
    public String getCr_penta3_na() {
        return cr_penta3_na;
    }

    public void setCr_penta3_na(String cr_penta3_na) {
        this.cr_penta3_na = cr_penta3_na;
        notifyPropertyChanged(BR.cr_penta3_na);
    }

    @Bindable
    public String getCr_measles1_na() {
        return cr_measles1_na;
    }

    public void setCr_measles1_na(String cr_measles1_na) {
        this.cr_measles1_na = cr_measles1_na;
        notifyPropertyChanged(BR.cr_measles1_na);
    }

    @Bindable
    public String getCr_measles2_na() {
        return cr_measles2_na;
    }

    public void setCr_measles2_na(String cr_measles2_na) {
        this.cr_measles2_na = cr_measles2_na;
        notifyPropertyChanged(BR.cr_measles2_na);
    }


    public FormCR Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_SYNCED_DATE));
        this.endTime = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_END_TIME));
        this.startTime = cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_START_TIME));
        cRHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormCRTable.COLUMN_CR)));

        return this;
    }

    public void cRHydrate(String string) throws JSONException {
        Log.d(TAG, "cRHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.cr_dmu_register = json.getString("cr_dmu_register");
            this.cr_reg_number = json.getString("cr_reg_number");
            this.cr_page_number = json.getString("cr_page_number");
            this.cr_rsno = json.getString("cr_rsno");
            this.cr_card_number = json.getString("cr_card_number");
            this.cr_child_name = json.getString("cr_child_name");
            this.cr_father_name = json.getString("cr_father_name");
            this.cr_age_months = json.getString("cr_age_months");
            this.cr_age_years = json.getString("cr_age_years");
            this.cr_age_days = json.getString("cr_age_days");
            this.cr_gender = json.getString("cr_gender");
            this.cr_address = json.getString("cr_address");
            this.cr_phone = json.getString("cr_phone");
            this.cr_phone_na = json.getString("cr_phone_na");
            this.cr_bcg = json.getString("cr_bcg");
            this.cr_bcg_d1 = json.getString("cr_bcg_d1");
            this.cr_bcg_d2 = json.getString("cr_bcg_d2");
            this.cr_bcg_na = json.getString("cr_bcg_na");
            this.cr_hep_b = json.getString("cr_hep_b");
            this.cr_hep_b1 = json.getString("cr_hep_b1");
            this.cr_hep_b2 = json.getString("cr_hep_b2");
            this.cr_hep_bna = json.getString("cr_hep_bna");
            this.cr_opv0 = json.getString("cr_opv0");
            this.cr_opv0_d1 = json.getString("cr_opv0_d1");
            this.cr_opv0_d2 = json.getString("cr_opv0_d2");
            this.cr_opv0_na = json.getString("cr_opv0_na");
            this.cr_opv1 = json.getString("cr_opv1");
            this.cr_opv1_d1 = json.getString("cr_opv1_d1");
            this.cr_opv1_d2 = json.getString("cr_opv1_d2");
            this.cr_opv1_na = json.getString("cr_opv1_na");
            this.cr_opv2 = json.getString("cr_opv2");
            this.cr_opv2_d1 = json.getString("cr_opv2_d1");
            this.cr_opv2_d2 = json.getString("cr_opv2_d2");
            this.cr_opv2_na = json.getString("cr_opv2_na");
            this.cr_opv3 = json.getString("cr_opv3");
            this.cr_opv3_d1 = json.getString("cr_opv3_d1");
            this.cr_opv3_d2 = json.getString("cr_opv3_d2");
            this.cr_opv3_na = json.getString("cr_opv3_na");
            this.cr_rota1 = json.getString("cr_rota1");
            this.cr_rota1_d1 = json.getString("cr_rota1_d1");
            this.cr_rota1_d2 = json.getString("cr_rota1_d2");
            this.cr_rota1_na = json.getString("cr_rota1_na");
            this.cr_rota2 = json.getString("cr_rota2");
            this.cr_rota2_d1 = json.getString("cr_rota2_d1");
            this.cr_rota2_d2 = json.getString("cr_rota2_d2");
            this.cr_rota2_na = json.getString("cr_rota2_na");
            this.cr_ipv = json.getString("cr_ipv");
            this.cr_ipv_d1 = json.getString("cr_ipv_d1");
            this.cr_ipv_d2 = json.getString("cr_ipv_d2");
            this.cr_ipv_na = json.getString("cr_ipv_na");
            this.cr_pcv1 = json.getString("cr_pcv1");
            this.cr_pcv1_d1 = json.getString("cr_pcv1_d1");
            this.cr_pcv1_d2 = json.getString("cr_pcv1_d2");
            this.cr_pcv1_na = json.getString("cr_pcv1_na");
            this.cr_pcv2 = json.getString("cr_pcv2");
            this.cr_pcv2_d1 = json.getString("cr_pcv2_d1");
            this.cr_pcv2_d2 = json.getString("cr_pcv2_d2");
            this.cr_pcv2_na = json.getString("cr_pcv2_na");
            this.cr_pcv3 = json.getString("cr_pcv3");
            this.cr_pcv3_d1 = json.getString("cr_pcv3_d1");
            this.cr_pcv3_d2 = json.getString("cr_pcv3_d2");
            this.cr_pcv3_na = json.getString("cr_pcv3_na");
            this.cr_penta1 = json.getString("cr_penta1");
            this.cr_penta1_d1 = json.getString("cr_penta1_d1");
            this.cr_penta1_d2 = json.getString("cr_penta1_d2");
            this.cr_penta1_na = json.getString("cr_penta1_na");
            this.cr_penta2 = json.getString("cr_penta2");
            this.cr_penta2_d1 = json.getString("cr_penta2_d1");
            this.cr_penta2_d2 = json.getString("cr_penta2_d2");
            this.cr_penta2_na = json.getString("cr_penta2_na");
            this.cr_penta3 = json.getString("cr_penta3");
            this.cr_penta3_d1 = json.getString("cr_penta3_d1");
            this.cr_penta3_d2 = json.getString("cr_penta3_d2");
            this.cr_penta3_na = json.getString("cr_penta3_na");
            this.cr_measles1 = json.getString("cr_measles1");
            this.cr_measles1_d1 = json.getString("cr_measles1_d1");
            this.cr_measles1_d2 = json.getString("cr_measles1_d2");
            this.cr_measles1_na = json.getString("cr_measles1_na");
            this.cr_measles2 = json.getString("cr_measles2");
            this.cr_measles2_d1 = json.getString("cr_measles2_d1");
            this.cr_measles2_d2 = json.getString("cr_measles2_d2");
            this.cr_measles2_na = json.getString("cr_measles2_na");
            this.cr_birth_status = json.getString("cr_birth_status");
            this.cr_comments = json.getString("cr_comments");

        }
    }


    public String cRtoString() throws JSONException {
        Log.d(TAG, "cRtoString: ");
        JSONObject json = new JSONObject();

        json.put("cr_dmu_register", cr_dmu_register)
                .put("cr_reg_number", cr_reg_number)
                .put("cr_page_number", cr_page_number)
                .put("cr_rsno", cr_rsno)
                .put("cr_card_number", cr_card_number)
                .put("cr_child_name", cr_child_name)
                .put("cr_father_name", cr_father_name)
                .put("cr_age_months", cr_age_months)
                .put("cr_age_years", cr_age_years)
                .put("cr_age_days", cr_age_days)
                .put("cr_gender", cr_gender)
                .put("cr_address", cr_address)
                .put("cr_phone", cr_phone)
                .put("cr_phone_na", cr_phone_na)
                .put("cr_bcg", cr_bcg)
                .put("cr_bcg_d1", cr_bcg_d1)
                .put("cr_bcg_d2", cr_bcg_d2)
                .put("cr_bcg_na", cr_bcg_na)
                .put("cr_hep_b", cr_hep_b)
                .put("cr_hep_b1", cr_hep_b1)
                .put("cr_hep_b2", cr_hep_b2)
                .put("cr_hep_bna", cr_hep_bna)
                .put("cr_opv0", cr_opv0)
                .put("cr_opv0_d1", cr_opv0_d1)
                .put("cr_opv0_d2", cr_opv0_d2)
                .put("cr_opv0_na", cr_opv0_na)
                .put("cr_opv1", cr_opv1)
                .put("cr_opv1_d1", cr_opv1_d1)
                .put("cr_opv1_d2", cr_opv1_d2)
                .put("cr_opv1_na", cr_opv1_na)
                .put("cr_opv2", cr_opv2)
                .put("cr_opv2_d1", cr_opv2_d1)
                .put("cr_opv2_d2", cr_opv2_d2)
                .put("cr_opv2_na", cr_opv2_na)
                .put("cr_opv3", cr_opv3)
                .put("cr_opv3_d1", cr_opv3_d1)
                .put("cr_opv3_d2", cr_opv3_d2)
                .put("cr_opv3_na", cr_opv3_na)
                .put("cr_rota1", cr_rota1)
                .put("cr_rota1_d1", cr_rota1_d1)
                .put("cr_rota1_d2", cr_rota1_d2)
                .put("cr_rota1_na", cr_rota1_na)
                .put("cr_rota2", cr_rota2)
                .put("cr_rota2_d1", cr_rota2_d1)
                .put("cr_rota2_d2", cr_rota2_d2)
                .put("cr_rota2_na", cr_rota2_na)
                .put("cr_ipv", cr_ipv)
                .put("cr_ipv_d1", cr_ipv_d1)
                .put("cr_ipv_d2", cr_ipv_d2)
                .put("cr_ipv_na", cr_ipv_na)
                .put("cr_pcv1", cr_pcv1)
                .put("cr_pcv1_d1", cr_pcv1_d1)
                .put("cr_pcv1_d2", cr_pcv1_d2)
                .put("cr_pcv1_na", cr_pcv1_na)
                .put("cr_pcv2", cr_pcv2)
                .put("cr_pcv2_d1", cr_pcv2_d1)
                .put("cr_pcv2_d2", cr_pcv2_d2)
                .put("cr_pcv2_na", cr_pcv2_na)
                .put("cr_pcv3", cr_pcv3)
                .put("cr_pcv3_d1", cr_pcv3_d1)
                .put("cr_pcv3_d2", cr_pcv3_d2)
                .put("cr_pcv3_na", cr_pcv3_na)
                .put("cr_penta1", cr_penta1)
                .put("cr_penta1_d1", cr_penta1_d1)
                .put("cr_penta1_d2", cr_penta1_d2)
                .put("cr_penta1_na", cr_penta1_na)
                .put("cr_penta2", cr_penta2)
                .put("cr_penta2_d1", cr_penta2_d1)
                .put("cr_penta2_d2", cr_penta2_d2)
                .put("cr_penta2_na", cr_penta2_na)
                .put("cr_penta3", cr_penta3)
                .put("cr_penta3_d1", cr_penta3_d1)
                .put("cr_penta3_d2", cr_penta3_d2)
                .put("cr_penta3_na", cr_penta3_na)
                .put("cr_measles1", cr_measles1)
                .put("cr_measles1_d1", cr_measles1_d1)
                .put("cr_measles1_d2", cr_measles1_d2)
                .put("cr_measles1_na", cr_measles1_na)
                .put("cr_measles2", cr_measles2)
                .put("cr_measles2_d1", cr_measles2_d1)
                .put("cr_measles2_d2", cr_measles2_d2)
                .put("cr_measles2_na", cr_measles2_na)
                .put("cr_birth_status", cr_birth_status)
                .put("cr_comments", cr_comments);

        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormCRTable.COLUMN_ID, this.id);
        json.put(FormCRTable.COLUMN_UID, this.uid);
        json.put(FormCRTable.COLUMN_USERNAME, this.userName);
        json.put(FormCRTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormCRTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormCRTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormCRTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormCRTable.COLUMN_SYNCED, this.synced);
        json.put(FormCRTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(FormCRTable.COLUMN_CR, new JSONObject(cRtoString()));
        json.put(FormCRTable.COLUMN_END_TIME, this.endTime);
        json.put(FormCRTable.COLUMN_START_TIME, this.startTime);


        if (this.cR != null && !this.cR.equals("")) {
            json.put(FormCRTable.COLUMN_CR, new JSONObject(this.cR));
        }

        return json;

    }
}
