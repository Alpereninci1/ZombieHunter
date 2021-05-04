//Alperen İnci 
//18120205016
//lab6
import java.util.*;

public class ZombieCounter {
    
    private int zombieCounter=0;
    private int zombieKilled=0;
    
    synchronized void zombieEntered(){
        zombieCounter++;
    }

    synchronized void zombieKilled(){

        zombieCounter--;
        zombieKilled++;
    }

    synchronized boolean tooManyZombiesIntheRoom(){

        if(zombieCounter>100){

            return true;
        }

        return false;

    }

    synchronized boolean killed100Zombies(){
       
        if(zombieKilled>100){

            return true;
        }
        
        return false;
    }

    synchronized boolean zombiesExist(){
       
        return zombieCounter>0;
    }
   
    synchronized int getKilledCount(){

        return zombieKilled;
    }
    
    synchronized int getInTheRoomCount(){

        return zombieCounter;
    }


}
