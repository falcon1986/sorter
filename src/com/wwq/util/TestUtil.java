package com.wwq.util;

import java.util.Date;

import com.wwq.Sort;
import com.wwq.impl.BubbleSort;
import com.wwq.impl.InsertionSort;
import com.wwq.impl.MergeSort;
import com.wwq.impl.QuickSort;
import com.wwq.impl.SelectedSort;
import com.wwq.impl.ShellSort;

/**
 * ������Թ�����
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:45:11
 */
public class TestUtil {
	
	private static final int SIMPLE_DATA_LENGTH = 20;
	
	private static final int SIMPLE_DATA_MAX = 50;
	
	private static final int BIG_DATA_LENGTH = 100000;
	
	private static final int SERIAL_BIG_DATA_LENGTH = 100000;

	/**
	 * �򵥲���
	 * @param sort
	 */
	public static void simple(Sort sort) {
		System.out.println(sort.getTitle() + "-----------------���߼����ԣ�");
		//��������
		System.out.println("---���ɲ����������£�");
		int[] arr = Util.randomArr(SIMPLE_DATA_LENGTH, SIMPLE_DATA_MAX);
		Util.outputConsole(arr);
		
		//����
		Date s = new Date();
		new SelectedSort().sort(arr);
		Date e = new Date();
		
		//������
		System.out.println("---����������£�");
		Util.outputConsole(arr);
		System.out.println("---�������򹲺ķѣ�" + (e.getTime() - s.getTime()) + "����");
	}
	
	/**
	 * �������ݲ���
	 * @param sort
	 */
	public static void big(Sort sort) {
		System.out.println(sort.getTitle() + "-----------------��������(" + BIG_DATA_LENGTH + ")���ԣ�");
		//��������
//		System.out.println("---���ɲ����������£�");
		int[] arr = Util.randomArr(BIG_DATA_LENGTH, BIG_DATA_LENGTH * 10);
//		Util.outputConsole(arr);
		
		//����
		Date s = new Date();
		sort.sort(arr);
		Date e = new Date();
		
		//������
//		System.out.println("---����������£�");
//		Util.outputConsole(arr);
		System.out.println("---�������򹲺ķѣ�" + (e.getTime() - s.getTime()) + "����");
	}
	
	/**
	 * �����������ݲ���
	 * @param sort
	 */
	public static void serialBig(Sort sort) {
		System.out.println(sort.getTitle() + "-----------------���������������ԣ�");
		for(int len = SERIAL_BIG_DATA_LENGTH; len > 0; len /= 10) {
			int[] arr = Util.randomArr(len, len * 10);
			Date s = new Date();
			sort.sort(arr);
			Date e = new Date();
			System.out.println("---��ģΪ��" + len + "�����򹲺ķѣ�" + (e.getTime() - s.getTime()) + "����");
		}
	}
	
	/**
	 * ��ȡ���������㷨
	 * @return
	 */
	public static Sort[] getAllSortExecuter() {
		return new Sort[] {
			new SelectedSort()
			, new BubbleSort()
			, new InsertionSort()
			, new ShellSort()
			, new MergeSort()
			, new QuickSort()
		};
	}
}