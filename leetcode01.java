package com.RJ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode01 {
    //通过hash键值对  O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    //暴力法  我自己能做起的
    public int[] twoSum1(int[] nums,int target){
        int[] result =new int[2];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums ={4,6,3,7,8};
        int target = 15;
        leetcode01 demo = new leetcode01();
        System.out.println(Arrays.toString(demo.twoSum(nums,target)));
        System.out.println(Arrays.toString(demo.twoSum1(nums,target)));
    }
}
