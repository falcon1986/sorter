package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * 快速排序实现<br>
 * --基本描述：选定一个哨兵元素，把比他小的放到他左边，比他大的放到他右边，然后重复对左侧子数组和右侧子数组按上面的递归调用<br>
 * --时间复杂度：O(n*logn)，最差的时候O(n^2)<br>
 * ----优化思路：预先判断，如果是最差的情况使用归并排序；或者取哨兵元素时随机取（取随机数交换到最后一个，再计算，避免最坏的情况）<br>
 * --空间复杂度：O(log n)<br>
 * --本排序是不稳定的（交换导致不稳定）<br>
 * --属于比较排序
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:19:14
 */
public class QuickSort implements Sort {

	@Override
	public void sort(int[] data) {
		sort(data, 0, data.length - 1);
	}
	
	private void sort(int[] data, int left, int right) {
		if(left >= right) return;
		if(left < 0) return;
		if(right >= data.length) return;
		
		int key = data[right]; //选取数据最后一个元素作为中轴数
		int i = left;
		int j = right - 1;
		while(i < j) {
			//从左边开始获取第一个大于中轴数的坐标
			for(; i < right; i++) {
				if(data[i] > key) {
					break;
				}
			}
			
			//从右边开始获取第一个小于中轴数坐标
			for(; j > i; j--) {
				if(data[j] < key) {
					break;
				}
			}
			
			//把左边大于中轴数的坐标数据和右边小于中轴数的坐标数据进行交换
			if(j > i) {
				Util.swapPos(data, i, j);
			}
		}
		
		//把中轴数和左边最后一个大于中轴数坐标的后一个数据元素进行交换
		if(i + 1 < right) {
			Util.swapPos(data, i + 1, right);
		}
		
		//递归调用中轴数左边子数组进行快速排序
		if(i > left + 1 && i < right) {
			sort(data, left, i);
		}
		
		//递归调用中轴数右边子数组进行快速排序
		//i是最后一个小于中轴数的坐标
		//i + 1是中轴数坐标
		if(j > i + 2 && i + 2 > left) {
			sort(data, i + 2, right);
		}
	}

	@Override
	public String getTitle() {
		return "快速排序";
	}
}