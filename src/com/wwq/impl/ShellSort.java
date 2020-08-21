package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * 希尔排序实现（插入排序优化版，性能远远高于普通的插入排序）【不常用，因为不稳定】<br>
 * --描述：在插入排序的基础上，确定一个间隔n，根据间隔取数分成一个组排好序，然后按间隔n+1，再分成一个组排好序，以此类推，最后再按插入排序方式处理一次，
 * 整体移动次数比插入排序少，间隔大，移动次数小<br>
 * --平均时间复杂度：O(n^1.3)<br>
 * ----【比冒泡排序快，不需要每个元素都比对；比选择排序快，对原有数组部分元素已排序的情况不需要额外交换】<br>
 * --空间复杂度：O(1)<br>
 * --本排序是不稳定的<br>
 * --属于比较排序
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:19:14
 */
public class ShellSort implements Sort {

	@Override
	public void sort(int[] data) {
		if(data == null || data.length <= 1) {
			return;
		}
		
		//固定间隔
//		for(int interval = 4; interval > 0; interval--) {
//			for(int i = interval; i < data.length; i += interval) {
//				if(i - interval < 0) {
//					continue;
//				}
//				if(data[i - interval] > data[i]) {
//					Util.swapPos(data, i - interval, i);
//				}
//			}
//		}
		
		
		//对半间隔（比固定间隔序列效率高）
		int len = data.length;
		for(int interval = len / 2; interval > 0; interval /= 2) {
			for(int i = interval; i < data.length; i += interval) {
				if(i - interval < 0) {
					continue;
				}
				if(data[i - interval] > data[i]) {
					Util.swapPos(data, i - interval, i);
				}
			}
		}
		
		//knuth间隔序列：3h+1（比对半间隔效率高）
//		for(int interval = 1; interval <= data.length / 3; interval = 3 * interval + 1) {
//			for(int i = interval; i < data.length; i += interval) {
//				if(i - interval < 0) {
//					continue;
//				}
//				if(data[i - interval] > data[i]) {
//					Util.swapPos(data, i - interval, i);
//				}
//			}
//		}
	}

	@Override
	public String getTitle() {
		return "希尔排序";
	}
}