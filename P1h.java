public class P1h {
    public static void main(String[] args) {
    for (int i = 0 ; i < 30;  i++){
        if (i%5==0 && i%3==0) {
            System.out.println("FillBuzz" + " ");
        }
        else if (i%3==0){
            System.out.println("Fizz"+ " ");
        }
    else if (i%5==0){
        System.out.println("Buzz"+ " ");
    }
    else{
        System.out.println(i+" ");
    }
}
}
}
