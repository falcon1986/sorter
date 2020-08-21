package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * ѡ������ʵ�֡������ã���Ϊ���ȶ������Ҵ������������ܽϵ͡�<br>
 * --����������ֳ��������֣�ǰ�����ź���ģ������û����ģ�ѭ���Ѻ�߲��ֵ���Сֵ�����ֵ�ŵ���߲��ֵ����һ��Ԫ�غ��
 * --ʱ�临�Ӷȣ�O(n^2)<br>
 * ----����ð������죬����Ҫÿ��Ԫ�ض��ȶԡ�<br>
 * --�ռ临�Ӷȣ�O(1)<br>
 * --�������ǲ��ȶ��ģ�������ȵ����������λ�ÿ��ܻ��<br>
 * --���ڱȽ�����
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:19:14
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
		return "ѡ������";
	}
}