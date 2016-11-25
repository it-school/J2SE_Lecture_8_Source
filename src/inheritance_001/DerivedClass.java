package inheritance_001;

class DerivedClass extends BaseClass{

    // Пользовательский конструктор.
    public DerivedClass()
    {
        // Изменяем все доступные поля унаследованные от базового класса.
        defaultField = "DerivedClass.defaultField";
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}
