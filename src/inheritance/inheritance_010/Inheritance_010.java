package inheritance.inheritance_010;

class ClassA {
    void Method1() {
        System.out.println("ClassA.Method1");
    }
    void Method2() {
        System.out.println("ClassA.Method2");
    }
}

class ClassB extends ClassA {
    final void Method1() {
        System.out.println("ClassB.Method1");
    }

    void Method2() {
        System.out.println("ClassB.Method2");
    }
}

class ClassC extends ClassB {
// Попытка переопределить Method1 приводит к ошибке компилятора
// void Method1() { System.out.println("ClassC.Method1"); }

    // Переопределение Method2 позволено.
    void Method2() {
        System.out.println("ClassC.Method2");
    }

}

class Inheritance_010 {
    public static void main(String[] args) {
        ClassA instanceA = new ClassA();
        instanceA.Method1();
        instanceA.Method2();

        System.out.println("------------------------------");

        ClassB instanceB = new ClassB();
        instanceB.Method1();
        instanceB.Method2();

        System.out.println("------------------------------");

        ClassC instanceC = new ClassC();
        instanceC.Method1();
        instanceC.Method2();
    }
}

