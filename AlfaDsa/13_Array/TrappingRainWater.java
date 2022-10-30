public class TrappingRainWater {
    public static int trap_Water(int height[]) {
        int n = height.length;
        // Calculate left max boundary - array
        int leftmax[] = new int[n];// left max size is equal to height
        leftmax[0] = height[0];

        for (int i = 1; i < n; i++) { // calculate start
            leftmax[i] = Math.max(height[i], leftmax[i - 1]); // ----> left
            // current height compair to leftMax[i-1]
            // System.out.println(leftmax[i]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];

        rightMax[n - 1] = height[n - 1]; // claculate from last so height.length-1

        for (int i = n - 2; i >= 0; i--) { // 7-2=5
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // <------ right
            // i+1 becouse stating from last , compair to right max i + 1
            // System.out.println(rightMax[i]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, right max bound)
            int waterLevel = Math.min(leftmax[i], rightMax[i]);
            // System.out.println(waterLevel);
            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("Trap water capt inside bar " + trap_Water(height));

    }

}

// H.W := 1.Dry run,2. wtite code 5 tme