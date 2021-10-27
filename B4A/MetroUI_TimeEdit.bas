B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
#DesignerProperty: Key: ZamanDilimiOnikiYirmiDort, DisplayName:  24 Hour Time, FieldType: Boolean, DefaultValue: True, Description: If you check it will be set for the 24-hour time frame.
#DesignerProperty: Key: SaniyeVisible, DisplayName: Second Visible, FieldType: Boolean, DefaultValue: False, Description: Second Visible 'true , false'
#DesignerProperty: Key: BackgroundColor, DisplayName: Background Color, FieldType: Color, DefaultValue: #FFFFFFFF, Description: Background Color
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: #FF000000, Description: Text Color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	
	
	Private AnaPanel As Panel
	
	Private Saatb4x As B4XView  'ignore
	Private SaatLblb4x As B4XView'ignore
	Private Dakikab4x As B4XView'ignore
	Private Dakikalblbb4x As B4XView'ignore
	Private Saniyeb4x As B4XView'ignore
	
	#if b4a
	Public Saat_Text As EditText
	Private Dakika_Text As EditText
	Private Saniye_Text As EditText
	Private SaatLabel As Label
	Private DakikaLabel As Label
	
	Private SaniyeVisibleCheck As Boolean 'ignore
	Private BackgroundColor As String
	Private TextColor As String
	
	Private IME As IME
	#else
	 Private MyTextBoxB4X As TextField
	#end if
	
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	IME.Initialize("")
	AnaPanel.Initialize("AnaPanel")
	
	#IF B4A
	Saat_Text.Initialize("Saat")
	Dakika_Text.Initialize("Dakika")
	Saniye_Text.Initialize("Saniye")
	
	SaatLabel.Initialize("SaatLabel")
	DakikaLabel.Initialize("DakikaLabel")
	
	#ELSE 
		MyTextBoxB4X.Initialize("MyTextBox")
		MyTextBoxB4X.BorderStyle=0
		MyTextBoxB4X.ReturnKey=0
	#End If

	Saatb4x=Saat_Text
	Dakikab4x=Dakika_Text
	Saniyeb4x=Saniye_Text
	
	SaatLblb4x=SaatLabel
	Dakikalblbb4x=DakikaLabel
	
	Saat_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS
	Dakika_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS
	Saniye_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS
	
	Saat_Text.Gravity=Gravity.CENTER
	Dakika_Text.Gravity=Gravity.CENTER
	Saniye_Text.Gravity=Gravity.CENTER
	
	SaatLabel.Gravity=Gravity.CENTER
	DakikaLabel.Gravity=Gravity.CENTER
	
	Saat_Text.Color = Colors.Transparent
	Dakika_Text.Color=Colors.Transparent
	Saniye_Text.Color=Colors.Transparent
		
	Saat_Text.Hint="00"
	SaatLabel.Text=":"
	Dakika_Text.Hint="00"
	DakikaLabel.Text=":"
	Saniye_Text.Hint="00"
	
	
	
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	Tag = mBase.Tag
	mBase.Tag = Me
	
	BackgroundColor=Props.get("BackgroundColor")
	SaniyeVisibleCheck=Props.Get("SaniyeVisible")
	TextColor=Props.Get("TextColor")
	
	mBase.AddView(AnaPanel,0,0,mBase.Width, mBase.Height)
	
	Dim PanelArkaPlanOzellikleri As ColorDrawable
	PanelArkaPlanOzellikleri.Initialize2(BackgroundColor,0,0,BackgroundColor)
	AnaPanel.Background=PanelArkaPlanOzellikleri
	
	
	
	If SaniyeVisibleCheck=True Then
		AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/3,mBase.Height)
		AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2dip ,0,5dip,mBase.Height)
		AnaPanel.AddView(Dakika_Text,mBase.Width/3,0,mBase.Width/3,mBase.Height)
		AnaPanel.AddView(DakikaLabel,Dakika_Text.Left + Dakika_Text.Width - 2dip,0,5dip,mBase.Height)
		AnaPanel.AddView(Saniye_Text,Dakika_Text.Left+Dakika_Text.Width,0,mBase.Width/3,mBase.Height)
	Else ' saniye yoksa
		AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/2,mBase.Height)
		AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2dip ,0,5dip,mBase.Height-3dip)
		AnaPanel.AddView(Dakika_Text,mBase.Width/2,0,mBase.Width/2,mBase.Height)
	End If
	
	Saat_Text.HintColor = TextColor
	Saat_Text.TextColor = TextColor
	
	Dakika_Text.HintColor = TextColor
	Dakika_Text.TextColor = TextColor
	
	Saniye_Text.HintColor = TextColor
	Saniye_Text.TextColor = TextColor
	
	IME.SetLengthFilter(Saat_Text, 2)
	IME.SetLengthFilter(Dakika_Text, 2)
	IME.SetLengthFilter(Saniye_Text, 2)
	
	
End Sub

Private Sub Saat_TextChanged (Old As String, New As String)
	Try
		Log(New.Length)
		
		
		
		
		
		Log(Saat_Text.Text)
		
		Dim Saatex As Int = Saat_Text.Text
		
			If Saatex > 12 Then
				
			
				Saat_Text.Hint = 0
				Saat_Text.Text = ""
				
			Else if Saatex <= 12 Then
				If New.Length = 2 Then
					Dakika_Text.RequestFocus
				End If
			End If
			
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Dakika_TextChanged (Old As String, New As String)
	Try
		Log(New.Length)
		
		If New.Length = 2 And SaniyeVisibleCheck=True Then
			Saniye_Text.RequestFocus
			
		Else if New.Length=0 Then
				
			Saat_Text.RequestFocus
			
		End If
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Saniye_TextChanged (Old As String, New As String)
	Try
		Log(New.Length)
	
		 If New.Length=0 Then
				
			Dakika_Text.RequestFocus
			
		End If
		
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub