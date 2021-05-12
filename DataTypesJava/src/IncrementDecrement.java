public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);

        lives--; //Decrement
        System.out.println(lives);

        lives++; //Increment
        System.out.println(lives);

        //Prefix
        int gift = 100 + ++lives;
        System.out.println(gift);

    }
}
