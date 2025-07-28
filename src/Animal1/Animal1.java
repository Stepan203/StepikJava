package Animal1;

public class Animal1 {
    String type;
    String name;
    int age;
    double weight;
    boolean isSWin;
    boolean isWalk;
    boolean isFly;

    public Animal1(String type, String name, int age, double weight, boolean isSWin, boolean isWalk, boolean isFly) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSWin = isSWin;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }
    public Animal1() {

    }
    void display() {
        System.out.println("Тип: " + this.type + ", Имя: " + this.name + ", Возраст: " + this.age + ", Вес: " + this.weight + " ");//
        // , Умеет летать: " + ", Умеет ходить: " + this.isWalk + ", Умеет плавать: " + this.isSWin);
 //       System.out.println("-".repeat(45));
        System.out.print((this.isSWin == true ? "Да" : "Нет") + " ");
        System.out.print((this.isWalk == true ? "Да" : "Нет") + " ");
        System.out.println(this.isFly == true ? "Да" : "Нет");
    }
    public void holiday() {
        this.weight = weight + 0.1;
        this.weight = Math.ceil(weight*100)/100;
    }
    public void holiday(double m) {
        this.weight += m;
        this.weight = Math.ceil(weight*100)/100;
    }
    public void holiday(int day) {
        this.weight += + 0.1*day;
        this.weight = Math.ceil(weight*100)/100;
    }
    public void holiday(double m, int n) {
        this.weight +=  (double)m * n;
        this.weight = Math.ceil(weight*100)/100;
    }
}

class Main{
    public static void main(String[] args) {
        Animal1 duck = new Animal1("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        duck.holiday();
        duck.display();

        duck.holiday(5);
        duck.display();

        duck.holiday(0.4);
        duck.display();

        duck.holiday(0.3, 2);
        duck.display();
    }
}

//        Тип: Утка, Имя: Утя, Возраст: 3, Вес: 5.8, Умеет летать: Да, Умеет ходить: Да, Умеет плавать: Да.
//        Тип: Утка, Имя: Утя, Возраст: 3, Вес: 5.9, Умеет летать: Да, Умеет ходить: Да, Умеет плавать: Да.
//        Тип: Утка, Имя: Утя, Возраст: 3, Вес: 6.4, Умеет летать: Да, Умеет ходить: Да, Умеет плавать: Да.
//        Тип: Утка, Имя: Утя, Возраст: 3, Вес: 6.8, Умеет летать: Да, Умеет ходить: Да, Умеет плавать: Да.
//        Тип: Утка, Имя: Утя, Возраст: 3, Вес: 7.4, Умеет летать: Да, Умеет ходить: Да, Умеет плавать: Да.