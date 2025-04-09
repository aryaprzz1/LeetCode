public class L2161_partitonPivot {
    public int[] pivotArray(int [] nums, int pivot){
        int n =  nums.length ;        
        int l = 0 ;
        int arr[] = new int[n];

        for(int num : nums){
            if(num < pivot){
                arr[l++] = num;
            }
        }
        for(int num : nums){
            if(num == pivot){
                arr[l++] = num;
            }
        }
        for(int num : nums){
            if(num > pivot){
                arr[l++] = num;
            }
        }
        return arr ;
    }
}
// int i = 0, j = nums.length - 1;
// int l = 0, r = nums.length - 1;
// int[] ans = new int[nums.length];
// while(i < nums.length) {
//     if(nums[i] < pivot) {
//         ans[l++] = nums[i];
//     }

//     if(nums[j] > pivot) {
//         ans[r--] = nums[j];
//     }
//     i++; j--;
// }

// while(l <= r) {
//     ans[l++] = pivot;
// }

// return ans;
// 