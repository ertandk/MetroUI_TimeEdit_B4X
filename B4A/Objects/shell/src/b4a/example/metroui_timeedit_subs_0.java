package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class metroui_timeedit_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metroui_timeedit","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 344;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
metroui_timeedit._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",metroui_timeedit._meventname);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
metroui_timeedit._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",metroui_timeedit._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView";
metroui_timeedit._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",metroui_timeedit._mbase);
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
metroui_timeedit._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",metroui_timeedit._xui);
 //BA.debugLineNum = 12;BA.debugLine="Public Tag As Object";
metroui_timeedit._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",metroui_timeedit._tag);
 //BA.debugLineNum = 15;BA.debugLine="Private AnaPanel As Panel";
metroui_timeedit._anapanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_anapanel",metroui_timeedit._anapanel);
 //BA.debugLineNum = 17;BA.debugLine="Private Saatb4x As B4XView  'ignore";
metroui_timeedit._saatb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_saatb4x",metroui_timeedit._saatb4x);
 //BA.debugLineNum = 18;BA.debugLine="Private SaatLblb4x As B4XView'ignore";
metroui_timeedit._saatlblb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_saatlblb4x",metroui_timeedit._saatlblb4x);
 //BA.debugLineNum = 19;BA.debugLine="Private Dakikab4x As B4XView'ignore";
metroui_timeedit._dakikab4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_dakikab4x",metroui_timeedit._dakikab4x);
 //BA.debugLineNum = 20;BA.debugLine="Private Dakikalblbb4x As B4XView'ignore";
metroui_timeedit._dakikalblbb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_dakikalblbb4x",metroui_timeedit._dakikalblbb4x);
 //BA.debugLineNum = 21;BA.debugLine="Private Saniyeb4x As B4XView'ignore";
metroui_timeedit._saniyeb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_saniyeb4x",metroui_timeedit._saniyeb4x);
 //BA.debugLineNum = 23;BA.debugLine="Private ZamanDilimiOnikiYirmiDort As Boolean";
metroui_timeedit._zamandilimionikiyirmidort = RemoteObject.createImmutable(false);__ref.setField("_zamandilimionikiyirmidort",metroui_timeedit._zamandilimionikiyirmidort);
 //BA.debugLineNum = 24;BA.debugLine="Private SaniyeVisibleCheck As Boolean 'ignore";
metroui_timeedit._saniyevisiblecheck = RemoteObject.createImmutable(false);__ref.setField("_saniyevisiblecheck",metroui_timeedit._saniyevisiblecheck);
 //BA.debugLineNum = 25;BA.debugLine="Private BackgroundColor As String";
metroui_timeedit._backgroundcolor = RemoteObject.createImmutable("");__ref.setField("_backgroundcolor",metroui_timeedit._backgroundcolor);
 //BA.debugLineNum = 26;BA.debugLine="Private TextColor As String";
metroui_timeedit._textcolor = RemoteObject.createImmutable("");__ref.setField("_textcolor",metroui_timeedit._textcolor);
 //BA.debugLineNum = 27;BA.debugLine="Private ClockColor As String 'ignore";
metroui_timeedit._clockcolor = RemoteObject.createImmutable("");__ref.setField("_clockcolor",metroui_timeedit._clockcolor);
 //BA.debugLineNum = 30;BA.debugLine="Public Saat_Text As EditText";
metroui_timeedit._saat_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_saat_text",metroui_timeedit._saat_text);
 //BA.debugLineNum = 31;BA.debugLine="Private Dakika_Text As EditText";
metroui_timeedit._dakika_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_dakika_text",metroui_timeedit._dakika_text);
 //BA.debugLineNum = 32;BA.debugLine="Private Saniye_Text As EditText";
metroui_timeedit._saniye_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_saniye_text",metroui_timeedit._saniye_text);
 //BA.debugLineNum = 33;BA.debugLine="Private SaatLabel As Label";
metroui_timeedit._saatlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_saatlabel",metroui_timeedit._saatlabel);
 //BA.debugLineNum = 34;BA.debugLine="Private DakikaLabel As Label";
metroui_timeedit._dakikalabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_dakikalabel",metroui_timeedit._dakikalabel);
 //BA.debugLineNum = 36;BA.debugLine="Private IME As IME";
