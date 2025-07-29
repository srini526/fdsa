public class p1k {
    private String name ="Srinivas";
    private String usn = "1AT22CG100";
    private int age;
    public void setAge (int age){
        this.age=age;

    }
    public void getData(){
        System.out.println(name + " "+usn+" "+age);
    }
    public static void main (String[] args){
        p1k p = new p1k();
        p.setAge(20);
        p.getClass();
    }
}
