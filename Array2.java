public class Main {
    public static void main(String[] args) {   
      
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        
        // Initialize a variable 'sum' to store the sum of array elements.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            // Add the current element to the sum.
            sum = sum + numbers[i];
        }
        
        double average = sum / numbers.length;
        
        // Print the calculated average value .
        System.out.println("Average value of the array elements is : " + average); 
    }
}
