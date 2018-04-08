package arrayudemy;

import java.util.Scanner;

public class Main {

private static int[] baseData = new int[3];
private  static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 3 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers: ");
        getInput();
        printArray(baseData);
        
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
        
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = sc.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }
    
    public static void getInput(){
        for (int i = 0; i <baseData.length ; i++) {
            baseData[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i <original.length ; i++) {
            baseData[i] = original[i] ;
        }
    }
}
