package exercises;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        calculateScore(gameOver, score, levelCompleted, bonus);
//both ways that we can complete the code. Literal values or predefine variables with initial values.

        calculateScore(true, 10000, 8, 200);

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore); // here we call the method and give the response at once, so it's a third method call
    }

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //void - nothing. Doesn't return anything
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
//        }

        //when we want to return the value of the score
        public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus){

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                return finalScore;
            }else{
                return -1; //-1 (conventionally used to indicate an error) when the gameOver is false
        }
            //or return -1; here, but then without the return -1 in else (without else at all)
    }
}
