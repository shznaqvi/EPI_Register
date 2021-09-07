package edu.aku.hassannaqvi.epi_register.database;

import static edu.aku.hassannaqvi.epi_register.database.CreateTable.DATABASE_NAME;
import static edu.aku.hassannaqvi.epi_register.database.CreateTable.DATABASE_VERSION;
import static edu.aku.hassannaqvi.epi_register.database.CreateTable.SQL_CREATE_FORMCR;
import static edu.aku.hassannaqvi.epi_register.database.CreateTable.SQL_CREATE_FORMWR;
import static edu.aku.hassannaqvi.epi_register.database.CreateTable.SQL_CREATE_USERS;
import static edu.aku.hassannaqvi.epi_register.database.CreateTable.SQL_CREATE_VERSIONAPP;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.FormCRTable;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.FormWRTable;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.VersionTable;
import edu.aku.hassannaqvi.epi_register.core.MainApp;
import edu.aku.hassannaqvi.epi_register.models.FormCR;
import edu.aku.hassannaqvi.epi_register.models.FormWR;
import edu.aku.hassannaqvi.epi_register.models.Users;
import edu.aku.hassannaqvi.epi_register.models.VersionApp;



/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FORMCR);
        db.execSQL(SQL_CREATE_FORMWR);
        db.execSQL(SQL_CREATE_VERSIONAPP);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }


    //ADDITION in DB
    public Long addCR(FormCR cr) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormCRTable.COLUMN_PROJECT_NAME, cr.getProjectName());
        values.put(FormCRTable.COLUMN_UID, cr.getUid());
        values.put(FormCRTable.COLUMN_USERNAME, cr.getUserName());
        values.put(FormCRTable.COLUMN_SYSDATE, cr.getSysDate());
        values.put(FormCRTable.COLUMN_ISTATUS, cr.getiStatus());
        values.put(FormCRTable.COLUMN_DEVICETAGID, cr.getDeviceTag());
        values.put(FormCRTable.COLUMN_DEVICEID, cr.getDeviceId());
        values.put(FormCRTable.COLUMN_APPVERSION, cr.getAppver());
        values.put(FormCRTable.COLUMN_START_TIME, cr.getStartTime());
        values.put(FormCRTable.COLUMN_END_TIME, cr.getEndTime());

        // Put all JSON as xxtoString()
        values.put(FormCRTable.COLUMN_CR, cr.cRtoString());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormCRTable.TABLE_NAME,
                FormCRTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addWR(FormWR wr) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FormWRTable.COLUMN_PROJECT_NAME, wr.getProjectName());
        values.put(FormWRTable.COLUMN_UID, wr.getUid());
        values.put(FormWRTable.COLUMN_USERNAME, wr.getUserName());
        values.put(FormWRTable.COLUMN_SYSDATE, wr.getSysDate());
        values.put(FormWRTable.COLUMN_ISTATUS, wr.getiStatus());
        values.put(FormWRTable.COLUMN_DEVICETAGID, wr.getDeviceTag());
        values.put(FormWRTable.COLUMN_DEVICEID, wr.getDeviceId());
        values.put(FormWRTable.COLUMN_APPVERSION, wr.getAppver());
        values.put(FormWRTable.COLUMN_START_TIME, wr.getStartTime());
        values.put(FormWRTable.COLUMN_END_TIME, wr.getEndTime());

        // Put all JSON as xxtoString()
        values.put(FormWRTable.COLUMN_WR, wr.wRtoString());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormWRTable.TABLE_NAME,
                FormWRTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updateCrColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormCRTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.cr.getId())};

        return db.update(FormCRTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updateWrColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormWRTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.wr.getId())};

        return db.update(FormWRTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormCRTable.COLUMN_ISTATUS, MainApp.cr.getiStatus());

        // Which row to update, based on the ID
        String selection = FormCRTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.cr.getId())};

        return db.update(FormCRTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    /*
     * Functions that dealing with table data
     * */
    public boolean doLogin(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                UsersTable.COLUMN_ID,
                UsersTable.COLUMN_USERNAME,
                UsersTable.COLUMN_PASSWORD,
                UsersTable.COLUMN_FULLNAME,
        };
        String whereClause = UsersTable.COLUMN_USERNAME + "=? AND " + UsersTable.COLUMN_PASSWORD + "=?";
        String[] whereArgs = {username, password};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = null;
        try {
            c = db.query(
                    UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                loggedInUser = new Users().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        MainApp.user = loggedInUser;
        return c.getCount() > 0;
    }


    public ArrayList<FormCR> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormCRTable._ID,
                FormCRTable.COLUMN_UID,
                FormCRTable.COLUMN_SYSDATE,
                FormCRTable.COLUMN_USERNAME,
                FormCRTable.COLUMN_ISTATUS,
                FormCRTable.COLUMN_SYNCED,

        };
        String whereClause = FormCRTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormCRTable.COLUMN_ID + " ASC";
        ArrayList<FormCR> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormCRTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormCR forms = new FormCR();
                forms.setId(c.getString(c.getColumnIndex(FormCRTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndex(FormCRTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndex(FormCRTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndex(FormCRTable.COLUMN_USERNAME)));
                allForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }


    // istatus examples: (1) or (1,9) or (1,3,5)
    public FormCR getFormByAssessNo(String uid, String istatus) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormCRTable.COLUMN_UID + "=? AND " +
                FormCRTable.COLUMN_ISTATUS + " in " + istatus;

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FormCRTable.COLUMN_ID + " ASC";

        FormCR allFC = null;
        try {
            c = db.query(
                    FormCRTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC = new FormCR().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    /*public int updateTemp(String assessNo, String temp) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_TSF305, temp);
        values.put(FormsTable.COLUMN_SYSDATE, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()) + "-Updated");
        values.put(FormsTable.COLUMN_ISTATUS, "1");
        values.put(FormsTable.COLUMN_SYNCED, (byte[]) null);

        String selection = FormsTable.COLUMN_ASSESMENT_NO + " =? AND " + FormsTable.COLUMN_ISTATUS + " =? ";
        // String selection = FormsTable.COLUMN_ASSESMENT_NO + " =? ";
        String[] selectionArgs = {assessNo, "9"};
        // String[] selectionArgs = {assessNo};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }*/


    public int syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VersionTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }

    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
                values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
                long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }
/*

    public int syncClusters(JSONArray clusterList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(ClustersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < clusterList.length(); i++) {

                JSONObject json = clusterList.getJSONObject(i);

                Clusters cluster = new Clusters();
                cluster.sync(json);
                ContentValues values = new ContentValues();

                values.put(ClustersTable.COLUMN_DISTRICT_NAME, cluster.getDistrictName());
                values.put(ClustersTable.COLUMN_DISTRICT_CODE, cluster.getDistrictCode());
                values.put(ClustersTable.COLUMN_CITY_NAME, cluster.getCityName());
                values.put(ClustersTable.COLUMN_CITY_CODE, cluster.getCityCode());
                values.put(ClustersTable.COLUMN_CLUSTER_NO, cluster.getClusterNo());
                long rowID = db.insert(ClustersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncClusters(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncRandom(JSONArray list) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(RandomTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < list.length(); i++) {

                JSONObject json = list.getJSONObject(i);

                RandomHH ran = new RandomHH();
                ran.sync(json);
                ContentValues values = new ContentValues();
                values.put(RandomTable.COLUMN_ID, ran.getID());
                values.put(RandomTable.COLUMN_SNO, ran.getSno());
                values.put(RandomTable.COLUMN_CLUSTER_NO, ran.getClusterNo());
                values.put(RandomTable.COLUMN_HH_NO, ran.getHhno());
                values.put(RandomTable.COLUMN_HEAD_HH, ran.getHeadhh());
                long rowID = db.insert(RandomTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncRandom(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

*/


    //get UnSyncedTables
    public JSONArray getUnsyncedFormCR() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormCRTable.COLUMN_SYNCED + " is null ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormCRTable.COLUMN_ID + " ASC";

        JSONArray allCR = new JSONArray();
        try {
            c = db.query(
                    FormCRTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                /** WorkManager Upload
                 /*Form fc = new Form();
                 allFC.add(fc.Hydrate(c));*/
                Log.d(TAG, "getUnsyncedFormCR: " + c.getCount());
                FormCR cr = new FormCR();
                allCR.put(cr.Hydrate(c).toJSONObject());
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        Log.d(TAG, "getUnsyncedFormCR: " + allCR.toString().length());
        Log.d(TAG, "getUnsyncedFormCR: " + allCR);
        return allCR;
    }

    public JSONArray getUnsyncedFormWR() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormWRTable.COLUMN_SYNCED + " is null ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormWRTable.COLUMN_ID + " ASC";

        JSONArray allWR = new JSONArray();
        try {
            c = db.query(
                    FormWRTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                /** WorkManager Upload
                 /*Form fc = new Form();
                 allFC.add(fc.Hydrate(c));*/
                Log.d(TAG, "getUnsyncedFormWR: " + c.getCount());
                FormWR wr = new FormWR();
                allWR.put(wr.Hydrate(c).toJSONObject());
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        Log.d(TAG, "getUnsyncedFormWR: " + allWR.toString().length());
        Log.d(TAG, "getUnsyncedFormWR: " + allWR);
        return allWR;
    }

    //update SyncedTables
    public void updateSyncedFormCR(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormCRTable.COLUMN_SYNCED, true);
        values.put(FormCRTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormCRTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormCRTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedFormWR(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormWRTable.COLUMN_SYNCED, true);
        values.put(FormWRTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormWRTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormWRTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }




/*    public void updateSyncedSamp(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(SamplesTable.COLUMN_SYNCED, true);
        values.put(SamplesTable.COLUMN_SYNCED_DATE, new Date().toString());

        String where = SamplesTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                SamplesTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }*/


    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }
}