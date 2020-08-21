package com.wwq.impl;

import com.wwq.Sort;

/**
 * �鲢����<br>
 * --������������԰뻯ΪΪ������������飨��������Ҳಿ�ֲ�������ģ���ݹ��ٴλ���Ϊ�������飬���ϵݹ黮��ֱ��ֻ�е�Ԫ�����飩��Ȼ���������ϲ����������꽻�������ϲ���һ���������飩<br>
 * --jdk��phpĬ�ϵĶ�������Ĭ�����Թ鲢����Ϊ�����ģ�����mergeSort�ĸĽ������򣬱���jdk������������ʹ��˫����ţ�����ʹ�õ���TimSort����·�鲢�����㷨��С��MIN_MERGEʹ�ö��ֲ����㷨���������ȷֳɺܶ�С�飬���ö��ֲ����㷨�����ù鲢�㷨�ϲ�����<br>
 * --ƽ��ʱ�临�Ӷȣ�O(n log n)<br>
 * --�ռ临�Ӷȣ�O(n)<br>
 * --���������ȶ���<br>
 * --���ڱȽ�����
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:19:14
 */
public class MergeSort implements Sort {

	@Override
	public void sort(int[] data) {
		sort(data, 0, data.length - 1);
	}
	
	/**
	 * ����
	 * @param data
	 * @param left
	 * @param right
	 */
	private void sort(int[] data, int left, int right) {
		if(left >= right) {
			return;
		}
		//�ֳ�����
		int mid = left + (right - left) / 2;
		if(left >= mid || right <= mid) {
			return;
		}
		//�������
		sort(data, left, mid);
		//�ұ�����
		sort(data, mid, right);
		//�ϲ�
		merge(data, left, mid, right);
	}
	
	/**
	 * �ϲ�
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
		
		//���鸴��
		for(i = 0; i < temp.length; i++) {
			data[leftPtr + i] = temp[i];
		}
		
		return temp;
	}

	@Override
	public String getTitle() {
		return "�鲢����";
	}
}