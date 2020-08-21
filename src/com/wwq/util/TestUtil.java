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
 * 排序测试工具类
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:45:11
 */
public class TestUtil {
	
	private static final int SIMPLE_DATA_LENGTH = 20;
	
	private static final int SIMPLE_DATA_MAX = 50;
	
	private static final int BIG_DATA_LENGTH = 100000;
	
	private static final int SERIAL_BIG_DATA_LENGTH = 100000;

	/**
	 * 简单测试
	 * @param sort
	 */
	public static void simple(Sort sort) {
		System.out.println(sort.getTitle() + "-----------------简单逻辑测试：");
		//生成数组
		System.out.println("---生成测试数组如下：");
		int[] arr = Util.randomArr(SIMPLE_DATA_LENGTH, SIMPLE_DATA_MAX);
		Util.outputConsole(arr);
		
		//排序
		Date s = new Date();
		new SelectedSort().sort(arr);
		Date e = new Date();
		
		//输出结果
		System.out.println("---排序后结果如下：");
		Util.outputConsole(arr);
		System.out.println("---本次排序共耗费：" + (e.getTime() - s.getTime()) + "毫秒");
	}
	
	/**
	 * 大量数据测试
	 * @param sort
	 */
	public static void big(Sort sort) {
		System.out.println(sort.getTitle() + "-----------------大数据量(" + BIG_DATA_LENGTH + ")测试：");
		//生成数组
//		System.out.println("---生成测试数组如下：");
		int[] arr = Util.randomArr(BIG_DATA_LENGTH, BIG_DATA_LENGTH * 10);
//		Util.outputConsole(arr);
		
		//排序
		Date s = new Date();
		sort.sort(arr);
		Date e = new Date();
		
		//输出结果
//		System.out.println("---排序后结果如下：");
//		Util.outputConsole(arr);
		System.out.println("---本次排序共耗费：" + (e.getTime() - s.getTime()) + "毫秒");
	}
	
	/**
	 * 连续大量数据测试
	 * @param sort
	 */
	public static void serialBig(Sort sort) {
		System.out.println(sort.getTitle() + "-----------------连续大数据量测试：");
		for(int len = SERIAL_BIG_DATA_LENGTH; len > 0; len /= 10) {
			int[] arr = Util.randomArr(len, len * 10);
			Date s = new Date();
			sort.sort(arr);
			Date e = new Date();
			System.out.println("---规模为“" + len + "”排序共耗费：" + (e.getTime() - s.getTime()) + "毫秒");
		}
	}
	
	/**
	 * 获取所有排序算法
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