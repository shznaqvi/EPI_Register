package edu.aku.hassannaqvi.epi_register.core;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Clear;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.List;

import edu.aku.hassannaqvi.epi_register.BuildConfig;
import edu.aku.hassannaqvi.epi_register.R;
import edu.aku.hassannaqvi.epi_register.models.FormCR;
import edu.aku.hassannaqvi.epi_register.models.FormWR;
import edu.aku.hassannaqvi.epi_register.models.Users;


public class MainApp extends Application {

    public static final String PROJECT_NAME = "epi_register";
    public static final String DIST_ID = null;
    public static final String SYNC_LOGIN = "sync_login";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    //public static final String _IP = "http://f38158/prosystem";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/" + PROJECT_NAME + "/api/";// .TEST server;
    public static final String _SERVER_URL = "sync.php";
    public static final String _SERVER_GET_URL = "getData.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/epi_register/app/";

    //COUNTRIES
    public static int PAKISTAN = 1;
    public static int TAJIKISTAN = 3;


    public static File sdDir;
    public static String[] downloadData;
    public static FormCR cr;
    public static FormWR wr;

    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String deviceid;
    public static int versionCode = BuildConfig.VERSION_CODE;
    public static String versionName = BuildConfig.VERSION_NAME;
    public static int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 2;
    public static long TWO_MINUTES = 1000 * 60 * 2;
    public static boolean permissionCheck = false;
    public static int idType = 0;
    public static boolean mwraComplete;
    public static boolean childComplete;
    public static boolean pregComplete;

    public static int mwraCount = 0;
    public static int childCount = 0;
    public static int pregCount = 0;
    public static String selectedFemale = "";
    public static String selectedChild = "";
    public static String selectedPreg = "";
    public static int mwraCountComplete = 0;
    public static int childCountComplete = 0;
    public static int pregCountComplete = 0;
    public static List<String> subjectNames;
    public static String crAddress;
    public static String wrAddress;
    private static final String TAG = "MainApp";
    public static String IBAHC = "";


    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public static String getDeviceId(Context context) {
        String deviceId;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            deviceId = Settings.Secure.getString(
                    context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        } else {
           /* final TelephonyManager mTelephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (mTelephony.getDeviceId() != null) {
                deviceId = mTelephony.getDeviceId();
            } else {
                deviceId = Settings.Secure.getString(
                        context.getContentResolver(),
                        Settings.Secure.ANDROID_ID);
            }*/
        }
        return "deviceId";
    }

    @Override
    public void onCreate() {
        super.onCreate();

        /*
        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }*/

        //Initiate DateTime
        //Initializ App info
        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        editor = sharedPref.edit();
        MainApp.editor
                .putString("mh01", "")
                .apply();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        initSecure();
    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);

        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            int TRATS = bundle.getInt("YEK_TRATS");
            IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void cbCheck(CheckBox cb1, CheckBox cb2, CheckBox cb3, EditTextPicker edt) {
        cb1.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                Clear.clearAllFields(edt, false);
                cb2.setChecked(false);
                cb2.setEnabled(false);
                cb3.setChecked(false);
                cb3.setEnabled(false);
            } else {
                Clear.clearAllFields(edt, true);
                cb2.setEnabled(true);
                cb3.setEnabled(true);
            }
        });
    }

}
