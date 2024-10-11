package task1.model;

public class Tigress {
    // жизнь
    // энергия
    // коэффициент зубов - сколько энергии получает, когда ест
    // поел
    // спит
    private int health=100;
    private int energy=100;
    private double fangs =3.5;

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
    public double getFangs(){
        return this.fangs;
    }
}
