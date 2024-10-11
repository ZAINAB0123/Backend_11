package task1.util;

import task1.model.Tigress;

public class EventProducer {
    // тигр спал +20 энергии
    // тигр пробежал -10
    // тигр сьел кабана -10 энергии koff* +4 здоровье
    // на тигра напал лев -20 энергии, -23 здоровья
    // энергия 0, то -9 здоровье
    // тигр сьел зайцф -5 koff* +2 здоровье
    // тигр тонет -40, -30 здоровье
    // тигр напал на оленя -20, -13
    // тигрица родила -56
    // тигр попил воды -4 энергии +6
// если 0 энершии то -5 здоровья
    public void activateEvent(Tigress tigress) {
       // Math.random();
        //число от 0.0 до 1.0
        // 0.0 *100 = 0  - число от
        // 0.46*100 = 46.0 => (int) => 46 ; - промежуточное число из  double преобразовали в int
        // 1.0 *100 = 100    - число до
        while (checkStatus(tigress)){
            int eventNumber =(int) (Math.random()* 100);
            if(eventNumber>=0 && eventNumber <40){
                sleepEvent(tigress);
            } else if(eventNumber >=40 && eventNumber<45){
                runEvent(tigress);
            }
            else if (eventNumber>=45 && eventNumber<50) {
                eatEventBoar(tigress);
            }
            else if(eventNumber>= 50 && eventNumber<60){
                attackEventLion(tigress);
            }
            else if(eventNumber>= 60 && eventNumber<65){
                eatEventHare(tigress);
            }
            else if (eventNumber>=65 && eventNumber<70){
                drowningEvent(tigress);
            }
            else if (eventNumber>= 70 && eventNumber<80){
                gaveBirthEvent(tigress);
            }
            else if (eventNumber>= 80 && eventNumber<90){
                drowningEvent(tigress);
            }
            else if (eventNumber>= 90 && eventNumber<100){
                drinkEvent(tigress);
            }
       /*     try {
                wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }   */
        }
        System.out.println("Тигрица умерла(((((( " + " THE END!");
    }
    private void sleepEvent(Tigress tigress){       // тигрица спит
        int energy = tigress.getEnergy();
        energy = energy + 20;
        if(energy>100){
            energy = 100;
        }
        tigress.setEnergy(energy);
        checkEnergy(tigress);
        System.out.println("Тигрица спит " + "энергия = " + tigress.getEnergy());
    }
    private void runEvent(Tigress tigress){        // тигрица прыгает
        int energy = tigress.getEnergy();
        energy= energy-10;
        if(energy<0){
            energy=0;
        }
        tigress.setEnergy(energy);
checkEnergy(tigress);
        System.out.println("тигрица побежала "+"энергия = " + tigress.getEnergy());
    }
    private void eatEventBoar(Tigress tigress){            // тигрица съел кабана
       int energy = tigress.getEnergy();
       int health = tigress.getHealth();
       energy = energy-10;
       if (energy<0){
           energy=0;
       }
       health= health+(int)(tigress.getFangs()*8);
       if (health>100){
           health=100;
       }
       tigress.setEnergy(energy);
       tigress.setHealth(health);
        checkEnergy(tigress);
        System.out.println("тигрица съела кабана "+ "энергия = "+ tigress.getEnergy()+" здоровье = " + tigress.getHealth());
    }
    private void attackEventLion(Tigress tigress){      // лев напал на тигрицу
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();
        energy=energy-10;
        if(energy<0){
            energy=0;
        }
        health = health-13;
        if(health<0){
            health=0;
        }
        tigress.setEnergy(energy);
        tigress.setHealth(health);
        checkEnergy(tigress);
        System.out.println("лев напал на тигрицу "+ "энергия = " + tigress.getEnergy()+ " здоровье = "+ tigress.getHealth());
    }
    private void eatEventHare(Tigress tigress) {         // сьела зайца
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();
        energy = energy - 10;
        if (energy < 0) {
            energy = 0;
        }
    }
    private void drowningEvent(Tigress tigress){       // тигрица тонет
int energy = tigress.getEnergy();
int health = tigress.getHealth();
energy = energy-20;
if(energy<0){
    energy=0;
}
health = health - 10;
if(health<0){
    health=0;
}
        tigress.setEnergy(energy);
        tigress.setHealth(health);
        checkEnergy(tigress);
        System.out.println("Тигрица упала в реку и тонет "+"энергия = "+tigress.getEnergy()+ " здоровье = "+ tigress.getHealth());
    }
    private void gaveBirthEvent(Tigress tigress){            // тигрица родила
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();
        energy = energy-36;
        if(energy<0){
            energy= 0;
        }
        health = health-33;
        if (health < 0) {
           health=0;
        }
        tigress.setEnergy(energy);
        tigress.setHealth(health);
        checkEnergy(tigress);
        System.out.println("Тигрица родила "+ "энергия = " + tigress.getEnergy()+ " здоровье = " + tigress.getHealth());
    }
    private void drinkEvent(Tigress tigress){           // тигрица попила воды
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();
        energy = energy-4;
        if(energy<0){
            energy=0;
        }
        health = health+6;
        if(health>100){
            health=100;
        }
        tigress.setEnergy(energy);
        tigress.setHealth(health);
        checkEnergy(tigress);
        System.out.println("Тигрица утомилась и попила воды " + "энергия = " + tigress.getEnergy()+ " здоровье = " + tigress.getHealth());
    }
    // true жив(продолжаем )
    // false умер
    private boolean checkStatus(Tigress tigress){
        System.out.println(tigress.getHealth() + tigress.getEnergy());
       if(tigress.getHealth()<=0) {
           return false;
       }else {
           return true;
       }
    }
    private void checkEnergy(Tigress tigress){
        if(tigress.getEnergy()<=0) {
            int health = tigress.getHealth();
            health = health-5;
            if(health<0){
                health=0;
            }
            tigress.setHealth(health);

        }

    }
}
