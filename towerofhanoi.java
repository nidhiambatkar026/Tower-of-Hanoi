import java.util.Scanner;

public class towerofhanoi {
    public static void towerOfHanoi(int n, String Source, String Helper, String Destination){
        if(n==1){
            System.out.println("Transfer disk "+ n + " from "+Source+" to "+Destination);
            return;
        }
        
           towerOfHanoi(n-1, Source, Destination, Helper);
           System.out.println("Transfer disk "+ n + " from "+Source+" to "+Destination);
           towerOfHanoi(n-1, Helper, Source, Destination);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of disk: ");
        int n = sc.nextInt();
        towerOfHanoi(n,"S", "H", "D");
    }
}
