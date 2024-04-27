package mes.practical.UnitTestingExample;

public class casetool {
}
public int find Max(int[] numbers) {
    Int max = numbers[0]; 
    for (int i = 1; i < numbers.length; i++) { 
    if (numbers[i] > max) { 
    max = numbers[i]; 
    }  
    }  
    return max;  
    }