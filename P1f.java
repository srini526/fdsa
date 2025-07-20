class P1f {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if(i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}