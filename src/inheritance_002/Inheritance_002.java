package inheritance_002;

class Inheritance_002 {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        // Обращаемся к открытым полям
        System.out.println(instance.defaultField);
        System.out.println(instance.protectedField);
        System.out.println(instance.publicField);

        // Недопустимо
        //System.out.println(instance.privateField);

        // Обращаемся к открытому методу родительского класса
        instance.Show();
    }
}
