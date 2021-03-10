package com.bdqn;

import java.util.Scanner;

/**
 * 模拟酒店系统 1.查询所有房间 2.系统初始化 3.办理入住 4.退房 5.退出系统
 * 
 * 注意：每次操作必须先执行2系统初始化，然后再进行操作 因为判断条件中有空闲才会办理入住等业务，所以必须系统初始化， 让null变为空闲
 * 
 * 房间排列为: 0101 0102 0103 0104 0105 0106 0107 0108 0109 0110 空闲 空闲 空闲 空闲 空闲 空闲 空闲
 * 空闲 空闲 空闲 0201 0202 0203 0204 0205 0206 0207 0208 0209 0210 空闲 空闲 空闲 空闲 空闲 空闲
 * 空闲 空闲 空闲 空闲 ...... ...... ...... 1201 1202 1203 1204 1205 1206 1207 1208 1209
 * 1210 空闲 空闲 空闲 空闲 空闲 空闲 空闲 空闲 空闲 空闲
 */
public class Hotel {
	public static void main(String[] args) {
		// 初始化一个二维数组(酒店) 12行10列的数组(也就是说12层，每层10个房间)
		String hotel[][] = new String[12][10];
		System.out.println("***欢迎入住德玛西亚皇家大酒店***");
		// 获取键盘输入
		Scanner s = new Scanner(System.in);
		System.out.println("请选择您所需的功能：1.查询所有房间   2.系统初始化   3.办理入住   4.退房  5.退出系统");
		while (true) {
			// 获取输入的功能号
			int number = s.nextInt();
			// 如果选择1.查询所有房间
			if (number == 1) {
				// 外层循环的是行(数组下标从0开始，可以取到的值是： 0—11,共12个)
				for (int i = 0; i < 12; i++) {
					// 内层循环的是列
					for (int j = 0; j < 10; j++) {
						// 如果楼层在10层以下
						if (i < 9) {
							// 因下标是从0开始，所以必须是i+1
							// (i+1)*100+j+1 比如：i=0
							// j=0的时候,(i+1)*100+j+1=(0+1)*100+0+1=101(也就是第一层的第一个房间)
							// 房间号：housenumber
							int housenumber = (i + 1) * 100 + j + 1;
							// 如果是10层以下，也就是0101...0201等，需要在房间号前面加0，此处给前面拼接一个0的字符串
							// 输出房间号
							System.out.print("0" + housenumber + "\t");
							// 如果楼层在10层以上，那么就不要在房间号之前加0
						} else {
							int housenumber = (i + 1) * 100 + j + 1;
							// 如果是10层以上，也就是1001...1201等，不需要在房间号前面加0
							System.out.print(housenumber + "\t");
						}
					}
					// 换行
					System.out.println();
					// 相当于输出房间号下面的null
					for (int l = 0; l < 10; l++) {
						System.out.print(hotel[i][l] + "\t");
					}
					System.out.println();
				}
				continue;
				// 初始化房间号 由null变为空闲，可以先选择2进行初始化，再选择1进行查询
			} else if (number == 2) {
				for (int i = 0; i < 12; i++) {
					for (int j = 0; j < 10; j++) {
						hotel[i][j] = "空闲";
					}
				}
				System.out.println("系统初始化完成");
				continue;
				// 如果办理入住
			} else if (number == 3) {

				do {
					System.out.println("请输入正确的房间号：");
					// 获取刚才输入的房间号
					int floornumber = s.nextInt();
					// 获得楼层 1202/100=12
					int floor = floornumber / 100;
					// 楼层的房间号 1202%100=2
					int floorno = floornumber % 100;
					// 判断输入的房间号是否存在的条件
					if ((floor >= 1 && floor <= 12) && (floorno >= 1 && floorno <= 10)) {
						// 如果输入的房间号正好是空闲(floor-1是因为下标是从0开始)
						if (hotel[floor - 1][floorno - 1].equals("空闲")) {
							System.out.println("请输入您的姓名:");
							// 获取输入的名字
							String name = s.next();
							// 把输入的名字给对应的房间
							hotel[floor - 1][floorno - 1] = name;
							System.out.println("恭喜" + name + "先生/小姐，成功办理成功！");
							break;
						} else {
							System.out.println("当前房间有人入住！");
							continue;
						}
					} else {
						System.out.println("您输入的房间号有误，请重新输入！");
						continue;
					}
				} while (true);
				// 办理退房(疑问：需要输入姓名吗？不需要，现实生活中如此)
			} else if (number == 4) {
				do {
					System.out.println("请输入正确的房间号:");
					// 拿到刚才输入的房间号
					int floornumber = s.nextInt();
					// 楼层 1202/100=12
					int floor = floornumber / 100;
					// 楼层的房间号 1202%100=2
					int floorno = floornumber % 100;
					// 判断输入的房间号是否存在的条件
					if ((floor >= 1 && floor <= 12) && (floorno >= 1 && floorno <= 10)) {
						// 如果输入的房间号正好是空闲
						if (hotel[floor - 1][floorno - 1].equals("空闲")) {
							System.out.println("对不起，这个房间没有人入住，不能办理退房！");
						} else {
							System.out.println("退房成功，欢迎下次入住！");
							// 退房成功，就将之前入住客人的姓名置为空闲
							hotel[floor - 1][floorno - 1] = "空闲";
							break;
						}
					} else {
						System.out.println("您输入的房间号有误，请重新输入！");
						continue;
					}
				} while (true);
				// 如果选择退出系统
			} else if (number == 5) {
				System.out.println("您已退出当前系统！");
				break;
				// 如果选择的功能号不存在
			} else {
				System.out.println("您选择的功能不存在，请重新选择！");
			}
		}
	}

}
