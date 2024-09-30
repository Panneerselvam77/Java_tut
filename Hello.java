/**
 * Hello
 */
public class Hello {

    public static void main(String a[]) {
        // int nums[][] = new int[3][];
        int nums[] = new int[3];

        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 12;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[i].length; j++) {
        // nums[i][j] = (int) (Math.random() * 100);
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }
        for (int n : nums) {
            System.out.println(n);
        }

    }

}
