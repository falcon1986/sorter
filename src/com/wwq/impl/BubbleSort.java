package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * 冒泡排序实现【不常用，因为慢】<br>
 * --描述：数组前一个元素和后一个元素比较，当前面的大于（或小于）后边的元素时，交换两个元素的数据
 * --时间复杂度：O(n^2)，最优的时候O(n)<br>
 * --空间复杂度：O(1)<br>
 * --本排序是稳定的
 * --属于比较排序
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:19:14
 */
public class BubbleSort implements Sort {

	@Override
	public void sort(int[] data) {
		if(data == null || data.length <= 1) {
			return;
		}
		
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i] > data[j]) {
					Util.swapPos(data, i, j);
				}
			}
		}
	}

	@Override
	public String getTitle() {
		return "冒泡排序";
	}
}