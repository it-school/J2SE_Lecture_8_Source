package inheritance_006;

class Inheritance_006 {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.Method();

        // UpCast
        BaseClass instanceUp = instance;
        instanceUp.Method();

        // DownCast
        DerivedClass instanceDown = (DerivedClass)instanceUp;
        instanceDown.Method();

        System.out.println(instance instanceof DerivedClass);
        System.out.println(instanceUp instanceof DerivedClass);
        System.out.println(instanceDown instanceof DerivedClass);
        System.out.println(instance instanceof BaseClass);
        System.out.println(instanceUp instanceof BaseClass);
        System.out.println(instanceDown instanceof BaseClass);
        System.out.println(instance instanceof Object);
        System.out.println(instanceUp instanceof Object);
        System.out.println(instanceDown instanceof Object);
    }
}
