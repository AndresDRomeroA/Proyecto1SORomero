/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author Rolando Sorrentino
 */
public class ReadFile {
   
    /**
     * Sobreescribe el archivo de texto dentro del proyecto
     * @param txt (String que contiene la información del archivo de texto leído)
     */
    public void printTxt(String txt) {
        try {
            File file = new File("test\\config.txt");
            PrintWriter pw = new PrintWriter("test\\config.txt");
            pw.print(txt);
            JOptionPane.showMessageDialog(null, "The configuration has changed!");
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
    
    /**
     * Agrega información al archivo de texto del proyecto
     * @param txt 
     */
    public void appendTxt(String txt) {
        try {
            File file = new File("test\\config.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.append(txt);
            pw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
       
    
    /**
     * Lee un archivo de texto línea por línea y lo convierte en un string
     * @param path (Dirección donde se encuentra el archivo de texto a leer)
     * @return String que contiene la información del archivo de texto
     */
    public String readTxt() {
        String line;
        String txt = "";
        File file = new File("test\\config.txt");
        ReadFile nfile = new ReadFile();
        try {
           if (!file.exists()) {
                file.createNewFile(); 
                
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                       if (line.contains("General") || line.contains("Lamborghini") || line.contains("Maserati")) {
                            txt += "~" + "\n";
                       
                        } else {
                            txt += line + "\n";
                       }
                    }
                    
                } 
                br.close();
                
                return txt; 
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e);
        }
        return null;
    }
    
  
    
    public void readConfig(String txt, Config config) {
        
        String[] configs = txt.split("~");
        String[] general = configs[1].split("\n");
        
        //General config
        config.setDayDuration(Integer.parseInt(general[2]));
        config.setDeliveryDays(Integer.parseInt(general[4]));
 
        //Lamborghini config
        String[] lambConfigs = configs[2].split("\n");
        
        config.setInitialChasis(Integer.parseInt(lambConfigs[2]));
        config.setInitialBodys(Integer.parseInt(lambConfigs[4]));
        config.setInitialMotors(Integer.parseInt(lambConfigs[6]));
        config.setInitialWheels(Integer.parseInt(lambConfigs[8]));
        config.setInitialAccesorys(Integer.parseInt(lambConfigs[10]));
        config.setInitialAssemblers(Integer.parseInt(lambConfigs[12]));
        
        //Maserati config
        
        String[] maseConfigs = configs[3].split("\n");
        
        config.setInitialChasisM(Integer.parseInt(maseConfigs[2]));
        config.setInitialBodysM(Integer.parseInt(maseConfigs[4]));
        config.setInitialMotorsM(Integer.parseInt(maseConfigs[6]));
        config.setInitialWheelsM(Integer.parseInt(maseConfigs[8]));
        config.setInitialAccesorysM(Integer.parseInt(maseConfigs[10]));
        config.setInitialAssemblersM(Integer.parseInt(maseConfigs[12]));
    }
   
}
