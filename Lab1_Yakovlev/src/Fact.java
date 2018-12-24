import java.util.Scanner;
public class Fact {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        long a = -1;
        while(a<0){
            System.out.println("Please enter a valid value to calculate it's factorial:");
            if(read.hasNextLong() == true){
                a = read.nextLong();
            }
        }

        if(a == 0){
            System.out.println("Result: 1");
        }
        else{
            long i = a-1;
            while(i != 1){
                a *= i;
                i--;
            }
            System.out.println("Result: "+a);
        }
    }
}
