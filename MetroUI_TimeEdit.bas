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
#DesignerProperty: Key: ClockColor, DisplayName: Clock Color, FieldType: Color, DefaultValue: #FFFFFFFF, Description: Clock Color

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
	
	Private ZamanDilimiOnikiYirmiDort As Boolean
	Private SaniyeVisibleCheck As Boolean 'ignore
	Private BackgroundColor As String
	Private TextColor As String
	Private ClockColor As String 'ignore
	
	#If B4A
	Public Saat_Text As EditText
	Private Dakika_Text As EditText
	Private Saniye_Text As EditText
	Private SaatLabel As Label
	Private DakikaLabel As Label
	
	Private IME As IME
	#Else
	Public Saat_Text As TextField
	Private Dakika_Text As TextField
	Private Saniye_Text As TextField
	Private SaatLabel As Label
	Private DakikaLabel As Label
	#End If
	
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	

	AnaPanel.Initialize("AnaPanel")
	
	#IF B4A
	IME.Initialize("")
	
	#Else
	
	
	
	#End If

	Saat_Text.Initialize("Saat")
	Dakika_Text.Initialize("Dakika")
	Saniye_Text.Initialize("Saniye")
	
	SaatLabel.Initialize("SaatLabel")
	DakikaLabel.Initialize("DakikaLabel")


	Saatb4x=Saat_Text
	Dakikab4x=Dakika_Text
	Saniyeb4x=Saniye_Text
	
	SaatLblb4x=SaatLabel
	Dakikalblbb4x=DakikaLabel
	
	#IF B4A
	IME.Initialize("")
	
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
	
	#Else
	
	
	
	#End If
	
'	Saat_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS
'	Dakika_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS
'	Saniye_Text.InputType=Saat_Text.INPUT_TYPE_NUMBERS
	
'	Saat_Text
'	Dakika_Text.Gravity=Gravity.CENTER
'	Saniye_Text.Gravity=Gravity.CENTER
'	
'	SaatLabel.Gravity=Gravity.CENTER
'	DakikaLabel.Gravity=Gravity.CENTER
	
	Saat_Text.Color = Colors.Transparent
	Dakika_Text.Color=Colors.Transparent
	Saniye_Text.Color=Colors.Transparent
		
		
	SaatLabel.Text=":"
	DakikaLabel.Text=":"
	
	
	#if b4a
	Saat_Text.Hint="00"
	
	Dakika_Text.Hint="00"
	
	Saniye_Text.Hint="00"
	 #else
	Saat_Text.HintText="00"
	
	Dakika_Text.HintText="00"
	
	Saniye_Text.HintText="00"
	#End If
	
	
	
	
	
