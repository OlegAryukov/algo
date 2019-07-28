package leetcode.explore.recursion;

public class Fibonnachi {
    int[] cache;
    public int fib(int N) {
        cache = new int[N];
        return realCalcFibo(N);
    }

    private int realCalcFibo(int n){
        if(cache[n]!=0){
            return cache[n];
        }
        int res;
        if (n < 2) {
            res = n;
        } else {
            res = realCalcFibo(n-1) + realCalcFibo(n-2);
        }
        cache[n] = res;
        return res;
    }
}
