package edu.aku.hassannaqvi.epi_register.database

import edu.aku.hassannaqvi.epi_register.contracts.TableContracts.*
import edu.aku.hassannaqvi.epi_register.core.MainApp.PROJECT_NAME

object CreateTable {

    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_CLUSTER + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SH1 + " TEXT,"
            + FormsTable.COLUMN_SH2B + " TEXT,"
            /*
            + FormsTable.COLUMN_SH2c + " TEXT,"
            + FormsTable.COLUMN_SH2d + " TEXT,"
            */
            + FormsTable.COLUMN_SH3A + " TEXT,"
            + FormsTable.COLUMN_SH3B + " TEXT,"
            + FormsTable.COLUMN_SH4 + " TEXT,"
            + FormsTable.COLUMN_SH5 + " TEXT,"
            + FormsTable.COLUMN_SH6 + " TEXT,"
            + FormsTable.COLUMN_SH7 + " TEXT,"

            // MWRA
            + FormsTable.COLUMN_SW1A + " TEXT,"
            + FormsTable.COLUMN_SW2 + " TEXT,"
            + FormsTable.COLUMN_SW3 + " TEXT,"
            + FormsTable.COLUMN_SW4 + " TEXT,"
            + FormsTable.COLUMN_SC1 + " TEXT,"
            + FormsTable.COLUMN_SC2 + " TEXT,"
            + FormsTable.COLUMN_SC3 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_MWRALIST = ("CREATE TABLE "
            + MWRAListTable.TABLE_NAME + "("
            + MWRAListTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + MWRAListTable.COLUMN_PROJECT_NAME + " TEXT,"
            + MWRAListTable.COLUMN_UID + " TEXT,"
            + MWRAListTable.COLUMN_UUID + " TEXT,"
            + MWRAListTable.COLUMN_CLUSTER + " TEXT,"
            + MWRAListTable.COLUMN_HHID + " TEXT,"
            + MWRAListTable.COLUMN_USERNAME + " TEXT,"
            + MWRAListTable.COLUMN_SYSDATE + " TEXT,"
            + MWRAListTable.COLUMN_INDEXED + " TEXT,"
            + MWRAListTable.COLUMN_ISTATUS + " TEXT,"
            + MWRAListTable.COLUMN_DEVICEID + " TEXT,"
            + MWRAListTable.COLUMN_DEVICETAGID + " TEXT,"
            + MWRAListTable.COLUMN_SYNCED + " TEXT,"
            + MWRAListTable.COLUMN_SYNCED_DATE + " TEXT,"
            + MWRAListTable.COLUMN_APPVERSION + " TEXT,"
            + MWRAListTable.COLUMN_S1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CHILDLIST = ("CREATE TABLE "
            + ChildListTable.TABLE_NAME + "("
            + ChildListTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ChildListTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ChildListTable.COLUMN_UID + " TEXT,"
            + ChildListTable.COLUMN_UUID + " TEXT,"
            + ChildListTable.COLUMN_MUID + " TEXT,"
            + ChildListTable.COLUMN_CLUSTER + " TEXT,"
            + ChildListTable.COLUMN_HHID + " TEXT,"
            + ChildListTable.COLUMN_USERNAME + " TEXT,"
            + ChildListTable.COLUMN_SYSDATE + " TEXT,"
            + ChildListTable.COLUMN_AGE + " TEXT,"
            + ChildListTable.COLUMN_INDEX + " TEXT,"
            + ChildListTable.COLUMN_ISTATUS + " TEXT,"
            + ChildListTable.COLUMN_DEVICEID + " TEXT,"
            + ChildListTable.COLUMN_DEVICETAGID + " TEXT,"
            + ChildListTable.COLUMN_SYNCED + " TEXT,"
            + ChildListTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ChildListTable.COLUMN_APPVERSION + " TEXT,"
            + ChildListTable.COLUMN_S1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_ANTHRO = ("CREATE TABLE "
            + AnthroTable.TABLE_NAME + "("
            + AnthroTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + AnthroTable.COLUMN_PROJECT_NAME + " TEXT,"
            + AnthroTable.COLUMN_UID + " TEXT,"
            + AnthroTable.COLUMN_UUID + " TEXT,"
            + AnthroTable.COLUMN_CLUSTER + " TEXT,"
            + AnthroTable.COLUMN_HHID + " TEXT,"
            + AnthroTable.COLUMN_USERNAME + " TEXT,"
            + AnthroTable.COLUMN_SYSDATE + " TEXT,"
            + AnthroTable.COLUMN_SUBJECTNAME + " TEXT,"
            + AnthroTable.COLUMN_ISTATUS + " TEXT,"
            + AnthroTable.COLUMN_DEVICEID + " TEXT,"
            + AnthroTable.COLUMN_DEVICETAGID + " TEXT,"
            + AnthroTable.COLUMN_SYNCED + " TEXT,"
            + AnthroTable.COLUMN_SYNCED_DATE + " TEXT,"
            + AnthroTable.COLUMN_APPVERSION + " TEXT,"
            + AnthroTable.COLUMN_S1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_BLOOD = ("CREATE TABLE "
            + BloodTable.TABLE_NAME + "("
            + BloodTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + BloodTable.COLUMN_PROJECT_NAME + " TEXT,"
            + BloodTable.COLUMN_UID + " TEXT,"
            + BloodTable.COLUMN_UUID + " TEXT,"
            + BloodTable.COLUMN_CLUSTER + " TEXT,"
            + BloodTable.COLUMN_HHID + " TEXT,"
            + BloodTable.COLUMN_USERNAME + " TEXT,"
            + BloodTable.COLUMN_SYSDATE + " TEXT,"
            + BloodTable.COLUMN_ISTATUS + " TEXT,"
            + BloodTable.COLUMN_DEVICEID + " TEXT,"
            + BloodTable.COLUMN_DEVICETAGID + " TEXT,"
            + BloodTable.COLUMN_SYNCED + " TEXT,"
            + BloodTable.COLUMN_SYNCED_DATE + " TEXT,"
            + BloodTable.COLUMN_APPVERSION + " TEXT,"
            + BloodTable.COLUMN_S1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_STOOL = ("CREATE TABLE "
            + StoolTable.TABLE_NAME + "("
            + StoolTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + StoolTable.COLUMN_PROJECT_NAME + " TEXT,"
            + StoolTable.COLUMN_UID + " TEXT,"
            + StoolTable.COLUMN_UUID + " TEXT,"
            + StoolTable.COLUMN_CLUSTER + " TEXT,"
            + StoolTable.COLUMN_HHID + " TEXT,"
            + StoolTable.COLUMN_USERNAME + " TEXT,"
            + StoolTable.COLUMN_SYSDATE + " TEXT,"
            + StoolTable.COLUMN_ISTATUS + " TEXT,"
            + StoolTable.COLUMN_DEVICEID + " TEXT,"
            + StoolTable.COLUMN_DEVICETAGID + " TEXT,"
            + StoolTable.COLUMN_SYNCED + " TEXT,"
            + StoolTable.COLUMN_SYNCED_DATE + " TEXT,"
            + StoolTable.COLUMN_APPVERSION + " TEXT,"
            + StoolTable.COLUMN_S1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_PREGNANCY = ("CREATE TABLE "
            + PregnancyTable.TABLE_NAME + "("
            + PregnancyTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PregnancyTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PregnancyTable.COLUMN_UID + " TEXT,"
            + PregnancyTable.COLUMN_UUID + " TEXT,"
            + PregnancyTable.COLUMN_MUID + " TEXT,"
            + PregnancyTable.COLUMN_CLUSTER + " TEXT,"
            + PregnancyTable.COLUMN_HHID + " TEXT,"
            + PregnancyTable.COLUMN_USERNAME + " TEXT,"
            + PregnancyTable.COLUMN_SYSDATE + " TEXT,"
            + PregnancyTable.COLUMN_ISTATUS + " TEXT,"
            + PregnancyTable.COLUMN_DEVICEID + " TEXT,"
            + PregnancyTable.COLUMN_DEVICETAGID + " TEXT,"
            + PregnancyTable.COLUMN_SYNCED + " TEXT,"
            + PregnancyTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PregnancyTable.COLUMN_APPVERSION + " TEXT,"
            + PregnancyTable.COLUMN_S1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_SAMPLES = ("CREATE TABLE "
            + SamplesTable.TABLE_NAME + "("
            + SamplesTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SamplesTable.COLUMN_PROJECT_NAME + " TEXT,"
            + SamplesTable.COLUMN_UID + " TEXT,"
            + SamplesTable.COLUMN_UUID + " TEXT,"
            + SamplesTable.COLUMN_CLUSTER + " TEXT,"
            + SamplesTable.COLUMN_HHID + " TEXT,"
            + SamplesTable.COLUMN_USERNAME + " TEXT,"
            + SamplesTable.COLUMN_SYSDATE + " TEXT,"
            + SamplesTable.COLUMN_SUBJECTNAME + " TEXT,"
            + SamplesTable.COLUMN_SAMPLE_TYPE + " TEXT,"
            + SamplesTable.COLUMN_ISTATUS + " TEXT,"
            + SamplesTable.COLUMN_DEVICEID + " TEXT,"
            + SamplesTable.COLUMN_DEVICETAGID + " TEXT,"
            + SamplesTable.COLUMN_SYNCED + " TEXT,"
            + SamplesTable.COLUMN_SYNCED_DATE + " TEXT,"
            + SamplesTable.COLUMN_APPVERSION + " TEXT,"
            + SamplesTable.COLUMN_S1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE "
            + ClustersTable.TABLE_NAME + "("
            + ClustersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ClustersTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + ClustersTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + ClustersTable.COLUMN_CITY_NAME + " TEXT,"
            + ClustersTable.COLUMN_CITY_CODE + " TEXT,"
            + ClustersTable.COLUMN_CLUSTER_NO + " TEXT"
            + " );"
            )


    const val SQL_CREATE_RANDOM = ("CREATE TABLE "
            + RandomTable.TABLE_NAME + "("
            + RandomTable.COLUMN_ID + " INTEGER PRIMARY KEY,"
            + RandomTable.COLUMN_SNO + " TEXT,"
            + RandomTable.COLUMN_CLUSTER_NO + " TEXT,"
            + RandomTable.COLUMN_HH_NO + " TEXT,"
            + RandomTable.COLUMN_HEAD_HH + " TEXT"
            + " );"
            )

    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )
    const val SQL_CREATE_ZSTANDARD = "CREATE TABLE " + ZScoreTable.TABLE_NAME + " (" +
            ZScoreTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            ZScoreTable.COLUMN_SEX + " TEXT, " +
            ZScoreTable.COLUMN_AGE + " TEXT, " +
            ZScoreTable.COLUMN_MEASURE + " TEXT, " +
            ZScoreTable.COLUMN_L + " TEXT, " +
            ZScoreTable.COLUMN_M + " TEXT, " +
            ZScoreTable.COLUMN_S + " TEXT, " +
            ZScoreTable.COLUMN_CAT + " TEXT " +
            ");"

}