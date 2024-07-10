package mytest;
/*
 *数组
 *1.数组的声明、初始化和赋值
 *2.调用数组的指定位置的元素
 *3.如何获得数组长度属性 length
 *4.遍历数组
 *5.数组元素的默认初始化值
 *	①整型:0
 *	②浮点型:0.0
 *	③字符型:0或‘\u0000’
 *	④boolean型:false
 *	⑤引用数据类型:null
 *6.数组的内存解析
 */
public class ArrayTest {
	public static void main(String[] args) {
		
//		1.1 数组的静态初始化 初始化和赋值同时进行
		int[] array1;
		array1 = new int[] {1,2,3,4,5,6,7};
		System.out.println(array1[3]);
		
//		1.2 数组的动态初始化 只初始化
		String[] array2 = new String[5];

//		2 调用数组指定位置的元素
		array2[0] = "朱元璋";
		array2[1] = "朱棣";
		array2[2] = "朱厚照";
		array2[3] = "朱高炽";
		array2[4] = "李世民";
		
//		3.如何获取数组长度属性   length
		System.out.println(array1.length);
		System.out.println(array2.length);
		
//		4.遍历数组
		for(int i = 0;i < array2.length;++i) {
			System.out.println(array2[i]);
		}
		
//		5.数组元素的默认初始化值
		char[] arr = new char[3];
		for(int i = 0;i < arr.length;++i) {
			System.out.println((int)arr[i]);		
		}
		
		
	}
}
