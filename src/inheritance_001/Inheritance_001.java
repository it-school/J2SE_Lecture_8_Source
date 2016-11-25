package inheritance_001;

// Наследование.

// Наследование — механизм объектно-ориентированного программирования, позволяющий описать новый (производный) класс
// на основе уже существующего (базового),
// при этом свойства и функциональность базового класса заимствуются новым производным классом.

//        Базовый класс             -                Производный  класс
//        Супер класс               -                Подкласс или (сабкласс)
//        Родительский класс        -                Дочерний класс
//        Родитель                  -                Потомок

class Inheritance_001 {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        // Обращаемся к открытым полям
        System.out.println(instance.defaultField);
        System.out.println(instance.protectedField);
        System.out.println(instance.publicField);

        // Недопустимо
        //System.out.println(instance.privateField);
    }
}
