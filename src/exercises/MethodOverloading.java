package exercises;

public class MethodOverloading {
    public static void main(String[] args){
        int newScore = calculateScore("Kinga", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(5,13);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(161);

    }
    //when we are overloading a method, we need to create a unique method signature
    //the signature is a method fullName, and the parameters (same fullName, different parameters)
    //changing the data type, doesn't change the signature (it doesn't make new method unique)

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player fullName, no player score");
        return 0;
    }

//    public static void calculateScore(){
//        System.out.println("No player fullName, no player score");
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters;
        if (feet < 0 || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        centimeters = (feet * 12) * 2.54; //feet * 30.4 same result
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and = " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
