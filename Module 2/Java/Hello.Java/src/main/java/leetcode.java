import java.util.*;

public class leetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersection(nums1,nums2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0;
        for(int i =1;i<nums1.length;i++){
            if(nums1[i] != nums1[a]){
                a++;
                nums1[a] = nums1[i];
            }
        }
        nums1 = Arrays.copyOf(nums1,a+1);
        int b = 0;
        for(int j =1;j<nums2.length;j++){
            if(nums2[j] != nums2[b]){
                b++;
                nums2[b] = nums2[j];
            }
        }
        nums2 = Arrays.copyOf(nums2,b+1);
        int[] newArray = new int[Math.min(nums1,nums2)];
        int count = 0;
        for(int k =0;k<nums1.length;k++){
            for(int l =0;l<nums2.length;l++){
                if(nums1[k] == nums2[l]){
                    newArray[count] = nums1[k];
                    count++;
                    break;
                }
            }
        }
        newArray = Arrays.copyOf(newArray,count);
        return newArray;
    }
}




