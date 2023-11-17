package Seminar_2.singletone;

public class Singletone {

    // Приватное статическое поле для хранения единственного экземпляра класса
    private static Singletone instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private Singletone() {
        // Инициализация
    }

    // Публичный статический метод для получения экземпляра Singleton
    public static Singletone getInstance() {
        // Если экземпляр ещё не создан, создаем его
        if (instance == null) {
            instance = new Singletone();
        }
        // Возвращаем единственный экземпляр
        return instance;
    }

    // Другие методы и поля класса

    public void doSomething() {
        System.out.println("Вызван метод doSomething()");
    }
}