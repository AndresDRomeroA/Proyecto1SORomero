/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import UserInterface.MainUI;

/**
 *
 * @author Rolando
 */
public class Drive {
    public int chasisQty;
    public int carBodyQty;
    public int wheelsQty;
    public int motorQty;
    public int accessoryQty;
    public int carStandard;
    public int carWithAccesory;
    
    public long totalEarnings;
     
    public int maxChasisQty;
    public int maxCarBodyQty;
    public int maxWheelsQty;
    public int maxMotorQty;
    public int maxAccessoryQty;
    public String nameplant;
    public int contador = 0;
    public int costototal = 0;


    private MainUI userInterface;
    
    public Drive(String nameplant,int maxChasis, int maxCarBodyQty, int maxMotor, int maxWheels,  int maxAccessory, MainUI userInterface){

        this.maxChasisQty = maxChasis;
        this.maxCarBodyQty = maxCarBodyQty;
        this.maxWheelsQty = maxWheels;
        this.maxMotorQty = maxMotor;
        this.maxAccessoryQty = maxAccessory;
        this.nameplant = nameplant;

        this.totalEarnings = 0;

        this.userInterface = userInterface;

        
        this.chasisQty = 0;
        this.carBodyQty = 0;
        this.wheelsQty = 0;
        this.motorQty = 0;
        this.accessoryQty = 0;
        this.carStandard = 0;
        this.carWithAccesory = 0;
        
    }

