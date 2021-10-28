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
public boolean _zamandilimionikiyirmidort = false;
public boolean _saniyevisiblecheck = false;
public String _backgroundcolor = "";
public String _textcolor = "";
public String _clockcolor = "";
public anywheresoftware.b4a.objects.EditTextWrapper _saat_text = null;
public anywheresoftware.b4a.objects.EditTextWrapper _dakika_text = null;
public anywheresoftware.b4a.objects.EditTextWrapper _saniye_text = null;
public anywheresoftware.b4a.objects.LabelWrapper _saatlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _dakikalabel = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _time(b4a.example.metroui_timeedit __ref,boolean _hourminiute) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "time", false))
	 {return ((String) Debug.delegate(ba, "time", new Object[] {_hourminiute}));}
String _saatvedakika = "";
String _saatvedakikavesaniye = "";
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub Time(HourMiniute As Boolean)";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="If HourMiniute = True Then";
if (_hourminiute==__c.True) { 
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Dim SaatveDakika As String = Saat_Text.Text & \":";
_saatvedakika = __ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+":"+__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Return SaatveDakika";
if (true) return _saatvedakika;
 }else {
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="Dim SaatveDakikaveSaniye As String = Saat_Text.T";
_saatvedakikavesaniye = __ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+":"+__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+":"+__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Return SaatveDakikaveSaniye";
if (true) return _saatvedakikavesaniye;
 };
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.metroui_timeedit __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.metroui_timeedit __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Private AnaPanel As Panel";
_anapanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Private Saatb4x As B4XView  'ignore";
_saatb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private SaatLblb4x As B4XView'ignore";
_saatlblb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private Dakikab4x As B4XView'ignore";
_dakikab4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Private Dakikalblbb4x As B4XView'ignore";
_dakikalblbb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Private Saniyeb4x As B4XView'ignore";
_saniyeb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Private ZamanDilimiOnikiYirmiDort As Boolean";
_zamandilimionikiyirmidort = false;
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="Private SaniyeVisibleCheck As Boolean 'ignore";
_saniyevisiblecheck = false;
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="Private BackgroundColor As String";
_backgroundcolor = "";
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Private TextColor As String";
_textcolor = "";
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="Private ClockColor As String 'ignore";
_clockcolor = "";
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Public Saat_Text As EditText";
_saat_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Private Dakika_Text As EditText";
_dakika_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="Private Saniye_Text As EditText";
_saniye_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Private SaatLabel As Label";
_saatlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="Private DakikaLabel As Label";
_dakikalabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851997;
 //BA.debugLineNum = 851997;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=852006;
 //BA.debugLineNum = 852006;BA.debugLine="End Sub";
return "";
}
public String  _dakika_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "dakika_textchanged", false))
	 {return ((String) Debug.delegate(ba, "dakika_textchanged", new Object[] {_old,_new}));}
