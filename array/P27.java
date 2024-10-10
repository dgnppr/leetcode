public class P27 {

    public static void main(String[] args) {
        // System.out.println(removeElement(new int[] { 1, 1, 2, 2, 5 }, 2));
        System.out.println(removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }

    public static int removeElement(int[] nums, int val) {

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                continue;
            }
            cnt++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                continue;
            }

            int find = next(nums, i);
            if (find == -1) {
                break;
            }

            int tmp = nums[i];
            nums[i] = nums[find];
            nums[find] = tmp;

        }

        return cnt++;
    }

    public static int next(int[] nums, int st) {
        for (int i = st; i < nums.length; i++) {
            if (nums[i] != -1) {
                return i;
            }
        }
        return -1;
    }

}
