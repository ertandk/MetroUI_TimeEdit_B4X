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
public anywheresoftware.b4a.objects.EditTextWrapper _hour_text = null;
public anywheresoftware.b4a.objects.EditTextWrapper _minute_text = null;
public anywheresoftware.b4a.objects.EditTextWrapper _second_text = null;
public anywheresoftware.b4a.objects.LabelWrapper _saatlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _dakikalabel = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _time(b4a.example.metroui_timeedit __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "time", false))
	 {return ((String) Debug.delegate(ba, "time", null));}
String _saatvedakika = "";
String _saatvedakikavesaniye = "";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Time";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If SaniyeVisibleCheck=False And Hour_Text.Text.Le";
if (__ref._saniyevisiblecheck /*boolean*/ ==__c.False && __ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()!=0 && __ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()!=0) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim SaatveDakika As String = Hour_Text.Text & \":";
_saatvedakika = __ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+":"+__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Return SaatveDakika";
if (true) return _saatvedakika;
 }else 
{RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Else if SaniyeVisibleCheck=True And Hour_Text.Tex";
if (__ref._saniyevisiblecheck /*boolean*/ ==__c.True && __ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()!=0 && __ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()!=0 && __ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()!=0) { 
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim SaatveDakikaveSaniye As String = Hour_Text.T";
_saatvedakikavesaniye = __ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+":"+__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+":"+__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Return SaatveDakikaveSaniye";
if (true) return _saatvedakikavesaniye;
 }}
