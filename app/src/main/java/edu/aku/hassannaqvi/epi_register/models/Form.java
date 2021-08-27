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
    //private String sH2a = StringUtils.EMPTY;
    private String sH2b = StringUtils.EMPTY;
    /*    private String sH2c = StringUtils.EMPTY;
        private String sH2d = StringUtils.EMPTY;*/
    private String sH3a = StringUtils.EMPTY;
    private String sH3b = StringUtils.EMPTY;
    private String sH4 = StringUtils.EMPTY;
    private String sH5 = StringUtils.EMPTY;
    private String sH6 = StringUtils.EMPTY;
    private String sH7 = StringUtils.EMPTY;
    private String sW1a = StringUtils.EMPTY;
    //private String sW1b = StringUtils.EMPTY;
    private String sW2 = StringUtils.EMPTY;
    private String sW3 = StringUtils.EMPTY;
    private String sW4 = StringUtils.EMPTY;
    private String sC1 = StringUtils.EMPTY;
    private String sC2 = StringUtils.EMPTY;
    private String sC3 = StringUtils.EMPTY;
    // FIELD VARIABLES
    private String h101 = StringUtils.EMPTY;
    private String h102 = StringUtils.EMPTY;
    private String h103 = StringUtils.EMPTY;
    private String h104 = StringUtils.EMPTY;
    private String h105 = StringUtils.EMPTY;
    private String h106 = StringUtils.EMPTY;
    /*
    private String h106m = StringUtils.EMPTY;
    private String h106y = StringUtils.EMPTY;
    private String h107h = StringUtils.EMPTY;
    private String h107m = StringUtils.EMPTY;*/
    private String h107 = StringUtils.EMPTY;
    private String h108 = StringUtils.EMPTY;
    private String h109 = StringUtils.EMPTY;
    private String h110 = StringUtils.EMPTY;
    private String h111 = StringUtils.EMPTY;
    private String h112 = StringUtils.EMPTY;
    private String h11296x = StringUtils.EMPTY;
    private String h201 = StringUtils.EMPTY;
    private String h202 = StringUtils.EMPTY;
    private String h203d = StringUtils.EMPTY;
    private String h203m = StringUtils.EMPTY;
    private String h203y = StringUtils.EMPTY;
    private String h204 = StringUtils.EMPTY;
    private String h205 = StringUtils.EMPTY;
    private String h206 = StringUtils.EMPTY;
    private String h207 = StringUtils.EMPTY;
    private String h208 = StringUtils.EMPTY;
    private String h209t = StringUtils.EMPTY;
    private String h209m = StringUtils.EMPTY;
    private String h209f = StringUtils.EMPTY;
    private String h210 = StringUtils.EMPTY;
    private String h211t = StringUtils.EMPTY;
    private String h211m = StringUtils.EMPTY;
    private String h211f = StringUtils.EMPTY;
    private String h212 = StringUtils.EMPTY;
    private String h213t = StringUtils.EMPTY;
    private String h213m = StringUtils.EMPTY;
    private String h213f = StringUtils.EMPTY;
    private String h214 = StringUtils.EMPTY;
    private String h215t = StringUtils.EMPTY;
    private String h215m = StringUtils.EMPTY;
    private String h215f = StringUtils.EMPTY;
    private String h216 = StringUtils.EMPTY;
    private String h217t = StringUtils.EMPTY;
    private String h217m = StringUtils.EMPTY;
    private String h217f = StringUtils.EMPTY;
    private String h218 = StringUtils.EMPTY;
    private String h219t = StringUtils.EMPTY;
    private String h219m = StringUtils.EMPTY;
    private String h219f = StringUtils.EMPTY;
    private String h220a = StringUtils.EMPTY;
    private String h220b = StringUtils.EMPTY;
    private String h220c = StringUtils.EMPTY;
    private String h301 = StringUtils.EMPTY;
    private String h30196x = StringUtils.EMPTY;
    private String h302 = StringUtils.EMPTY;
    private String h30296x = StringUtils.EMPTY;
    private String h303 = StringUtils.EMPTY;
    private String h30396x = StringUtils.EMPTY;
    private String h304 = StringUtils.EMPTY;
    private String h305 = StringUtils.EMPTY;
    private String h306 = StringUtils.EMPTY;
    private String h30696x = StringUtils.EMPTY;
    private String h307 = StringUtils.EMPTY;
    private String h30796x = StringUtils.EMPTY;
    private String h308 = StringUtils.EMPTY;
    private String h309 = StringUtils.EMPTY;
    private String h310 = StringUtils.EMPTY;
    private String h31096x = StringUtils.EMPTY;
    private String h311a = StringUtils.EMPTY;
    private String h311b = StringUtils.EMPTY;
    private String h311c = StringUtils.EMPTY;
    private String h311d = StringUtils.EMPTY;
    private String h311e = StringUtils.EMPTY;
    private String h311f = StringUtils.EMPTY;
    private String h311g = StringUtils.EMPTY;
    private String h311h = StringUtils.EMPTY;
    private String h311i = StringUtils.EMPTY;
    private String h311j = StringUtils.EMPTY;
    private String h311k = StringUtils.EMPTY;
    private String h311l = StringUtils.EMPTY;
    private String h311m = StringUtils.EMPTY;
    private String h311n = StringUtils.EMPTY;
    private String h311o = StringUtils.EMPTY;
    private String h311p = StringUtils.EMPTY;
    private String h311q = StringUtils.EMPTY;
    private String h311r = StringUtils.EMPTY;
    private String h311s = StringUtils.EMPTY;
    private String h312a = StringUtils.EMPTY;
    private String h312b = StringUtils.EMPTY;
    private String h312c = StringUtils.EMPTY;
    private String h312d = StringUtils.EMPTY;
    private String h312e = StringUtils.EMPTY;
    private String h312f = StringUtils.EMPTY;
    private String h312g = StringUtils.EMPTY;
    private String h313 = StringUtils.EMPTY;
    private String h313a = StringUtils.EMPTY;
    private String h313b = StringUtils.EMPTY;
    private String h313c = StringUtils.EMPTY;
    private String h313d = StringUtils.EMPTY;
    private String h313e = StringUtils.EMPTY;
    private String h313f = StringUtils.EMPTY;
    private String h31396 = StringUtils.EMPTY;
    private String h31396x = StringUtils.EMPTY;
    private String h314 = StringUtils.EMPTY;
    private String h31496x = StringUtils.EMPTY;
    private String h315 = StringUtils.EMPTY;
    private String h31596x = StringUtils.EMPTY;
    private String h316 = StringUtils.EMPTY;
    private String h317 = StringUtils.EMPTY;
    private String h31796x = StringUtils.EMPTY;
    private String h318 = StringUtils.EMPTY;
    private String h31896x = StringUtils.EMPTY;
    private String h319 = StringUtils.EMPTY;
    private String h31996x = StringUtils.EMPTY;
    private String h320 = StringUtils.EMPTY;
    private String h321 = StringUtils.EMPTY;
    private String h322 = StringUtils.EMPTY;
    private String h322ax = StringUtils.EMPTY;
    private String h322bx = StringUtils.EMPTY;
    private String h323 = StringUtils.EMPTY;
    private String h324 = StringUtils.EMPTY;
    private String h3241 = StringUtils.EMPTY;
    private String h3241x = StringUtils.EMPTY;
    private String h3242 = StringUtils.EMPTY;
    private String h3242x = StringUtils.EMPTY;
    private String h3243 = StringUtils.EMPTY;
    private String h3243x = StringUtils.EMPTY;
    private String h3244 = StringUtils.EMPTY;
    private String h3244x = StringUtils.EMPTY;
    private String h3245 = StringUtils.EMPTY;
    private String h3245x = StringUtils.EMPTY;
    private String h3246 = StringUtils.EMPTY;
    private String h3246x = StringUtils.EMPTY;
    private String h3247 = StringUtils.EMPTY;
    private String h3247x = StringUtils.EMPTY;
    private String h401 = StringUtils.EMPTY;
    private String h402 = StringUtils.EMPTY;
    private String h403 = StringUtils.EMPTY;
    private String h403a = StringUtils.EMPTY;
    private String h403b = StringUtils.EMPTY;
    private String h403c = StringUtils.EMPTY;
    private String h403d = StringUtils.EMPTY;
    private String h404 = StringUtils.EMPTY;
    private String h405 = StringUtils.EMPTY;
    private String h405a = StringUtils.EMPTY;
    private String h405b = StringUtils.EMPTY;
    private String h405c = StringUtils.EMPTY;
    private String h405d = StringUtils.EMPTY;
    private String h406f = StringUtils.EMPTY;
    private String h406fx = StringUtils.EMPTY;
    private String h406a = StringUtils.EMPTY;
    private String h406b = StringUtils.EMPTY;
    private String h406c = StringUtils.EMPTY;
    private String h406d = StringUtils.EMPTY;
    private String h406e = StringUtils.EMPTY;
    private String h501 = StringUtils.EMPTY;
    private String h50196x = StringUtils.EMPTY;
    private String h502 = StringUtils.EMPTY;
    private String h503 = StringUtils.EMPTY;
    private String h601 = StringUtils.EMPTY;
    private String h602 = StringUtils.EMPTY;
    private String h603 = StringUtils.EMPTY;
    private String h604 = StringUtils.EMPTY;
    private String h605 = StringUtils.EMPTY;
    private String h606 = StringUtils.EMPTY;
    private String h607 = StringUtils.EMPTY;
    private String h608 = StringUtils.EMPTY;
    private String h609 = StringUtils.EMPTY;
    private String h610 = StringUtils.EMPTY;
    private String h611 = StringUtils.EMPTY;
    private String h612 = StringUtils.EMPTY;
    private String h613 = StringUtils.EMPTY;
    private String h614 = StringUtils.EMPTY;
    private String h615 = StringUtils.EMPTY;
    private String h616 = StringUtils.EMPTY;
    private String h617 = StringUtils.EMPTY;
    private String h618 = StringUtils.EMPTY;
    private String h701 = StringUtils.EMPTY;
    private String h701q = StringUtils.EMPTY;
    private String h701s = StringUtils.EMPTY;
    private String h702 = StringUtils.EMPTY;
    private String h702q = StringUtils.EMPTY;
    private String h702s = StringUtils.EMPTY;
    private String h703 = StringUtils.EMPTY;
    private String h703q = StringUtils.EMPTY;
    private String h703s = StringUtils.EMPTY;
    private String h704 = StringUtils.EMPTY;
    private String h704q = StringUtils.EMPTY;
    private String h704s = StringUtils.EMPTY;
    private String h705 = StringUtils.EMPTY;
    private String h705q = StringUtils.EMPTY;
    private String h705s = StringUtils.EMPTY;
    private String h706 = StringUtils.EMPTY;
    private String h706q = StringUtils.EMPTY;
    private String h706s = StringUtils.EMPTY;
    private String h707 = StringUtils.EMPTY;
    private String h707q = StringUtils.EMPTY;
    private String h707s = StringUtils.EMPTY;
    private String h708 = StringUtils.EMPTY;
    private String h708q = StringUtils.EMPTY;
    private String h708s = StringUtils.EMPTY;
    private String h709 = StringUtils.EMPTY;
    private String h709q = StringUtils.EMPTY;
    private String h709s = StringUtils.EMPTY;
    private String h710 = StringUtils.EMPTY;
    private String h710q = StringUtils.EMPTY;
    private String h710s = StringUtils.EMPTY;
    private String h711 = StringUtils.EMPTY;
    private String h711q = StringUtils.EMPTY;
    private String h711s = StringUtils.EMPTY;
    private String h712 = StringUtils.EMPTY;
    private String h712q = StringUtils.EMPTY;
    private String h712s = StringUtils.EMPTY;
    private String h713a = StringUtils.EMPTY;
    private String h713b = StringUtils.EMPTY;
    private String h713c = StringUtils.EMPTY;
    private String h713d = StringUtils.EMPTY;
    private String h714a = StringUtils.EMPTY;
    private String h714b = StringUtils.EMPTY;
    private String h714c = StringUtils.EMPTY;
    private String h714d = StringUtils.EMPTY;
    private String w100name = StringUtils.EMPTY;
    private String w101d = StringUtils.EMPTY;
    private String w101m = StringUtils.EMPTY;
    private String w101y = StringUtils.EMPTY;
    private String w102 = StringUtils.EMPTY;
    private String w103 = StringUtils.EMPTY;
    private String w104 = StringUtils.EMPTY;
    private String w105 = StringUtils.EMPTY;
    private String w106 = StringUtils.EMPTY;
    private String w107 = StringUtils.EMPTY;
    private String w108 = StringUtils.EMPTY;
    private String w109 = StringUtils.EMPTY;
    private String w110 = StringUtils.EMPTY;
    private String w111 = StringUtils.EMPTY;
    private String w112 = StringUtils.EMPTY;
    private String w201 = StringUtils.EMPTY;
    private String w202 = StringUtils.EMPTY;
    private String w202a = StringUtils.EMPTY;
    private String w202b = StringUtils.EMPTY;
    private String w202c = StringUtils.EMPTY;
    private String w202d = StringUtils.EMPTY;
    private String w202e = StringUtils.EMPTY;
    private String w202f = StringUtils.EMPTY;
    private String w202g = StringUtils.EMPTY;
    private String w202h = StringUtils.EMPTY;
    private String w20296 = StringUtils.EMPTY;
    private String w20296x = StringUtils.EMPTY;
    private String w203 = StringUtils.EMPTY;
    private String w203961x = StringUtils.EMPTY;
    private String w203962x = StringUtils.EMPTY;
    private String w203963x = StringUtils.EMPTY;
    private String w204 = StringUtils.EMPTY;
    private String w204wx = StringUtils.EMPTY;
    private String w204mx = StringUtils.EMPTY;
    private String w205 = StringUtils.EMPTY;
    private String w205ax = StringUtils.EMPTY;
    private String w206 = StringUtils.EMPTY;
    private String w20696x = StringUtils.EMPTY;
    private String w20601 = StringUtils.EMPTY;
    private String w20602 = StringUtils.EMPTY;
    private String w20603 = StringUtils.EMPTY;
    private String w20604 = StringUtils.EMPTY;
    private String w20605 = StringUtils.EMPTY;
    private String w20606 = StringUtils.EMPTY;
    private String w20607 = StringUtils.EMPTY;
    private String w20608 = StringUtils.EMPTY;
    private String w20696 = StringUtils.EMPTY;
    private String w20697 = StringUtils.EMPTY;
    private String w207 = StringUtils.EMPTY;
    private String w208 = StringUtils.EMPTY;
    private String w209 = StringUtils.EMPTY;
    private String w20996x = StringUtils.EMPTY;
    private String w210 = StringUtils.EMPTY;
    private String w210961 = StringUtils.EMPTY;
    private String w210961x = StringUtils.EMPTY;
    private String w210962 = StringUtils.EMPTY;
    private String w210962x = StringUtils.EMPTY;
    private String w210963 = StringUtils.EMPTY;
    private String w210963x = StringUtils.EMPTY;
    private String w211 = StringUtils.EMPTY;
    private String w212 = StringUtils.EMPTY;
    private String w212mx = StringUtils.EMPTY;
    private String w212dx = StringUtils.EMPTY;
    private String w213 = StringUtils.EMPTY;
    private String w214 = StringUtils.EMPTY;
    private String w21496x = StringUtils.EMPTY;
    private String w215 = StringUtils.EMPTY;
    private String w215961 = StringUtils.EMPTY;
    private String w215961x = StringUtils.EMPTY;
    private String w215962 = StringUtils.EMPTY;
    private String w215962x = StringUtils.EMPTY;
    private String w215963 = StringUtils.EMPTY;
    private String w215963x = StringUtils.EMPTY;
    private String w216 = StringUtils.EMPTY;
    private String w217 = StringUtils.EMPTY;
    private String w217mx = StringUtils.EMPTY;
    private String w217dx = StringUtils.EMPTY;
    private String w218 = StringUtils.EMPTY;
    private String w219 = StringUtils.EMPTY;
    private String w220 = StringUtils.EMPTY;
    private String w221 = StringUtils.EMPTY;
    private String w221mx = StringUtils.EMPTY;
    private String w221dx = StringUtils.EMPTY;
    private String w222 = StringUtils.EMPTY;
    private String w22296x = StringUtils.EMPTY;
    private String w223 = StringUtils.EMPTY;
    private String w223a = StringUtils.EMPTY;
    private String w223b = StringUtils.EMPTY;
    private String w223c = StringUtils.EMPTY;
    private String w223d = StringUtils.EMPTY;
    private String w223e = StringUtils.EMPTY;
    private String w223f = StringUtils.EMPTY;
    private String w223g = StringUtils.EMPTY;
    private String w223h = StringUtils.EMPTY;
    private String w224 = StringUtils.EMPTY;
    private String w225 = StringUtils.EMPTY;
    private String w226 = StringUtils.EMPTY;
    private String w301 = StringUtils.EMPTY;
    private String w30196x = StringUtils.EMPTY;
    private String w302 = StringUtils.EMPTY;
    private String w302a = StringUtils.EMPTY;
    private String w302b = StringUtils.EMPTY;
    private String w302c = StringUtils.EMPTY;
    private String w302d = StringUtils.EMPTY;
    private String w302e = StringUtils.EMPTY;
    private String w302f = StringUtils.EMPTY;
    private String w302g = StringUtils.EMPTY;
    private String w30296 = StringUtils.EMPTY;
    private String w30296x = StringUtils.EMPTY;
    private String w30299 = StringUtils.EMPTY;
    private String w303 = StringUtils.EMPTY;
    private String w303961x = StringUtils.EMPTY;
    private String w303962x = StringUtils.EMPTY;
    private String w303963x = StringUtils.EMPTY;
    private String w304 = StringUtils.EMPTY;
    private String w305 = StringUtils.EMPTY;
    private String w306 = StringUtils.EMPTY;
    private String w307 = StringUtils.EMPTY;
    private String w307ax = StringUtils.EMPTY;
    private String w307bx = StringUtils.EMPTY;
    private String w308 = StringUtils.EMPTY;
    private String w309 = StringUtils.EMPTY;
    private String w310 = StringUtils.EMPTY;
    private String w311 = StringUtils.EMPTY;
    private String w311hx = StringUtils.EMPTY;
    private String w311dx = StringUtils.EMPTY;
    private String w312 = StringUtils.EMPTY;
    private String w313 = StringUtils.EMPTY;
    private String w31397 = StringUtils.EMPTY;
    private String w313b = StringUtils.EMPTY;
    private String w313c = StringUtils.EMPTY;
    private String w313d = StringUtils.EMPTY;
    private String w313e = StringUtils.EMPTY;
    private String w31396 = StringUtils.EMPTY;
    private String w31396x = StringUtils.EMPTY;
    private String w31398 = StringUtils.EMPTY;
    private String w314 = StringUtils.EMPTY;
    private String w314961x = StringUtils.EMPTY;
    private String w314962x = StringUtils.EMPTY;
    private String w314963x = StringUtils.EMPTY;
    private String w315 = StringUtils.EMPTY;
    private String w316 = StringUtils.EMPTY;
    private String w316a = StringUtils.EMPTY;
    private String w316b = StringUtils.EMPTY;
    private String w316c = StringUtils.EMPTY;
    private String w316d = StringUtils.EMPTY;
    private String w316e = StringUtils.EMPTY;
    private String w316f = StringUtils.EMPTY;
    private String w316g = StringUtils.EMPTY;
    private String w316h = StringUtils.EMPTY;
    private String w31696 = StringUtils.EMPTY;
    private String w31696x = StringUtils.EMPTY;
    private String w317 = StringUtils.EMPTY;
    private String w317hx = StringUtils.EMPTY;
    private String w317dx = StringUtils.EMPTY;
    private String w317wx = StringUtils.EMPTY;
    private String w318 = StringUtils.EMPTY;
    private String w319 = StringUtils.EMPTY;
    private String w319a = StringUtils.EMPTY;
    private String w319b = StringUtils.EMPTY;
    private String w319c = StringUtils.EMPTY;
    private String w319d = StringUtils.EMPTY;
    private String w319e = StringUtils.EMPTY;
    private String w319f = StringUtils.EMPTY;
    private String w319g = StringUtils.EMPTY;
    private String w319h = StringUtils.EMPTY;
    private String w31996 = StringUtils.EMPTY;
    private String w31996x = StringUtils.EMPTY;
    private String w320 = StringUtils.EMPTY;
    private String w321 = StringUtils.EMPTY;
    private String w321a = StringUtils.EMPTY;
    private String w321b = StringUtils.EMPTY;
    private String w321c = StringUtils.EMPTY;
    private String w321d = StringUtils.EMPTY;
    private String w321e = StringUtils.EMPTY;
    private String w321f = StringUtils.EMPTY;
    private String w321g = StringUtils.EMPTY;
    private String w321h = StringUtils.EMPTY;
    private String w32196 = StringUtils.EMPTY;
    private String w32196x = StringUtils.EMPTY;
    private String w322 = StringUtils.EMPTY;
    private String w322hx = StringUtils.EMPTY;
    private String w322dx = StringUtils.EMPTY;
    private String w322wx = StringUtils.EMPTY;
    private String w323 = StringUtils.EMPTY;
    private String w324 = StringUtils.EMPTY;
    private String w324a = StringUtils.EMPTY;
    private String w324b = StringUtils.EMPTY;
    private String w324c = StringUtils.EMPTY;
    private String w324d = StringUtils.EMPTY;
    private String w32496 = StringUtils.EMPTY;
    private String w32496x = StringUtils.EMPTY;
    private String w325 = StringUtils.EMPTY;
    private String w326 = StringUtils.EMPTY;
    private String w327 = StringUtils.EMPTY;
    private String w32796x = StringUtils.EMPTY;
    private String w401 = StringUtils.EMPTY;
    private String w401a = StringUtils.EMPTY;
    private String w401b = StringUtils.EMPTY;
    private String w401c = StringUtils.EMPTY;
    private String w401d = StringUtils.EMPTY;
    private String w401e = StringUtils.EMPTY;
    private String w401f = StringUtils.EMPTY;
    private String w401g = StringUtils.EMPTY;
    private String w40198 = StringUtils.EMPTY;
    private String w402 = StringUtils.EMPTY;
    private String w402a = StringUtils.EMPTY;
    private String w402b = StringUtils.EMPTY;
    private String w402c = StringUtils.EMPTY;
    private String w402d = StringUtils.EMPTY;
    private String w402e = StringUtils.EMPTY;
    private String w402f = StringUtils.EMPTY;
    private String w402g = StringUtils.EMPTY;
    private String w40298 = StringUtils.EMPTY;
    private String w403 = StringUtils.EMPTY;
    private String w403a = StringUtils.EMPTY;
    private String w403b = StringUtils.EMPTY;
    private String w403c = StringUtils.EMPTY;
    private String w403d = StringUtils.EMPTY;
    private String w403e = StringUtils.EMPTY;
    private String w403f = StringUtils.EMPTY;
    private String w403g = StringUtils.EMPTY;
    private String w40398 = StringUtils.EMPTY;
    private String w404 = StringUtils.EMPTY;
    private String w404a = StringUtils.EMPTY;
    private String w404b = StringUtils.EMPTY;
    private String w404c = StringUtils.EMPTY;
    private String w404d = StringUtils.EMPTY;
    private String w404e = StringUtils.EMPTY;
    private String w404f = StringUtils.EMPTY;
    private String w404g = StringUtils.EMPTY;
    private String w40498 = StringUtils.EMPTY;
    private String w405 = StringUtils.EMPTY;
    private String w405a = StringUtils.EMPTY;
    private String w405b = StringUtils.EMPTY;
    private String w405c = StringUtils.EMPTY;
    private String w405d = StringUtils.EMPTY;
    private String w405e = StringUtils.EMPTY;
    private String w405f = StringUtils.EMPTY;
    private String w405g = StringUtils.EMPTY;
    private String w40598 = StringUtils.EMPTY;
    private String w406 = StringUtils.EMPTY;
    private String w406a = StringUtils.EMPTY;
    private String w406b = StringUtils.EMPTY;
    private String w406c = StringUtils.EMPTY;
    private String w406d = StringUtils.EMPTY;
    private String w406e = StringUtils.EMPTY;
    private String w406f = StringUtils.EMPTY;
    private String w406g = StringUtils.EMPTY;
    private String w40698 = StringUtils.EMPTY;
    private String w407 = StringUtils.EMPTY;
    private String w407a = StringUtils.EMPTY;
    private String w407b = StringUtils.EMPTY;
    private String w407c = StringUtils.EMPTY;
    private String w407d = StringUtils.EMPTY;
    private String w407e = StringUtils.EMPTY;
    private String w407f = StringUtils.EMPTY;
    private String w407g = StringUtils.EMPTY;
    private String w40798 = StringUtils.EMPTY;
    private String w408 = StringUtils.EMPTY;
    private String w408a = StringUtils.EMPTY;
    private String w408b = StringUtils.EMPTY;
    private String w408c = StringUtils.EMPTY;
    private String w408d = StringUtils.EMPTY;
    private String w408e = StringUtils.EMPTY;
    private String w408f = StringUtils.EMPTY;
    private String w408g = StringUtils.EMPTY;
    private String w40898 = StringUtils.EMPTY;
    private String w409 = StringUtils.EMPTY;
    private String w409a = StringUtils.EMPTY;
    private String w409b = StringUtils.EMPTY;
    private String w409c = StringUtils.EMPTY;
    private String w409d = StringUtils.EMPTY;
    private String w409e = StringUtils.EMPTY;
    private String w409f = StringUtils.EMPTY;
    private String w409g = StringUtils.EMPTY;
    private String w40998 = StringUtils.EMPTY;
    private String w410 = StringUtils.EMPTY;
    private String w410a = StringUtils.EMPTY;
    private String w410b = StringUtils.EMPTY;
    private String w410c = StringUtils.EMPTY;
    private String w410d = StringUtils.EMPTY;
    private String w410e = StringUtils.EMPTY;
    private String w410f = StringUtils.EMPTY;
    private String w410g = StringUtils.EMPTY;
    private String w41098 = StringUtils.EMPTY;
    private String c100name = StringUtils.EMPTY;
    private String c101 = StringUtils.EMPTY;
    private String c102 = StringUtils.EMPTY;
    private String c103 = StringUtils.EMPTY;
    private String c104 = StringUtils.EMPTY;
    private String c105 = StringUtils.EMPTY;
    private String c106a = StringUtils.EMPTY;
    private String c106b = StringUtils.EMPTY;
    private String c106ca = StringUtils.EMPTY;
    private String c106d = StringUtils.EMPTY;
    private String c106ea = StringUtils.EMPTY;
    private String c106f = StringUtils.EMPTY;
    private String c106g = StringUtils.EMPTY;
    private String c106ha = StringUtils.EMPTY;
    private String c106i = StringUtils.EMPTY;
    private String c106j = StringUtils.EMPTY;
    private String c106k = StringUtils.EMPTY;
    private String c106l = StringUtils.EMPTY;
    private String c106m = StringUtils.EMPTY;
    private String c106n = StringUtils.EMPTY;
    private String c106o = StringUtils.EMPTY;
    private String c106p = StringUtils.EMPTY;
    private String c106q = StringUtils.EMPTY;
    private String c107a = StringUtils.EMPTY;
    private String c107b = StringUtils.EMPTY;
    private String c107c = StringUtils.EMPTY;
    private String c107d = StringUtils.EMPTY;
    private String c107e = StringUtils.EMPTY;
    private String c107f = StringUtils.EMPTY;
    private String c107g = StringUtils.EMPTY;
    private String c107h = StringUtils.EMPTY;
    private String c107j = StringUtils.EMPTY;
    private String c107i = StringUtils.EMPTY;
    private String c107k = StringUtils.EMPTY;
    private String c107l = StringUtils.EMPTY;
    private String c107m = StringUtils.EMPTY;
    private String c107n = StringUtils.EMPTY;
    private String c107o = StringUtils.EMPTY;
    private String c107p = StringUtils.EMPTY;
    private String c107q = StringUtils.EMPTY;
    private String c107r = StringUtils.EMPTY;
    private String c107s = StringUtils.EMPTY;
    private String c107sflag = StringUtils.EMPTY;
    private String c108 = StringUtils.EMPTY;
    private String c108t1 = StringUtils.EMPTY;
    private String c109 = StringUtils.EMPTY;
    private String c201 = StringUtils.EMPTY;
    private String c202 = StringUtils.EMPTY;
    private String c20301a = StringUtils.EMPTY;
    private String c20301b = StringUtils.EMPTY;
    private String c20301ba = StringUtils.EMPTY;
    private String c20301bb = StringUtils.EMPTY;
    private String c20301bc = StringUtils.EMPTY;
    private String c20301bd = StringUtils.EMPTY;
    private String c20301be = StringUtils.EMPTY;
    private String c20301bf = StringUtils.EMPTY;
    private String c20301bg = StringUtils.EMPTY;
    private String c20302a = StringUtils.EMPTY;
    private String c20302b = StringUtils.EMPTY;
    private String c20302ba = StringUtils.EMPTY;
    private String c20302bb = StringUtils.EMPTY;
    private String c20302bc = StringUtils.EMPTY;
    private String c20302bd = StringUtils.EMPTY;
    private String c20302be = StringUtils.EMPTY;
    private String c20302bf = StringUtils.EMPTY;
    private String c20302bg = StringUtils.EMPTY;
    private String c20303a = StringUtils.EMPTY;
    private String c20303b = StringUtils.EMPTY;
    private String c20303ba = StringUtils.EMPTY;
    private String c20303bb = StringUtils.EMPTY;
    private String c20303bc = StringUtils.EMPTY;
    private String c20303bd = StringUtils.EMPTY;
    private String c20303be = StringUtils.EMPTY;
    private String c20303bf = StringUtils.EMPTY;
    private String c20303bg = StringUtils.EMPTY;
    private String c20304a = StringUtils.EMPTY;
    private String c20304b = StringUtils.EMPTY;
    private String c20304ba = StringUtils.EMPTY;
    private String c20304bb = StringUtils.EMPTY;
    private String c20304bc = StringUtils.EMPTY;
    private String c20304bd = StringUtils.EMPTY;
    private String c20304be = StringUtils.EMPTY;
    private String c20304bf = StringUtils.EMPTY;
    private String c20304bg = StringUtils.EMPTY;
    private String c20305a = StringUtils.EMPTY;
    private String c20305b = StringUtils.EMPTY;
    private String c20305ba = StringUtils.EMPTY;
    private String c20305bb = StringUtils.EMPTY;
    private String c20305bc = StringUtils.EMPTY;
    private String c20305bd = StringUtils.EMPTY;
    private String c20305be = StringUtils.EMPTY;
    private String c20305bf = StringUtils.EMPTY;
    private String c20305bg = StringUtils.EMPTY;
    private String c20306a = StringUtils.EMPTY;
    private String c20306b = StringUtils.EMPTY;
    private String c20306ba = StringUtils.EMPTY;
    private String c20306bb = StringUtils.EMPTY;
    private String c20306bc = StringUtils.EMPTY;
    private String c20306bd = StringUtils.EMPTY;
    private String c20306be = StringUtils.EMPTY;
    private String c20306bf = StringUtils.EMPTY;
    private String c20306bg = StringUtils.EMPTY;
    private String c20307a = StringUtils.EMPTY;
    private String c20307b = StringUtils.EMPTY;
    private String c20307ba = StringUtils.EMPTY;
    private String c20307bb = StringUtils.EMPTY;
    private String c20307bc = StringUtils.EMPTY;
    private String c20307bd = StringUtils.EMPTY;
    private String c20307be = StringUtils.EMPTY;
    private String c20307bf = StringUtils.EMPTY;
    private String c20307bg = StringUtils.EMPTY;
    private String c20308a = StringUtils.EMPTY;
    private String c20308b = StringUtils.EMPTY;
    private String c20308ba = StringUtils.EMPTY;
    private String c20308bb = StringUtils.EMPTY;
    private String c20308bc = StringUtils.EMPTY;
    private String c20308bd = StringUtils.EMPTY;
    private String c20308be = StringUtils.EMPTY;
    private String c20308bf = StringUtils.EMPTY;
    private String c20308bg = StringUtils.EMPTY;
    private String c20309a = StringUtils.EMPTY;
    private String c20309b = StringUtils.EMPTY;
    private String c20309ba = StringUtils.EMPTY;
    private String c20309bb = StringUtils.EMPTY;
    private String c20309bc = StringUtils.EMPTY;
    private String c20309bd = StringUtils.EMPTY;
    private String c20309be = StringUtils.EMPTY;
    private String c20309bf = StringUtils.EMPTY;
    private String c20309bg = StringUtils.EMPTY;
    private String c20310a = StringUtils.EMPTY;
    private String c20310b = StringUtils.EMPTY;
    private String c20310ba = StringUtils.EMPTY;
    private String c20310bb = StringUtils.EMPTY;
    private String c20310bc = StringUtils.EMPTY;
    private String c20310bd = StringUtils.EMPTY;
    private String c20310be = StringUtils.EMPTY;
    private String c20310bf = StringUtils.EMPTY;
    private String c20310bg = StringUtils.EMPTY;
    private String c20311a = StringUtils.EMPTY;
    private String c20311b = StringUtils.EMPTY;
    private String c20311ba = StringUtils.EMPTY;
    private String c20311bb = StringUtils.EMPTY;
    private String c20311bc = StringUtils.EMPTY;
    private String c20311bd = StringUtils.EMPTY;
    private String c20311be = StringUtils.EMPTY;
    private String c20311bf = StringUtils.EMPTY;
    private String c20311bg = StringUtils.EMPTY;
    private String c20312a = StringUtils.EMPTY;
    private String c20312b = StringUtils.EMPTY;
    private String c20312ba = StringUtils.EMPTY;
    private String c20312bb = StringUtils.EMPTY;
    private String c20312bc = StringUtils.EMPTY;
    private String c20312bd = StringUtils.EMPTY;
    private String c20312be = StringUtils.EMPTY;
    private String c20312bf = StringUtils.EMPTY;
    private String c20312bg = StringUtils.EMPTY;
    private String c20313a = StringUtils.EMPTY;
    private String c20313b = StringUtils.EMPTY;
    private String c20313ba = StringUtils.EMPTY;
    private String c20313bb = StringUtils.EMPTY;
    private String c20313bc = StringUtils.EMPTY;
    private String c20313bd = StringUtils.EMPTY;
    private String c20313be = StringUtils.EMPTY;
    private String c20313bf = StringUtils.EMPTY;
    private String c20313bg = StringUtils.EMPTY;
    private String c20314a = StringUtils.EMPTY;
    private String c20314b = StringUtils.EMPTY;
    private String c20314ba = StringUtils.EMPTY;
    private String c20314bb = StringUtils.EMPTY;
    private String c20314bc = StringUtils.EMPTY;
    private String c20314bd = StringUtils.EMPTY;
    private String c20314be = StringUtils.EMPTY;
    private String c20314bf = StringUtils.EMPTY;
    private String c20314bg = StringUtils.EMPTY;
    private String c20315a = StringUtils.EMPTY;
    private String c20315b = StringUtils.EMPTY;
    private String c20315ba = StringUtils.EMPTY;
    private String c20315bb = StringUtils.EMPTY;
    private String c20315bc = StringUtils.EMPTY;
    private String c20315bd = StringUtils.EMPTY;
    private String c20315be = StringUtils.EMPTY;
    private String c20315bf = StringUtils.EMPTY;
    private String c20315bg = StringUtils.EMPTY;
    private String c20316a = StringUtils.EMPTY;
    private String c20316b = StringUtils.EMPTY;
    private String c20316ba = StringUtils.EMPTY;
    private String c20316bb = StringUtils.EMPTY;
    private String c20316bc = StringUtils.EMPTY;
    private String c20316bd = StringUtils.EMPTY;
    private String c20316be = StringUtils.EMPTY;
    private String c20316bf = StringUtils.EMPTY;
    private String c20316bg = StringUtils.EMPTY;
    private String c20317a = StringUtils.EMPTY;
    private String c20317b = StringUtils.EMPTY;
    private String c20317ba = StringUtils.EMPTY;
    private String c20317bb = StringUtils.EMPTY;
    private String c20317bc = StringUtils.EMPTY;
    private String c20317bd = StringUtils.EMPTY;
    private String c20317be = StringUtils.EMPTY;
    private String c20317bf = StringUtils.EMPTY;
    private String c20317bg = StringUtils.EMPTY;
    private String c204 = StringUtils.EMPTY;
    private String c301 = StringUtils.EMPTY;
    private String c302 = StringUtils.EMPTY;
    private String c303 = StringUtils.EMPTY;
    private String c30396x = StringUtils.EMPTY;
    private String c304 = StringUtils.EMPTY;
    private String c304961x = StringUtils.EMPTY;
    private String c304962x = StringUtils.EMPTY;
    private String c304963x = StringUtils.EMPTY;
    private String c305 = StringUtils.EMPTY;
    private String c305a = StringUtils.EMPTY;
    private String c305b = StringUtils.EMPTY;
    private String c305c = StringUtils.EMPTY;
    private String c305d = StringUtils.EMPTY;
    private String c305e = StringUtils.EMPTY;
    private String c305f = StringUtils.EMPTY;
    private String c305g = StringUtils.EMPTY;
    private String c305h = StringUtils.EMPTY;
    private String c305i = StringUtils.EMPTY;
    private String c305j = StringUtils.EMPTY;
    private String c30596 = StringUtils.EMPTY;
    private String c30596x = StringUtils.EMPTY;
    private String c306 = StringUtils.EMPTY;
    private String c307 = StringUtils.EMPTY;
    private String c308 = StringUtils.EMPTY;
    private String c30896x = StringUtils.EMPTY;
    private String c309 = StringUtils.EMPTY;
    private String c309961x = StringUtils.EMPTY;
    private String c309962x = StringUtils.EMPTY;
    private String c309963x = StringUtils.EMPTY;
    private String c310 = StringUtils.EMPTY;
    private String c310a = StringUtils.EMPTY;
    private String c310b = StringUtils.EMPTY;
    private String c310c = StringUtils.EMPTY;
    private String c310d = StringUtils.EMPTY;
    private String c310e = StringUtils.EMPTY;
    private String c310f = StringUtils.EMPTY;
    private String c310g = StringUtils.EMPTY;
    private String c31096 = StringUtils.EMPTY;
    private String c31096x = StringUtils.EMPTY;
    private String c311 = StringUtils.EMPTY;
    private String c312 = StringUtils.EMPTY;
    private String c313 = StringUtils.EMPTY;
    private String c31396x = StringUtils.EMPTY;
    private String c314 = StringUtils.EMPTY;
    private String c314961x = StringUtils.EMPTY;
    private String c314962x = StringUtils.EMPTY;
    private String c314963x = StringUtils.EMPTY;
    private String c315 = StringUtils.EMPTY;
    private String c315a = StringUtils.EMPTY;
    private String c315b = StringUtils.EMPTY;
    private String c315c = StringUtils.EMPTY;
    private String c315d = StringUtils.EMPTY;
    private String c315e = StringUtils.EMPTY;
    private String c315f = StringUtils.EMPTY;
    private String c315g = StringUtils.EMPTY;
    private String c315h = StringUtils.EMPTY;
    private String c31596 = StringUtils.EMPTY;
    private String c31596x = StringUtils.EMPTY;
    private String c316 = StringUtils.EMPTY;
    private String c317 = StringUtils.EMPTY;
    private String c318 = StringUtils.EMPTY;
    private String c319 = StringUtils.EMPTY;
    private String c320 = StringUtils.EMPTY;
    private String c321 = StringUtils.EMPTY;
    private String c322 = StringUtils.EMPTY;
    private String c323 = StringUtils.EMPTY;
    private String c323mx = StringUtils.EMPTY;
    private String c323dx = StringUtils.EMPTY;


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

    public String getsH2b() {
        return sH2b;
    }

    public void setsH2b(String sH2b) {
        this.sH2b = sH2b;
    }

    public String getsH3a() {
        return sH3a;
    }

    public void setsH3a(String sH3a) {
        this.sH3a = sH3a;
    }

    public String getsH3b() {
        return sH3b;
    }

    public void setsH3b(String sH3b) {
        this.sH3b = sH3b;
    }

    public String getsH4() {
        return sH4;
    }

    public void setsH4(String sH4) {
        this.sH4 = sH4;
    }

    public String getsH5() {
        return sH5;
    }

    public void setsH5(String sH5) {
        this.sH5 = sH5;
    }

    public String getsH6() {
        return sH6;
    }

    public void setsH6(String sH6) {
        this.sH6 = sH6;
    }

    public String getsH7() {
        return sH7;
    }

    public void setsH7(String sH7) {
        this.sH7 = sH7;
    }



   /* public String getsW1b() {
        return sW1b;
    }

    public void setsW1b(String sW1b) {
        this.sW1b = sW1b;
    }*/

    public String getsW1a() {
        return sW1a;
    }

    public void setsW1a(String sW1a) {
        this.sW1a = sW1a;
    }

    public String getsW2() {
        return sW2;
    }

    public void setsW2(String sW2) {
        this.sW2 = sW2;
    }

    public String getsW3() {
        return sW3;
    }

    public void setsW3(String sW3) {
        this.sW3 = sW3;
    }

    public String getsW4() {
        return sW4;
    }

    public void setsW4(String sW4) {
        this.sW4 = sW4;
    }

    public String getsC1() {
        return sC1;
    }

    public void setsC1(String sC1) {
        this.sC1 = sC1;
    }

    public String getsC2() {
        return sC2;
    }

    public void setsC2(String sC2) {
        this.sC2 = sC2;
    }

    public String getsC3() {
        return sC3;
    }

    public void setsC3(String sC3) {
        this.sC3 = sC3;
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

/*    @Bindable
    public String getH107m() {
        return h107m;
    }

    public void setH107m(String h107m) {
        this.h107m = h107m;
        notifyPropertyChanged(BR.h107m);
    }*/

    /*  @Bindable
      public String getH106m() {
          return h106m;
      }

      public void setH106m(String h106m) {
          this.h106m = h106m;
          notifyPropertyChanged(BR.h106m);
      }

      @Bindable
      public String getH106y() {
          return h106y;
      }

      public void setH106y(String h106y) {
          this.h106y = h106y;
          notifyPropertyChanged(BR.h106y);
      }
  */
    @Bindable
    public String getH107() {
        return h107;
    }

    public void setH107(String h107) {
        this.h107 = h107;
        notifyPropertyChanged(BR.h107);
    }

    @Bindable
    public String getH108() {
        return h108;
    }

    public void setH108(String h108) {
        this.h108 = h108;
        notifyPropertyChanged(BR.h108);
    }

    @Bindable
    public String getH109() {
        return h109;
    }

    public void setH109(String h109) {
        this.h109 = h109;
        notifyPropertyChanged(BR.h109);
    }

    @Bindable
    public String getH110() {
        return h110;
    }

    public void setH110(String h110) {
        this.h110 = h110;
        notifyPropertyChanged(BR.h110);
    }

    @Bindable
    public String getH111() {
        return h111;
    }

    public void setH111(String h111) {
        this.h111 = h111;
        setH201(h111.equals("1") ? this.h201 : "");
        setH202(h111.equals("1") ? this.h202 : "");
        setH203d(h111.equals("1") ? this.h203d : "");
        setH203m(h111.equals("1") ? this.h203m : "");
        setH203y(h111.equals("1") ? this.h203y : "");
        setH204(h111.equals("1") ? this.h204 : "");
        setH205(h111.equals("1") ? this.h205 : "");
        setH206(h111.equals("1") ? this.h206 : "");
        setH207(h111.equals("1") ? this.h207 : "");
        setH208(h111.equals("1") ? this.h208 : "");
        notifyPropertyChanged(BR.h111);
    }

    @Bindable
    public String getH112() {
        return h112;
    }

    public void setH112(String h112) {
        this.h112 = h112;
        notifyPropertyChanged(BR.h112);
    }

    @Bindable
    public String getH11296x() {
        return h11296x;
    }

    public void setH11296x(String h11296x) {
        this.h11296x = h11296x;
        notifyPropertyChanged(BR.h11296x);
    }

    @Bindable
    public String getH201() {
        return h201;
    }

    public void setH201(String h201) {
        this.h201 = h201;
        notifyPropertyChanged(BR.h201);
    }

    @Bindable
    public String getH202() {
        return h202;
    }

    public void setH202(String h202) {
        this.h202 = h202;
        notifyPropertyChanged(BR.h202);
    }

    @Bindable
    public String getH203d() {
        return h203d;
    }

    public void setH203d(String h203d) {
        this.h203d = h203d;
        notifyPropertyChanged(BR.h203d);
    }

    @Bindable
    public String getH203m() {
        return h203m;
    }

    public void setH203m(String h203m) {
        this.h203m = h203m;
        notifyPropertyChanged(BR.h203m);
    }

    @Bindable
    public String getH203y() {
        return h203y;
    }

    public void setH203y(String h203y) {
        this.h203y = h203y;
        notifyPropertyChanged(BR.h203y);
    }

    @Bindable
    public String getH204() {
        return h204;
    }

    public void setH204(String h204) {
        this.h204 = h204;
        notifyPropertyChanged(BR.h204);
    }

    @Bindable
    public String getH205() {
        return h205;
    }

    public void setH205(String h205) {
        this.h205 = h205;
        notifyPropertyChanged(BR.h205);
    }

    @Bindable
    public String getH206() {
        return h206;
    }

    public void setH206(String h206) {
        this.h206 = h206;
        notifyPropertyChanged(BR.h206);
    }

    @Bindable
    public String getH207() {
        return h207;
    }

    public void setH207(String h207) {
        this.h207 = h207;
        notifyPropertyChanged(BR.h207);
    }

    @Bindable
    public String getH208() {
        return h208;
    }

    public void setH208(String h208) {
        this.h208 = h208;
        notifyPropertyChanged(BR.h208);
    }

    @Bindable
    public String getH209t() {
        return h209t;
    }

    public void setH209t(String h209t) {
        this.h209t = h209t;
        notifyPropertyChanged(BR.h209t);
    }

    @Bindable
    public String getH209m() {
        return h209m;
    }

    public void setH209m(String h209m) {
        this.h209m = h209m;
        notifyPropertyChanged(BR.h209m);
    }

    @Bindable
    public String getH209f() {
        return h209f;
    }

    public void setH209f(String h209f) {
        this.h209f = h209f;
        notifyPropertyChanged(BR.h209f);
    }

    @Bindable
    public String getH210() {
        return h210;
    }

    public void setH210(String h210) {
        this.h210 = h210;
      /*  setH211f(h210.equals("1") ? this.h211f : ""); // for all skips, mention all skipped questions
        setH211m(h210.equals("1") ? this.h211m : ""); // for all skips, mention all skipped questions
        setH211t(h210.equals("1") ? this.h211f : ""); // for all skips, mention all skipped questions*/

        notifyPropertyChanged(BR.h210);
    }

    @Bindable
    public String getH211t() {
        return h211t;
    }

    public void setH211t(String h211t) {
        this.h211t = h211t;
        calculateTotalMember();
        notifyPropertyChanged(BR.h211t);
    }

    @Bindable
    public String getH211m() {
        return h211m;
    }

    public void setH211m(String h211m) {
        this.h211m = h211m;
        if (!this.h211m.equals("") && !this.h211f.equals(""))
            setH211t(String.valueOf(Integer.parseInt(this.h211m) + Integer.parseInt(this.h211f)));
        notifyPropertyChanged(BR.h211m);
    }

    @Bindable
    public String getH211f() {
        return h211f;
    }

    public void setH211f(String h211f) {
        this.h211f = h211f;
        if (!this.h211m.equals("") && !this.h211f.equals(""))
            setH211t(String.valueOf(Integer.parseInt(this.h211m) + Integer.parseInt(this.h211f)));
        notifyPropertyChanged(BR.h211f);
    }

    @Bindable
    public String getH212() {
        return h212;
    }

    public void setH212(String h212) {
        this.h212 = h212;
     /*   setH213f(h212.equals("1") ? this.h213f : ""); // for all skips, mention all skipped questions
        setH213m(h212.equals("1") ? this.h213m : ""); // for all skips, mention all skipped questions
        setH213t(h212.equals("1") ? this.h213f : ""); // for all skips, mention all skipped questions*/
        notifyPropertyChanged(BR.h212);
    }

    @Bindable
    public String getH213t() {
        return h213t;
    }

    public void setH213t(String h213t) {

        this.h213t = h213t;
        calculateTotalMember();

        notifyPropertyChanged(BR.h213t);
    }

    @Bindable
    public String getH213m() {
        return h213m;
    }

    public void setH213m(String h213m) {
        this.h213m = h213m;
        if (!this.h213m.equals("") && !this.h213f.equals("")) {
            setH213t(String.valueOf(Integer.valueOf(this.h213m) + Integer.valueOf(this.h213f)));
        }
        notifyPropertyChanged(BR.h213m);
    }

    @Bindable
    public String getH213f() {
        return h213f;
    }

    public void setH213f(String h213f) {
        this.h213f = h213f;
        if (!this.h213m.equals("") && !this.h213f.equals(""))
            setH213t(String.valueOf(Integer.valueOf(this.h213m) + Integer.valueOf(this.h213f)));
        notifyPropertyChanged(BR.h213f);
    }

    @Bindable
    public String getH214() {
        return h214;
    }

    public void setH214(String h214) {
        this.h214 = h214;
      /*  setH215f(h214.equals("1") ? this.h215f : ""); // for all skips, mention all skipped questions
        setH215m(h214.equals("1") ? this.h215m : ""); // for all skips, mention all skipped questions
        setH215t(h214.equals("1") ? this.h215f : ""); // for all skips, mention all skipped questions*/
        notifyPropertyChanged(BR.h214);
    }

    @Bindable
    public String getH215t() {
        return h215t;
    }

    public void setH215t(String h215t) {
        this.h215t = h215t;
        calculateTotalMember();

        notifyPropertyChanged(BR.h215t);
    }

    @Bindable
    public String getH215m() {
        return h215m;
    }

    public void setH215m(String h215m) {
        this.h215m = h215m;
        if (!this.h215m.equals("") && !this.h215f.equals(""))
            setH215t(String.valueOf(Integer.valueOf(this.h215m) + Integer.valueOf(this.h215f)));
        notifyPropertyChanged(BR.h215m);
    }

    @Bindable
    public String getH215f() {
        return h215f;
    }

    public void setH215f(String h215f) {
        this.h215f = h215f;
        if (!this.h215m.equals("") && !this.h215f.equals(""))
            setH215t(String.valueOf(Integer.valueOf(this.h215m) + Integer.valueOf(this.h215f)));
        notifyPropertyChanged(BR.h215f);
    }

    @Bindable
    public String getH216() {
        return h216;
    }

    public void setH216(String h216) {
        this.h216 = h216;
       /* setH217f(h216.equals("1") ? this.h217f : ""); // for all skips, mention all skipped questions
        setH217m(h216.equals("1") ? this.h217m : ""); // for all skips, mention all skipped questions
        setH217t(h216.equals("1") ? this.h217f : ""); // for all skips, mention all skipped questions*/
        notifyPropertyChanged(BR.h216);
    }

    @Bindable
    public String getH217t() {
        return h217t;
    }

    public void setH217t(String h217t) {
        this.h217t = h217t;
        calculateTotalMember();

        notifyPropertyChanged(BR.h217t);
    }

    @Bindable
    public String getH217m() {
        return h217m;
    }

    public void setH217m(String h217m) {
        this.h217m = h217m;
        if (!this.h217m.equals("") && !this.h217f.equals(""))
            setH217t(String.valueOf(Integer.valueOf(this.h217m) + Integer.valueOf(this.h217f)));
        notifyPropertyChanged(BR.h217m);
    }

    @Bindable
    public String getH217f() {
        return h217f;
    }

    public void setH217f(String h217f) {
        this.h217f = h217f;
        if (!this.h217m.equals("") && !this.h217f.equals(""))
            setH217t(String.valueOf(Integer.valueOf(this.h217m) + Integer.valueOf(this.h217f)));
        notifyPropertyChanged(BR.h217f);
    }

    @Bindable
    public String getH218() {
        return h218;
    }

    public void setH218(String h218) {
        this.h218 = h218;
      /*  setH219f(h218.equals("1") ? this.h219f : ""); // for all skips, mention all skipped questions
        setH219m(h218.equals("1") ? this.h219m : ""); // for all skips, mention all skipped questions
        setH219t(h218.equals("1") ? this.h219f : ""); // for all skips, mention all skipped questions*/
        notifyPropertyChanged(BR.h218);
    }

    @Bindable
    public String getH219t() {
        return h219t;
    }

    public void setH219t(String h219t) {
        this.h219t = h219t;
        calculateTotalMember();
        notifyPropertyChanged(BR.h219t);
    }

    @Bindable
    public String getH219m() {
        return h219m;
    }

    public void setH219m(String h219m) {
        this.h219m = h219m;
        if (!this.h219m.equals("") && !this.h219f.equals(""))
            setH219t(String.valueOf(Integer.valueOf(this.h219m) + Integer.valueOf(this.h219f)));
        notifyPropertyChanged(BR.h219m);
    }

    @Bindable
    public String getH219f() {
        return h219f;
    }

    public void setH219f(String h219f) {
        this.h219f = h219f;
        if (!this.h219m.equals("") && !this.h219f.equals(""))
            setH219t(String.valueOf(Integer.valueOf(this.h219m) + Integer.valueOf(this.h219f)));
        notifyPropertyChanged(BR.h219f);
    }

    @Bindable
    public String getH220a() {
        return h220a;
    }

    public void setH220a(String h220a) {
        this.h220a = h220a;
        notifyPropertyChanged(BR.h220a);
    }

    @Bindable
    public String getH220b() {
        return h220b;
    }

    public void setH220b(String h220b) {
        this.h220b = h220b;
        if (!this.h220b.equals("") && !this.h220c.equals("")) {
            setH220a(String.valueOf(Integer.valueOf(this.h220b) + Integer.valueOf(this.h220c)));
        }
        notifyPropertyChanged(BR.h220b);
    }

    @Bindable
    public String getH220c() {
        return h220c;
    }

    public void setH220c(String h220c) {
        this.h220c = h220c;
        if (!this.h220b.equals("") && !this.h220c.equals("")) {
            setH220a(String.valueOf(Integer.valueOf(this.h220b) + Integer.valueOf(this.h220c)));
        }
        notifyPropertyChanged(BR.h220c);
    }

    @Bindable
    public String getH301() {
        return h301;
    }

    public void setH301(String h301) {
        this.h301 = h301;
        setH30196x(h301.equals("96") ? this.h30196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h301);
    }

    @Bindable
    public String getH30196x() {
        return h30196x;
    }

    public void setH30196x(String h30196x) {
        this.h30196x = h30196x;
        notifyPropertyChanged(BR.h30196x);
    }

    @Bindable
    public String getH302() {
        return h302;
    }

    public void setH302(String h302) {
        this.h302 = h302;
        setH30296x(h302.equals("96") ? this.h30296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h302);
    }

    @Bindable
    public String getH30296x() {
        return h30296x;
    }

    public void setH30296x(String h30296x) {
        this.h30296x = h30296x;
        notifyPropertyChanged(BR.h30296x);
    }

    @Bindable
    public String getH303() {
        return h303;
    }

    public void setH303(String h303) {
        this.h303 = h303;
        setH30396x(h303.equals("96") ? this.h30396x : ""); // for all skips, mention all skipped questions
        setH304(h303.equals("1") || h303.equals("2") ? "" : this.h304); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h303);
    }

    @Bindable
    public String getH30396x() {
        return h30396x;
    }

    public void setH30396x(String h30396x) {
        this.h30396x = h30396x;
        notifyPropertyChanged(BR.h30396x);
    }

    @Bindable
    public String getH304() {
        return h304;
    }

    public void setH304(String h304) {
        this.h304 = h304;
        notifyPropertyChanged(BR.h304);
    }

    @Bindable
    public String getH305() {
        return h305;
    }

    public void setH305(String h305) {
        this.h305 = h305;
        setH306(h305.equals("1") ? this.h306 : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h305);
    }

    @Bindable
    public String getH306() {
        return h306;
    }

    public void setH306(String h306) {
        this.h306 = h306;
        setH30696x(h306.equals("96") ? this.h30696x : ""); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h306);
    }

    @Bindable
    public String getH30696x() {
        return h30696x;
    }

    public void setH30696x(String h30696x) {
        this.h30696x = h30696x;
        notifyPropertyChanged(BR.h30696x);
    }

    @Bindable
    public String getH307() {
        return h307;
    }

    public void setH307(String h307) {
        this.h307 = h307;
        setH30796x(h307.equals("96") ? this.h30796x : ""); // for all skips, mention all skipped questions
        setH308(h307.equals("8") || h307.equals("9") ? "" : this.h308); // for all skips, mention all skipped questions
        setH309(h307.equals("8") || h307.equals("9") ? "" : this.h309); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h307);
    }

    @Bindable
    public String getH30796x() {
        return h30796x;
    }

    public void setH30796x(String h30796x) {
        this.h30796x = h30796x;
        notifyPropertyChanged(BR.h30796x);
    }

    @Bindable
    public String getH308() {
        return h308;
    }

    public void setH308(String h308) {
        this.h308 = h308;
        setH309(h308.equals("2") ? "" : this.h309); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h308);
    }

    @Bindable
    public String getH309() {
        return h309;
    }

    public void setH309(String h309) {
        this.h309 = h309;
        notifyPropertyChanged(BR.h309);
    }

    @Bindable
    public String getH310() {
        return h310;
    }

    public void setH310(String h310) {
        this.h310 = h310;
        notifyPropertyChanged(BR.h310);
    }

    @Bindable
    public String getH31096x() {
        return h31096x;
    }

    public void setH31096x(String h31096x) {
        this.h31096x = h31096x;
        notifyPropertyChanged(BR.h31096x);
    }

    @Bindable
    public String getH311a() {
        return h311a;
    }

    public void setH311a(String h311a) {
        this.h311a = h311a;
        notifyPropertyChanged(BR.h311a);
    }

    @Bindable
    public String getH311b() {
        return h311b;
    }

    public void setH311b(String h311b) {
        this.h311b = h311b;
        notifyPropertyChanged(BR.h311b);
    }

    @Bindable
    public String getH311c() {
        return h311c;
    }

    public void setH311c(String h311c) {
        this.h311c = h311c;
        notifyPropertyChanged(BR.h311c);
    }

    @Bindable
    public String getH311d() {
        return h311d;
    }

    public void setH311d(String h311d) {
        this.h311d = h311d;
        notifyPropertyChanged(BR.h311d);
    }

    @Bindable
    public String getH311e() {
        return h311e;
    }

    public void setH311e(String h311e) {
        this.h311e = h311e;
        notifyPropertyChanged(BR.h311e);
    }

    @Bindable
    public String getH311f() {
        return h311f;
    }

    public void setH311f(String h311f) {
        this.h311f = h311f;
        notifyPropertyChanged(BR.h311f);
    }

    @Bindable
    public String getH311g() {
        return h311g;
    }

    public void setH311g(String h311g) {
        this.h311g = h311g;
        notifyPropertyChanged(BR.h311g);
    }

    @Bindable
    public String getH311h() {
        return h311h;
    }

    public void setH311h(String h311h) {
        this.h311h = h311h;
        notifyPropertyChanged(BR.h311h);
    }

    @Bindable
    public String getH311i() {
        return h311i;
    }

    public void setH311i(String h311i) {
        this.h311i = h311i;
        notifyPropertyChanged(BR.h311i);
    }

    @Bindable
    public String getH311j() {
        return h311j;
    }

    public void setH311j(String h311j) {
        this.h311j = h311j;
        notifyPropertyChanged(BR.h311j);
    }

    @Bindable
    public String getH311k() {
        return h311k;
    }

    public void setH311k(String h311k) {
        this.h311k = h311k;
        notifyPropertyChanged(BR.h311k);
    }

    @Bindable
    public String getH311l() {
        return h311l;
    }

    public void setH311l(String h311l) {
        this.h311l = h311l;
        notifyPropertyChanged(BR.h311l);
    }

    @Bindable
    public String getH311m() {
        return h311m;
    }

    public void setH311m(String h311m) {
        this.h311m = h311m;
        notifyPropertyChanged(BR.h311m);
    }

    @Bindable
    public String getH311n() {
        return h311n;
    }

    public void setH311n(String h311n) {
        this.h311n = h311n;
        notifyPropertyChanged(BR.h311n);
    }

    @Bindable
    public String getH311o() {
        return h311o;
    }

    public void setH311o(String h311o) {
        this.h311o = h311o;
        notifyPropertyChanged(BR.h311o);
    }

    @Bindable
    public String getH311p() {
        return h311p;
    }

    public void setH311p(String h311p) {
        this.h311p = h311p;
        notifyPropertyChanged(BR.h311p);
    }

    @Bindable
    public String getH311q() {
        return h311q;
    }

    public void setH311q(String h311q) {
        this.h311q = h311q;
        notifyPropertyChanged(BR.h311q);
    }

    @Bindable
    public String getH311r() {
        return h311r;
    }

    public void setH311r(String h311r) {
        this.h311r = h311r;
        notifyPropertyChanged(BR.h311r);
    }

    @Bindable
    public String getH311s() {
        return h311s;
    }

    public void setH311s(String h311s) {
        this.h311s = h311s;
        notifyPropertyChanged(BR.h311s);
    }

    @Bindable
    public String getH312a() {
        return h312a;
    }

    public void setH312a(String h312a) {
        this.h312a = h312a;
        notifyPropertyChanged(BR.h312a);
    }

    @Bindable
    public String getH312b() {
        return h312b;
    }

    public void setH312b(String h312b) {
        this.h312b = h312b;
        notifyPropertyChanged(BR.h312b);
    }

    @Bindable
    public String getH312c() {
        return h312c;
    }

    public void setH312c(String h312c) {
        this.h312c = h312c;
        notifyPropertyChanged(BR.h312c);
    }

    @Bindable
    public String getH312d() {
        return h312d;
    }

    public void setH312d(String h312d) {
        this.h312d = h312d;
        notifyPropertyChanged(BR.h312d);
    }

    @Bindable
    public String getH312e() {
        return h312e;
    }

    public void setH312e(String h312e) {
        this.h312e = h312e;
        notifyPropertyChanged(BR.h312e);
    }

    @Bindable
    public String getH312f() {
        return h312f;
    }

    public void setH312f(String h312f) {
        this.h312f = h312f;
        notifyPropertyChanged(BR.h312f);
    }

    @Bindable
    public String getH312g() {
        return h312g;
    }

    public void setH312g(String h312g) {
        this.h312g = h312g;
        notifyPropertyChanged(BR.h312g);
    }

    @Bindable
    public String getH313() {
        return h313;
    }

    public void setH313(String h313) {
        this.h313 = h313;
        notifyPropertyChanged(BR.h313);
    }

    @Bindable
    public String getH313a() {
        return h313a;
    }

    public void setH313a(String h313a) {
        if (this.h313a.equals(h313a)) return; // for all checkboxes
        this.h313a = h313a;
        notifyPropertyChanged(BR.h313a);
    }

    @Bindable
    public String getH313b() {
        return h313b;
    }

    public void setH313b(String h313b) {
        if (this.h313b.equals(h313b)) return; // for all checkboxes
        this.h313b = h313b;
        notifyPropertyChanged(BR.h313b);
    }

    @Bindable
    public String getH313c() {
        return h313c;
    }

    public void setH313c(String h313c) {
        if (this.h313c.equals(h313c)) return; // for all checkboxes

        this.h313c = h313c;
        notifyPropertyChanged(BR.h313c);
    }

    @Bindable
    public String getH313d() {
        return h313d;
    }

    public void setH313d(String h313d) {
        if (this.h313d.equals(h313d)) return; // for all checkboxes
        this.h313d = h313d;
        notifyPropertyChanged(BR.h313d);
    }

    @Bindable
    public String getH313e() {
        return h313e;
    }

    public void setH313e(String h313e) {
        if (this.h313e.equals(h313e)) return; // for all checkboxes
        this.h313e = h313e;
        notifyPropertyChanged(BR.h313e);
    }

    @Bindable
    public String getH313f() {
        return h313f;
    }

    public void setH313f(String h313f) {
        if (this.h313f.equals(h313f)) return; // for all checkboxes
        this.h313f = h313f;
        notifyPropertyChanged(BR.h313f);
    }

    @Bindable
    public String getH31396() {
        return h31396;
    }

    public void setH31396(String h31396) {

        if (this.h31396.equals(h31396)) return; // for all checkboxes
        this.h31396 = h31396;
        setH31396x(h31396.equals("96") ? this.h31396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h31396);
        Log.d(TAG, "setH31396: " + this.h31396);
    }

    @Bindable
    public String getH31396x() {
        return h31396x;
    }

    public void setH31396x(String h31396x) {
        this.h31396x = h31396x;
        notifyPropertyChanged(BR.h31396x);
    }

    @Bindable
    public String getH314() {
        return h314;
    }

    public void setH314(String h314) {
        this.h314 = h314;
        setH31496x(h314.equals("96") ? this.h31496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h314);
    }

    @Bindable
    public String getH31496x() {
        return h31496x;
    }

    public void setH31496x(String h31496x) {
        this.h31496x = h31496x;
        notifyPropertyChanged(BR.h31496x);
    }

    @Bindable
    public String getH315() {
        return h315;
    }

    public void setH315(String h315) {
        this.h315 = h315;
        setH31596x(h315.equals("96") ? this.h31596x : ""); // for all skips, mention all skipped questions
        setH316(h315.equals("1") ? this.h316 : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h315);
    }

    @Bindable
    public String getH31596x() {
        return h31596x;
    }

    public void setH31596x(String h31596x) {
        this.h31596x = h31596x;
        notifyPropertyChanged(BR.h31596x);
    }

    @Bindable
    public String getH316() {
        return h316;
    }

    public void setH316(String h316) {
        this.h316 = h316;
        notifyPropertyChanged(BR.h316);
    }

    @Bindable
    public String getH317() {
        return h317;
    }

    public void setH317(String h317) {
        this.h317 = h317;
        setH31796x(h318.equals("96") ? this.h31796x : ""); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h317);
    }

    @Bindable
    public String getH31796x() {
        return h31796x;
    }

    public void setH31796x(String h31796x) {
        this.h31796x = h31796x;
        notifyPropertyChanged(BR.h31796x);
    }

    @Bindable
    public String getH318() {
        return h318;
    }

    public void setH318(String h318) {
        this.h318 = h318;
        setH31896x(h318.equals("96") ? this.h31896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h318);
    }

    @Bindable
    public String getH31896x() {
        return h31896x;
    }

    public void setH31896x(String h31896x) {
        this.h31896x = h31896x;
        notifyPropertyChanged(BR.h31896x);
    }

    @Bindable
    public String getH319() {
        return h319;
    }

    public void setH319(String h319) {
        this.h319 = h319;
        setH31996x(h319.equals("96") ? this.h31996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h319);
    }

    @Bindable
    public String getH31996x() {
        return h31996x;
    }

    public void setH31996x(String h31996x) {
        this.h31996x = h31996x;
        notifyPropertyChanged(BR.h31996x);
    }

    @Bindable
    public String getH320() {
        return h320;
    }

    public void setH320(String h320) {
        this.h320 = h320;
        notifyPropertyChanged(BR.h320);
    }

    @Bindable
    public String getH321() {
        return h321;
    }

    public void setH321(String h321) {
        this.h321 = h321;
        setH322(h321.equals("2") ? "" : this.h322); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h321);
    }

    @Bindable
    public String getH322() {
        return h322;
    }

    public void setH322(String h322) {
        this.h322 = h322;
        setH322ax(h322.equals("1") ? this.h322ax : ""); // for all skips, mention all skipped questions
        setH322bx(h322.equals("2") ? this.h322bx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h322);
    }

    @Bindable
    public String getH322ax() {
        return h322ax;
    }

    public void setH322ax(String h322ax) {
        this.h322ax = h322ax;
        notifyPropertyChanged(BR.h322ax);
    }

    @Bindable
    public String getH322bx() {
        return h322bx;
    }

    public void setH322bx(String h322bx) {
        this.h322bx = h322bx;
        notifyPropertyChanged(BR.h322bx);
    }

    @Bindable
    public String getH323() {
        return h323;
    }

    public void setH323(String h323) {
        this.h323 = h323;

        if (h323.equals("2")) {
            setH3241("");
            setH3242("");
            setH3243("");
            setH3244("");
            setH3245("");
            setH3246("");
            setH3247("");
        } else {
            setH3241(this.h3241);
            setH3242(this.h3242);
            setH3243(this.h3243);
            setH3244(this.h3244);
            setH3245(this.h3245);
            setH3246(this.h3246);
            setH3247(this.h3247);
        }
        notifyPropertyChanged(BR.h323);
    }

    @Bindable
    public String getH324() {
        return h324;
    }

    public void setH324(String h324) {
        this.h324 = h324;
        notifyPropertyChanged(BR.h324);
    }

    @Bindable
    public String getH3241() {
        return h3241;
    }

    public void setH3241(String h3241) {
        if (this.h3241 == h3241) return;
        this.h3241 = h3241;
        setH3241x(h3241.equals("1") ? this.h3241x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h3241);
    }

    @Bindable
    public String getH3241x() {
        return h3241x;
    }

    public void setH3241x(String h3241x) {
        this.h3241x = h3241x;
        notifyPropertyChanged(BR.h3241x);
    }

    @Bindable
    public String getH3242() {
        return h3242;
    }

    public void setH3242(String h3242) {
        if (this.h3242.equals(h3242)) return;
        this.h3242 = h3242;
        setH3242x(h3242.equals("2") ? this.h3242x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h3242);
    }

    @Bindable
    public String getH3242x() {
        return h3242x;
    }

    public void setH3242x(String h3242x) {
        this.h3242x = h3242x;
        notifyPropertyChanged(BR.h3242x);
    }

    @Bindable
    public String getH3243() {
        return h3243;
    }

    public void setH3243(String h3243) {
        if (this.h3243.equals(h3243)) return;
        this.h3243 = h3243;
        setH3243x(h3243.equals("3") ? this.h3243x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h3243);
    }

    @Bindable
    public String getH3243x() {
        return h3243x;
    }

    public void setH3243x(String h3243x) {
        this.h3243x = h3243x;
        notifyPropertyChanged(BR.h3243x);
    }

    @Bindable
    public String getH3244() {
        return h3244;
    }

    public void setH3244(String h3244) {
        if (this.h3244.equals(h3244)) return;
        this.h3244 = h3244;
        setH3244x(h3244.equals("4") ? this.h3244x : ""); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h3244);
    }

    @Bindable
    public String getH3244x() {
        return h3244x;
    }

    public void setH3244x(String h3244x) {
        this.h3244x = h3244x;
        notifyPropertyChanged(BR.h3244x);
    }

    @Bindable
    public String getH3245() {
        return h3245;
    }

    public void setH3245(String h3245) {
        if (this.h3245.equals(h3245)) return;

        this.h3245 = h3245;
        setH3245x(h3245.equals("5") ? this.h3245x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h3245);
    }

    @Bindable
    public String getH3245x() {
        return h3245x;
    }

    public void setH3245x(String h3245x) {
        this.h3245x = h3245x;
        notifyPropertyChanged(BR.h3245x);
    }

    @Bindable
    public String getH3246() {
        return h3246;
    }

    public void setH3246(String h3246) {
        if (this.h3246.equals(h3246)) return;

        this.h3246 = h3246;
        setH3246x(h3246.equals("6") ? this.h3246x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h3246);
    }

    @Bindable
    public String getH3246x() {
        return h3246x;
    }

    public void setH3246x(String h3246x) {

        this.h3246x = h3246x;
        notifyPropertyChanged(BR.h3246x);
    }

    @Bindable
    public String getH3247() {
        return h3247;
    }

    public void setH3247(String h3247) {
        if (this.h3247.equals(h3247)) return;

        this.h3247 = h3247;
        setH3247x(h3247.equals("7") ? this.h3247x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h3247);
    }

    @Bindable
    public String getH3247x() {
        return h3247x;
    }

    public void setH3247x(String h3247x) {
        this.h3247x = h3247x;
        notifyPropertyChanged(BR.h3247x);
    }

    @Bindable
    public String getH401() {
        return h401;
    }

    public void setH401(String h401) {
        Log.d(TAG, "setH401: " + h401);
        this.h401 = h401;
        setH402(h401.equals("1") ? this.h402 : ""); // for all skips, mention all skipped questions
        setH403a(h401.equals("1") ? this.h403a : ""); // for all skips, mention all skipped questions
        setH403b(h401.equals("1") ? this.h403b : ""); // for all skips, mention all skipped questions
        setH403c(h401.equals("1") ? this.h403c : ""); // for all skips, mention all skipped questions
        setH403d(h401.equals("1") ? this.h403d : ""); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h401);
    }

    @Bindable
    public String getH402() {
        return h402;
    }

    public void setH402(String h402) {
        Log.d(TAG, "H402: " + h402);
        Log.d(TAG, "this.h402: " + this.h402);

        this.h402 = h402;
        notifyPropertyChanged(BR.h402);
    }

    @Bindable
    public String getH403() {
        return h403;
    }

    public void setH403(String h403) {
        Log.d(TAG, "setH403: " + h403);

        this.h403 = h403;
        notifyPropertyChanged(BR.h403);
    }

    @Bindable
    public String getH403a() {
        return h403a;
    }

    public void setH403a(String h403a) {
        Log.d(TAG, "setH403a: " + h403a);

        if (this.h403a.equals(h403a)) return; // for all checkboxes
        this.h403a = h403a;
        notifyPropertyChanged(BR.h403a);
    }

    @Bindable
    public String getH403b() {
        return h403b;
    }

    public void setH403b(String h403b) {
        Log.d(TAG, "setH403b: " + h403b);

        if (this.h403b.equals(h403b)) return; // for all checkboxes
        this.h403b = h403b;
        notifyPropertyChanged(BR.h403b);
    }

    @Bindable
    public String getH403c() {
        return h403c;
    }

    public void setH403c(String h403c) {
        Log.d(TAG, "setH403c: " + h403c);

        if (this.h403c.equals(h403c)) return; // for all checkboxes
        this.h403c = h403c;
        notifyPropertyChanged(BR.h403c);
    }

    @Bindable
    public String getH403d() {
        return h403d;
    }

    public void setH403d(String h403d) {
        Log.d(TAG, "setH403d: " + h403d);

        if (this.h403d.equals(h403d)) return; // for all checkboxes
        this.h403d = h403d;
        // When NONE of above is selected clear all other check boxes for that question
        setH403a(h403d.equals("97") ? "" : this.h403a); // for all skips, mention all skipped questions
        setH403b(h403d.equals("97") ? "" : this.h403b); // for all skips, mention all skipped questions
        setH403c(h403d.equals("97") ? "" : this.h403c); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h403d);
    }

    @Bindable
    public String getH404() {
        return h404;
    }

    public void setH404(String h404) {
        Log.d(TAG, "h404: " + h404);
        Log.d(TAG, "this.h404: " + this.h404);
        this.h404 = h404;
        setH405a(h404.equals("2") ? "" : this.h405a); // for all skips, mention all skipped questions
        setH405b(h404.equals("2") ? "" : this.h405b); // for all skips, mention all skipped questions
        setH405c(h404.equals("2") ? "" : this.h405c); // for all skips, mention all skipped questions
        setH405d(h404.equals("2") ? "" : this.h405c); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h404);
    }

    @Bindable
    public String getH405() {
        return h405;
    }

    public void setH405(String h405) {
        this.h405 = h405;
        notifyPropertyChanged(BR.h405);
    }

    @Bindable
    public String getH405a() {
        return h405a;
    }

    public void setH405a(String h405a) {
        Log.d(TAG, "h405a: " + h405a);
        Log.d(TAG, "this.h405a: " + this.h405a);
        if (this.h405a.equals(h405a)) return; // for all checkboxes
        this.h405a = h405a;
        notifyPropertyChanged(BR.h405a);
    }

    @Bindable
    public String getH405b() {
        return h405b;
    }

    public void setH405b(String h405b) {
        if (this.h405b.equals(h405b)) return; // for all checkboxes
        this.h405b = h405b;
        notifyPropertyChanged(BR.h405b);
    }

    @Bindable
    public String getH405c() {
        return h405c;
    }

    public void setH405c(String h405c) {
        if (this.h405c.equals(h405c)) return; // for all checkboxes
        this.h405c = h405c;
        notifyPropertyChanged(BR.h405c);
    }

    @Bindable
    public String getH405d() {
        return h405d;
    }

    public void setH405d(String h405d) {

        if (this.h405d.equals(h405d)) return; // for all checkboxes
        this.h405d = h405d;
        // When NONE of above is selected clear all other check boxes for that question ()
        setH405a(h405d.equals("97") ? "" : this.h405a); // for all skips, mention all skipped questions
        setH405b(h405d.equals("97") ? "" : this.h405b); // for all skips, mention all skipped questions
        setH405c(h405d.equals("97") ? "" : this.h405c); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h405d);
    }

    @Bindable
    public String getH406a() {
        return h406a;
    }

    public void setH406a(String h406a) {
        this.h406a = h406a;
        notifyPropertyChanged(BR.h406a);
    }

    @Bindable
    public String getH406b() {
        return h406b;
    }

    public void setH406b(String h406b) {
        this.h406b = h406b;
        notifyPropertyChanged(BR.h406b);
    }

    @Bindable
    public String getH406c() {
        return h406c;
    }

    public void setH406c(String h406c) {
        this.h406c = h406c;
        notifyPropertyChanged(BR.h406c);
    }

    @Bindable
    public String getH406d() {
        return h406d;
    }

    public void setH406d(String h406d) {
        this.h406d = h406d;
        notifyPropertyChanged(BR.h406d);
    }

    @Bindable
    public String getH406e() {
        return h406e;
    }

    public void setH406e(String h406e) {
        this.h406e = h406e;
        notifyPropertyChanged(BR.h406e);
    }

    @Bindable
    public String getH406f() {
        return h406f;
    }

    public void setH406f(String h406f) {
        this.h406f = h406f;
        setH406fx(h406f.equals("2") ? "" : this.h406fx); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h406f);
    }

    @Bindable
    public String getH406fx() {
        return h406fx;
    }

    public void setH406fx(String h406fx) {
        this.h406fx = h406fx;
        notifyPropertyChanged(BR.h406f);
    }

    @Bindable
    public String getH501() {
        return h501;
    }

    public void setH501(String h501) {
        this.h501 = h501;

        // seperated condition check which used in multiple skips
        boolean h501check = h501.equals("1") || h501.equals("2") || h501.equals("3");

        setH502(h501check ? this.h502 : ""); // for all skips, mention all skipped questions
        setH503(h501check ? this.h503 : ""); // for all skips, mention all skipped questions
        setH50196x(h501.equals("96") ? this.h50196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h501);
    }

    @Bindable
    public String getH50196x() {
        return h50196x;
    }

    public void setH50196x(String h50196x) {
        this.h50196x = h50196x;
        notifyPropertyChanged(BR.h50196x);
    }

    @Bindable
    public String getH502() {
        return h502;
    }

    public void setH502(String h502) {
        this.h502 = h502;
        notifyPropertyChanged(BR.h502);
    }

    @Bindable
    public String getH503() {
        return h503;
    }

    public void setH503(String h503) {
        this.h503 = h503;
        notifyPropertyChanged(BR.h503);
    }

    @Bindable
    public String getH601() {
        return h601;
    }

    public void setH601(String h601) {
        this.h601 = h601;
        setH602(h601.equals("2") ? "" : this.h602); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h601);
    }

    @Bindable
    public String getH602() {
        return h602;
    }

    public void setH602(String h602) {
        this.h602 = h602;
        notifyPropertyChanged(BR.h602);
    }

    @Bindable
    public String getH603() {
        return h603;
    }

    public void setH603(String h603) {
        this.h603 = h603;
        setH604(h603.equals("2") ? "" : this.h604); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h603);
    }

    @Bindable
    public String getH604() {
        return h604;
    }

    public void setH604(String h604) {
        this.h604 = h604;
        notifyPropertyChanged(BR.h604);
    }

    @Bindable
    public String getH605() {
        return h605;
    }

    public void setH605(String h605) {
        this.h605 = h605;
        setH606(h605.equals("2") ? "" : this.h606); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h605);
    }

    @Bindable
    public String getH606() {
        return h606;
    }

    public void setH606(String h606) {
        this.h606 = h606;
        notifyPropertyChanged(BR.h606);
    }

    @Bindable
    public String getH607() {
        return h607;
    }

    public void setH607(String h607) {
        this.h607 = h607;
        setH608(h607.equals("2") ? "" : this.h608); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h607);
    }

    @Bindable
    public String getH608() {
        return h608;
    }

    public void setH608(String h608) {
        this.h608 = h608;
        notifyPropertyChanged(BR.h608);
    }

    @Bindable
    public String getH609() {
        return h609;
    }

    public void setH609(String h609) {
        this.h609 = h609;
        setH610(h609.equals("2") ? "" : this.h610); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h609);
    }

    @Bindable
    public String getH610() {
        return h610;
    }

    public void setH610(String h610) {
        this.h610 = h610;
        notifyPropertyChanged(BR.h610);
    }

    @Bindable
    public String getH611() {
        return h611;
    }

    public void setH611(String h611) {
        this.h611 = h611;
        setH612(h611.equals("2") ? "" : this.h612); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h611);
    }

    @Bindable
    public String getH612() {
        return h612;
    }

    public void setH612(String h612) {
        this.h612 = h612;
        notifyPropertyChanged(BR.h612);
    }

    @Bindable
    public String getH613() {
        return h613;
    }

    public void setH613(String h613) {
        this.h613 = h613;
        setH614(h613.equals("2") ? "" : this.h614); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h613);
    }

    @Bindable
    public String getH614() {
        return h614;
    }

    public void setH614(String h614) {
        this.h614 = h614;
        notifyPropertyChanged(BR.h614);
    }

    @Bindable
    public String getH615() {
        return h615;
    }

    public void setH615(String h615) {
        this.h615 = h615;
        setH616(h615.equals("2") ? "" : this.h616); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h615);
    }

    @Bindable
    public String getH616() {
        return h616;
    }

    public void setH616(String h616) {
        this.h616 = h616;
        notifyPropertyChanged(BR.h616);
    }

    @Bindable
    public String getH617() {
        return h617;
    }

    public void setH617(String h617) {
        this.h617 = h617;
        setH618(h617.equals("2") ? "" : this.h618); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h617);
    }

    @Bindable
    public String getH618() {
        return h618;
    }

    public void setH618(String h618) {
        this.h618 = h618;
        notifyPropertyChanged(BR.h618);
    }

    @Bindable
    public String getH701() {
        return h701;
    }

    public void setH701(String h701) {
        this.h701 = h701;

        setH701q(h701.equals("2") ? "" : this.h701q); // for all skips, mention all skipped questions
        setH701s(h701.equals("2") ? "" : this.h701s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h701);
    }

    @Bindable
    public String getH701q() {
        return h701q;
    }

    public void setH701q(String h701q) {
        this.h701q = h701q;
        notifyPropertyChanged(BR.h701q);
    }

    @Bindable
    public String getH701s() {
        return h701s;
    }

    public void setH701s(String h701s) {
        this.h701s = h701s;
        notifyPropertyChanged(BR.h701s);
    }

    @Bindable
    public String getH702() {
        return h702;
    }

    public void setH702(String h702) {
        this.h702 = h702;
        setH702q(h702.equals("2") ? "" : this.h702q); // for all skips, mention all skipped questions
        setH702s(h702.equals("2") ? "" : this.h702s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h702);
    }

    @Bindable
    public String getH702q() {
        return h702q;
    }

    public void setH702q(String h702q) {
        this.h702q = h702q;
        notifyPropertyChanged(BR.h702q);
    }

    @Bindable
    public String getH702s() {
        return h702s;
    }

    public void setH702s(String h702s) {
        this.h702s = h702s;
        notifyPropertyChanged(BR.h702s);
    }

    @Bindable
    public String getH703() {
        return h703;
    }

    public void setH703(String h703) {
        this.h703 = h703;
        setH703q(h703.equals("2") ? "" : this.h703q); // for all skips, mention all skipped questions
        setH703s(h703.equals("2") ? "" : this.h703s); // for all skips, mention all skipped questions

        notifyPropertyChanged(BR.h703);
    }

    @Bindable
    public String getH703q() {
        return h703q;
    }

    public void setH703q(String h703q) {
        this.h703q = h703q;
        notifyPropertyChanged(BR.h703q);
    }

    @Bindable
    public String getH703s() {
        return h703s;
    }

    public void setH703s(String h703s) {
        this.h703s = h703s;
        notifyPropertyChanged(BR.h703s);
    }

    @Bindable
    public String getH704() {
        return h704;
    }

    public void setH704(String h704) {
        this.h704 = h704;
        setH704q(h704.equals("2") ? "" : this.h704q); // for all skips, mention all skipped questions
        setH704s(h704.equals("2") ? "" : this.h704s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h704);
    }

    @Bindable
    public String getH704q() {
        return h704q;
    }

    public void setH704q(String h704q) {
        this.h704q = h704q;
        notifyPropertyChanged(BR.h704q);
    }

    @Bindable
    public String getH704s() {
        return h704s;
    }

    public void setH704s(String h704s) {
        this.h704s = h704s;
        notifyPropertyChanged(BR.h704s);
    }

    @Bindable
    public String getH705() {
        return h705;
    }

    public void setH705(String h705) {
        this.h705 = h705;
        setH705q(h705.equals("2") ? "" : this.h705q); // for all skips, mention all skipped questions
        setH705s(h705.equals("2") ? "" : this.h705s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h705);
    }

    @Bindable
    public String getH705q() {
        return h705q;
    }

    public void setH705q(String h705q) {
        this.h705q = h705q;
        notifyPropertyChanged(BR.h705q);
    }

    @Bindable
    public String getH705s() {
        return h705s;
    }

    public void setH705s(String h705s) {
        this.h705s = h705s;
        notifyPropertyChanged(BR.h705s);
    }

    @Bindable
    public String getH706() {
        return h706;
    }

    public void setH706(String h706) {
        this.h706 = h706;
        setH706q(h706.equals("2") ? "" : this.h706q); // for all skips, mention all skipped questions
        setH706s(h706.equals("2") ? "" : this.h706s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h706);
    }

    @Bindable
    public String getH706q() {
        return h706q;
    }

    public void setH706q(String h706q) {
        this.h706q = h706q;
        notifyPropertyChanged(BR.h706q);
    }

    @Bindable
    public String getH706s() {
        return h706s;
    }

    public void setH706s(String h706s) {
        this.h706s = h706s;
        notifyPropertyChanged(BR.h706s);
    }

    @Bindable
    public String getH707() {
        return h707;
    }

    public void setH707(String h707) {
        this.h707 = h707;
        setH707q(h707.equals("2") ? "" : this.h707q); // for all skips, mention all skipped questions
        setH707s(h707.equals("2") ? "" : this.h707s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h707);
    }

    @Bindable
    public String getH707q() {
        return h707q;
    }

    public void setH707q(String h707q) {
        this.h707q = h707q;
        notifyPropertyChanged(BR.h707q);
    }

    @Bindable
    public String getH707s() {
        return h707s;
    }

    public void setH707s(String h707s) {
        this.h707s = h707s;
        notifyPropertyChanged(BR.h707s);
    }

    @Bindable
    public String getH708() {
        return h708;
    }

    public void setH708(String h708) {
        this.h708 = h708;
        setH708q(h708.equals("2") ? "" : this.h708q); // for all skips, mention all skipped questions
        setH708s(h708.equals("2") ? "" : this.h708s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h708);
    }

    @Bindable
    public String getH708q() {
        return h708q;
    }

    public void setH708q(String h708q) {
        this.h708q = h708q;
        notifyPropertyChanged(BR.h708q);
    }

    @Bindable
    public String getH708s() {
        return h708s;
    }

    public void setH708s(String h708s) {
        this.h708s = h708s;
        notifyPropertyChanged(BR.h708s);
    }

    @Bindable
    public String getH709() {
        return h709;
    }

    public void setH709(String h709) {
        this.h709 = h709;
        setH701q(h701.equals("2") ? "" : this.h701q); // for all skips, mention all skipped questions
        setH701s(h701.equals("2") ? "" : this.h701s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h709);
    }

    @Bindable
    public String getH709q() {
        return h709q;
    }

    public void setH709q(String h709q) {
        this.h709q = h709q;
        notifyPropertyChanged(BR.h709q);
    }

    @Bindable
    public String getH709s() {
        return h709s;
    }

    public void setH709s(String h709s) {
        this.h709s = h709s;
        notifyPropertyChanged(BR.h709s);
    }

    @Bindable
    public String getH710() {
        return h710;
    }

    public void setH710(String h710) {
        this.h710 = h710;
        setH710q(h710.equals("2") ? "" : this.h710q); // for all skips, mention all skipped questions
        setH710s(h710.equals("2") ? "" : this.h710s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h710);
    }

    @Bindable
    public String getH710q() {
        return h710q;
    }

    public void setH710q(String h710q) {
        this.h710q = h710q;
        notifyPropertyChanged(BR.h710q);
    }

    @Bindable
    public String getH710s() {
        return h710s;
    }

    public void setH710s(String h710s) {
        this.h710s = h710s;
        notifyPropertyChanged(BR.h710s);
    }

    @Bindable
    public String getH711() {
        return h711;
    }

    public void setH711(String h711) {
        this.h711 = h711;
        setH711q(h711.equals("2") ? "" : this.h711q); // for all skips, mention all skipped questions
        setH711s(h711.equals("2") ? "" : this.h711s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h711);
    }

    @Bindable
    public String getH711q() {
        return h711q;
    }

    public void setH711q(String h711q) {
        this.h711q = h711q;
        notifyPropertyChanged(BR.h711q);
    }

    @Bindable
    public String getH711s() {
        return h711s;
    }

    public void setH711s(String h711s) {
        this.h711s = h711s;
        notifyPropertyChanged(BR.h711s);
    }

    @Bindable
    public String getH712() {
        return h712;
    }

    public void setH712(String h712) {
        this.h712 = h712;
        setH712q(h712.equals("2") ? "" : this.h712q); // for all skips, mention all skipped questions
        setH712s(h712.equals("2") ? "" : this.h712s); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h712);
    }

    @Bindable
    public String getH712q() {
        return h712q;
    }

    public void setH712q(String h712q) {
        this.h712q = h712q;
        notifyPropertyChanged(BR.h712q);
    }

    @Bindable
    public String getH712s() {
        return h712s;
    }

    public void setH712s(String h712s) {
        this.h712s = h712s;
        notifyPropertyChanged(BR.h712s);
    }

    @Bindable
    public String getH713a() {
        return h713a;
    }

    public void setH713a(String h713a) {
        this.h713a = h713a;
        setH713b(h713a.equals("2") ? "" : this.h713b); // for all skips, mention all skipped questions
        setH713c(h713a.equals("2") ? "" : this.h713c); // for all skips, mention all skipped questions
        setH713d(h713a.equals("2") ? "" : this.h713d); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h713a);
    }

    @Bindable
    public String getH713b() {
        return h713b;
    }

    public void setH713b(String h713b) {
        this.h713b = h713b;
        notifyPropertyChanged(BR.h713b);
    }

    @Bindable
    public String getH713c() {
        return h713c;
    }

    public void setH713c(String h713c) {
        this.h713c = h713c;
        notifyPropertyChanged(BR.h713c);
    }

    @Bindable
    public String getH713d() {
        return h713d;
    }

    public void setH713d(String h713d) {
        this.h713d = h713d;
        notifyPropertyChanged(BR.h713d);
    }

    @Bindable
    public String getH714a() {
        return h714a;
    }

    public void setH714a(String h714a) {
        this.h714a = h714a;
        setH714b(h714a.equals("2") ? "" : this.h714b); // for all skips, mention all skipped questions
        setH714c(h714a.equals("2") ? "" : this.h714c); // for all skips, mention all skipped questions
        setH714d(h714a.equals("2") ? "" : this.h714d); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.h714a);
    }

    @Bindable
    public String getH714b() {
        return h714b;
    }

    public void setH714b(String h714b) {
        this.h714b = h714b;
        notifyPropertyChanged(BR.h714b);
    }

    @Bindable
    public String getH714c() {
        return h714c;
    }

    public void setH714c(String h714c) {
        this.h714c = h714c;
        notifyPropertyChanged(BR.h714c);
    }

    @Bindable
    public String getH714d() {
        return h714d;
    }

    public void setH714d(String h714d) {
        this.h714d = h714d;
        notifyPropertyChanged(BR.h714d);
    }

    @Bindable
    public String getW101d() {
        return w101d;
    }

    public void setW101d(String w101d) {
        this.w101d = w101d;
        notifyPropertyChanged(BR.w101d);
    }

    @Bindable
    public String getW101m() {
        return w101m;
    }

    public void setW101m(String w101m) {
        this.w101m = w101m;
        notifyPropertyChanged(BR.w101m);
    }

    @Bindable
    public String getW101y() {
        return w101y;
    }

    public void setW101y(String w101y) {
        this.w101y = w101y;
        notifyPropertyChanged(BR.w101y);
    }

    @Bindable
    public String getW102() {
        return w102;
    }

    public void setW102(String w102) {
        this.w102 = w102;
        notifyPropertyChanged(BR.w102);
    }

    @Bindable
    public String getW103() {
        return w103;
    }

    public void setW103(String w103) {
        this.w103 = w103;
        setW104(w103.equals("1") ? this.w104 : "");
        setW105(w103.equals("1") ? this.w105 : "");
        setW106(w103.equals("1") ? this.w106 : "");
        setW107(w103.equals("1") ? this.w107 : "");
        setW108(w103.equals("1") ? this.w108 : "");
        setW109(w103.equals("1") ? this.w109 : "");
        setW110(w103.equals("1") ? this.w110 : "");
        setW111(w103.equals("1") ? this.w111 : "");
        setW112(w103.equals("1") ? this.w112 : "");
        notifyPropertyChanged(BR.w103);
    }

    @Bindable
    public String getW104() {
        return w104;
    }

    public void setW104(String w104) {
        this.w104 = w104;
        notifyPropertyChanged(BR.w104);
    }

    @Bindable
    public String getW105() {
        return w105;
    }

    public void setW105(String w105) {
        this.w105 = w105;
        notifyPropertyChanged(BR.w105);
    }

    @Bindable
    public String getW106() {
        return w106;
    }

    public void setW106(String w106) {
        this.w106 = w106;
        notifyPropertyChanged(BR.w106);
    }

    @Bindable
    public String getW107() {
        return w107;
    }

    public void setW107(String w107) {
        this.w107 = w107;
        notifyPropertyChanged(BR.w107);
    }

    @Bindable
    public String getW108() {
        return w108;
    }

    public void setW108(String w108) {
        this.w108 = w108;
        notifyPropertyChanged(BR.w108);
    }

    @Bindable
    public String getW109() {
        return w109;
    }

    public void setW109(String w109) {
        this.w109 = w109;
        notifyPropertyChanged(BR.w109);
    }

    @Bindable
    public String getW110() {
        return w110;
    }

    public void setW110(String w110) {
        this.w110 = w110;
        notifyPropertyChanged(BR.w110);
    }

    @Bindable
    public String getW111() {
        return w111;
    }

    public void setW111(String w111) {
        this.w111 = w111;
        notifyPropertyChanged(BR.w111);
    }

    @Bindable
    public String getW112() {
        return w112;
    }

    public void setW112(String w112) {
        this.w112 = w112;
        notifyPropertyChanged(BR.w112);
    }

    @Bindable
    public String getW201() {
        return w201;
    }

    public void setW201(String w201) {
        this.w201 = w201;

        setW202a(w201.equals("1") ? this.w202a : "");
        setW202b(w201.equals("1") ? this.w202b : "");
        setW202c(w201.equals("1") ? this.w202c : "");
        setW202d(w201.equals("1") ? this.w202d : "");
        setW202e(w201.equals("1") ? this.w202e : "");
        setW202f(w201.equals("1") ? this.w202f : "");
        setW202g(w201.equals("1") ? this.w202g : "");
        setW202h(w201.equals("1") ? this.w202h : "");
        setW20296(w201.equals("1") ? this.w20296 : "");

        setW203(w201.equals("1") ? this.w203 : "");
        setW204(w201.equals("1") ? this.w204 : "");
        setW205(w201.equals("1") ? this.w205 : "");
        setW206(w201.equals("1") ? this.w206 : "");

        setW20601(w201.equals("1") ? this.w20601 : "");
        setW20602(w201.equals("1") ? this.w20602 : "");
        setW20603(w201.equals("1") ? this.w20603 : "");
        setW20604(w201.equals("1") ? this.w20604 : "");
        setW20605(w201.equals("1") ? this.w20605 : "");
        setW20606(w201.equals("1") ? this.w20606 : "");
        setW20607(w201.equals("1") ? this.w20607 : "");
        setW20608(w201.equals("1") ? this.w20608 : "");
        setW20696(w201.equals("1") ? this.w20696 : "");
        setW20697(w201.equals("1") ? this.w20697 : "");
        setW20696x(w201.equals("1") ? this.w20696x : "");

        notifyPropertyChanged(BR.w201);
    }

    @Bindable
    public String getW202() {
        return w202;
    }

    public void setW202(String w202) {
        this.w202 = w202;
        notifyPropertyChanged(BR.w202);
    }

    @Bindable
    public String getW202a() {
        return w202a;
    }

    public void setW202a(String w202a) {
        if (this.w202a.equals(w202a)) return; // for all checkboxes
        this.w202a = w202a;
        notifyPropertyChanged(BR.w202a);
    }

    @Bindable
    public String getW202b() {
        return w202b;
    }

    public void setW202b(String w202b) {
        if (this.w202b.equals(w202b)) return; // for all checkboxes
        this.w202b = w202b;
        notifyPropertyChanged(BR.w202b);
    }

    @Bindable
    public String getW202c() {
        return w202c;
    }

    public void setW202c(String w202c) {
        if (this.w202c.equals(w202c)) return; // for all checkboxes
        this.w202c = w202c;
        notifyPropertyChanged(BR.w202c);
    }

    @Bindable
    public String getW202d() {
        return w202d;
    }

    public void setW202d(String w202d) {
        if (this.w202d.equals(w202d)) return; // for all checkboxes
        this.w202d = w202d;
        notifyPropertyChanged(BR.w202d);
    }

    @Bindable
    public String getW202e() {
        return w202e;
    }

    public void setW202e(String w202e) {
        if (this.w202e.equals(w202e)) return; // for all checkboxes
        this.w202e = w202e;
        notifyPropertyChanged(BR.w202e);
    }

    @Bindable
    public String getW202f() {
        return w202f;
    }

    public void setW202f(String w202f) {
        if (this.w202f.equals(w202f)) return; // for all checkboxes
        this.w202f = w202f;
        notifyPropertyChanged(BR.w202f);
    }

    @Bindable
    public String getW202g() {
        return w202g;
    }

    public void setW202g(String w202g) {
        if (this.w202g.equals(w202g)) return; // for all checkboxes
        this.w202g = w202g;
        notifyPropertyChanged(BR.w202g);
    }

    @Bindable
    public String getW202h() {
        return w202h;
    }

    public void setW202h(String w202h) {
        if (this.w202h.equals(w202h)) return; // for all checkboxes
        this.w202h = w202h;
        notifyPropertyChanged(BR.w202h);
    }

    @Bindable
    public String getW20296() {
        return w20296;
    }

    public void setW20296(String w20296) {
        if (this.w20296.equals(w20296)) return; // for all checkboxes
        this.w20296 = w20296;
        setW20296x(w20296.equals("96") ? this.w20296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w20296);
    }

    @Bindable
    public String getW20296x() {
        return w20296x;
    }

    public void setW20296x(String w20296x) {
        this.w20296x = w20296x;
        notifyPropertyChanged(BR.w20296x);
    }

    @Bindable
    public String getW203() {
        return w203;
    }

    public void setW203(String w203) {
        this.w203 = w203;
        setW203961x(w203.equals("961") ? this.w203961x : ""); // for all skips, mention all skipped questions
        setW203962x(w203.equals("962") ? this.w203962x : ""); // for all skips, mention all skipped questions
        setW203963x(w203.equals("963") ? this.w203963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w203);
    }

    @Bindable
    public String getW203961x() {
        return w203961x;
    }

    public void setW203961x(String w203961x) {
        this.w203961x = w203961x;
        notifyPropertyChanged(BR.w203961x);
    }

    @Bindable
    public String getW203962x() {
        return w203962x;
    }

    public void setW203962x(String w203962x) {
        this.w203962x = w203962x;
        notifyPropertyChanged(BR.w203962x);
    }

    @Bindable
    public String getW203963x() {
        return w203963x;
    }

    public void setW203963x(String w203963x) {
        this.w203963x = w203963x;
        notifyPropertyChanged(BR.w203963x);
    }

    @Bindable
    public String getW204() {
        return w204;
    }

    public void setW204(String w204) {
        setW204wx(w204.equals("1") ? this.w204wx : ""); // for all skips, mention all skipped questions
        setW204mx(w204.equals("2") ? this.w204mx : ""); // for all skips, mention all skipped questions
        this.w204 = w204;
        notifyPropertyChanged(BR.w204);
    }

    @Bindable
    public String getW204wx() {
        return w204wx;
    }

    public void setW204wx(String w204wx) {
        this.w204wx = w204wx;
        notifyPropertyChanged(BR.w204wx);
    }

    @Bindable
    public String getW204mx() {
        return w204mx;
    }

    public void setW204mx(String w204mx) {
        this.w204mx = w204mx;
        notifyPropertyChanged(BR.w204mx);
    }

    @Bindable
    public String getW205() {
        return w205;
    }

    public void setW205(String w205) {
        if (this.w205.equals(w205)) return; // for all checkboxes
        this.w205 = w205;
        setW205ax(w205.equals("98") ? "" : this.w205ax); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w205);
    }

    @Bindable
    public String getW205ax() {
        return w205ax;
    }

    public void setW205ax(String w205ax) {
        this.w205ax = w205ax;
        notifyPropertyChanged(BR.w205ax);
    }

    @Bindable
    public String getW206() {
        return w206;
    }

    public void setW206(String w206) {
        this.w206 = w206;
        setW20696x(w206.equals("96") ? this.w20696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w206);
    }

    @Bindable
    public String getW20696x() {
        return w20696x;
    }

    public void setW20696x(String w20696x) {
        this.w20696x = w20696x;
        notifyPropertyChanged(BR.w20696x);
    }

    @Bindable
    public String getW20601() {
        return w20601;
    }

    public void setW20601(String w20601) {
        this.w20601 = w20601;
        notifyPropertyChanged(BR.w20601);
    }

    @Bindable
    public String getW20602() {
        return w20602;
    }

    public void setW20602(String w20602) {
        this.w20602 = w20602;
        notifyPropertyChanged(BR.w20602);
    }

    @Bindable
    public String getW20603() {
        return w20603;
    }

    public void setW20603(String w20603) {
        this.w20603 = w20603;
        notifyPropertyChanged(BR.w20603);
    }

    @Bindable
    public String getW20604() {
        return w20604;
    }

    public void setW20604(String w20604) {
        this.w20604 = w20604;
        notifyPropertyChanged(BR.w20604);
    }

    @Bindable
    public String getW20605() {
        return w20605;
    }

    public void setW20605(String w20605) {
        this.w20605 = w20605;
        notifyPropertyChanged(BR.w20605);
    }

    @Bindable
    public String getW20606() {
        return w20606;
    }

    public void setW20606(String w20606) {
        this.w20606 = w20606;
        notifyPropertyChanged(BR.w20606);
    }

    @Bindable
    public String getW20607() {
        return w20607;
    }

    public void setW20607(String w20607) {
        this.w20607 = w20607;
        notifyPropertyChanged(BR.w20607);
    }

    @Bindable
    public String getW20608() {
        return w20608;
    }

    public void setW20608(String w20608) {
        this.w20608 = w20608;
        notifyPropertyChanged(BR.w20608);
    }

    @Bindable
    public String getW20696() {
        return w20696;
    }

    public void setW20696(String w20696) {
        this.w20696 = w20696;
        setW20696x(w20696.equals("1") ? this.w20696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w20696);
    }

    @Bindable
    public String getW20697() {
        return w20697;
    }

    public void setW20697(String w20697) {
        this.w20697 = w20697;
        setW20601(w20697.equals("1") ? "" : this.w20601);
        setW20602(w20697.equals("1") ? "" : this.w20602);
        setW20603(w20697.equals("1") ? "" : this.w20603);
        setW20604(w20697.equals("1") ? "" : this.w20604);
        setW20605(w20697.equals("1") ? "" : this.w20605);
        setW20606(w20697.equals("1") ? "" : this.w20606);
        setW20607(w20697.equals("1") ? "" : this.w20607);
        setW20608(w20697.equals("1") ? "" : this.w20608);
        setW20696(w20697.equals("1") ? "" : this.w20696);
        notifyPropertyChanged(BR.w20697);
    }

    @Bindable
    public String getW207() {
        return w207;
    }

    public void setW207(String w207) {
        this.w207 = w207;
        setW208(w207.equals("1") ? this.w208 : "");
        setW209(w207.equals("1") ? this.w209 : "");
        setW210961(w207.equals("1") ? this.w210961 : "");
        setW210962(w207.equals("1") ? this.w210962 : "");
        setW210963(w207.equals("1") ? this.w210963 : "");
        setW211(w207.equals("1") ? this.w211 : "");
        setW212(w207.equals("1") ? this.w212 : "");
        notifyPropertyChanged(BR.w207);
    }

    @Bindable
    public String getW208() {
        return w208;
    }

    public void setW208(String w208) {
        this.w208 = w208;
        notifyPropertyChanged(BR.w208);
    }

    @Bindable
    public String getW209() {
        return w209;
    }

    public void setW209(String w209) {
        this.w209 = w209;
        setW20996x(w209.equals("96") ? this.w20996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w209);
    }

    @Bindable
    public String getW20996x() {
        return w20996x;
    }

    public void setW20996x(String w20996x) {
        this.w20996x = w20996x;
        notifyPropertyChanged(BR.w20996x);
    }

    @Bindable
    public String getW210() {
        return w210;
    }

    public void setW210(String w210) {
        this.w210 = w210;
        notifyPropertyChanged(BR.w210);
    }

    @Bindable
    public String getW210961() {
        return w210961;
    }

    public void setW210961(String w210961) {
        if (this.w210961.equals(w210961)) return; // for all checkboxes
        this.w210961 = w210961;
        setW210961x(w210961.equals("961") ? this.w210961x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w210961);
    }

    @Bindable
    public String getW210961x() {
        return w210961x;
    }

    public void setW210961x(String w210961x) {
        this.w210961x = w210961x;
        notifyPropertyChanged(BR.w210961x);
    }

    @Bindable
    public String getW210962() {
        return w210962;
    }

    public void setW210962(String w210962) {
        if (this.w210962.equals(w210962)) return; // for all checkboxes
        this.w210962 = w210962;
        setW210962x(w210962.equals("962") ? this.w210962x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w210962);
    }

    @Bindable
    public String getW210962x() {
        return w210962x;
    }

    public void setW210962x(String w210962x) {
        this.w210962x = w210962x;
        notifyPropertyChanged(BR.w210962x);
    }

    @Bindable
    public String getW210963() {
        return w210963;
    }

    public void setW210963(String w210963) {
        if (this.w210963.equals(w210963)) return; // for all checkboxes
        this.w210963 = w210963;
        setW210963x(w210963.equals("963") ? this.w210963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w210963);
    }

    @Bindable
    public String getW210963x() {
        return w210963x;
    }

    public void setW210963x(String w210963x) {
        this.w210963x = w210963x;
        notifyPropertyChanged(BR.w210963x);
    }

    @Bindable
    public String getW211() {
        return w211;
    }

    public void setW211(String w211) {
        this.w211 = w211;
        notifyPropertyChanged(BR.w211);
    }

    @Bindable
    public String getW212() {
        return w212;
    }

    public void setW212(String w212) {
        this.w212 = w212;
        setW212mx(w212.equals("1") ? this.w212mx : ""); // for all skips, mention all skipped questions
        setW212dx(w212.equals("2") ? this.w212dx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w212);
    }

    @Bindable
    public String getW212mx() {
        return w212mx;
    }

    public void setW212mx(String w212mx) {
        this.w212mx = w212mx;
        notifyPropertyChanged(BR.w212mx);
    }

    @Bindable
    public String getW212dx() {
        return w212dx;
    }

    public void setW212dx(String w212dx) {
        this.w212dx = w212dx;
        notifyPropertyChanged(BR.w212dx);
    }

    @Bindable
    public String getW213() {
        return w213;
    }

    public void setW213(String w213) {
        this.w213 = w213;
        setW214(w213.equals("1") ? this.w214 : "");
        setW215961(w213.equals("1") ? this.w215961 : "");
        setW215962(w213.equals("1") ? this.w215962 : "");
        setW215963(w213.equals("1") ? this.w215963 : "");
        setW216(w213.equals("1") ? this.w216 : "");
        setW217(w213.equals("1") ? this.w217 : "");
        notifyPropertyChanged(BR.w213);
    }

    @Bindable
    public String getW214() {
        return w214;
    }

    public void setW214(String w214) {
        this.w214 = w214;
        setW21496x(w214.equals("96") ? this.w21496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w214);
    }

    @Bindable
    public String getW21496x() {
        return w21496x;
    }

    public void setW21496x(String w21496x) {
        this.w21496x = w21496x;
        notifyPropertyChanged(BR.w21496x);
    }

    @Bindable
    public String getW215() {
        return w215;
    }

    public void setW215(String w215) {
        this.w215 = w215;
        notifyPropertyChanged(BR.w215);
    }

    @Bindable
    public String getW215961() {
        return w215961;
    }

    public void setW215961(String w215961) {
        if (this.w215961.equals(w215961)) return; // for all checkboxes
        this.w215961 = w215961;
        setW215961x(w215961.equals("961") ? this.w215961x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w215961);
    }

    @Bindable
    public String getW215961x() {
        return w215961x;
    }

    public void setW215961x(String w215961x) {
        this.w215961x = w215961x;
        notifyPropertyChanged(BR.w215961x);
    }

    @Bindable
    public String getW215962() {
        return w215962;
    }

    public void setW215962(String w215962) {
        if (this.w215962.equals(w215962)) return; // for all checkboxes
        this.w215962 = w215962;
        setW215962x(w215962.equals("962") ? this.w215962x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w215962);
    }

    @Bindable
    public String getW215962x() {
        return w215962x;
    }

    public void setW215962x(String w215962x) {
        this.w215962x = w215962x;
        notifyPropertyChanged(BR.w215962x);
    }

    @Bindable
    public String getW215963() {
        return w215963;
    }

    public void setW215963(String w215963) {
        if (this.w215963.equals(w215963)) return; // for all checkboxes
        this.w215963 = w215963;
        setW215963x(w215963.equals("963") ? this.w215963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w215963);
    }

    @Bindable
    public String getW215963x() {
        return w215963x;
    }

    public void setW215963x(String w215963x) {
        this.w215963x = w215963x;
        notifyPropertyChanged(BR.w215963x);
    }

    @Bindable
    public String getW216() {
        return w216;
    }

    public void setW216(String w216) {
        this.w216 = w216;
        notifyPropertyChanged(BR.w216);
    }

    @Bindable
    public String getW217() {
        return w217;
    }

    public void setW217(String w217) {
        this.w217 = w217;
        setW217mx(w217.equals("1") ? this.w217mx : ""); // for all skips, mention all skipped questions
        setW217dx(w217.equals("2") ? this.w217dx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w217);
    }

    @Bindable
    public String getW217mx() {
        return w217mx;
    }

    public void setW217mx(String w217mx) {
        this.w217mx = w217mx;
        notifyPropertyChanged(BR.w217mx);
    }

    @Bindable
    public String getW217dx() {
        return w217dx;
    }

    public void setW217dx(String w217dx) {
        this.w217dx = w217dx;
        notifyPropertyChanged(BR.w217dx);
    }

    @Bindable
    public String getW218() {
        return w218;
    }

    public void setW218(String w218) {
        this.w218 = w218;

        setW219(w218.equals("2") ? this.w219 : "");

        notifyPropertyChanged(BR.w218);
    }

    @Bindable
    public String getW219() {
        return w219;
    }

    public void setW219(String w219) {
        this.w219 = w219;
        notifyPropertyChanged(BR.w219);
    }

    @Bindable
    public String getW220() {
        return w220;
    }

    public void setW220(String w220) {
        this.w220 = w220;
        notifyPropertyChanged(BR.w220);
    }

    @Bindable
    public String getW221() {
        return w221;
    }

    public void setW221(String w221) {
        this.w221 = w221;
        setW221mx(w221.equals("1") ? this.w221mx : ""); // for all skips, mention all skipped questions
        setW221dx(w221.equals("2") ? this.w221dx : ""); // for all skips, mention all skipped questions
        setW222(w221.equals("98") ? "" : this.w222);
        setW223a(w221.equals("98") ? "" : this.w223a);
        setW223b(w221.equals("98") ? "" : this.w223b);
        setW223c(w221.equals("98") ? "" : this.w223c);
        setW223d(w221.equals("98") ? "" : this.w223d);
        setW223e(w221.equals("98") ? "" : this.w223e);
        setW223f(w221.equals("98") ? "" : this.w223f);
        setW223g(w221.equals("98") ? "" : this.w223g);
        setW223h(w221.equals("98") ? "" : this.w223h);
        notifyPropertyChanged(BR.w221);
    }

    @Bindable
    public String getW221mx() {
        return w221mx;
    }

    public void setW221mx(String w221mx) {
        this.w221mx = w221mx;
        notifyPropertyChanged(BR.w221mx);
    }

    @Bindable
    public String getW221dx() {
        return w221dx;
    }

    public void setW221dx(String w221dx) {
        this.w221dx = w221dx;
        notifyPropertyChanged(BR.w221dx);
    }

    @Bindable
    public String getW222() {
        return w222;
    }

    public void setW222(String w222) {
        this.w222 = w222;
        setW22296x(w222.equals("96") ? this.w22296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w222);
    }

    @Bindable
    public String getW22296x() {
        return w22296x;
    }

    public void setW22296x(String w22296x) {
        this.w22296x = w22296x;
        notifyPropertyChanged(BR.w22296x);
    }

    @Bindable
    public String getW223() {
        return w223;
    }

    public void setW223(String w223) {
        this.w223 = w223;
        notifyPropertyChanged(BR.w223);
    }

    @Bindable
    public String getW223a() {
        return w223a;
    }

    public void setW223a(String w223a) {
        if (this.w223a.equals(w223a)) return; // for all checkboxes
        this.w223a = w223a;
        notifyPropertyChanged(BR.w223a);
    }

    @Bindable
    public String getW223b() {
        return w223b;
    }

    public void setW223b(String w223b) {
        if (this.w223b.equals(w223b)) return; // for all checkboxes
        this.w223b = w223b;
        notifyPropertyChanged(BR.w223b);
    }

    @Bindable
    public String getW223c() {
        return w223c;
    }

    public void setW223c(String w223c) {
        if (this.w223c.equals(w223c)) return; // for all checkboxes
        this.w223c = w223c;
        notifyPropertyChanged(BR.w223c);
    }

    @Bindable
    public String getW223d() {
        return w223d;
    }

    public void setW223d(String w223d) {
        if (this.w223d.equals(w223d)) return; // for all checkboxes
        this.w223d = w223d;
        notifyPropertyChanged(BR.w223d);
    }

    @Bindable
    public String getW223e() {
        return w223e;
    }

    public void setW223e(String w223e) {
        if (this.w223e.equals(w223e)) return; // for all checkboxes
        this.w223e = w223e;
        notifyPropertyChanged(BR.w223e);
    }

    @Bindable
    public String getW223f() {
        return w223f;
    }

    public void setW223f(String w223f) {
        if (this.w223f.equals(w223f)) return; // for all checkboxes
        this.w223f = w223f;
        notifyPropertyChanged(BR.w223f);
    }

    @Bindable
    public String getW223g() {
        return w223g;
    }

    public void setW223g(String w223g) {
        if (this.w223g.equals(w223g)) return; // for all checkboxes
        this.w223g = w223g;
        notifyPropertyChanged(BR.w223g);
    }

    @Bindable
    public String getW223h() {
        return w223h;
    }

    public void setW223h(String w223h) {
        if (this.w223h.equals(w223h)) return; // for all checkboxes
        this.w223h = w223h;
        notifyPropertyChanged(BR.w223h);
    }

    @Bindable
    public String getW224() {
        return w224;
    }

    public void setW224(String w224) {
        this.w224 = w224;
        setW225(w224.equals("4") ? "" : this.w225);
        setW226(w224.equals("4") ? "" : this.w226);
        notifyPropertyChanged(BR.w224);
    }

    @Bindable
    public String getW225() {
        return w225;
    }

    public void setW225(String w225) {
        this.w225 = w225;
        setW226(w225.equals("1") ? this.w226 : "");
        notifyPropertyChanged(BR.w225);
    }

    @Bindable
    public String getW226() {
        return w226;
    }

    public void setW226(String w226) {
        this.w226 = w226;
        notifyPropertyChanged(BR.w226);
    }

    @Bindable
    public String getW301() {
        return w301;
    }

    public void setW301(String w301) {
        this.w301 = w301;
        setW30196x(w301.equals("96") ? this.w30196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w301);
    }

    @Bindable
    public String getW30196x() {
        return w30196x;
    }

    public void setW30196x(String w30196x) {
        this.w30196x = w30196x;
        notifyPropertyChanged(BR.w30196x);
    }

    @Bindable
    public String getW302() {
        return w302;
    }

    public void setW302(String w302) {
        this.w302 = w302;
        notifyPropertyChanged(BR.w302);
    }

    @Bindable
    public String getW302a() {
        return w302a;
    }

    public void setW302a(String w302a) {
        if (this.w302a.equals(w302a)) return; // for all checkboxes
        this.w302a = w302a;
        notifyPropertyChanged(BR.w302a);
    }

    @Bindable
    public String getW302b() {
        return w302b;
    }

    public void setW302b(String w302b) {
        if (this.w302b.equals(w302b)) return; // for all checkboxes
        this.w302b = w302b;
        notifyPropertyChanged(BR.w302b);
    }

    @Bindable
    public String getW302c() {
        return w302c;
    }

    public void setW302c(String w302c) {
        if (this.w302c.equals(w302c)) return; // for all checkboxes
        this.w302c = w302c;
        notifyPropertyChanged(BR.w302c);
    }

    @Bindable
    public String getW302d() {
        return w302d;
    }

    public void setW302d(String w302d) {
        if (this.w302d.equals(w302d)) return; // for all checkboxes
        this.w302d = w302d;
        notifyPropertyChanged(BR.w302d);
    }

    @Bindable
    public String getW302e() {
        return w302e;
    }

    public void setW302e(String w302e) {
        if (this.w302e.equals(w302e)) return; // for all checkboxes
        this.w302e = w302e;
        notifyPropertyChanged(BR.w302e);
    }

    @Bindable
    public String getW302f() {
        return w302f;
    }

    public void setW302f(String w302f) {
        if (this.w302f.equals(w302f)) return; // for all checkboxes
        this.w302f = w302f;
        notifyPropertyChanged(BR.w302f);
    }

    @Bindable
    public String getW302g() {
        return w302g;
    }

    public void setW302g(String w302g) {
        if (this.w302g.equals(w302g)) return; // for all checkboxes
        this.w302g = w302g;
        notifyPropertyChanged(BR.w302g);
    }

    @Bindable
    public String getW30296() {
        return w30296;
    }

    public void setW30296(String w30296) {
        if (this.w30296.equals(w30296)) return; // for all checkboxes
        this.w30296 = w30296;
        setW30296x(w30296.equals("96") ? this.w30296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w30296);
    }

    @Bindable
    public String getW30296x() {
        return w30296x;
    }

    public void setW30296x(String w30296x) {
        this.w30296x = w30296x;
        notifyPropertyChanged(BR.w30296x);
    }

    @Bindable
    public String getW30299() {
        return w30299;
    }

    public void setW30299(String w30299) {
        if (this.w30299.equals(w30299)) return; // for all checkboxes
        this.w30299 = w30299;
        setW302a(w30299.equals("99") ? "" : this.w302a);
        setW302b(w30299.equals("99") ? "" : this.w302b);
        setW302c(w30299.equals("99") ? "" : this.w302c);
        setW302d(w30299.equals("99") ? "" : this.w302d);
        setW302e(w30299.equals("99") ? "" : this.w302e);
        setW302f(w30299.equals("99") ? "" : this.w302f);
        setW302g(w30299.equals("99") ? "" : this.w302g);
        setW30296(w30299.equals("99") ? "" : this.w30296);
        notifyPropertyChanged(BR.w30299);
    }

    @Bindable
    public String getW303() {
        return w303;
    }

    public void setW303(String w303) {
        this.w303 = w303;
        setW303961x(w303.equals("961") ? this.w303961x : ""); // for all skips, mention all skipped questions
        setW303962x(w303.equals("962") ? this.w303962x : ""); // for all skips, mention all skipped questions
        setW303963x(w303.equals("963") ? this.w303963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w303);
    }

    @Bindable
    public String getW303961x() {
        return w303961x;
    }

    public void setW303961x(String w303961x) {
        this.w303961x = w303961x;
        notifyPropertyChanged(BR.w303961x);
    }

    @Bindable
    public String getW303962x() {
        return w303962x;
    }

    public void setW303962x(String w303962x) {
        this.w303962x = w303962x;
        notifyPropertyChanged(BR.w303962x);
    }

    @Bindable
    public String getW303963x() {
        return w303963x;
    }

    public void setW303963x(String w303963x) {
        this.w303963x = w303963x;
        notifyPropertyChanged(BR.w303963x);
    }

    @Bindable
    public String getW304() {
        return w304;
    }

    public void setW304(String w304) {
        this.w304 = w304;
        notifyPropertyChanged(BR.w304);
    }

    @Bindable
    public String getW305() {
        return w305;
    }

    public void setW305(String w305) {
        this.w305 = w305;
        notifyPropertyChanged(BR.w305);
    }

    @Bindable
    public String getW306() {
        return w306;
    }

    public void setW306(String w306) {
        this.w306 = w306;
        setW307(w306.equals("2") || w306.equals("98") ? this.w307 : "");
        notifyPropertyChanged(BR.w306);
    }

    @Bindable
    public String getW307() {
        return w307;
    }

    public void setW307(String w307) {
        this.w307 = w307;
        setW307ax(w307.equals("1") ? this.w307ax : ""); // for all skips, mention all skipped questions
        setW307bx(w307.equals("2") ? this.w307bx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w307);
    }

    @Bindable
    public String getW307ax() {
        return w307ax;
    }

    public void setW307ax(String w307ax) {
        this.w307ax = w307ax;
        notifyPropertyChanged(BR.w307ax);
    }

    @Bindable
    public String getW307bx() {
        return w307bx;
    }

    public void setW307bx(String w307bx) {
        this.w307bx = w307bx;
        notifyPropertyChanged(BR.w307bx);
    }

    @Bindable
    public String getW308() {
        return w308;
    }

    public void setW308(String w308) {
        this.w308 = w308;
        notifyPropertyChanged(BR.w308);
    }

    @Bindable
    public String getW309() {
        return w309;
    }

    public void setW309(String w309) {
        this.w309 = w309;
        notifyPropertyChanged(BR.w309);
    }

    @Bindable
    public String getW310() {
        return w310;
    }

    public void setW310(String w310) {
        this.w310 = w310;
        notifyPropertyChanged(BR.w310);
    }

    @Bindable
    public String getW311() {
        return w311;
    }

    public void setW311(String w311) {
        this.w311 = w311;
        setW311hx(w311.equals("2") ? this.w311hx : ""); // for all skips, mention all skipped questions
        setW311dx(w311.equals("3") ? this.w311dx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w311);
    }

    @Bindable
    public String getW311hx() {
        return w311hx;
    }

    public void setW311hx(String w311hx) {
        this.w311hx = w311hx;
        notifyPropertyChanged(BR.w311hx);
    }

    @Bindable
    public String getW311dx() {
        return w311dx;
    }

    public void setW311dx(String w311dx) {
        this.w311dx = w311dx;
        notifyPropertyChanged(BR.w311dx);
    }

    @Bindable
    public String getW312() {
        return w312;
    }

    public void setW312(String w312) {
        this.w312 = w312;
        notifyPropertyChanged(BR.w312);
    }

    @Bindable
    public String getW313() {
        return w313;
    }

    public void setW313(String w313) {
        this.w313 = w313;
        notifyPropertyChanged(BR.w313);
    }

    @Bindable
    public String getW31397() {
        return w31397;
    }

    public void setW31397(String w31397) {
        if (this.w31397.equals(w31397)) return; // for all checkboxes
        this.w31397 = w31397;
        setW313b(w31397.equals("97") ? "" : this.w313b);
        setW313c(w31397.equals("97") ? "" : this.w313c);
        setW313d(w31397.equals("97") ? "" : this.w313d);
        setW313e(w31397.equals("97") ? "" : this.w313e);
        setW31396(w31397.equals("97") ? "" : this.w31396);
        setW31398(w31397.equals("97") ? "" : this.w31398);
        notifyPropertyChanged(BR.w31397);
    }

    @Bindable
    public String getW313b() {
        return w313b;
    }

    public void setW313b(String w313b) {
        if (this.w313b.equals(w313b)) return; // for all checkboxes
        this.w313b = w313b;
        setW314(w313b.equals("2") ? this.w314 : "");
        notifyPropertyChanged(BR.w313b);
    }

    @Bindable
    public String getW313c() {
        return w313c;
    }

    public void setW313c(String w313c) {
        if (this.w313c.equals(w313c)) return; // for all checkboxes
        this.w313c = w313c;
        notifyPropertyChanged(BR.w313c);
    }

    @Bindable
    public String getW313d() {
        return w313d;
    }

    public void setW313d(String w313d) {
        if (this.w313d.equals(w313d)) return; // for all checkboxes
        this.w313d = w313d;
        notifyPropertyChanged(BR.w313d);
    }

    @Bindable
    public String getW313e() {
        return w313e;
    }

    public void setW313e(String w313e) {
        if (this.w313e.equals(w313e)) return; // for all checkboxes
        this.w313e = w313e;
        notifyPropertyChanged(BR.w313e);
    }

    @Bindable
    public String getW31396() {
        return w31396;
    }

    public void setW31396(String w31396) {
        if (this.w31396.equals(w31396)) return; // for all checkboxes
        this.w31396 = w31396;
        setW31396x(w31396.equals("96") ? this.w31396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w31396);
    }

    @Bindable
    public String getW31396x() {
        return w31396x;
    }

    public void setW31396x(String w31396x) {
        this.w31396x = w31396x;
        notifyPropertyChanged(BR.w31396x);
    }

    @Bindable
    public String getW31398() {
        return w31398;
    }

    public void setW31398(String w31398) {
        if (this.w31398.equals(w31398)) return; // for all checkboxes
        this.w31398 = w31398;
        setW313b(w31398.equals("98") ? "" : this.w313b);
        setW313c(w31398.equals("98") ? "" : this.w313c);
        setW313d(w31398.equals("98") ? "" : this.w313d);
        setW313e(w31398.equals("98") ? "" : this.w313e);
        setW31396(w31398.equals("98") ? "" : this.w31396);
        setW31397(w31398.equals("98") ? "" : this.w31397);
        notifyPropertyChanged(BR.w31398);
    }

    @Bindable
    public String getW314() {
        return w314;
    }

    public void setW314(String w314) {
        this.w314 = w314;
        setW314961x(w314.equals("961") ? this.w314961x : ""); // for all skips, mention all skipped questions
        setW314962x(w314.equals("962") ? this.w314962x : ""); // for all skips, mention all skipped questions
        setW314963x(w314.equals("963") ? this.w314963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w314);
    }

    @Bindable
    public String getW314961x() {
        return w314961x;
    }

    public void setW314961x(String w314961x) {
        this.w314961x = w314961x;
        notifyPropertyChanged(BR.w314961x);
    }

    @Bindable
    public String getW314962x() {
        return w314962x;
    }

    public void setW314962x(String w314962x) {
        this.w314962x = w314962x;
        notifyPropertyChanged(BR.w314962x);
    }

    @Bindable
    public String getW314963x() {
        return w314963x;
    }

    public void setW314963x(String w314963x) {
        this.w314963x = w314963x;
        notifyPropertyChanged(BR.w314963x);
    }

    @Bindable
    public String getW315() {
        return w315;
    }

    public void setW315(String w315) {
        this.w315 = w315;
        setW316a(w315.equals("1") ? this.w316a : "");
        setW316b(w315.equals("1") ? this.w316b : "");
        setW316c(w315.equals("1") ? this.w316c : "");
        setW316d(w315.equals("1") ? this.w316d : "");
        setW316e(w315.equals("1") ? this.w316e : "");
        setW316f(w315.equals("1") ? this.w316f : "");
        setW316g(w315.equals("1") ? this.w316g : "");
        setW316h(w315.equals("1") ? this.w316h : "");
        setW31696(w315.equals("1") ? this.w31696 : "");

        setW317(w315.equals("1") ? this.w317 : "");
        setW318(w315.equals("1") ? this.w318 : "");

        setW319a(w315.equals("1") ? this.w319a : "");
        setW319b(w315.equals("1") ? this.w319b : "");
        setW319c(w315.equals("1") ? this.w319c : "");
        setW319d(w315.equals("1") ? this.w319d : "");
        setW319e(w315.equals("1") ? this.w319e : "");
        setW319f(w315.equals("1") ? this.w319f : "");
        setW319g(w315.equals("1") ? this.w319g : "");
        setW319h(w315.equals("1") ? this.w319h : "");
        setW31996(w315.equals("1") ? this.w31996 : "");
        notifyPropertyChanged(BR.w315);
    }

    @Bindable
    public String getW316() {
        return w316;
    }

    public void setW316(String w316) {
        this.w316 = w316;
        notifyPropertyChanged(BR.w316);
    }

    @Bindable
    public String getW316a() {
        return w316a;
    }

    public void setW316a(String w316a) {
        if (this.w316a.equals(w316a)) return; // for all checkboxes
        this.w316a = w316a;
        notifyPropertyChanged(BR.w316a);
    }

    @Bindable
    public String getW316b() {
        return w316b;
    }

    public void setW316b(String w316b) {
        if (this.w316b.equals(w316b)) return; // for all checkboxes
        this.w316b = w316b;
        notifyPropertyChanged(BR.w316b);
    }

    @Bindable
    public String getW316c() {
        return w316c;
    }

    public void setW316c(String w316c) {
        if (this.w316c.equals(w316c)) return; // for all checkboxes
        this.w316c = w316c;
        notifyPropertyChanged(BR.w316c);
    }

    @Bindable
    public String getW316d() {
        return w316d;
    }

    public void setW316d(String w316d) {
        if (this.w316d.equals(w316d)) return; // for all checkboxes
        this.w316d = w316d;
        notifyPropertyChanged(BR.w316d);
    }

    @Bindable
    public String getW316e() {
        return w316e;
    }

    public void setW316e(String w316e) {
        if (this.w316e.equals(w316e)) return; // for all checkboxes
        this.w316e = w316e;
        notifyPropertyChanged(BR.w316e);
    }

    @Bindable
    public String getW316f() {
        return w316f;
    }

    public void setW316f(String w316f) {
        if (this.w316f.equals(w316f)) return; // for all checkboxes
        this.w316f = w316f;
        notifyPropertyChanged(BR.w316f);
    }

    @Bindable
    public String getW316g() {
        return w316g;
    }

    public void setW316g(String w316g) {
        if (this.w316g.equals(w316g)) return; // for all checkboxes
        this.w316g = w316g;
        notifyPropertyChanged(BR.w316g);
    }

    @Bindable
    public String getW316h() {
        return w316h;
    }

    public void setW316h(String w316h) {
        if (this.w316h.equals(w316h)) return; // for all checkboxes
        this.w316h = w316h;
        notifyPropertyChanged(BR.w316h);
    }

    @Bindable
    public String getW31696() {
        return w31696;
    }

    public void setW31696(String w31696) {
        if (this.w31696.equals(w31696)) return; // for all checkboxes
        this.w31696 = w31696;
        setW31696x(w31696.equals("96") ? this.w31696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w31696);
    }

    @Bindable
    public String getW31696x() {
        return w31696x;
    }

    public void setW31696x(String w31696x) {
        this.w31696x = w31696x;
        notifyPropertyChanged(BR.w31696x);
    }

    @Bindable
    public String getW317() {
        return w317;
    }

    public void setW317(String w317) {
        this.w317 = w317;
        setW317hx(w317.equals("1") ? this.w317hx : ""); // for all skips, mention all skipped questions
        setW317dx(w317.equals("2") ? this.w317dx : ""); // for all skips, mention all skipped questions
        setW317wx(w317.equals("3") ? this.w317wx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w317);
    }

    @Bindable
    public String getW317hx() {
        return w317hx;
    }

    public void setW317hx(String w317hx) {
        this.w317hx = w317hx;
        notifyPropertyChanged(BR.w317hx);
    }

    @Bindable
    public String getW317dx() {
        return w317dx;
    }

    public void setW317dx(String w317dx) {
        this.w317dx = w317dx;
        notifyPropertyChanged(BR.w317dx);
    }

    @Bindable
    public String getW317wx() {
        return w317wx;
    }

    public void setW317wx(String w317wx) {
        this.w317wx = w317wx;
        notifyPropertyChanged(BR.w317wx);
    }

    @Bindable
    public String getW318() {
        return w318;
    }

    public void setW318(String w318) {
        this.w318 = w318;
        notifyPropertyChanged(BR.w318);
    }

    @Bindable
    public String getW319() {
        return w319;
    }

    public void setW319(String w319) {
        this.w319 = w319;
        notifyPropertyChanged(BR.w319);
    }

    @Bindable
    public String getW319a() {
        return w319a;
    }

    public void setW319a(String w319a) {
        if (this.w319a.equals(w319a)) return; // for all checkboxes
        this.w319a = w319a;
        notifyPropertyChanged(BR.w319a);
    }

    @Bindable
    public String getW319b() {
        return w319b;
    }

    public void setW319b(String w319b) {
        if (this.w319b.equals(w319b)) return; // for all checkboxes
        this.w319b = w319b;
        notifyPropertyChanged(BR.w319b);
    }

    @Bindable
    public String getW319c() {
        return w319c;
    }

    public void setW319c(String w319c) {
        if (this.w319c.equals(w319c)) return; // for all checkboxes
        this.w319c = w319c;
        notifyPropertyChanged(BR.w319c);
    }

    @Bindable
    public String getW319d() {
        return w319d;
    }

    public void setW319d(String w319d) {
        if (this.w319d.equals(w319d)) return; // for all checkboxes
        this.w319d = w319d;
        notifyPropertyChanged(BR.w319d);
    }

    @Bindable
    public String getW319e() {
        return w319e;
    }

    public void setW319e(String w319e) {
        if (this.w319e.equals(w319e)) return; // for all checkboxes
        this.w319e = w319e;
        notifyPropertyChanged(BR.w319e);
    }

    @Bindable
    public String getW319f() {
        return w319f;
    }

    public void setW319f(String w319f) {
        if (this.w319f.equals(w319f)) return; // for all checkboxes
        this.w319f = w319f;
        notifyPropertyChanged(BR.w319f);
    }

    @Bindable
    public String getW319g() {
        return w319g;
    }

    public void setW319g(String w319g) {
        if (this.w319g.equals(w319g)) return; // for all checkboxes
        this.w319g = w319g;
        notifyPropertyChanged(BR.w319g);
    }

    @Bindable
    public String getW319h() {
        return w319h;
    }

    public void setW319h(String w319h) {
        if (this.w319h.equals(w319h)) return; // for all checkboxes
        this.w319h = w319h;
        notifyPropertyChanged(BR.w319h);
    }

    @Bindable
    public String getW31996() {
        return w31996;
    }

    public void setW31996(String w31996) {
        if (this.w31996.equals(w31996)) return; // for all checkboxes
        this.w31996 = w31996;
        setW31996x(w31996.equals("96") ? this.w31996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w31996);
    }

    @Bindable
    public String getW31996x() {
        return w31996x;
    }

    public void setW31996x(String w31996x) {
        this.w31996x = w31996x;
        notifyPropertyChanged(BR.w31996x);
    }

    @Bindable
    public String getW320() {
        return w320;
    }

    public void setW320(String w320) {
        this.w320 = w320;
        setW321a(w320.equals("1") ? this.w321a : "");
        setW321b(w320.equals("1") ? this.w321b : "");
        setW321c(w320.equals("1") ? this.w321c : "");
        setW321d(w320.equals("1") ? this.w321d : "");
        setW321e(w320.equals("1") ? this.w321e : "");
        setW321f(w320.equals("1") ? this.w321f : "");
        setW321g(w320.equals("1") ? this.w321g : "");
        setW321h(w320.equals("1") ? this.w321h : "");
        setW32196(w320.equals("1") ? this.w32196 : "");
        setW322(w320.equals("1") ? this.w322 : "");
        setW323(w320.equals("1") ? this.w323 : "");
        setW324a(w320.equals("1") ? this.w324a : "");
        setW324b(w320.equals("1") ? this.w324b : "");
        setW324c(w320.equals("1") ? this.w324c : "");
        setW324d(w320.equals("1") ? this.w324d : "");
        setW32496(w320.equals("1") ? this.w32496 : "");
        setW325(w320.equals("1") ? this.w325 : "");
        setW326(w320.equals("1") ? this.w326 : "");
        setW327(w320.equals("1") ? this.w327 : "");
        notifyPropertyChanged(BR.w320);
    }

    @Bindable
    public String getW321() {
        return w321;
    }

    public void setW321(String w321) {
        this.w321 = w321;
        notifyPropertyChanged(BR.w321);
    }

    @Bindable
    public String getW321a() {
        return w321a;
    }

    public void setW321a(String w321a) {
        if (this.w321a.equals(w321a)) return; // for all checkboxes
        this.w321a = w321a;
        notifyPropertyChanged(BR.w321a);
    }

    @Bindable
    public String getW321b() {
        return w321b;
    }

    public void setW321b(String w321b) {
        if (this.w321b.equals(w321b)) return; // for all checkboxes
        this.w321b = w321b;
        notifyPropertyChanged(BR.w321b);
    }

    @Bindable
    public String getW321c() {
        return w321c;
    }

    public void setW321c(String w321c) {
        if (this.w321c.equals(w321c)) return; // for all checkboxes
        this.w321c = w321c;
        notifyPropertyChanged(BR.w321c);
    }

    @Bindable
    public String getW321d() {
        return w321d;
    }

    public void setW321d(String w321d) {
        if (this.w321d.equals(w321d)) return; // for all checkboxes
        this.w321d = w321d;
        notifyPropertyChanged(BR.w321d);
    }

    @Bindable
    public String getW321e() {
        return w321e;
    }

    public void setW321e(String w321e) {
        if (this.w321e.equals(w321e)) return; // for all checkboxes
        this.w321e = w321e;
        notifyPropertyChanged(BR.w321e);
    }

    @Bindable
    public String getW321f() {
        return w321f;
    }

    public void setW321f(String w321f) {
        if (this.w321f.equals(w321f)) return; // for all checkboxes
        this.w321f = w321f;
        notifyPropertyChanged(BR.w321f);
    }

    @Bindable
    public String getW321g() {
        return w321g;
    }

    public void setW321g(String w321g) {
        if (this.w321g.equals(w321g)) return; // for all checkboxes
        this.w321g = w321g;
        notifyPropertyChanged(BR.w321g);
    }

    @Bindable
    public String getW321h() {
        return w321h;
    }

    public void setW321h(String w321h) {
        if (this.w321h.equals(w321h)) return; // for all checkboxes
        this.w321h = w321h;
        notifyPropertyChanged(BR.w321h);
    }

    @Bindable
    public String getW32196() {
        return w32196;
    }

    public void setW32196(String w32196) {
        if (this.w32196.equals(w32196)) return; // for all checkboxes
        this.w32196 = w32196;
        setW32196x(w32196.equals("96") ? this.w32196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w32196);
    }

    @Bindable
    public String getW32196x() {
        return w32196x;
    }

    public void setW32196x(String w32196x) {
        this.w32196x = w32196x;
        notifyPropertyChanged(BR.w32196x);
    }

    @Bindable
    public String getW322() {
        return w322;
    }

    public void setW322(String w322) {
        this.w322 = w322;
        setW322hx(w322.equals("1") ? this.w322hx : ""); // for all skips, mention all skipped questions
        setW322hx(w322.equals("2") ? this.w322dx : ""); // for all skips, mention all skipped questions
        setW322hx(w322.equals("3") ? this.w322wx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w322);
    }

    @Bindable
    public String getW322hx() {
        return w322hx;
    }

    public void setW322hx(String w322hx) {
        this.w322hx = w322hx;
        notifyPropertyChanged(BR.w322hx);
    }

    @Bindable
    public String getW322dx() {
        return w322dx;
    }

    public void setW322dx(String w322dx) {
        this.w322dx = w322dx;
        notifyPropertyChanged(BR.w322dx);
    }

    @Bindable
    public String getW322wx() {
        return w322wx;
    }

    public void setW322wx(String w322wx) {
        this.w322wx = w322wx;
        notifyPropertyChanged(BR.w322wx);
    }

    @Bindable
    public String getW323() {
        return w323;
    }

    public void setW323(String w323) {
        this.w323 = w323;
        notifyPropertyChanged(BR.w323);
    }

    @Bindable
    public String getW324() {
        return w324;
    }

    public void setW324(String w324) {
        this.w324 = w324;
        notifyPropertyChanged(BR.w324);
    }

    @Bindable
    public String getW324a() {
        return w324a;
    }

    public void setW324a(String w324a) {
        if (this.w324a.equals(w324a)) return; // for all checkboxes
        this.w324a = w324a;
        notifyPropertyChanged(BR.w324a);
    }

    @Bindable
    public String getW324b() {
        return w324b;
    }

    public void setW324b(String w324b) {
        if (this.w324b.equals(w324b)) return; // for all checkboxes
        this.w324b = w324b;
        notifyPropertyChanged(BR.w324b);
    }

    @Bindable
    public String getW324c() {
        return w324c;
    }

    public void setW324c(String w324c) {
        if (this.w324c.equals(w324c)) return; // for all checkboxes
        this.w324c = w324c;
        notifyPropertyChanged(BR.w324c);
    }

    @Bindable
    public String getW324d() {
        return w324d;
    }

    public void setW324d(String w324d) {
        if (this.w324d.equals(w324d)) return; // for all checkboxes
        this.w324d = w324d;
        notifyPropertyChanged(BR.w324d);
    }

    @Bindable
    public String getW32496() {
        return w32496;
    }

    public void setW32496(String w32496) {
        if (this.w32496.equals(w32496)) return; // for all checkboxes
        this.w32496 = w32496;
        setW32496x(w32496.equals("96") ? this.w32496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w32496);
    }

    @Bindable
    public String getW32496x() {
        return w32496x;
    }

    public void setW32496x(String w32496x) {
        this.w32496x = w32496x;
        notifyPropertyChanged(BR.w32496x);
    }

    @Bindable
    public String getW325() {
        return w325;
    }

    public void setW325(String w325) {
        this.w325 = w325;
        notifyPropertyChanged(BR.w325);
    }

    @Bindable
    public String getW326() {
        return w326;
    }

    public void setW326(String w326) {
        this.w326 = w326;
        notifyPropertyChanged(BR.w326);
    }

    @Bindable
    public String getW327() {
        return w327;
    }

    public void setW327(String w327) {
        this.w327 = w327;
        setW32796x(w327.equals("96") ? this.w32796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.w327);
    }

    @Bindable
    public String getW32796x() {
        return w32796x;
    }

    public void setW32796x(String w32796x) {
        this.w32796x = w32796x;
        notifyPropertyChanged(BR.w32796x);
    }

    @Bindable
    public String getW401() {
        return w401;
    }

    public void setW401(String w401) {
        this.w401 = w401;
        notifyPropertyChanged(BR.w401);
    }

    @Bindable
    public String getW401a() {
        return w401a;
    }

    public void setW401a(String w401a) {
        if (this.w401a.equals(w401a)) return; // for all checkboxes
        this.w401a = w401a;
        notifyPropertyChanged(BR.w401a);
    }

    @Bindable
    public String getW401b() {
        return w401b;
    }

    public void setW401b(String w401b) {
        if (this.w401b.equals(w401b)) return; // for all checkboxes
        this.w401b = w401b;
        notifyPropertyChanged(BR.w401b);
    }

    @Bindable
    public String getW401c() {
        return w401c;
    }

    public void setW401c(String w401c) {
        if (this.w401c.equals(w401c)) return; // for all checkboxes
        this.w401c = w401c;
        notifyPropertyChanged(BR.w401c);
    }

    @Bindable
    public String getW401d() {
        return w401d;
    }

    public void setW401d(String w401d) {
        if (this.w401d.equals(w401d)) return; // for all checkboxes
        this.w401d = w401d;
        notifyPropertyChanged(BR.w401d);
    }

    @Bindable
    public String getW401e() {
        return w401e;
    }

    public void setW401e(String w401e) {
        if (this.w401e.equals(w401e)) return; // for all checkboxes
        this.w401e = w401e;
        notifyPropertyChanged(BR.w401e);
    }

    @Bindable
    public String getW401f() {
        return w401f;
    }

    public void setW401f(String w401f) {
        if (this.w401f.equals(w401f)) return; // for all checkboxes
        this.w401f = w401f;
        notifyPropertyChanged(BR.w401f);
    }

    @Bindable
    public String getW401g() {
        return w401g;
    }

    public void setW401g(String w401g) {
        if (this.w401g.equals(w401g)) return; // for all checkboxes
        this.w401g = w401g;
        notifyPropertyChanged(BR.w401g);
    }

    @Bindable
    public String getW40198() {
        return w40198;
    }

    public void setW40198(String w40198) {
        if (this.w40198.equals(w40198)) return; // for all checkboxes
        this.w40198 = w40198;
        setW401a(w40198.equals("98") ? "" : this.w401a);
        setW401b(w40198.equals("98") ? "" : this.w401b);
        setW401c(w40198.equals("98") ? "" : this.w401c);
        setW401d(w40198.equals("98") ? "" : this.w401d);
        setW401e(w40198.equals("98") ? "" : this.w401e);
        setW401f(w40198.equals("98") ? "" : this.w401f);
        setW401g(w40198.equals("98") ? "" : this.w401g);
        notifyPropertyChanged(BR.w40198);
    }

    @Bindable
    public String getW402() {
        return w402;
    }

    public void setW402(String w402) {
        this.w402 = w402;
        notifyPropertyChanged(BR.w402);
    }

    @Bindable
    public String getW402a() {
        return w402a;
    }

    public void setW402a(String w402a) {
        if (this.w402a.equals(w402a)) return; // for all checkboxes
        this.w402a = w402a;
        notifyPropertyChanged(BR.w402a);
    }

    @Bindable
    public String getW402b() {
        return w402b;
    }

    public void setW402b(String w402b) {
        if (this.w402b.equals(w402b)) return; // for all checkboxes
        this.w402b = w402b;
        notifyPropertyChanged(BR.w402b);
    }

    @Bindable
    public String getW402c() {
        return w402c;
    }

    public void setW402c(String w402c) {
        if (this.w402c.equals(w402c)) return; // for all checkboxes
        this.w402c = w402c;
        notifyPropertyChanged(BR.w402c);
    }

    @Bindable
    public String getW402d() {
        return w402d;
    }

    public void setW402d(String w402d) {
        if (this.w402d.equals(w402d)) return; // for all checkboxes
        this.w402d = w402d;
        notifyPropertyChanged(BR.w402d);
    }

    @Bindable
    public String getW402e() {
        return w402e;
    }

    public void setW402e(String w402e) {
        if (this.w402e.equals(w402e)) return; // for all checkboxes
        this.w402e = w402e;
        notifyPropertyChanged(BR.w402e);
    }

    @Bindable
    public String getW402f() {
        return w402f;
    }

    public void setW402f(String w402f) {
        if (this.w402f.equals(w402f)) return; // for all checkboxes
        this.w402f = w402f;
        notifyPropertyChanged(BR.w402f);
    }

    @Bindable
    public String getW402g() {
        return w402g;
    }

    public void setW402g(String w402g) {
        if (this.w402g.equals(w402g)) return; // for all checkboxes
        this.w402g = w402g;
        notifyPropertyChanged(BR.w402g);
    }

    @Bindable
    public String getW40298() {
        return w40298;
    }

    public void setW40298(String w40298) {
        if (this.w40298.equals(w40298)) return; // for all checkboxes
        this.w40298 = w40298;
        setW402a(w40298.equals("98") ? "" : this.w402a);
        setW402b(w40298.equals("98") ? "" : this.w402b);
        setW402c(w40298.equals("98") ? "" : this.w402c);
        setW402d(w40298.equals("98") ? "" : this.w402d);
        setW402e(w40298.equals("98") ? "" : this.w402e);
        setW402f(w40298.equals("98") ? "" : this.w402f);
        setW402g(w40298.equals("98") ? "" : this.w402g);
        notifyPropertyChanged(BR.w40298);
    }

    @Bindable
    public String getW403() {
        return w403;
    }

    public void setW403(String w403) {
        this.w403 = w403;
        notifyPropertyChanged(BR.w403);
    }

    @Bindable
    public String getW403a() {
        return w403a;
    }

    public void setW403a(String w403a) {
        if (this.w403a.equals(w403a)) return; // for all checkboxes
        this.w403a = w403a;
        notifyPropertyChanged(BR.w403a);
    }

    @Bindable
    public String getW403b() {
        return w403b;
    }

    public void setW403b(String w403b) {
        if (this.w403b.equals(w403b)) return; // for all checkboxes
        this.w403b = w403b;
        notifyPropertyChanged(BR.w403b);
    }

    @Bindable
    public String getW403c() {
        return w403c;
    }

    public void setW403c(String w403c) {
        if (this.w403c.equals(w403c)) return; // for all checkboxes
        this.w403c = w403c;
        notifyPropertyChanged(BR.w403c);
    }

    @Bindable
    public String getW403d() {
        return w403d;
    }

    public void setW403d(String w403d) {
        if (this.w403d.equals(w403d)) return; // for all checkboxes
        this.w403d = w403d;
        notifyPropertyChanged(BR.w403d);
    }

    @Bindable
    public String getW403e() {
        return w403e;
    }

    public void setW403e(String w403e) {
        if (this.w403e.equals(w403e)) return; // for all checkboxes
        this.w403e = w403e;
        notifyPropertyChanged(BR.w403e);
    }

    @Bindable
    public String getW403f() {
        return w403f;
    }

    public void setW403f(String w403f) {
        if (this.w403f.equals(w403f)) return; // for all checkboxes
        this.w403f = w403f;
        notifyPropertyChanged(BR.w403f);
    }

    @Bindable
    public String getW403g() {
        return w403g;
    }

    public void setW403g(String w403g) {
        if (this.w403g.equals(w403g)) return; // for all checkboxes
        this.w403g = w403g;
        notifyPropertyChanged(BR.w403g);
    }

    @Bindable
    public String getW40398() {
        return w40398;
    }

    public void setW40398(String w40398) {
        if (this.w40398.equals(w40398)) return; // for all checkboxes
        this.w40398 = w40398;
        setW403a(w40398.equals("98") ? "" : this.w403a);
        setW403b(w40398.equals("98") ? "" : this.w403b);
        setW403c(w40398.equals("98") ? "" : this.w403c);
        setW403d(w40398.equals("98") ? "" : this.w403d);
        setW403e(w40398.equals("98") ? "" : this.w403e);
        setW403f(w40398.equals("98") ? "" : this.w403f);
        setW403g(w40398.equals("98") ? "" : this.w403g);
        notifyPropertyChanged(BR.w40398);
    }

    @Bindable
    public String getW404() {
        return w404;
    }

    public void setW404(String w404) {
        this.w404 = w404;
        notifyPropertyChanged(BR.w404);
    }

    @Bindable
    public String getW404a() {
        return w404a;
    }

    public void setW404a(String w404a) {
        if (this.w404a.equals(w404a)) return; // for all checkboxes
        this.w404a = w404a;
        notifyPropertyChanged(BR.w404a);
    }

    @Bindable
    public String getW404b() {
        return w404b;
    }

    public void setW404b(String w404b) {
        if (this.w404b.equals(w404b)) return; // for all checkboxes
        this.w404b = w404b;
        notifyPropertyChanged(BR.w404b);
    }

    @Bindable
    public String getW404c() {
        return w404c;
    }

    public void setW404c(String w404c) {
        if (this.w404c.equals(w404c)) return; // for all checkboxes
        this.w404c = w404c;
        notifyPropertyChanged(BR.w404c);
    }

    @Bindable
    public String getW404d() {
        return w404d;
    }

    public void setW404d(String w404d) {
        if (this.w404d.equals(w404d)) return; // for all checkboxes
        this.w404d = w404d;
        notifyPropertyChanged(BR.w404d);
    }

    @Bindable
    public String getW404e() {
        return w404e;
    }

    public void setW404e(String w404e) {
        if (this.w404e.equals(w404e)) return; // for all checkboxes
        this.w404e = w404e;
        notifyPropertyChanged(BR.w404e);
    }

    @Bindable
    public String getW404f() {
        return w404f;
    }

    public void setW404f(String w404f) {
        if (this.w404f.equals(w404f)) return; // for all checkboxes
        this.w404f = w404f;
        notifyPropertyChanged(BR.w404f);
    }

    @Bindable
    public String getW404g() {
        return w404g;
    }

    public void setW404g(String w404g) {
        if (this.w404g.equals(w404g)) return; // for all checkboxes
        this.w404g = w404g;
        notifyPropertyChanged(BR.w404g);
    }

    @Bindable
    public String getW40498() {
        return w40498;
    }

    public void setW40498(String w40498) {
        if (this.w40498.equals(w40498)) return; // for all checkboxes
        this.w40498 = w40498;
        setW404a(w40498.equals("98") ? "" : this.w404a);
        setW404b(w40498.equals("98") ? "" : this.w404b);
        setW404c(w40498.equals("98") ? "" : this.w404c);
        setW404d(w40498.equals("98") ? "" : this.w404d);
        setW404e(w40498.equals("98") ? "" : this.w404e);
        setW404f(w40498.equals("98") ? "" : this.w404f);
        setW404g(w40498.equals("98") ? "" : this.w404g);
        notifyPropertyChanged(BR.w40498);
    }

    @Bindable
    public String getW405() {
        return w405;
    }

    public void setW405(String w405) {
        this.w405 = w405;
        notifyPropertyChanged(BR.w405);
    }

    @Bindable
    public String getW405a() {
        return w405a;
    }

    public void setW405a(String w405a) {
        if (this.w405a.equals(w405a)) return; // for all checkboxes
        this.w405a = w405a;
        notifyPropertyChanged(BR.w405a);
    }

    @Bindable
    public String getW405b() {
        return w405b;
    }

    public void setW405b(String w405b) {
        if (this.w405b.equals(w405b)) return; // for all checkboxes
        this.w405b = w405b;
        notifyPropertyChanged(BR.w405b);
    }

    @Bindable
    public String getW405c() {
        return w405c;
    }

    public void setW405c(String w405c) {
        if (this.w405c.equals(w405c)) return; // for all checkboxes
        this.w405c = w405c;
        notifyPropertyChanged(BR.w405c);
    }

    @Bindable
    public String getW405d() {
        return w405d;
    }

    public void setW405d(String w405d) {
        if (this.w405d.equals(w405d)) return; // for all checkboxes
        this.w405d = w405d;
        notifyPropertyChanged(BR.w405d);
    }

    @Bindable
    public String getW405e() {
        return w405e;
    }

    public void setW405e(String w405e) {
        if (this.w405e.equals(w405e)) return; // for all checkboxes
        this.w405e = w405e;
        notifyPropertyChanged(BR.w405e);
    }

    @Bindable
    public String getW405f() {
        return w405f;
    }

    public void setW405f(String w405f) {
        if (this.w405f.equals(w405f)) return; // for all checkboxes
        this.w405f = w405f;
        notifyPropertyChanged(BR.w405f);
    }

    @Bindable
    public String getW405g() {
        return w405g;
    }

    public void setW405g(String w405g) {
        if (this.w405g.equals(w405g)) return; // for all checkboxes
        this.w405g = w405g;
        notifyPropertyChanged(BR.w405g);
    }

    @Bindable
    public String getW40598() {
        return w40598;
    }

    public void setW40598(String w40598) {
        if (this.w40598.equals(w40598)) return; // for all checkboxes
        this.w40598 = w40598;
        setW405a(w40598.equals("98") ? "" : this.w405a);
        setW405b(w40598.equals("98") ? "" : this.w405b);
        setW405c(w40598.equals("98") ? "" : this.w405c);
        setW405d(w40598.equals("98") ? "" : this.w405d);
        setW405e(w40598.equals("98") ? "" : this.w405e);
        setW405f(w40598.equals("98") ? "" : this.w405f);
        setW405g(w40598.equals("98") ? "" : this.w405g);
        notifyPropertyChanged(BR.w40598);
    }

    @Bindable
    public String getW406() {
        return w406;
    }

    public void setW406(String w406) {
        this.w406 = w406;
        notifyPropertyChanged(BR.w406);
    }

    @Bindable
    public String getW406a() {
        return w406a;
    }

    public void setW406a(String w406a) {
        if (this.w406a.equals(w406a)) return; // for all checkboxes
        this.w406a = w406a;
        notifyPropertyChanged(BR.w406a);
    }

    @Bindable
    public String getW406b() {
        return w406b;
    }

    public void setW406b(String w406b) {
        if (this.w406b.equals(w406b)) return; // for all checkboxes
        this.w406b = w406b;
        notifyPropertyChanged(BR.w406b);
    }

    @Bindable
    public String getW406c() {
        return w406c;
    }

    public void setW406c(String w406c) {
        if (this.w406c.equals(w406c)) return; // for all checkboxes
        this.w406c = w406c;
        notifyPropertyChanged(BR.w406c);
    }

    @Bindable
    public String getW406d() {
        return w406d;
    }

    public void setW406d(String w406d) {
        if (this.w406d.equals(w406d)) return; // for all checkboxes
        this.w406d = w406d;
        notifyPropertyChanged(BR.w406d);
    }

    @Bindable
    public String getW406e() {
        return w406e;
    }

    public void setW406e(String w406e) {
        if (this.w406e.equals(w406e)) return; // for all checkboxes
        this.w406e = w406e;
        notifyPropertyChanged(BR.w406e);
    }

    @Bindable
    public String getW406f() {
        return w406f;
    }

    public void setW406f(String w406f) {
        if (this.w406f.equals(w406f)) return; // for all checkboxes
        this.w406f = w406f;
        notifyPropertyChanged(BR.w406f);
    }

    @Bindable
    public String getW406g() {
        return w406g;
    }

    public void setW406g(String w406g) {
        if (this.w406g.equals(w406g)) return; // for all checkboxes
        this.w406g = w406g;
        notifyPropertyChanged(BR.w406g);
    }

    @Bindable
    public String getW40698() {
        return w40698;
    }

    public void setW40698(String w40698) {
        if (this.w40698.equals(w40698)) return; // for all checkboxes
        this.w40698 = w40698;
        setW406a(w40698.equals("98") ? "" : this.w406a);
        setW406b(w40698.equals("98") ? "" : this.w406b);
        setW406c(w40698.equals("98") ? "" : this.w406c);
        setW406d(w40698.equals("98") ? "" : this.w406d);
        setW406e(w40698.equals("98") ? "" : this.w406e);
        setW406f(w40698.equals("98") ? "" : this.w406f);
        setW406g(w40698.equals("98") ? "" : this.w406g);
        notifyPropertyChanged(BR.w40698);
    }

    @Bindable
    public String getW407() {
        return w407;
    }

    public void setW407(String w407) {
        this.w407 = w407;
        notifyPropertyChanged(BR.w407);
    }

    @Bindable
    public String getW407a() {
        return w407a;
    }

    public void setW407a(String w407a) {
        if (this.w407a.equals(w407a)) return; // for all checkboxes
        this.w407a = w407a;
        notifyPropertyChanged(BR.w407a);
    }

    @Bindable
    public String getW407b() {
        return w407b;
    }

    public void setW407b(String w407b) {
        if (this.w407b.equals(w407b)) return; // for all checkboxes
        this.w407b = w407b;
        notifyPropertyChanged(BR.w407b);
    }

    @Bindable
    public String getW407c() {
        return w407c;
    }

    public void setW407c(String w407c) {
        if (this.w407c.equals(w407c)) return; // for all checkboxes
        this.w407c = w407c;
        notifyPropertyChanged(BR.w407c);
    }

    @Bindable
    public String getW407d() {
        return w407d;
    }

    public void setW407d(String w407d) {
        if (this.w407d.equals(w407d)) return; // for all checkboxes
        this.w407d = w407d;
        notifyPropertyChanged(BR.w407d);
    }

    @Bindable
    public String getW407e() {
        return w407e;
    }

    public void setW407e(String w407e) {
        if (this.w407e.equals(w407e)) return; // for all checkboxes
        this.w407e = w407e;
        notifyPropertyChanged(BR.w407e);
    }

    @Bindable
    public String getW407f() {
        return w407f;
    }

    public void setW407f(String w407f) {
        if (this.w407f.equals(w407f)) return; // for all checkboxes
        this.w407f = w407f;
        notifyPropertyChanged(BR.w407f);
    }

    @Bindable
    public String getW407g() {
        return w407g;
    }

    public void setW407g(String w407g) {
        if (this.w407g.equals(w407g)) return; // for all checkboxes
        this.w407g = w407g;
        notifyPropertyChanged(BR.w407g);
    }

    @Bindable
    public String getW40798() {
        return w40798;
    }

    public void setW40798(String w40798) {
        if (this.w40798.equals(w40798)) return; // for all checkboxes
        this.w40798 = w40798;
        setW407a(w40798.equals("98") ? "" : this.w407a);
        setW407b(w40798.equals("98") ? "" : this.w407b);
        setW407c(w40798.equals("98") ? "" : this.w407c);
        setW407d(w40798.equals("98") ? "" : this.w407d);
        setW407e(w40798.equals("98") ? "" : this.w407e);
        setW407f(w40798.equals("98") ? "" : this.w407f);
        setW407g(w40798.equals("98") ? "" : this.w407g);
        notifyPropertyChanged(BR.w40798);
    }

    @Bindable
    public String getW408() {
        return w408;
    }

    public void setW408(String w408) {
        this.w408 = w408;
        notifyPropertyChanged(BR.w408);
    }

    @Bindable
    public String getW408a() {
        return w408a;
    }

    public void setW408a(String w408a) {
        if (this.w408a.equals(w408a)) return; // for all checkboxes
        this.w408a = w408a;
        notifyPropertyChanged(BR.w408a);
    }

    @Bindable
    public String getW408b() {
        return w408b;
    }

    public void setW408b(String w408b) {
        if (this.w408b.equals(w408b)) return; // for all checkboxes
        this.w408b = w408b;
        notifyPropertyChanged(BR.w408b);
    }

    @Bindable
    public String getW408c() {
        return w408c;
    }

    public void setW408c(String w408c) {
        if (this.w408c.equals(w408c)) return; // for all checkboxes
        this.w408c = w408c;
        notifyPropertyChanged(BR.w408c);
    }

    @Bindable
    public String getW408d() {
        return w408d;
    }

    public void setW408d(String w408d) {
        if (this.w408d.equals(w408d)) return; // for all checkboxes
        this.w408d = w408d;
        notifyPropertyChanged(BR.w408d);
    }

    @Bindable
    public String getW408e() {
        return w408e;
    }

    public void setW408e(String w408e) {
        if (this.w408e.equals(w408e)) return; // for all checkboxes
        this.w408e = w408e;
        notifyPropertyChanged(BR.w408e);
    }

    @Bindable
    public String getW408f() {
        return w408f;
    }

    public void setW408f(String w408f) {
        if (this.w408f.equals(w408f)) return; // for all checkboxes
        this.w408f = w408f;
        notifyPropertyChanged(BR.w408f);
    }

    @Bindable
    public String getW408g() {
        return w408g;
    }

    public void setW408g(String w408g) {
        if (this.w408g.equals(w408g)) return; // for all checkboxes
        this.w408g = w408g;
        notifyPropertyChanged(BR.w408g);
    }

    @Bindable
    public String getW40898() {
        return w40898;
    }

    public void setW40898(String w40898) {
        if (this.w40898.equals(w40898)) return; // for all checkboxes
        this.w40898 = w40898;
        setW408a(w40898.equals("98") ? "" : this.w408a);
        setW408b(w40898.equals("98") ? "" : this.w408b);
        setW408c(w40898.equals("98") ? "" : this.w408c);
        setW408d(w40898.equals("98") ? "" : this.w408d);
        setW408e(w40898.equals("98") ? "" : this.w408e);
        setW408f(w40898.equals("98") ? "" : this.w408f);
        setW408g(w40898.equals("98") ? "" : this.w408g);
        notifyPropertyChanged(BR.w40898);
    }

    @Bindable
    public String getW409() {
        return w409;
    }

    public void setW409(String w409) {
        this.w409 = w409;
        notifyPropertyChanged(BR.w409);
    }

    @Bindable
    public String getW409a() {
        return w409a;
    }

    public void setW409a(String w409a) {
        if (this.w409a.equals(w409a)) return; // for all checkboxes
        this.w409a = w409a;
        notifyPropertyChanged(BR.w409a);
    }

    @Bindable
    public String getW409b() {
        return w409b;
    }

    public void setW409b(String w409b) {
        if (this.w409b.equals(w409b)) return; // for all checkboxes
        this.w409b = w409b;
        notifyPropertyChanged(BR.w409b);
    }

    @Bindable
    public String getW409c() {
        return w409c;
    }

    public void setW409c(String w409c) {
        if (this.w409c.equals(w409c)) return; // for all checkboxes
        this.w409c = w409c;
        notifyPropertyChanged(BR.w409c);
    }

    @Bindable
    public String getW409d() {
        return w409d;
    }

    public void setW409d(String w409d) {
        if (this.w409d.equals(w409d)) return; // for all checkboxes
        this.w409d = w409d;
        notifyPropertyChanged(BR.w409d);
    }

    @Bindable
    public String getW409e() {
        return w409e;
    }

    public void setW409e(String w409e) {
        if (this.w409e.equals(w409e)) return; // for all checkboxes
        this.w409e = w409e;
        notifyPropertyChanged(BR.w409e);
    }

    @Bindable
    public String getW409f() {
        return w409f;
    }

    public void setW409f(String w409f) {
        if (this.w409f.equals(w409f)) return; // for all checkboxes
        this.w409f = w409f;
        notifyPropertyChanged(BR.w409f);
    }

    @Bindable
    public String getW409g() {
        return w409g;
    }

    public void setW409g(String w409g) {
        if (this.w409g.equals(w409g)) return; // for all checkboxes
        this.w409g = w409g;
        notifyPropertyChanged(BR.w409g);
    }

    @Bindable
    public String getW40998() {
        return w40998;
    }

    public void setW40998(String w40998) {
        if (this.w40998.equals(w40998)) return; // for all checkboxes
        this.w40998 = w40998;
        setW409a(w40998.equals("98") ? "" : this.w409a);
        setW409b(w40998.equals("98") ? "" : this.w409b);
        setW409c(w40998.equals("98") ? "" : this.w409c);
        setW409d(w40998.equals("98") ? "" : this.w409d);
        setW409e(w40998.equals("98") ? "" : this.w409e);
        setW409f(w40998.equals("98") ? "" : this.w409f);
        setW409g(w40998.equals("98") ? "" : this.w409g);
        notifyPropertyChanged(BR.w40998);
    }

    @Bindable
    public String getW410() {
        return w410;
    }

    public void setW410(String w410) {
        this.w410 = w410;
        notifyPropertyChanged(BR.w410);
    }

    @Bindable
    public String getW410a() {
        return w410a;
    }

    public void setW410a(String w410a) {
        if (this.w410a.equals(w410a)) return; // for all checkboxes
        this.w410a = w410a;
        notifyPropertyChanged(BR.w410a);
    }

    @Bindable
    public String getW410b() {
        return w410b;
    }

    public void setW410b(String w410b) {
        if (this.w410b.equals(w410b)) return; // for all checkboxes
        this.w410b = w410b;
        notifyPropertyChanged(BR.w410b);
    }

    @Bindable
    public String getW410c() {
        return w410c;
    }

    public void setW410c(String w410c) {
        if (this.w410c.equals(w410c)) return; // for all checkboxes
        this.w410c = w410c;
        notifyPropertyChanged(BR.w410c);
    }

    @Bindable
    public String getW410d() {
        return w410d;
    }

    public void setW410d(String w410d) {
        if (this.w410d.equals(w410d)) return; // for all checkboxes
        this.w410d = w410d;
        notifyPropertyChanged(BR.w410d);
    }

    @Bindable
    public String getW410e() {
        return w410e;
    }

    public void setW410e(String w410e) {
        if (this.w410e.equals(w410e)) return; // for all checkboxes
        this.w410e = w410e;
        notifyPropertyChanged(BR.w410e);
    }

    @Bindable
    public String getW410f() {
        return w410f;
    }

    public void setW410f(String w410f) {
        if (this.w410f.equals(w410f)) return; // for all checkboxes
        this.w410f = w410f;
        notifyPropertyChanged(BR.w410f);
    }

    @Bindable
    public String getW410g() {
        return w410g;
    }

    public void setW410g(String w410g) {
        if (this.w410g.equals(w410g)) return; // for all checkboxes
        this.w410g = w410g;
        notifyPropertyChanged(BR.w410g);
    }

    @Bindable
    public String getW41098() {
        return w41098;
    }

    public void setW41098(String w41098) {
        if (this.w41098.equals(w41098)) return; // for all checkboxes
        this.w41098 = w41098;
        setW410a(w41098.equals("98") ? "" : this.w410a);
        setW410b(w41098.equals("98") ? "" : this.w410b);
        setW410c(w41098.equals("98") ? "" : this.w410c);
        setW410d(w41098.equals("98") ? "" : this.w410d);
        setW410e(w41098.equals("98") ? "" : this.w410e);
        setW410f(w41098.equals("98") ? "" : this.w410f);
        setW410g(w41098.equals("98") ? "" : this.w410g);
        notifyPropertyChanged(BR.w41098);
    }

    @Bindable
    public String getC101() {
        return c101;
    }

    public void setC101(String c101) {
        this.c101 = c101;
        setC102(c101.equals("1") ? this.c102 : "");
        notifyPropertyChanged(BR.c101);
    }

    @Bindable
    public String getW100Name() {
        return w100name;
    }

    public void setW100Name(String w100name) {
        this.w100name = w100name;
        notifyPropertyChanged(BR.w100Name);
    }

    @Bindable
    public String getC100Name() {
        return c100name;
    }

    public void setC100Name(String c100name) {
        this.c100name = c100name;
        notifyPropertyChanged(BR.c100Name);
    }

    @Bindable
    public String getC102() {
        return c102;
    }

    public void setC102(String c102) {
        this.c102 = c102;
        notifyPropertyChanged(BR.c102);
    }

    @Bindable
    public String getC103() {
        return c103;
    }

    public void setC103(String c103) {
        this.c103 = c103;
        notifyPropertyChanged(BR.c103);
    }

    @Bindable
    public String getC104() {
        return c104;
    }

    public void setC104(String c104) {
        this.c104 = c104;
        notifyPropertyChanged(BR.c104);
    }

    @Bindable
    public String getC105() {
        return c105;
    }

    public void setC105(String c105) {
        this.c105 = c105;
        notifyPropertyChanged(BR.c105);
    }

    @Bindable
    public String getC106a() {
        return c106a;
    }

    public void setC106a(String c106a) {
        this.c106a = c106a;
        notifyPropertyChanged(BR.c106a);
    }

    @Bindable
    public String getC106b() {
        return c106b;
    }

    public void setC106b(String c106b) {
        this.c106b = c106b;
        setC106ca(c106b.equals("1") ? this.c106ca : "");
        notifyPropertyChanged(BR.c106b);
    }

    @Bindable
    public String getC106ca() {
        return c106ca;
    }

    public void setC106ca(String c106ca) {
        this.c106ca = c106ca;
        notifyPropertyChanged(BR.c106ca);
    }

    @Bindable
    public String getC106d() {
        return c106d;
    }

    public void setC106d(String c106d) {
        this.c106d = c106d;
        setC106ea(c106d.equals("1") ? this.c106ea : "");
        setC106f(c106d.equals("1") ? this.c106f : "");
        notifyPropertyChanged(BR.c106d);
    }

    @Bindable
    public String getC106ea() {
        return c106ea;
    }

    public void setC106ea(String c106ea) {
        this.c106ea = c106ea;
        notifyPropertyChanged(BR.c106ea);
    }

    @Bindable
    public String getC106f() {
        return c106f;
    }

    public void setC106f(String c106f) {
        this.c106f = c106f;
        notifyPropertyChanged(BR.c106f);
    }

    @Bindable
    public String getC106g() {
        return c106g;
    }

    public void setC106g(String c106g) {
        this.c106g = c106g;
        setC106ha(c106g.equals("1") ? this.c106ha : "");
        setC106i(c106g.equals("1") ? this.c106i : "");
        notifyPropertyChanged(BR.c106g);
    }

    @Bindable
    public String getC106ha() {
        return c106ha;
    }

    public void setC106ha(String c106ha) {
        this.c106ha = c106ha;
        notifyPropertyChanged(BR.c106ha);
    }

    @Bindable
    public String getC106i() {
        return c106i;
    }

    public void setC106i(String c106i) {
        this.c106i = c106i;
        notifyPropertyChanged(BR.c106i);
    }

    @Bindable
    public String getC106j() {
        return c106j;
    }

    public void setC106j(String c106j) {
        this.c106j = c106j;
        notifyPropertyChanged(BR.c106j);
    }

    @Bindable
    public String getC106k() {
        return c106k;
    }

    public void setC106k(String c106k) {
        this.c106k = c106k;
        notifyPropertyChanged(BR.c106k);
    }

    @Bindable
    public String getC106l() {
        return c106l;
    }

    public void setC106l(String c106l) {
        this.c106l = c106l;
        notifyPropertyChanged(BR.c106l);
    }

    @Bindable
    public String getC106m() {
        return c106m;
    }

    public void setC106m(String c106m) {
        this.c106m = c106m;
        setC106n(c106m.equals("1") ? this.c106n : "");
        notifyPropertyChanged(BR.c106m);
    }

    @Bindable
    public String getC106n() {
        return c106n;
    }

    public void setC106n(String c106n) {
        this.c106n = c106n;
        notifyPropertyChanged(BR.c106n);
    }

    @Bindable
    public String getC106o() {
        return c106o;
    }

    public void setC106o(String c106o) {
        this.c106o = c106o;
        notifyPropertyChanged(BR.c106o);
    }

    @Bindable
    public String getC106p() {
        return c106p;
    }

    public void setC106p(String c106p) {
        this.c106p = c106p;
        setC106q(c106p.equals("1") ? this.c106q : "");
        notifyPropertyChanged(BR.c106p);
    }

    @Bindable
    public String getC106q() {
        return c106q;
    }

    public void setC106q(String c106q) {
        this.c106q = c106q;
        notifyPropertyChanged(BR.c106q);
    }

    @Bindable
    public String getC107a() {
        return c107a;
    }

    public void setC107a(String c107a) {
        this.c107a = c107a;
        setC107sflag();
        setC107b(c107a.equals("1") ? this.c107b : "");
        notifyPropertyChanged(BR.c107a);
    }

    @Bindable
    public String getC107b() {
        return c107b;
    }

    public void setC107b(String c107b) {
        this.c107b = c107b;
        notifyPropertyChanged(BR.c107b);
    }

    @Bindable
    public String getC107c() {
        return c107c;
    }

    public void setC107c(String c107c) {
        this.c107c = c107c;
        setC107sflag();
        notifyPropertyChanged(BR.c107c);
    }

    @Bindable
    public String getC107d() {
        return c107d;
    }

    public void setC107d(String c107d) {
        this.c107d = c107d;
        setC107sflag();
        notifyPropertyChanged(BR.c107d);
    }

    @Bindable
    public String getC107e() {
        return c107e;
    }

    public void setC107e(String c107e) {
        this.c107e = c107e;
        setC107sflag();
        notifyPropertyChanged(BR.c107e);
    }

    @Bindable
    public String getC107f() {
        return c107f;
    }

    public void setC107f(String c107f) {
        this.c107f = c107f;
        setC107sflag();
        notifyPropertyChanged(BR.c107f);
    }

    @Bindable
    public String getC107g() {
        return c107g;
    }

    public void setC107g(String c107g) {
        this.c107g = c107g;
        setC107sflag();
        notifyPropertyChanged(BR.c107g);
    }

    @Bindable
    public String getC107h() {
        return c107h;
    }

    public void setC107h(String c107h) {
        this.c107h = c107h;
        setC107sflag();
        notifyPropertyChanged(BR.c107h);
    }

    @Bindable
    public String getC107j() {
        return c107j;
    }

    public void setC107j(String c107j) {
        this.c107j = c107j;
        setC107sflag();
        notifyPropertyChanged(BR.c107j);
    }

    @Bindable
    public String getC107i() {
        return c107i;
    }

    public void setC107i(String c107i) {
        this.c107i = c107i;
        setC107sflag();
        notifyPropertyChanged(BR.c107i);
    }

    @Bindable
    public String getC107k() {
        return c107k;
    }

    public void setC107k(String c107k) {
        this.c107k = c107k;
        setC107sflag();
        notifyPropertyChanged(BR.c107k);
    }

    @Bindable
    public String getC107l() {
        return c107l;
    }

    public void setC107l(String c107l) {
        this.c107l = c107l;
        setC107sflag();
        notifyPropertyChanged(BR.c107l);
    }

    @Bindable
    public String getC107m() {
        return c107m;
    }

    public void setC107m(String c107m) {
        this.c107m = c107m;
        setC107sflag();
        notifyPropertyChanged(BR.c107m);
    }

    @Bindable
    public String getC107n() {
        return c107n;
    }

    public void setC107n(String c107n) {
        this.c107n = c107n;
        setC107sflag();
        notifyPropertyChanged(BR.c107n);
    }

    @Bindable
    public String getC107o() {
        return c107o;
    }

    public void setC107o(String c107o) {
        this.c107o = c107o;
        setC107sflag();
        notifyPropertyChanged(BR.c107o);
    }

    @Bindable
    public String getC107p() {
        return c107p;
    }

    public void setC107p(String c107p) {
        this.c107p = c107p;
        setC107sflag();
        notifyPropertyChanged(BR.c107p);
    }

    @Bindable
    public String getC107q() {
        return c107q;
    }

    public void setC107q(String c107q) {
        this.c107q = c107q;
        setC107sflag();
        notifyPropertyChanged(BR.c107q);
    }

    @Bindable
    public String getC107r() {
        return c107r;
    }

    public void setC107r(String c107r) {
        this.c107r = c107r;
        setC107sflag();
        notifyPropertyChanged(BR.c107r);
    }

    @Bindable
    public String getC107sflag() {
        return c107sflag;
    }

    public void setC107sflag() {
        this.c107sflag = "";
        if (this.c107a.equals("1")
                || this.c107c.equals("1")
                || this.c107d.equals("1")
                || this.c107e.equals("1")
                || this.c107f.equals("1")
                || this.c107g.equals("1")
                || this.c107h.equals("1")
                || this.c107i.equals("1")
                || this.c107j.equals("1")
                || this.c107k.equals("1")
                || this.c107l.equals("1")
                || this.c107m.equals("1")
                || this.c107n.equals("1")
                || this.c107o.equals("1")
                || this.c107p.equals("1")
                || this.c107q.equals("1")
                || this.c107r.equals("1")) {
            setC107s("");
            this.c107sflag = "";
        } else {
            setC107s(this.c107s);
            this.c107sflag = "1";
        }
        notifyPropertyChanged(BR.c107sflag);
    }

    @Bindable
    public String getC107s() {
        return c107s;
    }

    public void setC107s(String c107s) {
        this.c107s = c107s;
        notifyPropertyChanged(BR.c107s);
    }

    @Bindable
    public String getC108() {
        return c108;
    }

    public void setC108(String c108) {
        this.c108 = c108;
        setC108t1(c108.equals("1") ? this.c108t1 : "");
        setC109(c108.equals("1") ? this.c109 : "");
        notifyPropertyChanged(BR.c108);
    }

    @Bindable
    public String getC108t1() {
        return c108t1;
    }

    public void setC108t1(String c108t1) {
        this.c108t1 = c108t1;
        notifyPropertyChanged(BR.c108t1);
    }

    @Bindable
    public String getC109() {
        return c109;
    }

    public void setC109(String c109) {
        this.c109 = c109;
        notifyPropertyChanged(BR.c109);
    }

    @Bindable
    public String getC201() {
        return c201;
    }

    public void setC201(String c201) {
        this.c201 = c201;
        notifyPropertyChanged(BR.c201);
    }

    @Bindable
    public String getC202() {
        return c202;
    }

    public void setC202(String c202) {
        this.c202 = c202;
        notifyPropertyChanged(BR.c202);
    }

    @Bindable
    public String getC20301a() {
        return c20301a;
    }

    public void setC20301a(String c20301a) {
        this.c20301a = c20301a;
        setC20301ba(c20301a.equals("1") ? this.c20301ba : "");
        setC20301bb(c20301a.equals("1") ? this.c20301bb : "");
        setC20301bc(c20301a.equals("1") ? this.c20301bc : "");
        setC20301bd(c20301a.equals("1") ? this.c20301bd : "");
        setC20301be(c20301a.equals("1") ? this.c20301be : "");
        setC20301bf(c20301a.equals("1") ? this.c20301bf : "");
        setC20301bg(c20301a.equals("1") ? this.c20301bg : "");
        notifyPropertyChanged(BR.c20301a);
    }

    @Bindable
    public String getC20301b() {
        return c20301b;
    }

    public void setC20301b(String c20301b) {
        this.c20301b = c20301b;
        notifyPropertyChanged(BR.c20301b);
    }

    @Bindable
    public String getC20301ba() {
        return c20301ba;
    }

    public void setC20301ba(String c20301ba) {
        if (this.c20301ba.equals(c20301ba)) return; // for all checkboxes
        this.c20301ba = c20301ba;
        notifyPropertyChanged(BR.c20301ba);
    }

    @Bindable
    public String getC20301bb() {
        return c20301bb;
    }

    public void setC20301bb(String c20301bb) {
        if (this.c20301bb.equals(c20301bb)) return; // for all checkboxes
        this.c20301bb = c20301bb;
        notifyPropertyChanged(BR.c20301bb);
    }

    @Bindable
    public String getC20301bc() {
        return c20301bc;
    }

    public void setC20301bc(String c20301bc) {
        if (this.c20301bc.equals(c20301bc)) return; // for all checkboxes
        this.c20301bc = c20301bc;
        notifyPropertyChanged(BR.c20301bc);
    }

    @Bindable
    public String getC20301bd() {
        return c20301bd;
    }

    public void setC20301bd(String c20301bd) {
        if (this.c20301bd.equals(c20301bd)) return; // for all checkboxes
        this.c20301bd = c20301bd;
        notifyPropertyChanged(BR.c20301bd);
    }

    @Bindable
    public String getC20301be() {
        return c20301be;
    }

    public void setC20301be(String c20301be) {
        if (this.c20301be.equals(c20301be)) return; // for all checkboxes
        this.c20301be = c20301be;
        notifyPropertyChanged(BR.c20301be);
    }

    @Bindable
    public String getC20301bf() {
        return c20301bf;
    }

    public void setC20301bf(String c20301bf) {
        if (this.c20301bf.equals(c20301bf)) return; // for all checkboxes
        this.c20301bf = c20301bf;
        notifyPropertyChanged(BR.c20301bf);
    }

    @Bindable
    public String getC20301bg() {
        return c20301bg;
    }

    public void setC20301bg(String c20301bg) {
        if (this.c20301bg.equals(c20301bg)) return; // for all checkboxes
        this.c20301bg = c20301bg;
        notifyPropertyChanged(BR.c20301bg);
    }

    @Bindable
    public String getC20302a() {
        return c20302a;
    }

    public void setC20302a(String c20302a) {
        this.c20302a = c20302a;
        setC20302ba(c20302a.equals("1") ? this.c20302ba : "");
        setC20302bb(c20302a.equals("1") ? this.c20302bb : "");
        setC20302bc(c20302a.equals("1") ? this.c20302bc : "");
        setC20302bd(c20302a.equals("1") ? this.c20302bd : "");
        setC20302be(c20302a.equals("1") ? this.c20302be : "");
        setC20302bf(c20302a.equals("1") ? this.c20302bf : "");
        setC20302bg(c20302a.equals("1") ? this.c20302bg : "");
        notifyPropertyChanged(BR.c20302a);
    }

    @Bindable
    public String getC20302b() {
        return c20302b;
    }

    public void setC20302b(String c20302b) {
        this.c20302b = c20302b;
        notifyPropertyChanged(BR.c20302b);
    }

    @Bindable
    public String getC20302ba() {
        return c20302ba;
    }

    public void setC20302ba(String c20302ba) {
        if (this.c20302ba.equals(c20302ba)) return; // for all checkboxes
        this.c20302ba = c20302ba;
        notifyPropertyChanged(BR.c20302ba);
    }

    @Bindable
    public String getC20302bb() {
        return c20302bb;
    }

    public void setC20302bb(String c20302bb) {
        if (this.c20302bb.equals(c20302bb)) return; // for all checkboxes
        this.c20302bb = c20302bb;
        notifyPropertyChanged(BR.c20302bb);
    }

    @Bindable
    public String getC20302bc() {
        return c20302bc;
    }

    public void setC20302bc(String c20302bc) {
        if (this.c20302bc.equals(c20302bc)) return; // for all checkboxes
        this.c20302bc = c20302bc;
        notifyPropertyChanged(BR.c20302bc);
    }

    @Bindable
    public String getC20302bd() {
        return c20302bd;
    }

    public void setC20302bd(String c20302bd) {
        if (this.c20302bd.equals(c20302bd)) return; // for all checkboxes
        this.c20302bd = c20302bd;
        notifyPropertyChanged(BR.c20302bd);
    }

    @Bindable
    public String getC20302be() {
        return c20302be;
    }

    public void setC20302be(String c20302be) {
        if (this.c20302be.equals(c20302be)) return; // for all checkboxes
        this.c20302be = c20302be;
        notifyPropertyChanged(BR.c20302be);
    }

    @Bindable
    public String getC20302bf() {
        return c20302bf;
    }

    public void setC20302bf(String c20302bf) {
        if (this.c20302bf.equals(c20302bf)) return; // for all checkboxes
        this.c20302bf = c20302bf;
        notifyPropertyChanged(BR.c20302bf);
    }

    @Bindable
    public String getC20302bg() {
        return c20302bg;
    }

    public void setC20302bg(String c20302bg) {
        if (this.c20302bg.equals(c20302bg)) return; // for all checkboxes
        this.c20302bg = c20302bg;
        notifyPropertyChanged(BR.c20302bg);
    }

    @Bindable
    public String getC20303a() {
        return c20303a;
    }

    public void setC20303a(String c20303a) {
        this.c20303a = c20303a;
        setC20303ba(c20303a.equals("1") ? this.c20303ba : "");
        setC20303bb(c20303a.equals("1") ? this.c20303bb : "");
        setC20303bc(c20303a.equals("1") ? this.c20303bc : "");
        setC20303bd(c20303a.equals("1") ? this.c20303bd : "");
        setC20303be(c20303a.equals("1") ? this.c20303be : "");
        setC20303bf(c20303a.equals("1") ? this.c20303bf : "");
        setC20303bg(c20303a.equals("1") ? this.c20303bg : "");
        notifyPropertyChanged(BR.c20303a);
    }

    @Bindable
    public String getC20303b() {
        return c20303b;
    }

    public void setC20303b(String c20303b) {
        this.c20303b = c20303b;
        notifyPropertyChanged(BR.c20303b);
    }

    @Bindable
    public String getC20303ba() {
        return c20303ba;
    }

    public void setC20303ba(String c20303ba) {
        if (this.c20303ba.equals(c20303ba)) return; // for all checkboxes
        this.c20303ba = c20303ba;
        notifyPropertyChanged(BR.c20303ba);
    }

    @Bindable
    public String getC20303bb() {
        return c20303bb;
    }

    public void setC20303bb(String c20303bb) {
        if (this.c20303bb.equals(c20303bb)) return; // for all checkboxes
        this.c20303bb = c20303bb;
        notifyPropertyChanged(BR.c20303bb);
    }

    @Bindable
    public String getC20303bc() {
        return c20303bc;
    }

    public void setC20303bc(String c20303bc) {
        if (this.c20303bc.equals(c20303bc)) return; // for all checkboxes
        this.c20303bc = c20303bc;
        notifyPropertyChanged(BR.c20303bc);
    }

    @Bindable
    public String getC20303bd() {
        return c20303bd;
    }

    public void setC20303bd(String c20303bd) {
        if (this.c20303bd.equals(c20303bd)) return; // for all checkboxes
        this.c20303bd = c20303bd;
        notifyPropertyChanged(BR.c20303bd);
    }

    @Bindable
    public String getC20303be() {
        return c20303be;
    }

    public void setC20303be(String c20303be) {
        if (this.c20303be.equals(c20303be)) return; // for all checkboxes
        this.c20303be = c20303be;
        notifyPropertyChanged(BR.c20303be);
    }

    @Bindable
    public String getC20303bf() {
        return c20303bf;
    }

    public void setC20303bf(String c20303bf) {
        if (this.c20303bf.equals(c20303bf)) return; // for all checkboxes
        this.c20303bf = c20303bf;
        notifyPropertyChanged(BR.c20303bf);
    }

    @Bindable
    public String getC20303bg() {
        return c20303bg;
    }

    public void setC20303bg(String c20303bg) {
        if (this.c20303bg.equals(c20303bg)) return; // for all checkboxes
        this.c20303bg = c20303bg;
        notifyPropertyChanged(BR.c20303bg);
    }

    @Bindable
    public String getC20304a() {
        return c20304a;
    }

    public void setC20304a(String c20304a) {
        this.c20304a = c20304a;
        setC20304ba(c20304a.equals("1") ? this.c20304ba : "");
        setC20304bb(c20304a.equals("1") ? this.c20304bb : "");
        setC20304bc(c20304a.equals("1") ? this.c20304bc : "");
        setC20304bd(c20304a.equals("1") ? this.c20304bd : "");
        setC20304be(c20304a.equals("1") ? this.c20304be : "");
        setC20304bf(c20304a.equals("1") ? this.c20304bf : "");
        setC20304bg(c20304a.equals("1") ? this.c20304bg : "");
        notifyPropertyChanged(BR.c20304a);
    }

    @Bindable
    public String getC20304b() {
        return c20304b;
    }

    public void setC20304b(String c20304b) {
        this.c20304b = c20304b;
        notifyPropertyChanged(BR.c20304b);
    }

    @Bindable
    public String getC20304ba() {
        return c20304ba;
    }

    public void setC20304ba(String c20304ba) {
        if (this.c20304ba.equals(c20304ba)) return; // for all checkboxes
        this.c20304ba = c20304ba;
        notifyPropertyChanged(BR.c20304ba);
    }

    @Bindable
    public String getC20304bb() {
        return c20304bb;
    }

    public void setC20304bb(String c20304bb) {
        if (this.c20304bb.equals(c20304bb)) return; // for all checkboxes
        this.c20304bb = c20304bb;
        notifyPropertyChanged(BR.c20304bb);
    }

    @Bindable
    public String getC20304bc() {
        return c20304bc;
    }

    public void setC20304bc(String c20304bc) {
        if (this.c20304bc.equals(c20304bc)) return; // for all checkboxes
        this.c20304bc = c20304bc;
        notifyPropertyChanged(BR.c20304bc);
    }

    @Bindable
    public String getC20304bd() {
        return c20304bd;
    }

    public void setC20304bd(String c20304bd) {
        if (this.c20304bd.equals(c20304bd)) return; // for all checkboxes
        this.c20304bd = c20304bd;
        notifyPropertyChanged(BR.c20304bd);
    }

    @Bindable
    public String getC20304be() {
        return c20304be;
    }

    public void setC20304be(String c20304be) {
        if (this.c20304be.equals(c20304be)) return; // for all checkboxes
        this.c20304be = c20304be;
        notifyPropertyChanged(BR.c20304be);
    }

    @Bindable
    public String getC20304bf() {
        return c20304bf;
    }

    public void setC20304bf(String c20304bf) {
        if (this.c20304bf.equals(c20304bf)) return; // for all checkboxes
        this.c20304bf = c20304bf;
        notifyPropertyChanged(BR.c20304bf);
    }

    @Bindable
    public String getC20304bg() {
        return c20304bg;
    }

    public void setC20304bg(String c20304bg) {
        if (this.c20304bg.equals(c20304bg)) return; // for all checkboxes
        this.c20304bg = c20304bg;
        notifyPropertyChanged(BR.c20304bg);
    }

    @Bindable
    public String getC20305a() {
        return c20305a;
    }

    public void setC20305a(String c20305a) {
        this.c20305a = c20305a;
        setC20305ba(c20305a.equals("1") ? this.c20305ba : "");
        setC20305bb(c20305a.equals("1") ? this.c20305bb : "");
        setC20305bc(c20305a.equals("1") ? this.c20305bc : "");
        setC20305bd(c20305a.equals("1") ? this.c20305bd : "");
        setC20305be(c20305a.equals("1") ? this.c20305be : "");
        setC20305bf(c20305a.equals("1") ? this.c20305bf : "");
        setC20305bg(c20305a.equals("1") ? this.c20305bg : "");
        notifyPropertyChanged(BR.c20305a);
    }

    @Bindable
    public String getC20305b() {
        return c20305b;
    }

    public void setC20305b(String c20305b) {
        this.c20305b = c20305b;
        notifyPropertyChanged(BR.c20305b);
    }

    @Bindable
    public String getC20305ba() {
        return c20305ba;
    }

    public void setC20305ba(String c20305ba) {
        if (this.c20305ba.equals(c20305ba)) return; // for all checkboxes
        this.c20305ba = c20305ba;
        notifyPropertyChanged(BR.c20305ba);
    }

    @Bindable
    public String getC20305bb() {
        return c20305bb;
    }

    public void setC20305bb(String c20305bb) {
        if (this.c20305bb.equals(c20305bb)) return; // for all checkboxes
        this.c20305bb = c20305bb;
        notifyPropertyChanged(BR.c20305bb);
    }

    @Bindable
    public String getC20305bc() {
        return c20305bc;
    }

    public void setC20305bc(String c20305bc) {
        if (this.c20305bc.equals(c20305bc)) return; // for all checkboxes
        this.c20305bc = c20305bc;
        notifyPropertyChanged(BR.c20305bc);
    }

    @Bindable
    public String getC20305bd() {
        return c20305bd;
    }

    public void setC20305bd(String c20305bd) {
        if (this.c20305bd.equals(c20305bd)) return; // for all checkboxes
        this.c20305bd = c20305bd;
        notifyPropertyChanged(BR.c20305bd);
    }

    @Bindable
    public String getC20305be() {
        return c20305be;
    }

    public void setC20305be(String c20305be) {
        if (this.c20305be.equals(c20305be)) return; // for all checkboxes
        this.c20305be = c20305be;
        notifyPropertyChanged(BR.c20305be);
    }

    @Bindable
    public String getC20305bf() {
        return c20305bf;
    }

    public void setC20305bf(String c20305bf) {
        if (this.c20305bf.equals(c20305bf)) return; // for all checkboxes
        this.c20305bf = c20305bf;
        notifyPropertyChanged(BR.c20305bf);
    }

    @Bindable
    public String getC20305bg() {
        return c20305bg;
    }

    public void setC20305bg(String c20305bg) {
        if (this.c20305bg.equals(c20305bg)) return; // for all checkboxes
        this.c20305bg = c20305bg;
        notifyPropertyChanged(BR.c20305bg);
    }

    @Bindable
    public String getC20306a() {
        return c20306a;
    }

    public void setC20306a(String c20306a) {
        this.c20306a = c20306a;
        setC20306ba(c20306a.equals("1") ? this.c20306ba : "");
        setC20306bb(c20306a.equals("1") ? this.c20306bb : "");
        setC20306bc(c20306a.equals("1") ? this.c20306bc : "");
        setC20306bd(c20306a.equals("1") ? this.c20306bd : "");
        setC20306be(c20306a.equals("1") ? this.c20306be : "");
        setC20306bf(c20306a.equals("1") ? this.c20306bf : "");
        setC20306bg(c20306a.equals("1") ? this.c20306bg : "");
        notifyPropertyChanged(BR.c20306a);
    }

    @Bindable
    public String getC20306b() {
        return c20306b;
    }

    public void setC20306b(String c20306b) {
        this.c20306b = c20306b;
        notifyPropertyChanged(BR.c20306b);
    }

    @Bindable
    public String getC20306ba() {
        return c20306ba;
    }

    public void setC20306ba(String c20306ba) {
        if (this.c20306ba.equals(c20306ba)) return; // for all checkboxes
        this.c20306ba = c20306ba;
        notifyPropertyChanged(BR.c20306ba);
    }

    @Bindable
    public String getC20306bb() {
        return c20306bb;
    }

    public void setC20306bb(String c20306bb) {
        if (this.c20306bb.equals(c20306bb)) return; // for all checkboxes
        this.c20306bb = c20306bb;
        notifyPropertyChanged(BR.c20306bb);
    }

    @Bindable
    public String getC20306bc() {
        return c20306bc;
    }

    public void setC20306bc(String c20306bc) {
        if (this.c20306bc.equals(c20306bc)) return; // for all checkboxes
        this.c20306bc = c20306bc;
        notifyPropertyChanged(BR.c20306bc);
    }

    @Bindable
    public String getC20306bd() {
        return c20306bd;
    }

    public void setC20306bd(String c20306bd) {
        if (this.c20306bd.equals(c20306bd)) return; // for all checkboxes
        this.c20306bd = c20306bd;
        notifyPropertyChanged(BR.c20306bd);
    }

    @Bindable
    public String getC20306be() {
        return c20306be;
    }

    public void setC20306be(String c20306be) {
        if (this.c20306be.equals(c20306be)) return; // for all checkboxes
        this.c20306be = c20306be;
        notifyPropertyChanged(BR.c20306be);
    }

    @Bindable
    public String getC20306bf() {
        return c20306bf;
    }

    public void setC20306bf(String c20306bf) {
        if (this.c20306bf.equals(c20306bf)) return; // for all checkboxes
        this.c20306bf = c20306bf;
        notifyPropertyChanged(BR.c20306bf);
    }

    @Bindable
    public String getC20306bg() {
        return c20306bg;
    }

    public void setC20306bg(String c20306bg) {
        if (this.c20306bg.equals(c20306bg)) return; // for all checkboxes
        this.c20306bg = c20306bg;
        notifyPropertyChanged(BR.c20306bg);
    }

    @Bindable
    public String getC20307a() {
        return c20307a;
    }

    public void setC20307a(String c20307a) {
        this.c20307a = c20307a;
        setC20307ba(c20307a.equals("1") ? this.c20307ba : "");
        setC20307bb(c20307a.equals("1") ? this.c20307bb : "");
        setC20307bc(c20307a.equals("1") ? this.c20307bc : "");
        setC20307bd(c20307a.equals("1") ? this.c20307bd : "");
        setC20307be(c20307a.equals("1") ? this.c20307be : "");
        setC20307bf(c20307a.equals("1") ? this.c20307bf : "");
        setC20307bg(c20307a.equals("1") ? this.c20307bg : "");
        notifyPropertyChanged(BR.c20307a);
    }

    @Bindable
    public String getC20307b() {
        return c20307b;
    }

    public void setC20307b(String c20307b) {
        this.c20307b = c20307b;
        notifyPropertyChanged(BR.c20307b);
    }

    @Bindable
    public String getC20307ba() {
        return c20307ba;
    }

    public void setC20307ba(String c20307ba) {
        if (this.c20307ba.equals(c20307ba)) return; // for all checkboxes
        this.c20307ba = c20307ba;
        notifyPropertyChanged(BR.c20307ba);
    }

    @Bindable
    public String getC20307bb() {
        return c20307bb;
    }

    public void setC20307bb(String c20307bb) {
        if (this.c20307bb.equals(c20307bb)) return; // for all checkboxes
        this.c20307bb = c20307bb;
        notifyPropertyChanged(BR.c20307bb);
    }

    @Bindable
    public String getC20307bc() {
        return c20307bc;
    }

    public void setC20307bc(String c20307bc) {
        if (this.c20307bc.equals(c20307bc)) return; // for all checkboxes
        this.c20307bc = c20307bc;
        notifyPropertyChanged(BR.c20307bc);
    }

    @Bindable
    public String getC20307bd() {
        return c20307bd;
    }

    public void setC20307bd(String c20307bd) {
        if (this.c20307bd.equals(c20307bd)) return; // for all checkboxes
        this.c20307bd = c20307bd;
        notifyPropertyChanged(BR.c20307bd);
    }

    @Bindable
    public String getC20307be() {
        return c20307be;
    }

    public void setC20307be(String c20307be) {
        if (this.c20307be.equals(c20307be)) return; // for all checkboxes
        this.c20307be = c20307be;
        notifyPropertyChanged(BR.c20307be);
    }

    @Bindable
    public String getC20307bf() {
        return c20307bf;
    }

    public void setC20307bf(String c20307bf) {
        if (this.c20307bf.equals(c20307bf)) return; // for all checkboxes
        this.c20307bf = c20307bf;
        notifyPropertyChanged(BR.c20307bf);
    }

    @Bindable
    public String getC20307bg() {
        return c20307bg;
    }

    public void setC20307bg(String c20307bg) {
        if (this.c20307bg.equals(c20307bg)) return; // for all checkboxes
        this.c20307bg = c20307bg;
        notifyPropertyChanged(BR.c20307bg);
    }

    @Bindable
    public String getC20308a() {
        return c20308a;
    }

    public void setC20308a(String c20308a) {
        this.c20308a = c20308a;
        setC20308ba(c20308a.equals("1") ? this.c20308ba : "");
        setC20308bb(c20308a.equals("1") ? this.c20308bb : "");
        setC20308bc(c20308a.equals("1") ? this.c20308bc : "");
        setC20308bd(c20308a.equals("1") ? this.c20308bd : "");
        setC20308be(c20308a.equals("1") ? this.c20308be : "");
        setC20308bf(c20308a.equals("1") ? this.c20308bf : "");
        setC20308bg(c20308a.equals("1") ? this.c20308bg : "");
        notifyPropertyChanged(BR.c20308a);
    }

    @Bindable
    public String getC20308b() {
        return c20308b;
    }

    public void setC20308b(String c20308b) {
        this.c20308b = c20308b;
        notifyPropertyChanged(BR.c20308b);
    }

    @Bindable
    public String getC20308ba() {
        return c20308ba;
    }

    public void setC20308ba(String c20308ba) {
        if (this.c20308ba.equals(c20308ba)) return; // for all checkboxes
        this.c20308ba = c20308ba;
        notifyPropertyChanged(BR.c20308ba);
    }

    @Bindable
    public String getC20308bb() {
        return c20308bb;
    }

    public void setC20308bb(String c20308bb) {
        if (this.c20308bb.equals(c20308bb)) return; // for all checkboxes
        this.c20308bb = c20308bb;
        notifyPropertyChanged(BR.c20308bb);
    }

    @Bindable
    public String getC20308bc() {
        return c20308bc;
    }

    public void setC20308bc(String c20308bc) {
        if (this.c20308bc.equals(c20308bc)) return; // for all checkboxes
        this.c20308bc = c20308bc;
        notifyPropertyChanged(BR.c20308bc);
    }

    @Bindable
    public String getC20308bd() {
        return c20308bd;
    }

    public void setC20308bd(String c20308bd) {
        if (this.c20308bd.equals(c20308bd)) return; // for all checkboxes
        this.c20308bd = c20308bd;
        notifyPropertyChanged(BR.c20308bd);
    }

    @Bindable
    public String getC20308be() {
        return c20308be;
    }

    public void setC20308be(String c20308be) {
        if (this.c20308be.equals(c20308be)) return; // for all checkboxes
        this.c20308be = c20308be;
        notifyPropertyChanged(BR.c20308be);
    }

    @Bindable
    public String getC20308bf() {
        return c20308bf;
    }

    public void setC20308bf(String c20308bf) {
        if (this.c20308bf.equals(c20308bf)) return; // for all checkboxes
        this.c20308bf = c20308bf;
        notifyPropertyChanged(BR.c20308bf);
    }

    @Bindable
    public String getC20308bg() {
        return c20308bg;
    }

    public void setC20308bg(String c20308bg) {
        if (this.c20308bg.equals(c20308bg)) return; // for all checkboxes
        this.c20308bg = c20308bg;
        notifyPropertyChanged(BR.c20308bg);
    }

    @Bindable
    public String getC20309a() {
        return c20309a;
    }

    public void setC20309a(String c20309a) {
        this.c20309a = c20309a;
        setC20309ba(c20309a.equals("1") ? this.c20309ba : "");
        setC20309bb(c20309a.equals("1") ? this.c20309bb : "");
        setC20309bc(c20309a.equals("1") ? this.c20309bc : "");
        setC20309bd(c20309a.equals("1") ? this.c20309bd : "");
        setC20309be(c20309a.equals("1") ? this.c20309be : "");
        setC20309bf(c20309a.equals("1") ? this.c20309bf : "");
        setC20309bg(c20309a.equals("1") ? this.c20309bg : "");
        notifyPropertyChanged(BR.c20309a);
    }

    @Bindable
    public String getC20309b() {
        return c20309b;
    }

    public void setC20309b(String c20309b) {
        this.c20309b = c20309b;
        notifyPropertyChanged(BR.c20309b);
    }

    @Bindable
    public String getC20309ba() {
        return c20309ba;
    }

    public void setC20309ba(String c20309ba) {
        if (this.c20309ba.equals(c20309ba)) return; // for all checkboxes
        this.c20309ba = c20309ba;
        notifyPropertyChanged(BR.c20309ba);
    }

    @Bindable
    public String getC20309bb() {
        return c20309bb;
    }

    public void setC20309bb(String c20309bb) {
        if (this.c20309bb.equals(c20309bb)) return; // for all checkboxes
        this.c20309bb = c20309bb;
        notifyPropertyChanged(BR.c20309bb);
    }

    @Bindable
    public String getC20309bc() {
        return c20309bc;
    }

    public void setC20309bc(String c20309bc) {
        if (this.c20309bc.equals(c20309bc)) return; // for all checkboxes
        this.c20309bc = c20309bc;
        notifyPropertyChanged(BR.c20309bc);
    }

    @Bindable
    public String getC20309bd() {
        return c20309bd;
    }

    public void setC20309bd(String c20309bd) {
        if (this.c20309bd.equals(c20309bd)) return; // for all checkboxes
        this.c20309bd = c20309bd;
        notifyPropertyChanged(BR.c20309bd);
    }

    @Bindable
    public String getC20309be() {
        return c20309be;
    }

    public void setC20309be(String c20309be) {
        if (this.c20309be.equals(c20309be)) return; // for all checkboxes
        this.c20309be = c20309be;
        notifyPropertyChanged(BR.c20309be);
    }

    @Bindable
    public String getC20309bf() {
        return c20309bf;
    }

    public void setC20309bf(String c20309bf) {
        if (this.c20309bf.equals(c20309bf)) return; // for all checkboxes
        this.c20309bf = c20309bf;
        notifyPropertyChanged(BR.c20309bf);
    }

    @Bindable
    public String getC20309bg() {
        return c20309bg;
    }

    public void setC20309bg(String c20309bg) {
        if (this.c20309bg.equals(c20309bg)) return; // for all checkboxes
        this.c20309bg = c20309bg;
        notifyPropertyChanged(BR.c20309bg);
    }

    @Bindable
    public String getC20310a() {
        return c20310a;
    }

    public void setC20310a(String c20310a) {
        this.c20310a = c20310a;
        setC20310ba(c20310a.equals("1") ? this.c20310ba : "");
        setC20310bb(c20310a.equals("1") ? this.c20310bb : "");
        setC20310bc(c20310a.equals("1") ? this.c20310bc : "");
        setC20310bd(c20310a.equals("1") ? this.c20310bd : "");
        setC20310be(c20310a.equals("1") ? this.c20310be : "");
        setC20310bf(c20310a.equals("1") ? this.c20310bf : "");
        setC20310bg(c20310a.equals("1") ? this.c20310bg : "");
        notifyPropertyChanged(BR.c20310a);
    }

    @Bindable
    public String getC20310b() {
        return c20310b;
    }

    public void setC20310b(String c20310b) {
        this.c20310b = c20310b;
        notifyPropertyChanged(BR.c20310b);
    }

    @Bindable
    public String getC20310ba() {
        return c20310ba;
    }

    public void setC20310ba(String c20310ba) {
        if (this.c20310ba.equals(c20310ba)) return; // for all checkboxes
        this.c20310ba = c20310ba;
        notifyPropertyChanged(BR.c20310ba);
    }

    @Bindable
    public String getC20310bb() {
        return c20310bb;
    }

    public void setC20310bb(String c20310bb) {
        if (this.c20310bb.equals(c20310bb)) return; // for all checkboxes
        this.c20310bb = c20310bb;
        notifyPropertyChanged(BR.c20310bb);
    }

    @Bindable
    public String getC20310bc() {
        return c20310bc;
    }

    public void setC20310bc(String c20310bc) {
        if (this.c20310bc.equals(c20310bc)) return; // for all checkboxes
        this.c20310bc = c20310bc;
        notifyPropertyChanged(BR.c20310bc);
    }

    @Bindable
    public String getC20310bd() {
        return c20310bd;
    }

    public void setC20310bd(String c20310bd) {
        if (this.c20310bd.equals(c20310bd)) return; // for all checkboxes
        this.c20310bd = c20310bd;
        notifyPropertyChanged(BR.c20310bd);
    }

    @Bindable
    public String getC20310be() {
        return c20310be;
    }

    public void setC20310be(String c20310be) {
        if (this.c20310be.equals(c20310be)) return; // for all checkboxes
        this.c20310be = c20310be;
        notifyPropertyChanged(BR.c20310be);
    }

    @Bindable
    public String getC20310bf() {
        return c20310bf;
    }

    public void setC20310bf(String c20310bf) {
        if (this.c20310bf.equals(c20310bf)) return; // for all checkboxes
        this.c20310bf = c20310bf;
        notifyPropertyChanged(BR.c20310bf);
    }

    @Bindable
    public String getC20310bg() {
        return c20310bg;
    }

    public void setC20310bg(String c20310bg) {
        if (this.c20310bg.equals(c20310bg)) return; // for all checkboxes
        this.c20310bg = c20310bg;
        notifyPropertyChanged(BR.c20310bg);
    }

    @Bindable
    public String getC20311a() {
        return c20311a;
    }

    public void setC20311a(String c20311a) {
        this.c20311a = c20311a;
        setC20311ba(c20311a.equals("1") ? this.c20311ba : "");
        setC20311bb(c20311a.equals("1") ? this.c20311bb : "");
        setC20311bc(c20311a.equals("1") ? this.c20311bc : "");
        setC20311bd(c20311a.equals("1") ? this.c20311bd : "");
        setC20311be(c20311a.equals("1") ? this.c20311be : "");
        setC20311bf(c20311a.equals("1") ? this.c20311bf : "");
        setC20311bg(c20311a.equals("1") ? this.c20311bg : "");
        notifyPropertyChanged(BR.c20311a);
    }

    @Bindable
    public String getC20311b() {
        return c20311b;
    }

    public void setC20311b(String c20311b) {
        this.c20311b = c20311b;
        notifyPropertyChanged(BR.c20311b);
    }

    @Bindable
    public String getC20311ba() {
        return c20311ba;
    }

    public void setC20311ba(String c20311ba) {
        if (this.c20311ba.equals(c20311ba)) return; // for all checkboxes
        this.c20311ba = c20311ba;
        notifyPropertyChanged(BR.c20311ba);
    }

    @Bindable
    public String getC20311bb() {
        return c20311bb;
    }

    public void setC20311bb(String c20311bb) {
        if (this.c20311bb.equals(c20311bb)) return; // for all checkboxes
        this.c20311bb = c20311bb;
        notifyPropertyChanged(BR.c20311bb);
    }

    @Bindable
    public String getC20311bc() {
        return c20311bc;
    }

    public void setC20311bc(String c20311bc) {
        if (this.c20311bc.equals(c20311bc)) return; // for all checkboxes
        this.c20311bc = c20311bc;
        notifyPropertyChanged(BR.c20311bc);
    }

    @Bindable
    public String getC20311bd() {
        return c20311bd;
    }

    public void setC20311bd(String c20311bd) {
        if (this.c20311bd.equals(c20311bd)) return; // for all checkboxes
        this.c20311bd = c20311bd;
        notifyPropertyChanged(BR.c20311bd);
    }

    @Bindable
    public String getC20311be() {
        return c20311be;
    }

    public void setC20311be(String c20311be) {
        if (this.c20311be.equals(c20311be)) return; // for all checkboxes
        this.c20311be = c20311be;
        notifyPropertyChanged(BR.c20311be);
    }

    @Bindable
    public String getC20311bf() {
        return c20311bf;
    }

    public void setC20311bf(String c20311bf) {
        if (this.c20311bf.equals(c20311bf)) return; // for all checkboxes
        this.c20311bf = c20311bf;
        notifyPropertyChanged(BR.c20311bf);
    }

    @Bindable
    public String getC20311bg() {
        return c20311bg;
    }

    public void setC20311bg(String c20311bg) {
        if (this.c20311bg.equals(c20311bg)) return; // for all checkboxes
        this.c20311bg = c20311bg;
        notifyPropertyChanged(BR.c20311bg);
    }

    @Bindable
    public String getC20312a() {
        return c20312a;
    }

    public void setC20312a(String c20312a) {
        this.c20312a = c20312a;
        setC20312ba(c20312a.equals("1") ? this.c20312ba : "");
        setC20312bb(c20312a.equals("1") ? this.c20312bb : "");
        setC20312bc(c20312a.equals("1") ? this.c20312bc : "");
        setC20312bd(c20312a.equals("1") ? this.c20312bd : "");
        setC20312be(c20312a.equals("1") ? this.c20312be : "");
        setC20312bf(c20312a.equals("1") ? this.c20312bf : "");
        setC20312bg(c20312a.equals("1") ? this.c20312bg : "");
        notifyPropertyChanged(BR.c20312a);
    }

    @Bindable
    public String getC20312b() {
        return c20312b;
    }

    public void setC20312b(String c20312b) {
        this.c20312b = c20312b;
        notifyPropertyChanged(BR.c20312b);
    }

    @Bindable
    public String getC20312ba() {
        return c20312ba;
    }

    public void setC20312ba(String c20312ba) {
        if (this.c20312ba.equals(c20312ba)) return; // for all checkboxes
        this.c20312ba = c20312ba;
        notifyPropertyChanged(BR.c20312ba);
    }

    @Bindable
    public String getC20312bb() {
        return c20312bb;
    }

    public void setC20312bb(String c20312bb) {
        if (this.c20312bb.equals(c20312bb)) return; // for all checkboxes
        this.c20312bb = c20312bb;
        notifyPropertyChanged(BR.c20312bb);
    }

    @Bindable
    public String getC20312bc() {
        return c20312bc;
    }

    public void setC20312bc(String c20312bc) {
        if (this.c20312bc.equals(c20312bc)) return; // for all checkboxes
        this.c20312bc = c20312bc;
        notifyPropertyChanged(BR.c20312bc);
    }

    @Bindable
    public String getC20312bd() {
        return c20312bd;
    }

    public void setC20312bd(String c20312bd) {
        if (this.c20312bd.equals(c20312bd)) return; // for all checkboxes
        this.c20312bd = c20312bd;
        notifyPropertyChanged(BR.c20312bd);
    }

    @Bindable
    public String getC20312be() {
        return c20312be;
    }

    public void setC20312be(String c20312be) {
        if (this.c20312be.equals(c20312be)) return; // for all checkboxes
        this.c20312be = c20312be;
        notifyPropertyChanged(BR.c20312be);
    }

    @Bindable
    public String getC20312bf() {
        return c20312bf;
    }

    public void setC20312bf(String c20312bf) {
        if (this.c20312bf.equals(c20312bf)) return; // for all checkboxes
        this.c20312bf = c20312bf;
        notifyPropertyChanged(BR.c20312bf);
    }

    @Bindable
    public String getC20312bg() {
        return c20312bg;
    }

    public void setC20312bg(String c20312bg) {
        if (this.c20312bg.equals(c20312bg)) return; // for all checkboxes
        this.c20312bg = c20312bg;
        notifyPropertyChanged(BR.c20312bg);
    }

    @Bindable
    public String getC20313a() {
        return c20313a;
    }

    public void setC20313a(String c20313a) {
        this.c20313a = c20313a;
        setC20313ba(c20313a.equals("1") ? this.c20313ba : "");
        setC20313bb(c20313a.equals("1") ? this.c20313bb : "");
        setC20313bc(c20313a.equals("1") ? this.c20313bc : "");
        setC20313bd(c20313a.equals("1") ? this.c20313bd : "");
        setC20313be(c20313a.equals("1") ? this.c20313be : "");
        setC20313bf(c20313a.equals("1") ? this.c20313bf : "");
        setC20313bg(c20313a.equals("1") ? this.c20313bg : "");
        notifyPropertyChanged(BR.c20313a);
    }

    @Bindable
    public String getC20313b() {
        return c20313b;
    }

    public void setC20313b(String c20313b) {
        this.c20313b = c20313b;
        notifyPropertyChanged(BR.c20313b);
    }

    @Bindable
    public String getC20313ba() {
        return c20313ba;
    }

    public void setC20313ba(String c20313ba) {
        if (this.c20313ba.equals(c20313ba)) return; // for all checkboxes
        this.c20313ba = c20313ba;
        notifyPropertyChanged(BR.c20313ba);
    }

    @Bindable
    public String getC20313bb() {
        return c20313bb;
    }

    public void setC20313bb(String c20313bb) {
        if (this.c20313bb.equals(c20313bb)) return; // for all checkboxes
        this.c20313bb = c20313bb;
        notifyPropertyChanged(BR.c20313bb);
    }

    @Bindable
    public String getC20313bc() {
        return c20313bc;
    }

    public void setC20313bc(String c20313bc) {
        if (this.c20313bc.equals(c20313bc)) return; // for all checkboxes
        this.c20313bc = c20313bc;
        notifyPropertyChanged(BR.c20313bc);
    }

    @Bindable
    public String getC20313bd() {
        return c20313bd;
    }

    public void setC20313bd(String c20313bd) {
        if (this.c20313bd.equals(c20313bd)) return; // for all checkboxes
        this.c20313bd = c20313bd;
        notifyPropertyChanged(BR.c20313bd);
    }

    @Bindable
    public String getC20313be() {
        return c20313be;
    }

    public void setC20313be(String c20313be) {
        if (this.c20313be.equals(c20313be)) return; // for all checkboxes
        this.c20313be = c20313be;
        notifyPropertyChanged(BR.c20313be);
    }

    @Bindable
    public String getC20313bf() {
        return c20313bf;
    }

    public void setC20313bf(String c20313bf) {
        if (this.c20313bf.equals(c20313bf)) return; // for all checkboxes
        this.c20313bf = c20313bf;
        notifyPropertyChanged(BR.c20313bf);
    }

    @Bindable
    public String getC20313bg() {
        return c20313bg;
    }

    public void setC20313bg(String c20313bg) {
        if (this.c20313bg.equals(c20313bg)) return; // for all checkboxes
        this.c20313bg = c20313bg;
        notifyPropertyChanged(BR.c20313bg);
    }

    @Bindable
    public String getC20314a() {
        return c20314a;
    }

    public void setC20314a(String c20314a) {
        this.c20314a = c20314a;
        setC20314ba(c20314a.equals("1") ? this.c20314ba : "");
        setC20314bb(c20314a.equals("1") ? this.c20314bb : "");
        setC20314bc(c20314a.equals("1") ? this.c20314bc : "");
        setC20314bd(c20314a.equals("1") ? this.c20314bd : "");
        setC20314be(c20314a.equals("1") ? this.c20314be : "");
        setC20314bf(c20314a.equals("1") ? this.c20314bf : "");
        setC20314bg(c20314a.equals("1") ? this.c20314bg : "");
        notifyPropertyChanged(BR.c20314a);
    }

    @Bindable
    public String getC20314b() {
        return c20314b;
    }

    public void setC20314b(String c20314b) {
        this.c20314b = c20314b;
        notifyPropertyChanged(BR.c20314b);
    }

    @Bindable
    public String getC20314ba() {
        return c20314ba;
    }

    public void setC20314ba(String c20314ba) {
        if (this.c20314ba.equals(c20314ba)) return; // for all checkboxes
        this.c20314ba = c20314ba;
        notifyPropertyChanged(BR.c20314ba);
    }

    @Bindable
    public String getC20314bb() {
        return c20314bb;
    }

    public void setC20314bb(String c20314bb) {
        if (this.c20314bb.equals(c20314bb)) return; // for all checkboxes
        this.c20314bb = c20314bb;
        notifyPropertyChanged(BR.c20314bb);
    }

    @Bindable
    public String getC20314bc() {
        return c20314bc;
    }

    public void setC20314bc(String c20314bc) {
        if (this.c20314bc.equals(c20314bc)) return; // for all checkboxes
        this.c20314bc = c20314bc;
        notifyPropertyChanged(BR.c20314bc);
    }

    @Bindable
    public String getC20314bd() {
        return c20314bd;
    }

    public void setC20314bd(String c20314bd) {
        if (this.c20314bd.equals(c20314bd)) return; // for all checkboxes
        this.c20314bd = c20314bd;
        notifyPropertyChanged(BR.c20314bd);
    }

    @Bindable
    public String getC20314be() {
        return c20314be;
    }

    public void setC20314be(String c20314be) {
        if (this.c20314be.equals(c20314be)) return; // for all checkboxes
        this.c20314be = c20314be;
        notifyPropertyChanged(BR.c20314be);
    }

    @Bindable
    public String getC20314bf() {
        return c20314bf;
    }

    public void setC20314bf(String c20314bf) {
        if (this.c20314bf.equals(c20314bf)) return; // for all checkboxes
        this.c20314bf = c20314bf;
        notifyPropertyChanged(BR.c20314bf);
    }

    @Bindable
    public String getC20314bg() {
        return c20314bg;
    }

    public void setC20314bg(String c20314bg) {
        if (this.c20314bg.equals(c20314bg)) return; // for all checkboxes
        this.c20314bg = c20314bg;
        notifyPropertyChanged(BR.c20314bg);
    }

    @Bindable
    public String getC20315a() {
        return c20315a;
    }

    public void setC20315a(String c20315a) {
        this.c20315a = c20315a;
        setC20315ba(c20315a.equals("1") ? this.c20315ba : "");
        setC20315bb(c20315a.equals("1") ? this.c20315bb : "");
        setC20315bc(c20315a.equals("1") ? this.c20315bc : "");
        setC20315bd(c20315a.equals("1") ? this.c20315bd : "");
        setC20315be(c20315a.equals("1") ? this.c20315be : "");
        setC20315bf(c20315a.equals("1") ? this.c20315bf : "");
        setC20315bg(c20315a.equals("1") ? this.c20315bg : "");
        notifyPropertyChanged(BR.c20315a);
    }

    @Bindable
    public String getC20315b() {
        return c20315b;
    }

    public void setC20315b(String c20315b) {
        this.c20315b = c20315b;
        notifyPropertyChanged(BR.c20315b);
    }

    @Bindable
    public String getC20315ba() {
        return c20315ba;
    }

    public void setC20315ba(String c20315ba) {
        if (this.c20315ba.equals(c20315ba)) return; // for all checkboxes
        this.c20315ba = c20315ba;
        notifyPropertyChanged(BR.c20315ba);
    }

    @Bindable
    public String getC20315bb() {
        return c20315bb;
    }

    public void setC20315bb(String c20315bb) {
        if (this.c20315bb.equals(c20315bb)) return; // for all checkboxes
        this.c20315bb = c20315bb;
        notifyPropertyChanged(BR.c20315bb);
    }

    @Bindable
    public String getC20315bc() {
        return c20315bc;
    }

    public void setC20315bc(String c20315bc) {
        if (this.c20315bc.equals(c20315bc)) return; // for all checkboxes
        this.c20315bc = c20315bc;
        notifyPropertyChanged(BR.c20315bc);
    }

    @Bindable
    public String getC20315bd() {
        return c20315bd;
    }

    public void setC20315bd(String c20315bd) {
        if (this.c20315bd.equals(c20315bd)) return; // for all checkboxes
        this.c20315bd = c20315bd;
        notifyPropertyChanged(BR.c20315bd);
    }

    @Bindable
    public String getC20315be() {
        return c20315be;
    }

    public void setC20315be(String c20315be) {
        if (this.c20315be.equals(c20315be)) return; // for all checkboxes
        this.c20315be = c20315be;
        notifyPropertyChanged(BR.c20315be);
    }

    @Bindable
    public String getC20315bf() {
        return c20315bf;
    }

    public void setC20315bf(String c20315bf) {
        if (this.c20315bf.equals(c20315bf)) return; // for all checkboxes
        this.c20315bf = c20315bf;
        notifyPropertyChanged(BR.c20315bf);
    }

    @Bindable
    public String getC20315bg() {
        return c20315bg;
    }

    public void setC20315bg(String c20315bg) {
        if (this.c20315bg.equals(c20315bg)) return; // for all checkboxes
        this.c20315bg = c20315bg;
        notifyPropertyChanged(BR.c20315bg);
    }

    @Bindable
    public String getC20316a() {
        return c20316a;
    }

    public void setC20316a(String c20316a) {
        this.c20316a = c20316a;
        setC20316ba(c20316a.equals("1") ? this.c20316ba : "");
        setC20316bb(c20316a.equals("1") ? this.c20316bb : "");
        setC20316bc(c20316a.equals("1") ? this.c20316bc : "");
        setC20316bd(c20316a.equals("1") ? this.c20316bd : "");
        setC20316be(c20316a.equals("1") ? this.c20316be : "");
        setC20316bf(c20316a.equals("1") ? this.c20316bf : "");
        setC20316bg(c20316a.equals("1") ? this.c20316bg : "");
        notifyPropertyChanged(BR.c20316a);
    }

    @Bindable
    public String getC20316b() {
        return c20316b;
    }

    public void setC20316b(String c20316b) {
        this.c20316b = c20316b;
        notifyPropertyChanged(BR.c20316b);
    }

    @Bindable
    public String getC20316ba() {
        return c20316ba;
    }

    public void setC20316ba(String c20316ba) {
        if (this.c20316ba.equals(c20316ba)) return; // for all checkboxes
        this.c20316ba = c20316ba;
        notifyPropertyChanged(BR.c20316ba);
    }

    @Bindable
    public String getC20316bb() {
        return c20316bb;
    }

    public void setC20316bb(String c20316bb) {
        if (this.c20316bb.equals(c20316bb)) return; // for all checkboxes
        this.c20316bb = c20316bb;
        notifyPropertyChanged(BR.c20316bb);
    }

    @Bindable
    public String getC20316bc() {
        return c20316bc;
    }

    public void setC20316bc(String c20316bc) {
        if (this.c20316bc.equals(c20316bc)) return; // for all checkboxes
        this.c20316bc = c20316bc;
        notifyPropertyChanged(BR.c20316bc);
    }

    @Bindable
    public String getC20316bd() {
        return c20316bd;
    }

    public void setC20316bd(String c20316bd) {
        if (this.c20316bd.equals(c20316bd)) return; // for all checkboxes
        this.c20316bd = c20316bd;
        notifyPropertyChanged(BR.c20316bd);
    }

    @Bindable
    public String getC20316be() {
        return c20316be;
    }

    public void setC20316be(String c20316be) {
        if (this.c20316be.equals(c20316be)) return; // for all checkboxes
        this.c20316be = c20316be;
        notifyPropertyChanged(BR.c20316be);
    }

    @Bindable
    public String getC20316bf() {
        return c20316bf;
    }

    public void setC20316bf(String c20316bf) {
        if (this.c20316bf.equals(c20316bf)) return; // for all checkboxes
        this.c20316bf = c20316bf;
        notifyPropertyChanged(BR.c20316bf);
    }

    @Bindable
    public String getC20316bg() {
        return c20316bg;
    }

    public void setC20316bg(String c20316bg) {
        if (this.c20316bg.equals(c20316bg)) return; // for all checkboxes
        this.c20316bg = c20316bg;
        notifyPropertyChanged(BR.c20316bg);
    }

    @Bindable
    public String getC20317a() {
        return c20317a;
    }

    public void setC20317a(String c20317a) {
        this.c20317a = c20317a;
        setC20317ba(c20317a.equals("1") ? this.c20317ba : "");
        setC20317bb(c20317a.equals("1") ? this.c20317bb : "");
        setC20317bc(c20317a.equals("1") ? this.c20317bc : "");
        setC20317bd(c20317a.equals("1") ? this.c20317bd : "");
        setC20317be(c20317a.equals("1") ? this.c20317be : "");
        setC20317bf(c20317a.equals("1") ? this.c20317bf : "");
        setC20317bg(c20317a.equals("1") ? this.c20317bg : "");
        notifyPropertyChanged(BR.c20317a);
    }

    @Bindable
    public String getC20317b() {
        return c20317b;
    }

    public void setC20317b(String c20317b) {
        this.c20317b = c20317b;
        notifyPropertyChanged(BR.c20317b);
    }

    @Bindable
    public String getC20317ba() {
        return c20317ba;
    }

    public void setC20317ba(String c20317ba) {
        if (this.c20317ba.equals(c20317ba)) return; // for all checkboxes
        this.c20317ba = c20317ba;
        notifyPropertyChanged(BR.c20317ba);
    }

    @Bindable
    public String getC20317bb() {
        return c20317bb;
    }

    public void setC20317bb(String c20317bb) {
        if (this.c20317bb.equals(c20317bb)) return; // for all checkboxes
        this.c20317bb = c20317bb;
        notifyPropertyChanged(BR.c20317bb);
    }

    @Bindable
    public String getC20317bc() {
        return c20317bc;
    }

    public void setC20317bc(String c20317bc) {
        if (this.c20317bc.equals(c20317bc)) return; // for all checkboxes
        this.c20317bc = c20317bc;
        notifyPropertyChanged(BR.c20317bc);
    }

    @Bindable
    public String getC20317bd() {
        return c20317bd;
    }

    public void setC20317bd(String c20317bd) {
        if (this.c20317bd.equals(c20317bd)) return; // for all checkboxes
        this.c20317bd = c20317bd;
        notifyPropertyChanged(BR.c20317bd);
    }

    @Bindable
    public String getC20317be() {
        return c20317be;
    }

    public void setC20317be(String c20317be) {
        if (this.c20317be.equals(c20317be)) return; // for all checkboxes
        this.c20317be = c20317be;
        notifyPropertyChanged(BR.c20317be);
    }

    @Bindable
    public String getC20317bf() {
        return c20317bf;
    }

    public void setC20317bf(String c20317bf) {
        if (this.c20317bf.equals(c20317bf)) return; // for all checkboxes
        this.c20317bf = c20317bf;
        notifyPropertyChanged(BR.c20317bf);
    }

    @Bindable
    public String getC20317bg() {
        return c20317bg;
    }

    public void setC20317bg(String c20317bg) {
        if (this.c20317bg.equals(c20317bg)) return; // for all checkboxes
        this.c20317bg = c20317bg;
        notifyPropertyChanged(BR.c20317bg);
    }

    @Bindable
    public String getC204() {
        return c204;
    }

    public void setC204(String c204) {
        this.c204 = c204;
        notifyPropertyChanged(BR.c204);
    }

    @Bindable
    public String getC301() {
        return c301;
    }

    public void setC301(String c301) {
        this.c301 = c301;
        setC302(c301.equals("1") ? this.c302 : "");
        setC303(c301.equals("1") ? this.c303 : "");
        setC304(c301.equals("1") ? this.c304 : "");
        setC305a(c301.equals("1") ? this.c305a : "");
        setC305b(c301.equals("1") ? this.c305b : "");
        setC305c(c301.equals("1") ? this.c305c : "");
        setC305d(c301.equals("1") ? this.c305d : "");
        setC305e(c301.equals("1") ? this.c305e : "");
        setC305f(c301.equals("1") ? this.c305f : "");
        setC305g(c301.equals("1") ? this.c305g : "");
        setC305h(c301.equals("1") ? this.c305h : "");
        setC305i(c301.equals("1") ? this.c305i : "");
        setC305j(c301.equals("1") ? this.c305j : "");
        setC30596(c301.equals("1") ? this.c30596 : "");
        notifyPropertyChanged(BR.c301);
    }

    @Bindable
    public String getC302() {
        return c302;
    }

    public void setC302(String c302) {
        this.c302 = c302;
        setC303(c302.equals("2") ? this.c303 : "");
        setC304(c302.equals("1") ? this.c304 : "");
        setC305a(c302.equals("1") ? this.c305a : "");
        setC305b(c302.equals("1") ? this.c305b : "");
        setC305c(c302.equals("1") ? this.c305c : "");
        setC305d(c302.equals("1") ? this.c305d : "");
        setC305e(c302.equals("1") ? this.c305e : "");
        setC305f(c302.equals("1") ? this.c305f : "");
        setC305g(c302.equals("1") ? this.c305g : "");
        setC305h(c302.equals("1") ? this.c305h : "");
        setC305i(c302.equals("1") ? this.c305i : "");
        setC305j(c302.equals("1") ? this.c305j : "");
        setC30596(c302.equals("1") ? this.c30596 : "");
        notifyPropertyChanged(BR.c302);
    }

    @Bindable
    public String getC303() {
        return c303;
    }

    public void setC303(String c303) {
        this.c303 = c303;
        setC30396x(c303.equals("96") ? this.c30396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c303);
    }

    @Bindable
    public String getC30396x() {
        return c30396x;
    }

    public void setC30396x(String c30396x) {
        this.c30396x = c30396x;
        notifyPropertyChanged(BR.c30396x);
    }

    @Bindable
    public String getC304() {
        return c304;
    }

    public void setC304(String c304) {
        this.c304 = c304;
        setC304961x(c304.equals("961") ? this.c304961x : ""); // for all skips, mention all skipped questions
        setC304962x(c304.equals("962") ? this.c304962x : ""); // for all skips, mention all skipped questions
        setC304963x(c304.equals("963") ? this.c304963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c304);
    }

    @Bindable
    public String getC304961x() {
        return c304961x;
    }

    public void setC304961x(String c304961x) {
        this.c304961x = c304961x;
        notifyPropertyChanged(BR.c304961x);
    }

    @Bindable
    public String getC304962x() {
        return c304962x;
    }

    public void setC304962x(String c304962x) {
        this.c304962x = c304962x;
        notifyPropertyChanged(BR.c304962x);
    }

    @Bindable
    public String getC304963x() {
        return c304963x;
    }

    public void setC304963x(String c304963x) {
        this.c304963x = c304963x;
        notifyPropertyChanged(BR.c304963x);
    }

    @Bindable
    public String getC305() {
        return c305;
    }

    public void setC305(String c305) {
        this.c305 = c305;
        notifyPropertyChanged(BR.c305);
    }

    @Bindable
    public String getC305a() {
        return c305a;
    }

    public void setC305a(String c305a) {
        if (this.c305a.equals(c305a)) return; // for all checkboxes
        this.c305a = c305a;
        notifyPropertyChanged(BR.c305a);
    }

    @Bindable
    public String getC305b() {
        return c305b;
    }

    public void setC305b(String c305b) {
        if (this.c305b.equals(c305b)) return; // for all checkboxes
        this.c305b = c305b;
        notifyPropertyChanged(BR.c305b);
    }

    @Bindable
    public String getC305c() {
        return c305c;
    }

    public void setC305c(String c305c) {
        if (this.c305c.equals(c305c)) return; // for all checkboxes
        this.c305c = c305c;
        notifyPropertyChanged(BR.c305c);
    }

    @Bindable
    public String getC305d() {
        return c305d;
    }

    public void setC305d(String c305d) {
        if (this.c305d.equals(c305d)) return; // for all checkboxes
        this.c305d = c305d;
        notifyPropertyChanged(BR.c305d);
    }

    @Bindable
    public String getC305e() {
        return c305e;
    }

    public void setC305e(String c305e) {
        if (this.c305e.equals(c305e)) return; // for all checkboxes
        this.c305e = c305e;
        notifyPropertyChanged(BR.c305e);
    }

    @Bindable
    public String getC305f() {
        return c305f;
    }

    public void setC305f(String c305f) {
        if (this.c305f.equals(c305f)) return; // for all checkboxes
        this.c305f = c305f;
        notifyPropertyChanged(BR.c305f);
    }

    @Bindable
    public String getC305g() {
        return c305g;
    }

    public void setC305g(String c305g) {
        if (this.c305g.equals(c305g)) return; // for all checkboxes
        this.c305g = c305g;
        notifyPropertyChanged(BR.c305g);
    }

    @Bindable
    public String getC305h() {
        return c305h;
    }

    public void setC305h(String c305h) {
        if (this.c305h.equals(c305h)) return; // for all checkboxes
        this.c305h = c305h;
        notifyPropertyChanged(BR.c305h);
    }

    @Bindable
    public String getC305i() {
        return c305i;
    }

    public void setC305i(String c305i) {
        if (this.c305i.equals(c305i)) return; // for all checkboxes
        this.c305i = c305i;
        notifyPropertyChanged(BR.c305i);
    }

    @Bindable
    public String getC305j() {
        return c305j;
    }

    public void setC305j(String c305j) {
        if (this.c305j.equals(c305j)) return; // for all checkboxes
        this.c305j = c305j;
        notifyPropertyChanged(BR.c305j);
    }

    @Bindable
    public String getC30596() {
        return c30596;
    }

    public void setC30596(String c30596) {
        if (this.c30596.equals(c30596)) return; // for all checkboxes
        this.c30596 = c30596;
        setC30596x(c30596.equals("96") ? this.c30596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c30596);
    }

    @Bindable
    public String getC30596x() {
        return c30596x;
    }

    public void setC30596x(String c30596x) {
        this.c30596x = c30596x;
        notifyPropertyChanged(BR.c30596x);
    }

    @Bindable
    public String getC306() {
        return c306;
    }

    public void setC306(String c306) {
        this.c306 = c306;
        setC307(c306.equals("1") ? this.c307 : "");
        setC309(c306.equals("1") ? this.c309 : "");
        setC310a(c306.equals("1") ? this.c310a : "");
        setC310b(c306.equals("1") ? this.c310b : "");
        setC310c(c306.equals("1") ? this.c310c : "");
        setC310d(c306.equals("1") ? this.c310d : "");
        setC310e(c306.equals("1") ? this.c310e : "");
        setC310f(c306.equals("1") ? this.c310f : "");
        setC310g(c306.equals("1") ? this.c310g : "");
        setC31096(c306.equals("1") ? this.c31096 : "");
        notifyPropertyChanged(BR.c306);
    }

    @Bindable
    public String getC307() {
        return c307;
    }

    public void setC307(String c307) {
        this.c307 = c307;
        setC308(c307.equals("2") ? this.c308 : "");
        setC309(c307.equals("1") ? this.c309 : "");
        setC310a(c307.equals("1") ? this.c310a : "");
        setC310b(c307.equals("1") ? this.c310b : "");
        setC310c(c307.equals("1") ? this.c310c : "");
        setC310d(c307.equals("1") ? this.c310d : "");
        setC310e(c307.equals("1") ? this.c310e : "");
        setC310f(c307.equals("1") ? this.c310f : "");
        setC310g(c307.equals("1") ? this.c310g : "");
        setC31096(c307.equals("1") ? this.c31096 : "");
        notifyPropertyChanged(BR.c307);
    }

    @Bindable
    public String getC308() {
        return c308;
    }

    public void setC308(String c308) {
        this.c308 = c308;
        setC30896x(c308.equals("96") ? this.c30896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c308);
    }

    @Bindable
    public String getC30896x() {
        return c30896x;
    }

    public void setC30896x(String c30896x) {
        this.c30896x = c30896x;
        notifyPropertyChanged(BR.c30896x);
    }

    @Bindable
    public String getC309() {
        return c309;
    }

    public void setC309(String c309) {
        this.c309 = c309;
        setC309961x(c309.equals("961") ? this.c309961x : ""); // for all skips, mention all skipped questions
        setC309962x(c309.equals("962") ? this.c309962x : ""); // for all skips, mention all skipped questions
        setC309963x(c309.equals("963") ? this.c309963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c309);
    }

    @Bindable
    public String getC309961x() {
        return c309961x;
    }

    public void setC309961x(String c309961x) {
        this.c309961x = c309961x;
        notifyPropertyChanged(BR.c309961x);
    }

    @Bindable
    public String getC309962x() {
        return c309962x;
    }

    public void setC309962x(String c309962x) {
        this.c309962x = c309962x;
        notifyPropertyChanged(BR.c309962x);
    }

    @Bindable
    public String getC309963x() {
        return c309963x;
    }

    public void setC309963x(String c309963x) {
        this.c309963x = c309963x;
        notifyPropertyChanged(BR.c309963x);
    }

    @Bindable
    public String getC310() {
        return c310;
    }

    public void setC310(String c310) {
        this.c310 = c310;
        notifyPropertyChanged(BR.c310);
    }

    @Bindable
    public String getC310a() {
        return c310a;
    }

    public void setC310a(String c310a) {
        if (this.c310a.equals(c310a)) return; // for all checkboxes
        this.c310a = c310a;
        notifyPropertyChanged(BR.c310a);
    }

    @Bindable
    public String getC310b() {
        return c310b;
    }

    public void setC310b(String c310b) {
        if (this.c310b.equals(c310b)) return; // for all checkboxes
        this.c310b = c310b;
        notifyPropertyChanged(BR.c310b);
    }

    @Bindable
    public String getC310c() {
        return c310c;
    }

    public void setC310c(String c310c) {
        if (this.c310c.equals(c310c)) return; // for all checkboxes
        this.c310c = c310c;
        notifyPropertyChanged(BR.c310c);
    }

    @Bindable
    public String getC310d() {
        return c310d;
    }

    public void setC310d(String c310d) {
        if (this.c310d.equals(c310d)) return; // for all checkboxes
        this.c310d = c310d;
        notifyPropertyChanged(BR.c310d);
    }

    @Bindable
    public String getC310e() {
        return c310e;
    }

    public void setC310e(String c310e) {
        if (this.c310e.equals(c310e)) return; // for all checkboxes
        this.c310e = c310e;
        notifyPropertyChanged(BR.c310e);
    }

    @Bindable
    public String getC310f() {
        return c310f;
    }

    public void setC310f(String c310f) {
        if (this.c310f.equals(c310f)) return; // for all checkboxes
        this.c310f = c310f;
        notifyPropertyChanged(BR.c310f);
    }

    @Bindable
    public String getC310g() {
        return c310g;
    }

    public void setC310g(String c310g) {
        if (this.c310g.equals(c310g)) return; // for all checkboxes
        this.c310g = c310g;
        notifyPropertyChanged(BR.c310g);
    }

    @Bindable
    public String getC31096() {
        return c31096;
    }

    public void setC31096(String c31096) {
        if (this.c31096.equals(c31096)) return; // for all checkboxes
        this.c31096 = c31096;
        setC31096x(c31096.equals("96") ? this.c31096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c31096);
    }

    @Bindable
    public String getC31096x() {
        return c31096x;
    }

    public void setC31096x(String c31096x) {
        this.c31096x = c31096x;
        notifyPropertyChanged(BR.c31096x);
    }

    @Bindable
    public String getC311() {
        return c311;
    }

    public void setC311(String c311) {
        this.c311 = c311;
        setC312(c311.equals("1") ? this.c312 : "");
        setC314(c311.equals("1") ? this.c314 : "");
        setC315a(c311.equals("1") ? this.c315a : "");
        setC315b(c311.equals("1") ? this.c315b : "");
        setC315c(c311.equals("1") ? this.c315c : "");
        setC315d(c311.equals("1") ? this.c315d : "");
        setC315e(c311.equals("1") ? this.c315e : "");
        setC315f(c311.equals("1") ? this.c315f : "");
        setC315g(c311.equals("1") ? this.c315g : "");
        setC315h(c311.equals("1") ? this.c315h : "");
        setC31596(c311.equals("1") ? this.c31596 : "");
        notifyPropertyChanged(BR.c311);
    }

    @Bindable
    public String getC312() {
        return c312;
    }

    public void setC312(String c312) {
        this.c312 = c312;
        setC313(c312.equals("2") ? this.c313 : "");
        setC314(c312.equals("1") ? this.c314 : "");
        setC315a(c312.equals("1") ? this.c315a : "");
        setC315b(c312.equals("1") ? this.c315b : "");
        setC315c(c312.equals("1") ? this.c315c : "");
        setC315d(c312.equals("1") ? this.c315d : "");
        setC315e(c312.equals("1") ? this.c315e : "");
        setC315f(c312.equals("1") ? this.c315f : "");
        setC315g(c312.equals("1") ? this.c315g : "");
        setC315h(c312.equals("1") ? this.c315h : "");
        setC31596(c312.equals("1") ? this.c31596 : "");
        notifyPropertyChanged(BR.c312);
    }

    @Bindable
    public String getC313() {
        return c313;
    }

    public void setC313(String c313) {
        this.c313 = c313;
        setC31396x(c313.equals("96") ? this.c31396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c313);
    }

    @Bindable
    public String getC31396x() {
        return c31396x;
    }

    public void setC31396x(String c31396x) {
        this.c31396x = c31396x;
        notifyPropertyChanged(BR.c31396x);
    }

    @Bindable
    public String getC314() {
        return c314;
    }

    public void setC314(String c314) {
        this.c314 = c314;
        setC314961x(c314.equals("961") ? this.c314961x : ""); // for all skips, mention all skipped questions
        setC314962x(c314.equals("962") ? this.c314962x : ""); // for all skips, mention all skipped questions
        setC314963x(c314.equals("963") ? this.c314963x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c314);
    }

    @Bindable
    public String getC314961x() {
        return c314961x;
    }

    public void setC314961x(String c314961x) {
        this.c314961x = c314961x;
        notifyPropertyChanged(BR.c314961x);
    }

    @Bindable
    public String getC314962x() {
        return c314962x;
    }

    public void setC314962x(String c314962x) {
        this.c314962x = c314962x;
        notifyPropertyChanged(BR.c314962x);
    }

    @Bindable
    public String getC314963x() {
        return c314963x;
    }

    public void setC314963x(String c314963x) {
        this.c314963x = c314963x;
        notifyPropertyChanged(BR.c314963x);
    }

    @Bindable
    public String getC315() {
        return c315;
    }

    public void setC315(String c315) {
        this.c315 = c315;
        notifyPropertyChanged(BR.c315);
    }

    @Bindable
    public String getC315a() {
        return c315a;
    }

    public void setC315a(String c315a) {
        if (this.c315a.equals(c315a)) return; // for all checkboxes
        this.c315a = c315a;
        notifyPropertyChanged(BR.c315a);
    }

    @Bindable
    public String getC315b() {
        return c315b;
    }

    public void setC315b(String c315b) {
        if (this.c315b.equals(c315b)) return; // for all checkboxes
        this.c315b = c315b;
        notifyPropertyChanged(BR.c315b);
    }

    @Bindable
    public String getC315c() {
        return c315c;
    }

    public void setC315c(String c315c) {
        if (this.c315c.equals(c315c)) return; // for all checkboxes
        this.c315c = c315c;
        notifyPropertyChanged(BR.c315c);
    }

    @Bindable
    public String getC315d() {
        return c315d;
    }

    public void setC315d(String c315d) {
        if (this.c315d.equals(c315d)) return; // for all checkboxes
        this.c315d = c315d;
        notifyPropertyChanged(BR.c315d);
    }

    @Bindable
    public String getC315e() {
        return c315e;
    }

    public void setC315e(String c315e) {
        if (this.c315e.equals(c315e)) return; // for all checkboxes
        this.c315e = c315e;
        notifyPropertyChanged(BR.c315e);
    }

    @Bindable
    public String getC315f() {
        return c315f;
    }

    public void setC315f(String c315f) {
        if (this.c315f.equals(c315f)) return; // for all checkboxes
        this.c315f = c315f;
        notifyPropertyChanged(BR.c315f);
    }

    @Bindable
    public String getC315g() {
        return c315g;
    }

    public void setC315g(String c315g) {
        if (this.c315g.equals(c315g)) return; // for all checkboxes
        this.c315g = c315g;
        notifyPropertyChanged(BR.c315g);
    }

    @Bindable
    public String getC315h() {
        return c315h;
    }

    public void setC315h(String c315h) {
        if (this.c315h.equals(c315h)) return; // for all checkboxes
        this.c315h = c315h;
        notifyPropertyChanged(BR.c315h);
    }

    @Bindable
    public String getC31596() {
        return c31596;
    }

    public void setC31596(String c31596) {
        if (this.c31596.equals(c31596)) return; // for all checkboxes
        this.c31596 = c31596;
        setC31596x(c31596.equals("96") ? this.c31596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.c31596);
    }

    @Bindable
    public String getC31596x() {
        return c31596x;
    }

    public void setC31596x(String c31596x) {
        this.c31596x = c31596x;
        notifyPropertyChanged(BR.c31596x);
    }

    @Bindable
    public String getC316() {
        return c316;
    }

    public void setC316(String c316) {
        this.c316 = c316;
        setC317(c316.equals("1") ? this.c317 : "");
        notifyPropertyChanged(BR.c316);
    }

    @Bindable
    public String getC317() {
        return c317;
    }

    public void setC317(String c317) {
        this.c317 = c317;
        notifyPropertyChanged(BR.c317);
    }

    @Bindable
    public String getC318() {
        return c318;
    }

    public void setC318(String c318) {
        this.c318 = c318;
        notifyPropertyChanged(BR.c318);
    }

    @Bindable
    public String getC319() {
        return c319;
    }

    public void setC319(String c319) {
        this.c319 = c319;
        setC320(c319.equals("1") ? this.c320 : "");
        notifyPropertyChanged(BR.c319);
    }

    @Bindable
    public String getC320() {
        return c320;
    }

    public void setC320(String c320) {
        this.c320 = c320;
        notifyPropertyChanged(BR.c320);
    }

    @Bindable
    public String getC321() {
        return c321;
    }

    public void setC321(String c321) {
        this.c321 = c321;
        notifyPropertyChanged(BR.c321);
    }

    @Bindable
    public String getC322() {
        return c322;
    }

    public void setC322(String c322) {
        this.c322 = c322;
        setC323(c322.equals("1") ? this.c323 : "");
        notifyPropertyChanged(BR.c322);
    }

    @Bindable
    public String getC323() {
        return c323;
    }

    public void setC323(String c323) {
        this.c323 = c323;
        setC323mx(c323.equals("1") ? this.c323mx : "");
        setC323dx(c323.equals("2") ? this.c323dx : "");
        notifyPropertyChanged(BR.c323);
    }

    @Bindable
    public String getC323mx() {
        return c323mx;
    }

    public void setC323mx(String c323mx) {
        this.c323mx = c323mx;
        notifyPropertyChanged(BR.c323mx);
    }

    @Bindable
    public String getC323dx() {
        return c323dx;
    }

    public void setC323dx(String c323dx) {
        this.c323dx = c323dx;
        notifyPropertyChanged(BR.c323dx);
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
        sH2bHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH2B)));

        /*sH2cHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH2c)));
        sH2dHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH2d)));
        */

        sH3aHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH3A)));
        sH3bHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH3B)));
        sH4Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH4)));
        sH5Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH5)));
        sH6Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH6)));
        sH7Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH7)));

        sW1aHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SW1A)));
        /*sW1bHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SW1B)));*/
        sW2Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SW2)));
        sW3Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SW3)));
        sW4Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SW4)));

        sC1Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC1)));
        sC2Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC2)));
        sC3Hydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC3)));

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
             /*   this.h106m = json.getString("h106m");
                this.h106y = json.getString("h106y");*/
            this.h107 = json.getString("h107");
            /*  this.h107m = json.getString("h107m");*/
            this.h108 = json.getString("h108");
            this.h109 = json.getString("h109");
            this.h110 = json.getString("h110");
            this.h111 = json.getString("h111");
            this.h112 = json.getString("h112");
            this.h11296x = json.getString("h11296x");
            this.h201 = json.getString("h201");
            this.h202 = json.getString("h202");
            this.h203d = json.getString("h203d");
            this.h203m = json.getString("h203m");
            this.h203y = json.getString("h203y");
            this.h204 = json.getString("h204");
            this.h205 = json.getString("h205");
            this.h206 = json.getString("h206");
            this.h207 = json.getString("h207");
            this.h208 = json.getString("h208");

        }
    }

    public void sH2bHydrate(String string) throws JSONException {
        Log.d(TAG, "sH2bHydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.h209t = json.getString("h209t");
            this.h209m = json.getString("h209m");
            this.h209f = json.getString("h209f");
            this.h210 = json.getString("h210");
            this.h211t = json.getString("h211t");
            this.h211m = json.getString("h211m");
            this.h211f = json.getString("h211f");
            this.h212 = json.getString("h212");
            this.h213t = json.getString("h213t");
            this.h213m = json.getString("h213m");
            this.h213f = json.getString("h213f");
            this.h214 = json.getString("h214");
            this.h215t = json.getString("h215t");
            this.h215m = json.getString("h215m");
            this.h215f = json.getString("h215f");
            this.h216 = json.getString("h216");
            this.h217t = json.getString("h217t");
            this.h217m = json.getString("h217m");
            this.h217f = json.getString("h217f");
            this.h218 = json.getString("h218");
            this.h219t = json.getString("h219t");
            this.h219m = json.getString("h219m");
            this.h219f = json.getString("h219f");
            this.h220a = json.getString("h220a");
            this.h220b = json.getString("h220b");
            this.h220c = json.getString("h220c");

        }
    }

    public void sH3aHydrate(String string) throws JSONException {
        Log.d(TAG, "sH3aHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h301 = json.getString("h301");
            this.h30196x = json.getString("h30196x");
            this.h302 = json.getString("h302");
            this.h30296x = json.getString("h30296x");
            this.h303 = json.getString("h303");
            this.h30396x = json.getString("h30396x");
            this.h304 = json.getString("h304");
            this.h305 = json.getString("h305");
            this.h306 = json.getString("h306");
            this.h30696x = json.getString("h30696x");
            this.h307 = json.getString("h307");
            this.h30796x = json.getString("h30796x");
            this.h308 = json.getString("h308");
            this.h309 = json.getString("h309");
            this.h310 = json.getString("h310");
            this.h31096x = json.getString("h31096x");
            this.h311a = json.getString("h311a");
            this.h311b = json.getString("h311b");
            this.h311c = json.getString("h311c");
            this.h311d = json.getString("h311d");
            this.h311e = json.getString("h311e");
            this.h311f = json.getString("h311f");
            this.h311g = json.getString("h311g");
            this.h311h = json.getString("h311h");
            this.h311i = json.getString("h311i");
            this.h311j = json.getString("h311j");
            this.h311k = json.getString("h311k");
            this.h311l = json.getString("h311l");
            this.h311m = json.getString("h311m");
            this.h311n = json.getString("h311n");
            this.h311o = json.getString("h311o");
            this.h311p = json.getString("h311p");
            this.h311q = json.getString("h311q");
            this.h311r = json.getString("h311r");
            this.h311s = json.getString("h311s");
            this.h312a = json.getString("h312a");
            this.h312b = json.getString("h312b");
            this.h312c = json.getString("h312c");
            this.h312d = json.getString("h312d");
            this.h312e = json.getString("h312e");
            this.h312f = json.getString("h312f");
            this.h312g = json.getString("h312g");

        }
    }

    public void sH3bHydrate(String string) throws JSONException {
        Log.d(TAG, "sH3bHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h313 = json.getString("h313");
            this.h313a = json.getString("h313a");
            this.h313b = json.getString("h313b");
            this.h313c = json.getString("h313c");
            this.h313d = json.getString("h313d");
            this.h313e = json.getString("h313e");
            this.h313f = json.getString("h313f");
            this.h31396 = json.getString("h31396");
            this.h31396x = json.getString("h31396x");
            this.h314 = json.getString("h314");
            this.h31496x = json.getString("h31496x");
            this.h315 = json.getString("h315");
            this.h31596x = json.getString("h31596x");
            this.h316 = json.getString("h316");
            this.h317 = json.getString("h317");
            this.h31796x = json.getString("h31796x");
            this.h318 = json.getString("h318");
            this.h31896x = json.getString("h31896x");
            this.h319 = json.getString("h319");
            this.h31996x = json.getString("h31996x");
            this.h320 = json.getString("h320");
            this.h321 = json.getString("h321");
            this.h322 = json.getString("h322");
            this.h322ax = json.getString("h322ax");
            this.h322bx = json.getString("h322bx");
            this.h323 = json.getString("h323");
            this.h324 = json.getString("h324");
            this.h3241 = json.getString("h3241");
            this.h3241x = json.getString("h3241x");
            this.h3242 = json.getString("h3242");
            this.h3242x = json.getString("h3242x");
            this.h3243 = json.getString("h3243");
            this.h3243x = json.getString("h3243x");
            this.h3244 = json.getString("h3244");
            this.h3244x = json.getString("h3244x");
            this.h3245 = json.getString("h3245");
            this.h3245x = json.getString("h3245x");
            this.h3246 = json.getString("h3246");
            this.h3246x = json.getString("h3246x");
            this.h3247 = json.getString("h3247");
            this.h3247x = json.getString("h3247x");

        }
    }

    public void sH4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h401 = json.getString("h401");
            this.h402 = json.getString("h402");
            this.h403 = json.getString("h403");
            this.h403a = json.getString("h403a");
            this.h403b = json.getString("h403b");
            this.h403c = json.getString("h403c");
            this.h403d = json.getString("h403d");
            this.h404 = json.getString("h404");
            this.h405 = json.getString("h405");
            this.h405a = json.getString("h405a");
            this.h405b = json.getString("h405b");
            this.h405c = json.getString("h405c");
            this.h405d = json.getString("h405d");
            this.h406f = json.getString("h406f");
            this.h406fx = json.getString("h406fx");
            this.h406a = json.getString("h406a");
            this.h406b = json.getString("h406b");
            this.h406c = json.getString("h406c");
            this.h406d = json.getString("h406d");
            this.h406e = json.getString("h406e");

        }
    }

    public void sH5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h501 = json.getString("h501");
            this.h50196x = json.getString("h50196x");
            this.h502 = json.getString("h502");
            this.h503 = json.getString("h503");

        }
    }

    public void sH6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h601 = json.getString("h601");
            this.h602 = json.getString("h602");
            this.h603 = json.getString("h603");
            this.h604 = json.getString("h604");
            this.h605 = json.getString("h605");
            this.h606 = json.getString("h606");
            this.h607 = json.getString("h607 ");
            this.h608 = json.getString("h608");
            this.h609 = json.getString("h609");
            this.h610 = json.getString("h610");
            this.h611 = json.getString("h611");
            this.h612 = json.getString("h612");
            this.h613 = json.getString("h613");
            this.h614 = json.getString("h614");
            this.h615 = json.getString("h615");
            this.h616 = json.getString("h616");
            this.h617 = json.getString("h617");
            this.h618 = json.getString("h618");

        }
    }

    public void sH7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h701 = json.getString("h701");
            this.h701q = json.getString("h701q");
            this.h701s = json.getString("h701s");
            this.h702 = json.getString("h702");
            this.h702q = json.getString("h702q");
            this.h702s = json.getString("h702s");
            this.h703 = json.getString("h703");
            this.h703q = json.getString("h703q");
            this.h703s = json.getString("h703s");
            this.h704 = json.getString("h704");
            this.h704q = json.getString("h704q");
            this.h704s = json.getString("h704s");
            this.h705 = json.getString("h705");
            this.h705q = json.getString("h705q");
            this.h705s = json.getString("h705s");
            this.h706 = json.getString("h706");
            this.h706q = json.getString("h706q");
            this.h706s = json.getString("h706s");
            this.h707 = json.getString("h707");
            this.h707q = json.getString("h707q");
            this.h707s = json.getString("h707s");
            this.h708 = json.getString("h708");
            this.h708q = json.getString("h708q");
            this.h708s = json.getString("h708s");
            this.h709 = json.getString("h709");
            this.h709q = json.getString("h709q");
            this.h709s = json.getString("h709s");
            this.h710 = json.getString("h710");
            this.h710q = json.getString("h710q");
            this.h710s = json.getString("h710s");
            this.h711 = json.getString("h711");
            this.h711q = json.getString("h711q");
            this.h711s = json.getString("h711s");
            this.h712 = json.getString("h712");
            this.h712q = json.getString("h712q");
            this.h712s = json.getString("h712s");
            this.h713a = json.getString("h713a");
            this.h713b = json.getString("h713b");
            this.h713c = json.getString("h713c");
            this.h713d = json.getString("h713d");
            this.h714a = json.getString("h714a");
            this.h714b = json.getString("h714b");
            this.h714c = json.getString("h714c");
            this.h714d = json.getString("h714d");

        }
    }

    public void sW1aHydrate(String string) throws JSONException {
        Log.d(TAG, "sW1aHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w100name = json.getString("w100name");
            this.w101d = json.getString("w101d");
            this.w101m = json.getString("w101m");
            this.w101y = json.getString("w101y");
            this.w102 = json.getString("w102");
            this.w103 = json.getString("w103");
            this.w104 = json.getString("w104");
            this.w105 = json.getString("w105");
            this.w106 = json.getString("w106");
            this.w107 = json.getString("w107");
            this.w108 = json.getString("w108");
            this.w109 = json.getString("w109");
            this.w110 = json.getString("w110");
            this.w111 = json.getString("w111");
            this.w112 = json.getString("w112");

        }
    }

    public void sW2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w201 = json.getString("w201");
            this.w202 = json.getString("w202");
            this.w202a = json.getString("w202a");
            this.w202b = json.getString("w202b");
            this.w202c = json.getString("w202c");
            this.w202d = json.getString("w202d");
            this.w202e = json.getString("w202e");
            this.w202f = json.getString("w202f");
            this.w202g = json.getString("w202g");
            this.w202h = json.getString("w202h");
            this.w20296 = json.getString("w20296");
            this.w20296x = json.getString("w20296x");
            this.w203 = json.getString("w203");
            this.w203961x = json.getString("w203961x");
            this.w203962x = json.getString("w203962x");
            this.w203963x = json.getString("w203963x");
            this.w204 = json.getString("w204");
            this.w204wx = json.getString("w204wx");
            this.w204mx = json.getString("w204mx");
            this.w205 = json.getString("w205");
            this.w205ax = json.getString("w205ax");
            this.w206 = json.getString("w206");
            this.w20696x = json.getString("w20696x");
            this.w20601 = json.getString("w20601");
            this.w20602 = json.getString("w20602");
            this.w20603 = json.getString("w20603");
            this.w20604 = json.getString("w20604");
            this.w20605 = json.getString("w20605");
            this.w20606 = json.getString("w20606");
            this.w20607 = json.getString("w20607");
            this.w20608 = json.getString("w20608");
            this.w20696 = json.getString("w20696");
            this.w20697 = json.getString("w20697");
            this.w207 = json.getString("w207");
            this.w208 = json.getString("w208");
            this.w209 = json.getString("w209");
            this.w20996x = json.getString("w20996x");
            this.w210 = json.getString("w210");
            this.w210961 = json.getString("w210961");
            this.w210961x = json.getString("w210961x");
            this.w210962 = json.getString("w210962");
            this.w210962x = json.getString("w210962x");
            this.w210963 = json.getString("w210963");
            this.w210963x = json.getString("w210963x");
            this.w211 = json.getString("w211");
            this.w212 = json.getString("w212");
            this.w212mx = json.getString("w212mx");
            this.w212dx = json.getString("w212dx");
            this.w213 = json.getString("w213");
            this.w214 = json.getString("w214");
            this.w21496x = json.getString("w21496x");
            this.w215 = json.getString("w215");
            this.w215961 = json.getString("w215961");
            this.w215961x = json.getString("w215961x");
            this.w215962 = json.getString("w215962");
            this.w215962x = json.getString("w215962x");
            this.w215963 = json.getString("w215963");
            this.w215963x = json.getString("w215963x");
            this.w216 = json.getString("w216");
            this.w217 = json.getString("w217");
            this.w217mx = json.getString("w217mx");
            this.w217dx = json.getString("w217dx");
            this.w218 = json.getString("w218");
            this.w219 = json.getString("w219");
            this.w220 = json.getString("w220");
            this.w221 = json.getString("w221");
            this.w221mx = json.getString("w221mx");
            this.w221dx = json.getString("w221dx");
            this.w222 = json.getString("w222");
            this.w22296x = json.getString("w22296x");
            this.w223 = json.getString("w223");
            this.w223a = json.getString("w223a");
            this.w223b = json.getString("w223b");
            this.w223c = json.getString("w223c");
            this.w223d = json.getString("w223d");
            this.w223e = json.getString("w223e");
            this.w223f = json.getString("w223f");
            this.w223g = json.getString("w223g");
            this.w223h = json.getString("w223h");
            this.w224 = json.getString("w224");
            this.w225 = json.getString("w225");
            this.w226 = json.getString("w226");

        }
    }

    public void sW3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w301 = json.getString("w301");
            this.w30196x = json.getString("w30196x");
            this.w302 = json.getString("w302");
            this.w302a = json.getString("w302a");
            this.w302b = json.getString("w302b");
            this.w302c = json.getString("w302c");
            this.w302d = json.getString("w302d");
            this.w302e = json.getString("w302e");
            this.w302f = json.getString("w302f");
            this.w302g = json.getString("w302g");
            this.w30296 = json.getString("w30296");
            this.w30296x = json.getString("w30296x");
            this.w30299 = json.getString("w30299");
            this.w303 = json.getString("w303");
            this.w303961x = json.getString("w303961x");
            this.w303962x = json.getString("w303962x");
            this.w303963x = json.getString("w303963x");
            this.w304 = json.getString("w304");
            this.w305 = json.getString("w305");
            this.w306 = json.getString("w306");
            this.w307 = json.getString("w307");
            this.w307ax = json.getString("w307ax");
            this.w307bx = json.getString("w307bx");
            this.w308 = json.getString("w308");
            this.w309 = json.getString("w309");
            this.w310 = json.getString("w310");
            this.w311 = json.getString("w311");
            this.w311hx = json.getString("w311hx");
            this.w311dx = json.getString("w311dx");
            this.w312 = json.getString("w312");
            this.w313 = json.getString("w313");
            this.w31397 = json.getString("w31397");
            this.w313b = json.getString("w313b");
            this.w313c = json.getString("w313c");
            this.w313d = json.getString("w313d");
            this.w313e = json.getString("w313e");
            this.w31396 = json.getString("w31396");
            this.w31396x = json.getString("w31396x");
            this.w31398 = json.getString("w31398");
            this.w314 = json.getString("w314");
            this.w314961x = json.getString("w314961x");
            this.w314962x = json.getString("w314962x");
            this.w314963x = json.getString("w314963x");
            this.w315 = json.getString("w315");
            this.w316 = json.getString("w316");
            this.w316a = json.getString("w316a");
            this.w316b = json.getString("w316b");
            this.w316c = json.getString("w316c");
            this.w316d = json.getString("w316d");
            this.w316e = json.getString("w316e");
            this.w316f = json.getString("w316f");
            this.w316g = json.getString("w316g");
            this.w316h = json.getString("w316h");
            this.w31696 = json.getString("w31696");
            this.w31696x = json.getString("w31696x");
            this.w317 = json.getString("w317");
            this.w317hx = json.getString("w317hx");
            this.w317dx = json.getString("w317dx");
            this.w317wx = json.getString("w317wx");
            this.w318 = json.getString("w318");
            this.w319 = json.getString("w319");
            this.w319a = json.getString("w319a");
            this.w319b = json.getString("w319b");
            this.w319c = json.getString("w319c");
            this.w319d = json.getString("w319d");
            this.w319e = json.getString("w319e");
            this.w319f = json.getString("w319f");
            this.w319g = json.getString("w319g");
            this.w319h = json.getString("w319h");
            this.w31996 = json.getString("w31996");
            this.w31996x = json.getString("w31996x");
            this.w320 = json.getString("w320");
            this.w321 = json.getString("w321");
            this.w321a = json.getString("w321a");
            this.w321b = json.getString("w321b");
            this.w321c = json.getString("w321c");
            this.w321d = json.getString("w321d");
            this.w321e = json.getString("w321e");
            this.w321f = json.getString("w321f");
            this.w321g = json.getString("w321g");
            this.w321h = json.getString("w321h");
            this.w32196 = json.getString("w32196");
            this.w32196x = json.getString("w32196x");
            this.w322 = json.getString("w322");
            this.w322hx = json.getString("w322hx");
            this.w322dx = json.getString("w322dx");
            this.w322wx = json.getString("w322wx");
            this.w323 = json.getString("w323");
            this.w324 = json.getString("w324");
            this.w324a = json.getString("w324a");
            this.w324b = json.getString("w324b");
            this.w324c = json.getString("w324c");
            this.w324d = json.getString("w324d");
            this.w32496 = json.getString("w32496");
            this.w32496x = json.getString("w32496x");
            this.w325 = json.getString("w325");
            this.w326 = json.getString("w326");
            this.w327 = json.getString("w327");
            this.w32796x = json.getString("w32796x");

        }
    }

    public void sW4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w401 = json.getString("w401");
            this.w401a = json.getString("w401a");
            this.w401b = json.getString("w401b");
            this.w401c = json.getString("w401c");
            this.w401d = json.getString("w401d");
            this.w401e = json.getString("w401e");
            this.w401f = json.getString("w401f");
            this.w401g = json.getString("w401g");
            this.w40198 = json.getString("w40198");
            this.w402 = json.getString("w402");
            this.w402a = json.getString("w402a");
            this.w402b = json.getString("w402b");
            this.w402c = json.getString("w402c");
            this.w402d = json.getString("w402d");
            this.w402e = json.getString("w402e");
            this.w402f = json.getString("w402f");
            this.w402g = json.getString("w402g");
            this.w40298 = json.getString("w40298");
            this.w403 = json.getString("w403");
            this.w403a = json.getString("w403a");
            this.w403b = json.getString("w403b");
            this.w403c = json.getString("w403c");
            this.w403d = json.getString("w403d");
            this.w403e = json.getString("w403e");
            this.w403f = json.getString("w403f");
            this.w403g = json.getString("w403g");
            this.w40398 = json.getString("w40398");
            this.w404 = json.getString("w404");
            this.w404a = json.getString("w404a");
            this.w404b = json.getString("w404b");
            this.w404c = json.getString("w404c");
            this.w404d = json.getString("w404d");
            this.w404e = json.getString("w404e");
            this.w404f = json.getString("w404f");
            this.w404g = json.getString("w404g");
            this.w40498 = json.getString("w40498");
            this.w405 = json.getString("w405");
            this.w405a = json.getString("w405a");
            this.w405b = json.getString("w405b");
            this.w405c = json.getString("w405c");
            this.w405d = json.getString("w405d");
            this.w405e = json.getString("w405e");
            this.w405f = json.getString("w405f");
            this.w405g = json.getString("w405g");
            this.w40598 = json.getString("w40598");
            this.w406 = json.getString("w406");
            this.w406a = json.getString("w406a");
            this.w406b = json.getString("w406b");
            this.w406c = json.getString("w406c");
            this.w406d = json.getString("w406d");
            this.w406e = json.getString("w406e");
            this.w406f = json.getString("w406f");
            this.w406g = json.getString("w406g");
            this.w40698 = json.getString("w40698");
            this.w407 = json.getString("w407");
            this.w407a = json.getString("w407a");
            this.w407b = json.getString("w407b");
            this.w407c = json.getString("w407c");
            this.w407d = json.getString("w407d");
            this.w407e = json.getString("w407e");
            this.w407f = json.getString("w407f");
            this.w407g = json.getString("w407g");
            this.w40798 = json.getString("w40798");
            this.w408 = json.getString("w408");
            this.w408a = json.getString("w408a");
            this.w408b = json.getString("w408b");
            this.w408c = json.getString("w408c");
            this.w408d = json.getString("w408d");
            this.w408e = json.getString("w408e");
            this.w408f = json.getString("w408f");
            this.w408g = json.getString("w408g");
            this.w40898 = json.getString("w40898");
            this.w409 = json.getString("w409");
            this.w409a = json.getString("w409a");
            this.w409b = json.getString("w409b");
            this.w409c = json.getString("w409c");
            this.w409d = json.getString("w409d");
            this.w409e = json.getString("w409e");
            this.w409f = json.getString("w409f");
            this.w409g = json.getString("w409g");
            this.w40998 = json.getString("w40998");
            this.w410 = json.getString("w410");
            this.w410a = json.getString("w410a");
            this.w410b = json.getString("w410b");
            this.w410c = json.getString("w410c");
            this.w410d = json.getString("w410d");
            this.w410e = json.getString("w410e");
            this.w410f = json.getString("w410f");
            this.w410g = json.getString("w410g");
            this.w41098 = json.getString("w41098");

        }
    }

    public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c100name = json.getString("c100name");
            this.c101 = json.getString("c101");
            this.c102 = json.getString("c102");
            this.c103 = json.getString("c103");
            this.c104 = json.getString("c104");
            this.c105 = json.getString("c105");
            this.c106a = json.getString("c106a");
            this.c106b = json.getString("c106b");
            this.c106ca = json.getString("c106ca");
            this.c106d = json.getString("c106d");
            this.c106ea = json.getString("c106ea");
            this.c106f = json.getString("c106f");
            this.c106g = json.getString("c106g");
            this.c106ha = json.getString("c106ha");
            this.c106i = json.getString("c106i");
            this.c106j = json.getString("c106j");
            this.c106k = json.getString("c106k");
            this.c106l = json.getString("c106l");
            this.c106m = json.getString("c106m");
            this.c106n = json.getString("c106n");
            this.c106o = json.getString("c106o");
            this.c106p = json.getString("c106p");
            this.c106q = json.getString("c106q");
            this.c107a = json.getString("c107a");
            this.c107b = json.getString("c107b");
            this.c107c = json.getString("c107c");
            this.c107d = json.getString("c107d");
            this.c107e = json.getString("c107e");
            this.c107f = json.getString("c107f");
            this.c107g = json.getString("c107g");
            this.c107h = json.getString("c107h");
            this.c107j = json.getString("c107j");
            this.c107i = json.getString("c107i");
            this.c107k = json.getString("c107k");
            this.c107l = json.getString("c107l");
            this.c107m = json.getString("c107m");
            this.c107n = json.getString("c107n");
            this.c107o = json.getString("c107o");
            this.c107p = json.getString("c107p");
            this.c107q = json.getString("c107q");
            this.c107r = json.getString("c107r");
            this.c107s = json.getString("c107s");
            this.c108 = json.getString("c108");
            this.c108t1 = json.getString("c108t1");
            this.c109 = json.getString("c109");

        }
    }

    public void sC2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c201 = json.getString("c201");
            this.c202 = json.getString("c202");
            this.c20301a = json.getString("c20301a");
            this.c20301b = json.getString("c20301b");
            this.c20301ba = json.getString("c20301ba");
            this.c20301bb = json.getString("c20301bb");
            this.c20301bc = json.getString("c20301bc");
            this.c20301bd = json.getString("c20301bd");
            this.c20301be = json.getString("c20301be");
            this.c20301bf = json.getString("c20301bf");
            this.c20301bg = json.getString("c20301bg");
            this.c20302a = json.getString("c20302a");
            this.c20302b = json.getString("c20302b");
            this.c20302ba = json.getString("c20302ba");
            this.c20302bb = json.getString("c20302bb");
            this.c20302bc = json.getString("c20302bc");
            this.c20302bd = json.getString("c20302bd");
            this.c20302be = json.getString("c20302be");
            this.c20302bf = json.getString("c20302bf");
            this.c20302bg = json.getString("c20302bg");
            this.c20303a = json.getString("c20303a");
            this.c20303b = json.getString("c20303b");
            this.c20303ba = json.getString("c20303ba");
            this.c20303bb = json.getString("c20303bb");
            this.c20303bc = json.getString("c20303bc");
            this.c20303bd = json.getString("c20303bd");
            this.c20303be = json.getString("c20303be");
            this.c20303bf = json.getString("c20303bf");
            this.c20303bg = json.getString("c20303bg");
            this.c20304a = json.getString("c20304a");
            this.c20304b = json.getString("c20304b");
            this.c20304ba = json.getString("c20304ba");
            this.c20304bb = json.getString("c20304bb");
            this.c20304bc = json.getString("c20304bc");
            this.c20304bd = json.getString("c20304bd");
            this.c20304be = json.getString("c20304be");
            this.c20304bf = json.getString("c20304bf");
            this.c20304bg = json.getString("c20304bg");
            this.c20305a = json.getString("c20305a");
            this.c20305b = json.getString("c20305b");
            this.c20305ba = json.getString("c20305ba");
            this.c20305bb = json.getString("c20305bb");
            this.c20305bc = json.getString("c20305bc");
            this.c20305bd = json.getString("c20305bd");
            this.c20305be = json.getString("c20305be");
            this.c20305bf = json.getString("c20305bf");
            this.c20305bg = json.getString("c20305bg");
            this.c20306a = json.getString("c20306a");
            this.c20306b = json.getString("c20306b");
            this.c20306ba = json.getString("c20306ba");
            this.c20306bb = json.getString("c20306bb");
            this.c20306bc = json.getString("c20306bc");
            this.c20306bd = json.getString("c20306bd");
            this.c20306be = json.getString("c20306be");
            this.c20306bf = json.getString("c20306bf");
            this.c20306bg = json.getString("c20306bg");
            this.c20307a = json.getString("c20307a");
            this.c20307b = json.getString("c20307b");
            this.c20307ba = json.getString("c20307ba");
            this.c20307bb = json.getString("c20307bb");
            this.c20307bc = json.getString("c20307bc");
            this.c20307bd = json.getString("c20307bd");
            this.c20307be = json.getString("c20307be");
            this.c20307bf = json.getString("c20307bf");
            this.c20307bg = json.getString("c20307bg");
            this.c20308a = json.getString("c20308a");
            this.c20308b = json.getString("c20308b");
            this.c20308ba = json.getString("c20308ba");
            this.c20308bb = json.getString("c20308bb");
            this.c20308bc = json.getString("c20308bc");
            this.c20308bd = json.getString("c20308bd");
            this.c20308be = json.getString("c20308be");
            this.c20308bf = json.getString("c20308bf");
            this.c20308bg = json.getString("c20308bg");
            this.c20309a = json.getString("c20309a");
            this.c20309b = json.getString("c20309b");
            this.c20309ba = json.getString("c20309ba");
            this.c20309bb = json.getString("c20309bb");
            this.c20309bc = json.getString("c20309bc");
            this.c20309bd = json.getString("c20309bd");
            this.c20309be = json.getString("c20309be");
            this.c20309bf = json.getString("c20309bf");
            this.c20309bg = json.getString("c20309bg");
            this.c20310a = json.getString("c20310a");
            this.c20310b = json.getString("c20310b");
            this.c20310ba = json.getString("c20310ba");
            this.c20310bb = json.getString("c20310bb");
            this.c20310bc = json.getString("c20310bc");
            this.c20310bd = json.getString("c20310bd");
            this.c20310be = json.getString("c20310be");
            this.c20310bf = json.getString("c20310bf");
            this.c20310bg = json.getString("c20310bg");
            this.c20311a = json.getString("c20311a");
            this.c20311b = json.getString("c20311b");
            this.c20311ba = json.getString("c20311ba");
            this.c20311bb = json.getString("c20311bb");
            this.c20311bc = json.getString("c20311bc");
            this.c20311bd = json.getString("c20311bd");
            this.c20311be = json.getString("c20311be");
            this.c20311bf = json.getString("c20311bf");
            this.c20311bg = json.getString("c20311bg");
            this.c20312a = json.getString("c20312a");
            this.c20312b = json.getString("c20312b");
            this.c20312ba = json.getString("c20312ba");
            this.c20312bb = json.getString("c20312bb");
            this.c20312bc = json.getString("c20312bc");
            this.c20312bd = json.getString("c20312bd");
            this.c20312be = json.getString("c20312be");
            this.c20312bf = json.getString("c20312bf");
            this.c20312bg = json.getString("c20312bg");
            this.c20313a = json.getString("c20313a");
            this.c20313b = json.getString("c20313b");
            this.c20313ba = json.getString("c20313ba");
            this.c20313bb = json.getString("c20313bb");
            this.c20313bc = json.getString("c20313bc");
            this.c20313bd = json.getString("c20313bd");
            this.c20313be = json.getString("c20313be");
            this.c20313bf = json.getString("c20313bf");
            this.c20313bg = json.getString("c20313bg");
            this.c20314a = json.getString("c20314a");
            this.c20314b = json.getString("c20314b");
            this.c20314ba = json.getString("c20314ba");
            this.c20314bb = json.getString("c20314bb");
            this.c20314bc = json.getString("c20314bc");
            this.c20314bd = json.getString("c20314bd");
            this.c20314be = json.getString("c20314be");
            this.c20314bf = json.getString("c20314bf");
            this.c20314bg = json.getString("c20314bg");
            this.c20315a = json.getString("c20315a");
            this.c20315b = json.getString("c20315b");
            this.c20315ba = json.getString("c20315ba");
            this.c20315bb = json.getString("c20315bb");
            this.c20315bc = json.getString("c20315bc");
            this.c20315bd = json.getString("c20315bd");
            this.c20315be = json.getString("c20315be");
            this.c20315bf = json.getString("c20315bf");
            this.c20315bg = json.getString("c20315bg");
            this.c20316a = json.getString("c20316a");
            this.c20316b = json.getString("c20316b");
            this.c20316ba = json.getString("c20316ba");
            this.c20316bb = json.getString("c20316bb");
            this.c20316bc = json.getString("c20316bc");
            this.c20316bd = json.getString("c20316bd");
            this.c20316be = json.getString("c20316be");
            this.c20316bf = json.getString("c20316bf");
            this.c20316bg = json.getString("c20316bg");
            this.c20317a = json.getString("c20317a");
            this.c20317b = json.getString("c20317b");
            this.c20317ba = json.getString("c20317ba");
            this.c20317bb = json.getString("c20317bb");
            this.c20317bc = json.getString("c20317bc");
            this.c20317bd = json.getString("c20317bd");
            this.c20317be = json.getString("c20317be");
            this.c20317bf = json.getString("c20317bf");
            this.c20317bg = json.getString("c20317bg");
            this.c204 = json.getString("c204");

        }
    }

    public void sC3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c301 = json.getString("c301");
            this.c302 = json.getString("c302");
            this.c303 = json.getString("c303");
            this.c30396x = json.getString("c30396x");
            this.c304 = json.getString("c304");
            this.c304961x = json.getString("c304961x");
            this.c304962x = json.getString("c304962x");
            this.c304963x = json.getString("c304963x");
            this.c305 = json.getString("c305");
            this.c305a = json.getString("c305a");
            this.c305b = json.getString("c305b");
            this.c305c = json.getString("c305c");
            this.c305d = json.getString("c305d");
            this.c305e = json.getString("c305e");
            this.c305f = json.getString("c305f");
            this.c305g = json.getString("c305g");
            this.c305h = json.getString("c305h");
            this.c305i = json.getString("c305i");
            this.c305j = json.getString("c305j");
            this.c30596 = json.getString("c30596");
            this.c30596x = json.getString("c30596x");
            this.c306 = json.getString("c306");
            this.c307 = json.getString("c307");
            this.c308 = json.getString("c308");
            this.c30896x = json.getString("c30896x");
            this.c309 = json.getString("c309");
            this.c309961x = json.getString("c309961x");
            this.c309962x = json.getString("c309962x");
            this.c309963x = json.getString("c309963x");
            this.c310 = json.getString("c310");
            this.c310a = json.getString("c310a");
            this.c310b = json.getString("c310b");
            this.c310c = json.getString("c310c");
            this.c310d = json.getString("c310d");
            this.c310e = json.getString("c310e");
            this.c310f = json.getString("c310f");
            this.c310g = json.getString("c310g");
            this.c31096 = json.getString("c31096");
            this.c31096x = json.getString("c31096x");
            this.c311 = json.getString("c311");
            this.c312 = json.getString("c312");
            this.c313 = json.getString("c313");
            this.c31396x = json.getString("c31396x");
            this.c314 = json.getString("c314");
            this.c314961x = json.getString("c314961x");
            this.c314962x = json.getString("c314962x");
            this.c314963x = json.getString("c314963x");
            this.c315 = json.getString("c315");
            this.c315a = json.getString("c315a");
            this.c315b = json.getString("c315b");
            this.c315c = json.getString("c315c");
            this.c315d = json.getString("c315d");
            this.c315e = json.getString("c315e");
            this.c315f = json.getString("c315f");
            this.c315g = json.getString("c315g");
            this.c315h = json.getString("c315h");
            this.c31596 = json.getString("c31596");
            this.c31596x = json.getString("c31596x");
            this.c316 = json.getString("c316");
            this.c317 = json.getString("c317");
            this.c318 = json.getString("c318");
            this.c319 = json.getString("c319");
            this.c320 = json.getString("c320");
            this.c321 = json.getString("c321");
            this.c322 = json.getString("c322");
            this.c323 = json.getString("c323");
            this.c323mx = json.getString("c323mx");
            this.c323dx = json.getString("c323dx");

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
                .put("h106d", h106)
                /*   .put("h106m", h106m)
                       .put("h106y", h106y)*/
                .put("h107", h107)
                /*    .put("h107m", h107m)*/
                .put("h108", h108)
                .put("h109", h109)
                .put("h110", h110)
                .put("h111", h111)
                .put("h112", h112)
                .put("h11296x", h11296x)
                .put("h201", h201)
                .put("h202", h202)
                .put("h203d", h203d)
                .put("h203m", h203m)
                .put("h203y", h203y)
                .put("h204", h204)
                .put("h205", h205)
                .put("h206", h206)
                .put("h207", h207)
                .put("h208", h208);

        return json.toString();
    }

    public String sH2btoString() throws JSONException {
        Log.d(TAG, "sH2btoString: ");
        JSONObject json = new JSONObject();
        json.put("h209t", h209t)
                .put("h209m", h209m)
                .put("h209f", h209f)
                .put("h210", h210)
                .put("h211t", h211t)
                .put("h211m", h211m)
                .put("h211f", h211f)
                .put("h212", h212)
                .put("h213t", h213t)
                .put("h213m", h213m)
                .put("h213f", h213f)
                .put("h214", h214)
                .put("h215t", h215t)
                .put("h215m", h215m)
                .put("h215f", h215f)
                .put("h216", h216)
                .put("h217t", h217t)
                .put("h217m", h217m)
                .put("h217f", h217f)
                .put("h218", h218)
                .put("h219t", h219t)
                .put("h219m", h219m)
                .put("h219f", h219f)
                .put("h220a", h220a)
                .put("h220b", h220b)
                .put("h220c", h220c);

        return json.toString();
    }

    public String sH3atoString() throws JSONException {
        Log.d(TAG, "sH3atoString: ");
        JSONObject json = new JSONObject();
        json.put("h301", h301)
                .put("h30196x", h30196x)
                .put("h302", h302)
                .put("h30296x", h30296x)
                .put("h303", h303)
                .put("h30396x", h30396x)
                .put("h304", h304)
                .put("h305", h305)
                .put("h306", h306)
                .put("h30696x", h30696x)
                .put("h307", h307)
                .put("h30796x", h30796x)
                .put("h308", h308)
                .put("h309", h309)
                .put("h310", h310)
                .put("h31096x", h31096x)
                .put("h311a", h311a)
                .put("h311b", h311b)
                .put("h311c", h311c)
                .put("h311d", h311d)
                .put("h311e", h311e)
                .put("h311f", h311f)
                .put("h311g", h311g)
                .put("h311h", h311h)
                .put("h311i", h311i)
                .put("h311j", h311j)
                .put("h311k", h311k)
                .put("h311l", h311l)
                .put("h311m", h311m)
                .put("h311n", h311n)
                .put("h311o", h311o)
                .put("h311p", h311p)
                .put("h311q", h311q)
                .put("h311r", h311r)
                .put("h311s", h311s)
                .put("h312a", h312a)
                .put("h312b", h312b)
                .put("h312c", h312c)
                .put("h312d", h312d)
                .put("h312e", h312e)
                .put("h312f", h312f)
                .put("h312g", h312g);

        return json.toString();
    }

    public String sH3btoString() throws JSONException {
        Log.d(TAG, "sH3btoString: ");
        JSONObject json = new JSONObject();
        json.put("h313", h313)
                .put("h313a", h313a)
                .put("h313b", h313b)
                .put("h313c", h313c)
                .put("h313d", h313d)
                .put("h313e", h313e)
                .put("h313f", h313f)
                .put("h31396", h31396)
                .put("h31396x", h31396x)
                .put("h314", h314)
                .put("h31496x", h31496x)
                .put("h315", h315)
                .put("h31596x", h31596x)
                .put("h316", h316)
                .put("h317", h317)
                .put("h31796x", h31796x)
                .put("h318", h318)
                .put("h31896x", h31896x)
                .put("h319", h319)
                .put("h31996x", h31996x)
                .put("h320", h320)
                .put("h321", h321)
                .put("h322", h322)
                .put("h322ax", h322ax)
                .put("h322bx", h322bx)
                .put("h323", h323)
                .put("h324", h324)
                .put("h3241", h3241)
                .put("h3241x", h3241x)
                .put("h3242", h3242)
                .put("h3242x", h3242x)
                .put("h3243", h3243)
                .put("h3243x", h3243x)
                .put("h3244", h3244)
                .put("h3244x", h3244x)
                .put("h3245", h3245)
                .put("h3245x", h3245x)
                .put("h3246", h3246)
                .put("h3246x", h3246x)
                .put("h3247", h3247)
                .put("h3247x", h3247x);

        return json.toString();
    }

    public String sH4toString() throws JSONException {
        Log.d(TAG, "sH4toString: ");
        JSONObject json = new JSONObject();
        json.put("h401", h401)
                .put("h402", h402)
                .put("h403", h403)
                .put("h403a", h403a)
                .put("h403b", h403b)
                .put("h403c", h403c)
                .put("h403d", h403d)
                .put("h404", h404)
                .put("h405", h405)
                .put("h405a", h405a)
                .put("h405b", h405b)
                .put("h405c", h405c)
                .put("h405d", h405d)
                .put("h406f", h406f)
                .put("h406fx", h406fx)
                .put("h406a", h406a)
                .put("h406b", h406b)
                .put("h406c", h406c)
                .put("h406d", h406d)
                .put("h406e", h406e);

        return json.toString();
    }

    public String sH5toString() throws JSONException {
        Log.d(TAG, "sH5toString: ");
        JSONObject json = new JSONObject();
        json.put("h501", h501)
                .put("h50196x", h50196x)
                .put("h502", h502)
                .put("h503", h503);

        return json.toString();
    }

    public String sH6toString() throws JSONException {
        Log.d(TAG, "sH6toString: ");
        JSONObject json = new JSONObject();
        json.put("h601", h601)
                .put("h602", h602)
                .put("h603", h603)
                .put("h604", h604)
                .put("h605", h605)
                .put("h606", h606)
                .put("h607 ", h607)
                .put("h608", h608)
                .put("h609", h609)
                .put("h610", h610)
                .put("h611", h611)
                .put("h612", h612)
                .put("h613", h613)
                .put("h614", h614)
                .put("h615", h615)
                .put("h616", h616)
                .put("h617", h617)
                .put("h618", h618);

        return json.toString();
    }

    public String sH7toString() throws JSONException {
        Log.d(TAG, "sH7toString: ");
        JSONObject json = new JSONObject();
        json.put("h701", h701)
                .put("h701q", h701q)
                .put("h701s", h701s)
                .put("h702", h702)
                .put("h702q", h702q)
                .put("h702s", h702s)
                .put("h703", h703)
                .put("h703q", h703q)
                .put("h703s", h703s)
                .put("h704", h704)
                .put("h704q", h704q)
                .put("h704s", h704s)
                .put("h705", h705)
                .put("h705q", h705q)
                .put("h705s", h705s)
                .put("h706", h706)
                .put("h706q", h706q)
                .put("h706s", h706s)
                .put("h707", h707)
                .put("h707q", h707q)
                .put("h707s", h707s)
                .put("h708", h708)
                .put("h708q", h708q)
                .put("h708s", h708s)
                .put("h709", h709)
                .put("h709q", h709q)
                .put("h709s", h709s)
                .put("h710", h710)
                .put("h710q", h710q)
                .put("h710s", h710s)
                .put("h711", h711)
                .put("h711q", h711q)
                .put("h711s", h711s)
                .put("h712", h712)
                .put("h712q", h712q)
                .put("h712s", h712s)
                .put("h713a", h713a)
                .put("h713b", h713b)
                .put("h713c", h713c)
                .put("h713d", h713d)
                .put("h714a", h714a)
                .put("h714b", h714b)
                .put("h714c", h714c)
                .put("h714d", h714d);

        return json.toString();
    }

    public String sW1atoString() throws JSONException {
        Log.d(TAG, "sW1atoString: ");
        JSONObject json = new JSONObject();
        json.put("w101d", w101d)

                .put("w100name", w100name)
                .put("w101m", w101m)
                .put("w101y", w101y)
                .put("w102", w102)
                .put("w103", w103)
                .put("w104", w104)
                .put("w105", w105)
                .put("w106", w106)
                .put("w107", w107)
                .put("w108", w108)
                .put("w109", w109)
                .put("w110", w110)
                .put("w111", w111)
                .put("w112", w112);

        return json.toString();
    }

    public String sW2toString() throws JSONException {
        Log.d(TAG, "sW2toString: ");
        JSONObject json = new JSONObject();
        json.put("w201", w201)
                .put("w202", w202)
                .put("w202a", w202a)
                .put("w202b", w202b)
                .put("w202c", w202c)
                .put("w202d", w202d)
                .put("w202e", w202e)
                .put("w202f", w202f)
                .put("w202g", w202g)
                .put("w202h", w202h)
                .put("w20296", w20296)
                .put("w20296x", w20296x)
                .put("w203", w203)
                .put("w203961x", w203961x)
                .put("w203962x", w203962x)
                .put("w203963x", w203963x)
                .put("w204", w204)
                .put("w204wx", w204wx)
                .put("w204mx", w204mx)
                .put("w205", w205)
                .put("w205ax", w205ax)
                .put("w206", w206)
                .put("w20696x", w20696x)
                .put("w20601", w20601)
                .put("w20602", w20602)
                .put("w20603", w20603)
                .put("w20604", w20604)
                .put("w20605", w20605)
                .put("w20606", w20606)
                .put("w20607", w20607)
                .put("w20608", w20608)
                .put("w20696", w20696)
                .put("w20697", w20697)
                .put("w207", w207)
                .put("w208", w208)
                .put("w209", w209)
                .put("w20996x", w20996x)
                .put("w210", w210)
                .put("w210961", w210961)
                .put("w210961x", w210961x)
                .put("w210962", w210962)
                .put("w210962x", w210962x)
                .put("w210963", w210963)
                .put("w210963x", w210963x)
                .put("w211", w211)
                .put("w212", w212)
                .put("w212mx", w212mx)
                .put("w212dx", w212dx)
                .put("w213", w213)
                .put("w214", w214)
                .put("w21496x", w21496x)
                .put("w215", w215)
                .put("w215961", w215961)
                .put("w215961x", w215961x)
                .put("w215962", w215962)
                .put("w215962x", w215962x)
                .put("w215963", w215963)
                .put("w215963x", w215963x)
                .put("w216", w216)
                .put("w217", w217)
                .put("w217mx", w217mx)
                .put("w217dx", w217dx)
                .put("w218", w218)
                .put("w219", w219)
                .put("w220", w220)
                .put("w221", w221)
                .put("w221mx", w221mx)
                .put("w221dx", w221dx)
                .put("w222", w222)
                .put("w22296x", w22296x)
                .put("w223", w223)
                .put("w223a", w223a)
                .put("w223b", w223b)
                .put("w223c", w223c)
                .put("w223d", w223d)
                .put("w223e", w223e)
                .put("w223f", w223f)
                .put("w223g", w223g)
                .put("w223h", w223h)
                .put("w224", w224)
                .put("w225", w225)
                .put("w226", w226);

        return json.toString();
    }

    public String sW3toString() throws JSONException {
        Log.d(TAG, "sW3toString: ");
        JSONObject json = new JSONObject();

        json.put("w301", w301)
                .put("w30196x", w30196x)
                .put("w302", w302)
                .put("w302a", w302a)
                .put("w302b", w302b)
                .put("w302c", w302c)
                .put("w302d", w302d)
                .put("w302e", w302e)
                .put("w302f", w302f)
                .put("w302g", w302g)
                .put("w30296", w30296)
                .put("w30296x", w30296x)
                .put("w30299", w30299)
                .put("w303", w303)
                .put("w303961x", w303961x)
                .put("w303962x", w303962x)
                .put("w303963x", w303963x)
                .put("w304", w304)
                .put("w305", w305)
                .put("w306", w306)
                .put("w307", w307)
                .put("w307ax", w307ax)
                .put("w307bx", w307bx)
                .put("w308", w308)
                .put("w309", w309)
                .put("w310", w310)
                .put("w311", w311)
                .put("w311hx", w311hx)
                .put("w311dx", w311dx)
                .put("w312", w312)
                .put("w313", w313)
                .put("w31397", w31397)
                .put("w313b", w313b)
                .put("w313c", w313c)
                .put("w313d", w313d)
                .put("w313e", w313e)
                .put("w31396", w31396)
                .put("w31396x", w31396x)
                .put("w31398", w31398)
                .put("w314", w314)
                .put("w314961x", w314961x)
                .put("w314962x", w314962x)
                .put("w314963x", w314963x)
                .put("w315", w315)
                .put("w316", w316)
                .put("w316a", w316a)
                .put("w316b", w316b)
                .put("w316c", w316c)
                .put("w316d", w316d)
                .put("w316e", w316e)
                .put("w316f", w316f)
                .put("w316g", w316g)
                .put("w316h", w316h)
                .put("w31696", w31696)
                .put("w31696x", w31696x)
                .put("w317", w317)
                .put("w317hx", w317hx)
                .put("w317dx", w317dx)
                .put("w317wx", w317wx)
                .put("w318", w318)
                .put("w319", w319)
                .put("w319a", w319a)
                .put("w319b", w319b)
                .put("w319c", w319c)
                .put("w319d", w319d)
                .put("w319e", w319e)
                .put("w319f", w319f)
                .put("w319g", w319g)
                .put("w319h", w319h)
                .put("w31996", w31996)
                .put("w31996x", w31996x)
                .put("w320", w320)
                .put("w321", w321)
                .put("w321a", w321a)
                .put("w321b", w321b)
                .put("w321c", w321c)
                .put("w321d", w321d)
                .put("w321e", w321e)
                .put("w321f", w321f)
                .put("w321g", w321g)
                .put("w321h", w321h)
                .put("w32196", w32196)
                .put("w32196x", w32196x)
                .put("w322", w322)
                .put("w322hx", w322hx)
                .put("w322dx", w322dx)
                .put("w322wx", w322wx)
                .put("w323", w323)
                .put("w324", w324)
                .put("w324a", w324a)
                .put("w324b", w324b)
                .put("w324c", w324c)
                .put("w324d", w324d)
                .put("w32496", w32496)
                .put("w32496x", w32496x)
                .put("w325", w325)
                .put("w326", w326)
                .put("w327", w327)
                .put("w32796x", w32796x);

        return json.toString();
    }

    public String sW4toString() throws JSONException {
        Log.d(TAG, "sW4toString: ");
        JSONObject json = new JSONObject();

        json.put("w401", w401)
                .put("w401a", w401a)
                .put("w401b", w401b)
                .put("w401c", w401c)
                .put("w401d", w401d)
                .put("w401e", w401e)
                .put("w401f", w401f)
                .put("w401g", w401g)
                .put("w40198", w40198)
                .put("w402", w402)
                .put("w402a", w402a)
                .put("w402b", w402b)
                .put("w402c", w402c)
                .put("w402d", w402d)
                .put("w402e", w402e)
                .put("w402f", w402f)
                .put("w402g", w402g)
                .put("w40298", w40298)
                .put("w403", w403)
                .put("w403a", w403a)
                .put("w403b", w403b)
                .put("w403c", w403c)
                .put("w403d", w403d)
                .put("w403e", w403e)
                .put("w403f", w403f)
                .put("w403g", w403g)
                .put("w40398", w40398)
                .put("w404", w404)
                .put("w404a", w404a)
                .put("w404b", w404b)
                .put("w404c", w404c)
                .put("w404d", w404d)
                .put("w404e", w404e)
                .put("w404f", w404f)
                .put("w404g", w404g)
                .put("w40498", w40498)
                .put("w405", w405)
                .put("w405a", w405a)
                .put("w405b", w405b)
                .put("w405c", w405c)
                .put("w405d", w405d)
                .put("w405e", w405e)
                .put("w405f", w405f)
                .put("w405g", w405g)
                .put("w40598", w40598)
                .put("w406", w406)
                .put("w406a", w406a)
                .put("w406b", w406b)
                .put("w406c", w406c)
                .put("w406d", w406d)
                .put("w406e", w406e)
                .put("w406f", w406f)
                .put("w406g", w406g)
                .put("w40698", w40698)
                .put("w407", w407)
                .put("w407a", w407a)
                .put("w407b", w407b)
                .put("w407c", w407c)
                .put("w407d", w407d)
                .put("w407e", w407e)
                .put("w407f", w407f)
                .put("w407g", w407g)
                .put("w40798", w40798)
                .put("w408", w408)
                .put("w408a", w408a)
                .put("w408b", w408b)
                .put("w408c", w408c)
                .put("w408d", w408d)
                .put("w408e", w408e)
                .put("w408f", w408f)
                .put("w408g", w408g)
                .put("w40898", w40898)
                .put("w409", w409)
                .put("w409a", w409a)
                .put("w409b", w409b)
                .put("w409c", w409c)
                .put("w409d", w409d)
                .put("w409e", w409e)
                .put("w409f", w409f)
                .put("w409g", w409g)
                .put("w40998", w40998)
                .put("w410", w410)
                .put("w410a", w410a)
                .put("w410b", w410b)
                .put("w410c", w410c)
                .put("w410d", w410d)
                .put("w410e", w410e)
                .put("w410f", w410f)
                .put("w410g", w410g)
                .put("w41098", w41098);

        return json.toString();
    }

    public String sC1toString() throws JSONException {
        Log.d(TAG, "sC1toString: ");
        JSONObject json = new JSONObject();

        json.put("c101", c101)
                .put("c102", c102)
                .put("c100name", c100name)
                .put("c103", c103)
                .put("c104", c104)
                .put("c105", c105)
                .put("c106a", c106a)
                .put("c106b", c106b)
                .put("c106ca", c106ca)
                .put("c106d", c106d)
                .put("c106ea", c106ea)
                .put("c106f", c106f)
                .put("c106g", c106g)
                .put("c106ha", c106ha)
                .put("c106i", c106i)
                .put("c106j", c106j)
                .put("c106k", c106k)
                .put("c106l", c106l)
                .put("c106m", c106m)
                .put("c106n", c106n)
                .put("c106o", c106o)
                .put("c106p", c106p)
                .put("c106q", c106q)
                .put("c107a", c107a)
                .put("c107b", c107b)
                .put("c107c", c107c)
                .put("c107d", c107d)
                .put("c107e", c107e)
                .put("c107f", c107f)
                .put("c107g", c107g)
                .put("c107h", c107h)
                .put("c107j", c107j)
                .put("c107i", c107i)
                .put("c107k", c107k)
                .put("c107l", c107l)
                .put("c107m", c107m)
                .put("c107n", c107n)
                .put("c107o", c107o)
                .put("c107p", c107p)
                .put("c107q", c107q)
                .put("c107r", c107r)
                .put("c107s", c107s)
                .put("c108", c108)
                .put("c108t1", c108t1)
                .put("c109", c109);

        return json.toString();
    }

    public String sC2toString() throws JSONException {
        Log.d(TAG, "sC2toString: ");
        JSONObject json = new JSONObject();

        json.put("c201", c201)
                .put("c202", c202)
                .put("c20301a", c20301a)
                .put("c20301b", c20301b)
                .put("c20301ba", c20301ba)
                .put("c20301bb", c20301bb)
                .put("c20301bc", c20301bc)
                .put("c20301bd", c20301bd)
                .put("c20301be", c20301be)
                .put("c20301bf", c20301bf)
                .put("c20301bg", c20301bg)
                .put("c20302a", c20302a)
                .put("c20302b", c20302b)
                .put("c20302ba", c20302ba)
                .put("c20302bb", c20302bb)
                .put("c20302bc", c20302bc)
                .put("c20302bd", c20302bd)
                .put("c20302be", c20302be)
                .put("c20302bf", c20302bf)
                .put("c20302bg", c20302bg)
                .put("c20303a", c20303a)
                .put("c20303b", c20303b)
                .put("c20303ba", c20303ba)
                .put("c20303bb", c20303bb)
                .put("c20303bc", c20303bc)
                .put("c20303bd", c20303bd)
                .put("c20303be", c20303be)
                .put("c20303bf", c20303bf)
                .put("c20303bg", c20303bg)
                .put("c20304a", c20304a)
                .put("c20304b", c20304b)
                .put("c20304ba", c20304ba)
                .put("c20304bb", c20304bb)
                .put("c20304bc", c20304bc)
                .put("c20304bd", c20304bd)
                .put("c20304be", c20304be)
                .put("c20304bf", c20304bf)
                .put("c20304bg", c20304bg)
                .put("c20305a", c20305a)
                .put("c20305b", c20305b)
                .put("c20305ba", c20305ba)
                .put("c20305bb", c20305bb)
                .put("c20305bc", c20305bc)
                .put("c20305bd", c20305bd)
                .put("c20305be", c20305be)
                .put("c20305bf", c20305bf)
                .put("c20305bg", c20305bg)
                .put("c20306a", c20306a)
                .put("c20306b", c20306b)
                .put("c20306ba", c20306ba)
                .put("c20306bb", c20306bb)
                .put("c20306bc", c20306bc)
                .put("c20306bd", c20306bd)
                .put("c20306be", c20306be)
                .put("c20306bf", c20306bf)
                .put("c20306bg", c20306bg)
                .put("c20307a", c20307a)
                .put("c20307b", c20307b)
                .put("c20307ba", c20307ba)
                .put("c20307bb", c20307bb)
                .put("c20307bc", c20307bc)
                .put("c20307bd", c20307bd)
                .put("c20307be", c20307be)
                .put("c20307bf", c20307bf)
                .put("c20307bg", c20307bg)
                .put("c20308a", c20308a)
                .put("c20308b", c20308b)
                .put("c20308ba", c20308ba)
                .put("c20308bb", c20308bb)
                .put("c20308bc", c20308bc)
                .put("c20308bd", c20308bd)
                .put("c20308be", c20308be)
                .put("c20308bf", c20308bf)
                .put("c20308bg", c20308bg)
                .put("c20309a", c20309a)
                .put("c20309b", c20309b)
                .put("c20309ba", c20309ba)
                .put("c20309bb", c20309bb)
                .put("c20309bc", c20309bc)
                .put("c20309bd", c20309bd)
                .put("c20309be", c20309be)
                .put("c20309bf", c20309bf)
                .put("c20309bg", c20309bg)
                .put("c20310a", c20310a)
                .put("c20310b", c20310b)
                .put("c20310ba", c20310ba)
                .put("c20310bb", c20310bb)
                .put("c20310bc", c20310bc)
                .put("c20310bd", c20310bd)
                .put("c20310be", c20310be)
                .put("c20310bf", c20310bf)
                .put("c20310bg", c20310bg)
                .put("c20311a", c20311a)
                .put("c20311b", c20311b)
                .put("c20311ba", c20311ba)
                .put("c20311bb", c20311bb)
                .put("c20311bc", c20311bc)
                .put("c20311bd", c20311bd)
                .put("c20311be", c20311be)
                .put("c20311bf", c20311bf)
                .put("c20311bg", c20311bg)
                .put("c20312a", c20312a)
                .put("c20312b", c20312b)
                .put("c20312ba", c20312ba)
                .put("c20312bb", c20312bb)
                .put("c20312bc", c20312bc)
                .put("c20312bd", c20312bd)
                .put("c20312be", c20312be)
                .put("c20312bf", c20312bf)
                .put("c20312bg", c20312bg)
                .put("c20313a", c20313a)
                .put("c20313b", c20313b)
                .put("c20313ba", c20313ba)
                .put("c20313bb", c20313bb)
                .put("c20313bc", c20313bc)
                .put("c20313bd", c20313bd)
                .put("c20313be", c20313be)
                .put("c20313bf", c20313bf)
                .put("c20313bg", c20313bg)
                .put("c20314a", c20314a)
                .put("c20314b", c20314b)
                .put("c20314ba", c20314ba)
                .put("c20314bb", c20314bb)
                .put("c20314bc", c20314bc)
                .put("c20314bd", c20314bd)
                .put("c20314be", c20314be)
                .put("c20314bf", c20314bf)
                .put("c20314bg", c20314bg)
                .put("c20315a", c20315a)
                .put("c20315b", c20315b)
                .put("c20315ba", c20315ba)
                .put("c20315bb", c20315bb)
                .put("c20315bc", c20315bc)
                .put("c20315bd", c20315bd)
                .put("c20315be", c20315be)
                .put("c20315bf", c20315bf)
                .put("c20315bg", c20315bg)
                .put("c20316a", c20316a)
                .put("c20316b", c20316b)
                .put("c20316ba", c20316ba)
                .put("c20316bb", c20316bb)
                .put("c20316bc", c20316bc)
                .put("c20316bd", c20316bd)
                .put("c20316be", c20316be)
                .put("c20316bf", c20316bf)
                .put("c20316bg", c20316bg)
                .put("c20317a", c20317a)
                .put("c20317b", c20317b)
                .put("c20317ba", c20317ba)
                .put("c20317bb", c20317bb)
                .put("c20317bc", c20317bc)
                .put("c20317bd", c20317bd)
                .put("c20317be", c20317be)
                .put("c20317bf", c20317bf)
                .put("c20317bg", c20317bg)
                .put("c204", c204);

        return json.toString();
    }

    public String sC3toString() throws JSONException {
        Log.d(TAG, "sC3toString: ");
        JSONObject json = new JSONObject();

        json.put("c301", c301)
                .put("c302", c302)
                .put("c303", c303)
                .put("c30396x", c30396x)
                .put("c304", c304)
                .put("c304961x", c304961x)
                .put("c304962x", c304962x)
                .put("c304963x", c304963x)
                .put("c305", c305)
                .put("c305a", c305a)
                .put("c305b", c305b)
                .put("c305c", c305c)
                .put("c305d", c305d)
                .put("c305e", c305e)
                .put("c305f", c305f)
                .put("c305g", c305g)
                .put("c305h", c305h)
                .put("c305i", c305i)
                .put("c305j", c305j)
                .put("c30596", c30596)
                .put("c30596x", c30596x)
                .put("c306", c306)
                .put("c307", c307)
                .put("c308", c308)
                .put("c30896x", c30896x)
                .put("c309", c309)
                .put("c309961x", c309961x)
                .put("c309962x", c309962x)
                .put("c309963x", c309963x)
                .put("c310", c310)
                .put("c310a", c310a)
                .put("c310b", c310b)
                .put("c310c", c310c)
                .put("c310d", c310d)
                .put("c310e", c310e)
                .put("c310f", c310f)
                .put("c310g", c310g)
                .put("c31096", c31096)
                .put("c31096x", c31096x)
                .put("c311", c311)
                .put("c312", c312)
                .put("c313", c313)
                .put("c31396x", c31396x)
                .put("c314", c314)
                .put("c314961x", c314961x)
                .put("c314962x", c314962x)
                .put("c314963x", c314963x)
                .put("c315", c315)
                .put("c315a", c315a)
                .put("c315b", c315b)
                .put("c315c", c315c)
                .put("c315d", c315d)
                .put("c315e", c315e)
                .put("c315f", c315f)
                .put("c315g", c315g)
                .put("c315h", c315h)
                .put("c31596", c31596)
                .put("c31596x", c31596x)
                .put("c316", c316)
                .put("c317", c317)
                .put("c318", c318)
                .put("c319", c319)
                .put("c320", c320)
                .put("c321", c321)
                .put("c322", c322)
                .put("c323", c323)
                .put("c323mx", c323mx)
                .put("c323dx", c323dx);

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
        json.put(FormsTable.COLUMN_SH2B, new JSONObject(sH2btoString()));
            /*
            json.put(FormsTable.COLUMN_SH2c, new JSONObject(sH2ctoString()));
            json.put(FormsTable.COLUMN_SH2d, new JSONObject(sH2dtoString()));
            */
        json.put(FormsTable.COLUMN_SH3A, new JSONObject(sH3atoString()));
        json.put(FormsTable.COLUMN_SH3B, new JSONObject(sH3btoString()));
        json.put(FormsTable.COLUMN_SH4, new JSONObject(sH4toString()));
        json.put(FormsTable.COLUMN_SH5, new JSONObject(sH5toString()));
        json.put(FormsTable.COLUMN_SH6, new JSONObject(sH6toString()));
        json.put(FormsTable.COLUMN_SH7, new JSONObject(sH7toString()));

        // MWRA
        json.put(FormsTable.COLUMN_SW1A, new JSONObject(sW1atoString()));
        json.put(FormsTable.COLUMN_SW2, new JSONObject(sW2toString()));
        json.put(FormsTable.COLUMN_SW3, new JSONObject(sW3toString()));
        json.put(FormsTable.COLUMN_SW4, new JSONObject(sW4toString()));

        // Children
        json.put(FormsTable.COLUMN_SC1, new JSONObject(sC1toString()));
        json.put(FormsTable.COLUMN_SC2, new JSONObject(sC2toString()));
        json.put(FormsTable.COLUMN_SC3, new JSONObject(sC3toString()));


        return json;
    }


    private void calculateTotalMember() {
        if (!this.h211t.equals("")
                && !this.h213t.equals("")
                && !this.h215t.equals("")
                && !this.h217t.equals("")
                && !this.h219t.equals("")) {

            // Total Members
            setH209t(String.valueOf(Integer.parseInt(this.h211t)
                    + Integer.parseInt(this.h213t)
                    + Integer.parseInt(this.h215t)
                    + Integer.parseInt(this.h217t)
                    + Integer.parseInt(this.h219t)
            ));
            // Total Males
            setH209m(String.valueOf(Integer.parseInt(this.h211m)
                    + Integer.parseInt(this.h213m)
                    + Integer.parseInt(this.h215m)
                    + Integer.parseInt(this.h217m)
                    + Integer.parseInt(this.h219m)
            ));
            // Total Female
            setH209f(String.valueOf(Integer.parseInt(this.h211f)
                    + Integer.parseInt(this.h213f)
                    + Integer.parseInt(this.h215f)
                    + Integer.parseInt(this.h217f)
                    + Integer.parseInt(this.h219f)
            ));
        }

    }
}
