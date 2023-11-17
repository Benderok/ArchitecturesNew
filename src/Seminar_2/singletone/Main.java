package Seminar_2.singletone;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр Singleton
        Singletone singleton = Singletone.getInstance();
        Singletone singleton1 = Singletone.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton);

        // Вызываем методы
        singleton.doSomething();
    }
}