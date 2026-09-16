class Solution {

    public int sumOfSquare(int n) {
        int sum = 0;

        while (n > 0) {
            int dig = n % 10;       // get last digit
            sum = sum + (dig * dig);
            n = n / 10;             // remove last digit
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));

            if (fast == 1) {
                return true;
            }

            if (slow == fast) {
                return false;
            }
        }

        return true;
    }
}