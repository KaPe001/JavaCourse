package exercises;

public class While {
    public static void main(String[] args) {
        int count = 1;
        while(count!= 5){
            System.out.println("Count value is: " + count);
            count++;
        }
        count = 1;
        while(true){         //infinite loop
            if(count == 6){  //breaks the loop
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was: " + count);
            count++;

//            if(count > 100){
//                break;
//            }
        } while(count != 6);
    }
}
