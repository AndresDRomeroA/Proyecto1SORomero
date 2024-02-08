/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker extends Thread{
    private float productionPerDay;
    private float salary;
    private float accSalary;
    private long dayDurationInMs;
    private String type;
    private float productionCounter;
    private Studio plant;
    private boolean pausar = false;
    
    
    public Worker(float productionPerDay, float salary, long dayDuration, String type, Studio plant) {
        this.productionPerDay = productionPerDay;
        this.salary = salary;
        this.accSalary = 0;
        this.dayDurationInMs = dayDuration;
        this.type = type;
        this.productionCounter = 0;
        this.plant = plant;
    }

    @Override
    public void run() {
        
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(true) {
            try {  
                 
             payCheck();
             produceForTheDay();
                 
                 
            sleep(this.dayDurationInMs);
              
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void produceForTheDay(){
        this.productionCounter += this.productionPerDay;
        
      
        
        if (this.productionCounter >= 1 && plant.mutex.availablePermits()> 0) {
            try {
                plant.mutex.acquire();
                plant.warehouse.updateStorage(this.type, (int) this.productionCounter, (int) this.salary*24);
                plant.mutex.release();
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            // intentar acceder al almacén
            this.productionCounter = 0;
            
        } 
    }
    
    public void changeParams(float productionRate, float salary) {
        setSalary(salary);
        setProductionPerDay(productionRate);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getAccSalary() {
        return accSalary;
    }
    
    public void resetaccsalary(){
        accSalary = 0;
    }

    public void setAccSalary(float accSalary) {
        this.accSalary = accSalary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getProductionPerDay() {
        return productionPerDay;
    }

    public void setProductionPerDay(float productionPerDay) {
        this.productionPerDay = productionPerDay;
    }
 
}
