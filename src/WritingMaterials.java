public class WritingMaterials {
    String name;
    String color;
    double length;
    int price;
    boolean draw;
    // private boolean isDraw;

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    public WritingMaterials() {

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
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public boolean isDraw() {
        return draw;
    }
    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    public void priceDown(int i) {
        this.price = price - i;
    }
    public void priceUp(int i) {
        this.price = price  + i;
    }
    public void draw() {
        if(draw) {
            System.out.println(name + " провел линию. " + "Ее цвет - " + color);
        }
        else {
            System.out.println(name + " не может ничего рисовать");
        }
    }
    public void replace_rod(String color2) {
        this.color = color2;
    }

    public void color(String красный) {
    }
}
class Main1{
   public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.name = "ручка";
        pen.color ="Красный";
        pen.length = 15.6;
        pen.price = 145;
        pen.draw = true;
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.name = "линейка";
        ruler.length = 30.0;
        ruler.price = 25;
        ruler.draw = false;
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();
    }

}