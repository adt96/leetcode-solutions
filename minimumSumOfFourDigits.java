import java.util.Arrays;
class Solution {
    public int minimumSum(int num) {
        String temp = Integer.toString(num);
        int[] newInteger= new int[temp.length()];
        for(int i=0;i< temp.length();i++)
        {
            newInteger[i] = temp.charAt(i)-'0';
        }
        Arrays.sort(newInteger);
        int res[] =new int[newInteger.length];
        int num1,num2=0;
        res[0]= newInteger[0]*10;
        res[1]= newInteger[2];
        num1 = res[0]+res[1];
        res[2]=newInteger[1]*10;
        res[3]= newInteger[3];
        num2=res[2]+res[3];
        int sum = num1+num2;
        return sum;
        
    }
}
