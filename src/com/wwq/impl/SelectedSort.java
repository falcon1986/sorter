package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * 选择排序实现【不常用，因为不稳定，而且大数据量下性能较低】<br>
 * --描述：数组分成两个部分，前面是排好序的，后边是没排序的，循环把后边部分的最小值或最大值放到左边部分的最后一个元素后边
 * --时间复杂度：O(n^2)<br>
 * ----【比冒泡排序快，不需要每个元素都比对】<br>
 * --空间复杂度：O(1)<br>
 * --本排序是不稳定的：两个相等的数，排序后位置可能会变<br>
 * --属于比较排序
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:19:14
 */
public class SelectedSort implements Sort {

	@Override
	public void sort(int[] data) {
		if(data == null || data.length <= 1) {
			return;
		}
		
		for(int i = 0; i < data.length; i++) {
			int minPos = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] < data[minPos]) {
					minPos = j;
				}
			}
			Util.swapPos(data, i, minPos);
		}
	}

	@Override
	public String getTitle() {
		return "选择排序";
	}
}