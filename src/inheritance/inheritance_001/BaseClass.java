package inheritance.inheritance_001;

// Наследование.

class BaseClass {
    // Поля
    final int field = 10;
    // Открытое поле - доступно везде внутри пакета
    String defaultField = "BaseClass.defaultField";

    // Доступно везде
    public String publicField = "BaseClass.publicField";

    // Закрытое поле - доступно только внутри класса BaseClass
    private final String privateField = "BaseClass.privateField";

    // Защищенное поле - доступно только внутри пакета, и доступно наследникам
    protected String protectedField = "BaseClass.protectedField";

    final void method() {

    }
}