End Sub


Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	Tag = mBase.Tag
	mBase.Tag = Me
	
	ZamanDilimiOnikiYirmiDort=Props.Get("ZamanDilimiOnikiYirmiDort")
	BackgroundColor=Props.Get("BackgroundColor")
	SaniyeVisibleCheck=Props.Get("SaniyeVisible")
	TextColor=Props.Get("TextColor")
	ClockColor=Props.Get("ClockColor")
	
	mBase.AddView(AnaPanel,0,0,mBase.Width, mBase.Height)
	
	
	#if b4a
	
	Dim PanelArkaPlanOzellikleri As ColorDrawable
	PanelArkaPlanOzellikleri.Initialize2(BackgroundColor,0,0,BackgroundColor)
	AnaPanel.Background=PanelArkaPlanOzellikleri
	
	#else b4i
	
	MyPanel.SetBorder(BorderWidth,BorderColor,ArkaPlanRadius)
	
	
	#End If
	
	
	
	
	
	If SaniyeVisibleCheck=True Then
		AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/3,mBase.Height)
		AnaPanel.AddView(SaatLabel,Saat_Text.Width - 3dip ,0,5dip,mBase.Height-3dip)
		AnaPanel.AddView(Dakika_Text,mBase.Width/3,0,mBase.Width/3,mBase.Height)
		AnaPanel.AddView(DakikaLabel,Dakika_Text.Left + Dakika_Text.Width - 3dip,0,5dip,mBase.Height-3dip)
		AnaPanel.AddView(Saniye_Text,Dakika_Text.Left+Dakika_Text.Width,0,mBase.Width/3,mBase.Height)
	Else ' saniye yoksa
		AnaPanel.AddView(Saat_Text,0%x,0,mBase.Width/2,mBase.Height)
		AnaPanel.AddView(SaatLabel,Saat_Text.Width - 2dip ,0,5dip,mBase.Height-3dip)
		AnaPanel.AddView(Dakika_Text,mBase.Width/2,0,mBase.Width/2,mBase.Height)
	End If
	
	#if b4a
	
	Saat_Text.HintColor = TextColor
	Dakika_Text.HintColor = TextColor
	Saniye_Text.HintColor = TextColor
	
	IME.SetLengthFilter(Saat_Text, 2)
	IME.SetLengthFilter(Dakika_Text, 2)
	IME.SetLengthFilter(Saniye_Text, 2)
	
	#else b4i
	

	Saat_Text.TintColor = TextColor
	Dakika_Text.TintColor = TextColor
	Saniye_Text.TintColor = TextColor
	
	
	#End If
	
	
	
	Saat_Text.TextColor = TextColor
	Dakika_Text.TextColor = TextColor
	Saniye_Text.TextColor = TextColor
	SaatLabel.TextColor= ClockColor
	DakikaLabel.TextColor= ClockColor
	
	
	
End Sub

Private Sub Saat_TextChanged (Old As String, New As String)
	Try
		Log(New.Length)
		
		
		
		
		
		Log(Saat_Text.Text)
		
		Dim Saatex As Int = Saat_Text.Text
		
		If ZamanDilimiOnikiYirmiDort = False Then
			
			If Saatex > 12 Then
				
				#if b4a 
				Saat_Text.Hint = "00"
				#else
				Saat_Text.HintText = "00"
				#End If
				
				Saat_Text.Text = ""
				
			Else if Saatex <= 12 Then
				If New.Length = 2 Then
					Dakika_Text.RequestFocus
				End If
			End If

		Else if ZamanDilimiOnikiYirmiDort = True Then
	
			If Saatex > 24 Then
				
				#if b4a 
				Saat_Text.Hint = "00"
				#else
				Saat_Text.HintText = "00"
				#End If
				
				Saat_Text.Text = ""
				
			Else if Saatex <= 24 Then
				If New.Length = 2 Then
					Dakika_Text.RequestFocus
				End If
			End If
			
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Dakika_TextChanged (Old As String, New As String)
	Try
		Log(New.Length)
		
		Dim Dakikaex As Int = Dakika_Text.Text
		
		If Dakikaex > 59 Then
			#if b4a 
			Dakika_Text.Hint = "00"
			#else
			Dakika_Text.HintText = "00"
			#End If
			Dakika_Text.Text = ""
		else if Dakikaex <= 59 Then
			If New.Length = 2 And SaniyeVisibleCheck=True Then
				Saniye_Text.RequestFocus
			Else If New.Length=0 Then
				Saat_Text.RequestFocus
			End If
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub Saniye_TextChanged (Old As String, New As String)
	Try
		Log(New.Length)
		
		Dim Saniyeex As Int = Saniye_Text.Text
		
		If Saniyeex > 59 Then
			#if b4a 
			Saniye_Text.Hint = "00"
			#else
			Saniye_Text.HintText = "00"
			#End If
			Saniye_Text.Text = ""
		Else If Saniye_Text.Text <= 59 Then
			If New.Length=0 Then
				Dakika_Text.RequestFocus
			End If
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Public Sub Time(HourMiniute As Boolean)
	If HourMiniute = True Then
	
		Dim SaatveDakika As String = Saat_Text.Text & ":" & Dakika_Text.Text
	
		Return SaatveDakika
		
		Else
			
		Dim SaatveDakikaveSaniye As String = Saat_Text.Text & ":" & Dakika_Text.Text & ":" & Saniye_Text.Text
	
		Return SaatveDakikaveSaniye
	
	End If
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub