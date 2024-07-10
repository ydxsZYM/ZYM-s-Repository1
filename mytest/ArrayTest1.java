package mytest;

//通过输入学生人数和学生成绩，来得到成绩的最高分，并且给出相应评级

import java.util.Scanner;
public class ArrayTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		1.使用Scanner，读取学生个数
		System.out.print("请输入学生人数:");
		int num = scan.nextInt();
		
//		2.创建数组，存储学生成绩，动态初始化
		int[] grades = new int[num];
		System.out.println("请输入" + num +"个成绩:");
		
//		3.给数组中的元素赋值
		for(int i = 0; i < num; ++i ) {
			grades[i] =  scan.nextInt();
		}
		
//		4.获取数组中元素的最大值:最高分
		int max = 0;
		for(int i = 0; i < num - 1; ++i) {
			if(grades[i] > grades[i+1]) {
				max = grades[i];
			}
		}
		System.out.println("最高分是" + max);
		
		
//		5.根据每个学生成绩与最高分的差值，得到每个学生的成绩，并输出成绩和等级
		char[] levels = new char[num];
		for(int i = 0; i < num; ++i ) {
			if(grades[i] >= max - 10)
				levels[i] = 'A';
			else if(grades[i] >= max - 20)
				levels[i] = 'B';
			else if(grades[i] >= max - 30)
				levels[i] = 'C';
			else
				levels[i] = 'D';
			System.out.println("student " + i + " score is " + grades[i] + " grade is " + levels[i]);
		}

	}

}
