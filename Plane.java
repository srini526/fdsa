public abstract class Plane {
    abstract void carry();
    public void fly(){
        System.out.println("fly");
    }
}
class  Cargo extends Plane {
    public void carry(){
        System.out.println("carreis cargo");
    }
}
class Passenger extends Plane {
    public void carry(){
        System.out.println("carries passenger");
    }
}
class Main{
    public static void main(String[] args) {
        Plane p = new Cargo();
        Plane d = new Passenger();
           p.fly();
           p.carry();
           d.fly();
           d.carry();
    }
}
