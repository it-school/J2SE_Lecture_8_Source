package inheritance_008;

class ClassA{}

class ClassB extends ClassA{}

class Inheritance_008 {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        ClassA a = null;

        //--------------------------------------------- instanceof ---------------------------------------------
        // Оператор instanceof - проверяет совместимость объекта с заданным типом.
        // Если предоставленный объект может быть приведен к предоставленному типу не вызывая исключение,
        // выражение instanceof принимает значение true.

        // Например, в следующем коде определяется, является ли объект экземпляром типа A или типа, производного от A:

        if (b instanceof ClassA)
        {
            // Преобразование типов
            a = (ClassA)b;
        }
        else
        {
            a = null;
        }
    }
}
