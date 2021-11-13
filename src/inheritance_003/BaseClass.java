package inheritance_003;

// Наследование.

class BaseClass {
    // Поля
    int baseNumber;

    // Конструктор по умолчанию.
    BaseClass() {
       baseNumber = 555;
    }

   // Пользовательский конструктор.
   BaseClass(int number) {
      this.baseNumber = number;
   }

   @Override
   public String toString() {
      return "BaseClass{" +
              "baseNumber=" + baseNumber +
              '}';
   }
}
