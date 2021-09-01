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
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.epi_register.core.MainApp;

public class Form extends BaseObservable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String cluster = StringUtils.EMPTY;
    private String hhid = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
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
    private String cr_bcg = StringUtils.EMPTY;
    private String cr_bcg_d = StringUtils.EMPTY;
    private String cr_bcg_d1 = StringUtils.EMPTY;
    private String cr_bcg_d2 = StringUtils.EMPTY;
    private String cr_hep_b = StringUtils.EMPTY;
    private String cr_hep_bd = StringUtils.EMPTY;
    private String cr_hep_b1 = StringUtils.EMPTY;
    private String cr_hep_b2 = StringUtils.EMPTY;
    private String cr_opv0 = StringUtils.EMPTY;
    private String cr_opv0_d = StringUtils.EMPTY;
    private String cr_opv0_d1 = StringUtils.EMPTY;
    private String cr_opv0_d2 = StringUtils.EMPTY;
    private String cr_opv1 = StringUtils.EMPTY;
    private String cr_opv1_d = StringUtils.EMPTY;
    private String cr_opv1_d1 = StringUtils.EMPTY;
    private String cr_opv1_d2 = StringUtils.EMPTY;
    private String cr_opv2 = StringUtils.EMPTY;
    private String cr_opv2_d = StringUtils.EMPTY;
    private String cr_opv2_d1 = StringUtils.EMPTY;
    private String cr_opv2_d2 = StringUtils.EMPTY;
    private String cr_opv3 = StringUtils.EMPTY;
    private String cr_opv3_d = StringUtils.EMPTY;
    private String cr_opv3_d1 = StringUtils.EMPTY;
    private String cr_opv3_d2 = StringUtils.EMPTY;
    private String cr_rota1 = StringUtils.EMPTY;
    private String cr_rota1_d = StringUtils.EMPTY;
    private String cr_rota1_d1 = StringUtils.EMPTY;
    private String cr_rota1_d2 = StringUtils.EMPTY;
    private String cr_rota2 = StringUtils.EMPTY;
    private String cr_rota2_d = StringUtils.EMPTY;
    private String cr_rota2_d1 = StringUtils.EMPTY;
    private String cr_rota2_d2 = StringUtils.EMPTY;
    private String cr_ipv = StringUtils.EMPTY;
    private String cr_ipv_d = StringUtils.EMPTY;
    private String cr_ipv_d1 = StringUtils.EMPTY;
    private String cr_ipv_d2 = StringUtils.EMPTY;
    private String cr_pcv1 = StringUtils.EMPTY;
    private String cr_pcv1_d = StringUtils.EMPTY;
    private String cr_pcv1_d1 = StringUtils.EMPTY;
    private String cr_pcv1_d2 = StringUtils.EMPTY;
    private String cr_pcv2 = StringUtils.EMPTY;
    private String cr_pcv2_d = StringUtils.EMPTY;
    private String cr_pcv2_d1 = StringUtils.EMPTY;
    private String cr_pcv2_d2 = StringUtils.EMPTY;
    private String cr_pcv3 = StringUtils.EMPTY;
    private String cr_pcv3_d = StringUtils.EMPTY;
    private String cr_pcv3_d1 = StringUtils.EMPTY;
    private String cr_pcv3_d2 = StringUtils.EMPTY;
    private String cr_penta1 = StringUtils.EMPTY;
    private String cr_penta1_d = StringUtils.EMPTY;
    private String cr_penta1_d1 = StringUtils.EMPTY;
    private String cr_penta1_d2 = StringUtils.EMPTY;
    private String cr_penta2 = StringUtils.EMPTY;
    private String cr_penta2_d = StringUtils.EMPTY;
    private String cr_penta2_d1 = StringUtils.EMPTY;
    private String cr_penta2_d2 = StringUtils.EMPTY;
    private String cr_penta3 = StringUtils.EMPTY;
    private String cr_penta3_d = StringUtils.EMPTY;
    private String cr_penta3_d1 = StringUtils.EMPTY;
    private String cr_penta3_d2 = StringUtils.EMPTY;
    private String cr_measles1 = StringUtils.EMPTY;
    private String cr_measles1_d = StringUtils.EMPTY;
    private String cr_measles1_d1 = StringUtils.EMPTY;
    private String cr_measles1_d2 = StringUtils.EMPTY;
    private String cr_measles2 = StringUtils.EMPTY;
    private String cr_measles2_d = StringUtils.EMPTY;
    private String cr_measles2_d1 = StringUtils.EMPTY;
    private String cr_measles2_d2 = StringUtils.EMPTY;
    private String cr_birth_status = StringUtils.EMPTY;
    private String cr_comments = StringUtils.EMPTY;
    // Section WR
    private String wr_dmu_register = StringUtils.EMPTY;
    private String wr_reg_number = StringUtils.EMPTY;
    private String wr_page_number = StringUtils.EMPTY;
    private String wr_rsno = StringUtils.EMPTY;
    private String wr_card_number = StringUtils.EMPTY;
    private String wr_women_name = StringUtils.EMPTY;
    private String wr_husband_name = StringUtils.EMPTY;
    private String wr_age_years = StringUtils.EMPTY;
    private String wr_address = StringUtils.EMPTY;
    private String wr_address_previous = StringUtils.EMPTY;
    private String wr_phone = StringUtils.EMPTY;
    private String wr_ttd1 = StringUtils.EMPTY;
    private String wr_ttd1ds = StringUtils.EMPTY;
    private String wr_ttd1ds1 = StringUtils.EMPTY;
    private String wr_ttd1ds2 = StringUtils.EMPTY;
    private String wr_ttd2 = StringUtils.EMPTY;
    private String wr_ttd2ds = StringUtils.EMPTY;
    private String wr_ttd2ds1 = StringUtils.EMPTY;
    private String wr_ttd2ds2 = StringUtils.EMPTY;
    private String wr_ttd3 = StringUtils.EMPTY;
    private String wr_ttd3ds = StringUtils.EMPTY;
    private String wr_ttd3ds1 = StringUtils.EMPTY;
    private String wr_ttd3ds2 = StringUtils.EMPTY;
    private String wr_ttd4 = StringUtils.EMPTY;
    private String wr_ttd4ds = StringUtils.EMPTY;
    private String wr_ttd4ds1 = StringUtils.EMPTY;
    private String wr_ttd4ds2 = StringUtils.EMPTY;
    private String wr_ttd5 = StringUtils.EMPTY;
    private String wr_ttd5ds = StringUtils.EMPTY;
    private String wr_ttd5ds1 = StringUtils.EMPTY;
    private String wr_ttd5ds2 = StringUtils.EMPTY;
    private String wr_comments = StringUtils.EMPTY;
    private String cR = StringUtils.EMPTY;
    private String wR = StringUtils.EMPTY;


