/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Classes.Config;
import Classes.ReadFile;
import Classes.Studio;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainUI extends javax.swing.JFrame {
    
    
    public static Studio MaseratiPlant;
    public static Studio LamborghiniPlant;
    public static Config config;
    public int counterL = 0;
    public int counterM = 0;
    public ImageIcon imagen;
    public Icon icono;
    
    public static boolean runningL;
    public static boolean runningM;

    /**
     * @param args the command line arguments
     */
    
    
    //Lamborghini Interface
    public void LamborghiniWheels(String text){
        LamborghiniWheels.setText(text);
    }
    public void LamborghiniChasis(String text){
        LamborghiniChasis.setText(text);
    }
    public void LamborghiniMotor(String text){
        LamborghiniMotor.setText(text);
    }
    public void LamborghiniAccesory(String text){
        LamborghiniAccesory.setText(text);
    }
    public void LamborghinicarBody(String text){
        LamborghiniCarBody.setText(text);
    }
    
    public void LamborghiniSC(String text) {
        standarCarsL.setText(text);
    }
    
    public void LamborghiniAC(String text) {
        accesoryCarsL.setText(text);
    }
    
    public void LamborghiniQtys(String initialChasis, String initialBodys, String initialWheels, String initialMotors, String initialAccessorys, String initialAssemblers) {
        
        chasisWorkersL.setText(initialChasis);
        bodyWorkersL.setText(initialBodys);
        motorWorkersL.setText(initialWheels);
        wheelWorkersL.setText(initialMotors);
        accessoryWorkersL.setText(initialAccessorys);
        assemblerWorkersL.setText(initialAssemblers);
    
    }
    
    public void lambEarnings(String totalEarnings) {
        earningsL.setText(totalEarnings);
    }
    
    public void lambCosts(String totalCosts) {
        costsL.setText(totalCosts);
    }
    
    public void pintarImagen(JLabel lbl, String ruta) {
            this.imagen = new ImageIcon(ruta);
            this.icono = new ImageIcon(
                    this.imagen.getImage().getScaledInstance(
                            lbl.getWidth(), 
                            lbl.getHeight(), 
                            Image.SCALE_DEFAULT)
            );
            lbl.setIcon(this.icono);
            this.repaint();
    }
    
    
    //Maserati Interface
    public void MaseratiQtys(String initialChasis, String initialBodys, String initialWheels, String initialMotors, String initialAccessorys, String initialAssemblers) {
   
        chasisWorkersM.setText(initialChasis);
        bodyWorkersM.setText(initialBodys);
        motorWorkersM.setText(initialWheels);
        wheelWorkersM.setText(initialMotors);
        accessoryWorkersM.setText(initialAccessorys);
        assemblerWorkersM.setText(initialAssemblers);
   
    }
    
    public void MaseEarnings(String totalEarnings) {
        earningsM.setText(totalEarnings);
    }
    
    public void MaseCosts(String totalCosts) {
        costsM.setText(totalCosts);
    }
    
    public void MaseWheels(String text){
        wheelPartsM.setText(text);
    }
    public void MaseChasis(String text){
        chasisPartsM.setText(text);
    }
    public void MaseMotor(String text){
        motorPartsM.setText(text);
    }
    public void MaseAccesory(String text){
        accessoryPartsM.setText(text);
    }
    public void MaseCarBody(String text){
        bodyPartsM.setText(text);
    }
    
    public void MaseSC(String text) {
        standarCarsM.setText(text);
    }
    
    public void MaseAC(String text) {
        accesoryCarsM.setText(text);
    }
    
   
    
    public void daysLeftLamborghini(String text){
      daysLeftLLamborghini.setText(text);
    }
    
    public void DaysLeftMaserati(String text){
        DaysLeftMaserati.setText(text);
    }
    
    public void managerStatusL(String text){
        managerStatusL.setText(text);
    }
    
    
            
    public void managerStatusM1(String text){
        managerStatusM1.setText(text);
    }     
    
    public void faultsQtyM1MS(String text){
        faultsQtyM1MS.setText(text);
    }
    
    public void managerSalaryDiscountMS(String text){
        managerSalaryDiscountMS.setText(text);
    }
    
    public void managerSalaryDiscountL(String text){
        managerSalaryDiscountL.setText(text);
    }
    
    public void faultsQtyL(String text){
        faultsQtyL.setText(text);
    }
    
    public void directorStatusL(String text){
        directorStatusL.setText(text);
    }
    
    public void directorStatusM(String text){
        directorStatusM.setText(text);
    }
    
    public void costsL(String Text){
        costsL.setText(Text);
    }
    
    public void costsM(String Text){
        costsM.setText(Text);
    }
    
    public void UtilityL(String Text){
        utilityL.setText(Text);
    }
    
    public void UtilityM(String Text){
        utilityM1.setText(Text);
    }
            
    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        this.pintarImagen (this.nikelogo, "src/UserInterface/Images/Nickelodeon-logo.png");
        this.pintarImagen (this.disneylogo, "src/UserInterface/Images/Disney-logo.png");
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        config = new Config();
        
        try {
            ReadFile nfile = new ReadFile();
            String txt = nfile.readTxt();
            nfile.readConfig(txt, config);
            JOptionPane.showMessageDialog(null, "Config loaded succesfully!");
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
        
        runningL = false;
        runningM = false;
        
        disableButtonsL();
        disableButtonsM();
        
        
        

    }
    
    public void disableButtonsL() {
        if (runningL) {
            chasisPlusL.setEnabled(true);
            bodyPlusL.setEnabled(true);
            motorPlusL.setEnabled(true);
            wheelPlusL.setEnabled(true);
            accPlusL.setEnabled(true);
            assemblerPlusL.setEnabled(true);

            chasisMinL.setEnabled(true);
            bodyMinL.setEnabled(true);
            motorMinL.setEnabled(true);
            wheelMinL.setEnabled(true);
            accMinL.setEnabled(true);
            assemblerMinL.setEnabled(true);
        } else {
            chasisPlusL.setEnabled(false);
            bodyPlusL.setEnabled(false);
            motorPlusL.setEnabled(false);
            wheelPlusL.setEnabled(false);
            accPlusL.setEnabled(false);
            assemblerPlusL.setEnabled(false);

            chasisMinL.setEnabled(false);
            bodyMinL.setEnabled(false);
            motorMinL.setEnabled(false);
            wheelMinL.setEnabled(false);
            accMinL.setEnabled(false);
            assemblerMinL.setEnabled(false); 
        }
        
        
    }
    
    public void disableButtonsM() {
        if (runningM) {
            chasisPlus.setEnabled(true);
            bodyPlus.setEnabled(true);
            motorPlus.setEnabled(true);
            wheelPlus.setEnabled(true);
            accPlus.setEnabled(true);
            assemblerPlus.setEnabled(true);

            chasisMin.setEnabled(true);
            bodyMin.setEnabled(true);
            motorMin.setEnabled(true);
            wheelMin.setEnabled(true);
            accMin.setEnabled(true);
            assemblerMin.setEnabled(true);
        } else {
            chasisPlus.setEnabled(false);
            bodyPlus.setEnabled(false);
            motorPlus.setEnabled(false);
            wheelPlus.setEnabled(false);
            accPlus.setEnabled(false);
            assemblerPlus.setEnabled(false);

            chasisMin.setEnabled(false);
            bodyMin.setEnabled(false);
            motorMin.setEnabled(false);
            wheelMin.setEnabled(false);
            accMin.setEnabled(false);
            assemblerMin.setEnabled(false);
        }
        
        
    }
    
    public void disableStarts(String plantName) {
        switch (plantName) {
            
            case "L":
                startL.setEnabled(false);
                break;
                
            case "M":
                startM.setEnabled(false);
        }
    }
    
    //Change Worker if Plus button
    public void changeWorkerPlus(Studio plant, String workerType) {
 
        switch(workerType) {
            
            case "chasis":
                
                for (int i = 0; i < plant.getWorkers().length; i++) {
                    

                    if (plant.getWorkers()[i].getType().equals("waiting")) {

                        plant.getWorkers()[i].setType("chasis");
                        
                        if (plant.getName().equals("Lamborghini")) {
                            plant.getWorkers()[i].changeParams(0.5f, 20);
                            break;
                            
                        } else {
                            plant.getWorkers()[i].changeParams(0.5f, 20);
                            break;
                        }   
                    }
                }
                break;

                
            case "carBody":
                
                 for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("waiting")) {
                        
                        plant.getWorkers()[i].setType("carBody");
                        
                        if (plant.getName().equals("Lamborghini")) {
                            plant.getWorkers()[i].changeParams(0.5f, 20);
                            break;
                            
                        } else {
                            plant.getWorkers()[i].changeParams(0.5f, 20);
                            break;
                        }   
                    }
                }
                break;
                
            case "motors":
                
                 for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("waiting")) {
                        
                        plant.getWorkers()[i].setType("motors");
                        
                        if (plant.getName().equals("Lamborghini")) {
                            plant.getWorkers()[i].changeParams(3f, 20);
                            break;
                            
                        } else {
                            plant.getWorkers()[i].changeParams(3f, 20);
                            break;
                        }   
                    }
                }
                 break;
                
            case "wheel":
                
                 for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("waiting")) {
                        
                        plant.getWorkers()[i].setType("wheel");
                        
                        if (plant.getName().equals("Lamborghini")) {
                            plant.getWorkers()[i].changeParams(3f, 20);
                            break;
                            
                        } else {
                            plant.getWorkers()[i].changeParams(3f, 20);
                            break;
                        }   
                    }
                }
                break;
                
            case "accesory":
                
                 for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("waiting")) {
                        
                        plant.getWorkers()[i].setType("accesory");
                        
                        if (plant.getName().equals("Lamborghini")) {
                            plant.getWorkers()[i].changeParams(0.34f, 20);
                            break;
                            
                        } else {
                            plant.getWorkers()[i].changeParams(0.34f, 20);
                            break;
                        }   
                    }
                }
                break;
                
            case "assembler":
                
                 for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("waiting")) {
                        
                        plant.getWorkers()[i].setType("assembler");
                        
                        if (plant.getName().equals("Lamborghini")) {
                            plant.getWorkers()[i].changeParams(0.34f, 20);
                            break;
                            
                        } else {
                            plant.getWorkers()[i].changeParams(0.34f, 20);
                            break;
                        }   
                    }
                }
                break;
        }
               
    }
    
    //Change Worker if Minus button
    public void changeWorkerMinus(Studio plant, String workerType) {
        
        switch(workerType) {
            
            case "chasis":
                
                for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("chasis")) {
                        
                        plant.getWorkers()[i].setType("waiting");
                        plant.getWorkers()[i].changeParams(0, 0);
                        break;

                    }
                    
                }
                break;
                
            case "carBody":
                
                for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("carBody")) {
                        
                        plant.getWorkers()[i].setType("waiting");
                        plant.getWorkers()[i].changeParams(0, 0);
                        break;
                    }
                   
                }
                break;
                
            case "motors":
                
                for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("motors")) {
                        
                        plant.getWorkers()[i].setType("waiting");
                        plant.getWorkers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
                
            case "wheel":
                
                for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("wheels")) {
                        
                        plant.getWorkers()[i].setType("waiting");
                        plant.getWorkers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
                
            case "accesory":
                
                for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("accesory")) {
                        
                        plant.getWorkers()[i].setType("waiting");
                        plant.getWorkers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
                
            case "assembler":
                
                for (int i = 0; i < plant.getWorkers().length; i++) {
            
                    if (plant.getWorkers()[i].getType().equals("assembler")) {
                        
                        plant.getWorkers()[i].setType("waiting");
                        plant.getWorkers()[i].changeParams(0, 0);
                        break;
                    }
                    
                }
                break;
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ConfigTab = new javax.swing.JPanel();
        Maserati_label = new javax.swing.JLabel();
        Config_label = new javax.swing.JLabel();
        accessory_label = new javax.swing.JLabel();
        Lambog_label = new javax.swing.JLabel();
        General_label = new javax.swing.JLabel();
        chasis_label = new javax.swing.JLabel();
        body_label = new javax.swing.JLabel();
        motor_label = new javax.swing.JLabel();
        wheel_label = new javax.swing.JLabel();
        accesoryWorkersLamb = new javax.swing.JSpinner();
        chasisWorkersLamb = new javax.swing.JSpinner();
        bodyWorkersLamb = new javax.swing.JSpinner();
        motorWorkersLamb = new javax.swing.JSpinner();
        wheelWorkersLamb = new javax.swing.JSpinner();
        accessory_label1 = new javax.swing.JLabel();
        chasis_label1 = new javax.swing.JLabel();
        body_label1 = new javax.swing.JLabel();
        motor_label1 = new javax.swing.JLabel();
        wheel_label1 = new javax.swing.JLabel();
        accesoryWorkersMase = new javax.swing.JSpinner();
        chasisWorkersMase = new javax.swing.JSpinner();
        bodyWorkersMase = new javax.swing.JSpinner();
        motorWorkersMase = new javax.swing.JSpinner();
        wheelWorkersMase = new javax.swing.JSpinner();
        setConfiguration = new javax.swing.JButton();
        dayDuration_label = new javax.swing.JLabel();
        chasis_label3 = new javax.swing.JLabel();
        chasis_label4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dayDurationInput = new javax.swing.JTextPane();
        chasis_label5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deliveryDaysInput = new javax.swing.JTextPane();
        dayDuration_label1 = new javax.swing.JLabel();
        assemblers_label = new javax.swing.JLabel();
        assemblersLamb = new javax.swing.JSpinner();
        assemblers_label2 = new javax.swing.JLabel();
        assemblersMase = new javax.swing.JSpinner();
        LamborghiniTab = new javax.swing.JPanel();
        startL = new javax.swing.JButton();
        L_label = new javax.swing.JLabel();
        bodyWorkersL = new javax.swing.JLabel();
        wm_label3 = new javax.swing.JLabel();
        chas13 = new javax.swing.JLabel();
        chas14 = new javax.swing.JLabel();
        wheelWorkersL = new javax.swing.JLabel();
        chas15 = new javax.swing.JLabel();
        accessoryWorkersL = new javax.swing.JLabel();
        chasisWorkersL = new javax.swing.JLabel();
        chas16 = new javax.swing.JLabel();
        assemblerWorkersL = new javax.swing.JLabel();
        wm_label5 = new javax.swing.JLabel();
        chas17 = new javax.swing.JLabel();
        chas18 = new javax.swing.JLabel();
        managerStatus_label1 = new javax.swing.JLabel();
        managerSalaryDiscountL = new javax.swing.JLabel();
        motorWorkersL = new javax.swing.JLabel();
        directorStatusL = new javax.swing.JLabel();
        directorStatus_label1 = new javax.swing.JLabel();
        managerStatus_label4 = new javax.swing.JLabel();
        faultsQtyL = new javax.swing.JLabel();
        managerStatus_label5 = new javax.swing.JLabel();
        managerStatusL = new javax.swing.JLabel();
        wm_label7 = new javax.swing.JLabel();
        DayLeftLamborghini1 = new javax.swing.JLabel();
        chas19 = new javax.swing.JLabel();
        chas20 = new javax.swing.JLabel();
        accesoryCarsL = new javax.swing.JLabel();
        standarCarsL = new javax.swing.JLabel();
        assembled_labelM4 = new javax.swing.JLabel();
        daysLeftLLamborghini = new javax.swing.JLabel();
        chas21 = new javax.swing.JLabel();
        LamborghiniMotor = new javax.swing.JLabel();
        chas22 = new javax.swing.JLabel();
        chas23 = new javax.swing.JLabel();
        chas24 = new javax.swing.JLabel();
        LamborghiniCarBody = new javax.swing.JLabel();
        LamborghiniWheels = new javax.swing.JLabel();
        maxAcceM1 = new javax.swing.JLabel();
        LamborghiniChasis = new javax.swing.JLabel();
        maxChaM1 = new javax.swing.JLabel();
        maxBoM1 = new javax.swing.JLabel();
        maxMotM1 = new javax.swing.JLabel();
        MaxWheeM1 = new javax.swing.JLabel();
        wm_label9 = new javax.swing.JLabel();
        chas25 = new javax.swing.JLabel();
        LamborghiniAccesory = new javax.swing.JLabel();
        earningsL = new javax.swing.JLabel();
        assembled_labelM5 = new javax.swing.JLabel();
        assembled_labelM6 = new javax.swing.JLabel();
        costsL = new javax.swing.JLabel();
        utilityL = new javax.swing.JLabel();
        chasisPlusL = new javax.swing.JButton();
        bodyPlusL = new javax.swing.JButton();
        motorPlusL = new javax.swing.JButton();
        chasisMinL = new javax.swing.JButton();
        bodyMinL = new javax.swing.JButton();
        motorMinL = new javax.swing.JButton();
        wheelPlusL = new javax.swing.JButton();
        wheelMinL = new javax.swing.JButton();
        accMinL = new javax.swing.JButton();
        accPlusL = new javax.swing.JButton();
        assemblerMinL = new javax.swing.JButton();
        assemblerPlusL = new javax.swing.JButton();
        utility_label = new javax.swing.JFormattedTextField();
        nikelogo = new javax.swing.JLabel();
        MaseratiTab = new javax.swing.JPanel();
        startM = new javax.swing.JButton();
        chasisMin = new javax.swing.JButton();
        bodyWorkersM = new javax.swing.JLabel();
        M_label = new javax.swing.JLabel();
        wm_label = new javax.swing.JLabel();
        chas = new javax.swing.JLabel();
        chas1 = new javax.swing.JLabel();
        motorPartsM = new javax.swing.JLabel();
        chas2 = new javax.swing.JLabel();
        wheelWorkersM = new javax.swing.JLabel();
        chas3 = new javax.swing.JLabel();
        accessoryWorkersM = new javax.swing.JLabel();
        chas4 = new javax.swing.JLabel();
        chasisWorkersM = new javax.swing.JLabel();
        chas5 = new javax.swing.JLabel();
        assemblerWorkersM = new javax.swing.JLabel();
        wm_label1 = new javax.swing.JLabel();
        chas6 = new javax.swing.JLabel();
        chas7 = new javax.swing.JLabel();
        chas8 = new javax.swing.JLabel();
        chas9 = new javax.swing.JLabel();
        managerStatus_label = new javax.swing.JLabel();
        bodyPartsM = new javax.swing.JLabel();
        wheelPartsM = new javax.swing.JLabel();
        managerSalaryDiscountMS = new javax.swing.JLabel();
        motorWorkersM = new javax.swing.JLabel();
        maxAcceM = new javax.swing.JLabel();
        chasisPartsM = new javax.swing.JLabel();
        maxChaM = new javax.swing.JLabel();
        maxBoM = new javax.swing.JLabel();
        maxMotM = new javax.swing.JLabel();
        MaxWheeM = new javax.swing.JLabel();
        wm_label2 = new javax.swing.JLabel();
        directorStatusM = new javax.swing.JLabel();
        chas12 = new javax.swing.JLabel();
        directorStatus_label = new javax.swing.JLabel();
        managerStatus_label2 = new javax.swing.JLabel();
        accessoryPartsM = new javax.swing.JLabel();
        faultsQtyM1MS = new javax.swing.JLabel();
        earningsM = new javax.swing.JLabel();
        managerStatus_label3 = new javax.swing.JLabel();
        managerStatusM1 = new javax.swing.JLabel();
        wm_label4 = new javax.swing.JLabel();
        assembled_labelM = new javax.swing.JLabel();
        chas10 = new javax.swing.JLabel();
        chas11 = new javax.swing.JLabel();
        accesoryCarsM = new javax.swing.JLabel();
        standarCarsM = new javax.swing.JLabel();
        assembled_labelM1 = new javax.swing.JLabel();
        DaysLeftMaserati = new javax.swing.JLabel();
        assembled_labelM2 = new javax.swing.JLabel();
        costsM = new javax.swing.JLabel();
        utilityM1 = new javax.swing.JLabel();
        chasisPlus = new javax.swing.JButton();
        bodyPlus = new javax.swing.JButton();
        bodyMin = new javax.swing.JButton();
        motorPlus = new javax.swing.JButton();
        motorMin = new javax.swing.JButton();
        wheelPlus = new javax.swing.JButton();
        wheelMin = new javax.swing.JButton();
        accMin = new javax.swing.JButton();
        accPlus = new javax.swing.JButton();
        assemblerMin = new javax.swing.JButton();
        assemblerPlus = new javax.swing.JButton();
        utility_label1 = new javax.swing.JFormattedTextField();
        DayLeftLamborghini2 = new javax.swing.JLabel();
        disneylogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N

        ConfigTab.setBackground(new java.awt.Color(204, 204, 255));
        ConfigTab.setForeground(new java.awt.Color(255, 255, 255));
        ConfigTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Maserati_label.setBackground(new java.awt.Color(102, 102, 102));
        Maserati_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        Maserati_label.setForeground(new java.awt.Color(255, 255, 255));
        Maserati_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maserati_label.setText("Disney Channel");
        ConfigTab.add(Maserati_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 230, 60));

        Config_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        Config_label.setForeground(new java.awt.Color(102, 102, 255));
        Config_label.setText("CONFIGURATION");
        ConfigTab.add(Config_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 330, 60));

        accessory_label.setBackground(new java.awt.Color(102, 102, 102));
        accessory_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        accessory_label.setForeground(new java.awt.Color(255, 255, 255));
        accessory_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accessory_label.setText("Plot Twist");
        ConfigTab.add(accessory_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 110, 30));

        Lambog_label.setBackground(new java.awt.Color(102, 102, 102));
        Lambog_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        Lambog_label.setForeground(new java.awt.Color(255, 255, 255));
        Lambog_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lambog_label.setText("Nickelodeon");
        ConfigTab.add(Lambog_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 210, 60));

        General_label.setBackground(new java.awt.Color(102, 102, 102));
        General_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        General_label.setForeground(new java.awt.Color(255, 255, 255));
        General_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        General_label.setText("GENERAL");
        ConfigTab.add(General_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, 40));

        chasis_label.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label.setForeground(new java.awt.Color(102, 102, 255));
        chasis_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label.setText("MAXIMUM 15 Workers");
        ConfigTab.add(chasis_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 170, 30));

        body_label.setBackground(new java.awt.Color(102, 102, 102));
        body_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        body_label.setForeground(new java.awt.Color(255, 255, 255));
        body_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        body_label.setText("Escenarios");
        ConfigTab.add(body_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 90, 30));

        motor_label.setBackground(new java.awt.Color(102, 102, 102));
        motor_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        motor_label.setForeground(new java.awt.Color(255, 255, 255));
        motor_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motor_label.setText("Animador de PJ");
        ConfigTab.add(motor_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 120, 30));

        wheel_label.setBackground(new java.awt.Color(102, 102, 102));
        wheel_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        wheel_label.setForeground(new java.awt.Color(255, 255, 255));
        wheel_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wheel_label.setText("Doblaje");
        ConfigTab.add(wheel_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 90, 30));

        accesoryWorkersLamb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        accesoryWorkersLamb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        ConfigTab.add(accesoryWorkersLamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, 30));

        chasisWorkersLamb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasisWorkersLamb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        ConfigTab.add(chasisWorkersLamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 30));

        bodyWorkersLamb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        bodyWorkersLamb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        ConfigTab.add(bodyWorkersLamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 30));

        motorWorkersLamb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        motorWorkersLamb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        ConfigTab.add(motorWorkersLamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, 30));

        wheelWorkersLamb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        wheelWorkersLamb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        ConfigTab.add(wheelWorkersLamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, 30));

        accessory_label1.setBackground(new java.awt.Color(102, 102, 102));
        accessory_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        accessory_label1.setForeground(new java.awt.Color(255, 255, 255));
        accessory_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accessory_label1.setText("Plot Twist");
        ConfigTab.add(accessory_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 100, 30));

        chasis_label1.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label1.setForeground(new java.awt.Color(255, 255, 255));
        chasis_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label1.setText("Guionista");
        ConfigTab.add(chasis_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 80, 30));

        body_label1.setBackground(new java.awt.Color(102, 102, 102));
        body_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        body_label1.setForeground(new java.awt.Color(255, 255, 255));
        body_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        body_label1.setText("Escenarios");
        ConfigTab.add(body_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 90, 30));

        motor_label1.setBackground(new java.awt.Color(102, 102, 102));
        motor_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        motor_label1.setForeground(new java.awt.Color(255, 255, 255));
        motor_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motor_label1.setText("Animador de PJ");
        ConfigTab.add(motor_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 120, 30));

        wheel_label1.setBackground(new java.awt.Color(102, 102, 102));
        wheel_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        wheel_label1.setForeground(new java.awt.Color(255, 255, 255));
        wheel_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wheel_label1.setText("Doblaje");
        ConfigTab.add(wheel_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 90, 30));

        accesoryWorkersMase.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        accesoryWorkersMase.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        ConfigTab.add(accesoryWorkersMase, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, 30));

        chasisWorkersMase.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasisWorkersMase.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        ConfigTab.add(chasisWorkersMase, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, 30));

        bodyWorkersMase.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        bodyWorkersMase.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        ConfigTab.add(bodyWorkersMase, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, 30));

        motorWorkersMase.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        motorWorkersMase.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        ConfigTab.add(motorWorkersMase, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, 30));

        wheelWorkersMase.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        wheelWorkersMase.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        ConfigTab.add(wheelWorkersMase, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, 30));

        setConfiguration.setBackground(new java.awt.Color(153, 153, 255));
        setConfiguration.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        setConfiguration.setForeground(new java.awt.Color(51, 51, 51));
        setConfiguration.setText("SET CONFIGURATION");
        setConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setConfigurationActionPerformed(evt);
            }
        });
        ConfigTab.add(setConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 50));

        dayDuration_label.setBackground(new java.awt.Color(102, 102, 102));
        dayDuration_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dayDuration_label.setForeground(new java.awt.Color(255, 255, 255));
        dayDuration_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayDuration_label.setText("Day Duration (seconds)");
        ConfigTab.add(dayDuration_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, 30));

        chasis_label3.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 10)); // NOI18N
        chasis_label3.setForeground(new java.awt.Color(102, 102, 255));
        chasis_label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chasis_label3.setText("You have to press the button to set the configuration");
        ConfigTab.add(chasis_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 280, 30));

        chasis_label4.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label4.setForeground(new java.awt.Color(102, 102, 255));
        chasis_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label4.setText("MAXIMUM 12 Workers");
        ConfigTab.add(chasis_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 180, 30));

        dayDurationInput.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        dayDurationInput.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(dayDurationInput);

        ConfigTab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 120, -1));

        chasis_label5.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        chasis_label5.setForeground(new java.awt.Color(255, 255, 255));
        chasis_label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chasis_label5.setText("Guionista");
        ConfigTab.add(chasis_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 80, 30));

        deliveryDaysInput.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        deliveryDaysInput.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(deliveryDaysInput);

        ConfigTab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, -1));

        dayDuration_label1.setBackground(new java.awt.Color(102, 102, 102));
        dayDuration_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dayDuration_label1.setForeground(new java.awt.Color(255, 255, 255));
        dayDuration_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayDuration_label1.setText("Days to Deliver");
        ConfigTab.add(dayDuration_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, 30));

        assemblers_label.setBackground(new java.awt.Color(102, 102, 102));
        assemblers_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblers_label.setForeground(new java.awt.Color(255, 255, 255));
        assemblers_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assemblers_label.setText("Integrators");
        ConfigTab.add(assemblers_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 80, 30));

        assemblersLamb.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblersLamb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        ConfigTab.add(assemblersLamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, 30));

        assemblers_label2.setBackground(new java.awt.Color(102, 102, 102));
        assemblers_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblers_label2.setForeground(new java.awt.Color(255, 255, 255));
        assemblers_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assemblers_label2.setText("Integrators");
        ConfigTab.add(assemblers_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 80, 30));

        assemblersMase.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblersMase.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        assemblersMase.setToolTipText("");
        ConfigTab.add(assemblersMase, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, -1, 30));

        jTabbedPane1.addTab("Configuration", ConfigTab);

        LamborghiniTab.setBackground(new java.awt.Color(255, 127, 80));
        LamborghiniTab.setForeground(new java.awt.Color(0, 0, 0));
        LamborghiniTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startL.setBackground(new java.awt.Color(255, 172, 74));
        startL.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        startL.setForeground(new java.awt.Color(51, 51, 51));
        startL.setText("Start");
        startL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(startL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, 40));

        L_label.setBackground(new java.awt.Color(0, 0, 0));
        L_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        L_label.setForeground(new java.awt.Color(255, 197, 128));
        L_label.setText("Nickelodeon");
        LamborghiniTab.add(L_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 60));

        bodyWorkersL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        bodyWorkersL.setForeground(new java.awt.Color(255, 255, 255));
        bodyWorkersL.setText("0");
        LamborghiniTab.add(bodyWorkersL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 40, 40));

        wm_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label3.setForeground(new java.awt.Color(255, 197, 128));
        wm_label3.setText("DIRECTOR");
        LamborghiniTab.add(wm_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 140, 40));

        chas13.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas13.setForeground(new java.awt.Color(255, 255, 255));
        chas13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas13.setText("Animador de PJ");
        LamborghiniTab.add(chas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 160, 40));

        chas14.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas14.setForeground(new java.awt.Color(255, 255, 255));
        chas14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas14.setText("Doblaje");
        LamborghiniTab.add(chas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 70, 40));

        wheelWorkersL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        wheelWorkersL.setForeground(new java.awt.Color(255, 255, 255));
        wheelWorkersL.setText("0");
        LamborghiniTab.add(wheelWorkersL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 40, 40));

        chas15.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas15.setForeground(new java.awt.Color(255, 255, 255));
        chas15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas15.setText("Plot Twist");
        LamborghiniTab.add(chas15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 100, 40));

        accessoryWorkersL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accessoryWorkersL.setForeground(new java.awt.Color(255, 255, 255));
        accessoryWorkersL.setText("0");
        LamborghiniTab.add(accessoryWorkersL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 40, 40));

        chasisWorkersL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chasisWorkersL.setForeground(new java.awt.Color(255, 255, 255));
        chasisWorkersL.setText("0");
        LamborghiniTab.add(chasisWorkersL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 40, 40));

        chas16.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas16.setForeground(new java.awt.Color(255, 255, 255));
        chas16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas16.setText("Integrator:");
        LamborghiniTab.add(chas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 100, 40));

        assemblerWorkersL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        assemblerWorkersL.setForeground(new java.awt.Color(255, 255, 255));
        assemblerWorkersL.setText("0");
        LamborghiniTab.add(assemblerWorkersL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 40, 40));

        wm_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label5.setForeground(new java.awt.Color(255, 197, 128));
        wm_label5.setText("Workers");
        LamborghiniTab.add(wm_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 140, 40));

        chas17.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas17.setForeground(new java.awt.Color(255, 255, 255));
        chas17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas17.setText("Guionista");
        LamborghiniTab.add(chas17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 120, 40));

        chas18.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas18.setForeground(new java.awt.Color(255, 255, 255));
        chas18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas18.setText("Escenarios");
        LamborghiniTab.add(chas18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 110, 40));

        managerStatus_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label1.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label1.setText("Discounted:");
        LamborghiniTab.add(managerStatus_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 40));

        managerSalaryDiscountL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerSalaryDiscountL.setForeground(new java.awt.Color(255, 255, 255));
        managerSalaryDiscountL.setText("0");
        LamborghiniTab.add(managerSalaryDiscountL, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 40));

        motorWorkersL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        motorWorkersL.setForeground(new java.awt.Color(255, 255, 255));
        motorWorkersL.setText("0");
        LamborghiniTab.add(motorWorkersL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 40, 40));

        directorStatusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatusL.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        directorStatusL.setText("Working");
        LamborghiniTab.add(directorStatusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 160, 40));

        directorStatus_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatus_label1.setForeground(new java.awt.Color(255, 255, 255));
        directorStatus_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        directorStatus_label1.setText("Status:");
        LamborghiniTab.add(directorStatus_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, 40));

        managerStatus_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label4.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label4.setText("Faults:");
        LamborghiniTab.add(managerStatus_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 100, 40));

        faultsQtyL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        faultsQtyL.setForeground(new java.awt.Color(255, 255, 255));
        faultsQtyL.setText("0");
        LamborghiniTab.add(faultsQtyL, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 40, 40));

        managerStatus_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label5.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label5.setText("Status:");
        LamborghiniTab.add(managerStatus_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, 40));

        managerStatusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatusL.setForeground(new java.awt.Color(255, 255, 255));
        managerStatusL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        managerStatusL.setText("Nothing");
        LamborghiniTab.add(managerStatusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 250, 40));

        wm_label7.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label7.setForeground(new java.awt.Color(255, 197, 128));
        wm_label7.setText("PROJECT MANAGER");
        LamborghiniTab.add(wm_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 260, 40));

        DayLeftLamborghini1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        DayLeftLamborghini1.setForeground(new java.awt.Color(255, 197, 128));
        DayLeftLamborghini1.setText("DAYS LEFT:");
        LamborghiniTab.add(DayLeftLamborghini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 150, 40));

        chas19.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas19.setForeground(new java.awt.Color(255, 255, 255));
        chas19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas19.setText("With Plot Twist:");
        LamborghiniTab.add(chas19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 170, 40));

        chas20.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas20.setForeground(new java.awt.Color(255, 255, 255));
        chas20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas20.setText("Standard:");
        LamborghiniTab.add(chas20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 40));

        accesoryCarsL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accesoryCarsL.setForeground(new java.awt.Color(255, 255, 255));
        accesoryCarsL.setText("0");
        LamborghiniTab.add(accesoryCarsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 40, 40));

        standarCarsL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        standarCarsL.setForeground(new java.awt.Color(255, 255, 255));
        standarCarsL.setText("0");
        LamborghiniTab.add(standarCarsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 40, 40));

        assembled_labelM4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM4.setForeground(new java.awt.Color(255, 197, 128));
        assembled_labelM4.setText("CHAPTERS READY");
        LamborghiniTab.add(assembled_labelM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 280, 40));

        daysLeftLLamborghini.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        daysLeftLLamborghini.setForeground(new java.awt.Color(255, 197, 128));
        daysLeftLLamborghini.setText("0");
        LamborghiniTab.add(daysLeftLLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 50, 40));

        chas21.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas21.setForeground(new java.awt.Color(255, 255, 255));
        chas21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas21.setText("Escenarios");
        LamborghiniTab.add(chas21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 40));

        LamborghiniMotor.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        LamborghiniMotor.setForeground(new java.awt.Color(255, 255, 255));
        LamborghiniMotor.setText("0");
        LamborghiniTab.add(LamborghiniMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 40, 40));

        chas22.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas22.setForeground(new java.awt.Color(255, 255, 255));
        chas22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas22.setText("Guionista");
        LamborghiniTab.add(chas22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 40));

        chas23.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas23.setForeground(new java.awt.Color(255, 255, 255));
        chas23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas23.setText("Animador de PJ");
        LamborghiniTab.add(chas23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, 40));

        chas24.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas24.setForeground(new java.awt.Color(255, 255, 255));
        chas24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas24.setText("Doblaje");
        LamborghiniTab.add(chas24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 70, 40));

        LamborghiniCarBody.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        LamborghiniCarBody.setForeground(new java.awt.Color(255, 255, 255));
        LamborghiniCarBody.setText("0");
        LamborghiniTab.add(LamborghiniCarBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 40, 40));

        LamborghiniWheels.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        LamborghiniWheels.setForeground(new java.awt.Color(255, 255, 255));
        LamborghiniWheels.setText("0");
        LamborghiniTab.add(LamborghiniWheels, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, 40));

        maxAcceM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxAcceM1.setForeground(new java.awt.Color(255, 255, 255));
        maxAcceM1.setText("/ 10");
        LamborghiniTab.add(maxAcceM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 40, 40));

        LamborghiniChasis.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        LamborghiniChasis.setForeground(new java.awt.Color(255, 255, 255));
        LamborghiniChasis.setText("0");
        LamborghiniTab.add(LamborghiniChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, 40));

        maxChaM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxChaM1.setForeground(new java.awt.Color(255, 255, 255));
        maxChaM1.setText("/ 25");
        LamborghiniTab.add(maxChaM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 40));

        maxBoM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxBoM1.setForeground(new java.awt.Color(255, 255, 255));
        maxBoM1.setText("/ 20");
        LamborghiniTab.add(maxBoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 40, 40));

        maxMotM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxMotM1.setForeground(new java.awt.Color(255, 255, 255));
        maxMotM1.setText("/ 55");
        LamborghiniTab.add(maxMotM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, 40));

        MaxWheeM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        MaxWheeM1.setForeground(new java.awt.Color(255, 255, 255));
        MaxWheeM1.setText("/ 35");
        LamborghiniTab.add(MaxWheeM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 40, 40));

        wm_label9.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label9.setForeground(new java.awt.Color(255, 197, 128));
        wm_label9.setText("Chapter Element");
        LamborghiniTab.add(wm_label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 40));

        chas25.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas25.setForeground(new java.awt.Color(255, 255, 255));
        chas25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas25.setText("Plot Twist");
        LamborghiniTab.add(chas25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 40));

        LamborghiniAccesory.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        LamborghiniAccesory.setForeground(new java.awt.Color(255, 255, 255));
        LamborghiniAccesory.setText("0");
        LamborghiniTab.add(LamborghiniAccesory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 40, 40));

        earningsL.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        earningsL.setForeground(new java.awt.Color(255, 197, 128));
        earningsL.setText("0");
        LamborghiniTab.add(earningsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 210, 40));

        assembled_labelM5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM5.setForeground(new java.awt.Color(255, 197, 128));
        assembled_labelM5.setText("EARNINGS: ");
        LamborghiniTab.add(assembled_labelM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 40));

        assembled_labelM6.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM6.setForeground(new java.awt.Color(255, 197, 128));
        assembled_labelM6.setText("COSTS:");
        LamborghiniTab.add(assembled_labelM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 40));

        costsL.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        costsL.setForeground(new java.awt.Color(255, 197, 128));
        costsL.setText("0");
        LamborghiniTab.add(costsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 220, 40));

        utilityL.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        utilityL.setForeground(new java.awt.Color(255, 197, 128));
        utilityL.setText("0");
        LamborghiniTab.add(utilityL, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 220, 50));

        chasisPlusL.setBackground(new java.awt.Color(204, 204, 255));
        chasisPlusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chasisPlusL.setForeground(new java.awt.Color(51, 51, 51));
        chasisPlusL.setText("+");
        chasisPlusL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisPlusLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(chasisPlusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 20));

        bodyPlusL.setBackground(new java.awt.Color(204, 204, 255));
        bodyPlusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        bodyPlusL.setForeground(new java.awt.Color(51, 51, 51));
        bodyPlusL.setText("+");
        bodyPlusL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyPlusLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(bodyPlusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 20));

        motorPlusL.setBackground(new java.awt.Color(204, 204, 255));
        motorPlusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        motorPlusL.setForeground(new java.awt.Color(51, 51, 51));
        motorPlusL.setText("+");
        motorPlusL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorPlusLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(motorPlusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 20));

        chasisMinL.setBackground(new java.awt.Color(204, 204, 255));
        chasisMinL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chasisMinL.setForeground(new java.awt.Color(51, 51, 51));
        chasisMinL.setText("-");
        chasisMinL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisMinLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(chasisMinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 50, 20));

        bodyMinL.setBackground(new java.awt.Color(204, 204, 255));
        bodyMinL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        bodyMinL.setForeground(new java.awt.Color(51, 51, 51));
        bodyMinL.setText("-");
        bodyMinL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyMinLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(bodyMinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 50, 20));

        motorMinL.setBackground(new java.awt.Color(204, 204, 255));
        motorMinL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        motorMinL.setForeground(new java.awt.Color(51, 51, 51));
        motorMinL.setText("-");
        motorMinL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorMinLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(motorMinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 50, 20));

        wheelPlusL.setBackground(new java.awt.Color(204, 204, 255));
        wheelPlusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        wheelPlusL.setForeground(new java.awt.Color(51, 51, 51));
        wheelPlusL.setText("+");
        wheelPlusL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelPlusLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(wheelPlusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 20));

        wheelMinL.setBackground(new java.awt.Color(204, 204, 255));
        wheelMinL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        wheelMinL.setForeground(new java.awt.Color(51, 51, 51));
        wheelMinL.setText("-");
        wheelMinL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelMinLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(wheelMinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 50, 20));

        accMinL.setBackground(new java.awt.Color(204, 204, 255));
        accMinL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accMinL.setForeground(new java.awt.Color(51, 51, 51));
        accMinL.setText("-");
        accMinL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accMinLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(accMinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 50, 20));

        accPlusL.setBackground(new java.awt.Color(204, 204, 255));
        accPlusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accPlusL.setForeground(new java.awt.Color(51, 51, 51));
        accPlusL.setText("+");
        accPlusL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accPlusLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(accPlusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 20));

        assemblerMinL.setBackground(new java.awt.Color(204, 204, 255));
        assemblerMinL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        assemblerMinL.setForeground(new java.awt.Color(51, 51, 51));
        assemblerMinL.setText("-");
        assemblerMinL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assemblerMinLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(assemblerMinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 50, 20));

        assemblerPlusL.setBackground(new java.awt.Color(204, 204, 255));
        assemblerPlusL.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        assemblerPlusL.setForeground(new java.awt.Color(51, 51, 51));
        assemblerPlusL.setText("+");
        assemblerPlusL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assemblerPlusLActionPerformed(evt);
            }
        });
        LamborghiniTab.add(assemblerPlusL, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 50, 20));

        utility_label.setEditable(false);
        utility_label.setBackground(new java.awt.Color(255, 172, 74));
        utility_label.setForeground(new java.awt.Color(255, 255, 255));
        utility_label.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utility_label.setText("TOTAL PROFIT:");
        utility_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        utility_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utility_labelActionPerformed(evt);
            }
        });
        LamborghiniTab.add(utility_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 210, 50));

        nikelogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nikelogo.setName("NikeLogo"); // NOI18N
        LamborghiniTab.add(nikelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 330, 220));

        jTabbedPane1.addTab("Nickelodeon", LamborghiniTab);

        MaseratiTab.setBackground(new java.awt.Color(135, 206, 255));
        MaseratiTab.setForeground(new java.awt.Color(255, 255, 255));
        MaseratiTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startM.setBackground(new java.awt.Color(65, 105, 225));
        startM.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        startM.setForeground(new java.awt.Color(51, 51, 51));
        startM.setText("Start");
        startM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMActionPerformed(evt);
            }
        });
        MaseratiTab.add(startM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, 40));

        chasisMin.setBackground(new java.awt.Color(255, 204, 255));
        chasisMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chasisMin.setForeground(new java.awt.Color(51, 51, 51));
        chasisMin.setText("-");
        chasisMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(chasisMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 50, 20));

        bodyWorkersM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        bodyWorkersM.setForeground(new java.awt.Color(255, 255, 255));
        bodyWorkersM.setText("0");
        MaseratiTab.add(bodyWorkersM, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 40, 40));

        M_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        M_label.setForeground(new java.awt.Color(65, 105, 225));
        M_label.setText("Disney Channel");
        MaseratiTab.add(M_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 60));

        wm_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label.setForeground(new java.awt.Color(65, 105, 225));
        wm_label.setText("DIRECTOR");
        MaseratiTab.add(wm_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 140, 40));

        chas.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas.setForeground(new java.awt.Color(255, 255, 255));
        chas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas.setText("Escenarios");
        MaseratiTab.add(chas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 110, 40));

        chas1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas1.setForeground(new java.awt.Color(255, 255, 255));
        chas1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas1.setText("Animador de PJ");
        MaseratiTab.add(chas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 160, 40));

        motorPartsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        motorPartsM.setForeground(new java.awt.Color(255, 255, 255));
        motorPartsM.setText("0");
        MaseratiTab.add(motorPartsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 40, 40));

        chas2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas2.setForeground(new java.awt.Color(255, 255, 255));
        chas2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas2.setText("Doblaje");
        MaseratiTab.add(chas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 70, 40));

        wheelWorkersM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        wheelWorkersM.setForeground(new java.awt.Color(255, 255, 255));
        wheelWorkersM.setText("0");
        MaseratiTab.add(wheelWorkersM, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 40, 40));

        chas3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas3.setForeground(new java.awt.Color(255, 255, 255));
        chas3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas3.setText("Plot Twist");
        MaseratiTab.add(chas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 100, 40));

        accessoryWorkersM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accessoryWorkersM.setForeground(new java.awt.Color(255, 255, 255));
        accessoryWorkersM.setText("0");
        MaseratiTab.add(accessoryWorkersM, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 40, 40));

        chas4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas4.setForeground(new java.awt.Color(255, 255, 255));
        chas4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas4.setText("Guionista");
        MaseratiTab.add(chas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 90, 40));

        chasisWorkersM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chasisWorkersM.setForeground(new java.awt.Color(255, 255, 255));
        chasisWorkersM.setText("0");
        MaseratiTab.add(chasisWorkersM, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 40, 40));

        chas5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas5.setForeground(new java.awt.Color(255, 255, 255));
        chas5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas5.setText("Integrator:");
        MaseratiTab.add(chas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 100, 40));

        assemblerWorkersM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        assemblerWorkersM.setForeground(new java.awt.Color(255, 255, 255));
        assemblerWorkersM.setText("0");
        MaseratiTab.add(assemblerWorkersM, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 40, 40));

        wm_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label1.setForeground(new java.awt.Color(65, 105, 225));
        wm_label1.setText("Workers");
        MaseratiTab.add(wm_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 140, 40));

        chas6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas6.setForeground(new java.awt.Color(255, 255, 255));
        chas6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas6.setText("Guionista");
        MaseratiTab.add(chas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 100, 40));

        chas7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas7.setForeground(new java.awt.Color(255, 255, 255));
        chas7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas7.setText("Escenarios");
        MaseratiTab.add(chas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 120, 40));

        chas8.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas8.setForeground(new java.awt.Color(255, 255, 255));
        chas8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas8.setText("Animador de PJ");
        MaseratiTab.add(chas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, 40));

        chas9.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas9.setForeground(new java.awt.Color(255, 255, 255));
        chas9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas9.setText("Doblaje");
        MaseratiTab.add(chas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 70, 40));

        managerStatus_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label.setText("Discounted:");
        MaseratiTab.add(managerStatus_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 40));

        bodyPartsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        bodyPartsM.setForeground(new java.awt.Color(255, 255, 255));
        bodyPartsM.setText("0");
        MaseratiTab.add(bodyPartsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 40, 40));

        wheelPartsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        wheelPartsM.setForeground(new java.awt.Color(255, 255, 255));
        wheelPartsM.setText("0");
        MaseratiTab.add(wheelPartsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, 40));

        managerSalaryDiscountMS.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerSalaryDiscountMS.setForeground(new java.awt.Color(255, 255, 255));
        managerSalaryDiscountMS.setText("0");
        MaseratiTab.add(managerSalaryDiscountMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 140, 40));

        motorWorkersM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        motorWorkersM.setForeground(new java.awt.Color(255, 255, 255));
        motorWorkersM.setText("0");
        MaseratiTab.add(motorWorkersM, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 40, 40));

        maxAcceM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxAcceM.setForeground(new java.awt.Color(255, 255, 255));
        maxAcceM.setText("/ 10");
        MaseratiTab.add(maxAcceM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 40, 40));

        chasisPartsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chasisPartsM.setForeground(new java.awt.Color(255, 255, 255));
        chasisPartsM.setText("0");
        MaseratiTab.add(chasisPartsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, 40));

        maxChaM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxChaM.setForeground(new java.awt.Color(255, 255, 255));
        maxChaM.setText("/ 25");
        MaseratiTab.add(maxChaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 40));

        maxBoM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxBoM.setForeground(new java.awt.Color(255, 255, 255));
        maxBoM.setText("/ 20");
        MaseratiTab.add(maxBoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 40, 40));

        maxMotM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxMotM.setForeground(new java.awt.Color(255, 255, 255));
        maxMotM.setText("/ 55");
        MaseratiTab.add(maxMotM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, 40));

        MaxWheeM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        MaxWheeM.setForeground(new java.awt.Color(255, 255, 255));
        MaxWheeM.setText("/ 35");
        MaseratiTab.add(MaxWheeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 40, 40));

        wm_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label2.setForeground(new java.awt.Color(65, 105, 225));
        wm_label2.setText("Chapter Element");
        MaseratiTab.add(wm_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 40));

        directorStatusM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatusM.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        directorStatusM.setText("Working");
        MaseratiTab.add(directorStatusM, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 180, 40));

        chas12.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas12.setForeground(new java.awt.Color(255, 255, 255));
        chas12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas12.setText("Plot Twist");
        MaseratiTab.add(chas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 40));

        directorStatus_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatus_label.setForeground(new java.awt.Color(255, 255, 255));
        directorStatus_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        directorStatus_label.setText("Status:");
        MaseratiTab.add(directorStatus_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, 40));

        managerStatus_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label2.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label2.setText("Faults:");
        MaseratiTab.add(managerStatus_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 100, 40));

        accessoryPartsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accessoryPartsM.setForeground(new java.awt.Color(255, 255, 255));
        accessoryPartsM.setText("0");
        MaseratiTab.add(accessoryPartsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 40, 40));

        faultsQtyM1MS.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        faultsQtyM1MS.setForeground(new java.awt.Color(255, 255, 255));
        faultsQtyM1MS.setText("0");
        MaseratiTab.add(faultsQtyM1MS, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 40, 40));

        earningsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        earningsM.setForeground(new java.awt.Color(65, 105, 225));
        earningsM.setText("0");
        MaseratiTab.add(earningsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 210, 40));

        managerStatus_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label3.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label3.setText("Status:");
        MaseratiTab.add(managerStatus_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, 40));

        managerStatusM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatusM1.setForeground(new java.awt.Color(255, 255, 255));
        managerStatusM1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        managerStatusM1.setText("Nothing");
        MaseratiTab.add(managerStatusM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 250, 40));

        wm_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label4.setForeground(new java.awt.Color(65, 105, 225));
        wm_label4.setText("PROJECT MANAGER");
        MaseratiTab.add(wm_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 260, 40));

        assembled_labelM.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM.setForeground(new java.awt.Color(65, 105, 225));
        assembled_labelM.setText("EARNINGS: ");
        MaseratiTab.add(assembled_labelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 40));

        chas10.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas10.setForeground(new java.awt.Color(255, 255, 255));
        chas10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas10.setText("With Plot Twist:");
        MaseratiTab.add(chas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 170, 40));

        chas11.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas11.setForeground(new java.awt.Color(255, 255, 255));
        chas11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas11.setText("Standard:");
        MaseratiTab.add(chas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 40));

        accesoryCarsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accesoryCarsM.setForeground(new java.awt.Color(255, 255, 255));
        accesoryCarsM.setText("0");
        MaseratiTab.add(accesoryCarsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 40, 40));

        standarCarsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        standarCarsM.setForeground(new java.awt.Color(255, 255, 255));
        standarCarsM.setText("0");
        MaseratiTab.add(standarCarsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 40, 40));

        assembled_labelM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM1.setForeground(new java.awt.Color(65, 105, 225));
        assembled_labelM1.setText("CHAPTERS READY");
        MaseratiTab.add(assembled_labelM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 270, 40));

        DaysLeftMaserati.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        DaysLeftMaserati.setForeground(new java.awt.Color(65, 105, 225));
        DaysLeftMaserati.setText("0");
        MaseratiTab.add(DaysLeftMaserati, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 90, 40));

        assembled_labelM2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM2.setForeground(new java.awt.Color(65, 105, 225));
        assembled_labelM2.setText("COSTS:");
        MaseratiTab.add(assembled_labelM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 40));

        costsM.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        costsM.setForeground(new java.awt.Color(65, 105, 225));
        costsM.setText("0");
        MaseratiTab.add(costsM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 210, 40));

        utilityM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        utilityM1.setForeground(new java.awt.Color(65, 105, 225));
        utilityM1.setText("0");
        MaseratiTab.add(utilityM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 210, 50));

        chasisPlus.setBackground(new java.awt.Color(255, 204, 255));
        chasisPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chasisPlus.setForeground(new java.awt.Color(51, 51, 51));
        chasisPlus.setText("+");
        chasisPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(chasisPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 20));

        bodyPlus.setBackground(new java.awt.Color(255, 204, 255));
        bodyPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        bodyPlus.setForeground(new java.awt.Color(51, 51, 51));
        bodyPlus.setText("+");
        bodyPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(bodyPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 20));

        bodyMin.setBackground(new java.awt.Color(255, 204, 255));
        bodyMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        bodyMin.setForeground(new java.awt.Color(51, 51, 51));
        bodyMin.setText("-");
        bodyMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(bodyMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 50, 20));

        motorPlus.setBackground(new java.awt.Color(255, 204, 255));
        motorPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        motorPlus.setForeground(new java.awt.Color(51, 51, 51));
        motorPlus.setText("+");
        motorPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(motorPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 20));

        motorMin.setBackground(new java.awt.Color(255, 204, 255));
        motorMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        motorMin.setForeground(new java.awt.Color(51, 51, 51));
        motorMin.setText("-");
        motorMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(motorMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 50, 20));

        wheelPlus.setBackground(new java.awt.Color(255, 204, 255));
        wheelPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        wheelPlus.setForeground(new java.awt.Color(51, 51, 51));
        wheelPlus.setText("+");
        wheelPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(wheelPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 20));

        wheelMin.setBackground(new java.awt.Color(255, 204, 255));
        wheelMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        wheelMin.setForeground(new java.awt.Color(51, 51, 51));
        wheelMin.setText("-");
        wheelMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(wheelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 50, 20));

        accMin.setBackground(new java.awt.Color(255, 204, 255));
        accMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accMin.setForeground(new java.awt.Color(51, 51, 51));
        accMin.setText("-");
        accMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(accMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 50, 20));

        accPlus.setBackground(new java.awt.Color(255, 204, 255));
        accPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        accPlus.setForeground(new java.awt.Color(51, 51, 51));
        accPlus.setText("+");
        accPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(accPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 20));

        assemblerMin.setBackground(new java.awt.Color(255, 204, 255));
        assemblerMin.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        assemblerMin.setForeground(new java.awt.Color(51, 51, 51));
        assemblerMin.setText("-");
        assemblerMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assemblerMinActionPerformed(evt);
            }
        });
        MaseratiTab.add(assemblerMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 50, 20));

        assemblerPlus.setBackground(new java.awt.Color(255, 204, 255));
        assemblerPlus.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        assemblerPlus.setForeground(new java.awt.Color(51, 51, 51));
        assemblerPlus.setText("+");
        assemblerPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assemblerPlusActionPerformed(evt);
            }
        });
        MaseratiTab.add(assemblerPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 50, 20));

        utility_label1.setEditable(false);
        utility_label1.setBackground(new java.awt.Color(65, 105, 225));
        utility_label1.setForeground(new java.awt.Color(255, 255, 255));
        utility_label1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utility_label1.setText("TOTAL PROFIT:");
        utility_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        MaseratiTab.add(utility_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 210, 50));

        DayLeftLamborghini2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        DayLeftLamborghini2.setForeground(new java.awt.Color(65, 105, 225));
        DayLeftLamborghini2.setText("DAYS LEFT:");
        MaseratiTab.add(DayLeftLamborghini2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 150, 40));

        disneylogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disneylogo.setName("NikeLogo"); // NOI18N
        MaseratiTab.add(disneylogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 310, 130));

        jTabbedPane1.addTab("Disney Channel", MaseratiTab);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 605));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setConfigurationActionPerformed
        String configString = "General\ndayDuration\n";
        boolean pass = true;
        
        try{
            int dayDuration = Integer.parseInt(dayDurationInput.getText()) * 1000;
            int deliveryDays = Integer.parseInt(deliveryDaysInput.getText());
            
            configString += Integer.toString(dayDuration) + "\ndeliveryDays\n" + Integer.toString(deliveryDays) + "\n";
    
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "You have to enter a number");
            pass = false;
        }
        
        if (pass) {
            try {
                //Lamborghini
                configString += "\nLamborghini\nchasis\n";

                Integer chasisL = (Integer) chasisWorkersLamb.getValue();
                configString += chasisL.toString() + "\nbody\n";

                Integer bodyL = (Integer) bodyWorkersLamb.getValue();
                configString += bodyL + "\nmotor\n";

                Integer motorL = (Integer) motorWorkersLamb.getValue();
                configString += motorL + "\nwheel\n";

                Integer wheelL = (Integer) wheelWorkersLamb.getValue();
                configString += wheelL + "\naccessory\n";

                Integer accessoryL = (Integer) accesoryWorkersLamb.getValue();
                configString += accessoryL + "\nassembler\n";

                Integer assemblerL = (Integer) assemblersLamb.getValue();
                configString += assemblerL + "\n";

                int sumL = chasisL + bodyL + motorL + wheelL + accessoryL + assemblerL;

                //Maserati
                configString += "\nMaserati\nchasis\n";

                Integer chasisM = (Integer) chasisWorkersMase.getValue();
                configString += chasisM.toString() + "\nbody\n";

                Integer bodyM = (Integer) bodyWorkersMase.getValue();
                configString += bodyM + "\nmotor\n";

                Integer motorM = (Integer) motorWorkersMase.getValue();
                configString += motorM + "\nwheel\n";

                Integer wheelM = (Integer) wheelWorkersMase.getValue();
                configString += wheelM + "\naccessory\n";

                Integer accessoryM = (Integer) accesoryWorkersMase.getValue();
                configString += accessoryM + "\nassembler\n";

                Integer assemblerM = (Integer) assemblersMase.getValue();
                configString += assemblerM;


                int sumM = chasisM + bodyM + motorM + wheelM + accessoryM + assemblerM;


                if ((sumL > 12) || (sumM > 15)) {
                    throw new Exception(); 
                }
                
                ReadFile file = new ReadFile();
                file.printTxt(configString);

                String newConfig = file.readTxt();
                file.readConfig(newConfig, config);

                

            } catch(Exception e) {

                JOptionPane.showMessageDialog(null, "Enter correct amounts of workers. The maximum capacity of Nickelodeon is 12 Workers and for Disney Channel is 15 Workers" + e);
            }
        }
        
        
       
        
        
    }//GEN-LAST:event_setConfigurationActionPerformed
                             

    private void startMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMActionPerformed

            runningM = true;
            disableButtonsM();
            disableStarts("M");
            
            
            DaysLeftMaserati(Integer.toString(config.getDeliveryDays()));
            MaseratiPlant = new Studio("Maserati", this, config);
            MaseratiQtys(Integer.toString(MaseratiPlant.getChasisWorkers()), Integer.toString(MaseratiPlant.getBodyWorkers()), Integer.toString(MaseratiPlant.getMotorWorkers()), Integer.toString(MaseratiPlant.getWheelWorkers()), Integer.toString(MaseratiPlant.getAccessoryWorkers()), Integer.toString(MaseratiPlant.getAssemblers()));

    }//GEN-LAST:event_startMActionPerformed

    private void chasisMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisMinActionPerformed
       if (Integer.parseInt(chasisWorkersM.getText()) > 1) {
            int chasisInt = Integer.parseInt(chasisWorkersM.getText()) - 1;
            chasisWorkersM.setText(Integer.toString(chasisInt));
            changeWorkerMinus(MaseratiPlant, "chasis");
            MaseratiPlant.reduceChasisWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_chasisMinActionPerformed

    private void startLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startLActionPerformed

            runningL = true;
            disableButtonsL();
            disableStarts("L");
            
            daysLeftLamborghini(Integer.toString(config.getDeliveryDays()));
            
            LamborghiniPlant = new Studio("Lamborghini", this, config);
       
            LamborghiniQtys(Integer.toString(LamborghiniPlant.getChasisWorkers()), Integer.toString(LamborghiniPlant.getBodyWorkers()), Integer.toString(LamborghiniPlant.getMotorWorkers()), Integer.toString(LamborghiniPlant.getWheelWorkers()), Integer.toString(LamborghiniPlant.getAccessoryWorkers()), Integer.toString(LamborghiniPlant.getAssemblers()));

    }//GEN-LAST:event_startLActionPerformed

    private void chasisPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisPlusActionPerformed
        if ((MaseratiPlant.sumWorkers() < 15)) {
            int chasisInt = Integer.parseInt(chasisWorkersM.getText()) + 1;
            chasisWorkersM.setText(Integer.toString(chasisInt));

            changeWorkerPlus(MaseratiPlant, "chasis");
            MaseratiPlant.plusChasisWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_chasisPlusActionPerformed

    private void bodyPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyPlusActionPerformed
        if ((MaseratiPlant.sumWorkers() < 15)) {
            int bodyInt = Integer.parseInt(bodyWorkersM.getText()) + 1;
            bodyWorkersM.setText(Integer.toString(bodyInt));

            changeWorkerPlus(MaseratiPlant, "carBody");
            MaseratiPlant.plusBodyWorkers();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
        
    }//GEN-LAST:event_bodyPlusActionPerformed

    private void bodyMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyMinActionPerformed
        if ((Integer.parseInt(bodyWorkersM.getText()) > 1)) {
            int bodyInt = Integer.parseInt(bodyWorkersM.getText()) - 1;
            bodyWorkersM.setText(Integer.toString(bodyInt));
            changeWorkerMinus(MaseratiPlant, "carBody");
            MaseratiPlant.reduceBodyWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_bodyMinActionPerformed

    private void motorPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorPlusActionPerformed
        if ((MaseratiPlant.sumWorkers() < 15)) {
            int motorInt = Integer.parseInt(motorWorkersM.getText()) + 1;
            motorWorkersM.setText(Integer.toString(motorInt));

            changeWorkerPlus(MaseratiPlant, "motors");
            MaseratiPlant.plusMotorWorkers();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_motorPlusActionPerformed

    private void motorMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorMinActionPerformed
        if ((Integer.parseInt(motorWorkersM.getText()) > 1)) {
            int motorInt = Integer.parseInt(motorWorkersM.getText()) - 1;
            motorWorkersM.setText(Integer.toString(motorInt));
            changeWorkerMinus(MaseratiPlant, "motors");
            MaseratiPlant.reduceMotorWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_motorMinActionPerformed

    private void wheelPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelPlusActionPerformed
        if ((MaseratiPlant.sumWorkers() < 15)) {
            int wheelInt = Integer.parseInt(wheelWorkersM.getText()) + 1;
            wheelWorkersM.setText(Integer.toString(wheelInt));

            changeWorkerPlus(MaseratiPlant, "wheel");
            MaseratiPlant.plusWheelWorkers();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_wheelPlusActionPerformed

    private void wheelMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelMinActionPerformed
        if ((Integer.parseInt(wheelWorkersM.getText()) > 1)) {
            int wheelInt = Integer.parseInt(wheelWorkersM.getText()) - 1;
            wheelWorkersM.setText(Integer.toString(wheelInt));
            changeWorkerMinus(MaseratiPlant, "wheel");
            MaseratiPlant.reduceWheelWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_wheelMinActionPerformed

    private void accMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accMinActionPerformed
        if ((Integer.parseInt(accessoryWorkersM.getText()) > 1)) {
            int accessoryInt = Integer.parseInt(accessoryWorkersM.getText()) - 1;
            accessoryWorkersM.setText(Integer.toString(accessoryInt));
            changeWorkerMinus(MaseratiPlant, "accesory");
            MaseratiPlant.reduceAccessoryWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_accMinActionPerformed

    private void accPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accPlusActionPerformed
        if ((MaseratiPlant.sumWorkers() < 15)) {
            int accessoryInt = Integer.parseInt(accessoryWorkersM.getText()) + 1;
            accessoryWorkersM.setText(Integer.toString(accessoryInt));

            changeWorkerPlus(MaseratiPlant, "accesory");
            MaseratiPlant.plusAccessoryWorkers();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_accPlusActionPerformed

    private void assemblerMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assemblerMinActionPerformed
        if ((Integer.parseInt(assemblerWorkersM.getText()) > 1)) {
            int assemblerInt = Integer.parseInt(assemblerWorkersM.getText()) - 1;
            assemblerWorkersM.setText(Integer.toString(assemblerInt));
            changeWorkerMinus(MaseratiPlant, "assembler");
            MaseratiPlant.reduceAssemblers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_assemblerMinActionPerformed

    private void assemblerPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assemblerPlusActionPerformed
        if ((MaseratiPlant.sumWorkers() < 15)) {
            int assemblerInt = Integer.parseInt(assemblerWorkersM.getText()) + 1;
            assemblerWorkersM.setText(Integer.toString(assemblerInt));

            changeWorkerPlus(MaseratiPlant, "assembler");
            MaseratiPlant.plusAssemblers();
        
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_assemblerPlusActionPerformed

    private void chasisPlusLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisPlusLActionPerformed
        if ((LamborghiniPlant.sumWorkers() >= 12)) {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
            
        } else {
            int chasisInt = Integer.parseInt(chasisWorkersL.getText()) + 1;
            chasisWorkersL.setText(Integer.toString(chasisInt));
        
            changeWorkerPlus(LamborghiniPlant, "chasis");
            LamborghiniPlant.plusChasisWorkers();
  
        }
        
    }//GEN-LAST:event_chasisPlusLActionPerformed

    private void bodyPlusLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyPlusLActionPerformed
        if ((LamborghiniPlant.sumWorkers() < 12)) {
            int bodyInt = Integer.parseInt(bodyWorkersL.getText()) + 1;
            bodyWorkersL.setText(Integer.toString(bodyInt));
            changeWorkerPlus(LamborghiniPlant, "carBody");
            LamborghiniPlant.plusBodyWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
         
    }//GEN-LAST:event_bodyPlusLActionPerformed

    private void motorPlusLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorPlusLActionPerformed
        if ((LamborghiniPlant.sumWorkers() < 12)) {
            int motorInt = Integer.parseInt(motorWorkersL.getText()) + 1;
            motorWorkersL.setText(Integer.toString(motorInt));
            changeWorkerPlus(LamborghiniPlant, "motors");
            LamborghiniPlant.plusMotorWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
            
        }
    }//GEN-LAST:event_motorPlusLActionPerformed

    private void chasisMinLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisMinLActionPerformed
        if (Integer.parseInt(chasisWorkersL.getText()) > 1) {
            int chasisInt = Integer.parseInt(chasisWorkersL.getText()) - 1;
            chasisWorkersL.setText(Integer.toString(chasisInt));
            changeWorkerMinus(LamborghiniPlant, "chasis");
            LamborghiniPlant.reduceChasisWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_chasisMinLActionPerformed

    private void bodyMinLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyMinLActionPerformed
        if ((Integer.parseInt(bodyWorkersL.getText()) > 1)) {
            int bodyInt = Integer.parseInt(bodyWorkersL.getText()) - 1;
            bodyWorkersL.setText(Integer.toString(bodyInt));
            changeWorkerMinus(LamborghiniPlant, "body");
            LamborghiniPlant.reduceBodyWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_bodyMinLActionPerformed

    private void motorMinLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorMinLActionPerformed
        if ((Integer.parseInt(motorWorkersL.getText()) > 1)) {
            int motorInt = Integer.parseInt(motorWorkersL.getText()) - 1;
            motorWorkersL.setText(Integer.toString(motorInt));
            changeWorkerMinus(LamborghiniPlant, "motors");
            LamborghiniPlant.reduceMotorWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_motorMinLActionPerformed

    private void wheelPlusLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelPlusLActionPerformed
        if ((LamborghiniPlant.sumWorkers() < 12)) {
            int wheelInt = Integer.parseInt(wheelWorkersL.getText()) + 1;
            wheelWorkersL.setText(Integer.toString(wheelInt));
            changeWorkerPlus(LamborghiniPlant, "wheel");
            LamborghiniPlant.plusWheelWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_wheelPlusLActionPerformed

    private void wheelMinLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelMinLActionPerformed
        if ((Integer.parseInt(wheelWorkersL.getText()) > 1)) {
            int wheelInt = Integer.parseInt(wheelWorkersL.getText()) - 1;
            wheelWorkersL.setText(Integer.toString(wheelInt));
            changeWorkerMinus(LamborghiniPlant, "wheel");
            LamborghiniPlant.reduceWheelWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_wheelMinLActionPerformed

    private void accMinLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accMinLActionPerformed
        if ((Integer.parseInt(accessoryWorkersL.getText()) > 1)) {
            int accInt = Integer.parseInt(accessoryWorkersL.getText()) - 1;
            accessoryWorkersL.setText(Integer.toString(accInt));
            changeWorkerMinus(LamborghiniPlant, "accesory");
            LamborghiniPlant.reduceAccessoryWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_accMinLActionPerformed

    private void accPlusLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accPlusLActionPerformed
        if ((LamborghiniPlant.sumWorkers() < 12)) {
            int accessoryInt = Integer.parseInt(accessoryWorkersL.getText()) + 1;
            accessoryWorkersL.setText(Integer.toString(accessoryInt));
            changeWorkerPlus(LamborghiniPlant, "accesory");
            LamborghiniPlant.plusAccessoryWorkers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_accPlusLActionPerformed

    private void assemblerMinLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assemblerMinLActionPerformed

        if ((Integer.parseInt(assemblerWorkersL.getText()) > 1)) {
            int assemblerInt = Integer.parseInt(assemblerWorkersL.getText()) - 1;
            assemblerWorkersL.setText(Integer.toString(assemblerInt));
            changeWorkerMinus(LamborghiniPlant, "assembler");
            LamborghiniPlant.reduceAssemblers();
            
        } else {
            JOptionPane.showMessageDialog(null, "You have reached minimum capacity");
        }
    }//GEN-LAST:event_assemblerMinLActionPerformed

    private void assemblerPlusLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assemblerPlusLActionPerformed
        if ((LamborghiniPlant.sumWorkers() < 12)) {
            int assemblerInt = Integer.parseInt(assemblerWorkersL.getText()) + 1;
            assemblerWorkersL.setText(Integer.toString(assemblerInt));
            changeWorkerPlus(LamborghiniPlant, "assembler");
            LamborghiniPlant.plusAssemblers();
        } else {
            JOptionPane.showMessageDialog(null, "You have reached maximum capacity");
        }
    }//GEN-LAST:event_assemblerPlusLActionPerformed

    private void utility_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utility_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utility_labelActionPerformed


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfigTab;
    private javax.swing.JLabel Config_label;
    private javax.swing.JLabel DayLeftLamborghini1;
    private javax.swing.JLabel DayLeftLamborghini2;
    private javax.swing.JLabel DaysLeftMaserati;
    private javax.swing.JLabel General_label;
    private javax.swing.JLabel L_label;
    private javax.swing.JLabel Lambog_label;
    private javax.swing.JLabel LamborghiniAccesory;
    private javax.swing.JLabel LamborghiniCarBody;
    private javax.swing.JLabel LamborghiniChasis;
    private javax.swing.JLabel LamborghiniMotor;
    private javax.swing.JPanel LamborghiniTab;
    private javax.swing.JLabel LamborghiniWheels;
    private javax.swing.JLabel M_label;
    private javax.swing.JPanel MaseratiTab;
    private javax.swing.JLabel Maserati_label;
    private javax.swing.JLabel MaxWheeM;
    private javax.swing.JLabel MaxWheeM1;
    private javax.swing.JButton accMin;
    private javax.swing.JButton accMinL;
    private javax.swing.JButton accPlus;
    private javax.swing.JButton accPlusL;
    private javax.swing.JLabel accesoryCarsL;
    private javax.swing.JLabel accesoryCarsM;
    private javax.swing.JSpinner accesoryWorkersLamb;
    private javax.swing.JSpinner accesoryWorkersMase;
    private javax.swing.JLabel accessoryPartsM;
    private javax.swing.JLabel accessoryWorkersL;
    private javax.swing.JLabel accessoryWorkersM;
    private javax.swing.JLabel accessory_label;
    private javax.swing.JLabel accessory_label1;
    private javax.swing.JLabel assembled_labelM;
    private javax.swing.JLabel assembled_labelM1;
    private javax.swing.JLabel assembled_labelM2;
    private javax.swing.JLabel assembled_labelM4;
    private javax.swing.JLabel assembled_labelM5;
    private javax.swing.JLabel assembled_labelM6;
    private javax.swing.JButton assemblerMin;
    private javax.swing.JButton assemblerMinL;
    private javax.swing.JButton assemblerPlus;
    private javax.swing.JButton assemblerPlusL;
    private javax.swing.JLabel assemblerWorkersL;
    private javax.swing.JLabel assemblerWorkersM;
    private javax.swing.JSpinner assemblersLamb;
    private javax.swing.JSpinner assemblersMase;
    private javax.swing.JLabel assemblers_label;
    private javax.swing.JLabel assemblers_label2;
    private javax.swing.JButton bodyMin;
    private javax.swing.JButton bodyMinL;
    private javax.swing.JLabel bodyPartsM;
    private javax.swing.JButton bodyPlus;
    private javax.swing.JButton bodyPlusL;
    private javax.swing.JLabel bodyWorkersL;
    private javax.swing.JSpinner bodyWorkersLamb;
    private javax.swing.JLabel bodyWorkersM;
    private javax.swing.JSpinner bodyWorkersMase;
    private javax.swing.JLabel body_label;
    private javax.swing.JLabel body_label1;
    private javax.swing.JLabel chas;
    private javax.swing.JLabel chas1;
    private javax.swing.JLabel chas10;
    private javax.swing.JLabel chas11;
    private javax.swing.JLabel chas12;
    private javax.swing.JLabel chas13;
    private javax.swing.JLabel chas14;
    private javax.swing.JLabel chas15;
    private javax.swing.JLabel chas16;
    private javax.swing.JLabel chas17;
    private javax.swing.JLabel chas18;
    private javax.swing.JLabel chas19;
    private javax.swing.JLabel chas2;
    private javax.swing.JLabel chas20;
    private javax.swing.JLabel chas21;
    private javax.swing.JLabel chas22;
    private javax.swing.JLabel chas23;
    private javax.swing.JLabel chas24;
    private javax.swing.JLabel chas25;
    private javax.swing.JLabel chas3;
    private javax.swing.JLabel chas4;
    private javax.swing.JLabel chas5;
    private javax.swing.JLabel chas6;
    private javax.swing.JLabel chas7;
    private javax.swing.JLabel chas8;
    private javax.swing.JLabel chas9;
    private javax.swing.JButton chasisMin;
    private javax.swing.JButton chasisMinL;
    private javax.swing.JLabel chasisPartsM;
    private javax.swing.JButton chasisPlus;
    private javax.swing.JButton chasisPlusL;
    private javax.swing.JLabel chasisWorkersL;
    private javax.swing.JSpinner chasisWorkersLamb;
    private javax.swing.JLabel chasisWorkersM;
    private javax.swing.JSpinner chasisWorkersMase;
    private javax.swing.JLabel chasis_label;
    private javax.swing.JLabel chasis_label1;
    private javax.swing.JLabel chasis_label3;
    private javax.swing.JLabel chasis_label4;
    private javax.swing.JLabel chasis_label5;
    private javax.swing.JLabel costsL;
    private javax.swing.JLabel costsM;
    private javax.swing.JTextPane dayDurationInput;
    private javax.swing.JLabel dayDuration_label;
    private javax.swing.JLabel dayDuration_label1;
    private javax.swing.JLabel daysLeftLLamborghini;
    private javax.swing.JTextPane deliveryDaysInput;
    private javax.swing.JLabel directorStatusL;
    private javax.swing.JLabel directorStatusM;
    private javax.swing.JLabel directorStatus_label;
    private javax.swing.JLabel directorStatus_label1;
    private javax.swing.JLabel disneylogo;
    private javax.swing.JLabel earningsL;
    private javax.swing.JLabel earningsM;
    private javax.swing.JLabel faultsQtyL;
    private javax.swing.JLabel faultsQtyM1MS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel managerSalaryDiscountL;
    private javax.swing.JLabel managerSalaryDiscountMS;
    private javax.swing.JLabel managerStatusL;
    private javax.swing.JLabel managerStatusM1;
    private javax.swing.JLabel managerStatus_label;
    private javax.swing.JLabel managerStatus_label1;
    private javax.swing.JLabel managerStatus_label2;
    private javax.swing.JLabel managerStatus_label3;
    private javax.swing.JLabel managerStatus_label4;
    private javax.swing.JLabel managerStatus_label5;
    private javax.swing.JLabel maxAcceM;
    private javax.swing.JLabel maxAcceM1;
    private javax.swing.JLabel maxBoM;
    private javax.swing.JLabel maxBoM1;
    private javax.swing.JLabel maxChaM;
    private javax.swing.JLabel maxChaM1;
    private javax.swing.JLabel maxMotM;
    private javax.swing.JLabel maxMotM1;
    private javax.swing.JButton motorMin;
    private javax.swing.JButton motorMinL;
    private javax.swing.JLabel motorPartsM;
    private javax.swing.JButton motorPlus;
    private javax.swing.JButton motorPlusL;
    private javax.swing.JLabel motorWorkersL;
    private javax.swing.JSpinner motorWorkersLamb;
    private javax.swing.JLabel motorWorkersM;
    private javax.swing.JSpinner motorWorkersMase;
    private javax.swing.JLabel motor_label;
    private javax.swing.JLabel motor_label1;
    private javax.swing.JLabel nikelogo;
    private javax.swing.JButton setConfiguration;
    private javax.swing.JLabel standarCarsL;
    private javax.swing.JLabel standarCarsM;
    private javax.swing.JButton startL;
    private javax.swing.JButton startM;
    private javax.swing.JLabel utilityL;
    private javax.swing.JLabel utilityM1;
    private javax.swing.JFormattedTextField utility_label;
    private javax.swing.JFormattedTextField utility_label1;
    private javax.swing.JButton wheelMin;
    private javax.swing.JButton wheelMinL;
    private javax.swing.JLabel wheelPartsM;
    private javax.swing.JButton wheelPlus;
    private javax.swing.JButton wheelPlusL;
    private javax.swing.JLabel wheelWorkersL;
    private javax.swing.JSpinner wheelWorkersLamb;
    private javax.swing.JLabel wheelWorkersM;
    private javax.swing.JSpinner wheelWorkersMase;
    private javax.swing.JLabel wheel_label;
    private javax.swing.JLabel wheel_label1;
    private javax.swing.JLabel wm_label;
    private javax.swing.JLabel wm_label1;
    private javax.swing.JLabel wm_label2;
    private javax.swing.JLabel wm_label3;
    private javax.swing.JLabel wm_label4;
    private javax.swing.JLabel wm_label5;
    private javax.swing.JLabel wm_label7;
    private javax.swing.JLabel wm_label9;
    // End of variables declaration//GEN-END:variables

   
}
