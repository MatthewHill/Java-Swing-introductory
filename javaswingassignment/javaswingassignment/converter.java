



import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class converter extends JFrame{

	JTextField MetersField = null;
	JTextField KiloMetersField = null;
	JTextField MilesField = null;
	JTextField FeetField = null;
	JTextField InchesField = null;
	JTextField LightYearsField = null;
	JTextField CentimetersField = null;
	JTextField JoulesField = null;
	JTextField CaloriesField = null;
	JTextField VoltsField = null;
	JTextField WattsField = null;
	JTextField ThermalField = null;
	JTextField USThermsField = null;
	JTextField GallonofGasolineField = null;

	
	JTextArea area = new JTextArea(6,50);
	MyListener listener = new MyListener();
	MyListener reset = new MyListener();
	
	  protected JComponent makeTextPanel(String text) {
	        JPanel panel = new JPanel(false);
	        JLabel filler = new JLabel(text);
	        filler.setHorizontalAlignment(JLabel.CENTER);
	        panel.setLayout(new GridLayout(3, 0));
	        
	        panel.add(filler);
	        return panel;
	  }
	public converter() {
	
	
		 JTabbedPane converterPane = new JTabbedPane();
		 JFrame testframe = new JFrame("Converter");

		   JComponent panel1 = makeTextPanel("");
	        converterPane.addTab("Distance",  null, panel1,
	                "Converts Distances");
	        converterPane.setMnemonicAt(0, KeyEvent.VK_1);
	        JComponent panel2 = makeTextPanel("");
	        converterPane.addTab("Energy", null, panel2,
	                "Converts Energy");
	        converterPane.setMnemonicAt(1, KeyEvent.VK_2);
	 	   JPanel converterPanel = new JPanel();
	 	   converterPanel.add(converterPane);
	 	   testframe.add(converterPanel);
		
		JPanel MetersPanel = new JPanel();
		panel1.add(MetersPanel);
		JLabel Meters = new JLabel("Meters ");
		MetersPanel.add(Meters);
		
		JPanel KiloMetersPanel = new JPanel();
		panel1.add(KiloMetersPanel);
		JLabel KiloMeters = new JLabel("KiloMeters");
		KiloMetersPanel.add(KiloMeters);
		
		JPanel MilesPanel = new JPanel();
		panel1.add(MilesPanel);
		JLabel Miles = new JLabel("Miles ");
		MilesPanel.add(Miles);
		
		JPanel FeetPanel = new JPanel();
		panel1.add(FeetPanel);
		JLabel Feet = new JLabel("Feet ");
		FeetPanel.add(Feet);
		
		JPanel InchesPanel = new JPanel();
		panel1.add(InchesPanel);
		JLabel Inches = new JLabel("Inches ");
		InchesPanel.add(Inches);
		
		JPanel LightYearsPanel = new JPanel();
		panel1.add(LightYearsPanel);
		JLabel LightYears = new JLabel("Light Years ");
		LightYearsPanel.add(LightYears);
		
		JPanel CentimetersPanel = new JPanel();
		panel1.add(CentimetersPanel);
		JLabel Centimeters = new JLabel("Centimeters ");
		CentimetersPanel.add(Centimeters);

		MetersField = new JTextField();
		MetersField.setText("1");
		Font f = new Font("Roman", Font.BOLD, 12);
		MetersField.setFont(f);
		MetersField.setEditable(true);
		MetersField.addMouseListener(new MyMouseListener());
		MetersField.setColumns(6);
		MetersPanel.add(MetersField);

		KiloMetersField = new JTextField();
		KiloMetersField.setText(".001");
		KiloMetersField.setFont(f);
		KiloMetersField.setEditable(true);
		KiloMetersField.addMouseListener(new MyMouseListener());
		KiloMetersField.setColumns(6);
		KiloMetersPanel.add(KiloMetersField);

		FeetField = new JTextField();
		FeetField.setText("3.28084");
		FeetField.setFont(f);
		FeetField.setEditable(true);
		FeetField.addMouseListener(new MyMouseListener());
		FeetField.setColumns(6);
		FeetPanel.add(FeetField);
		
		MilesField = new JTextField();
		MilesField.setText("0.000621371");
		MilesField.setFont(f);
		MilesField.setEditable(true);
		MilesField.addMouseListener(new MyMouseListener());
		MilesField.setColumns(6);
		MilesPanel.add(MilesField);
		
		InchesField = new JTextField();
		InchesField.setText("39.3701");
		InchesField.setFont(f);
		InchesField.setEditable(true);
		InchesField.addMouseListener(new MyMouseListener());
		InchesField.setColumns(6);
		InchesPanel.add(InchesField);
		
		CentimetersField = new JTextField();
		CentimetersField.setText("100");
		CentimetersField.setFont(f);
		CentimetersField.setEditable(true);
		CentimetersField.addMouseListener(new MyMouseListener());
		CentimetersField.setColumns(6);
		CentimetersPanel.add(CentimetersField);
		
		LightYearsField = new JTextField();
		LightYearsField.setText("1.057e-16");
		LightYearsField.setFont(f);
		LightYearsField.setEditable(true);
		LightYearsField.addMouseListener(new MyMouseListener());
		LightYearsField.setColumns(6);
		LightYearsPanel.add(LightYearsField);
		
		JPanel JoulePanel = new JPanel();
		panel2.add(JoulePanel);
		JLabel Joules = new JLabel("Joules ");
		JoulePanel.add(Joules);
		
		JPanel CaloriePanel = new JPanel();
		panel2.add(CaloriePanel);
		JLabel Calories = new JLabel("Calories ");
		CaloriePanel.add(Calories);
		
		JPanel VoltPanel = new JPanel();
		panel2.add(VoltPanel);
		JLabel Volts = new JLabel("Volts ");
		VoltPanel.add(Volts);
		
		JPanel WattPanel = new JPanel();
		panel2.add(WattPanel);
		JLabel Watts = new JLabel("Watts ");
		WattPanel.add(Watts);
	
		JPanel ThermalPanel = new JPanel();
		panel2.add(ThermalPanel);
		JLabel ThermalUnits = new JLabel("Thermal Units ");
		ThermalPanel.add(ThermalUnits);
		
		JPanel USThermPanel = new JPanel();
		panel2.add(USThermPanel);
		JLabel USTherms = new JLabel("USTherms ");
		USThermPanel.add(USTherms);
		
		/* JPanel GallonofGasolinePanel = new JPanel();
		panel2.add(GallonofGasolinePanel);
		JLabel GallonofGasoline = new JLabel("Gallons of Gasoline ");
		GallonofGasolinePanel.add(GallonofGasoline); */
		
		
		
		JoulesField = new JTextField();
		JoulesField.setText("1");
		JoulesField.setFont(f);
		JoulesField.setEditable(true);
		JoulesField.addMouseListener(new MyMouseListener());
		JoulesField.setColumns(6);
		JoulePanel.add(JoulesField);
		
		CaloriesField = new JTextField();
		CaloriesField.setText("0.000239006");
		CaloriesField.setFont(f);
		CaloriesField.setEditable(true);
		CaloriesField.addMouseListener(new MyMouseListener());
		CaloriesField.setColumns(6);
		CaloriePanel.add(CaloriesField);
		
		VoltsField = new JTextField();
		VoltsField.setText("6.242e+18");
		VoltsField.setFont(f);
		VoltsField.setEditable(true);
		VoltsField.addMouseListener(new MyMouseListener());
		VoltsField.setColumns(6);
		VoltPanel.add(VoltsField);
		
		WattsField = new JTextField();
		WattsField.setText("0.000277778");
		WattsField.setFont(f);
		WattsField.setEditable(true);
		WattsField.addMouseListener(new MyMouseListener());
		WattsField.setColumns(6);
		WattPanel.add(WattsField);
		
		ThermalField = new JTextField();
		ThermalField.setText("0.000947817");
		ThermalField.setFont(f);
		ThermalField.setEditable(true);
		ThermalField.addMouseListener(new MyMouseListener());
		ThermalField.setColumns(6);
		ThermalPanel.add(ThermalField);
		
		USThermsField = new JTextField();
		USThermsField.setText("9.4804e-9");
		USThermsField.setFont(f);
		USThermsField.setEditable(true);
		USThermsField.addMouseListener(new MyMouseListener());
		USThermsField.setColumns(6);
		USThermPanel.add(USThermsField);
		
		/*GallonofGasolineField = new JTextField();
		GallonofGasolineField.setText("1");
		GallonofGasolineField.setFont(f);
		GallonofGasolineField.setEditable(true);
		GallonofGasolineField.addMouseListener(new MyMouseListener());
		GallonofGasolineField.setColumns(6);
		GallonofGasolinePanel.add(GallonofGasolineField); */
		
		
		
		
		/*JButton calculate = new JButton("Calculate");
		calculate.setName("calculate");
		calculate.addActionListener(listener);
		panel1.add(calculate);	*/
		
	
		
		JButton MetersFieldButton = new JButton ("Calculate from Meters");  //meters calculate button
		MetersFieldButton.setName("MetersFieldButton");
		MetersFieldButton.addActionListener(listener);
		MetersPanel.add(MetersFieldButton);

		JButton KiloMetersFieldButton = new JButton ("Calculate from KiloMeters");  //KiloMeters calculate button
		KiloMetersFieldButton.setName("KiloMetersFieldButton");
		KiloMetersFieldButton.addActionListener(listener);
		KiloMetersPanel.add(KiloMetersFieldButton);
		
		JButton CentimetersFieldButton = new JButton ("Calculate from Centimeters");  //Centimeters calculate button
		CentimetersFieldButton.setName("CentimetersFieldButton");
		CentimetersFieldButton.addActionListener(listener);
		CentimetersPanel.add(CentimetersFieldButton);
		
		JButton InchesFieldButton = new JButton ("Calculate from Inches");  //Inches calculate button
		InchesFieldButton.setName("InchesFieldButton");
		InchesFieldButton.addActionListener(listener);
		InchesPanel.add(InchesFieldButton);
		
		JButton FeetFieldButton = new JButton ("Calculate from Feet");  //Feet calculate button
		FeetFieldButton.setName("FeetFieldButton");
		FeetFieldButton.addActionListener(listener);
		FeetPanel.add(FeetFieldButton);
		
		JButton MilesFieldButton = new JButton ("Calculate from Miles");  //Miles calculate button
		MilesFieldButton.setName("MilesFieldButton");
		MilesFieldButton.addActionListener(listener);
		MilesPanel.add(MilesFieldButton);
		
		JButton LightYearsFieldButton = new JButton ("Calculate from Light Years");  //LightYears calculate button
		LightYearsFieldButton.setName("LightYearsFieldButton");
		LightYearsFieldButton.addActionListener(listener);
		LightYearsPanel.add(LightYearsFieldButton);
		//-----------------------------------------------------------------------------------------------------------------------------------
		JButton JoulesFieldButton = new JButton ("Calculate from Joules");  //Joules calculate button
		JoulesFieldButton.setName("JoulesFieldButton");
		JoulesFieldButton.addActionListener(listener);
		JoulePanel.add(JoulesFieldButton);
		
		JButton CaloriesFieldButton = new JButton ("Calculate from Calories");  //Calories calculate button
		CaloriesFieldButton.setName("CaloriesFieldButton");
		CaloriesFieldButton.addActionListener(listener);
		CaloriePanel.add(CaloriesFieldButton);
		
		JButton VoltsFieldButton = new JButton ("Calculate from Volts");  //Volts calculate button
		VoltsFieldButton.setName("VoltsFieldButton");
		VoltsFieldButton.addActionListener(listener);
		VoltPanel.add(VoltsFieldButton);
		
		JButton WattsFieldButton = new JButton ("Calculate from Watts");  //Watts calculate button
		WattsFieldButton.setName("WattsFieldButton");
		WattsFieldButton.addActionListener(listener);
		WattPanel.add(WattsFieldButton);
		
		JButton ThermalUnitsFieldButton = new JButton ("Calculate from Thermal Units");  //Thermal Units calculate button
		ThermalUnitsFieldButton.setName("ThermalUnitsFieldButton");
		ThermalUnitsFieldButton.addActionListener(listener);
		ThermalPanel.add(ThermalUnitsFieldButton);
		
		JButton USThermsFieldButton = new JButton ("Calculate from USTherms");  //USTherms calculate button
		USThermsFieldButton.setName("USThermsFieldButton");
		USThermsFieldButton.addActionListener(listener);
		USThermPanel.add(USThermsFieldButton);
		
		/*JButton GallonsofGasolineFieldButton = new JButton ("Calculate from Gallons of Gasoline");  //Gallons of Gasoline calculate button
		GallonsofGasolineFieldButton.setName("GallonsofGasolineFieldButton");
		GallonsofGasolineFieldButton.addActionListener(listener);
		GallonofGasolinePanel.add(GallonsofGasolineFieldButton);*/
		//--------------------------------------------------------------------------------------------------------------------------
		/*JButton calculateenergy = new JButton("Calculate");
		calculateenergy.setName("calculate");
		calculateenergy.addActionListener(listener);
		panel2.add(calculateenergy);	*/
		
		JButton resetenergy = new JButton("Reset");  //energy reset button
		resetenergy.setName("resetenergy");
		resetenergy.addActionListener(listener);
		panel2.add(resetenergy);
		
		JButton reset = new JButton("Reset");   // distance reset button
		reset.setName("reset");
		reset.addActionListener(listener);
		panel1.add(reset);
		testframe.setVisible(true);
		testframe.pack();
		
		testframe.setVisible(true);
		testframe.pack();
	}
	

	public class MyListener implements ActionListener{
		{
		//public void keyaction(ActionEvent e) {
		//   KeyEvent source = (KeyEvent)e.getSource();	
		//   char sourceName = source.getKeyChar();
		//}
		//public void mouseaction (ActionEvent e){
		//	MouseEvent source = (MouseEvent)e.getSource();
		//	boolean exit = 
		//}
		//public void actionPerformed(ActionEvent e){
			//JButton boxclick = (JButton)e.getSource();
			//MouseEvent boxclick = (MouseEvent)e.getSource();
			//String boxclickName = boxclick.getName();
		
		//if(boxclickName.equals("MetersFieldButton"))
		
		//	MetersField.setText("5");
		
		//}
	}
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			String sourceName = source.getName();
			
		
			//int Centimeters= new Integer(CentimetersField.getText()).intValue();
			//int inches = new Integer(InchesField.getText()).intValue();
			//int feet = new Integer(FeetField.getText()).intValue();
			//int Miles = new Integer(MilesField.getText()).intValue(); 
			//int kiloMeters = new Integer(KiloMetersField.getText()).intValue();
		
			if (sourceName.equals("MetersFieldButton"))
			{
			//setting things from meters
				int Meters= new Integer(MetersField.getText()).intValue(); 	
				CentimetersField.setText(new Double(Meters * 100).toString());
				KiloMetersField.setText(new Double(Meters * .001).toString());
				InchesField.setText(new Double(Meters * 39.3701).toString());
				FeetField.setText(new Double(Meters * 3.28084).toString());
				MilesField.setText(new Double(Meters * 0.00062137121212121).toString());
				LightYearsField.setText(new Double(Meters * 1.057e-16).toString());
			}
			if(sourceName.equals("KiloMetersFieldButton"))
			{
				//setting things from kilometers
				int Kilometers = new Integer(KiloMetersField.getText()).intValue();
				CentimetersField.setText(new Double(Kilometers * 10000).toString());
				MetersField.setText(new Double(Kilometers * 1000).toString());
				InchesField.setText(new Double(Kilometers * 39370.08).toString());
				FeetField.setText(new Double(Kilometers * 3280.84).toString());
				MilesField.setText(new Double(Kilometers * 0.62137121212121).toString());
				LightYearsField.setText(new Double(Kilometers * 1.057e-13).toString());
			}
			if(sourceName.equals("CentimetersFieldButton"))
			{
				//setting things from Centimeters
				int centimeters = new Integer(CentimetersField.getText()).intValue();
				KiloMetersField.setText(new Double(centimeters * 1e-5).toString());
				MetersField.setText(new Double(centimeters * 0.01).toString());
				InchesField.setText(new Double(centimeters * 0.393701).toString());
				FeetField.setText(new Double(centimeters * 0.0328084).toString());
				MilesField.setText(new Double(centimeters * 6.2137e-6).toString());
				LightYearsField.setText(new Double(centimeters * 1.057e-18).toString());
			}
			if(sourceName.equals("FeetFieldButton"))
			{
				//setting things from Feet
				int feet = new Integer(FeetField.getText()).intValue();
				KiloMetersField.setText(new Double(feet *0.0003048).toString());
				MetersField.setText(new Double(feet * 0.3048).toString());
				InchesField.setText(new Double(feet * 12).toString());
				CentimetersField.setText(new Double(feet * 30.48).toString());
				MilesField.setText(new Double(feet * 0.00018939167367424).toString());
				LightYearsField.setText(new Double(feet * 3.2217e-17).toString());
			}
			if(sourceName.equals("InchesFieldButton"))
			{
				//setting things from Inches
				int inches = new Integer(InchesField.getText()).intValue();
				KiloMetersField.setText(new Double(inches *2.54e-5).toString());
				MetersField.setText(new Double(inches * 0.0254).toString());
				FeetField.setText(new Double(inches *0.0833333).toString());
				CentimetersField.setText(new Double(inches * 2.54).toString());
				MilesField.setText(new Double(inches * 1.57829333965e-5).toString());
				LightYearsField.setText(new Double(inches * 2.6848e-18).toString());
			}
			if(sourceName.equals("MilesFieldButton"))
			{
				//setting things from Miles
				int miles = new Integer(MilesField.getText()).intValue();
				KiloMetersField.setText(new Double(miles *1.60934).toString());
				MetersField.setText(new Double(miles * 1609.34).toString());
				FeetField.setText(new Double(miles *5280).toString());
				CentimetersField.setText(new Double(miles * 160934).toString());
				InchesField.setText(new Double(miles * 63360).toString());
				LightYearsField.setText(new Double(miles * 1.7011e-13).toString());
			}
			if(sourceName.equals("LightYearsFieldButton"))
			{
				//setting things from LightYears
				int lightYears = new Integer(LightYearsField.getText()).intValue();
				KiloMetersField.setText(new Double(lightYears *9.461e+12).toString());
				MetersField.setText(new Double(lightYears * 9.461e+15).toString());
				FeetField.setText(new Double(lightYears *3.104e+16).toString());
				CentimetersField.setText(new Double(lightYears * 9.461e+17).toString());
				InchesField.setText(new Double(lightYears * 3.725e+17).toString());
				MilesField.setText(new Double(lightYears * 5.879e+12).toString());
			}
			//---------------------------------------------------------------------------------------------------Equations for energy
			if(sourceName.equals("JoulesFieldButton"))
			{
				//setting things from Joules
				int Joules = new Integer(JoulesField.getText()).intValue();
				CaloriesField.setText(new Double(Joules *0.000239006).toString());
				VoltsField.setText(new Double(Joules * 6.242e+18).toString());
				WattsField.setText(new Double(Joules *0.000277778).toString());
				ThermalField.setText(new Double(Joules * 0.000947817).toString());
				USThermsField.setText(new Double(Joules * 9.4804e-9).toString());
			}
			if(sourceName.equals("CaloriesFieldButton"))
			{
				//setting things from Calories
				int calories = new Integer(CaloriesField.getText()).intValue();
				JoulesField.setText(new Double(calories *4184).toString());
				VoltsField.setText(new Double(calories * 2.611e+22).toString());
				WattsField.setText(new Double(calories *1.16222).toString());
				ThermalField.setText(new Double(calories * 3.96567).toString());
				USThermsField.setText(new Double(calories * 3.9666e-5).toString());
			}
			if(sourceName.equals("VoltsFieldButton"))
			{
				//setting things from Volts
				int volts = new Integer(VoltsField.getText()).intValue();
				JoulesField.setText(new Double(volts *1.6022e-19).toString());
				CaloriesField.setText(new Double(volts * 3.8293e-23).toString());
				WattsField.setText(new Double(volts *4.4505e-23).toString());
				ThermalField.setText(new Double(volts * 1.5186e-22).toString());
				USThermsField.setText(new Double(volts * 1.5189e-27).toString());
			}
			if(sourceName.equals("WattsFieldButton"))
			{
				//setting things from Watts
				int watts = new Integer(WattsField.getText()).intValue();
				JoulesField.setText(new Double(watts *3600).toString());
				CaloriesField.setText(new Double(watts * 860.421).toString());
				VoltsField.setText(new Double(watts *2.247e+22).toString());
				ThermalField.setText(new Double(watts * 3.41214).toString());
				USThermsField.setText(new Double(watts * 3.413e-5).toString());
			}
			if(sourceName.equals("ThermalUnitsFieldButton"))
			{
				//setting things from ThermalUnits
				int Thermal = new Integer(ThermalField.getText()).intValue();
				JoulesField.setText(new Double(Thermal *1055.06).toString());
				CaloriesField.setText(new Double(Thermal * 0.252164).toString());
				VoltsField.setText(new Double(Thermal *6.585e+21).toString());
				WattsField.setText(new Double(Thermal * 0.293071).toString());
				USThermsField.setText(new Double(Thermal * 1.0002e-5).toString());
			}
			if(sourceName.equals("USThermsFieldButton"))
			{
				//setting things from USTherms
				int USTherms = new Integer(USThermsField.getText()).intValue();
				JoulesField.setText(new Double(USTherms *1.055e+8).toString());
				CaloriesField.setText(new Double(USTherms * 25210.4).toString());
				VoltsField.setText(new Double(USTherms *6.584e+26).toString());
				WattsField.setText(new Double(USTherms * 29300.1).toString());
				ThermalField.setText(new Double(USTherms * 99976.1).toString());
			}
		/*	if ((sourceName.equals("calculate")&& kiloMeters!=(.001)))
			{
				CentimetersField.setText(new Double(kiloMeters * 100000).toString());
				MetersField.setText(new Double(kiloMeters * 1000).toString());
				InchesField.setText(new Double(kiloMeters * 39370.066559842533024).toString());
				FeetField.setText(new Double(kiloMeters * 3280.838879986877).toString());
				MilesField.setText(new Double(kiloMeters * 0.621371).toString());
				LightYearsField.setText(new Double(kiloMeters * 1.057e-13).toString());
			}
			*/
		
			
			if (sourceName.equals("reset"))
			{
				LightYearsField.setText("1.057e-16");
				CentimetersField.setText("100");
				MetersField.setText("1");
				KiloMetersField.setText(".001");
				InchesField.setText("39.3701");
				FeetField.setText("3.28084");
				MilesField.setText("0.000621371");
			}
			if (sourceName.equals("resetenergy"))
			{
				USThermsField.setText("9.4804e-9");
				JoulesField.setText("1");
				CaloriesField.setText("0.000239006");
				VoltsField.setText("6.242e+18");
				WattsField.setText("0.000277778");
				ThermalField.setText("0.000947817");
			}
			}
	
		
	}
	

public static void main(String args[]) {
	@SuppressWarnings("unused")
	converter converter = new converter();
	
}}