
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class metroui_timeedit {
    public static RemoteObject myClass;
	public metroui_timeedit() {
	}
    public static PCBA staticBA = new PCBA(null, metroui_timeedit.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _anapanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _saatb4x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _saatlblb4x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dakikab4x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dakikalblbb4x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _saniyeb4x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _saat_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _dakika_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _saniye_text = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _saatlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dakikalabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _saniyevisiblecheck = RemoteObject.createImmutable(false);
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable("");
public static RemoteObject _textcolor = RemoteObject.createImmutable("");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AnaPanel",_ref.getField(false, "_anapanel"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"Dakika_Text",_ref.getField(false, "_dakika_text"),"Dakikab4x",_ref.getField(false, "_dakikab4x"),"DakikaLabel",_ref.getField(false, "_dakikalabel"),"Dakikalblbb4x",_ref.getField(false, "_dakikalblbb4x"),"IME",_ref.getField(false, "_ime"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Saat_Text",_ref.getField(false, "_saat_text"),"Saatb4x",_ref.getField(false, "_saatb4x"),"SaatLabel",_ref.getField(false, "_saatlabel"),"SaatLblb4x",_ref.getField(false, "_saatlblb4x"),"Saniye_Text",_ref.getField(false, "_saniye_text"),"Saniyeb4x",_ref.getField(false, "_saniyeb4x"),"SaniyeVisibleCheck",_ref.getField(false, "_saniyevisiblecheck"),"Tag",_ref.getField(false, "_tag"),"TextColor",_ref.getField(false, "_textcolor"),"xui",_ref.getField(false, "_xui")};
}
}