metroui_timeedit._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_ime",metroui_timeedit._ime);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dakika_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("Dakika_TextChanged (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("dakika_textchanged")) { return __ref.runUserSub(false, "metroui_timeedit","dakika_textchanged", __ref, _old, _new);}
RemoteObject _dakikaex = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 279;BA.debugLine="Private Sub Dakika_TextChanged (Old As String, New";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 281;BA.debugLine="Log(New.Length)";
Debug.ShouldStop(16777216);
metroui_timeedit.__c.runVoidMethod ("LogImpl","11114114",BA.NumberToString(_new.runMethod(true,"length")),0);
 BA.debugLineNum = 283;BA.debugLine="Dim Dakikaex As Int = Dakika_Text.Text";
Debug.ShouldStop(67108864);
_dakikaex = BA.numberCast(int.class, __ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("Dakikaex", _dakikaex);Debug.locals.put("Dakikaex", _dakikaex);
 BA.debugLineNum = 285;BA.debugLine="If Dakikaex > 59 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_dakikaex,BA.numberCast(double.class, 59))) { 
 BA.debugLineNum = 287;BA.debugLine="Dakika_Text.Hint = \"00\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 291;BA.debugLine="Dakika_Text.Text = \"\"";
Debug.ShouldStop(4);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else 
{ BA.debugLineNum = 292;BA.debugLine="else if Dakikaex <= 59 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("k",_dakikaex,BA.numberCast(double.class, 59))) { 
 BA.debugLineNum = 293;BA.debugLine="If New.Length = 2 And SaniyeVisibleCheck=True T";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_saniyevisiblecheck" /*RemoteObject*/ ),metroui_timeedit.__c.getField(true,"True"))) { 
 BA.debugLineNum = 294;BA.debugLine="Saniye_Text.RequestFocus";
Debug.ShouldStop(32);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 }else 
{ BA.debugLineNum = 295;BA.debugLine="Else If New.Length=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 296;BA.debugLine="Saat_Text.RequestFocus";
Debug.ShouldStop(128);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 }}
;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 300;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
metroui_timeedit.__c.runVoidMethod ("LogImpl","11114133",BA.ObjectToString(metroui_timeedit.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("DesignerCreateView (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metroui_timeedit","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _panelarkaplanozellikleri = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 149;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="mBase = Base";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 151;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(4194304);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 152;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 154;BA.debugLine="ZamanDilimiOnikiYirmiDort=Props.Get(\"ZamanDilimiO";
Debug.ShouldStop(33554432);
__ref.setField ("_zamandilimionikiyirmidort" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ZamanDilimiOnikiYirmiDort"))))));
 BA.debugLineNum = 155;BA.debugLine="BackgroundColor=Props.Get(\"BackgroundColor\")";
Debug.ShouldStop(67108864);
__ref.setField ("_backgroundcolor" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BackgroundColor"))))));
 BA.debugLineNum = 156;BA.debugLine="SaniyeVisibleCheck=Props.Get(\"SaniyeVisible\")";
Debug.ShouldStop(134217728);
__ref.setField ("_saniyevisiblecheck" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SaniyeVisible"))))));
 BA.debugLineNum = 157;BA.debugLine="TextColor=Props.Get(\"TextColor\")";
Debug.ShouldStop(268435456);
__ref.setField ("_textcolor" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));
 BA.debugLineNum = 158;BA.debugLine="ClockColor=Props.Get(\"ClockColor\")";
Debug.ShouldStop(536870912);
__ref.setField ("_clockcolor" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ClockColor"))))));
 BA.debugLineNum = 160;BA.debugLine="mBase.AddView(AnaPanel,0,0,mBase.Width, mBase.Hei";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_anapanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 165;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
Debug.ShouldStop(16);
_panelarkaplanozellikleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("PanelArkaPlanOzellikleri", _panelarkaplanozellikleri);
 BA.debugLineNum = 166;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(BackgroundCo";
Debug.ShouldStop(32);
_panelarkaplanozellikleri.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, __ref.getField(true,"_backgroundcolor" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(true,"_backgroundcolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 167;BA.debugLine="AnaPanel.Background=PanelArkaPlanOzellikleri";
Debug.ShouldStop(64);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runMethod(false,"setBackground",(_panelarkaplanozellikleri.getObject()));
 BA.debugLineNum = 180;BA.debugLine="If SaniyeVisibleCheck=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_saniyevisiblecheck" /*RemoteObject*/ ),metroui_timeedit.__c.getField(true,"True"))) { 
 BA.debugLineNum = 181;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/3,m";
Debug.ShouldStop(1048576);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getObject())),(Object)(metroui_timeedit.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 182;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 3di";
Debug.ShouldStop(2097152);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 1)));
 BA.debugLineNum = 183;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/3,0,mBa";
Debug.ShouldStop(4194304);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 184;BA.debugLine="AnaPanel.AddView(DakikaLabel,Dakika_Text.Left +";
Debug.ShouldStop(8388608);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+-",2, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 1)));
 BA.debugLineNum = 185;BA.debugLine="AnaPanel.AddView(Saniye_Text,Dakika_Text.Left+Da";
Debug.ShouldStop(16777216);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 187;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/2,m";
Debug.ShouldStop(67108864);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getObject())),(Object)(metroui_timeedit.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 188;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2di";
Debug.ShouldStop(134217728);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),metroui_timeedit.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 1)));
 BA.debugLineNum = 189;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/2,0,mBa";
