import java.util.Arrays;

/**
 * Calculator
 */
public class Calculator {

    public int Add(String numbers) throws Exception{
        String Exception = null;
        int i = 0;
        String[] array;
        if(numbers.substring(0, 2).equals("//")){
            numbers = numbers.replace("//", "");
            String temp = "[,\n" + numbers.charAt(0) + "]";
            array = numbers.split(temp);
        }
        else  array = numbers.split("[,\n]");
        int ans = 0;
        for(;i<array.length; i++){
            if(Integer.parseInt(array[i]) < 0){
                Exception = "negative numbers not allowed ";
                break;
            }
            ans += array[i].equals("") ? 0 : Integer.parseInt(array[i]);
        }
        for(;i<array.length; i++){
            if(Integer.parseInt(array[i]) < 0){
                Exception += array[i] + " ";
            }
        }
        if(Exception != null) throw new Exception(Exception);
        return ans;
    }
}