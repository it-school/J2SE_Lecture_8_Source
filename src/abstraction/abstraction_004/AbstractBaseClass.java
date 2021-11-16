package abstraction.abstraction_004;

abstract class AbstractBaseClass {
    // 1.
    // Обычный метод передается производному классу как при наследовании от конкретного класса.
    void SimpleMethod() {
        System.out.println("AbstractBaseClass.SimpleMethod");
    }

    // 2.
    // Абстрактный метод - реализуется в производном классе.
    abstract void AbstractMethod();
}