int _dakikaex = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Dakika_TextChanged (Old As String, New";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Log(New.Length)";
__c.LogImpl("31114114",BA.NumberToString(_new.length()),0);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="If New.Length>=2 Then";
if (_new.length()>=2) { 
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Dim Dakikaex As Int = Dakika_Text.Text";
_dakikaex = (int)(Double.parseDouble(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="If Dakikaex > 59 Then";
if (_dakikaex>59) { 
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dakika_Text.Hint = \"00\"";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="Dakika_Text.Text = \"\"";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="else if Dakikaex <= 59 Then";
if (_dakikaex<=59) { 
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="If New.Length = 2 And SaniyeVisibleCheck=True";
if (_new.length()==2 && __ref._saniyevisiblecheck /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="Saniye_Text.RequestFocus";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 }else 
{RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="Else If New.Length=0 Then";
if (_new.length()==0) { 
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Saat_Text.RequestFocus";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 }}
;
 }}
;
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="Log(LastException)";
__c.LogImpl("31114140",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.metroui_timeedit __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="ZamanDilimiOnikiYirmiDort=Props.Get(\"ZamanDilimiO";
__ref._zamandilimionikiyirmidort /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZamanDilimiOnikiYirmiDort")));
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="BackgroundColor=Props.Get(\"BackgroundColor\")";
__ref._backgroundcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="SaniyeVisibleCheck=Props.Get(\"SaniyeVisible\")";
__ref._saniyevisiblecheck /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SaniyeVisible")));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="TextColor=Props.Get(\"TextColor\")";
__ref._textcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="ClockColor=Props.Get(\"ClockColor\")";
__ref._clockcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("ClockColor")));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="mBase.AddView(AnaPanel,0,0,mBase.Width, mBase.Hei";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(BackgroundCo";
_panelarkaplanozellikleri.Initialize2((int)(Double.parseDouble(__ref._backgroundcolor /*String*/ )),(int) (0),(int) (0),(int)(Double.parseDouble(__ref._backgroundcolor /*String*/ )));
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="AnaPanel.Background=PanelArkaPlanOzellikleri";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="If SaniyeVisibleCheck=True Then";
if (__ref._saniyevisiblecheck /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/3,m";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 3di";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (3))),(int) (0),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/3,0,mBa";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="AnaPanel.AddView(DakikaLabel,Dakika_Text.Left +";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getLeft()+__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (3))),(int) (0),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="AnaPanel.AddView(Saniye_Text,Dakika_Text.Left+Da";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getLeft()+__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/2,m";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2di";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))),(int) (0),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="AnaPanel.AddView(Dakika_Text,mBase.Width/2,0,mBa";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=983085;
 //BA.debugLineNum = 983085;BA.debugLine="Saat_Text.HintColor = TextColor";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=983086;
 //BA.debugLineNum = 983086;BA.debugLine="Dakika_Text.HintColor = TextColor";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="Saniye_Text.HintColor = TextColor";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="IME.SetLengthFilter(Saat_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=983090;
 //BA.debugLineNum = 983090;BA.debugLine="IME.SetLengthFilter(Dakika_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=983091;
 //BA.debugLineNum = 983091;BA.debugLine="IME.SetLengthFilter(Saniye_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=983105;
 //BA.debugLineNum = 983105;BA.debugLine="Saat_Text.TextColor = TextColor";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=983106;
 //BA.debugLineNum = 983106;BA.debugLine="Dakika_Text.TextColor = TextColor";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=983107;
 //BA.debugLineNum = 983107;BA.debugLine="Saniye_Text.TextColor = TextColor";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=983108;
 //BA.debugLineNum = 983108;BA.debugLine="SaatLabel.TextColor= ClockColor";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._clockcolor /*String*/ )));
RDebugUtils.currentLine=983109;
 //BA.debugLineNum = 983109;BA.debugLine="DakikaLabel.TextColor= ClockColor";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._clockcolor /*String*/ )));
RDebugUtils.currentLine=983113;
 //BA.debugLineNum = 983113;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.metroui_timeedit __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="AnaPanel.Initialize(\"AnaPanel\")";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"AnaPanel");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="Saat_Text.Initialize(\"Saat\")";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Saat");
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="Dakika_Text.Initialize(\"Dakika\")";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Dakika");
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="Saniye_Text.Initialize(\"Saniye\")";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Saniye");
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="SaatLabel.Initialize(\"SaatLabel\")";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"SaatLabel");
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="DakikaLabel.Initialize(\"DakikaLabel\")";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"DakikaLabel");
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="Saatb4x=Saat_Text";
__ref._saatb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="Dakikab4x=Dakika_Text";
__ref._dakikab4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=917530;
 //BA.debugLineNum = 917530;BA.debugLine="Saniyeb4x=Saniye_Text";
__ref._saniyeb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="SaatLblb4x=SaatLabel";
__ref._saatlblb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="Dakikalblbb4x=DakikaLabel";
__ref._dakikalblbb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="Saat_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="Dakika_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="Saniye_Text.InputType=Saat_Text.INPUT_TYPE_NUMBER";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="Saat_Text.Gravity=Gravity.CENTER";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="Dakika_Text.Gravity=Gravity.CENTER";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="Saniye_Text.Gravity=Gravity.CENTER";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="SaatLabel.Gravity=Gravity.CENTER";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="DakikaLabel.Gravity=Gravity.CENTER";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="Saat_Text.Color = Colors.Transparent";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=917550;
 //BA.debugLineNum = 917550;BA.debugLine="Dakika_Text.Color=Colors.Transparent";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=917551;
 //BA.debugLineNum = 917551;BA.debugLine="Saniye_Text.Color=Colors.Transparent";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=917553;
 //BA.debugLineNum = 917553;BA.debugLine="Saat_Text.Hint=\"00\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=917554;
 //BA.debugLineNum = 917554;BA.debugLine="SaatLabel.Text=\":\"";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=917555;
 //BA.debugLineNum = 917555;BA.debugLine="Dakika_Text.Hint=\"00\"";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=917556;
 //BA.debugLineNum = 917556;BA.debugLine="DakikaLabel.Text=\":\"";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=917557;
 //BA.debugLineNum = 917557;BA.debugLine="Saniye_Text.Hint=\"00\"";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=917576;
 //BA.debugLineNum = 917576;BA.debugLine="Saat_Text.Color = Colors.Transparent";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=917577;
 //BA.debugLineNum = 917577;BA.debugLine="Dakika_Text.Color=Colors.Transparent";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=917578;
 //BA.debugLineNum = 917578;BA.debugLine="Saniye_Text.Color=Colors.Transparent";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=917581;
 //BA.debugLineNum = 917581;BA.debugLine="SaatLabel.Text=\":\"";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=917582;
 //BA.debugLineNum = 917582;BA.debugLine="DakikaLabel.Text=\":\"";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=917586;
 //BA.debugLineNum = 917586;BA.debugLine="Saat_Text.Hint=\"00\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=917588;
 //BA.debugLineNum = 917588;BA.debugLine="Dakika_Text.Hint=\"00\"";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=917590;
 //BA.debugLineNum = 917590;BA.debugLine="Saniye_Text.Hint=\"00\"";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=917603;
 //BA.debugLineNum = 917603;BA.debugLine="End Sub";
return "";
}
public String  _saat_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "saat_textchanged", false))
	 {return ((String) Debug.delegate(ba, "saat_textchanged", new Object[] {_old,_new}));}
int _saatex = 0;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub Saat_TextChanged (Old As String, New A";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Log(New.Length)";
__c.LogImpl("31048578",BA.NumberToString(_new.length()),0);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Log(Saat_Text.Text)";
__c.LogImpl("31048584",__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),0);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="If New.Length>=2 Then";
if (_new.length()>=2) { 
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Dim Saatex As Int = Saat_Text.Text";
_saatex = (int)(Double.parseDouble(__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="If ZamanDilimiOnikiYirmiDort = False Then";
if (__ref._zamandilimionikiyirmidort /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="If Saatex > 12 Then";
if (_saatex>12) { 
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Saat_Text.Hint = \"00\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="Saat_Text.Text = \"\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="Else if Saatex <= 12 Then";
if (_saatex<=12) { 
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="If New.Length = 2 Then";
if (_new.length()==2) { 
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="Dakika_Text.RequestFocus";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 }}
;
 }else 
{RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="Else if ZamanDilimiOnikiYirmiDort = True Then";
if (__ref._zamandilimionikiyirmidort /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="If Saatex > 24 Then";
if (_saatex>24) { 
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="Saat_Text.Hint = \"00\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="Saat_Text.Text = \"\"";
__ref._saat_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="Else if Saatex <= 24 Then";
if (_saatex<=24) { 
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="If New.Length = 2 Then";
if (_new.length()==2) { 
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="Dakika_Text.RequestFocus";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 }}
;
 }}
;
 };
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="Log(LastException)";
__c.LogImpl("31048628",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1048630;
 //BA.debugLineNum = 1048630;BA.debugLine="End Sub";
return "";
}
public String  _saniye_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "saniye_textchanged", false))
	 {return ((String) Debug.delegate(ba, "saniye_textchanged", new Object[] {_old,_new}));}
int _saniyeex = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub Saniye_TextChanged (Old As String, New";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Log(New.Length)";
__c.LogImpl("31179650",BA.NumberToString(_new.length()),0);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="If New.Length>=2 Then";
if (_new.length()>=2) { 
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Dim Saniyeex As Int = Saniye_Text.Text";
_saniyeex = (int)(Double.parseDouble(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="If Saniyeex > 59 Then";
if (_saniyeex>59) { 
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Saniye_Text.Hint = \"00\"";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Saniye_Text.Text = \"\"";
__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="Else If Saniye_Text.Text <= 59 Then";
if ((double)(Double.parseDouble(__ref._saniye_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))<=59) { 
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="If New.Length=0 Then";
if (_new.length()==0) { 
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="Dakika_Text.RequestFocus";
__ref._dakika_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 }}
;
 };
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="Log(LastException)";
__c.LogImpl("31179668",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="End Sub";
return "";
}
}