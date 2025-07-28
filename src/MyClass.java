public class MyClass implements SomeClass.Callback {

    @Override
    public void callingBack() {

        System.out.println("Вызов метода обратного вызова");

    }
}
class Main2 {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myClass = new MyClass();

//инициализируем колбек, передавая методу registerCallBack экземпляр MyClass, реализующий интерфейс колбек
        someClass.registerCallBack(myClass);
        someClass.doSomething();

    }
}