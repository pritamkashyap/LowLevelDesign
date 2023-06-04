package cleanCoding;

public class cleanCode {
    public static boolean isSumDivisibleByVal(int sum, int val) {
        return sum % val == 0;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{5, 3, 7, 9, 12, 4, 7};
        int[] divisors = new int[]{1, 2};
        int[] countOfDivisibleAdjPairs = new int[]{0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            int adjPairSum = nums[i] + nums[i + 1];
            for (int j = 0; j < divisors.length; j++) {
                if (isSumDivisibleByVal(adjPairSum, divisors[j])) {
                    countOfDivisibleAdjPairs[j]++;
                }
            }
        }
        System.out.println(countOfDivisibleAdjPairs[0] + " " + countOfDivisibleAdjPairs[1]);
    }
}
