package mytest;

/*
 * 使用二维数组打印一个10行的杨辉三角
 * 
 * 【提示】
 * 1、第一行有1个元素，第n行有n个元素
 * 2、第一行的第一个元素和最后一个元素都是1
 * 3、从第三行开始，对于非第一个元素和最后一个元素的元素，即:
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 * 
 */
public class YanghuiTest {
	public static void main(String[] args) {
		
		int[][] yanghui = new int[10][];
		
		//原代码
//		yanghui[0] = new int[] {1};
//		//二到十行赋值
//		for(int i = 1; i < 10; ++i) {
//			yanghui[i] = new int[i+1];
//			yanghui[i][0] = yanghui[i][i] = 1;
//		
//			for(int j = 1; j < i; ++j) {
//				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
//			}
//		}
//		//输出
//		for(int i = 0; i < 10; ++i) {
//			System.out.print("第" + (i+1) +"行: ");
//			for(int j = 0; j <= i; ++j) {
//				System.out.print(yanghui[i][j]+"   ");
//			}
//			System.out.println();
//		}
		
		//优化代码
		for(int i = 0; i < yanghui.length; ++i) {
			yanghui[i] = new int[i+1];             //注意：二维数组动态初始化之后，还需对内部的每个一维数组初始化后才能赋值
			yanghui[i][0] = yanghui[i][i] = 1;	
			for(int j = 0; j <= i; ++j) {
				if(i > 1 && j >= 1 && j < i) {
					yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
				}
				System.out.print(yanghui[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
