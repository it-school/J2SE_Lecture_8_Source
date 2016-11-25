package inheritance_009;

final class FinalClass {
    int x;
    int y;
}

// Попытка наследования от SealedClass приводит к ошибке компилятора.
class DerivedClass /*extends FinalClass*/ {
}

class Inheritance_009 {
    public static void main(String[] args) {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;

        System.out.println("x = " + instance.x + " y = " + instance.y);
    }
}
