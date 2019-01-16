/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import com.digidemic.unitof.UnitOf;
import java.awt.TrayIcon;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Andri
 */
public class App extends javax.swing.JFrame {

    String angka = "";
    char type;
    String format = "###.###";
    DecimalFormat df = new DecimalFormat();
    
    public App() {
        initComponents();
        konversi();
        warna();
        warnaKon();
        input1.requestFocus();
        abt.setVisible(false);
    }
    
    
    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
            if (((caracter < '0') || (caracter > '9'))|| e.getKeyCode()== KeyEvent.VK_PERIOD) {
                e.consume();
            }
    }
    
    private void konversi(){
        if(kon.getText().equals("PANJANG")){
            kon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Milimeter", "Centimeter", "Meter", "Kilometer", "Inci", "Kaki", "Yard", "Mil"
            }));
            kon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Milimeter", "Centimeter", "Meter", "Kilometer", "Inci", "Kaki", "Yard", "Mil"
            }));
            
            kon1.setSelectedIndex(2);
            kon2.setSelectedIndex(3);
//            KeyEvent e = null;
//            char ch = e.getKeyChar();
//            
//            if(Character.isDigit(ch)){
//                e.consume();
//            }
            
        }
        if(kon.getText().equals("SUHU")){
            kon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Celcius","Fahrenheit","Kelvin","Reamur"
            }));
            kon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Celcius","Fahrenheit","Kelvin","Reamur"
            }));
            
            kon2.setSelectedIndex(2);
        }
        if(kon.getText().equals("WAKTU")){
            kon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Mecrodetik","Milidetik","Detik","Menit","Jam","Hari","Minggu","Bulan","Tahun","Dekade","Abad","Milenuim"
            }));
            kon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Mecrodetik","Milidetik","Detik","Menit","Jam","Hari","Minggu","Bulan","Tahun","Dekade","Abad","Milenuim"
            }));
            kon1.setSelectedIndex(1);
            kon2.setSelectedIndex(2);
        }
        if(kon.getText().equals("BERAT & MASSA")){
            kon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Karat","Nanogram","Mikrogram","Miligram","Gram","Ons","Kilogram","Hektogram",
                "Kuintal","Ton","Pounds","Kilopounds"
            }));
            kon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Karat","Nanogram","Mikrogram","Miligram","Gram","Ons","Kilogram","Hektogram",
                "Kuintal","Ton","Pounds","Kilopounds"
            }));
            kon1.setSelectedItem("Ons");
            kon2.setSelectedItem("Kilogram");
        }
        if(kon.getText().equals("BASE-N")){
            kon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Binner","Oktal","Desimal","Hexadesimal"
            }));
            kon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Binner","Oktal","Desimal","Hexadesimal"
            }));
            
            kon1.setSelectedItem("Desimal");
            kon2.setSelectedItem("Binner");
        }
        if(kon.getText().equals("KECEPATAN")){
            kon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Sentimeter per detik","Meter per detik","Kilometer per jam","Kaki per detik","Mil per jam","Knot","Mach","Cahaya"
            }));
            kon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Sentimeter per detik","Meter per detik","Kilometer per jam","Kaki per detik","Mil per jam","Knot","Mach","Cahaya"
            }));
            kon1.setSelectedIndex(1);
            kon2.setSelectedIndex(2);
        }
        if(kon.getText().equals("DATA")){
            
            kon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Bit","Byte","KiloByte","MegaByte","GigaByte","TeraByte","PetaByte","ExaByte","ZetaByte","YottaByte"
            }));
            kon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                "Bit","Byte","KiloByte","MegaByte","GigaByte","TeraByte","PetaByte","ExaByte","ZetaByte","YottaByte"
            }));
            kon1.setSelectedIndex(1);
            kon2.setSelectedIndex(0);
        }
    }
    
    void warnaKon(){
        kon1.setBackground(new java.awt.Color(99,110,114));
        kon2.setBackground(new java.awt.Color(99,110,114));
        input1.setText(null);
        input2.setText("0");
    }
    void warna(){
        pa.setBackground(new java.awt.Color(45,52,54));
        pb.setBackground(new java.awt.Color(45,52,54));
        sa.setBackground(new java.awt.Color(45,52,54));
        sb.setBackground(new java.awt.Color(45,52,54));
        wa.setBackground(new java.awt.Color(45,52,54));
        wb.setBackground(new java.awt.Color(45,52,54));
        ma.setBackground(new java.awt.Color(45,52,54));
        mb.setBackground(new java.awt.Color(45,52,54));
        ba.setBackground(new java.awt.Color(45,52,54));
        bb.setBackground(new java.awt.Color(45,52,54));
        ka.setBackground(new java.awt.Color(45,52,54));
        kb.setBackground(new java.awt.Color(45,52,54));
        da.setBackground(new java.awt.Color(45,52,54));
        db.setBackground(new java.awt.Color(45,52,54));
    }
    
    
    
    void panjang(){
        
        
        //Milimeter, Centimeter, Meter, Kilometer, Inci, Kaki, Yard, Mil
        
        
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        double in1 = Double.parseDouble(input1.getText());
        double in2 = Double.parseDouble(input2.getText());
        
        
            
        //all milimeters convert
            UnitOf.Length mili = new UnitOf.Length().fromMillimeters(in1);
            if (pil1==0 && pil2 ==0){
                long x = (long) mili.toMillimeters();
                input2.setText(""+x);
            }
            if (pil1==0 && pil2 ==1){
                 double x = mili.toCentimeters(); 
                 input2.setText(""+x);
            }
            if (pil1 ==0 && pil2==2){
                double x = mili.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==0 && pil2==3){
                double x = mili.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==0 && pil2==4){
                double x = mili.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==0 && pil2==5){
                double x = mili.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==0 && pil2==6){
                double x = mili.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==0 && pil2==7){
                double x = mili.toMiles(); 
                input2.setText(""+x);
            }
            
            //all centimeters convert
            UnitOf.Length centi = new UnitOf.Length().fromCentimeters(in1);
            if (pil1 ==1 && pil2==0){
                double x = centi.toMillimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==1 && pil2==1){
                double x = centi.toCentimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==1 && pil2==2){
                double x = centi.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==1 && pil2==3){
                double x = centi.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==1 && pil2==4){
                double x = centi.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==1 && pil2==5){
                double x = centi.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==1 && pil2==6){
                double x = centi.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==1 && pil2==7){
                double x = centi.toMiles(); 
                input2.setText(""+x);
            }
            
            //all meters converts
            UnitOf.Length meter = new UnitOf.Length().fromMeters(in1);
            if (pil1 ==2 && pil2==0){
                double x = meter.toMillimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==2 && pil2==1){
                double x = meter.toCentimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==2 && pil2==2){
                double x = meter.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==2 && pil2==3){
                double x = meter.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==2 && pil2==4){
                double x = meter.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==2 && pil2==5){
                double x = meter.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==2 && pil2==6){
                double x = meter.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==2 && pil2==7){
                double x = meter.toMiles(); 
                input2.setText(""+x);
            }
            
            //all kilometers convert
            UnitOf.Length km = new UnitOf.Length().fromKilometers(in1);
            if (pil1 ==3 && pil2==0){
                double x = km.toMillimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==3 && pil2==1){
                double x = km.toCentimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==3 && pil2==2){
                double x = km.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==3 && pil2==3){
                double x = km.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==3 && pil2==4){
                double x = km.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==3 && pil2==5){
                double x = km.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==3 && pil2==6){
                double x = km.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==3 && pil2==7){
                double x = km.toMiles(); 
                input2.setText(""+x);
            }
            
            //all inchiies conv
            UnitOf.Length in = new UnitOf.Length().fromInches(in1);
            if (pil1 ==4 && pil2==0){
                double x = in.toMillimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==4 && pil2==1){
                double x = in.toCentimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==4 && pil2==2){
                double x = in.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==4 && pil2==3){
                double x = in.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==4 && pil2==4){
                double x = in.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==4 && pil2==5){
                double x = in.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==4 && pil2==6){
                double x = in.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==4 && pil2==7){
                double x = in.toMiles(); 
                input2.setText(""+x);
            }
            
            // all feet conv
            UnitOf.Length fe = new UnitOf.Length().fromFeet(in1);
            if (pil1 ==5 && pil2==0){
                double x = fe.toMillimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==5 && pil2==1){
                double x = fe.toCentimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==5 && pil2==2){
                double x = fe.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==5 && pil2==3){
                double x = fe.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==5 && pil2==4){
                double x = fe.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==5 && pil2==5){
                double x = fe.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==5 && pil2==6){
                double x = fe.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==5 && pil2==7){
                double x = fe.toMiles(); 
                input2.setText(""+x);
            }
            
            //all yard conv
            UnitOf.Length ya = new UnitOf.Length().fromYards(in1);
            if (pil1 ==6 && pil2==0){
                double x = ya.toMillimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==6 && pil2==1){
                double x = ya.toCentimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==6 && pil2==2){
                double x = ya.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==6 && pil2==3){
                double x = ya.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==6 && pil2==4){
                double x = ya.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==6 && pil2==5){
                double x = ya.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==6 && pil2==6){
                double x = ya.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==6 && pil2==7){
                double x = ya.toMiles(); 
                input2.setText(""+x);
            }
            
            //all mile conv
            UnitOf.Length mil = new UnitOf.Length().fromMiles(in1);
            if (pil1 ==7 && pil2==0){
                double x = mil.toMillimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==7 && pil2==1){
                double x = mil.toCentimeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==7 && pil2==2){
                double x = mil.toMeters(); 
                input2.setText(""+x);
            }
            if (pil1 ==7 && pil2==3){
                double x = mil.toKilometers(); 
                input2.setText(""+x);
            }
            if (pil1 ==7 && pil2==4){
                double x = mil.toInches(); 
                input2.setText(""+x);
            }
            if (pil1 ==7 && pil2==5){
                double x = mil.toFeet(); 
                input2.setText(""+x);
            }
            if (pil1 ==7 && pil2==6){
                double x = mil.toYards(); 
                input2.setText(""+x);
            }
            if (pil1 ==7 && pil2==7){
                double x = mil.toMiles(); 
                input2.setText(""+x);
            }
    }
    
    private void Suhu(){
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        double in1 = Double.parseDouble(input1.getText());
        double in2 = Double.parseDouble(input2.getText());
        
        //all celcius convert
        UnitOf.Temperature c = new UnitOf.Temperature().fromCelsius(in1);
        if (pil1 ==0 && pil2==0){
            double x = c.toCelsius(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==1){
            double x = c.toFahrenheit(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==2){
            double x = c.toKelvin(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==3){
            double x = c.toReaumur(); 
            input2.setText(""+x);
        }
        
        //all Fahrenheit convert
        UnitOf.Temperature f = new UnitOf.Temperature().fromFahrenheit(in1);
        if (pil1 ==1 && pil2==0){
            double x = f.toCelsius(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==1){
            double x = f.toFahrenheit(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==2){
            double x = f.toKelvin(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==3){
            double x = f.toReaumur(); 
            input2.setText(""+x);
        }
        
        //all kelvin convert
        UnitOf.Temperature k = new UnitOf.Temperature().fromKelvin(in1);
        if (pil1 ==2 && pil2==0){
            double x = k.toCelsius(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==1){
            double x = k.toFahrenheit(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==2){
            double x = k.toKelvin(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==3){
            double x = k.toReaumur(); 
            input2.setText(""+x);
        }
        
        //all reamur convert
        UnitOf.Temperature r = new UnitOf.Temperature().fromReaumur(in1);
        if (pil1 ==3 && pil2==0){
            double x = r.toCelsius(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==1){
            double x = r.toFahrenheit(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==2){
            double x = r.toKelvin(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==3){
            double x = r.toReaumur(); 
            input2.setText(""+x);
        }     
    }
    
    private void Waktu(){
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        double in1 = Double.parseDouble(input1.getText());
        double in2 = Double.parseDouble(input2.getText());
        
        //all MicroSeconds convert
        UnitOf.Time mics = new UnitOf.Time().fromMicroseconds(in1);
        if (pil1 ==0 && pil2==0){
            double x = mics.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==1){
            double x = mics.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==2){
            double x = mics.toSeconds(); 
            input2.setText(""+x);
        }
        
        if (pil1 ==0 && pil2==3){
            double x = mics.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==4){
            double x = mics.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==5){
            double x = mics.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==6){
            double x = mics.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==7){
            double x = mics.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==8){
            double x = mics.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==9){
            double x = mics.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==10){
            double x = mics.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 ==0 && pil2==11){
            double x = mics.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all milliseconds convert
        UnitOf.Time ms = new UnitOf.Time().fromMilliseconds(in1);
        if (pil1 ==1 && pil2==0){
            double x = ms.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==1){
            double x = ms.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==2){
            double x = ms.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==3){
            double x = ms.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==4){
            double x = ms.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==5){
            double x = ms.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==6){
            double x = ms.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==7){
            double x = ms.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==8){
            double x = ms.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==9){
            double x = ms.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==10){
            double x = ms.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 ==1 && pil2==11){
            double x = ms.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //seconds convert
        UnitOf.Time s = new UnitOf.Time().fromSeconds(in1);
        if (pil1 ==2 && pil2==0){
            double x = s.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==1){
            double x = s.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==2){
            double x = s.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==3){
            double x = s.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==4){
            double x = s.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==5){
            double x = s.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==6){
            double x = s.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==7){
            double x = s.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==8){
            double x = s.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==9){
            double x = s.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==10){
            double x = s.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 ==2 && pil2==11){
            double x = s.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all minutes convert
        UnitOf.Time m = new UnitOf.Time().fromMinutes(in1);
        if (pil1 ==3 && pil2==0){
            double x = m.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==1){
            double x = m.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==2){
            double x = m.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==3){
            double x = m.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==4){
            double x = m.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==5){
            double x = m.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==6){
            double x = m.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==7){
            double x = m.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==8){
            double x = m.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==9){
            double x = m.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==10){
            double x = m.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 ==3 && pil2==11){
            double x = m.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all hours conert
        UnitOf.Time j = new UnitOf.Time().fromHours(in1);
        if (pil1 ==4 && pil2==0){
            double x = j.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==1){
            double x = j.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==2){
            double x = j.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==3){
            double x = j.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==4){
            double x = j.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==5){
            double x = j.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==6){
            double x = j.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==7){
            double x = j.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==8){
            double x = j.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==9){
            double x = j.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==10){
            double x = j.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 ==4 && pil2==11){
            double x = j.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all days converts
        UnitOf.Time ha = new UnitOf.Time().fromDays(in1);
        if (pil1 ==5 && pil2==0){
            double x = ha.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==1){
            double x = ha.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==2){
            double x = ha.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==3){
            double x = ha.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==4){
            double x = ha.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==5){
            double x = ha.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==6){
            double x = ha.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==7){
            double x = ha.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==8){
            double x = ha.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==9){
            double x = ha.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==10){
            double x = ha.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 ==5 && pil2==11){
            double x = ha.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all weeks convert
        UnitOf.Time we = new UnitOf.Time().fromWeeks(in1);
        if (pil1 ==6 && pil2==0){
            double x = we.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==1){
            double x = we.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==2){
            double x = we.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==3){
            double x = we.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==4){
            double x = we.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==5){
            double x = we.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==6){
            double x = we.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==7){
            double x = we.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==8){
            double x = we.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==9){
            double x = we.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==10){
            double x = we.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 ==6 && pil2==11){
            double x = we.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all months convert
        UnitOf.Time mo = new UnitOf.Time().fromMonths(in1);
        if (pil1 == 7 && pil2==0){
            double x = mo.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==1){
            double x = mo.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==2){
            double x = mo.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==3){
            double x = mo.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==4){
            double x = mo.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==5){
            double x = mo.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==6){
            double x = mo.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==7){
            double x = mo.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==8){
            double x = mo.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==9){
            double x = mo.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==10){
            double x = mo.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2==11){
            double x = mo.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all years convert
        UnitOf.Time tahun = new UnitOf.Time().fromYears(in1);
        if (pil1 == 8 && pil2==0){
            double x = tahun.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==1){
            double x = tahun.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==2){
            double x = tahun.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==3){
            double x = tahun.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==4){
            double x = tahun.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==5){
            double x = tahun.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==6){
            double x = tahun.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==7){
            double x = tahun.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==8){
            double x = tahun.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==9){
            double x = tahun.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==10){
            double x = tahun.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2==11){
            double x = tahun.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all decade converts
        UnitOf.Time dec = new UnitOf.Time().fromDecades(in1);
        if (pil1 == 9 && pil2==0){
            double x = dec.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==1){
            double x = dec.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==2){
            double x = dec.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==3){
            double x = dec.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==4){
            double x = dec.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==5){
            double x = dec.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==6){
            double x = dec.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==7){
            double x = dec.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==8){
            double x = dec.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==9){
            double x = dec.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==10){
            double x = dec.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2==11){
            double x = dec.toMillenniums(); 
            input2.setText(""+x);
        }
        
        // all centuries convert
        UnitOf.Time abad = new UnitOf.Time().fromCenturies(in1);
        if (pil1 == 10 && pil2==0){
            double x = abad.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==1){
            double x = abad.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==2){
            double x = abad.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==3){
            double x = abad.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==4){
            double x = abad.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==5){
            double x = abad.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==6){
            double x = abad.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==7){
            double x = abad.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==8){
            double x = abad.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==9){
            double x = abad.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==10){
            double x = abad.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2==11){
            double x = abad.toMillenniums(); 
            input2.setText(""+x);
        }
        
        //all milleniums convert
        UnitOf.Time mil = new UnitOf.Time().fromMillenniums(in1);
        if (pil1 == 11 && pil2==0){
            double x = mil.toMicroseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==1){
            double x = mil.toMilliseconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==2){
            double x = mil.toSeconds(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==3){
            double x = mil.toMinutes(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==4){
            double x = mil.toHours(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==5){
            double x = mil.toDays(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==6){
            double x = mil.toWeeks(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==7){
            double x = mil.toMonths(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==8){
            double x = mil.toYears(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==9){
            double x = mil.toDecades(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==10){
            double x = mil.toCenturies(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2==11){
            double x = mil.toMillenniums(); 
            input2.setText(""+x);
        }
    }
    
    private void Massa(){
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        double in1 = Double.parseDouble(input1.getText());
        double in2 = Double.parseDouble(input2.getText());
        
        //"Karat","Nanogram","Mikrogram","Miligram","Gram","Ons","Kilogram","Hektogram","Kuintal","Ton","Pounds","Kilopounds"
        UnitOf.Mass karat = new UnitOf.Mass().fromCarats(in1);
        if (pil1 == 0 && pil2 == 0){
            double x = karat.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 1){
            double x = karat.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 2){
            double x = karat.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 3){
            double x = karat.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 4){
            double x = karat.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 5){
            double x = karat.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 6){
            double x = karat.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 7){
            double x = karat.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 8){
            double x = karat.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 9){
            double x = karat.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 10){
            double x = karat.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 11){
            double x = karat.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //NANOGRAMS
        UnitOf.Mass ng = new UnitOf.Mass().fromNanograms(in1);
        if (pil1 == 1 && pil2 == 0){
            double x = ng.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 1){
            double x = ng.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 2){
            double x = ng.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 3){
            double x = ng.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 4){
            double x = ng.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 5){
            double x = ng.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 6){
            double x = ng.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 7){
            double x = ng.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 8){
            double x = ng.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 9){
            double x = ng.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 10){
            double x = ng.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 11){
            double x = ng.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //microgram
        UnitOf.Mass mic = new UnitOf.Mass().fromMicrograms(in1);
        if (pil1 == 2 && pil2 == 0){
            double x = mic.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 1){
            double x = mic.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 2){
            double x = mic.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 3){
            double x = mic.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 4){
            double x = mic.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 5){
            double x = mic.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 6){
            double x = mic.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 7){
            double x = mic.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 8){
            double x = mic.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 9){
            double x = mic.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 10){
            double x = mic.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 11){
            double x = mic.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //Miligrams
        UnitOf.Mass mg = new UnitOf.Mass().fromMilligrams(in1);
        if (pil1 == 3 && pil2 == 0){
            double x = mg.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 1){
            double x = mg.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 2){
            double x = mg.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 3){
            double x = mg.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 4){
            double x = mg.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 5){
            double x = mg.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 6){
            double x = mg.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 7){
            double x = mg.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 8){
            double x = mg.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 9){
            double x = mg.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 10){
            double x = mg.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 11){
            double x = mg.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //grams
        UnitOf.Mass gr = new UnitOf.Mass().fromGrams(in1);
        if (pil1 == 4 && pil2 == 0){
            double x = gr.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 1){
            double x = gr.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 2){
            double x = gr.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 3){
            double x = gr.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 4){
            double x = gr.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 5){
            double x = gr.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 6){
            double x = gr.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 7){
            double x = gr.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 8){
            double x = gr.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 9){
            double x = gr.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 10){
            double x = gr.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 11){
            double x = gr.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //Ounce
        UnitOf.Mass ons = new UnitOf.Mass().fromOuncesUS(in1);
        if (pil1 == 5 && pil2 == 0){
            double x = ons.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 1){
            double x = ons.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 2){
            double x = ons.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 3){
            double x = ons.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 4){
            double x = ons.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 5){
            double x = ons.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 6){
            double x = ons.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 7){
            double x = ons.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 8){
            double x = ons.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 9){
            double x = ons.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 10){
            double x = ons.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 11){
            double x = ons.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //kilograms
        UnitOf.Mass kg = new UnitOf.Mass().fromKilograms(in1);
        if (pil1 == 6 && pil2 == 0){
            double x = kg.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 1){
            double x = kg.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 2){
            double x = kg.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 3){
            double x = kg.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 4){
            double x = kg.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 5){
            double x = kg.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 6){
            double x = kg.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 7){
            double x = kg.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 8){
            double x = kg.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 9){
            double x = kg.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 10){
            double x = kg.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 11){
            double x = kg.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //hectograms
        UnitOf.Mass hg = new UnitOf.Mass().fromHectograms(in1);
        if (pil1 == 7 && pil2 == 0){
            double x = hg.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 1){
            double x = hg.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 2){
            double x = hg.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 3){
            double x = hg.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 4){
            double x = hg.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 5){
            double x = hg.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 6){
            double x = hg.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 7){
            double x = hg.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 8){
            double x = hg.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 9){
            double x = hg.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 10){
            double x = hg.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 11){
            double x = hg.toKilopounds(); 
            input2.setText(""+x);
        }
        
        //quintals
        UnitOf.Mass kntl = new UnitOf.Mass().fromQuintals(in1);
        if (pil1 == 8 && pil2 == 0){
            double x = kntl.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 1){
            double x = kntl.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 2){
            double x = kntl.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 3){
            double x = kntl.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 4){
            double x = kntl.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 5){
            double x = kntl.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 6){
            double x = kntl.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 7){
            double x = kntl.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 8){
            double x = kntl.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 9){
            double x = kntl.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 10){
            double x = kntl.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 8 && pil2 == 11){
            double x = kntl.toKilopounds(); 
            input2.setText(""+x);
        }

        //TonUS
        UnitOf.Mass ton = new UnitOf.Mass().fromTonsUS(in1);
        if (pil1 == 9 && pil2 == 0){
            double x = ton.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 1){
            double x = ton.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 2){
            double x = ton.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 3){
            double x = ton.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 4){
            double x = ton.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 5){
            double x = ton.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 6){
            double x = ton.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 7){
            double x = ton.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 8){
            double x = ton.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 9){
            double x = ton.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 10){
            double x = ton.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 9 && pil2 == 11){
            double x = ton.toKilopounds(); 
            input2.setText(""+x);
        }

        //Punds
        UnitOf.Mass pon = new UnitOf.Mass().fromPounds(in1);
        if (pil1 == 10 && pil2 == 0){
            double x = pon.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 1){
            double x = pon.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 2){
            double x = pon.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 3){
            double x = pon.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 4){
            double x = pon.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 5){
            double x = pon.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 6){
            double x = pon.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 7){
            double x = pon.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 8){
            double x = pon.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 9){
            double x = pon.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 10){
            double x = pon.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 10 && pil2 == 11){
            double x = pon.toKilopounds(); 
            input2.setText(""+x);
        }

        //Kilopounds
        UnitOf.Mass kp = new UnitOf.Mass().fromKilopounds(in1);
        if (pil1 == 11 && pil2 == 0){
            double x = kp.toCarats(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 1){
            double x = kp.toNanograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 2){
            double x = kp.toMicrograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 3){
            double x = kp.toMilligrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 4){
            double x = kp.toGrams(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 5){
            double x = kp.toOuncesUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 6){
            double x = kp.toKilograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 7){
            double x = kp.toHectograms(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 8){
            double x = kp.toQuintals(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 9){
            double x = kp.toTonsUS(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 10){
            double x = kp.toPounds(); 
            input2.setText(""+x);
        }
        if (pil1 == 11 && pil2 == 11){
            double x = kp.toKilopounds(); 
            input2.setText(""+x);
        }
    }

    private void BASE(){
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        int in1 = Integer.parseInt(input1.getText());
        double in2 = Double.parseDouble(input2.getText());

        //"Binner","Oktal","Desimal","Hexadesimal"

        //Binary
        if (pil1 == 0 && pil2 == 0){
            try {
                String x = new UnitOf.NumericBase() .fromBinary(in1).toBinary();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 0 && pil2 == 1){
            try {
                String x = new UnitOf.NumericBase() .fromBinary(in1).toOctal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 0 && pil2 == 2){
            try {
                String x = new UnitOf.NumericBase() .fromBinary(in1).toDecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 0 && pil2 == 3){
            try {
                String x = new UnitOf.NumericBase() .fromBinary(in1).toHexadecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        //Octal
        if (pil1 == 1 && pil2 == 0){
            try {
                String x = new UnitOf.NumericBase() .fromOctal(in1).toBinary();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 1 && pil2 == 1){
            try {
                String x = new UnitOf.NumericBase() .fromOctal(in1).toOctal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 1 && pil2 == 2){
            try {
                String x = new UnitOf.NumericBase() .fromOctal(in1).toDecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 1 && pil2 == 3){
            try {
                String x = new UnitOf.NumericBase() .fromOctal(in1).toHexadecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        //decimal
        if (pil1 == 2 && pil2 == 0){
            try {
                String x = new UnitOf.NumericBase() .fromDecimal(in1).toBinary();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 2 && pil2 == 1){
            try {
                String x = new UnitOf.NumericBase() .fromDecimal(in1).toOctal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 2 && pil2 == 2){
            try {
                String x = new UnitOf.NumericBase() .fromDecimal(in1).toDecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 2 && pil2 == 3){
            try {
                String x = new UnitOf.NumericBase() .fromDecimal(in1).toHexadecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        //hexadecimal
         if (pil1 == 3 && pil2 == 0){
            try {
                String x = new UnitOf.NumericBase() .fromHexadecimal(in1).toBinary();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 3 && pil2 == 1){
            try {
                String x = new UnitOf.NumericBase() .fromHexadecimal(in1).toOctal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 3 && pil2 == 2){
            try {
                String x = new UnitOf.NumericBase() .fromHexadecimal(in1).toDecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        if (pil1 == 3 && pil2 == 3){
            try {
                String x = new UnitOf.NumericBase() .fromHexadecimal(in1).toHexadecimal();
                input2.setText(x);
            } catch (Exception ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }       


    }
    private void kecepatan(){
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        double in1 = Double.parseDouble(input1.getText());
        double in2 = Double.parseDouble(input2.getText());
        
        // "Sentimeter per detik","Meter per detik","Kilometer per jam","Kaki per detik","Mil per jam","Knot","Mach","Cahaya"
        
        //Centimeter per Second
        UnitOf.Speed cms = new UnitOf.Speed().fromCentimetersPerSecond(in1);
        if (pil1 == 0 && pil2 == 0){
            double x = cms.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 1){
            double x = cms.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 2){
            double x = cms.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 3){
            double x = cms.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 4){
            double x = cms.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 5){
            double x = cms.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 6){
            double x = cms.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 0 && pil2 == 7){
            double x = cms.toLight();
            input2.setText(""+x);
        }
        
        //Meter per Second
        UnitOf.Speed ms = new UnitOf.Speed().fromMetersPerSecond(in1);
        if (pil1 == 1 && pil2 == 0){
            double x = ms.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 1){
            double x = ms.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 2){
            double x = ms.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 3){
            double x = ms.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 4){
            double x = ms.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 5){
            double x = ms.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 6){
            double x = ms.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 1 && pil2 == 7){
            double x = ms.toLight();
            input2.setText(""+x);
        }
        
        //KM/S
        UnitOf.Speed kms = new UnitOf.Speed().fromKilometersPerHour(in1);
        if (pil1 == 2 && pil2 == 0){
            double x = kms.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 1){
            double x = kms.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 2){
            double x = kms.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 3){
            double x = kms.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 4){
            double x = kms.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 5){
            double x = kms.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 6){
            double x = kms.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 2 && pil2 == 7){
            double x = kms.toLight();
            input2.setText(""+x);
        }
        
        //Kaki per detik
        UnitOf.Speed kpj = new UnitOf.Speed().fromFeetPerSecond(in1);
        if (pil1 == 3 && pil2 == 0){
            double x = kpj.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 1){
            double x = kpj.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 2){
            double x = kpj.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 3){
            double x = kpj.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 4){
            double x = kpj.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 5){
            double x = kpj.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 6){
            double x = kpj.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 3 && pil2 == 7){
            double x = kpj.toLight();
            input2.setText(""+x);
        }
        
        //Miles per Hour
        UnitOf.Speed mh = new UnitOf.Speed().fromMilesPerHour(in1);
        if (pil1 == 4 && pil2 == 0){
            double x = mh.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 1){
            double x = mh.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 2){
            double x = mh.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 3){
            double x = mh.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 4){
            double x = mh.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 5){
            double x = mh.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 6){
            double x = mh.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 4 && pil2 == 7){
            double x = mh.toLight();
            input2.setText(""+x);
        }
        
        //knots
        UnitOf.Speed knot = new UnitOf.Speed().fromKnots(in1);
        if (pil1 == 5 && pil2 == 0){
            double x = knot.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 1){
            double x = knot.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 2){
            double x = knot.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 3){
            double x = knot.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 4){
            double x = knot.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 5){
            double x = knot.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 6){
            double x = knot.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 5 && pil2 == 7){
            double x = knot.toLight();
            input2.setText(""+x);
        }
        
        //Mach
        UnitOf.Speed mach = new UnitOf.Speed().fromMach(in1);
        if (pil1 == 6 && pil2 == 0){
            double x = mach.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 1){
            double x = mach.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 2){
            double x = mach.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 3){
            double x = mach.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 4){
            double x = mach.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 5){
            double x = mach.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 6){
            double x = mach.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 6 && pil2 == 7){
            double x = mach.toLight();
            input2.setText(""+x);
        }
        
        //Light
        UnitOf.Speed light = new UnitOf.Speed().fromLight(in1);
        if (pil1 == 7 && pil2 == 0){
            double x = light.toCentimetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 1){
            double x = light.toMetersPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 2){
            double x = light.toKilometersPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 3){
            double x = light.toFeetPerSecond();
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 4){
            double x = light.toMilesPerHour();
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 5){
            double x = light.toKnots();
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 6){
            double x = light.toMach();
            input2.setText(""+x);
        }
        if (pil1 == 7 && pil2 == 7){
            double x = light.toLight();
            input2.setText(""+x);
        }
    }
    
    
    private void data(){
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        double in1 = Double.parseDouble(input1.getText());
        double in2 = Double.parseDouble(input2.getText());
        
        //"Bit","Byte","KiloByte","MegaByte","GigaByte","TeraByte","PetaByte","ExaByte","ZetaByte","YottaByte"
        UnitOf.DataStorage bit = new UnitOf.DataStorage().fromBits(in1);
        if (pil1 == 0 && pil2 == 0){
            double isi = bit.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 1){
            double isi = bit.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 2){
            double isi = bit.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 3){
            double isi = bit.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 4){
            double isi = bit.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 5){
            double isi = bit.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 6){
            double isi = bit.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 7){
            double isi = bit.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 8){
            double isi = bit.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 0 && pil2 == 9){
            double isi = bit.toYottabytes();
            input2.setText(""+isi);
        }
        
        //bytes
        UnitOf.DataStorage byt = new UnitOf.DataStorage().fromBytes(in1);
        if (pil1 == 1 && pil2 == 0){
            double isi = byt.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 1){
            double isi = byt.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 2){
            double isi = byt.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 3){
            double isi = byt.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 4){
            double isi = byt.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 5){
            double isi = byt.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 6){
            double isi = byt.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 7){
            double isi = byt.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 8){
            double isi = byt.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 1 && pil2 == 9){
            double isi = byt.toYottabytes();
            input2.setText(""+isi);
        }
        
        //Kilobytes
        UnitOf.DataStorage KB = new UnitOf.DataStorage().fromKilobytes(in1);
        if (pil1 == 2 && pil2 == 0){
            double isi = KB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 1){
            double isi = KB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 2){
            double isi = KB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 3){
            double isi = KB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 4){
            double isi = KB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 5){
            double isi = KB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 6){
            double isi = KB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 7){
            double isi = KB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 8){
            double isi = KB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 2 && pil2 == 9){
            double isi = KB.toYottabytes();
            input2.setText(""+isi);
        }
        
        //MegaBytes
        UnitOf.DataStorage MB = new UnitOf.DataStorage().fromMegabytes(in1);
        if (pil1 == 3 && pil2 == 0){
            double isi = MB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 1){
            double isi = MB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 2){
            double isi = MB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 3){
            double isi = MB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 4){
            double isi = MB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 5){
            double isi = MB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 6){
            double isi = MB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 7){
            double isi = MB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 8){
            double isi = MB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 3 && pil2 == 9){
            double isi = MB.toYottabytes();
            input2.setText(""+isi);
        }
        
        //GigaBytes
        UnitOf.DataStorage GB = new UnitOf.DataStorage().fromGigabytes(in1);
        if (pil1 == 4 && pil2 == 0){
            double isi = GB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 1){
            double isi = GB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 2){
            double isi = GB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 3){
            double isi = GB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 4){
            double isi = GB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 5){
            double isi = GB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 6){
            double isi = GB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 7){
            double isi = GB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 8){
            double isi = GB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 4 && pil2 == 9){
            double isi = GB.toYottabytes();
            input2.setText(""+isi);
        }
        
        //Terabytes
        UnitOf.DataStorage TB = new UnitOf.DataStorage().fromTerabytes(in1);
        if (pil1 == 5 && pil2 == 0){
            double isi = TB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 1){
            double isi = TB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 2){
            double isi = TB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 3){
            double isi = TB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 4){
            double isi = TB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 5){
            double isi = TB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 6){
            double isi = TB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 7){
            double isi = TB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 8){
            double isi = TB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 5 && pil2 == 9){
            double isi = TB.toYottabytes();
            input2.setText(""+isi);
        }
        
        //PetaBytes
        UnitOf.DataStorage PB = new UnitOf.DataStorage().fromPetabytes(in1);
        if (pil1 == 6 && pil2 == 0){
            double isi = PB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 1){
            double isi = PB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 2){
            double isi = PB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 3){
            double isi = PB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 4){
            double isi = PB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 5){
            double isi = PB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 6){
            double isi = PB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 7){
            double isi = PB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 8){
            double isi = PB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 6 && pil2 == 9){
            double isi = PB.toYottabytes();
            input2.setText(""+isi);
        }
        
        //Exabytes
        UnitOf.DataStorage EB = new UnitOf.DataStorage().fromExabytes(in1);
        if (pil1 == 7 && pil2 == 0){
            double isi = EB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 1){
            double isi = EB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 2){
            double isi = EB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 3){
            double isi = EB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 4){
            double isi = EB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 5){
            double isi = EB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 6){
            double isi = EB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 7){
            double isi = EB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 8){
            double isi = EB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 7 && pil2 == 9){
            double isi = EB.toYottabytes();
            input2.setText(""+isi);
        }
        
        //Zettabytes
        UnitOf.DataStorage ZB = new UnitOf.DataStorage().fromZettabytes(in1);
        if (pil1 == 8 && pil2 == 0){
            double isi = ZB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 1){
            double isi = ZB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 2){
            double isi = ZB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 3){
            double isi = ZB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 4){
            double isi = ZB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 5){
            double isi = ZB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 6){
            double isi = ZB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 7){
            double isi = ZB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 8){
            double isi = ZB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 8 && pil2 == 9){
            double isi = ZB.toYottabytes();
            input2.setText(""+isi);
        }
        
        //Yottabytes
        UnitOf.DataStorage YB = new UnitOf.DataStorage().fromYottabytes(in1);
        if (pil1 == 9 && pil2 == 0){
            double isi = YB.toBits();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 1){
            double isi = YB.toBytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 2){
            double isi = YB.toKilobytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 3){
            double isi = YB.toMegabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 4){
            double isi = YB.toGigabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 5){
            double isi = YB.toTerabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 6){
            double isi = YB.toPetabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 7){
            double isi = YB.toExabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 8){
            double isi = YB.toZettabytes();
            input2.setText(""+isi);
        }
        if (pil1 == 9 && pil2 == 9){
            double isi = YB.toYottabytes();
            input2.setText(""+isi);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pa = new javax.swing.JPanel();
        pb = new javax.swing.JPanel();
        pl = new javax.swing.JLabel();
        sa = new javax.swing.JPanel();
        sb = new javax.swing.JPanel();
        sl = new javax.swing.JLabel();
        wa = new javax.swing.JPanel();
        wb = new javax.swing.JPanel();
        wl = new javax.swing.JLabel();
        ma = new javax.swing.JPanel();
        mb = new javax.swing.JPanel();
        ml = new javax.swing.JLabel();
        ba = new javax.swing.JPanel();
        bb = new javax.swing.JPanel();
        bl = new javax.swing.JLabel();
        ka = new javax.swing.JPanel();
        kb = new javax.swing.JPanel();
        kl = new javax.swing.JLabel();
        da = new javax.swing.JPanel();
        db = new javax.swing.JPanel();
        dl = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        abt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kon = new javax.swing.JLabel();
        kon1 = new javax.swing.JComboBox<>();
        kon2 = new javax.swing.JComboBox<>();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        reverse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Konversi by Andri");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(99, 110, 114));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 52, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pa.setBackground(new java.awt.Color(80, 83, 84));
        pa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paMouseExited(evt);
            }
        });

        pb.setBackground(new java.awt.Color(133, 141, 143));

        javax.swing.GroupLayout pbLayout = new javax.swing.GroupLayout(pb);
        pb.setLayout(pbLayout);
        pbLayout.setHorizontalGroup(
            pbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pbLayout.setVerticalGroup(
            pbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pl.setForeground(new java.awt.Color(204, 204, 204));
        pl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Ruler_19px_3.png"))); // NOI18N
        pl.setText("PANJANG");

        javax.swing.GroupLayout paLayout = new javax.swing.GroupLayout(pa);
        pa.setLayout(paLayout);
        paLayout.setHorizontalGroup(
            paLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paLayout.createSequentialGroup()
                .addComponent(pb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paLayout.setVerticalGroup(
            paLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 197, -1));

        sa.setBackground(new java.awt.Color(80, 83, 84));
        sa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saMouseExited(evt);
            }
        });

        sb.setBackground(new java.awt.Color(133, 141, 143));

        javax.swing.GroupLayout sbLayout = new javax.swing.GroupLayout(sb);
        sb.setLayout(sbLayout);
        sbLayout.setHorizontalGroup(
            sbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sbLayout.setVerticalGroup(
            sbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sl.setForeground(new java.awt.Color(204, 204, 204));
        sl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Temperature_19px_2.png"))); // NOI18N
        sl.setText("SUHU");

        javax.swing.GroupLayout saLayout = new javax.swing.GroupLayout(sa);
        sa.setLayout(saLayout);
        saLayout.setHorizontalGroup(
            saLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saLayout.createSequentialGroup()
                .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        saLayout.setVerticalGroup(
            saLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(saLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 197, -1));

        wa.setBackground(new java.awt.Color(80, 83, 84));
        wa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                waMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                waMouseExited(evt);
            }
        });

        wb.setBackground(new java.awt.Color(133, 141, 143));

        javax.swing.GroupLayout wbLayout = new javax.swing.GroupLayout(wb);
        wb.setLayout(wbLayout);
        wbLayout.setHorizontalGroup(
            wbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        wbLayout.setVerticalGroup(
            wbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        wl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        wl.setForeground(new java.awt.Color(204, 204, 204));
        wl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Time_19px_4.png"))); // NOI18N
        wl.setText("WAKTU");

        javax.swing.GroupLayout waLayout = new javax.swing.GroupLayout(wa);
        wa.setLayout(waLayout);
        waLayout.setHorizontalGroup(
            waLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waLayout.createSequentialGroup()
                .addComponent(wb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        waLayout.setVerticalGroup(
            waLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(waLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(wa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 197, -1));

        ma.setBackground(new java.awt.Color(80, 83, 84));
        ma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maMouseExited(evt);
            }
        });

        mb.setBackground(new java.awt.Color(133, 141, 143));

        javax.swing.GroupLayout mbLayout = new javax.swing.GroupLayout(mb);
        mb.setLayout(mbLayout);
        mbLayout.setHorizontalGroup(
            mbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        mbLayout.setVerticalGroup(
            mbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ml.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ml.setForeground(new java.awt.Color(204, 204, 204));
        ml.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Weight_19px_1.png"))); // NOI18N
        ml.setText("BERAT & MASSA");

        javax.swing.GroupLayout maLayout = new javax.swing.GroupLayout(ma);
        ma.setLayout(maLayout);
        maLayout.setHorizontalGroup(
            maLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maLayout.createSequentialGroup()
                .addComponent(mb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ml)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        maLayout.setVerticalGroup(
            maLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(maLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ml)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 198, -1, -1));

        ba.setBackground(new java.awt.Color(80, 83, 84));
        ba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                baMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                baMouseExited(evt);
            }
        });

        bb.setBackground(new java.awt.Color(133, 141, 143));

        javax.swing.GroupLayout bbLayout = new javax.swing.GroupLayout(bb);
        bb.setLayout(bbLayout);
        bbLayout.setHorizontalGroup(
            bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        bbLayout.setVerticalGroup(
            bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bl.setForeground(new java.awt.Color(204, 204, 204));
        bl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Data__19px_3.png"))); // NOI18N
        bl.setText("BASE-N");

        javax.swing.GroupLayout baLayout = new javax.swing.GroupLayout(ba);
        ba.setLayout(baLayout);
        baLayout.setHorizontalGroup(
            baLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baLayout.createSequentialGroup()
                .addComponent(bb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        baLayout.setVerticalGroup(
            baLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(baLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 197, -1));

        ka.setBackground(new java.awt.Color(80, 83, 84));
        ka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kaMouseExited(evt);
            }
        });

        kb.setBackground(new java.awt.Color(133, 141, 143));

        javax.swing.GroupLayout kbLayout = new javax.swing.GroupLayout(kb);
        kb.setLayout(kbLayout);
        kbLayout.setHorizontalGroup(
            kbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        kbLayout.setVerticalGroup(
            kbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        kl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kl.setForeground(new java.awt.Color(204, 204, 204));
        kl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Speed_19px.png"))); // NOI18N
        kl.setText("KECEPATAN");

        javax.swing.GroupLayout kaLayout = new javax.swing.GroupLayout(ka);
        ka.setLayout(kaLayout);
        kaLayout.setHorizontalGroup(
            kaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kaLayout.createSequentialGroup()
                .addComponent(kb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kaLayout.setVerticalGroup(
            kaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(ka, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 197, -1));

        da.setBackground(new java.awt.Color(80, 83, 84));
        da.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        da.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                daMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                daMouseExited(evt);
            }
        });

        db.setBackground(new java.awt.Color(133, 141, 143));

        javax.swing.GroupLayout dbLayout = new javax.swing.GroupLayout(db);
        db.setLayout(dbLayout);
        dbLayout.setHorizontalGroup(
            dbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        dbLayout.setVerticalGroup(
            dbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dl.setForeground(new java.awt.Color(204, 204, 204));
        dl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Google_Compute_Engine_19px_1.png"))); // NOI18N
        dl.setText("DATA");

        javax.swing.GroupLayout daLayout = new javax.swing.GroupLayout(da);
        da.setLayout(daLayout);
        daLayout.setHorizontalGroup(
            daLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daLayout.createSequentialGroup()
                .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        daLayout.setVerticalGroup(
            daLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(db, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(daLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(da, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 354, 197, -1));

        info.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        info.setForeground(new java.awt.Color(255, 204, 51));
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Fingerprint_23px_3.png"))); // NOI18N
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                infoAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoMouseExited(evt);
            }
        });
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        abt.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        abt.setForeground(new java.awt.Color(255, 204, 51));
        abt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abt.setText("Tentang");
        jPanel2.add(abt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 395, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 439));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KONVERSI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 33, 380, -1));

        kon.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        kon.setForeground(new java.awt.Color(204, 204, 204));
        kon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kon.setText("PANJANG");
        kon.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                konPropertyChange(evt);
            }
        });
        kon.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                konVetoableChange(evt);
            }
        });
        jPanel1.add(kon, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 62, 380, -1));

        kon1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        kon1.setForeground(new java.awt.Color(99, 110, 114));
        kon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kon1MouseClicked(evt);
            }
        });
        kon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kon1ActionPerformed(evt);
            }
        });
        kon1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                kon1PropertyChange(evt);
            }
        });
        jPanel1.add(kon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 166, 157, -1));

        kon2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        kon2.setForeground(new java.awt.Color(99, 110, 114));
        jPanel1.add(kon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 295, 157, -1));

        input1.setBackground(new java.awt.Color(99, 110, 114));
        input1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        input1.setForeground(new java.awt.Color(204, 204, 204));
        input1.setBorder(null);
        input1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input1MouseClicked(evt);
            }
        });
        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });
        input1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input1KeyTyped(evt);
            }
        });
        jPanel1.add(input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 132, 320, 28));

        input2.setEditable(false);
        input2.setBackground(new java.awt.Color(99, 110, 114));
        input2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        input2.setForeground(new java.awt.Color(204, 204, 204));
        input2.setBorder(null);
        input2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input2MouseClicked(evt);
            }
        });
        input2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input2KeyReleased(evt);
            }
        });
        jPanel1.add(input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 320, 28));

        reverse.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        reverse.setForeground(new java.awt.Color(45, 52, 54));
        reverse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Synchronize_28px_2.png"))); // NOI18N
        reverse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reverse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reverseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reverseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reverseMouseExited(evt);
            }
        });
        jPanel1.add(reverse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paMouseExited
        warna();
    }//GEN-LAST:event_paMouseExited

    private void paMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paMouseEntered
        pa.setBackground(new java.awt.Color(80,83,84));
        pb.setBackground(new java.awt.Color(133,141,143));
    }//GEN-LAST:event_paMouseEntered

    private void saMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saMouseEntered
        sa.setBackground(new java.awt.Color(80,83,84));
        sb.setBackground(new java.awt.Color(133,141,143));
    }//GEN-LAST:event_saMouseEntered

    private void saMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saMouseExited
        warna();
    }//GEN-LAST:event_saMouseExited

    private void waMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waMouseEntered
        wa.setBackground(new java.awt.Color(80,83,84));
        wb.setBackground(new java.awt.Color(133,141,143));
    }//GEN-LAST:event_waMouseEntered

    private void waMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waMouseExited
       warna();
    }//GEN-LAST:event_waMouseExited

    private void maMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maMouseEntered
        ma.setBackground(new java.awt.Color(80,83,84));
        mb.setBackground(new java.awt.Color(133,141,143));
    }//GEN-LAST:event_maMouseEntered

    private void maMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maMouseExited
        warna();
    }//GEN-LAST:event_maMouseExited

    private void baMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baMouseEntered
        ba.setBackground(new java.awt.Color(80,83,84));
        bb.setBackground(new java.awt.Color(133,141,143));
    }//GEN-LAST:event_baMouseEntered

    private void baMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baMouseExited
        warna();
    }//GEN-LAST:event_baMouseExited

    private void kaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaMouseEntered
        ka.setBackground(new java.awt.Color(80,83,84));
        kb.setBackground(new java.awt.Color(133,141,143));
    }//GEN-LAST:event_kaMouseEntered

    private void kaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaMouseExited
        warna();
    }//GEN-LAST:event_kaMouseExited

    private void daMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daMouseEntered
        da.setBackground(new java.awt.Color(80,83,84));
        db.setBackground(new java.awt.Color(133,141,143));
    }//GEN-LAST:event_daMouseEntered

    private void daMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daMouseExited
        warna();
    }//GEN-LAST:event_daMouseExited

    private void paMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paMouseClicked
        kon.setText("PANJANG");
        warnaKon();
    }//GEN-LAST:event_paMouseClicked

    private void saMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saMouseClicked
        kon.setText("SUHU");
        warnaKon();
    }//GEN-LAST:event_saMouseClicked

    private void waMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waMouseClicked
        kon.setText("WAKTU");
        warnaKon();
    }//GEN-LAST:event_waMouseClicked

    private void maMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maMouseClicked
        kon.setText("BERAT & MASSA");
        warnaKon();
    }//GEN-LAST:event_maMouseClicked

    private void baMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baMouseClicked
        kon.setText("BASE-N");
        warnaKon();
    }//GEN-LAST:event_baMouseClicked

    private void kaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaMouseClicked
        kon.setText("KECEPATAN");
        warnaKon();
    }//GEN-LAST:event_kaMouseClicked

    private void daMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daMouseClicked
        kon.setText("DATA");
        warnaKon();
    }//GEN-LAST:event_daMouseClicked

    private void input2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input2MouseClicked
        
    }//GEN-LAST:event_input2MouseClicked

    private void kon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kon1ActionPerformed
        
    }//GEN-LAST:event_kon1ActionPerformed

    private void input1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input1KeyReleased
        type =evt.getKeyChar();
        if(!input1.getText().isEmpty()){
            if (kon.getText().equals("PANJANG")){
                panjang();
            }
            
            if (kon.getText().equals("SUHU")){
               Suhu();
            }
            if (kon.getText().equals("WAKTU")){
                Waktu();
            }
            
            if (kon.getText().equals("BERAT & MASSA")){
                Massa();
            }
            
            if (kon.getText().equals("BASE-N")){
                BASE();
            }
            if (kon.getText().equals("KECEPATAN")){
                kecepatan();
            }
            if(kon.getText().equals("DATA")){
                data();
            }
            
        } else{
            System.err.println("kosong");
        }
    }//GEN-LAST:event_input1KeyReleased

    private void input1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input1KeyPressed
   
    }//GEN-LAST:event_input1KeyPressed

    private void kon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kon1MouseClicked
        
    }//GEN-LAST:event_kon1MouseClicked

    private void input1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input1KeyTyped
        
//        input1KeyTyped(java.awt.event.KeyEvent evt)
//        if(!Character.isDigit(type)) {
//            evt.consume();
//        }
          if(kon.getText().equals("PANJANG")){
              keyTyped(evt);
          }
          if(kon.getText().equals("WAKTU")){
              keyTyped(evt);
          }
          if(kon.getText().equals("BERAT & MASA")){
              keyTyped(evt);
          }
          if(kon.getText().equals("KECEPATAN")){
              keyTyped(evt);
          }
          if(kon.getText().equals("DATA")){
              keyTyped(evt);
          }
          if(kon.getText().equals("BASE-N")){
//              boolean angka = false;
//              String a = input1.getText();
//              if(kon1.getSelectedIndex() == 0){
//                if (a.matches("[0-1]")){
//                    angka = true;
//                } else{
//                    angka = false;
//                }
//                
//                if(angka == false){
//                    keyTyped(evt);
//                }
//              }
          }
          
//        keyTyped(evt);
    }//GEN-LAST:event_input1KeyTyped

    private void reverseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseMouseClicked
        int pil1 = kon1.getSelectedIndex();
        int pil2 = kon2.getSelectedIndex();
        
        kon1.setSelectedIndex(pil2);
        kon2.setSelectedIndex(pil1);
        
        String a = input1.getText();
        String b = input2.getText();
        input2.setText(a);
        input1.setText(b);
    }//GEN-LAST:event_reverseMouseClicked

    private void konVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_konVetoableChange
        konversi();
    }//GEN-LAST:event_konVetoableChange

    private void konPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_konPropertyChange
        konversi();
        
    }//GEN-LAST:event_konPropertyChange

    private void reverseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/icons8_Synchronize_28px_3.png"));
        reverse.setIcon(AS);
        
        reverse.setText("Tukar Posisi");
    }//GEN-LAST:event_reverseMouseEntered

    private void reverseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/icons8_Synchronize_28px_2.png"));
        reverse.setIcon(AS);
        reverse.setText(null);
    }//GEN-LAST:event_reverseMouseExited

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        abt.setVisible(true);
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/icons8_Fingerprint_23px_4.png"));
        info.setIcon(AS);
    }//GEN-LAST:event_infoMouseEntered

    private void infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseExited
