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
    private final String cr_dmu_register = StringUtils.EMPTY;
    private final String cr_reg_number = StringUtils.EMPTY;
    private final String cr_page_number = StringUtils.EMPTY;
    private final String cr_rsno = StringUtils.EMPTY;
    private final String cr_card_number = StringUtils.EMPTY;
    private final String cr_child_name = StringUtils.EMPTY;
    private final String cr_father_name = StringUtils.EMPTY;
    private final String cr_age_months = StringUtils.EMPTY;
    private final String cr_age_years = StringUtils.EMPTY;
    private final String cr_age_days = StringUtils.EMPTY;
    private final String cr_gender = StringUtils.EMPTY;
    private final String cr_address = StringUtils.EMPTY;
    private final String cr_address_previous = StringUtils.EMPTY;
    private final String cr_phone = StringUtils.EMPTY;
    private final String cr_bcg = StringUtils.EMPTY;
    private final String cr_bcg_d = StringUtils.EMPTY;
    private final String cr_bcg_d1 = StringUtils.EMPTY;
    private final String cr_bcg_d2 = StringUtils.EMPTY;
    private final String cr_hep_b = StringUtils.EMPTY;
    private final String cr_hep_bd = StringUtils.EMPTY;
    private final String cr_hep_b1 = StringUtils.EMPTY;
    private final String cr_hep_b2 = StringUtils.EMPTY;
    private final String cr_opv0 = StringUtils.EMPTY;
    private final String cr_opv0_d = StringUtils.EMPTY;
    private final String cr_opv0_d1 = StringUtils.EMPTY;
    private final String cr_opv0_d2 = StringUtils.EMPTY;
    private final String cr_opv1 = StringUtils.EMPTY;
    private final String cr_opv1_d = StringUtils.EMPTY;
    private final String cr_opv1_d1 = StringUtils.EMPTY;
    private final String cr_opv1_d2 = StringUtils.EMPTY;
    private final String cr_opv2 = StringUtils.EMPTY;
    private final String cr_opv2_d = StringUtils.EMPTY;
    private final String cr_opv2_d1 = StringUtils.EMPTY;
    private final String cr_opv2_d2 = StringUtils.EMPTY;
    private final String cr_opv3 = StringUtils.EMPTY;
    private final String cr_opv3_d = StringUtils.EMPTY;
    private final String cr_opv3_d1 = StringUtils.EMPTY;
    private final String cr_opv3_d2 = StringUtils.EMPTY;
    private final String cr_rota1 = StringUtils.EMPTY;
    private final String cr_rota1_d = StringUtils.EMPTY;
    private final String cr_rota1_d1 = StringUtils.EMPTY;
    private final String cr_rota1_d2 = StringUtils.EMPTY;
    private final String cr_rota2 = StringUtils.EMPTY;
    private final String cr_rota2_d = StringUtils.EMPTY;
    private final String cr_rota2_d1 = StringUtils.EMPTY;
    private final String cr_rota2_d2 = StringUtils.EMPTY;
    private final String cr_ipv = StringUtils.EMPTY;
    private final String cr_ipv_d = StringUtils.EMPTY;
    private final String cr_ipv_d1 = StringUtils.EMPTY;
    private final String cr_ipv_d2 = StringUtils.EMPTY;
    private final String cr_pcv1 = StringUtils.EMPTY;
    private final String cr_pcv1_d = StringUtils.EMPTY;
    private final String cr_pcv1_d1 = StringUtils.EMPTY;
    private final String cr_pcv1_d2 = StringUtils.EMPTY;
    private final String cr_pcv2 = StringUtils.EMPTY;
    private final String cr_pcv2_d = StringUtils.EMPTY;
    private final String cr_pcv2_d1 = StringUtils.EMPTY;
    private final String cr_pcv2_d2 = StringUtils.EMPTY;
    private final String cr_pcv3 = StringUtils.EMPTY;
    private final String cr_pcv3_d = StringUtils.EMPTY;
    private final String cr_pcv3_d1 = StringUtils.EMPTY;
    private final String cr_pcv3_d2 = StringUtils.EMPTY;
    private final String cr_penta1 = StringUtils.EMPTY;
    private final String cr_penta1_d = StringUtils.EMPTY;
    private final String cr_penta1_d1 = StringUtils.EMPTY;
    private final String cr_penta1_d2 = StringUtils.EMPTY;
    private final String cr_penta2 = StringUtils.EMPTY;
    private final String cr_penta2_d = StringUtils.EMPTY;
    private final String cr_penta2_d1 = StringUtils.EMPTY;
    private final String cr_penta2_d2 = StringUtils.EMPTY;
    private final String cr_penta3 = StringUtils.EMPTY;
    private final String cr_penta3_d = StringUtils.EMPTY;
    private final String cr_penta3_d1 = StringUtils.EMPTY;
    private final String cr_penta3_d2 = StringUtils.EMPTY;
    private final String cr_measles1 = StringUtils.EMPTY;
    private final String cr_measles1_d = StringUtils.EMPTY;
    private final String cr_measles1_d1 = StringUtils.EMPTY;
    private final String cr_measles1_d2 = StringUtils.EMPTY;
    private final String cr_measles2 = StringUtils.EMPTY;
    private final String cr_measles2_d = StringUtils.EMPTY;
    private final String cr_measles2_d1 = StringUtils.EMPTY;
    private final String cr_measles2_d2 = StringUtils.EMPTY;
    private final String cr_birth_status = StringUtils.EMPTY;
    private final String cr_birth_status1 = StringUtils.EMPTY;
    private final String cr_birth_status2 = StringUtils.EMPTY;
    private final String cr_comments = StringUtils.EMPTY;
    // Section WR
    private final String wr_dmu_register = StringUtils.EMPTY;
    private final String wr_reg_number = StringUtils.EMPTY;
    private final String wr_page_number = StringUtils.EMPTY;
    private final String wr_rsno = StringUtils.EMPTY;
    private final String wr_card_number = StringUtils.EMPTY;
    private final String wr_women_name = StringUtils.EMPTY;
    private final String wr_father_name = StringUtils.EMPTY;
    private final String wr_age_years = StringUtils.EMPTY;
    private final String wr_address = StringUtils.EMPTY;
    private final String wr_address_previous = StringUtils.EMPTY;
    private final String wr_phone = StringUtils.EMPTY;
    private final String wr_ttd1 = StringUtils.EMPTY;
    private final String wr_ttd1ds = StringUtils.EMPTY;
    private final String wr_ttd1ds1 = StringUtils.EMPTY;
    private final String wr_ttd1ds2 = StringUtils.EMPTY;
    private final String wr_ttd2 = StringUtils.EMPTY;
    private final String wr_ttd2ds = StringUtils.EMPTY;
    private final String wr_ttd2ds1 = StringUtils.EMPTY;
    private final String wr_ttd2ds2 = StringUtils.EMPTY;
    private final String wr_ttd3 = StringUtils.EMPTY;
    private final String wr_ttd3ds = StringUtils.EMPTY;
    private final String wr_ttd3ds1 = StringUtils.EMPTY;
    private final String wr_ttd3ds2 = StringUtils.EMPTY;
    private final String wr_ttd4 = StringUtils.EMPTY;
    private final String wr_ttd4ds = StringUtils.EMPTY;
    private final String wr_ttd4ds1 = StringUtils.EMPTY;
    private final String wr_ttd4ds2 = StringUtils.EMPTY;
    private final String wr_ttd5 = StringUtils.EMPTY;
    private final String wr_ttd5ds = StringUtils.EMPTY;
    private final String wr_ttd5ds1 = StringUtils.EMPTY;
    private final String wr_ttd5ds2 = StringUtils.EMPTY;
    private final String wr_comments = StringUtils.EMPTY;
    private String cR = StringUtils.EMPTY;
    private String wR = StringUtils.EMPTY;


    private String h101 = StringUtils.EMPTY;
    private String h102 = StringUtils.EMPTY;
    private String h103 = StringUtils.EMPTY;
    private String h104 = StringUtils.EMPTY;
    private String h105 = StringUtils.EMPTY;
    private String h106 = StringUtils.EMPTY;


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
    public String getH101() {
        return h101;
    }

    public void setH101(String h101) {
        this.h101 = h101;
        notifyPropertyChanged(BR.h101);
    }

    @Bindable
    public String getH102() {
        return h102;
    }

    public void setH102(String h102) {
        this.h102 = h102;
        notifyPropertyChanged(BR.h102);
    }

    @Bindable
    public String getH103() {
        return h103;
    }

    public void setH103(String h103) {
        this.h103 = h103;
        setCluster(h103);
        notifyPropertyChanged(BR.h103);
    }

    @Bindable
    public String getH104() {
        return h104;
    }

    public void setH104(String h104) {
        this.h104 = h104;
        setHhid(h104);
        notifyPropertyChanged(BR.h104);
    }

    @Bindable
    public String getH105() {
        return h105;
    }

    public void setH105(String h105) {
        this.h105 = h105;
        notifyPropertyChanged(BR.h105);
    }

    @Bindable
    public String getH106() {
        return h106;
    }

    public void setH106(String h106) {
        this.h106 = h106;
        notifyPropertyChanged(BR.h106);
    }


    public Form Hydrate(Cursor cursor) throws JSONException {
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

        sH1Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH1)));

        return this;
    }

    public void sH1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH1Hydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.h101 = json.getString("h101");
            this.h102 = json.getString("h102");
            this.h103 = json.getString("h103");
            this.h104 = json.getString("h104");
            this.h105 = json.getString("h105");
            this.h106 = json.getString("h106d");
        }
    }

    public String sH1toString() throws JSONException {
        Log.d(TAG, "sH1toString: ");
        JSONObject json = new JSONObject();

        json.put("h101", h101)
                .put("h102", h102)
                .put("h103", h103)
                .put("h104", h104)
                .put("h105", h105)
                .put("h106d", h106);

        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

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

        // Household

        json.put(FormsTable.COLUMN_SH1, new JSONObject(sH1toString()));


        return json;
    }
}
