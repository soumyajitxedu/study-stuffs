//write program in java that display following seires : 
/* 1. 10,20,30 to 100
2. 5,10,15,20 to 100 
3. 1,2,5,10 to 100
4. 0 , 3, 8, 15 upto 99 ? -: i don't know  o*/



//1.
class practice5
{
    public static void main(String[] args) {
        for(int a = 10; a <= 100; a+=10)
        {
            System.out.println(a);
        }
    }
}

//2

class practice5_2
{
    public static void main(String[] args) {
        for(int a = 5; a <= 100; a+=5){
            System.out.println(a);
        }
    }
}
//3 
class practice5_3
{
    public static void main(String[] args){
        for(int a = 1; a*a + 1 <= 100; a++){
            System.out.println(a + a*a + a);
        }
    }
}
//4 
class practice5_4
{
    public static void main(String[] args) {
         for(int a = 1; (a*a - 1) <= 99; a++){
            System.out.println(a*a - 1); 
    }
    }
    }