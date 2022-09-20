package animals;

public abstract class Animal {
    private String picture,food,hunger,boundaries,location;


    public void sleep(){
        System.out.println("sleep");
    }
    public abstract void makeNoise();
    public abstract void eat();

    public void roam(){
        System.out.println("roam");
    }


}