Debug.ShouldStop(268435456);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 194;BA.debugLine="Saat_Text.HintColor = TextColor";
Debug.ShouldStop(2);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setHintColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 195;BA.debugLine="Dakika_Text.HintColor = TextColor";
Debug.ShouldStop(4);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setHintColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 196;BA.debugLine="Saniye_Text.HintColor = TextColor";
Debug.ShouldStop(8);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setHintColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 198;BA.debugLine="IME.SetLengthFilter(Saat_Text, 2)";
Debug.ShouldStop(32);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("SetLengthFilter",(Object)((__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 199;BA.debugLine="IME.SetLengthFilter(Dakika_Text, 2)";
Debug.ShouldStop(64);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("SetLengthFilter",(Object)((__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 200;BA.debugLine="IME.SetLengthFilter(Saniye_Text, 2)";
Debug.ShouldStop(128);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("SetLengthFilter",(Object)((__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 214;BA.debugLine="Saat_Text.TextColor = TextColor";
Debug.ShouldStop(2097152);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 215;BA.debugLine="Dakika_Text.TextColor = TextColor";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 216;BA.debugLine="Saniye_Text.TextColor = TextColor";
Debug.ShouldStop(8388608);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_textcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 217;BA.debugLine="SaatLabel.TextColor= ClockColor";
Debug.ShouldStop(16777216);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_clockcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 218;BA.debugLine="DakikaLabel.TextColor= ClockColor";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_clockcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Initialize (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metroui_timeedit","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 47;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(32768);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 49;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(65536);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 52;BA.debugLine="AnaPanel.Initialize(\"AnaPanel\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_anapanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AnaPanel")));
 BA.debugLineNum = 55;BA.debugLine="IME.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 63;BA.debugLine="Saat_Text.Initialize(\"Saat\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Saat")));
 BA.debugLineNum = 64;BA.debugLine="Dakika_Text.Initialize(\"Dakika\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Dakika")));
 BA.debugLineNum = 65;BA.debugLine="Saniye_Text.Initialize(\"Saniye\")";
Debug.ShouldStop(1);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Saniye")));
 BA.debugLineNum = 67;BA.debugLine="SaatLabel.Initialize(\"SaatLabel\")";
Debug.ShouldStop(4);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SaatLabel")));
 BA.debugLineNum = 68;BA.debugLine="DakikaLabel.Initialize(\"DakikaLabel\")";
Debug.ShouldStop(8);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DakikaLabel")));
 BA.debugLineNum = 71;BA.debugLine="Saatb4x=Saat_Text";
Debug.ShouldStop(64);
__ref.getField(false,"_saatb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 72;BA.debugLine="Dakikab4x=Dakika_Text";
Debug.ShouldStop(128);
__ref.getField(false,"_dakikab4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 73;BA.debugLine="Saniyeb4x=Saniye_Text";
Debug.ShouldStop(256);
__ref.getField(false,"_saniyeb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 75;BA.debugLine="SaatLblb4x=SaatLabel";
Debug.ShouldStop(1024);
__ref.getField(false,"_saatlblb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 76;BA.debugLine="Dakikalblbb4x=DakikaLabel";
Debug.ShouldStop(2048);
__ref.getField(false,"_dakikalblbb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 79;BA.debugLine="IME.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="Saat_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(65536);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 82;BA.debugLine="Dakika_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
Debug.ShouldStop(131072);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 83;BA.debugLine="Saniye_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
Debug.ShouldStop(262144);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_saat_text" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 85;BA.debugLine="Saat_Text.Gravity=Gravity.CENTER";
Debug.ShouldStop(1048576);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 86;BA.debugLine="Dakika_Text.Gravity=Gravity.CENTER";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 87;BA.debugLine="Saniye_Text.Gravity=Gravity.CENTER";
Debug.ShouldStop(4194304);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 89;BA.debugLine="SaatLabel.Gravity=Gravity.CENTER";
Debug.ShouldStop(16777216);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 90;BA.debugLine="DakikaLabel.Gravity=Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_timeedit.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 92;BA.debugLine="Saat_Text.Color = Colors.Transparent";
Debug.ShouldStop(134217728);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 93;BA.debugLine="Dakika_Text.Color=Colors.Transparent";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 94;BA.debugLine="Saniye_Text.Color=Colors.Transparent";
Debug.ShouldStop(536870912);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 96;BA.debugLine="Saat_Text.Hint=\"00\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 97;BA.debugLine="SaatLabel.Text=\":\"";
Debug.ShouldStop(1);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(":"));
 BA.debugLineNum = 98;BA.debugLine="Dakika_Text.Hint=\"00\"";
Debug.ShouldStop(2);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 99;BA.debugLine="DakikaLabel.Text=\":\"";
Debug.ShouldStop(4);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(":"));
 BA.debugLineNum = 100;BA.debugLine="Saniye_Text.Hint=\"00\"";
Debug.ShouldStop(8);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 119;BA.debugLine="Saat_Text.Color = Colors.Transparent";
Debug.ShouldStop(4194304);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 120;BA.debugLine="Dakika_Text.Color=Colors.Transparent";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 121;BA.debugLine="Saniye_Text.Color=Colors.Transparent";
Debug.ShouldStop(16777216);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_timeedit.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 124;BA.debugLine="SaatLabel.Text=\":\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_saatlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(":"));
 BA.debugLineNum = 125;BA.debugLine="DakikaLabel.Text=\":\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dakikalabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(":"));
 BA.debugLineNum = 129;BA.debugLine="Saat_Text.Hint=\"00\"";
Debug.ShouldStop(1);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 131;BA.debugLine="Dakika_Text.Hint=\"00\"";
Debug.ShouldStop(4);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 133;BA.debugLine="Saniye_Text.Hint=\"00\"";
Debug.ShouldStop(16);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Saat_TextChanged (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("saat_textchanged")) { return __ref.runUserSub(false, "metroui_timeedit","saat_textchanged", __ref, _old, _new);}
RemoteObject _saatex = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 224;BA.debugLine="Private Sub Saat_TextChanged (Old As String, New A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 226;BA.debugLine="Log(New.Length)";
Debug.ShouldStop(2);
metroui_timeedit.__c.runVoidMethod ("LogImpl","11048578",BA.NumberToString(_new.runMethod(true,"length")),0);
 BA.debugLineNum = 232;BA.debugLine="Log(Saat_Text.Text)";
Debug.ShouldStop(128);
metroui_timeedit.__c.runVoidMethod ("LogImpl","11048584",__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getText"),0);
 BA.debugLineNum = 234;BA.debugLine="Dim Saatex As Int = Saat_Text.Text";
Debug.ShouldStop(512);
_saatex = BA.numberCast(int.class, __ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("Saatex", _saatex);Debug.locals.put("Saatex", _saatex);
 BA.debugLineNum = 236;BA.debugLine="If ZamanDilimiOnikiYirmiDort = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_zamandilimionikiyirmidort" /*RemoteObject*/ ),metroui_timeedit.__c.getField(true,"False"))) { 
 BA.debugLineNum = 238;BA.debugLine="If Saatex > 12 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_saatex,BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 241;BA.debugLine="Saat_Text.Hint = \"00\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 246;BA.debugLine="Saat_Text.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else 
{ BA.debugLineNum = 248;BA.debugLine="Else if Saatex <= 12 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("k",_saatex,BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 249;BA.debugLine="If New.Length = 2 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 250;BA.debugLine="Dakika_Text.RequestFocus";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 }}
;
 }else 
{ BA.debugLineNum = 254;BA.debugLine="Else if ZamanDilimiOnikiYirmiDort = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_zamandilimionikiyirmidort" /*RemoteObject*/ ),metroui_timeedit.__c.getField(true,"True"))) { 
 BA.debugLineNum = 256;BA.debugLine="If Saatex > 24 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_saatex,BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 259;BA.debugLine="Saat_Text.Hint = \"00\"";
Debug.ShouldStop(4);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 264;BA.debugLine="Saat_Text.Text = \"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else 
{ BA.debugLineNum = 266;BA.debugLine="Else if Saatex <= 24 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("k",_saatex,BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 267;BA.debugLine="If New.Length = 2 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 268;BA.debugLine="Dakika_Text.RequestFocus";
Debug.ShouldStop(2048);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 }}
;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e25.toString()); BA.debugLineNum = 275;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
metroui_timeedit.__c.runVoidMethod ("LogImpl","11048627",BA.ObjectToString(metroui_timeedit.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Saniye_TextChanged (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("saniye_textchanged")) { return __ref.runUserSub(false, "metroui_timeedit","saniye_textchanged", __ref, _old, _new);}
RemoteObject _saniyeex = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 304;BA.debugLine="Private Sub Saniye_TextChanged (Old As String, New";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 306;BA.debugLine="Log(New.Length)";
Debug.ShouldStop(131072);
metroui_timeedit.__c.runVoidMethod ("LogImpl","11179650",BA.NumberToString(_new.runMethod(true,"length")),0);
 BA.debugLineNum = 308;BA.debugLine="Dim Saniyeex As Int = Saniye_Text.Text";
Debug.ShouldStop(524288);
_saniyeex = BA.numberCast(int.class, __ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("Saniyeex", _saniyeex);Debug.locals.put("Saniyeex", _saniyeex);
 BA.debugLineNum = 310;BA.debugLine="If Saniyeex > 59 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_saniyeex,BA.numberCast(double.class, 59))) { 
 BA.debugLineNum = 312;BA.debugLine="Saniye_Text.Hint = \"00\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"setHint",BA.ObjectToString("00"));
 BA.debugLineNum = 316;BA.debugLine="Saniye_Text.Text = \"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else 
{ BA.debugLineNum = 317;BA.debugLine="Else If Saniye_Text.Text <= 59 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 59))) { 
 BA.debugLineNum = 318;BA.debugLine="If New.Length=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 319;BA.debugLine="Dakika_Text.RequestFocus";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 323;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
metroui_timeedit.__c.runVoidMethod ("LogImpl","11179667",BA.ObjectToString(metroui_timeedit.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _time(RemoteObject __ref,RemoteObject _hourminiute) throws Exception{
try {
		Debug.PushSubsStack("Time (metroui_timeedit) ","metroui_timeedit",3,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("time")) { return __ref.runUserSub(false, "metroui_timeedit","time", __ref, _hourminiute);}
RemoteObject _saatvedakika = RemoteObject.createImmutable("");
RemoteObject _saatvedakikavesaniye = RemoteObject.createImmutable("");
Debug.locals.put("HourMiniute", _hourminiute);
 BA.debugLineNum = 327;BA.debugLine="Public Sub Time(HourMiniute As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 328;BA.debugLine="If HourMiniute = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_hourminiute,metroui_timeedit.__c.getField(true,"True"))) { 
 BA.debugLineNum = 330;BA.debugLine="Dim SaatveDakika As String = Saat_Text.Text & \":";
Debug.ShouldStop(512);
_saatvedakika = RemoteObject.concat(__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(":"),__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("SaatveDakika", _saatvedakika);Debug.locals.put("SaatveDakika", _saatvedakika);
 BA.debugLineNum = 332;BA.debugLine="Return SaatveDakika";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return _saatvedakika;
 }else {
 BA.debugLineNum = 336;BA.debugLine="Dim SaatveDakikaveSaniye As String = Saat_Text.T";
Debug.ShouldStop(32768);
_saatvedakikavesaniye = RemoteObject.concat(__ref.getField(false,"_saat_text" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(":"),__ref.getField(false,"_dakika_text" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(":"),__ref.getField(false,"_saniye_text" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("SaatveDakikaveSaniye", _saatvedakikavesaniye);Debug.locals.put("SaatveDakikaveSaniye", _saatvedakikavesaniye);
 BA.debugLineNum = 338;BA.debugLine="Return SaatveDakikaveSaniye";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return _saatvedakikavesaniye;
 };
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}