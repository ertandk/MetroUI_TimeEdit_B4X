package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class metroui_timeedit_subs_4 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metroui_timeedit","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 198;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32);
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
metroui_timeedit._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",metroui_timeedit._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
metroui_timeedit._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",metroui_timeedit._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView";
metroui_timeedit._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",metroui_timeedit._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
metroui_timeedit._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",metroui_timeedit._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public Tag As Object";
metroui_timeedit._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",metroui_timeedit._tag);
 //BA.debugLineNum = 14;BA.debugLine="Private AnaPanel As Panel";
metroui_timeedit._anapanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_anapanel",metroui_timeedit._anapanel);
 //BA.debugLineNum = 16;BA.debugLine="Private Saatb4x As B4XView  'ignore";
metroui_timeedit._saatb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_saatb4x",metroui_timeedit._saatb4x);
 //BA.debugLineNum = 17;BA.debugLine="Private SaatLblb4x As B4XView'ignore";
metroui_timeedit._saatlblb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_saatlblb4x",metroui_timeedit._saatlblb4x);
 //BA.debugLineNum = 18;BA.debugLine="Private Dakikab4x As B4XView'ignore";
metroui_timeedit._dakikab4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_dakikab4x",metroui_timeedit._dakikab4x);
 //BA.debugLineNum = 19;BA.debugLine="Private Dakikalblbb4x As B4XView'ignore";
metroui_timeedit._dakikalblbb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_dakikalblbb4x",metroui_timeedit._dakikalblbb4x);
 //BA.debugLineNum = 20;BA.debugLine="Private Saniyeb4x As B4XView'ignore";
metroui_timeedit._saniyeb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_saniyeb4x",metroui_timeedit._saniyeb4x);
 //BA.debugLineNum = 23;BA.debugLine="Public Saat_Text As EditText";
metroui_timeedit._saat_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_saat_text",metroui_timeedit._saat_text);
 //BA.debugLineNum = 24;BA.debugLine="Private Dakika_Text As EditText";
metroui_timeedit._dakika_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_dakika_text",metroui_timeedit._dakika_text);
 //BA.debugLineNum = 25;BA.debugLine="Private Saniye_Text As EditText";
metroui_timeedit._saniye_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_saniye_text",metroui_timeedit._saniye_text);
 //BA.debugLineNum = 26;BA.debugLine="Private SaatLabel As Label";
metroui_timeedit._saatlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_saatlabel",metroui_timeedit._saatlabel);
 //BA.debugLineNum = 27;BA.debugLine="Private DakikaLabel As Label";
metroui_timeedit._dakikalabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dakikalabel",metroui_timeedit._dakikalabel);
 //BA.debugLineNum = 29;BA.debugLine="Private SaniyeVisibleCheck As Boolean 'ignore";
metroui_timeedit._saniyevisiblecheck = RemoteObject.createImmutable(false);__ref.setField("_saniyevisiblecheck",metroui_timeedit._saniyevisiblecheck);
 //BA.debugLineNum = 30;BA.debugLine="Private BackgroundColor As String";
metroui_timeedit._backgroundcolor = RemoteObject.createImmutable("");__ref.setField("_backgroundcolor",metroui_timeedit._backgroundcolor);
 //BA.debugLineNum = 31;BA.debugLine="Private TextColor As String";
metroui_timeedit._textcolor = RemoteObject.createImmutable("");__ref.setField("_textcolor",metroui_timeedit._textcolor);
 //BA.debugLineNum = 33;BA.debugLine="Private IME As IME";
metroui_timeedit._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_ime",metroui_timeedit._ime);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dakika_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("Dakika_TextChanged (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("dakika_textchanged")) { return __ref.runUserSub(false, "metroui_timeedit","dakika_textchanged", __ref, _old, _new);}
RemoteObject _pos = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 153;BA.debugLine="Private Sub Dakika_TextChanged (Old As String, New";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 155;BA.debugLine="Log(New.Length)";
Debug.ShouldStop(67108864);
metroui_timeedit.__c.runVoidMethod ("LogImpl","210027010",BA.NumberToString(_new.runMethod(true,"length")),0);
 BA.debugLineNum = 156;BA.debugLine="If New.Length > 2 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 157;BA.debugLine="Dim pos As Int = Saat_Text.SelectionStart";
