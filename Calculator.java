/**
 * Calculator
 */
public class Calculator {

    public int Add(String numbers){
        String[] array = numbers.split("[,\n]");
        int ans = 0;
        for(int i = 0; i<array.length; i++){
            ans += array[i].equals("") ? 0 : Integer.parseInt(array[i]);
        }
        return ans;
    }
}