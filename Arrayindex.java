import java.util.Scanner;
public class Arrayindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //int e_index=0;
        //int o_index=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]%2==0){
            System.out.println("Even element at index = " + i + " (value: " + arr[i] + ")");
            } 
            else {
            System.out.println("Odd element at index = " + i + " (value: " + arr[i] + ")");
            }
        }
    }
        
}
