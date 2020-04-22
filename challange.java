public class challange {
    // <>
     public static void main (String []args) {
 
         int testArray[] = {-2,1,-3,4,-1,2,1,-5};
       
         int startIndex = 0;
         int maxSum = testArray[0];
         int temp = 0;
         int endIndex = 0;
 
         for (int i=0; i<testArray.length; i++){
            if (testArray[i] > 0) {
                for (int j=i; j<testArray.length; j++){
                    temp += testArray[j];
                    if (temp > maxSum){
                        maxSum = temp;
                        endIndex = j;
                        startIndex = i; 
                    }
                }
                temp = 0;
            }
            
         }
         
      //   for (int i=startIndex;i<=endIndex;i++)
      //       System.out.print(testArray[i]+",");
        
         System.out.print(maxSum);
     }
 }
 