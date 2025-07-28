package WritingMaterial3;

class Main{
    public static void main(String[] args) {
        WritingMaterials3 wm = new WritingMaterials3("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
    }
}
public class WritingMaterials3 {
    String name;
    String color;
    int length;
    double price;
    boolean draw;
    private static String description;
    static int count = 0;

    public final static void showDescription() {
        description = "Этот класс нужен для добавления характеристик канцелярии.";
        System.out.println(description);
    }
    public WritingMaterials3() {
        count++;
    }

    void display() {
        System.out.print("Номер " + count + " Название: " + this.name + ", Цвет: " + this.color + ", Длина: " + this.length + ", Цена: " + this.price + ", Умеет рисовать: ");
        if (this.draw) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        System.out.println("-".repeat(45));
    }

    public WritingMaterials3(String name, String color, int length, double price, boolean draw) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.price = price;
        this.draw = draw;
        count++;
    }

    public WritingMaterials3(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
    }
    public WritingMaterials3(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    public int getNumber() {
        return count;
    }

    public void priceDown(double price1) {
        this.price = price - price1;
    }

    public void priceUp(double priceUp) {
        this.price = price + priceUp;
    }

    public void replace_rod(String colorNew) {
        this.color = colorNew;
    }

    //@Override
    public void draw() {
        if (true)
            System.out.println(name + " провёл линию. 1. Их цвет -  " + color);
        if (false)
            System.out.println(name + " не может ничего нарисовать");
    }

    public void draw(int n) {
        if (true)
            System.out.println(name + "провел линию. " + n + " Их цвет - " + color);
        else
            System.out.println(name + " не может рисовать.");
    }

    public void draw(String color) {
        if (true)
            System.out.println(name + " провел линию. " + "1. Их цвет - " + color);
        else
            System.out.println(name + "не может ничего рисовать");
    }

    public void draw(String color, int n) {
        if (true)
            System.out.println(name + "провел линию: " + n + " Их цвет " + color);
        else
            System.out.println("не может ничего рисовать.");
    }
}
    class Pen extends WritingMaterials3 {
        private int countColor;
        private boolean auto;

        public Pen(String name, String color, int length, double price, boolean draw, int countColor, boolean auto) {
            super("Pen", "Blue");
            this.countColor = countColor;
        }
        public Pen(){
            this.draw = true;
            this.countColor = 1;
            this.auto = false;
        }
        public int getCountColor() {
            return countColor;
        }
        public void setCountColor(int countColor) {
            this.countColor = countColor;
        }
        public String isAuto() {
            return "Автоматическая: "+(auto ? "Да." : "Нет.");
        }
        public void setAuto(boolean b) {
            this.auto = auto;
        }
        public void writeMyName() {
            System.out.println("Stepan");
        }
        @Override
        public void display() {
            System.out.println("This is "+ this.getClass().getSimpleName()+". Мои новые свойства - количество цветов: "+ this.countColor + ", Автоматическая: "+(this.auto ?"Да":"Нет")+". ");
            super.display();
        }
    }
    final class Ruler extends WritingMaterials3 {
        private boolean wood;

        public Ruler(String name, String color, int length, double price, boolean draw, boolean wood) {
            super("Rules", "Red");
            this.wood = wood;
        }
        public Ruler(){
            this.draw = false;
            this.wood = false;
        }

        public String isWood() {
            return "Состоит из дерева: "+(wood ? "Да." : "Нет.");
        }

        public void setWood(boolean wood) {
            this.wood = wood;
        }
        public void measure() {
            System.out.println("сейчас померим длину");
        }
        @Override
        public void display() {
            System.out.println("This is "+ this.getClass().getSimpleName()+". Мои новые свойства - Длина линейки: "+ this.length + ", Сделана из дерева: "+(this.wood ?"Да":"Нет")+". ");
            super.display();
        }
    }
class Divider extends WritingMaterials3 {
    private String dividerType;
    private boolean metal;

    public Divider(String name, String color, int length, double price, boolean draw, String dividerType, boolean metal) {
        super("Divider", "Gray");
        this.dividerType = dividerType;
        this.metal = metal;
    }
    public Divider() {
        this.draw = true;
        this.dividerType = "Не указан.";
        this.metal = false;
    }
    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public String isMetal() {
        return "Сделан из металла: "+(metal? "Да." : "Нет.");
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
    public final void draw_circle() {
        System.out.println("Нарисован круг");
    }
    @Override
    public void display() {
        System.out.println("This is "+ this.getClass().getSimpleName()+". Мои новые свойства - Тип циркуля: "+ this.dividerType + ", Сделан из металла: "+(this.metal ?"Да":"Нет")+". ");
        super.display();
    }
}
