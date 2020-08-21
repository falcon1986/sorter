package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * ��������ʵ��<br>
 * --����������ѡ��һ���ڱ�Ԫ�أ��ѱ���С�ķŵ�����ߣ�������ķŵ����ұߣ�Ȼ���ظ��������������Ҳ������鰴����ĵݹ����<br>
 * --ʱ�临�Ӷȣ�O(n*logn)������ʱ��O(n^2)<br>
 * ----�Ż�˼·��Ԥ���жϣ�������������ʹ�ù鲢���򣻻���ȡ�ڱ�Ԫ��ʱ���ȡ��ȡ��������������һ�����ټ��㣬������������<br>
 * --�ռ临�Ӷȣ�O(log n)<br>
 * --�������ǲ��ȶ��ģ��������²��ȶ���<br>
 * --���ڱȽ�����
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:19:14
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
		
		int key = data[right]; //ѡȡ�������һ��Ԫ����Ϊ������
		int i = left;
		int j = right - 1;
		while(i < j) {
			//����߿�ʼ��ȡ��һ������������������
			for(; i < right; i++) {
				if(data[i] > key) {
					break;
				}
			}
			
			//���ұ߿�ʼ��ȡ��һ��С������������
			for(; j > i; j--) {
				if(data[j] < key) {
					break;
				}
			}
			
			//����ߴ������������������ݺ��ұ�С�����������������ݽ��н���
			if(j > i) {
				Util.swapPos(data, i, j);
			}
		}
		
		//����������������һ����������������ĺ�һ������Ԫ�ؽ��н���
		if(i + 1 < right) {
			Util.swapPos(data, i + 1, right);
		}
		
		//�ݹ���������������������п�������
		if(i > left + 1 && i < right) {
			sort(data, left, i);
		}
		
		//�ݹ�����������ұ���������п�������
		//i�����һ��С��������������
		//i + 1������������
		if(j > i + 2 && i + 2 > left) {
			sort(data, i + 2, right);
		}
	}

	@Override
	public String getTitle() {
		return "��������";
	}
}