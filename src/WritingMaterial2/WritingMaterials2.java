package WritingMaterial2;

public class WritingMaterials2 {
  String name;
  String color;
  Double length;
  int price;
  boolean draw;

  public WritingMaterials2() {
    this("Unspecified", "Black");
  }
    public WritingMaterials2(String name, String color) {
        this.name = name;
        this.color = color;
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
  public WritingMaterials2(String name, String color, double length, int price, boolean draw) {
      this.name = name;
      this.color = color;
      this.length = length;
      this.price = price;
      this.draw = draw;
  }
  public WritingMaterials2(String name, int price) {
      this.name = name;
      this.price = price;
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
    public Double getLength() {
      return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    public int getPrice() {
      return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isDraw() {
      return draw;
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

    //@Override
    public void draw() {
        if (true)
            System.out.println(name + " провёл линию. 1. Их цвет -  " + color);
        if (false)
            System.out.println(name + " не может ничего нарисовать" );
    }
    public void draw(int n) {
      if(true)
          System.out.println(name + "провел линию. " + n + " Их цвет - " + color);
      else
          System.out.println(name + " не может рисовать.");
    }
    public void draw(String color) {
      if(true)
          System.out.println(name + " провел линию. " + "1. Их цвет - " + color);
      else
          System.out.println(name + "не может ничего рисовать");
    }
    public void draw(String color, int n) {
      if(true)
          System.out.println(name + "провел линию: " + n + " Их цвет " + color);
      else
          System.out.println("не может ничего рисовать.");
    }
}

class Main{
    public static void main(String[] args) {
        WritingMaterials2 pen = new WritingMaterials2();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);

        WritingMaterials2 ruler = new WritingMaterials2("линека", 34);
        ruler.setDraw(false);
        pen.draw();
        pen.draw("Синий");
        pen.draw("Зелёный", 15);
        pen.draw(4);

    }

}

//Название: ручка, Цвет: Красный, Длина: 11.6, Цена: 167, Умеет рисовать: Да.
//    ручка провёл линию. Её цвет - Красный.
//    Название: ручка, Цвет: Красный, Длина: 11.6, Цена: 157, Умеет рисовать: Да.
//    Название: ручка, Цвет: Красный, Длина: 11.6, Цена: 180, Умеет рисовать: Да.
//    ручка провёл линию. Её цвет - Синий.
//    ручка
//    Синий
//    11.6
//    180
//    true
