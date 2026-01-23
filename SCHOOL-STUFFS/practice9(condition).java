//write program in java that scan the marks of the subject is vaild or invaild with sutiable message 
import java.util.Scanner;

class practice9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of one subjectr of the student");
        int m = sc.nextInt();
        if (m >= 0 && m <= 100){
            System.out.println("inputted marks is valid");
        }
        else
            System.out.println("the inputted marks is invaild");

    }
}