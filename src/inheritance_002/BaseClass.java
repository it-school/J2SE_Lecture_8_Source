package inheritance_002;

// Наследование.

class BaseClass {
    // Поля
    // Открытое поле - доступно везде внутри пакета
    String defaultField = "BaseClass.defaultField";
    // Доступно везде
    public String publicField = "BaseClass.publicField";
    // Закрытое поле - доступно только внутри класса BaseClass
    private String privateField = "BaseClass.privateField";
    // Защищенное поле - доступно только внутри пакета, и доступно наследникам
    protected String protectedField = "BaseClass.protectedField";

    // Методы

    public void Show()
    {
        System.out.println(privateField);
    }
}
