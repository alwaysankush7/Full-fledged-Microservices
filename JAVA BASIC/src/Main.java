import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void K(){
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        int positiveNumber = 0, negativeNumber = 0, oddNumber = 0, evenNumber = 0, numberOfZeros = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (array[i] >= 0) {
                positiveNumber++;
            }
            if (array[i] < 0) {
                negativeNumber++;
            }
            if (array[i] % 2 == 0) {
                evenNumber++;
            }
            if (array[i] % 2 != 0) {
                oddNumber++;
            }
            if (array[i] == 0) {
                numberOfZeros++;
            }
        }
        System.out.println("Number of positive numbers :" + positiveNumber + " Number of negative number : " + negativeNumber +
                "Number of evenNumber : " + evenNumber + " Numbers of odd number : " + oddNumber + " Numbers of numberIfZeros : " + numberOfZeros
        );

    }


    public static void O(){
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        int previousArray[] = new int[10], temp =0;
        Arrays.fill(previousArray,0);
        for(int i = 0; i < 10; i++){
            array[i] = scanner.nextInt();
        }
        for(int i=9 , j = 0;i >0 && j <10;i--, j++){
            temp=   previousArray[j];
            previousArray[j] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(previousArray[i]);
        }
    }

public static void P(){
        int[] array = {12,10,1,5,6};
        int max = Integer.MIN_VALUE , min =Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if(array[i]> max) max = array[i];
            if(array[i]< min) min = array[i];
        }
        System.out.println("max = " +max);
        System.out.println("min = " +min);
}

public static void Q(){
        int[] array = {12,3,5,3,12};
        for(int i = 0 , j = 4; i <= 5/2 && j>=4/2 ; i++, j--) {
            if(array[i] == array[j]){
                continue;
            }else{
                System.out.println("Elements of array are not equal");
                System.exit(0);
            }
        }
        System.out.println("Elements of array are equal");
}
public static void I(){
        Scanner scanner = new Scanner(System.in);
        int sum=0, count=0;
        while(count < 5) {
            int a = scanner.nextInt();
            if(a >=0){
                sum += a;
                count++;
            }
        }
        System.out.println("Sum of five positive integers : " + sum);
}

public static void E(){
        int x=2 , y=5,z=0;
        System.out.println(x==2);
    System.out.println(x!=5);
    System.out.println(x!=5 && y >=5);
    System.out.println(z!=0 && x ==2);
    System.out.println(!(y<10));
}
public static void A(){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if(a == b && b == c && c == a){
        System.out.println("All are equal");
    }else if( a == b || b == c || c == a){
        System.out.println("Any of two are equal");
    }else {
        System.out.println("All are not equal");
    }
}
public static void B(){
    int number=2345+8;
    int quo= (number)/3;
    int mod= quo%5;
    System.out.println("The resultant is "+mod*5);
}

public static void D(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your marks: ");
    float marks = scanner.nextFloat();
    String grade;

    if (marks < 25) {
        grade = "F";
    } else if (marks < 45) {
        grade = "E";
    } else if (marks < 50) {
        grade = "D";
    } else if (marks < 60) {
        grade = "C";
    } else if (marks < 80) {
        grade = "B";
    } else {
        grade = "A";
    }

    System.out.println("Your grade is: " + grade);
}




    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void J(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count =0, b=a, c=a;
        int arm=0;
        while(b>0){
            b/=10;
            count++;
        }
        while(c>0){
            int x = c%10;
            c/=10;
            arm+=Math.pow(x,count);
        }
        if(arm == a){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }



    public static void main(String[] args) {
        //A();
        //B();
       // K();
        //O();
       // P();
        //Q();
        //L();
       // E();
        J();
                //I
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a fraction in the form a/b: ");
        String frac = scanner.nextLine();

        String[] parts = frac.split("/");
        int numerator = Integer.parseInt(parts[0]);
        int denominator = Integer.parseInt(parts[1]);

        int gcd = findGCD(numerator, denominator);
        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;

        System.out.println("The fraction in lowest terms is: " + reducedNumerator + "/" + reducedDenominator);




        }
    }
