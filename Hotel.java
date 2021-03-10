package com.bdqn;

import java.util.Scanner;

/**
 * ģ��Ƶ�ϵͳ 1.��ѯ���з��� 2.ϵͳ��ʼ�� 3.������ס 4.�˷� 5.�˳�ϵͳ
 * 
 * ע�⣺ÿ�β���������ִ��2ϵͳ��ʼ����Ȼ���ٽ��в��� ��Ϊ�ж��������п��вŻ������ס��ҵ�����Ա���ϵͳ��ʼ���� ��null��Ϊ����
 * 
 * ��������Ϊ: 0101 0102 0103 0104 0105 0106 0107 0108 0109 0110 ���� ���� ���� ���� ���� ���� ����
 * ���� ���� ���� 0201 0202 0203 0204 0205 0206 0207 0208 0209 0210 ���� ���� ���� ���� ���� ����
 * ���� ���� ���� ���� ...... ...... ...... 1201 1202 1203 1204 1205 1206 1207 1208 1209
 * 1210 ���� ���� ���� ���� ���� ���� ���� ���� ���� ����
 */
public class Hotel {
	public static void main(String[] args) {
		// ��ʼ��һ����ά����(�Ƶ�) 12��10�е�����(Ҳ����˵12�㣬ÿ��10������)
		String hotel[][] = new String[12][10];
		System.out.println("***��ӭ��ס�������ǻʼҴ�Ƶ�***");
		// ��ȡ��������
		Scanner s = new Scanner(System.in);
		System.out.println("��ѡ��������Ĺ��ܣ�1.��ѯ���з���   2.ϵͳ��ʼ��   3.������ס   4.�˷�  5.�˳�ϵͳ");
		while (true) {
			// ��ȡ����Ĺ��ܺ�
			int number = s.nextInt();
			// ���ѡ��1.��ѯ���з���
			if (number == 1) {
				// ���ѭ��������(�����±��0��ʼ������ȡ����ֵ�ǣ� 0��11,��12��)
				for (int i = 0; i < 12; i++) {
					// �ڲ�ѭ��������
					for (int j = 0; j < 10; j++) {
						// ���¥����10������
						if (i < 9) {
							// ���±��Ǵ�0��ʼ�����Ա�����i+1
							// (i+1)*100+j+1 ���磺i=0
							// j=0��ʱ��,(i+1)*100+j+1=(0+1)*100+0+1=101(Ҳ���ǵ�һ��ĵ�һ������)
							// ����ţ�housenumber
							int housenumber = (i + 1) * 100 + j + 1;
							// �����10�����£�Ҳ����0101...0201�ȣ���Ҫ�ڷ����ǰ���0���˴���ǰ��ƴ��һ��0���ַ���
							// ��������
							System.out.print("0" + housenumber + "\t");
							// ���¥����10�����ϣ���ô�Ͳ�Ҫ�ڷ����֮ǰ��0
						} else {
							int housenumber = (i + 1) * 100 + j + 1;
							// �����10�����ϣ�Ҳ����1001...1201�ȣ�����Ҫ�ڷ����ǰ���0
							System.out.print(housenumber + "\t");
						}
					}
					// ����
					System.out.println();
					// �൱���������������null
					for (int l = 0; l < 10; l++) {
						System.out.print(hotel[i][l] + "\t");
					}
					System.out.println();
				}
				continue;
				// ��ʼ������� ��null��Ϊ���У�������ѡ��2���г�ʼ������ѡ��1���в�ѯ
			} else if (number == 2) {
				for (int i = 0; i < 12; i++) {
					for (int j = 0; j < 10; j++) {
						hotel[i][j] = "����";
					}
				}
				System.out.println("ϵͳ��ʼ�����");
				continue;
				// ���������ס
			} else if (number == 3) {

				do {
					System.out.println("��������ȷ�ķ���ţ�");
					// ��ȡ�ղ�����ķ����
					int floornumber = s.nextInt();
					// ���¥�� 1202/100=12
					int floor = floornumber / 100;
					// ¥��ķ���� 1202%100=2
					int floorno = floornumber % 100;
					// �ж�����ķ�����Ƿ���ڵ�����
					if ((floor >= 1 && floor <= 12) && (floorno >= 1 && floorno <= 10)) {
						// �������ķ���������ǿ���(floor-1����Ϊ�±��Ǵ�0��ʼ)
						if (hotel[floor - 1][floorno - 1].equals("����")) {
							System.out.println("��������������:");
							// ��ȡ���������
							String name = s.next();
							// ����������ָ���Ӧ�ķ���
							hotel[floor - 1][floorno - 1] = name;
							System.out.println("��ϲ" + name + "����/С�㣬�ɹ�����ɹ���");
							break;
						} else {
							System.out.println("��ǰ����������ס��");
							continue;
						}
					} else {
						System.out.println("������ķ�����������������룡");
						continue;
					}
				} while (true);
				// �����˷�(���ʣ���Ҫ���������𣿲���Ҫ����ʵ���������)
			} else if (number == 4) {
				do {
					System.out.println("��������ȷ�ķ����:");
					// �õ��ղ�����ķ����
					int floornumber = s.nextInt();
					// ¥�� 1202/100=12
					int floor = floornumber / 100;
					// ¥��ķ���� 1202%100=2
					int floorno = floornumber % 100;
					// �ж�����ķ�����Ƿ���ڵ�����
					if ((floor >= 1 && floor <= 12) && (floorno >= 1 && floorno <= 10)) {
						// �������ķ���������ǿ���
						if (hotel[floor - 1][floorno - 1].equals("����")) {
							System.out.println("�Բ����������û������ס�����ܰ����˷���");
						} else {
							System.out.println("�˷��ɹ�����ӭ�´���ס��");
							// �˷��ɹ����ͽ�֮ǰ��ס���˵�������Ϊ����
							hotel[floor - 1][floorno - 1] = "����";
							break;
						}
					} else {
						System.out.println("������ķ�����������������룡");
						continue;
					}
				} while (true);
				// ���ѡ���˳�ϵͳ
			} else if (number == 5) {
				System.out.println("�����˳���ǰϵͳ��");
				break;
				// ���ѡ��Ĺ��ܺŲ�����
			} else {
				System.out.println("��ѡ��Ĺ��ܲ����ڣ�������ѡ��");
			}
		}
	}

}
