package WritingMaterial1;

public class WritingMaterials1 {
    String name;
    String color;
    double length;
    int price;
    boolean draw;

    public WritingMaterials1(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    public WritingMaterials1(String name, int price) {
        this.name = name;
        this.color = "No color";
        this.price = price;
    }
    public WritingMaterials1(int price, double length, boolean draw) {
        this.name = "No name";
        this.color = "No color";
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    public WritingMaterials1() {
    }
    void display() {
        System.out.print("Название: " + this.name + ", Цвет: " + this.color + ", Длина: " + this.length + ", Цена: " + this.price + ", Умеет рисовать: ");
        if (this.draw) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        System.out.println("-".repeat(45));
    }
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    public void priceDown(int price1) {
        this.price = price - price1;
    }
    public void priceUp(int priceUp) {
        this.price = price + priceUp;
    }
    public void replace_rod(String colorNew) {
        this.color = colorNew;
    }
    public boolean isDraw() {
        return draw;
    }
    public void draw() {
        if(draw) {
            System.out.println(name + " провел линию. " + "Ее цвет - " + color);
        }
        else {
            System.out.println(name + " не может ничего рисовать");
        }
    }
}

class Main{
    public static void main(String[] args) {
        WritingMaterials1 pen = new WritingMaterials1("ручка", "Красный", 145, 15.6, true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials1 ruler = new WritingMaterials1("линека", 34);
        ruler.display();
        ruler.draw();

        WritingMaterials1 wm1 = new WritingMaterials1(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials1 wm2 = new WritingMaterials1("Циркуль", "Зелёный", 145, 15.6, true);
        wm2.draw = true;
        wm2.display();
        wm2.draw();
    }
}
//        Название: ручка, Цвет: Красный, Длина: 15.6, Цена: 145, Умеет рисовать: Да.
//        ручка провёл линию. Её цвет - Красный.
//        Название: ручка, Цвет: Красный, Длина: 15.6, Цена: 135, Умеет рисовать: Да.
//        Название: ручка, Цвет: Красный, Длина: 15.6, Цена: 158, Умеет рисовать: Да.
//        ручка провёл линию. Её цвет - Синий.
//        Название: линека, Цвет: No Color, Длина: 0.0, Цена: 34, Умеет рисовать: Нет.
//       линека не может ничего нарисовать.
//        Название: No Name, Цвет: No Color, Длина: 67.8, Цена: 23, Умеет рисовать: Нет.
//        No Name не может ничего нарисовать.
//        Название: Циркуль, Цвет: Зелёный, Длина: 0.0, Цена: 0, Умеет рисовать: Да.
//        Циркуль провёл линию. Её цвет - Зелёный.
