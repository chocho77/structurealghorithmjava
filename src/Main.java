//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void arrayDemo(){
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 1; i<= arr.length - 1; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int sum = Main.findSum(5);
        System.out.println(sum);
        sum = Main.findSum(10);
        System.out.println(sum);
        Main.arrayDemo();
        }
    }
