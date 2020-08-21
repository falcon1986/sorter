package com.wwq.util;

import java.util.Arrays;
import java.util.Random;

/**
 * 排序工具类
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:29:51
 */
public class Util {

	/**
	 * 交换数组元素
	 * @param data 数组
	 * @param pos1 位置1
	 * @param pos2 位置2
	 */
	public static void swapPos(int[] data, int pos1, int pos2) {
		if(pos1 == pos2) {
			return;
		}
		int temp = data[pos1];
		data[pos1] = data[pos2];
		data[pos2] = temp;
	}
	
	/**
	 * 生成随机数组
	 * @param len 数组长度
	 * @return
	 */
	public static int[] randomArr(int len) {
		Random r = new Random();
		int[] data = new int[len];
		for(int i = 0; i < len; i++) {
			data[i] = r.nextInt();
		}
		return data;
	}
	
	/**
	 * 生成随机数组
	 * @param len 数组长度
	 * @param maxNum 最大值
	 * @return
	 */
	public static int[] randomArr(int len, int maxNum) {
		Random r = new Random();
		int[] data = new int[len];
		for(int i = 0; i < len; i++) {
			data[i] = r.nextInt(maxNum);
		}
		return data;
	}
	
	/**
	 * 输出到控制台
	 * @param arr 数组
	 */
	public static void outputConsole(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
