

public class L283_MoveZeros {


    public void moveZeros(int[]nums){
        int z = 0 ;
        for(int nz = 0 ; nz < nums.length ; nz++){
            if(nums[nz] !=  0){{
                if(nz!= z){
                    int temp = nums[z];
                    nums[z] = nums[nz];
                    nums[nz] = temp;
                   
                }
                z++;
            }
               
            }
        }

    }
}
