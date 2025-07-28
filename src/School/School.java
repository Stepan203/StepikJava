package School;



// Создайте структуру классов, которые могли бы использоваться в работе школы. В школе
// должны храниться списки учеников, сотрудников школы и её инвентаре, информация о
// расписании и т.д.
// В этой структуре должны присутствовать главный класс Main, который запускал бы всё
// действие. Подумайте, как наилучшим образом организовать взаимодействие классов и
// интерфейсов. Используйте все изученные технологии: инкапсуляцию, наследование,
// абстрактные классы, интерфейсы, final, static, полиморфизм (перегрузка и переопределение
// методов), конструкторы и инициализаторы. Ваш проект должен содержать не менее 15
// классов/интерфейсов. Представьте так же файл с описанием вашего проекта и системы
// классов.

class Main {

    public static void main(String[] args) {
        Student std = new Student("Semen Petrov",7, "Математика", "Хоккей");
        std.display();

    }
}

public class School {
    private String nameSchool;
    private String address;
    private boolean type;
    private int countStudents;
    private String inventar;
    private int countTools;
    private String tools;
}

    abstract class Person {

        private String name;
        private String eMail;
        private int age;
        private boolean lang;

        private String gender;

        public String getName() {
            return name;
        }

        public Person(String name) {
            this.name = name;
        }


        public String geteMail() {
            return eMail;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isLang() {
            return lang;
        }

        public void setLang(boolean lang) {
            this.lang = lang;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        void display() {
            System.out.println("Имя - " + name + "Мой пол - " + gender + "Мой e-mail " + eMail + "Мой возраст - " + age + "Знание иностранного языка ");
            if (this.lang) {
                System.out.println("имеется");
            } else {
                System.out.println("отсутствует");
            }


        }
    }
    class Student extends Person {
        public int getClassSchool() {
            return classSchool;
        }

        public String getFavoriteSubject() {
            return favoriteSubject;
        }

        public String getSport() {
            return sport;
        }

        public void setClassSchool(int classSchool) {
            this.classSchool = classSchool;
        }

        public void setFavoriteSubject(String favoriteSubject) {
            this.favoriteSubject = favoriteSubject;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }

        private int classSchool;
        private String favoriteSubject;
        private String sport;

        Student(String name, int classSchool, String favoriteSubject, String sport) {
            super(name);
            this.classSchool = classSchool;
            this.favoriteSubject = favoriteSubject;
            this.sport = sport;
        }
        @Override
        public void display() {
            System.out.println("Имя студента - " + getName() + " Учится в - " + classSchool + " классе" + " Любимый предмет - " + favoriteSubject + " Вид спорта - " + sport);
        }

    }

