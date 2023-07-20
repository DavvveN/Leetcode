class Main {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        return calculate(n,new int[n + 1]);
    }

    public int calculate(int n, int[]prevValues){
        int result;
        if(n <=2 ){
            result = 1;
        }else{
            result =  calculate(n -1,prevValues) + calculate (n-2,prevValues);
        }
        prevValues[n] = result;
        return result;
    }
}