import java.util.Arrays;

/**
 * Calculator
 */
public class Calculator {

    public int Add(String numbers) throws Exception{
        String subnumbers = numbers;
        String Exception = null;
        boolean negative = false;
        int counter = 0;
        String[] array;
        if(numbers.substring(0, 2).equals("//")){
            String temp = "";
            numbers = numbers.replace("//", "");
            if(numbers.charAt(0) == '['){
                temp = "[,\n" + numbers.charAt(1) + "]";
                for(int i = 0; i < numbers.length(); i++){
                    counter++;
                    if(numbers.charAt(i) == ']'){ 
                        break;
                    }
                }
            }
            else temp = "[,\n" + numbers.charAt(0) + "]";
            subnumbers = numbers.substring(counter, numbers.length());
            array = subnumbers.split(temp);
        }
        else  array = subnumbers.split("[,\n[;;;]]");
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