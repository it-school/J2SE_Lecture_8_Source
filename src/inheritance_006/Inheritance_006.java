package inheritance_006;

class Inheritance_006 {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.Method();

        // UpCast
        BaseClass instanceUp = (BaseClass) instance;
        instanceUp.Method();

        // DownCast
        DerivedClass instanceDown = (DerivedClass)instanceUp;
        instanceDown.Method();
    }
}
