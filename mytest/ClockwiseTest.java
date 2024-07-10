package mytest;
/*
 * 从键盘输入一个整数（1~20）
 * 则以该数字为矩阵的大小，把1，2，3，...，n*n的数字按顺时针螺旋的形式填入其中。例如:输入数字2，则程序输出:1 2
 * 																		 3 4
 * 输入数字3，则程序输出:1 2 3
 * 				 8 9 4
 * 				 7 6 5
 */
import java.util.Scanner;

public class ClockwiseTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个整数（1~20）:");
		int n = scan.nextInt();
		
		//初始化数组
		int[][] arr = new int[n][n]; 
		
		//赋值
		int k = 1,j = 0,i = 0;  //k用来判断上下左右，i,j用来控制行、列
		for(int m =1; m <= n*n; ++m) {   //m用来依次遍历和赋值
			if(k == 1) { //朝右
				if(j < n && arr[i][j] == 0) {
					arr[i][j++] = m;
				}
				else { //j=2,i=1,k=2
					i++;
					j--;
					k++;
				}
			}
			if(k == 2) {  //朝下
				if(i < n && arr[i][j] == 0) {
					arr[i++][j] = m;
				}
				else {
					i--;
					j--;
					k++;
				}				
			}
			if(k == 3) {  //朝左
				if(j >= 0 && arr[i][j] == 0 ) {
					arr[i][j--] = m;
				}
				else {
					i--;
					j++;
					k++;
				}
			}
			if(k == 4) {  //朝上
				if(i >= 0 && arr[i][j] == 0) {
					arr[i--][j] = m;
				}
				else {
					i++;
					j++;
					k = 1;
					m--;
				}
			}
		}
		
		//遍历输出
		for(int x = 0; x < n; ++x) {
			for(int q = 0; q < n; ++q) {
				System.out.print(arr[x][q]+"\t");
			}
			System.out.println();
		}
	}
}

//优化
//public class RectangleTest1 {
//
//	public static void main(String[] args) {
//		int n = 7;
//		int[][] arr = new int[n][n];
//		
//		int count = 0; //要显示的数据
//		int maxX = n-1; //x轴的最大下标
//		int maxY = n-1; //Y轴的最大下标
//		int minX = 0; //x轴的最小下标
//		int minY = 0; //Y轴的最小下标
//		while(minX<=maxX) {
//			for(int x=minX;x<=maxX;x++) {
//				arr[minY][x] = ++count;
//			}
//			minY++;
//			for(int y=minY;y<=maxY;y++) {
//				arr[y][maxX] = ++count;
//			}
//			maxX--;
//			for(int x=maxX;x>=minX;x--) {
//				arr[maxY][x] = ++count;
//			}
//			maxY--;
//			for(int y=maxY;y>=minY;y--) {
//				arr[y][minX] = ++count;
//			}
//			minX++;
//		}
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				String space = (arr[i][j]+"").length()==1 ? "0":"";
//				System.out.print(space+arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
//}
