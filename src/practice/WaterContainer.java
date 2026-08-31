package practice;

public class WaterContainer {
	
	 public int maxArea(int[] height) {

	        // Two pointers
	        int left = 0;
	        int right = height.length - 1;

	        // Stores maximum area found so far
	        int maxArea = 0;

	        // Continue until both pointers meet
	        while (left < right) {

	            // Distance between the two lines
	            int width = right - left;

	            // Water level is decided by the shorter line
	            int currentHeight =
	                    Math.min(height[left], height[right]);

	            // Calculate current container area
	            int area = width * currentHeight;

	            // Update maximum area
	            maxArea = Math.max(area, maxArea);

	            // Move the pointer with smaller height
	            if (height[left] < height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return maxArea;
	 }

	public static void main(String[] args) {
		
		 int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

	        WaterContainer c = new WaterContainer();

	        System.out.println(c.maxArea(height));
	}

}
