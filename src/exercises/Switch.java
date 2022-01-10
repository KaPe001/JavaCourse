package exercises;

public class Switch {
    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("value wasn't either 1 or 2");
        }

        //we use switch statement when there is more than 1-2 else if statements
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("wasn't 3, 4, or 5");
                break; //wo a break word, code will go to another case and process all cases
            default:
                System.out.println("wasn't not 1 or 2");
                break;
        }

        char charVariable = 'D';
        switch(charVariable){
            case 'A':
                System.out.println("char variable was an A");
                break;
            case 'B': case 'C': case 'D': case 'E':
                System.out.println("char variable was either a 'B', 'C', 'D', or 'E. char variable was: " + charVariable);
                break;
            default:
                System.out.println("Char variable not found");

        }
    }
}
