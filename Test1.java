package com.bdqn;
/**
 * ð������
 */
public class Test1 {
	public static void main(String[] args) {
		int [] a = {12,3,15,6,2};
		// ����һ����������������
		 int temp;
		// ���ѭ�����Ƶ��ǣ�����
		for(int i = 0;i<a.length-1;i++){
			// �ڲ�ѭ�����Ƶ��Ǵ���
			for(int j = 0;j<a.length-1-i;j++){
				// ���ǰһ�����ִ��ں���ģ��򽻻�λ��
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i] + "\t");
		}
	}

}
