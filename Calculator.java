import java.util.Arrays;

/**
 * Calculator
 */
public class Calculator {

    public int Add(String numbers) throws Exception{
        String Exception = null;
        boolean negative = false;
        String[] array;
        if(numbers.substring(0, 2).equals("//")){
            numbers = numbers.replace("//", "");
            String temp = "[,\n" + numbers.charAt(0) + "]";
            array = numbers.split(temp);
        }
        else  array = numbers.split("[,\n]");
        int ans = 0;
        for(int i = 0;i<array.length; i++){
            if(!array[i].equals("") && Integer.parseInt(array[i]) < 0){
                if(negative == true) Exception += array[i] + " ";
                else {
                    negative = true;
                    Exception = "negative numbers not allowed " + array[i] + " ";
                }
            }
            else ans += array[i].equals("") ? 0 : Integer.parseInt(array[i]) > 1000 ? 0 : Integer.parseInt(array[i]);
        }
        if(Exception != null) throw new Exception(Exception);
        return ans;
    }
}