class powerOfNRecurssion {
 
    static float power(float x, int y)
    {
        float temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
 
        if (y % 2 == 0)
            return temp * temp;
        else {
            if (y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
 
    public static void main(String[] args)
    {
        float x = 2;
        int y = -3;
 
        // Function call
        System.out.printf("%f", power(x, y));
    }
}
