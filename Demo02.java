package com.bdqn;
/**
 * ��1000�������е�����
 * 
 * ���һ�����ֵ�������������֮�ͣ����Ǿͳ������Ϊ����
 * 
 * 6�����ӣ�1 2 3     6=1+2+3
 */
public class Demo02 {
	public static void main(String[] args) {
		// ���÷���
		for(int i = 100;i<=1000;i++){
			if(i == sum(i)){
				System.out.println(i + "������");
			}
		}
	}
	// ����һ���������Ӻ͵ķ���
	// num:���������
	public static int sum(int num){		// num=6
		// ����һ���ۼ���
		int result = 0;
		for(int i = 1;i<=num/2;i++){	// num/2=3     
			if(num%i == 0){
				// result = result + i;
				result+=i;				// result=0+1=1  1+2=3 3+3=6
			}
		}
		return result;
	}
	
	
	
	
	
	
	
	

}
