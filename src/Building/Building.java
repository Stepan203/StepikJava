package Building;

abstract class Building {
    private String name;
    private String address;
    private int yearOfConstruction;
    private String nameArh;
    private boolean culturalMonument;

    Building(String name, int yearOfConstruction) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
      //  this.culturalMonument = culturalMonument;

    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction() {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getNameArh() {
        return nameArh;
    }

    public void setNameArh(String nameArh) {
        this.nameArh = nameArh;
    }

    public boolean isCulturalMonument() {
        return culturalMonument;
    }

    public void setCulturalMonument(boolean culturalMonument) {
        culturalMonument = culturalMonument;
    }
    public String toString() {
        return "Такой тип здания - " + name + "Год его постройки - " + yearOfConstruction;
    }
    public void display() {
        System.out.println();
    }
    }
class Library extends Building {
    private int bookCounts;
    private boolean hasReadingRoom;
    private int height;

    Library(String name, int yearOfConstruction, int height) {
        super(name, yearOfConstruction);
        this.height = height;
    }

    public int getBookCounts() {
        return bookCounts;
    }

        public void setBookCounts(int bookCounts) {
            this.bookCounts = bookCounts;
        }
        public int getHeight() {
        return height;
        }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
        public String toString() {
                return "Этот тип здания - " +getName() + " его построили " + getYearOfConstruction() + " году" +  " оно высотой - " + getHeight();

        }
}
class House extends Building {
    private int floor;

    House(String name, int yearOfConstruction, int floor, boolean culturalMonument) {
    super(name, yearOfConstruction);
    this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
        public String toString() {
            return "Это здание называется - " + getName() + ", оно " + getYearOfConstruction() + " года постройки " + " в нем - " + getFloor() + " этажей";

        }
        //  @Override
      //  public void Display() {
      //      System.out.println("Название - " + this.getName() + "Год постройки - " + this.getYearOfConstruction() + "количество книг - " );

      //  }

    }
    class PoliceDepartment extends Building {
        private int countDoors;
        public int getCountDoors() {
            return countDoors;
        }

        public void setCountDoors(int countDoors) {
            this.countDoors = countDoors;
        }

    PoliceDepartment(String name, int yearOfConstruction, int countDoors) {
        super(name, yearOfConstruction);
        this.countDoors = countDoors;
    }


      @Override
        public String toString() {
          return "Название здания - " + getName() + " Год постройки - " + getYearOfConstruction() + " Количество дверей - " + countDoors;
      }
    }
 class University extends Building {

     public String getFoolName() {
         return foolName;
     }

     public void setFoolName(String foolName) {
         this.foolName = foolName;
     }

     private String foolName;
     private boolean type;
    University(String name, int yearOfConstruction, String foolName, boolean type) {
        super(name, yearOfConstruction);
        this.type = type;
        this.foolName = foolName;

    }
     public boolean isType() {
         return type;
     }

     public void setType(boolean type) {
         this.type = type;
     }
     @Override
     public String toString() {
        return "Название университета: " + getName() + "Год образования: " + getYearOfConstruction() + "Полное название университета - " + foolName + " Имеются бюджетные места - " + (type ? "Да" : "Нет");
     }
 }

  //  }
  //  class ShoppingCenter extends Building {

   // }
   // class HighRiseBuilding extends Building {

   // }


class Main{

    public static void main(String[] args) {
        Library lib = new Library("National Library", 2004, 30);
        System.out.println(lib.toString());
        lib.display();

        House hou = new House("Slava home", 2007, 3, true);
        System.out.println(hou.toString());
        hou.display();

        PoliceDepartment pol = new PoliceDepartment("Police station", 2000, 6);
        System.out.println(pol);
        pol.display();

        University uni = new University("KazNtu", 1999, "politechnical university", false);
        System.out.println(uni);
        uni.display();

       // ShoppingCenter sho = new ShoppingCenter("Mega", 2003, 2, true);
       // System.out.println(sho.toString());
       // sho.display();

       // HighRiseBuilding hig = new HighRiseBuilding("Burj Khalifa", 2010, 163, true);
       // System.out.println(hig.toString());
       // hig.display();
    }
}