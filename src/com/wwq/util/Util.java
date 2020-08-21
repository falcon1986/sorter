package com.wwq.util;

import java.util.Arrays;
import java.util.Random;

/**
 * ���򹤾���
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:29:51
 */
public class Util {

	/**
	 * ��������Ԫ��
	 * @param data ����
	 * @param pos1 λ��1
	 * @param pos2 λ��2
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
	 * �����������
	 * @param len ���鳤��
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
	 * �����������
	 * @param len ���鳤��
	 * @param maxNum ���ֵ
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
	 * ���������̨
	 * @param arr ����
	 */
	public static void outputConsole(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
