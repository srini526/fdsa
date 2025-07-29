class Parent {
    public static void care(){
        System.out.println("caring");
    }
    public static void love(){
        System.out.println("Loving");
    }
    // private static void card(){
    //     System.out.println("xxxx xxxx xxxx xxxx");
    // }
}
class Child extends Parent{
    String name = "Srinivas";
    public static void snap(){
        System.out.println("SnapChat");
    }
}
class main {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        c.care();
        p.love();
    }
}
