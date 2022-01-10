package exercises;

public class IfThen {
    public static void main(String[] args){
        boolean isAlien = false;
        if(!isAlien)
            System.out.println("It is not an alien!");

        if(isAlien== false)
            System.out.println("It is not an alien!"); //meaning is same as above

         int topScore = 80;
         if (topScore != 100){ //not equal
             System.out.println("You got the high score!");
         }
        if (topScore > 100){ //higher than 100
            System.out.println("You got the high score!");
        }
        if (topScore >= 100){ //higher or equal
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not suppose to happen");//we don't get a message because isCar is not true
        }
        boolean isCar1 = false;
        if(isCar1){
            System.out.println("bla bla");
        }

        isCar1 = true;
        boolean wasCar1 = isCar1 ? true : false;
        if(wasCar1){
            System.out.println("wasCar is true");
        }

        double myDouble = 20.00d;
        double mySecDouble = 80.00d;
        double togetherDouble = (myDouble + mySecDouble) * 100d;
        System.out.println("Together value = " + togetherDouble);
        double reminder = togetherDouble % 40.00d;
        System.out.println("Reminder value = " + reminder);

        boolean isNoRemainder = (reminder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some reminder");

        }


    }
}
