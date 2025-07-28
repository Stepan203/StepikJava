package Animal2;

public class Animal2 {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isSwin;
    private boolean isWalk;
    private boolean isFly;
    static int animalCount = 0;
    private int number;
    private static String description = "Статическое свойство описывающее свойства класса";

    {
        type = "No type";
        name = "Undefined";
    }
    public Animal2() {
        animalCount++;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public int getAnimalCount() {
        return animalCount;
    }

    public String isSwim() {
        return (this.isSwin ? "Да" : "Нет");
    }

    public String isWalk() {
        return (this.isWalk ? "Да" : "Нет");
    }

    public String isFly() {
        return (this.isFly ? "Да" : "Нет");
    }
    public void setType(String bird) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }
    public void setWeight() {
        this.weight = weight;
    }
    public void setNumber() {
        this.number = number;
    }
    public Animal2(String type, String name, int age, double weight, boolean isWalk, boolean isFly, boolean isSwin, int number) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isWalk = isWalk;
        this.isFly = isFly;
        this.isSwin = isSwin;
        animalCount++;
    }
    public Animal2(String type) {

        this.type = type;
        animalCount++;
    }

    public static void firstMethod() {
        System.out.println("First");
    }

    public static void getDescription() {
        System.out.println(description);
    }
    public int getNumber(){
        return animalCount;
    }
   // @Override
    public String toString()
    {
        return "Animal " + "number= " + number + " Type= " + type + " Name= " +name + " Age= " + age +" Weight= " + weight + " Swin= " + isSwin + " Walk= " +isWalk + " Fly= " +isFly;
    }
    //void display() {
    //    System.out.print("Тип: " + this.type + ", Имя: " + this.name + ", Возраст: " + this.age + ", Вес: " + this.weight + " ");
    //    System.out.print((this.isSwin == true ? "Да" : "Нет") + " ");
    //    System.out.print((this.isWalk == true ? "Да" : "Нет") + " ");
    //    System.out.println(this.isFly == true ? "Да" : "Нет");
    //}

    public static void main(String[] args) {
        Bird vorobey = new Bird("Птица", "Джек", 28, 0.5, true, false, "на югах",false, 1);
        //System.out.println("Общее количество животных - " + Animal2.animalCount());
        System.out.println("Номер животного - " + vorobey.getNumber());
        System.out.println(vorobey.toString());
        Insect zhora = new Insect();
        //System.out.println("Общее количество животных - " + Animal2.quantity);
        System.out.println("Номер животного - " + zhora.getNumber());
        System.out.println(zhora);
    }
}
class Bird extends Animal2 {
    private String area;
    private boolean winterFly;

    {
        super.setType("Bird");
        super.setName("Undefined");
    }
    public Bird(String type, String name, int age, double weight, boolean isSwin, boolean isWalk, String area, boolean winterFly, int number) {
        super(type, name, age, weight, isSwin, true, isWalk, number);
        this.area = area;
    }
    public Bird(){
        this("Голубь", "Без имени", 1, 2.5, true, true, "Юг", false, 1);
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public boolean isWinterFly() {
        return false;
    }
    public void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }

    public void setWinterFly(boolean b) {
    }
    public final void rename(String newNames) {
        String name = newNames;
    }
    @Override

    public String toString() {
        return "I am " + this.getClass().getSimpleName() + "Зона обитания: " + getArea() + " Улетает зимовать: " + isWinterFly();
    }

    //public void display() {
    //System.out.println("I am " + this.getClass().getSimpleName());
    //System.out.println("Зона обитания: " + getArea());
    //System.out.println("Улетает зимовать: " + isWinterFly());
    //chirick_chirick();
    //}
}
final class Fish extends Animal2 {
    private String squama;
    private boolean upStreamSwim;

    {
        super.setType("Fish");
        super.setName("Undefined");
    }

    public Fish(String type, String name, int age, double weight, boolean isSwin, boolean isFly, boolean isWalk, String squama, boolean upStreamSwim, int number) {
        super(type, name, age, weight, true, isFly, isSwin, number);
        this.squama = squama;
    }
    public String getSquama() {
        return squama;
    }
    public void setSquama(String squama) {
        this.squama = squama;
    }
    public void setUpStreamSwim(boolean b) {
    }
    public boolean isUpStreamSwim() {
        return true;
    }
    public Fish() {
        this("Fish", "Unknown", 0, 0.0, false, false, true, "Крупная", true, 0);
    }
    public void bul_bul() {
        System.out.println("Bul-bul");
    }
}
class Insect extends Animal2 {
    private int wingCount;
    private boolean likeJesus;
    {
        super.setType("Insect");
        super.setName("Undefined");
    }

    public Insect(String type, String name, int age, double weight, boolean isSwin, boolean isFly, boolean isWalk, int wingCount, boolean likeJesus, int number) {
        super(type, name, age, weight, isSwin, isFly, true, number);
        this.wingCount = wingCount;
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public Insect() {
        this("Insect", "Unknown", 0, 0.0, false, false, true, 0, true, 0);
    }

    public void ggggg() {
        System.out.println("Gggggg");
    }

    @Override

    public String toString() {
        return "I am " + this.getClass().getSimpleName() + " количество крыльев: " + getWingCount() + " Умеет ли ходить по воде: " + likeJesus;
    }
    //public void display() {
    //    System.out.println("I am " + this.getClass().getSimpleName());
    //    System.out.println("количество крыльев: " + getWingCount());
    //    System.out.println("Умеет ли ходить по воде: " + likeJesus);
    //    System.out.print("Насекомое делает: ");
    //    ggggg();
    //}
}


    //class Main {
    //    public static void main(String[] args) {
    //        Animal2 duck = new Animal2("Утка", "Утя", 3, 5.8, true, true, true);
    //        duck.display();

    //        Bird b = new Bird();
    //        b.setName("Bob");

    //        b.setArea("На югах");
    //        b.setWinterFly(false);
    //        b.display();
    //        System.out.println(b.getArea());
    //        System.out.println(b.isWinterFly());
    //        b.chirick_chirick();

    //        Fish f = new Fish();
    //        f.setName("Сельд");

    //        f.setSquama("Крупная");
    //        f.setUpStreamSwim(true);
    //        f.display();
    //        System.out.println(f.getSquama());
    //        System.out.println(f.isUpStreamSwim());
    //        f.bul_bul();

    //        Insect i = new Insect();
    //        i.setName("Жук Жукыч");

    //        i.setWingCount(4);
    //        i.setLikeJesus(true);
    //        i.display();
    //        System.out.println(i.getWingCount());
    //        System.out.println(i.isLikeJesus());
    //        i.ggggg();
    //    }
    //}


//      Тип: Утка, Имя: Утя, Возраст: 3, Вес: 5.8, Умеет летать: Да, Умеет ходить: Да, Умеет плавать: Да
//      Тип: Bird, Имя: Bob, Возраст: 0, Вес: 0.0, Умеет летать: Да, Умеет ходить: Нет, Умеет плавать: Нет
//      На югах
//      false
//     Chirik-Chirik
//      Тип: Fish, Имя: Сельд, Возраст: 0, Вес: 0.0, Умеет летать: Нет, Умеет ходить: Нет, Умеет плавать: Да
//        Крупная
//        true
//        Bul-bul
//        Тип: Insect, Имя: Жук Жукыч, Возраст: 0, Вес: 0.0, Умеет летать: Нет, Умеет ходить: Да, Умеет плавать: Нет
//        4
//        true
//        Ggggg
