package com.wwq.impl;

import com.wwq.Sort;

/**
 * 归并排序<br>
 * --描述：把数组对半化为为两个有序的数组（如果左侧或右侧部分不是有序的，则递归再次划分为两个数组，不断递归划分直到只有单元素数组），然后进行数组合并（两个坐标交替自增合并成一个有序数组）<br>
 * --jdk和php默认的对象排序默认是以归并排序为基础的（基于mergeSort的改进型排序，比如jdk基础数据类型使用双抽快排，对象使用的是TimSort【多路归并排序算法：小于MIN_MERGE使用二分插入算法，大于则先分成很多小块，先用二分插入算法，再用归并算法合并】）<br>
 * --平均时间复杂度：O(n log n)<br>
 * --空间复杂度：O(n)<br>
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
public class MergeSort implements Sort {

	@Override
	public void sort(int[] data) {
		sort(data, 0, data.length - 1);
	}
	
	/**
	 * 排序
	 * @param data
	 * @param left
	 * @param right
	 */
	private void sort(int[] data, int left, int right) {
		if(left >= right) {
			return;
		}
		//分成两半
		int mid = left + (right - left) / 2;
		if(left >= mid || right <= mid) {
			return;
		}
		//左边排序
		sort(data, left, mid);
		//右边排序
		sort(data, mid, right);
		//合并
		merge(data, left, mid, right);
	}
	
	/**
	 * 合并
	 * @param data
	 * @param leftPtr
	 * @param rightPtr
	 * @param rightBound
	 * @return
	 */
	private int[] merge(int[] data, int leftPtr, int rightPtr, int rightBound) {
		int[] temp = new int[rightBound - leftPtr + 1];
		int mid = rightPtr;
		
		int i = leftPtr;
		int j = rightPtr;
		int k = 0;
		
		while(i < mid && j <= rightBound) {
			temp[k++] = data[i] <= data[j] ? data[i++] : data[j++];
		}
		
		while(i < mid) {
			temp[k++] = data[i++];
		}
		
		while(j <= rightBound) {
			temp[k++] = data[j++];
		}
		
		//数组复制
		for(i = 0; i < temp.length; i++) {
			data[leftPtr + i] = temp[i];
		}
		
		return temp;
	}

	@Override
	public String getTitle() {
		return "归并排序";
	}
}