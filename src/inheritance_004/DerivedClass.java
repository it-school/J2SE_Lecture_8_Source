package inheritance_004;

class DerivedClass extends BaseClass {

    int derivedField;

    // Конструктор по умолчанию.
    public DerivedClass() {
    }

    // Пользовательский конструктор.
    // Вызывается пользовательский конструктор базового класса, при этом не нужно,
    // присваивать значения, унаследованным членам в конструкторе производного класса.
    public DerivedClass(int number1, int number2) {
        // Вызывается конструктор суперкласса
        // эта команда, должна быть всегда первой в методе-конструкторе
        super(number1);
        derivedField = number2;
        //super(number1); - недопустимо
    }
}
