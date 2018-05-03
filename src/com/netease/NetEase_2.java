package com.netease;
import java.util.*; 

/*
 * @2018/5/3
 * @author 吴宜展
 */

public class NetEase_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();//输入求解区域两端
		int temp = 0;
		int length = r - l + 1;
		int[] a = new int [length];
		for(int i = 0;i < length;i++) {
			for(int j = 1;j <= l;j++) {
				temp = temp * 10 + i;
				}
			a[i] = temp;
		} 
		int count = 0;
		for(int i = 0;i < length;i++) {
			if(a[i] % 3 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
