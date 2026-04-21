import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        double total = 0;
        int runCount = 0;

        while(scan.hasNextDouble()){
            double temp = scan.nextDouble();

            if(max < temp){
                max = temp;
            }
            if(min > temp){
                min = temp;
            }

            runCount++;
            total += temp;
        }
        System.out.println("Max is: " + max + "\nMin is: "+ min);
        System.out.println("Average: " + total/runCount);
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
    }
}
