package Interfaces_001;

interface Interface {
    void Method();
}

class MyClass implements Interface {
    @Override
    public void Method() {
        System.out.println("Метод - реализация Интерфейса.");
    }
}

class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        my.Method();
    }
}
