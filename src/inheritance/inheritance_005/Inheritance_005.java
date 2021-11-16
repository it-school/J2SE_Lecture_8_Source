package inheritance.inheritance_005;

class Inheritance_005 {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.setField1(1);
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        // Приведение экземпляра класса DerivedClass к базовому типу BaseClass.
        BaseClass newInstance = instance; // Upcast

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

        // Недопустимо, т.к. принадлжат производному классу
        //System.out.println(newInstance.field4);
        //System.out.println(newInstance.field5);


        // Проверка.
        System.out.println("instance Id     " +  instance.hashCode());
        System.out.println("newInstance Id  " +  newInstance.hashCode());

        if (instance.hashCode() == newInstance.hashCode())
            System.out.println("instance и newInstance - это один объект");
    }
}
