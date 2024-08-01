class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low+=1;
                mid+=1;
            }else if(nums[mid]==1){
                mid+=1;
            }else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high-=1;
                mid+=1;
            }

            if(mid>high){
                break;
            }
        }

    }
}
