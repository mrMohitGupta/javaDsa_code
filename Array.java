 import java.util.*;

public class Array { 
    // public static int LinearSearch(int numbers[], int key){
    //     for(int i = 0; i<=numbers.length; i++){
    //         if(numbers[i] == key){
    //             return i;
    //         }
    //     }

    //     return -1;
    // }

    // public static int LLsearch(String menu[], int dish){
    //     for(int i = 0; i<=String.length; i++){
    //         if(menu[i] == dish){
    //             return i;
    //         }
    //     }
    //     return -1;

    // }

    // public static void main(String args[]){
    //     int numbers[] ={2,4,6,8,12,14,16};
    //     int key = 4;
        
    //     int index = LinearSearch(numbers, key);
         
    //     if(index == -1){
    //         System.out.println("not found");
    //     } else{
    //         System.out.println("key at index at :" + index);
    //     }

    // }
    // public static int getLargest(int numbers[]) {
    //     int largest =Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;

    //     for(int i= 0; i<numbers.length; i++){
    //         if(largest < numbers[i]) {
    //             largest = numbers[i];
    //         }
    //         if(smallest > numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     System.out.println("smallest value is : " + smallest);
    //     return largest;
    // }
    // public static void main(String args[]){
    // int numbers[] = {1,3,7,4,8,0,3};
    // System.out.println("largest vale is : " + getLargest(numbers));

    // }


    // public static int binarySearch(int numbers[], int key) {
    //     int start =0, end = numbers.length-1;

    //     while(start <= end){
    //         int mid = (start + end) / 2;
    //         if(numbers[mid] == key){
    //             return mid;
    //         }
    //         if(numbers[mid] < key){
    //             start = mid+1;
    //         } else {
    //             end = mid-1;
    //         }
            
    //     }
    //     return -1;

    // }
    // public static void main(String args[]){
    //     int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    //     int key = 10;
    //     System.out.println("index for key is :" +  binarySearch(numbers, key));

        
    // }
    public static void reverse(int nums[]){
        int first = 0, last = nums.length-1;

        while(first < last){
        //  swap 
        int temp = nums[last];
        nums[last] = nums[first];
        nums[first] = temp;
        first++;
        last--;
        }
    }

    public static void printPairs(int numbers[]){
        for(int i = 0; i< numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] +" )");
            }
            System.out.println();
        }
    }


    public static void printSubarray(int numbers[]){
        for(int i =0; i< numbers.length; i++){
            int start = i;
            for(int j = i ; j< numbers.length; j++){
                int end = j;
                for(int k=start; k<= end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // public static void maxSUBarray(int numbers[]){
    //     int currsum = 0;
    //     int maxsum =Integer.MIN_VALUE;

    //     for(int i = 0; i< numbers.length; i++){
    //         int start = i;
    //         for(int j = i; j<numbers.length; j++){
    //             int end = j;
    //             currsum  = 0;
    //             for(int k = start; k<=end; k++){
    //                 currsum += numbers[k];
    //             }
    //             System.out.println(currsum);
    //             if(maxsum < currsum){
    //                 maxsum = currsum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum = " + maxsum);
    // }


    // public static void kadanes(int numbers[]){
    //     int mx =Integer.MIN_VALUE;
    //     int cu = 0;

    //     for(int i = 0; i < numbers.length; i++){
    //         cu = cu + numbers[i];
    //         if(cu < 0){
    //             cu = 0;
    //         }
    //         mx =Math.max(cu, mx);
        
    //     }
    //     System.out.println("max subarray sum is : " + mx);
    // }

    // trapped water
    public static int  trappingWater(int height[]){
    int n = height.length;

    int leftMax[] = new int[n];
    leftMax[0] = height[0];

    for(int i = 1; i<n; i++){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }

    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];

    for(int i= n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    int trappedWater =0;

    for(int i = 0; i<n; i++){

        int waterLevel = Math.min(leftMax[i], rightMax[i]);

        trappedWater += waterLevel - height[i];
    }

    return trappedWater;
}

// buy and sell stock 
    public static int BuySellstock(int prices[]){
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i< prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
    
     

    public static void main(String args[]){
        // int numbers[] ={2, -3, -4, 5, 6, -8};
        // int height[] = {4, 2, 0, 6, 3, 2, 4};
        int prices[] = {7, 3, 8, 6, 4, 2};
        // int  nums[] ={3,4,5,6,7,8,9};
        // reverse(nums);

        // for(int i = 0; i < nums.length; i++){
        //     System.out.print(nums[i]+" ");
        // }
        // System.out.println();
        // printPairs(numbers);
        // printSubarray(numbers);
        // maxSUBarray(numbers);
        // kadanes(numbers);
        // System.out.println(trappingWater(height));
        System.out.println(BuySellstock(prices));
    }
}