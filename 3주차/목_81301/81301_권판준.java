public class No_81301 {
    public int solution(String s) {
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < nums.length; i++) {
            s = s.replace(nums[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}