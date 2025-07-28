package Building2;

    interface LivingHouse {
        int getQuantityYear();
        String getAddress1();
    }
    interface SocialHouse {
        int getNumberOfSeats();
        String getMonuments();
    }
    public abstract class Building {
        private String name;
        private String address;
        private int yearOfConstructions;
        private String nameArch;
        private boolean culturalMonument;

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public int getYearOfConstructions() {
            return yearOfConstructions;
        }

        public String getNameArch() {
            return nameArch;
        }

        public boolean isCulturalMonument() {
            return culturalMonument;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setYearOfConstructions(int yearOfConstructions) {
            this.yearOfConstructions = yearOfConstructions;
        }

        public void setNameArch(String nameArch) {
            this.nameArch = nameArch;
        }

        public void setCulturalMonument(boolean culturalMonument) {
            this.culturalMonument = culturalMonument;
        }

        Building(String name, int yearOfConstructions) {
            this.name = name;
            this.yearOfConstructions = yearOfConstructions;
        }
        Building(String name, String address, int yearOfConstructions, String nameArch, boolean culturalMonument) {
            this.name = name;
            this.address = address;
            this.yearOfConstructions = yearOfConstructions;
            this.nameArch = nameArch;
            this.culturalMonument = culturalMonument;
        }

        Building(String name) {
            this.name = name;
        }

        void display() {
            System.out.println(getName() + " " + getAddress() + " " + getYearOfConstructions());
        }
    }
class Library extends Building implements SocialHouse{

    int quantity_book;

    {
        quantity_book=0;
    }


    public Library(String name, String address, int yearOfConstructions, String nameArh, boolean culturalMonument) {
        super(name, address, yearOfConstructions, nameArh, culturalMonument);
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

    @Override
    public int getNumberOfSeats() {
        return quantity_book;
    }

    @Override
    public String getMonuments() {
        return isCulturalMonument() ? "YES":"NO";
    }
}
class House extends Building implements LivingHouse{

    int quantity_book;

    {
        quantity_book=0;
    }


    public House(String name, String address, int yearOfConstructions, String nameArh, boolean culturalMonument) {
        super(name, address, yearOfConstructions, nameArh, culturalMonument);
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

    @Override
    public int getQuantityYear() {
        return 2023 + getQuantityYear();
    }
    @Override
    public String getAddress1() {
        return getAddress1();
    }
}
class Main {
    public static void main(String[] args) {

        Library lib = new Library("National Library", "Nezavisimosty 1", 2004, "lib_arh", false/*, 30*/);
        System.out.println(lib);
        lib.display();

        House hou = new House("Slava home", "Lenina 40 ", 2001, "Grand", true/*,3*/);
        System.out.println(hou);
        hou.display();
    }
}



