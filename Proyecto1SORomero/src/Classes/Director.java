/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import UserInterface.MainUI;
import static UserInterface.MainUI.config;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Director extends Thread {
    
    private float salary;
    private float ganancialote;
    private float accSalary;
    private Studio plant;
    private MainUI userInterface;
    private ProjectManager manager;
    private Drive warehouse;
    private int dayDuration;
    private boolean pausar = false;
    private int dias = 0;
    private String nameplant;
    public float acummulatedTime = 0;
    private int salarioquitado = 0;
    private int fault = 0;
    private boolean capturado = false;
    private int costo = 0;
    private int ganancia = 0;
    private int utility = 0;
    

    
    
    
    public Director(float salary, int dayduration, Studio plant, MainUI userInterface,ProjectManager manager, Drive warehouse, String nameplant) {
        this.salary = salary;
        this.dayDuration = dayduration;
        this.accSalary = 0;
        this.manager = manager;
        this.userInterface = userInterface;
        this.warehouse = warehouse;
        this.plant = plant;
        this.nameplant = nameplant;
        
        
       }
    
    @Override
    public void run(){
        
     
        while (true) {
             try {
             
            payCheck();
          
            
            
            if( this.manager.daysLeft < 0 ){
                
                manager.resetdays();
            
                if(nameplant.equals("Lamborghini")){
                
                this.userInterface.daysLeftLamborghini(Integer.toString(this.manager.daysLeft));
                this.userInterface.lambEarnings("$" + Long.toString(warehouse.getTotalEarnings()));
                
//                costo = this.warehouse.costototal;
                this.plant.calculateCosts();
                costo = this.plant.getTotalCosts();
                ganancia = (int) this.warehouse.getTotalEarnings();
                costo = (int) (costo + this.manager.getAccSalary());
                costo = (int) (costo + this.accSalary);
                this.warehouse.totalEarnings = 0;
                costo = costo - salarioquitado;
                this.salarioquitado = 0;
                this.fault = 0;
                
                utility = ganancia - costo;
                
                this.manager.ResetSalario();
                this.accSalary = 0;
                
                this.warehouse.resetcars();
                this.userInterface.MaseAC("0");
                this.userInterface.LamborghiniSC("0");
                this.userInterface.LamborghiniAC("0");
                this.userInterface.MaseAC("0");
                
                this.userInterface.costsL("$" + Integer.toString(costo));
                this.userInterface.UtilityL("$" + Integer.toString(utility));
                this.userInterface.faultsQtyL(Integer.toString(this.fault));
                this.userInterface.managerSalaryDiscountL("$" + Integer.toString(this.salarioquitado));
                
                
                
                
                
                
                this.userInterface.directorStatusL("Reiniciando lote");
                
                Thread.sleep(dayDuration);               
                
                } else {
                
                this.userInterface.DaysLeftMaserati(Integer.toString(this.manager.daysLeft));
                this.userInterface.MaseEarnings("$" + Long.toString(warehouse.getTotalEarnings()));
                this.userInterface.directorStatusM("Reiniciando lote");
                
//                costo = this.warehouse.costototal;
                this.plant.calculateCosts();
                costo = this.plant.getTotalCosts();
                costo = (int) (costo + this.manager.getAccSalary());
                costo = (int) (costo + this.accSalary);
                costo = costo - salarioquitado;
                this.salarioquitado = 0;
                this.fault = 0;
                
                this.manager.ResetSalario();
                this.accSalary = 0;
                
                
                ganancia = (int) this.warehouse.getTotalEarnings();
                this.warehouse.totalEarnings = 0;
                
                utility = ganancia - costo;
                
                this.warehouse.resetcars();
                this.userInterface.MaseAC("0");
                this.userInterface.LamborghiniSC("0");
                this.userInterface.LamborghiniAC("0");
                this.userInterface.MaseAC("0");
                          
                this.userInterface.costsM("$" + Integer.toString(costo));
                this.userInterface.UtilityM("$" + Integer.toString(utility));
                this.userInterface.faultsQtyM1MS(Integer.toString(this.fault));
                this.userInterface.managerSalaryDiscountMS("$" + Integer.toString(this.salarioquitado));
                
                
                
                    
                    
                }
                /* 
                
                Codigo para revisar el project manager
                
                
                */
             }else {
                
                
                
                Random random = new Random();
                
                
                acummulatedTime = 0;
            
                int horaAleatoria = random.nextInt(24);
                int hora = 0;
                capturado = false;
                
                while (acummulatedTime < (this.dayDuration)) {
                        
                        hora++;   

                        if(nameplant.equals("Lamborghini")){      

                        acummulatedTime += this.dayDuration*0.0416;

                        Thread.sleep((long) (this.dayDuration*0.0416));

                            if(hora == horaAleatoria){
                                
                                if(capturado == false) {

                                    this.userInterface.directorStatusL("Watching manager");

                                    Thread.sleep((long) (this.dayDuration*0.01736));
                                    acummulatedTime += this.dayDuration*0.01736;

                                    if(this.manager.isIdle() == false){


                                        this.salarioquitado = this.salarioquitado + 100;
                                        this.fault++;

                                        this.userInterface.faultsQtyL(Integer.toString(this.fault));
                                        this.userInterface.managerSalaryDiscountL("$" + Integer.toString(this.salarioquitado));
                                        capturado = true;

                                    }

                                 this.userInterface.directorStatusL("Working ");
                                
                                }
                            }
                        }
                            else {
                        
                                acummulatedTime += this.dayDuration*0.0416;

                                Thread.sleep((long) (this.dayDuration*0.0416));

                            if(hora == horaAleatoria){
                                
                                if(capturado == false) {

                                    this.userInterface.directorStatusM("Lookings manager");

                                    Thread.sleep((long) (this.dayDuration*0.0196));
                                    acummulatedTime += this.dayDuration*0.0196;

                                    if(this.manager.isIdle() == false){


                                        this.salarioquitado = this.salarioquitado + 100;
                                        this.fault++;

                                        this.userInterface.faultsQtyM1MS(Integer.toString(this.fault));
                                        this.userInterface.managerSalaryDiscountMS("$" + Integer.toString(this.salarioquitado));
                                        capturado = true;

                                    }

                                 this.userInterface.directorStatusM("Working ");
                                
                                
                                }
                            }
                        } 

                        }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        }
    }
    
    public void pausar(){ 
        this.pausar = true;
    }
    
    public void reanudar(){
        this.pausar = false;
    }
 

    public void payCheck() {
        this.accSalary += this.salary*24;
    }
    
    
}