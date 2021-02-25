package com.hp.demo;

public class Task1 {
	public static void main(String[] args) {
		// 数组
		int[] nums;
		nums = new int[3];
		
		nums = new int[5];
		
		String[] names = new String[6];
		String names1[] = new String[6];
		
		
		
		System.out.println(names[0]);
		
		nums[0] = 12;
		nums[1] = 122;
		
		int a = nums[1];
		nums[1] = 32;
		nums[1] = 0;
		nums[0] = 34;
		nums[2] = 56;
		nums[3] = 99;
		System.out.println(nums[1]);
		System.out.println(names.length);
		int l = names.length;
		System.out.println("~~~~~~~~~");
		
		boolean b = false;
		
		int index = -1; 
		
		for (int i = 0; i < nums.length; i++) {
			
				//System.out.println(nums[i]);
				if(nums[i]==99){
					index = i;
					b=true;
				}
			
			
		}
		
		
		if(b){
			System.out.println("找到了~~~~");
		}
		
		
		
		
		
		
		
		byte[] bt = {12,32,99};
		
	}
}
