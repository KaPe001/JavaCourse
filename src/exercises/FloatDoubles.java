package exercises;

public class FloatDoubles {
    public static void main(String [] args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f; //with decimal numbers you need an f at the end
        double myDoubleValue = 5d; //preferred over the float


        int myIntValue_1 = 5 / 3;
        float myFloatValue_1 = 5f / 3f;
        double myDoubleValue_1 = 5d / 3d;
        System.out.println("MyIntValue_1= " + myIntValue_1);
        System.out.println("MyFloatValue_1= " + myFloatValue_1);
        System.out.println("MyDoubleValue_1= " + myDoubleValue_1);

        double pound = 200d;
        double convertedKg = pound* 0.45359237d;
        System.out.println("Convert a given number of pounds to kilograms: " + convertedKg);
    }
}