/*
    private synchronized void notifyChange(int propertyId) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.notifyChange(this, propertyId);
    }

    @Override
    public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.add(callback);

    }

    @Override
    public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry != null) {
            propertyChangeRegistry.remove(callback);
        }
    }*/


    public Form() {

    }

/*    public PropertyChangeRegistry getPropertyChangeRegistry() {
        return propertyChangeRegistry;
    }

    public void setPropertyChangeRegistry(PropertyChangeRegistry propertyChangeRegistry) {
        this.propertyChangeRegistry = propertyChangeRegistry;
    }*/

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

    @Bindable
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
        notifyPropertyChanged(BR.cluster);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
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

   /* public String getsH2a() {
        return sH2a;
    }

    public void setsH2a(String sH2a) {
        this.sH2a = sH2a;
    }*/

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

    public String getwR() {
        return wR;
    }

    public void setwR(String wR) {
        this.wR = wR;
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
    public String getWr_dmu_register() {
        return wr_dmu_register;
    }

    public void setWr_dmu_register(String wr_dmu_register) {
        this.wr_dmu_register = wr_dmu_register;
        notifyPropertyChanged(BR.wr_dmu_register);
    }

    @Bindable
    public String getWr_reg_number() {
        return wr_reg_number;
    }

    public void setWr_reg_number(String wr_reg_number) {
        this.wr_reg_number = wr_reg_number;
        notifyPropertyChanged(BR.wr_reg_number);
    }

    @Bindable
    public String getWr_page_number() {
        return wr_page_number;
    }

    public void setWr_page_number(String wr_page_number) {
        this.wr_page_number = wr_page_number;
        notifyPropertyChanged(BR.wr_page_number);
    }

    @Bindable
    public String getWr_rsno() {
        return wr_rsno;
    }

    public void setWr_rsno(String wr_rsno) {
        this.wr_rsno = wr_rsno;
        notifyPropertyChanged(BR.wr_rsno);
    }

    @Bindable
    public String getWr_card_number() {
        return wr_card_number;
    }

    public void setWr_card_number(String wr_card_number) {
        this.wr_card_number = wr_card_number;
        notifyPropertyChanged(BR.wr_card_number);
    }

    @Bindable
    public String getWr_women_name() {
        return wr_women_name;
    }

    public void setWr_women_name(String wr_women_name) {
        this.wr_women_name = wr_women_name;
        notifyPropertyChanged(BR.wr_women_name);
    }

    @Bindable
    public String getWr_husband_name() {
        return wr_husband_name;
    }

    public void setWr_husband_name(String wr_husband_name) {
        this.wr_husband_name = wr_husband_name;
        notifyPropertyChanged(BR.wr_husband_name);
    }

    @Bindable
    public String getWr_age_years() {
        return wr_age_years;
    }

    public void setWr_age_years(String wr_age_years) {
        this.wr_age_years = wr_age_years;
        notifyPropertyChanged(BR.wr_age_years);
    }

    @Bindable
    public String getWr_address() {
        return wr_address;
    }

    public void setWr_address(String wr_address) {
        this.wr_address = wr_address;
        notifyPropertyChanged(BR.wr_address);
    }

    @Bindable
    public String getWr_address_previous() {
        return wr_address_previous;
    }

    public void setWr_address_previous(String wr_address_previous) {
        this.wr_address_previous = wr_address_previous;
        notifyPropertyChanged(BR.wr_address_previous);
    }

    @Bindable
    public String getWr_phone() {
        return wr_phone;
    }

    public void setWr_phone(String wr_phone) {
        this.wr_phone = wr_phone;
        notifyPropertyChanged(BR.wr_phone);
    }

    @Bindable
    public String getWr_ttd1() {
        return wr_ttd1;
    }

    public void setWr_ttd1(String wr_ttd1) {
        this.wr_ttd1 = wr_ttd1;
        notifyPropertyChanged(BR.wr_ttd1);
    }

    @Bindable
    public String getWr_ttd1ds() {
        return wr_ttd1ds;
    }

    public void setWr_ttd1ds(String wr_ttd1ds) {
        this.wr_ttd1ds = wr_ttd1ds;
        notifyPropertyChanged(BR.wr_ttd1ds);
    }

    @Bindable
    public String getWr_ttd1ds1() {
        return wr_ttd1ds1;
    }

    public void setWr_ttd1ds1(String wr_ttd1ds1) {
        this.wr_ttd1ds1 = wr_ttd1ds1;
        notifyPropertyChanged(BR.wr_ttd1ds1);
    }

    @Bindable
    public String getWr_ttd1ds2() {
        return wr_ttd1ds2;
    }

    public void setWr_ttd1ds2(String wr_ttd1ds2) {
        this.wr_ttd1ds2 = wr_ttd1ds2;
        notifyPropertyChanged(BR.wr_ttd1ds2);
    }

    @Bindable
    public String getWr_ttd2() {
        return wr_ttd2;
    }

    public void setWr_ttd2(String wr_ttd2) {
        this.wr_ttd2 = wr_ttd2;
        notifyPropertyChanged(BR.wr_ttd2);
    }

    @Bindable
    public String getWr_ttd2ds() {
        return wr_ttd2ds;
    }

    public void setWr_ttd2ds(String wr_ttd2ds) {
        this.wr_ttd2ds = wr_ttd2ds;
        notifyPropertyChanged(BR.wr_ttd2ds);
    }

    @Bindable
    public String getWr_ttd2ds1() {
        return wr_ttd2ds1;
    }

    public void setWr_ttd2ds1(String wr_ttd2ds1) {
        this.wr_ttd2ds1 = wr_ttd2ds1;
        notifyPropertyChanged(BR.wr_ttd2ds1);
    }

    @Bindable
    public String getWr_ttd2ds2() {
        return wr_ttd2ds2;
    }

    public void setWr_ttd2ds2(String wr_ttd2ds2) {
        this.wr_ttd2ds2 = wr_ttd2ds2;
        notifyPropertyChanged(BR.wr_ttd2ds2);
    }

    @Bindable
    public String getWr_ttd3() {
        return wr_ttd3;
    }

    public void setWr_ttd3(String wr_ttd3) {
        this.wr_ttd3 = wr_ttd3;
        notifyPropertyChanged(BR.wr_ttd3);
    }

    @Bindable
    public String getWr_ttd3ds() {
        return wr_ttd3ds;
    }

    public void setWr_ttd3ds(String wr_ttd3ds) {
        this.wr_ttd3ds = wr_ttd3ds;
        notifyPropertyChanged(BR.wr_ttd3ds);
    }

    @Bindable
    public String getWr_ttd3ds1() {
        return wr_ttd3ds1;
    }

    public void setWr_ttd3ds1(String wr_ttd3ds1) {
        this.wr_ttd3ds1 = wr_ttd3ds1;
        notifyPropertyChanged(BR.wr_ttd3ds1);
    }

    @Bindable
    public String getWr_ttd3ds2() {
        return wr_ttd3ds2;
    }

    public void setWr_ttd3ds2(String wr_ttd3ds2) {
        this.wr_ttd3ds2 = wr_ttd3ds2;
        notifyPropertyChanged(BR.wr_ttd3ds2);
    }

    @Bindable
    public String getWr_ttd4() {
        return wr_ttd4;
    }

    public void setWr_ttd4(String wr_ttd4) {
        this.wr_ttd4 = wr_ttd4;
        notifyPropertyChanged(BR.wr_ttd4);
    }

    @Bindable
    public String getWr_ttd4ds() {
        return wr_ttd4ds;
    }

    public void setWr_ttd4ds(String wr_ttd4ds) {
        this.wr_ttd4ds = wr_ttd4ds;
        notifyPropertyChanged(BR.wr_ttd4ds);
    }

    @Bindable
    public String getWr_ttd4ds1() {
        return wr_ttd4ds1;
    }

    public void setWr_ttd4ds1(String wr_ttd4ds1) {
        this.wr_ttd4ds1 = wr_ttd4ds1;
        notifyPropertyChanged(BR.wr_ttd4ds1);
    }

    @Bindable
    public String getWr_ttd4ds2() {
        return wr_ttd4ds2;
    }

    public void setWr_ttd4ds2(String wr_ttd4ds2) {
        this.wr_ttd4ds2 = wr_ttd4ds2;
        notifyPropertyChanged(BR.wr_ttd4ds2);
    }

    @Bindable
    public String getWr_ttd5() {
        return wr_ttd5;
    }

    public void setWr_ttd5(String wr_ttd5) {
        this.wr_ttd5 = wr_ttd5;
        notifyPropertyChanged(BR.wr_ttd5);
    }

    @Bindable
    public String getWr_ttd5ds() {
        return wr_ttd5ds;
    }

    public void setWr_ttd5ds(String wr_ttd5ds) {
        this.wr_ttd5ds = wr_ttd5ds;
        notifyPropertyChanged(BR.wr_ttd5ds);
    }

    @Bindable
    public String getWr_ttd5ds1() {
        return wr_ttd5ds1;
    }

    public void setWr_ttd5ds1(String wr_ttd5ds1) {
        this.wr_ttd5ds1 = wr_ttd5ds1;
        notifyPropertyChanged(BR.wr_ttd5ds1);
    }

    @Bindable
    public String getWr_ttd5ds2() {
        return wr_ttd5ds2;
    }

    public void setWr_ttd5ds2(String wr_ttd5ds2) {
        this.wr_ttd5ds2 = wr_ttd5ds2;
        notifyPropertyChanged(BR.wr_ttd5ds2);
    }

    @Bindable
    public String getWr_comments() {
        return wr_comments;
    }

    public void setWr_comments(String wr_comments) {
        this.wr_comments = wr_comments;
        notifyPropertyChanged(BR.wr_comments);
    }

    public Form Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.cluster = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_CLUSTER));
        this.hhid = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));
        cRHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_CR)));
        wRHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_WR)));

        return this;
    }

    public void cRHydrate(String string) {
        Log.d(TAG, "cRHydrate: " + string);
        if (string != null) {
            try {
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
                this.cr_bcg = json.getString("cr_bcg");
                this.cr_bcg_d1 = json.getString("cr_bcg_d1");
                this.cr_bcg_d2 = json.getString("cr_bcg_d2");
                this.cr_hep_b = json.getString("cr_hep_b");
                this.cr_hep_b1 = json.getString("cr_hep_b1");
                this.cr_hep_b2 = json.getString("cr_hep_b2");
                this.cr_opv0 = json.getString("cr_opv0");
                this.cr_opv0_d1 = json.getString("cr_opv0_d1");
                this.cr_opv0_d2 = json.getString("cr_opv0_d2");
                this.cr_opv1 = json.getString("cr_opv1");
                this.cr_opv1_d1 = json.getString("cr_opv1_d1");
                this.cr_opv1_d2 = json.getString("cr_opv1_d2");
                this.cr_opv2 = json.getString("cr_opv2");
                this.cr_opv2_d1 = json.getString("cr_opv2_d1");
                this.cr_opv2_d2 = json.getString("cr_opv2_d2");
                this.cr_opv3 = json.getString("cr_opv3");
                this.cr_opv3_d1 = json.getString("cr_opv3_d1");
                this.cr_opv3_d2 = json.getString("cr_opv3_d2");
                this.cr_rota1 = json.getString("cr_rota1");
                this.cr_rota1_d1 = json.getString("cr_rota1_d1");
                this.cr_rota1_d2 = json.getString("cr_rota1_d2");
                this.cr_rota2 = json.getString("cr_rota2");
                this.cr_rota2_d1 = json.getString("cr_rota2_d1");
                this.cr_rota2_d2 = json.getString("cr_rota2_d2");
                this.cr_ipv = json.getString("cr_ipv");
                this.cr_ipv_d1 = json.getString("cr_ipv_d1");
                this.cr_ipv_d2 = json.getString("cr_ipv_d2");
                this.cr_pcv1 = json.getString("cr_pcv1");
                this.cr_pcv1_d1 = json.getString("cr_pcv1_d1");
                this.cr_pcv1_d2 = json.getString("cr_pcv1_d2");
                this.cr_pcv2 = json.getString("cr_pcv2");
                this.cr_pcv2_d1 = json.getString("cr_pcv2_d1");
                this.cr_pcv2_d1 = json.getString("cr_pcv2_d1");
                this.cr_pcv3 = json.getString("cr_pcv3");
                this.cr_pcv3_d1 = json.getString("cr_pcv3_d1");
                this.cr_pcv3_d2 = json.getString("cr_pcv3_d2");
                this.cr_penta1 = json.getString("cr_penta1");
                this.cr_penta1_d1 = json.getString("cr_penta1_d1");
                this.cr_penta1_d2 = json.getString("cr_penta1_d2");
                this.cr_penta2 = json.getString("cr_penta2");
                this.cr_penta2_d1 = json.getString("cr_penta2_d1");
                this.cr_penta2_d2 = json.getString("cr_penta2_d2");
                this.cr_penta3 = json.getString("cr_penta3");
                this.cr_penta3_d1 = json.getString("cr_penta3_d1");
                this.cr_penta3_d2 = json.getString("cr_penta3_d2");
                this.cr_measles1 = json.getString("cr_measles1");
                this.cr_measles1_d1 = json.getString("cr_measles1_d1");
                this.cr_measles1_d2 = json.getString("cr_measles1_d2");
                this.cr_measles2 = json.getString("cr_measles2");
                this.cr_measles2_d1 = json.getString("cr_measles2_d1");
                this.cr_measles2_d2 = json.getString("cr_measles2_d2");
                this.cr_comments = json.getString("cr_comments");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void wRHydrate(String string) {
        Log.d(TAG, "wRHydrate: " + string);
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.wr_dmu_register = json.getString("wr_dmu_register");
                this.wr_reg_number = json.getString("wr_reg_number");
                this.wr_page_number = json.getString("wr_page_number");
                this.wr_rsno = json.getString("wr_rsno");
                this.wr_card_number = json.getString("wr_card_number");
                this.wr_women_name = json.getString("wr_women_name");
                this.wr_husband_name = json.getString("wr_husband_name");
                this.wr_age_years = json.getString("wr_age_years");
                this.wr_address = json.getString("wr_address");
                this.wr_phone = json.getString("wr_phone");
                this.wr_ttd1 = json.getString("wr_ttd1");
                this.wr_ttd1ds1 = json.getString("wr_ttd1ds1");
                this.wr_ttd1ds2 = json.getString("wr_ttd1ds2");
                this.wr_ttd2 = json.getString("wr_ttd2");
                this.wr_ttd2ds1 = json.getString("wr_ttd2ds1");
                this.wr_ttd2ds2 = json.getString("wr_ttd2ds2");
                this.wr_ttd3 = json.getString("wr_ttd3");
                this.wr_ttd3ds1 = json.getString("wr_ttd3ds1");
                this.wr_ttd3ds2 = json.getString("wr_ttd3ds2");
                this.wr_ttd4 = json.getString("wr_ttd4");
                this.wr_ttd4ds1 = json.getString("wr_ttd4ds1");
                this.wr_ttd4ds2 = json.getString("wr_ttd4ds2");
                this.wr_ttd5 = json.getString("wr_ttd5");
                this.wr_ttd5ds1 = json.getString("wr_ttd5ds1");
                this.wr_ttd5ds2 = json.getString("wr_ttd5ds2");
                this.wr_comments = json.getString("wr_comments");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public String cRtoString() {
        Log.d(TAG, "cRtoString: ");
        JSONObject json = new JSONObject();

        try {
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
                    .put("cr_bcg", cr_bcg)
                    .put("cr_bcg_d1", cr_bcg_d1)
                    .put("cr_bcg_d2", cr_bcg_d2)
                    .put("cr_hep_b", cr_hep_b)
                    .put("cr_hep_b1", cr_hep_b1)
                    .put("cr_hep_b2", cr_hep_b2)
                    .put("cr_opv0", cr_opv0)
                    .put("cr_opv0_d1", cr_opv0_d1)
                    .put("cr_opv0_d2", cr_opv0_d2)
                    .put("cr_opv1", cr_opv1)
                    .put("cr_opv1_d1", cr_opv1_d1)
                    .put("cr_opv1_d2", cr_opv1_d2)
                    .put("cr_opv2", cr_opv2)
                    .put("cr_opv2_d1", cr_opv2_d1)
                    .put("cr_opv2_d2", cr_opv2_d2)
                    .put("cr_opv3", cr_opv3)
                    .put("cr_opv3_d1", cr_opv3_d1)
                    .put("cr_opv3_d2", cr_opv3_d2)
                    .put("cr_rota1", cr_rota1)
                    .put("cr_rota1_d1", cr_rota1_d1)
                    .put("cr_rota1_d2", cr_rota1_d2)
                    .put("cr_rota2", cr_rota2)
                    .put("cr_rota2_d1", cr_rota2_d1)
                    .put("cr_rota2_d2", cr_rota2_d2)
                    .put("cr_ipv", cr_ipv)
                    .put("cr_ipv_d1", cr_ipv_d1)
                    .put("cr_ipv_d2", cr_ipv_d2)
                    .put("cr_pcv1", cr_pcv1)
                    .put("cr_pcv1_d1", cr_pcv1_d1)
                    .put("cr_pcv1_d2", cr_pcv1_d2)
                    .put("cr_pcv2", cr_pcv2)
                    .put("cr_pcv2_d1", cr_pcv2_d1)
                    .put("cr_pcv2_d1", cr_pcv2_d1)
                    .put("cr_pcv3", cr_pcv3)
                    .put("cr_pcv3_d1", cr_pcv3_d1)
                    .put("cr_pcv3_d2", cr_pcv3_d2)
                    .put("cr_penta1", cr_penta1)
                    .put("cr_penta1_d1", cr_penta1_d1)
                    .put("cr_penta1_d2", cr_penta1_d2)
                    .put("cr_penta2", cr_penta2)
                    .put("cr_penta2_d1", cr_penta2_d1)
                    .put("cr_penta2_d2", cr_penta2_d2)
                    .put("cr_penta3", cr_penta3)
                    .put("cr_penta3_d1", cr_penta3_d1)
                    .put("cr_penta3_d2", cr_penta3_d2)
                    .put("cr_measles1", cr_measles1)
                    .put("cr_measles1_d1", cr_measles1_d1)
                    .put("cr_measles1_d2", cr_measles1_d2)
                    .put("cr_measles2", cr_measles2)
                    .put("cr_measles2_d1", cr_measles2_d1)
                    .put("cr_measles2_d2", cr_measles2_d2)
                    .put("cr_comments", cr_comments);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public String wRtoString() throws JSONException {
        Log.d(TAG, "wRtoString: ");
        JSONObject json = new JSONObject();
        try {
            json.put("wr_dmu_register", wr_dmu_register)
                    .put("wr_reg_number", wr_reg_number)
                    .put("wr_page_number", wr_page_number)
                    .put("wr_rsno", wr_rsno)
                    .put("wr_card_number", wr_card_number)
                    .put("wr_women_name", wr_women_name)
                    .put("wr_husband_name", wr_husband_name)
                    .put("wr_age_years", wr_age_years)
                    .put("wr_address", wr_address)
                    .put("wr_phone", wr_phone)
                    .put("wr_ttd1", wr_ttd1)
                    .put("wr_ttd1ds1", wr_ttd1ds1)
                    .put("wr_ttd1ds2", wr_ttd1ds2)
                    .put("wr_ttd2", wr_ttd2)
                    .put("wr_ttd2ds1", wr_ttd2ds1)
                    .put("wr_ttd2ds2", wr_ttd2ds2)
                    .put("wr_ttd3", wr_ttd3)
                    .put("wr_ttd3ds1", wr_ttd3ds1)
                    .put("wr_ttd3ds2", wr_ttd3ds2)
                    .put("wr_ttd4", wr_ttd4)
                    .put("wr_ttd4ds1", wr_ttd4ds1)
                    .put("wr_ttd4ds2", wr_ttd4ds2)
                    .put("wr_ttd5", wr_ttd5)
                    .put("wr_ttd5ds1", wr_ttd5ds1)
                    .put("wr_ttd5ds2", wr_ttd5ds2)
                    .put("wr_comments", wr_comments);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsTable.COLUMN_ID, this.id);
            json.put(FormsTable.COLUMN_UID, this.uid);
            json.put(FormsTable.COLUMN_CLUSTER, this.cluster);
            json.put(FormsTable.COLUMN_HHID, this.hhid);
            json.put(FormsTable.COLUMN_USERNAME, this.userName);
            json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
            json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
            json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
            //  json.put(FormsTable.COLUMN_SYNCED, this.synced);
            //  json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);

            // Sections
            json.put(FormsTable.COLUMN_CR, new JSONObject(cRtoString()));
            json.put(FormsTable.COLUMN_WR, new JSONObject(wRtoString()));


            if (this.cR != null && !this.cR.equals("")) {
                json.put(FormsTable.COLUMN_CR, new JSONObject(this.cR));
            }

            if (this.wR != null && !this.wR.equals("")) {
                json.put(FormsTable.COLUMN_WR, new JSONObject(this.wR));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
