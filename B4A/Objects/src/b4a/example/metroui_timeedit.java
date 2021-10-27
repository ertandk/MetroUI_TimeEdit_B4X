package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class metroui_timeedit extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.metroui_timeedit");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.metroui_timeedit.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.PanelWrapper _anapanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _saatb4x = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _saatlblb4x = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dakikab4x = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dakikalblbb4x = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _saniyeb4x = null;
public anywheresoftware.b4a.objects.EditTextWrapper _saat_text = null;
public anywheresoftware.b4a.objects.EditTextWrapper _dakika_text = null;
public anywheresoftware.b4a.objects.EditTextWrapper _saniye_text = null;
public anywheresoftware.b4a.objects.LabelWrapper _saatlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _dakikalabel = null;
public boolean _saniyevisiblecheck = false;
public String _backgroundcolor = "";
public String _textcolor = "";
public anywheresoftware.b4a.objects.IME _ime = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _base_resize(b4a.example.metroui_timeedit __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.metroui_timeedit __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="Private AnaPanel As Panel";
_anapanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="Private Saatb4x As B4XView  'ignore";
_saatb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="Private SaatLblb4x As B4XView'ignore";
_saatlblb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="Private Dakikab4x As B4XView'ignore";
_dakikab4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="Private Dakikalblbb4x As B4XView'ignore";
_dakikalblbb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="Private Saniyeb4x As B4XView'ignore";
_saniyeb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="Public Saat_Text As EditText";
_saat_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8454162;
 //BA.debugLineNum = 8454162;BA.debugLine="Private Dakika_Text As EditText";
_dakika_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8454163;
 //BA.debugLineNum = 8454163;BA.debugLine="Private Saniye_Text As EditText";
_saniye_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8454164;
 //BA.debugLineNum = 8454164;BA.debugLine="Private SaatLabel As Label";
_saatlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8454165;
 //BA.debugLineNum = 8454165;BA.debugLine="Private DakikaLabel As Label";
_dakikalabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8454167;
 //BA.debugLineNum = 8454167;BA.debugLine="Private SaniyeVisibleCheck As Boolean 'ignore";
_saniyevisiblecheck = false;
RDebugUtils.currentLine=8454168;
 //BA.debugLineNum = 8454168;BA.debugLine="Private BackgroundColor As String";
_backgroundcolor = "";
RDebugUtils.currentLine=8454169;
 //BA.debugLineNum = 8454169;BA.debugLine="Private TextColor As String";
_textcolor = "";
RDebugUtils.currentLine=8454171;
 //BA.debugLineNum = 8454171;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=8454176;
 //BA.debugLineNum = 8454176;BA.debugLine="End Sub";
return "";
}
public String  _dakika_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "dakika_textchanged", false))
	 {return ((String) Debug.delegate(ba, "dakika_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub Dakika_TextChanged (Old As String, New";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Try";
try {RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Log(New.Length)";
__c.LogImpl("210027010",BA.NumberToString(_new.length()),0);
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="If New.Length = 2 And SaniyeVisibleCheck=True Th";
if (_new.length()==2 && __ref._saniyevisiblecheck /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Saniye_Text.RequestFocus";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 }else 
{RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="Else if New.Length=0 Then";
if (_new.length()==0) { 
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Saat_Text.RequestFocus";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 }}
;
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="Log(LastException)";
__c.LogImpl("210027023",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10027025;
 //BA.debugLineNum = 10027025;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.metroui_timeedit __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="BackgroundColor=Props.get(\"BackgroundColor\")";
__ref._backgroundcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="SaniyeVisibleCheck=Props.Get(\"SaniyeVisible\")";
__ref._saniyevisiblecheck /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SaniyeVisible")));
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="TextColor=Props.Get(\"TextColor\")";
__ref._textcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="mBase.AddView(AnaPanel,0,0,mBase.Width, mBase.Hei";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(BackgroundCo";
_panelarkaplanozellikleri.Initialize2((int)(Double.parseDouble(__ref._backgroundcolor /*String*/ )),(int) (0),(int) (0),(int)(Double.parseDouble(__ref._backgroundcolor /*String*/ )));
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="AnaPanel.Background=PanelArkaPlanOzellikleri";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="If SaniyeVisibleCheck=True Then";
if (__ref._saniyevisiblecheck /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/3,m";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585235;
 //BA.debugLineNum = 8585235;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2di";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))),(int) (0),__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585236;
 //BA.debugLineNum = 8585236;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/3,0,mBa";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585237;
 //BA.debugLineNum = 8585237;BA.debugLine="AnaPanel.AddView(DakikaLabel,Dakika_Text.Left +";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getLeft()+__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))),(int) (0),__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585238;
 //BA.debugLineNum = 8585238;BA.debugLine="AnaPanel.AddView(Saniye_Text,Dakika_Text.Left+Da";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getLeft()+__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=8585240;
 //BA.debugLineNum = 8585240;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/2,m";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585241;
 //BA.debugLineNum = 8585241;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2di";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))),(int) (0),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=8585242;
 //BA.debugLineNum = 8585242;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/2,0,mBa";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=8585245;
 //BA.debugLineNum = 8585245;BA.debugLine="Saat_Text.HintColor = TextColor";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=8585246;
 //BA.debugLineNum = 8585246;BA.debugLine="Saat_Text.TextColor = TextColor";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=8585248;
 //BA.debugLineNum = 8585248;BA.debugLine="Dakika_Text.HintColor = TextColor";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=8585249;
 //BA.debugLineNum = 8585249;BA.debugLine="Dakika_Text.TextColor = TextColor";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=8585251;
 //BA.debugLineNum = 8585251;BA.debugLine="Saniye_Text.HintColor = TextColor";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=8585252;
 //BA.debugLineNum = 8585252;BA.debugLine="Saniye_Text.TextColor = TextColor";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=8585254;
 //BA.debugLineNum = 8585254;BA.debugLine="IME.SetLengthFilter(Saat_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=8585255;
 //BA.debugLineNum = 8585255;BA.debugLine="IME.SetLengthFilter(Dakika_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=8585256;
 //BA.debugLineNum = 8585256;BA.debugLine="IME.SetLengthFilter(Saniye_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=8585259;
 //BA.debugLineNum = 8585259;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.metroui_timeedit __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="AnaPanel.Initialize(\"AnaPanel\")";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"AnaPanel");
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="Saat_Text.Initialize(\"Saat\")";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Saat");
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="Dakika_Text.Initialize(\"Dakika\")";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Dakika");
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="Saniye_Text.Initialize(\"Saniye\")";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Saniye");
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="SaatLabel.Initialize(\"SaatLabel\")";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"SaatLabel");
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="DakikaLabel.Initialize(\"DakikaLabel\")";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"DakikaLabel");
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="Saatb4x=Saat_Text";
__ref._saatb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="Dakikab4x=Dakika_Text";
__ref._dakikab4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="Saniyeb4x=Saniye_Text";
__ref._saniyeb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="SaatLblb4x=SaatLabel";
__ref._saatlblb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="Dakikalblbb4x=DakikaLabel";
__ref._dakikalblbb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="Saat_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=8519708;
 //BA.debugLineNum = 8519708;BA.debugLine="Dakika_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=8519709;
 //BA.debugLineNum = 8519709;BA.debugLine="Saniye_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="Saat_Text.Gravity=Gravity.CENTER";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8519712;
 //BA.debugLineNum = 8519712;BA.debugLine="Dakika_Text.Gravity=Gravity.CENTER";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8519713;
 //BA.debugLineNum = 8519713;BA.debugLine="Saniye_Text.Gravity=Gravity.CENTER";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8519715;
 //BA.debugLineNum = 8519715;BA.debugLine="SaatLabel.Gravity=Gravity.CENTER";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8519716;
 //BA.debugLineNum = 8519716;BA.debugLine="DakikaLabel.Gravity=Gravity.CENTER";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8519718;
 //BA.debugLineNum = 8519718;BA.debugLine="Saat_Text.Color = Colors.Transparent";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=8519719;
 //BA.debugLineNum = 8519719;BA.debugLine="Dakika_Text.Color=Colors.Transparent";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=8519720;
 //BA.debugLineNum = 8519720;BA.debugLine="Saniye_Text.Color=Colors.Transparent";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=8519722;
 //BA.debugLineNum = 8519722;BA.debugLine="Saat_Text.Hint=\"00\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=8519723;
 //BA.debugLineNum = 8519723;BA.debugLine="SaatLabel.Text=\":\"";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=8519724;
 //BA.debugLineNum = 8519724;BA.debugLine="Dakika_Text.Hint=\"00\"";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=8519725;
 //BA.debugLineNum = 8519725;BA.debugLine="DakikaLabel.Text=\":\"";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=8519726;
 //BA.debugLineNum = 8519726;BA.debugLine="Saniye_Text.Hint=\"00\"";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=8519730;
 //BA.debugLineNum = 8519730;BA.debugLine="End Sub";
return "";
}
public String  _saat_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "saat_textchanged", false))
	 {return ((String) Debug.delegate(ba, "saat_textchanged", new Object[] {_old,_new}));}
int _saatex = 0;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub Saat_TextChanged (Old As String, New A";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Try";
try {RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Log(New.Length)";
__c.LogImpl("29633794",BA.NumberToString(_new.length()),0);
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Log(Saat_Text.Text)";
__c.LogImpl("29633800",__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Dim Saatex As Int = Saat_Text.Text";
_saatex = (int)(Double.parseDouble(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="If Saatex > 12 Then";
if (_saatex>12) { 
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="Saat_Text.Hint = 0";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint(BA.NumberToString(0));
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="Saat_Text.Text = \"\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="Else if Saatex <= 12 Then";
if (_saatex<=12) { 
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="If New.Length = 2 Then";
if (_new.length()==2) { 
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="Dakika_Text.RequestFocus";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 }}
;
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=9633818;
 //BA.debugLineNum = 9633818;BA.debugLine="Log(LastException)";
__c.LogImpl("29633818",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9633820;
 //BA.debugLineNum = 9633820;BA.debugLine="End Sub";
return "";
}
public String  _saniye_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "saniye_textchanged", false))
	 {return ((String) Debug.delegate(ba, "saniye_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub Saniye_TextChanged (Old As String, New";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Try";
try {RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Log(New.Length)";
__c.LogImpl("210289154",BA.NumberToString(_new.length()),0);
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="If New.Length=0 Then";
if (_new.length()==0) { 
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="Dakika_Text.RequestFocus";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="Log(LastException)";
__c.LogImpl("210289164",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="End Sub";
return "";
}
}