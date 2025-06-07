public class Solution {
    public int solution(int n, long l, long r) {
        return (int)(count(n, r) - count(n, l - 1));
        //n: 수열 l, r: 구간의 시작과 끝
    }

    long count(int n, long k) {
        if (n == 0) return 1;

        long prev = n - 1;
        long div = (long) Math.pow(5, prev);
        long ones = (long) Math.pow(4, prev);

        long z = k / div;
        if (k % div == 0) z--;

        if (z == 2) return ones * z;
        else if (z < 2) return ones * z + count(n - 1, k - (div * z));
        else return ones * (z - 1) + count(n - 1, k - (div * z));
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(1, 2, 3));
    }
}
