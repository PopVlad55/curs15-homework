import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveExercisesTest {
    @Test
    void sumOfFirstIntegersTest(){
        int result = RecursiveExercises.sumOfFirstIntegers(5);
        assertEquals(15, result);
    }

    @Test
    void sumOfFirstEvenIntegersTest(){
        int result = RecursiveExercises.sumOfFirstEvenIntegers(5);
        assertEquals(30, result);
    }

    @Test
    void reverseStringTest(){
        String strToReverse = "madam";
        String reversedString = RecursiveExercises.reverseString(strToReverse);
        assertEquals("madam", reversedString);
    }

    @Test
    void isPalindromeTest(){
        String palindromeStr = "madam";
        assertTrue(RecursiveExercises.isPalindrome(palindromeStr));
    }

    @Test
    void sumOfDigitsTest(){
        int num = 5555;
        int result = RecursiveExercises.sumOfDigits(num);
        assertEquals(20, result);
    }

    @Test
    void fibonacciTest(){
        assertEquals(1,RecursiveExercises.fibonacci(0));
        assertEquals(1,RecursiveExercises.fibonacci(1));
        assertEquals(2,RecursiveExercises.fibonacci(2));
        assertEquals(3,RecursiveExercises.fibonacci(3));
        assertEquals(5,RecursiveExercises.fibonacci(4));
        assertEquals(8,RecursiveExercises.fibonacci(5));
        assertEquals(10946,RecursiveExercises.fibonacci(20));
    }
}
