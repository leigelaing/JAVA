package com.bdqn1;
/**
 * ��ά����
 */
public class Demo06 {
	public static void main(String[] args) {
		int [][] a = {{1,2,3},{2,3,4},{3,14,5},{3,4,6}};
		// ���2
		/*// System.out.println(a[0][1]);
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
		}*/
		// ���Ҷ�ά������������
		// �����һ������������
		int numberMax = a[0][0];
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a[i].length;j++){
				if(numberMax<a[i][j]){
					numberMax = a[i][j];
				}
			}
		}
		System.out.println("��������" + numberMax);
	}

}