    public void updateStorage(String workerType, int finishedPart, int salary) {
        
        switch (workerType) {
            
            case "assembler":
                
                if(nameplant.equals("Lamborghini")){
                    if(contador == 5) {
                        if ((this.carBodyQty >= 2) && (this.chasisQty >= 1) && (this.motorQty >= 4) && (this.wheelsQty >= 4) && (this.accessoryQty >= 2)) {
                                contador = 0;
                                this.carWithAccesory++;
                                totalEarnings += 500000;
                                costototal = costototal + salary;
                                
                                
                                this.userInterface.LamborghiniAC(Integer.toString(this.carWithAccesory));
                                this.carBodyQty = this.carBodyQty - 2;
                                this.chasisQty = this.chasisQty - 1;
                                this.motorQty = this.motorQty - 4;
                                this.wheelsQty = this.wheelsQty - 4;
                                this.accessoryQty = this.accessoryQty - 2;
                             
                        }else {
                                System.out.println("");
                         }
                    }else {
                        if((this.carBodyQty >= 2) && (this.chasisQty >= 1) && (this.motorQty >= 4) && (this.wheelsQty >= 4)) {
                                contador++;
                                this.carStandard++;
                                totalEarnings += 450000;
                                costototal = costototal + salary;
                                
                                
                                this.userInterface.LamborghiniSC(Integer.toString(this.carStandard));
  
                                this.carBodyQty = this.carBodyQty - 2;
                                this.chasisQty = this.chasisQty - 1;
                                this.motorQty = this.motorQty - 4;
                                this.wheelsQty = this.wheelsQty - 4;
                                
                                
                                
                        }else {
                           System.out.println("");
                         }
                        
                    }
                }else{
                    
                    if(contador == 2) {
                        if ((this.carBodyQty >= 1) && (this.chasisQty >=1) && (this.motorQty >= 2) && (this.wheelsQty >= 4) && (this.accessoryQty >= 3)) {
                                contador = 0;
                                this.carWithAccesory++;
                                totalEarnings += 600000;
                                costototal = costototal + salary;
                           
                                
                                this.userInterface.MaseAC(Integer.toString(this.carWithAccesory));
                                this.carBodyQty = this.carBodyQty - 1;
                                this.chasisQty = this.chasisQty - 1;
                                this.motorQty = this.motorQty - 2;
                                this.wheelsQty = this.wheelsQty - 4;
                                this.accessoryQty = this.accessoryQty - 3;
                        }else {
                                System.out.println("");
                         }
                    }else {
                        if((this.carBodyQty >= 1) && (this.chasisQty >= 1) && (this.motorQty >= 2) && (this.wheelsQty >= 4)) {
                                contador++;
                                this.carStandard++;
                                totalEarnings += 250000;
                                costototal = costototal + salary;
                              
                                
                                this.userInterface.MaseSC(Integer.toString(this.carStandard));
                                
                                this.carBodyQty = this.carBodyQty - 1;
                                this.chasisQty = this.chasisQty - 1;
                                this.motorQty = this.motorQty - 2;
                                this.wheelsQty = this.wheelsQty - 4;
                                 
                                
                        }else {
                           System.out.println("");
                         }
                        
                    }
                }
                
               
                
                
                break;
            
            case "chasis":
                
                if (this.chasisQty < this.maxChasisQty) {
                    this.chasisQty += finishedPart;
                    
                    if(this.chasisQty >= this.maxChasisQty ){
                        this.chasisQty = this.maxChasisQty;
                    }
                    
                    if (this.nameplant.equals("Lamborghini")) {
                        userInterface.LamborghiniChasis(Integer.toString(this.chasisQty));
                        costototal = costototal + salary;
                    } else {
                        userInterface.MaseChasis(Integer.toString(this.chasisQty));
                        costototal = costototal + salary;
                    }
                    
                }
                break;
                
            case "wheel":
                
                if (this.wheelsQty < this.maxWheelsQty) {
                    this.wheelsQty += finishedPart;
                    
                    if(this.wheelsQty >= this.maxWheelsQty ){
                        this.wheelsQty = this.maxWheelsQty;
                    }
                    
                    if (this.nameplant.equals("Lamborghini")) {
                        userInterface.LamborghiniWheels(Integer.toString(this.wheelsQty));
                        costototal = costototal + salary;
                    } else {
                        userInterface.MaseWheels(Integer.toString(this.wheelsQty));
                        costototal = costototal + salary;
                    }   
                }
                
 
                break;
                
            case "motors":
                
                if (this.motorQty < this.maxMotorQty) {
                    this.motorQty += finishedPart;
                    
                    if(this.motorQty >= this.maxMotorQty ){
                        this.motorQty = this.maxMotorQty;
                    }
                    
                    if (this.nameplant.equals("Lamborghini")) {
                        userInterface.LamborghiniMotor(Integer.toString(this.motorQty));
                        costototal = costototal + salary;
                    } else {
                        userInterface.MaseMotor(Integer.toString(this.motorQty));
                        costototal = costototal + salary;

                    }
                }
                
                break;
                
            case "accesory":
                
                if (this.accessoryQty < this.maxAccessoryQty) {
                    this.accessoryQty += finishedPart;
                    
                    if(this.accessoryQty >= this.accessoryQty){
                        this.accessoryQty = this.accessoryQty;
                    }
                    
                    if (this.nameplant.equals("Lamborghini")) {
                        userInterface.LamborghiniAccesory(Integer.toString(this.accessoryQty));
                        costototal = costototal + salary;

                    } else {
                        userInterface.MaseAccesory(Integer.toString(this.accessoryQty));
                        costototal = costototal + salary;
                    }
                    
                }
                
                break;
                
            case "carBody":
                if (this.carBodyQty < this.maxCarBodyQty) {
                    this.carBodyQty += finishedPart;
                    
                    if(this.carBodyQty >= this.carBodyQty){
                        this.carBodyQty = this.carBodyQty;
                    }
                   
                    
                    if (this.nameplant.equals("Lamborghini")) {
                        userInterface.LamborghinicarBody(Integer.toString(this.carBodyQty));  
                        costototal = costototal + salary;
                    } else {
                        userInterface.MaseCarBody(Integer.toString(this.carBodyQty));  
                        costototal = costototal + salary;
                    }
                    

                }
                
            default:
                break;
        }
    }

    public long getTotalEarnings() {
        return totalEarnings;
    }
    
    public int returncost() {
    
        return costototal;
    }


    public void setTotalEarnings(long totalEarnings) {
        this.totalEarnings = totalEarnings;
    } 
    
    
    public void resetcars() {
    
    this.carWithAccesory = 0;
    this.carStandard = 0;
        
    }
    
}
