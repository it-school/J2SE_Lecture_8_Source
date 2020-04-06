package inheritance_008;

class ClassC
{
}

class ClassA extends ClassC
{
}

class ClassD extends ClassC
{
}

class ClassB extends ClassA
{
}

class Inheritance_008
{
	public static void main(String[] args)
	{
		ClassB b = new ClassB();
		ClassA a = new ClassA();

		System.out.println(a instanceof ClassA);  // true
		System.out.println(a instanceof ClassB);  // false
		System.out.println(b instanceof ClassA);  // true
		System.out.println(b instanceof ClassB);  // true
		System.out.println(a instanceof ClassC);  // true
		System.out.println(b instanceof ClassC);  // true
		//--------------------------------------------- instanceof ---------------------------------------------
		// Оператор instanceof - проверяет совместимость объекта с заданным типом.
		// Если предоставленный объект может быть приведен к предоставленному типу не вызывая исключение,
		// выражение instanceof принимает значение true.

		// Например, в следующем коде определяется, является ли объект экземпляром типа A или типа, производного от A:

		if (b instanceof ClassA) {
			// Преобразование типов
            a = b;
        }
        else
        {
            a = null;
        }

        System.out.println(a);
    }
}
