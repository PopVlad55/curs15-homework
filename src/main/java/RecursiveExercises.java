public class RecursiveExercises {
    //1
    public static int sumOfFirstIntegers(int n){
        if (n <= 0){
            return  0;
        }
        return  n + sumOfFirstIntegers(n - 1);
    }

    //2
    public static int sumOfFirstEvenIntegers(int n){
        if(n <= 0){
            return 0;
        }
        return 2 * n + sumOfFirstEvenIntegers(n - 1);
    }

    //3.1
    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    //3.2
    public  static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length() - 1)){
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    //4
    public static int sumOfDigits(int num){
        if (num == 0 ){
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }

    //5
    public static long fibonacci(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        //1
        System.out.println("sum of first n integer numbers: " + sumOfFirstIntegers(5));
        //2
        System.out.println("sum of first n EVEN integers: " + sumOfFirstEvenIntegers(5));
        //3.1
        String strToReverse = "madam";
        System.out.println(strToReverse + " reversed is " + reverseString(strToReverse));
        //3.2
        String palindromeStr = "madam";
        System.out.println(palindromeStr + " | is palindrome: " + isPalindrome(palindromeStr));
        //4
        int num = 555555;
        System.out.println("sum of digits for " + num + ": "+ sumOfDigits(num));
        //5
        int nr = 20;
        System.out.println("fibonacci de [" + nr + "] este: " + fibonacci(nr));
    }
}
