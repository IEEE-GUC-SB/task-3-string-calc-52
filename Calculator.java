/**
 * Calculator
 */
public class Calculator {

    public int Add(String numbers){
        String[] array = numbers.split(",");
        int ans = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i].equals("")) ans += 0;
            else ans += Integer.parseInt(array[i]);
        }
        return ans;
    }
}