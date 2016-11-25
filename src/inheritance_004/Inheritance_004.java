package inheritance_004;

class Inheritance_004 {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass(1, 2);

        System.out.println(instance.baseNumber);
        System.out.println(instance.derivedField);
    }
}
