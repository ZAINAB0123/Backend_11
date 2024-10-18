package task_3.util;


import task_3.model.Tigress;

public class EventProducer {

    public void activateEvent(Tigress tigress) {
        // Math.random();
        //число от 0.0 до 1.0
        // 0.0 *100 = 0  - число от
        // 0.46*100 = 46.0 => (int) => 46 ; - промежуточное число из  double преобразовали в int
        // 1.0 *100 = 100    - число до
        while (checkStatus(tigress)) {
            checkEnergy(tigress);
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 40) {
                sleepEvent(tigress);
            } else if (eventNumber >= 40 && eventNumber < 45) {
                runEvent(tigress);
            } else if (eventNumber >= 45 && eventNumber < 50) {
                eatEventBoar(tigress);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                attackEventLion(tigress);
            } else if (eventNumber >= 60 && eventNumber < 65) {
                eatEventHare(tigress);
            } else if (eventNumber >= 65 && eventNumber < 70) {
                drowningEvent(tigress);
            } else if (eventNumber >= 70 && eventNumber < 80) {
                gaveBirthEvent(tigress);
            } else if (eventNumber >= 80 && eventNumber < 90) {
                drowningEvent(tigress);
            } else if (eventNumber >= 90 && eventNumber < 100) {
                drinkEvent(tigress);
            }
          /*  try {
                wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
*/
        }
        System.out.println("Тигрица умерла(((((( " + " THE END!");
    }

    private void sleepEvent(Tigress tigress) {       // тигрица спит
        int energy = tigress.getEnergy();
        energy = energy + 20;

        tigress.setEnergy(energy);

        System.out.println("Тигрица спит " + "энергия = " + tigress.getEnergy());
    }

    private void runEvent(Tigress tigress) {        // тигрица прыгает
        int energy = tigress.getEnergy();
        energy = energy - 10;

        tigress.setEnergy(energy);

        System.out.println("тигрица побежала " + "энергия = " + tigress.getEnergy());
    }

    private void eatEventBoar(Tigress tigress) {            // тигрица съел кабана
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();
        energy = energy - 10;

        health = health + (int) (tigress.getCoefficientOfFangs() * 8);

        tigress.setEnergy(energy);
        tigress.setHealth(health);

        System.out.println("тигрица съела кабана " + "энергия = " + tigress.getEnergy() + " здоровье = " + tigress.getHealth());
    }

    private void attackEventLion(Tigress tigress) {      // лев напал на тигрицу
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();
        energy = energy - 10;

        health = health - 13;

        tigress.setEnergy(energy);
        tigress.setHealth(health);

        System.out.println("лев напал на тигрицу " + "энергия = " + tigress.getEnergy() + " здоровье = " + tigress.getHealth());
    }

    private void eatEventHare(Tigress tigress) {         // сьела зайца
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();

        energy = energy - 10;
        health = health + 5;

        tigress.setEnergy(energy);
        tigress.setHealth(health);

        System.out.println("Тигрица съела зайца " + " энергия = " + tigress.getEnergy());
    }

    private void drowningEvent(Tigress tigress) {       // тигрица тонет
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();

        energy = energy - 20;
        health = health - 10;

        tigress.setEnergy(energy);
        tigress.setHealth(health);

        System.out.println("Тигрица упала в реку и тонет " + "энергия = " + tigress.getEnergy() + " здоровье = " + tigress.getHealth());
    }

    private void gaveBirthEvent(Tigress tigress) {            // тигрица родила
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();

        energy = energy - 36;
        health = health - 33;

        tigress.setEnergy(energy);
        tigress.setHealth(health);

        System.out.println("Тигрица родила " + "энергия = " + tigress.getEnergy() + " здоровье = " + tigress.getHealth());
    }

    private void drinkEvent(Tigress tigress) {           // тигрица попила воды
        int energy = tigress.getEnergy();
        int health = tigress.getHealth();
        energy = energy - 4;
        health = health + 6;

        tigress.setEnergy(energy);
        tigress.setHealth(health);

        System.out.println("Тигрица утомилась и попила воды " + "энергия = " + tigress.getEnergy() + " здоровье = " + tigress.getHealth());
    }

    // true жив(продолжаем )
    // false умер
    private boolean checkStatus(Tigress tigress) {
        System.out.println("энергия = " + tigress.getEnergy() + " здоровье = " + tigress.getHealth());
        if (tigress.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Tigress tigress) {
        if (tigress.getEnergy() <= 0) {
            int health = tigress.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            tigress.setHealth(health);
        }
    }


}
