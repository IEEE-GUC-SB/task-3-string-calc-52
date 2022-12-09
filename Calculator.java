import java.util.Arrays;

/**
 * Calculator
 */
public class Calculator {

    public int Add(String numbers){
        String nubers = numbers;
        String[] array;
        if(numbers.substring(0, 2).equals("//")){
            numbers = numbers.replace("//", "");
            String temp = "[,\n" + numbers.charAt(0) + "]";
            array = numbers.split(temp);
        }
        else  array = numbers.split("[,\n]");
        String y = "[," + numbers.substring(0) + "\n]";
        
        int ans = 0;
        for(int i = 0;i<array.length; i++){
            ans += array[i].equals("") ? 0 : Integer.parseInt(array[i]);
        }
        return ans;
    }
}