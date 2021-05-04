public class Slayer extends Thread {
    
    ZombieCounter zc;
    public Slayer(ZombieCounter zombieCounter){

        this.zc=zombieCounter;

    }
    @Override
    public void run(){

        while(!zc.tooManyZombiesIntheRoom() && !zc.killed100Zombies()){
            
            zc.zombieKilled();

            try{

                Thread.sleep(2);
            }catch(InterruptedException e){

            }
        }

    }
 
    
}
