
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
        String temp = "";

        if(numbers.substring(0, 2).equals("//")){
        for(int i = 0; numbers.charAt(i) != '\n'; i++){
            if(numbers.charAt(i) != '[' && numbers.charAt(i) != ']') 
                temp += numbers.charAt(i);
            counter++;
        }
        subnumbers = numbers.substring(counter, numbers.length());
    }

        temp = "[,\n" + temp + "]";
        array = subnumbers.split(temp);

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