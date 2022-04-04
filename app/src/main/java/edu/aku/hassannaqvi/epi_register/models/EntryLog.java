package edu.aku.hassannaqvi.epi_register.models;

import static edu.aku.hassannaqvi.epi_register.core.MainApp.PROJECT_NAME;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.epi_register.BR;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.epi_register.core.MainApp;


public class EntryLog extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    private String uuid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String entryDate = StringUtils.EMPTY;         //
    private String psuCode = StringUtils.EMPTY;
    private String hhid = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;            //
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;        //
    private String entryType = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;

    public EntryLog() {


    }


    public void populateMeta() {

        setProjectName(PROJECT_NAME);
        setUuid(MainApp.cr.getUid());  // not applicable in Form table
        setUserName(MainApp.user.getUserName());
        setSysDate(MainApp.cr.getSysDate());
        setEntryDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
//        setPsuCode(MainApp.form.getPsuCode());
        setiStatus(MainApp.cr.getiStatus());
        setiStatus96x(MainApp.cr.getiStatus96x());
        setAppver(MainApp.appInfo.getAppVersion());
        setDeviceId(MainApp.deviceid);

    }


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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    @Bindable
    public String getPsuCode() {
        return psuCode;
    }

    public void setPsuCode(String psuCode) {
        this.psuCode = psuCode;
        notifyPropertyChanged(BR.psuCode);
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
/*

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }
*/

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
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

    public EntryLog Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_PSU_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYSDATE));
        this.entryDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ENTRY_DATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_DEVICEID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(EntryLogTable.COLUMN_SYNC_DATE));

        return this;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(EntryLogTable.COLUMN_ID, this.id);
        json.put(EntryLogTable.COLUMN_UID, this.uid);
        json.put(EntryLogTable.COLUMN_UUID, this.uuid);
        json.put(EntryLogTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(EntryLogTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(EntryLogTable.COLUMN_USERNAME, this.userName);
        json.put(EntryLogTable.COLUMN_SYSDATE, this.sysDate);
        json.put(EntryLogTable.COLUMN_ENTRY_DATE, this.entryDate);
        json.put(EntryLogTable.COLUMN_DEVICEID, this.deviceId);
        json.put(EntryLogTable.COLUMN_ISTATUS, this.iStatus);
        json.put(EntryLogTable.COLUMN_ISTATUS96x, this.iStatus96x);
        json.put(EntryLogTable.COLUMN_SYNCED, this.synced);
        json.put(EntryLogTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(EntryLogTable.COLUMN_APPVERSION, this.appver);
        return json;
    }


}
