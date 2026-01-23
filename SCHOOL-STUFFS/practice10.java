
import java.util.Scanner;

//write a program in java that takes cost price and a selling price of an aryticle as input.
//calculate and display profit and proffit percent or lose and ?? idk 
class practice10
{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the cost price");
        int cp = sc.nextInt();
        System.out.println("enter the selling price");
        int sp = sc.nextInt();
 
        // Logic Section
        if (sp > cp) {
            // Profit scenario
            double p = sp - cp;
            double pp = (p / cp) * 100;
            System.out.println("--- RESULT ---");
            System.out.println("The profit is = " + p);
            System.out.println("The profit percent is = " + pp + "%");
        } 
        else if (cp > sp) {
            // Loss scenario
            double l = cp - sp;
            double lp = (l / cp) * 100;
            System.out.println("--- RESULT ---");
            System.out.println("The loss is = " + l);
            System.out.println("The loss percent is = " + lp + "%");
        } 
        else {
            // Equal scenario
            System.out.println("--- RESULT ---");
            System.out.println("There is no profit and no loss.");
        }
    }

   
    }
