package abstraction_004;

/**
 * Created by Maxim on 25.11.2016.
 */
class ConcreteDerivedClass extends AbstractBaseClass {
    // Реализуем абстрактный метод AbstractMethod() базового абстрактного класса.
    void AbstractMethod() {
        System.out.println("DerivedClass.AbstractMethod");
    }
}
