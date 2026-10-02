import java.util.*;//implicit ,for explicit use Scanner instead of *
public class Sofd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner constructor
        System.out.println("Enter a 5 digit number:");
        int num=sc.nextInt();
        /*nextBoolean()
        nextByte()  
        nextDouble()
        nextFloat()
        nextInt()
        nextLine()
        nextLong()
        nextShort()
        next()
        nextBigDecimal()
        nextBigInteger()
        */
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        sc.close();

        System.out.println("Sum of digits:"+sum);

        
    }
}