;
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.metroui_timeedit __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.metroui_timeedit __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Private Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Private AnaPanel As Panel";
_anapanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Private Saatb4x As B4XView  'ignore";
_saatb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Private SaatLblb4x As B4XView'ignore";
_saatlblb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Private Dakikab4x As B4XView'ignore";
_dakikab4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Private Dakikalblbb4x As B4XView'ignore";
_dakikalblbb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Private Saniyeb4x As B4XView'ignore";
_saniyeb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Private ZamanDilimiOnikiYirmiDort As Boolean";
_zamandilimionikiyirmidort = false;
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="Private SaniyeVisibleCheck As Boolean 'ignore";
_saniyevisiblecheck = false;
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="Private BackgroundColor As String";
_backgroundcolor = "";
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="Private TextColor As String";
_textcolor = "";
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="Private ClockColor As String 'ignore";
_clockcolor = "";
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Public Hour_Text As EditText";
_hour_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="Private Minute_Text As EditText";
_minute_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="Private Second_Text As EditText";
_second_text = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Private SaatLabel As Label";
_saatlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="Private DakikaLabel As Label";
_dakikalabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.metroui_timeedit __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="ZamanDilimiOnikiYirmiDort=Props.Get(\"ZamanDilimiO";
__ref._zamandilimionikiyirmidort /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZamanDilimiOnikiYirmiDort")));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="BackgroundColor=Props.Get(\"BackgroundColor\")";
__ref._backgroundcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="SaniyeVisibleCheck=Props.Get(\"SaniyeVisible\")";
__ref._saniyevisiblecheck /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SaniyeVisible")));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="TextColor=Props.Get(\"TextColor\")";
__ref._textcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="ClockColor=Props.Get(\"ClockColor\")";
__ref._clockcolor /*String*/  = BA.ObjectToString(_props.Get((Object)("ClockColor")));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="mBase.AddView(AnaPanel,0,0,mBase.Width, mBase.Hei";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(BackgroundCo";
_panelarkaplanozellikleri.Initialize2((int)(Double.parseDouble(__ref._backgroundcolor /*String*/ )),(int) (0),(int) (0),(int)(Double.parseDouble(__ref._backgroundcolor /*String*/ )));
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="AnaPanel.Background=PanelArkaPlanOzellikleri";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
RDebugUtils.currentLine=1114152;
 //BA.debugLineNum = 1114152;BA.debugLine="If SaniyeVisibleCheck=True Then";
if (__ref._saniyevisiblecheck /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=1114153;
 //BA.debugLineNum = 1114153;BA.debugLine="AnaPanel.AddView(Hour_Text,0%x,0,mBase.Width/3,m";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1114154;
 //BA.debugLineNum = 1114154;BA.debugLine="AnaPanel.AddView(SaatLabel,Hour_Text.Width - 3di";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (3))),(int) (0),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=1114155;
 //BA.debugLineNum = 1114155;BA.debugLine="AnaPanel.AddView(Minute_Text,mBase.Width/3,0,mBa";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="AnaPanel.AddView(DakikaLabel,Minute_Text.Left +";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getLeft()+__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (3))),(int) (0),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=1114157;
 //BA.debugLineNum = 1114157;BA.debugLine="AnaPanel.AddView(Second_Text,Minute_Text.Left+Mi";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getLeft()+__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=1114159;
 //BA.debugLineNum = 1114159;BA.debugLine="AnaPanel.AddView(Hour_Text,0%x,0,mBase.Width/2,m";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1114160;
 //BA.debugLineNum = 1114160;BA.debugLine="AnaPanel.AddView(SaatLabel,Hour_Text.Width - 2di";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))),(int) (0),__c.DipToCurrent((int) (5)),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=1114161;
 //BA.debugLineNum = 1114161;BA.debugLine="AnaPanel.AddView(Minute_Text,mBase.Width/2,0,mBa";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=1114166;
 //BA.debugLineNum = 1114166;BA.debugLine="Hour_Text.HintColor = TextColor";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=1114167;
 //BA.debugLineNum = 1114167;BA.debugLine="Minute_Text.HintColor = TextColor";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=1114168;
 //BA.debugLineNum = 1114168;BA.debugLine="Second_Text.HintColor = TextColor";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHintColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=1114170;
 //BA.debugLineNum = 1114170;BA.debugLine="IME.SetLengthFilter(Hour_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=1114171;
 //BA.debugLineNum = 1114171;BA.debugLine="IME.SetLengthFilter(Minute_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=1114172;
 //BA.debugLineNum = 1114172;BA.debugLine="IME.SetLengthFilter(Second_Text, 2)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetLengthFilter((android.widget.EditText)(__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (2));
RDebugUtils.currentLine=1114186;
 //BA.debugLineNum = 1114186;BA.debugLine="Hour_Text.TextColor = TextColor";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=1114187;
 //BA.debugLineNum = 1114187;BA.debugLine="Minute_Text.TextColor = TextColor";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=1114188;
 //BA.debugLineNum = 1114188;BA.debugLine="Second_Text.TextColor = TextColor";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._textcolor /*String*/ )));
RDebugUtils.currentLine=1114189;
 //BA.debugLineNum = 1114189;BA.debugLine="SaatLabel.TextColor= ClockColor";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._clockcolor /*String*/ )));
RDebugUtils.currentLine=1114190;
 //BA.debugLineNum = 1114190;BA.debugLine="DakikaLabel.TextColor= ClockColor";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._clockcolor /*String*/ )));
RDebugUtils.currentLine=1114194;
 //BA.debugLineNum = 1114194;BA.debugLine="End Sub";
return "";
}
public String  _hour_text_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "hour_text_textchanged", false))
	 {return ((String) Debug.delegate(ba, "hour_text_textchanged", new Object[] {_old,_new}));}
int _saatex = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub Hour_Text_TextChanged (Old As String,";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="If New.Length>=2 Then";
if (_new.length()>=2) { 
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Dim Saatex As Int = Hour_Text.Text";
_saatex = (int)(Double.parseDouble(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="If ZamanDilimiOnikiYirmiDort = False Then";
if (__ref._zamandilimionikiyirmidort /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="If Saatex > 12 Then";
if (_saatex>12) { 
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Hour_Text.Hint = \"00\"";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="Hour_Text.Text = \"\"";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="Else if Saatex <= 12 Then";
if (_saatex<=12) { 
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="If New.Length = 2 Then";
if (_new.length()==2) { 
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="Minute_Text.RequestFocus";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 }}
;
 }else 
{RDebugUtils.currentLine=1179675;
 //BA.debugLineNum = 1179675;BA.debugLine="Else if ZamanDilimiOnikiYirmiDort = True Then";
if (__ref._zamandilimionikiyirmidort /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=1179677;
 //BA.debugLineNum = 1179677;BA.debugLine="If Saatex > 24 Then";
if (_saatex>24) { 
RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="Hour_Text.Hint = \"00\"";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1179685;
 //BA.debugLineNum = 1179685;BA.debugLine="Hour_Text.Text = \"\"";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1179687;
 //BA.debugLineNum = 1179687;BA.debugLine="Else if Saatex <= 24 Then";
if (_saatex<=24) { 
RDebugUtils.currentLine=1179688;
 //BA.debugLineNum = 1179688;BA.debugLine="If New.Length = 2 Then";
if (_new.length()==2) { 
RDebugUtils.currentLine=1179689;
 //BA.debugLineNum = 1179689;BA.debugLine="Minute_Text.RequestFocus";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 }}
;
 }}
;
 };
 } 
       catch (Exception e25) {
			ba.setLastException(e25);RDebugUtils.currentLine=1179697;
 //BA.debugLineNum = 1179697;BA.debugLine="Log(LastException)";
__c.LogImpl("71179697",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1179699;
 //BA.debugLineNum = 1179699;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.metroui_timeedit __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="AnaPanel.Initialize(\"AnaPanel\")";
__ref._anapanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"AnaPanel");
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="Hour_Text.Initialize(\"Hour_Text\")";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Hour_Text");
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Minute_Text.Initialize(\"Minute_Text\")";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Minute_Text");
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="Second_Text.Initialize(\"Second_Text\")";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"Second_Text");
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="SaatLabel.Initialize(\"SaatLabel\")";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"SaatLabel");
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="DakikaLabel.Initialize(\"DakikaLabel\")";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"DakikaLabel");
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="Saatb4x=Hour_Text";
__ref._saatb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="Dakikab4x=Minute_Text";
__ref._dakikab4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="Saniyeb4x=Second_Text";
__ref._saniyeb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="SaatLblb4x=SaatLabel";
__ref._saatlblb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="Dakikalblbb4x=DakikaLabel";
__ref._dakikalblbb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="Hour_Text.InputType=Hour_Text.INPUT_TYPE_NUMBERS";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="Minute_Text.InputType=Hour_Text.INPUT_TYPE_NUMBER";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="Second_Text.InputType=Hour_Text.INPUT_TYPE_NUMBER";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="Hour_Text.Gravity=Gravity.CENTER";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="Minute_Text.Gravity=Gravity.CENTER";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="Second_Text.Gravity=Gravity.CENTER";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="SaatLabel.Gravity=Gravity.CENTER";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="DakikaLabel.Gravity=Gravity.CENTER";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048621;
 //BA.debugLineNum = 1048621;BA.debugLine="Hour_Text.Color = Colors.Transparent";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1048622;
 //BA.debugLineNum = 1048622;BA.debugLine="Minute_Text.Color=Colors.Transparent";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="Second_Text.Color=Colors.Transparent";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1048625;
 //BA.debugLineNum = 1048625;BA.debugLine="Hour_Text.Hint=\"00\"";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048626;
 //BA.debugLineNum = 1048626;BA.debugLine="SaatLabel.Text=\":\"";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=1048627;
 //BA.debugLineNum = 1048627;BA.debugLine="Minute_Text.Hint=\"00\"";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="DakikaLabel.Text=\":\"";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=1048629;
 //BA.debugLineNum = 1048629;BA.debugLine="Second_Text.Hint=\"00\"";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048658;
 //BA.debugLineNum = 1048658;BA.debugLine="Hour_Text.Color = Colors.Transparent";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1048659;
 //BA.debugLineNum = 1048659;BA.debugLine="Minute_Text.Color=Colors.Transparent";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1048660;
 //BA.debugLineNum = 1048660;BA.debugLine="Second_Text.Color=Colors.Transparent";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1048663;
 //BA.debugLineNum = 1048663;BA.debugLine="SaatLabel.Text=\":\"";
__ref._saatlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=1048664;
 //BA.debugLineNum = 1048664;BA.debugLine="DakikaLabel.Text=\":\"";
__ref._dakikalabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(":"));
RDebugUtils.currentLine=1048668;
 //BA.debugLineNum = 1048668;BA.debugLine="Hour_Text.Hint=\"00\"";
__ref._hour_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048670;
 //BA.debugLineNum = 1048670;BA.debugLine="Minute_Text.Hint=\"00\"";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048672;
 //BA.debugLineNum = 1048672;BA.debugLine="Second_Text.Hint=\"00\"";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1048685;
 //BA.debugLineNum = 1048685;BA.debugLine="End Sub";
return "";
}
public String  _minute_text_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "minute_text_textchanged", false))
	 {return ((String) Debug.delegate(ba, "minute_text_textchanged", new Object[] {_old,_new}));}
int _dakikaex = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub Minute_Text_TextChanged (Old As String";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Try";
try {RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="If New.Length>=2 Then";
if (_new.length()>=2) { 
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Dim Dakikaex As Int = Minute_Text.Text";
_dakikaex = (int)(Double.parseDouble(__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="If Dakikaex > 59 Then";
if (_dakikaex>59) { 
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Minute_Text.Hint = \"00\"";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="Minute_Text.Text = \"\"";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="else if Dakikaex <= 59 Then";
if (_dakikaex<=59) { 
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="If New.Length = 2 And SaniyeVisibleCheck=True";
if (_new.length()==2 && __ref._saniyevisiblecheck /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="Second_Text.RequestFocus";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 }else 
{RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="Else If New.Length=2 Then";
if (_new.length()==2) { 
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
 }else 
{RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="else if New.Length=0 Then";
if (_new.length()==0) { 
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="Minute_Text.RequestFocus";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 }}}
;
 }}
;
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=1245221;
 //BA.debugLineNum = 1245221;BA.debugLine="Log(LastException)";
__c.LogImpl("71245221",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1245223;
 //BA.debugLineNum = 1245223;BA.debugLine="End Sub";
return "";
}
public String  _second_text_textchanged(b4a.example.metroui_timeedit __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_timeedit";
if (Debug.shouldDelegate(ba, "second_text_textchanged", false))
	 {return ((String) Debug.delegate(ba, "second_text_textchanged", new Object[] {_old,_new}));}
int _saniyeex = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub Second_Text_TextChanged (Old As String";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Try";
try {RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="If New.Length>=2 Then";
if (_new.length()>=2) { 
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Dim Saniyeex As Int = Second_Text.Text";
_saniyeex = (int)(Double.parseDouble(__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="If Saniyeex > 59 Then";
if (_saniyeex>59) { 
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Second_Text.Hint = \"00\"";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setHint("00");
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="Second_Text.Text = \"\"";
__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else 
{RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Else If Second_Text.Text <= 59 Then";
if ((double)(Double.parseDouble(__ref._second_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))<=59) { 
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="If New.Length=2 Then";
if (_new.length()==2) { 
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
 };
 }}
;
 };
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="If New.Length=0 Then";
if (_new.length()==0) { 
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="Minute_Text.RequestFocus";
__ref._minute_text /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="Log(LastException)";
__c.LogImpl("71310757",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=1310759;
 //BA.debugLineNum = 1310759;BA.debugLine="End Sub";
return "";
}
}