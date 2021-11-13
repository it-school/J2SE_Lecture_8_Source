package inheritance_003;

class Inheritance_003 {
    public static void main(String[] args) {
       BaseClass baseClass = new BaseClass();
       System.out.println(baseClass.baseNumber);

       BaseClass baseClass2 = new BaseClass(777);
       System.out.println(baseClass2.baseNumber);

       System.out.println();

       DerivedClass derivedClass1 = new DerivedClass(333);
       System.out.println(derivedClass1.baseNumber);
       System.out.println(derivedClass1.derivedField);

       System.out.println();

       DerivedClass instance = new DerivedClass(1, 2);

       System.out.println(instance.baseNumber);
       System.out.println(instance.derivedField);
    }
}
