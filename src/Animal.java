public class Animal {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isSwim;
    private boolean isWalk;
    private boolean isFly;
    public void display(){
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " +  age + ", Вес: " + weight +
                ", Умеет летать: " + (isFly ? "Да" : "Нет") + ", Умеет ходить: " + (isWalk ? "Да" : "Нет") + ", Умеет плавать: " + (isSwim ? "Да" : "Нет"));
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, String name, int age, double weight, boolean swim, boolean walk, boolean fly) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }
    public void rename(String name){
        this.name = name;
    }
    public void holiday(int day){
        this.weight += 0.1 * day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean setSwim(boolean b) {
        return isSwim;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setWalk(boolean b) {
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setFly(boolean fly) {
        this.isFly = fly;
    }

    public boolean isFly() {
        return isFly;
    }
}

class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.setAge(15);
        tiger.setWeight(300.6);
        tiger.setSwim(true);
        tiger.setWalk(true);
        tiger.setFly(false);
        tiger.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwim());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());
    }
}