//        info.setText(null);
        abt.setVisible(false);
        ImageIcon AS = new ImageIcon(getClass().getResource("/icons/icons8_Fingerprint_23px_3.png"));
        info.setIcon(AS);
    }//GEN-LAST:event_infoMouseExited

    private void kon1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_kon1PropertyChange
//        input1KeyTyped(java.awt.event.KeyEvent evt)
        
    }//GEN-LAST:event_kon1PropertyChange

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input1ActionPerformed

    private void infoAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_infoAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_infoAncestorMoved

    private void input2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input2KeyReleased
         if(!input1.getText().isEmpty()){
            if (kon.getText().equals("PANJANG")){
                panjang();
            }
            if (kon.getText().equals("SUHU")){
               Suhu();
            }
            if (kon.getText().equals("WAKTU")){
                Waktu();
            }
            
            if (kon.getText().equals("BERAT & MASSA")){
                Massa();
            }
            
            if (kon.getText().equals("BASE-N")){
                BASE();
            }
            if (kon.getText().equals("KECEPATAN")){
                kecepatan();
            }
            if(kon.getText().equals("DATA")){
                data();
            }
            
        } else{
            System.err.println("kosong");
        }
    }//GEN-LAST:event_input2KeyReleased

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        About n = new About();
        n.setVisible(true);
    }//GEN-LAST:event_infoMouseClicked

    private void input1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input1MouseClicked
       input1.setText(null);
    }//GEN-LAST:event_input1MouseClicked
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abt;
    private javax.swing.JPanel ba;
    private javax.swing.JPanel bb;
    private javax.swing.JLabel bl;
    private javax.swing.JPanel da;
    private javax.swing.JPanel db;
    private javax.swing.JLabel dl;
    private javax.swing.JLabel info;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel ka;
    private javax.swing.JPanel kb;
    private javax.swing.JLabel kl;
    private javax.swing.JLabel kon;
    private javax.swing.JComboBox<String> kon1;
    private javax.swing.JComboBox<String> kon2;
    private javax.swing.JPanel ma;
    private javax.swing.JPanel mb;
    private javax.swing.JLabel ml;
    private javax.swing.JPanel pa;
    private javax.swing.JPanel pb;
    private javax.swing.JLabel pl;
    private javax.swing.JLabel reverse;
    private javax.swing.JPanel sa;
    private javax.swing.JPanel sb;
    private javax.swing.JLabel sl;
    private javax.swing.JPanel wa;
    private javax.swing.JPanel wb;
    private javax.swing.JLabel wl;
    // End of variables declaration//GEN-END:variables
}