Debug.ShouldStop(268435456);
_pos = __ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getSelectionStart");Debug.locals.put("pos", _pos);Debug.locals.put("pos", _pos);
 BA.debugLineNum = 158;BA.debugLine="Dakika_Text.Text = Old";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_old));
 BA.debugLineNum = 159;BA.debugLine="Dakika_Text.SelectionStart= pos";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",_pos);
 };
 BA.debugLineNum = 162;BA.debugLine="If New.Length = 2 And SaniyeVisibleCheck=True Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_saniyevisiblecheck" /*RemoteObject*/ ),metroui_timeedit.__c.getField(true,"True"))) { 
 BA.debugLineNum = 163;BA.debugLine="Saniye_Text.RequestFocus";
Debug.ShouldStop(4);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 }else 
{ BA.debugLineNum = 165;BA.debugLine="Else if New.Length=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 167;BA.debugLine="Saat_Text.RequestFocus";
Debug.ShouldStop(64);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 173;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
metroui_timeedit.__c.runVoidMethod ("LogImpl","210027028",BA.ObjectToString(metroui_timeedit.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metroui_timeedit","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _panelarkaplanozellikleri = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 93;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="mBase = Base";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 95;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(1073741824);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 96;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 98;BA.debugLine="BackgroundColor=Props.get(\"BackgroundColor\")";
Debug.ShouldStop(2);
__ref.setField ("_backgroundcolor" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BackgroundColor"))))));
 BA.debugLineNum = 99;BA.debugLine="SaniyeVisibleCheck=Props.Get(\"SaniyeVisible\")";
Debug.ShouldStop(4);
__ref.setField ("_saniyevisiblecheck" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SaniyeVisible"))))));
 BA.debugLineNum = 100;BA.debugLine="TextColor=Props.Get(\"TextColor\")";
Debug.ShouldStop(8);
__ref.setField ("_textcolor" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));
 BA.debugLineNum = 102;BA.debugLine="mBase.AddView(AnaPanel,0,0,mBase.Width, mBase.Hei";
Debug.ShouldStop(32);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_anapanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 104;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
Debug.ShouldStop(128);
_panelarkaplanozellikleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("PanelArkaPlanOzellikleri", _panelarkaplanozellikleri);
 BA.debugLineNum = 105;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(BackgroundCo";
Debug.ShouldStop(256);
_panelarkaplanozellikleri.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, __ref.getField(true,"_backgroundcolor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(true,"_backgroundcolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 106;BA.debugLine="AnaPanel.Background=PanelArkaPlanOzellikleri";
Debug.ShouldStop(512);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runMethod(false,"setBackground",(_panelarkaplanozellikleri.getObject()));
 BA.debugLineNum = 110;BA.debugLine="If SaniyeVisibleCheck=True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_saniyevisiblecheck" /*RemoteObject*/ ),metroui_timeedit.__c.getField(true,"True"))) { 
 BA.debugLineNum = 111;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/3,m";
Debug.ShouldStop(16384);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getObject())),(Object)(metroui_timeedit.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 112;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2di";
Debug.ShouldStop(32768);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 113;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/3,0,mBa";
Debug.ShouldStop(65536);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 114;BA.debugLine="AnaPanel.AddView(DakikaLabel,Dakika_Text.Left +";
Debug.ShouldStop(131072);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+-",2, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 115;BA.debugLine="AnaPanel.AddView(Saniye_Text,Dakika_Text.Left+Da";
Debug.ShouldStop(262144);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 117;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/2,m";
Debug.ShouldStop(1048576);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getObject())),(Object)(metroui_timeedit.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 118;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2di";
Debug.ShouldStop(2097152);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 1)));
 BA.debugLineNum = 119;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/2,0,mBa";
Debug.ShouldStop(4194304);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 122;BA.debugLine="Saat_Text.HintColor = TextColor";
Debug.ShouldStop(33554432);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setHintColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 123;BA.debugLine="Saat_Text.TextColor = TextColor";
Debug.ShouldStop(67108864);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="Dakika_Text.HintColor = TextColor";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setHintColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="Dakika_Text.TextColor = TextColor";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 128;BA.debugLine="Saniye_Text.HintColor = TextColor";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setHintColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 129;BA.debugLine="Saniye_Text.TextColor = TextColor";
Debug.ShouldStop(1);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metroui_timeedit","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 40;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(256);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 42;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(512);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 43;BA.debugLine="IME.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 44;BA.debugLine="AnaPanel.Initialize(\"AnaPanel\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AnaPanel")));
 BA.debugLineNum = 47;BA.debugLine="Saat_Text.Initialize(\"Saat\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Saat")));
 BA.debugLineNum = 48;BA.debugLine="Dakika_Text.Initialize(\"Dakika\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Dakika")));
 BA.debugLineNum = 49;BA.debugLine="Saniye_Text.Initialize(\"Saniye\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Saniye")));
 BA.debugLineNum = 51;BA.debugLine="SaatLabel.Initialize(\"SaatLabel\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SaatLabel")));
 BA.debugLineNum = 52;BA.debugLine="DakikaLabel.Initialize(\"DakikaLabel\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DakikaLabel")));
 BA.debugLineNum = 60;BA.debugLine="Saatb4x=Saat_Text";
