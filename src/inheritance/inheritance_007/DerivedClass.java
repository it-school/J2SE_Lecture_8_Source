package inheritance.inheritance_007;

class DerivedClass extends BaseClass {
    // Переопределение метода базового класса.
    public  void Method()
    {
        // Вызов метода суперкласса .
        super.Method();
        System.out.println("Method from DerivedClass");
    }
}
