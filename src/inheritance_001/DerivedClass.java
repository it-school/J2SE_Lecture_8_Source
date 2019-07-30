package inheritance_001;

class DerivedClass extends BaseClass{
    final int field = 5;
    // Пользовательский конструктор.
    public DerivedClass()
    {
        // Изменяем все доступные поля унаследованные от базового класса.
        defaultField = "DerivedClass.defaultField";
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}
