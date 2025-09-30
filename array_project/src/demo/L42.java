public class L42 {
    
    public int trap(int[] height) {
        return 0;
    }
    public int trap2(int[] height) {
        int total = 0;
        for(int i=0;i<height.length;i++){
            int left_max = 0;
            int right_max = 0;
            for(int left=0;left<i;left++){
                // find left highest piller
                left_max = Math.max(height[left],left_max);
            }
            for(int right=i+1;right<height.length;right++){
                // find right highest piller
                right_max = Math.max(height[right],right_max);
            }
            int total_water_level = Math.min(left_max, right_max);
            int current_water_level = total_water_level - height[i];
            if(current_water_level>0){
                total = total + current_water_level;
            }
        }
        return total;
    }
}