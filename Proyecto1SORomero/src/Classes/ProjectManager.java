/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import UserInterface.MainUI;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProjectManager extends Thread {
    
    private float salary;
    private boolean idle;
    private int sixteenHours;
    public int daysLeft;
    private float accSalary;
    private int dayDurationInMs;
    private Studio plant;
    private MainUI userInterface;
    private int dayduration;
    private String nameplant;
    private boolean pausar;
    public float acummulatedTime = 0;
    public Config configurar;

    public ProjectManager(float salary, int daysLeft, Studio plant, MainUI userInterface,int dayduration,String nameplant,Config configurar) {
        this.salary = salary;
        this.sixteenHours = 16;
        this.idle = false;
        this.configurar = configurar;
        
        
        this.daysLeft = daysLeft;
        this.accSalary = 0;
        this.plant = plant;
        this.userInterface = userInterface;
        this.dayduration = dayduration;
        this.nameplant = nameplant;
        
        this.configurar = configurar;
        
    }
    
    @Override
    public void run(){
        
        
     
        while (true) {
            try {
            
           // this.userInterface.lambCosts(Long.toString(calculateCosts()));
           acummulatedTime = 0;
           
           this.daysLeft--;
           payCheck();
           
           while (acummulatedTime < (this.dayduration*0.67)) {
          
         if(nameplant.equals("Lamborghini")){      
            if (idle) {
                acummulatedTime += dayduration*0.0208;
                idle = false;
                Thread.sleep((long) (dayduration*0.0208));
                userInterface.managerStatusL("Watching E sports");
                
            } else {
                acummulatedTime += dayduration*0.0208;
                idle = true; 
                Thread.sleep((long) (dayduration*0.0208));
                userInterface.managerStatusL("Working accountability");
                
            }
           
                
         }else {
             if (idle) {
                acummulatedTime += dayduration*0.0208;
                idle = false;
                Thread.sleep((long) (dayduration*0.0208));
                userInterface.managerStatusM1("Watching E sports");
                
            } else {
                acummulatedTime += dayduration*0.0208;
                idle = true; 
                Thread.sleep((long) (dayduration*0.0208));
                userInterface.managerStatusM1("Working accountability");
                
            }
           
         }            
          
      }
           
            
            
            
            
            
            if(nameplant.equals("Lamborghini")){
               if(this.daysLeft >= 0) 
               {
                
                this.userInterface.daysLeftLamborghini(Integer.toString(this.daysLeft));
                userInterface.managerStatusL("Changing days"); 
               }
            }else{
                    
                    if(this.daysLeft>= 0) 
               {
                this.userInterface.DaysLeftMaserati(Integer.toString(this.daysLeft));
                userInterface.managerStatusM1("Changing days");
               }
            }
            Thread.sleep((long) (this.dayduration*0.33));
           
            
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }

   
    public void resetdays(){
  
        daysLeft = configurar.getDeliveryDays();
       
    }
    
    //Getters and Setters
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public float getAccSalary() {
        return accSalary;
    }

    public void setAccSalary(float accSalary) {
        this.accSalary = accSalary;
    }

    public int getDayDurationInMs() {
        return dayDurationInMs;
    }

    public void setDayDurationInMs(int dayDurationInMs) {
        this.dayDurationInMs = dayDurationInMs;
    }
    
    public void payCheck() {
        this.accSalary += this.salary*24;
    }
    
    public void ResetSalario(){
        this.accSalary = 0;
    }
    
    public void pausar(){ 
        this.pausar = true;
    }
    
    public void reanudar(){
        this.pausar = false;
    }
    
    
    
   
}
