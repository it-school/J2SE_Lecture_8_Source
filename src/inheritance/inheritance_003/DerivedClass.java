package inheritance.inheritance_003;

class DerivedClass extends BaseClass {
   int derivedField;

   public DerivedClass(int derivedField) {
      // super();
      this.derivedField = derivedField;
   }

   // Конструктор по умолчанию.
   //public DerivedClass()
   //{
   //}

   // Пользовательский конструктор.
   // При создании объекта производного класса, конструктор производного класса
   // автоматически вызывает конструктор по умолчанию из базового класса.
   // Конструктор базового класса, присвоит всем данным какие-то свои безопасные значения.
    // После этого начнет работу конструктор производного класса, который повторно
    // будет определять значения для унаследованых членов. (ДВОЙНАЯ РАБОТА)!

    DerivedClass(int number1, int number2)
    {
        // Инициализируем поле базового класса.
        //baseNumber = number1;
        super(number1);
        // Инициализируем поле производного (данного) класса.
        derivedField = number2;
    }
}
