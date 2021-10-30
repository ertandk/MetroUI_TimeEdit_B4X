package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="MetroUI_TimeEdit1.Hour_Text.Text=\"23\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_metroui_timeedit1" /*RemoteObject*/ ).getField(false,"_hour_text" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence("23"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Log(MetroUI_TimeEdit1.Time)";
Debug.ShouldStop(-2147483648);
b4xmainpage.__c.runVoidMethod ("LogImpl","7786433",__ref.getField(false,"_metroui_timeedit1" /*RemoteObject*/ ).runClassMethod (b4a.example.metroui_timeedit.class, "_time" /*RemoteObject*/ ),0);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private MetroUI_TimeEdit1 As MetroUI_TimeEdit";
b4xmainpage._metroui_timeedit1 = RemoteObject.createNew ("b4a.example.metroui_timeedit");__ref.setField("_metroui_timeedit1",b4xmainpage._metroui_timeedit1);
 //BA.debugLineNum = 13;BA.debugLine="Private MetroUI_TimeEdit2 As MetroUI_TimeEdit";
b4xmainpage._metroui_timeedit2 = RemoteObject.createNew ("b4a.example.metroui_timeedit");__ref.setField("_metroui_timeedit2",b4xmainpage._metroui_timeedit2);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _time_button_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Time_Button_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("time_button_click")) { return __ref.runUserSub(false, "b4xmainpage","time_button_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub Time_Button_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Log(MetroUI_TimeEdit2.Time)";
Debug.ShouldStop(128);
b4xmainpage.__c.runVoidMethod ("LogImpl","7917505",__ref.getField(false,"_metroui_timeedit2" /*RemoteObject*/ ).runClassMethod (b4a.example.metroui_timeedit.class, "_time" /*RemoteObject*/ ),0);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _time_second_button_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Time_Second_Button_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("time_second_button_click")) { return __ref.runUserSub(false, "b4xmainpage","time_second_button_click", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Private Sub Time_Second_Button_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Log(MetroUI_TimeEdit1.Time)";
Debug.ShouldStop(8);
b4xmainpage.__c.runVoidMethod ("LogImpl","7851969",__ref.getField(false,"_metroui_timeedit1" /*RemoteObject*/ ).runClassMethod (b4a.example.metroui_timeedit.class, "_time" /*RemoteObject*/ ),0);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}