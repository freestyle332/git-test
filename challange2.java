public class challange2 {
    // <>
     public static void main (String []args) {
 
         int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
       
         int maxSum = nums[0];
         int temp = 0;

 
         for (int i=0; i<nums.length; i++){
             temp += nums[i];
             if (temp > maxSum)
                maxSum = temp;
            if (temp < 0) 
                temp = 0;
        }

         System.out.print(maxSum);
     }
 }
 