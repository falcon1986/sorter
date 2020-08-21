package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * ð������ʵ�֡������ã���Ϊ����<br>
 * --����������ǰһ��Ԫ�غͺ�һ��Ԫ�رȽϣ���ǰ��Ĵ��ڣ���С�ڣ���ߵ�Ԫ��ʱ����������Ԫ�ص�����
 * --ʱ�临�Ӷȣ�O(n^2)�����ŵ�ʱ��O(n)<br>
 * --�ռ临�Ӷȣ�O(1)<br>
 * --���������ȶ���
 * --���ڱȽ�����
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:19:14
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
		return "ð������";
	}
}