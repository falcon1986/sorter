package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * 插入排序实现【常用，但是由于每次只能移动一个数据位，一个元素移动完需要多次交换，所以大数据量下是低效的】<br>
 * --描述：遍历数组，把遍历元素和之前的元素做比对，大于（或小于）前面的元素则交换数据
 * --时间复杂度：O(n^2)，最优的时候O(n)<br>
 * ----【比冒泡排序快，不需要每个元素都比对；比选择排序快，对原有数组部分元素有序的部分不需要额外交换】<br>
 * --空间复杂度：O(1)<br>
 * --本排序是稳定的<br>
 * --属于比较排序
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:19:14
 */
public class InsertionSort implements Sort {

	@Override
	public void sort(int[] data) {
		if(data == null || data.length <= 1) {
			return;
		}
		
		//传统实现，逐位交换
//		for(int i = 1; i < data.length; i++) {
//			for(int j = i - 1; j >= 0; j--) {
//				if(data[j + 1] > data[j]) {
//					//可优化，中间交换可用临时变量保存，不需要实际交换，性能会高很多
//					Util.swapPos(data, j + 1, j);
//				} else {
//					break;
//				}
//			}
//		}
		
		//优化，只逐个比较，不做逐个实际交换，性能大幅度提高
		for(int i = 1; i < data.length; i++) {
			int tempPost = i;
			for(int j = i - 1; j >= 0; j--) {
				if(data[j + 1] > data[j]) {
					tempPost = j;
				} else {
					if(tempPost != i) {
						Util.swapPos(data, tempPost, i);
					}
					break;
				}
			}
		}
	}

	@Override
	public String getTitle() {
		return "插入排序";
	}
}