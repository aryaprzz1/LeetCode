

import java.util.HashMap;

public class L1_TwoSum {
    // public int[] twoSum(int[] nums , int target){
    //     for(int i = 0 ; i< nums.length; i++){
    //         for(int j = i+1 ; j<nums.length ; j++){
    //             if(nums[i] + nums[j]== target ){

    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[0];
    // }
    

     public int[] twoSum(int[] nums , int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length ;  i++){
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }else{
                int temp = map.get(nums[i]);
                map.put(nums[i], temp+1);
            }
        }

        for(int i =0 ; i < nums.length;i++){
            int a = nums[i];
            int b = target - a ;
            if(a!=b && map.containsKey(b)){
                return new int[]{b,a};
            }else if(a== b && map.get(b)>=2){
                return new int[]{b,a};
            }
        }
         
        return new int[]{};
    }

    public int[] twoSum1(int[] nums, int target){
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ;i < nums.length; i++){
            m.put(nums[i],1);
        
        }

        for(int i = 0 ;i <nums.length ; i++){
            int a = nums[i];
            int b= target - a;

            if(m.containsKey(b) && i != m.get(b)){
                return new int[]{i , m.get(b)};
            }
        }
        return new int []{};

    }
/// optimal solution
    public int[] twoSum2(int[] nums, int target){
        HashMap <Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if(m.containsKey(c)){
                return new int []{i,m.get(c)};
            }
            m.put(nums[i], i);
        }
        return new int []{};
    }
}