Debug.ShouldStop(134217728);
__ref.getField(false,"_saatb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 61;BA.debugLine="Dakikab4x=Dakika_Text";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dakikab4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 62;BA.debugLine="Saniyeb4x=Saniye_Text";
Debug.ShouldStop(536870912);
__ref.getField(false,"_saniyeb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 64;BA.debugLine="SaatLblb4x=SaatLabel";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_saatlblb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 65;BA.debugLine="Dakikalblbb4x=DakikaLabel";
Debug.ShouldStop(1);
__ref.getField(false,"_dakikalblbb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 67;BA.debugLine="Saat_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(4);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 68;BA.debugLine="Dakika_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
Debug.ShouldStop(8);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 69;BA.debugLine="Saniye_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
Debug.ShouldStop(16);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 71;BA.debugLine="Saat_Text.Gravity=Gravity.CENTER";
Debug.ShouldStop(64);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 72;BA.debugLine="Dakika_Text.Gravity=Gravity.CENTER";
Debug.ShouldStop(128);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 73;BA.debugLine="Saniye_Text.Gravity=Gravity.CENTER";
Debug.ShouldStop(256);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 75;BA.debugLine="SaatLabel.Gravity=Gravity.CENTER";
Debug.ShouldStop(1024);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 76;BA.debugLine="DakikaLabel.Gravity=Gravity.CENTER";
Debug.ShouldStop(2048);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 78;BA.debugLine="Saat_Text.Color = Colors.Transparent";
Debug.ShouldStop(8192);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 79;BA.debugLine="Dakika_Text.Color=Colors.Transparent";
Debug.ShouldStop(16384);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 80;BA.debugLine="Saniye_Text.Color=Colors.Transparent";
Debug.ShouldStop(32768);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 82;BA.debugLine="Saat_Text.Hint=\"00\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 83;BA.debugLine="SaatLabel.Text=\":\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(":"));
 BA.debugLineNum = 84;BA.debugLine="Dakika_Text.Hint=\"00\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 85;BA.debugLine="DakikaLabel.Text=\":\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(":"));
 BA.debugLineNum = 86;BA.debugLine="Saniye_Text.Hint=\"00\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saat_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("Saat_TextChanged (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("saat_textchanged")) { return __ref.runUserSub(false, "metroui_timeedit","saat_textchanged", __ref, _old, _new);}
RemoteObject _pos = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 133;BA.debugLine="Private Sub Saat_TextChanged (Old As String, New A";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 135;BA.debugLine="Log(New.Length)";
Debug.ShouldStop(64);
metroui_timeedit.__c.runVoidMethod ("LogImpl","29633794",BA.NumberToString(_new.runMethod(true,"length")),0);
 BA.debugLineNum = 136;BA.debugLine="If New.Length > 2 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 137;BA.debugLine="Dim pos As Int = Saat_Text.SelectionStart";
Debug.ShouldStop(256);
_pos = __ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getSelectionStart");Debug.locals.put("pos", _pos);Debug.locals.put("pos", _pos);
 BA.debugLineNum = 138;BA.debugLine="Saat_Text.Text = Old";
Debug.ShouldStop(512);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_old));
 BA.debugLineNum = 139;BA.debugLine="Saat_Text.SelectionStart= pos - 1";
Debug.ShouldStop(1024);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",RemoteObject.solve(new RemoteObject[] {_pos,RemoteObject.createImmutable(1)}, "-",1, 1));
 };
 BA.debugLineNum = 143;BA.debugLine="If New.Length = 2 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 144;BA.debugLine="Dakika_Text.RequestFocus";
Debug.ShouldStop(32768);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 149;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
metroui_timeedit.__c.runVoidMethod ("LogImpl","29633808",BA.ObjectToString(metroui_timeedit.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saniye_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("Saniye_TextChanged (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("saniye_textchanged")) { return __ref.runUserSub(false, "metroui_timeedit","saniye_textchanged", __ref, _old, _new);}
RemoteObject _pos = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 177;BA.debugLine="Private Sub Saniye_TextChanged (Old As String, New";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 179;BA.debugLine="Log(New.Length)";
Debug.ShouldStop(262144);
metroui_timeedit.__c.runVoidMethod ("LogImpl","210289154",BA.NumberToString(_new.runMethod(true,"length")),0);
 BA.debugLineNum = 180;BA.debugLine="If New.Length > 2 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 181;BA.debugLine="Dim pos As Int = Saat_Text.SelectionStart";
Debug.ShouldStop(1048576);
_pos = __ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getSelectionStart");Debug.locals.put("pos", _pos);Debug.locals.put("pos", _pos);
 BA.debugLineNum = 182;BA.debugLine="Saniye_Text.Text = Old";
Debug.ShouldStop(2097152);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_old));
 BA.debugLineNum = 183;BA.debugLine="Saniye_Text.SelectionStart= pos";
Debug.ShouldStop(4194304);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",_pos);
 };
 BA.debugLineNum = 186;BA.debugLine="If New.Length=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 188;BA.debugLine="Dakika_Text.RequestFocus";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 194;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
metroui_timeedit.__c.runVoidMethod ("LogImpl","210289169",BA.ObjectToString(metroui_timeedit.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}