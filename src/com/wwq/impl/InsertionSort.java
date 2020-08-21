package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * ��������ʵ�֡����ã���������ÿ��ֻ���ƶ�һ������λ��һ��Ԫ���ƶ�����Ҫ��ν��������Դ����������ǵ�Ч�ġ�<br>
 * --�������������飬�ѱ���Ԫ�غ�֮ǰ��Ԫ�����ȶԣ����ڣ���С�ڣ�ǰ���Ԫ���򽻻�����
 * --ʱ�临�Ӷȣ�O(n^2)�����ŵ�ʱ��O(n)<br>
 * ----����ð������죬����Ҫÿ��Ԫ�ض��ȶԣ���ѡ������죬��ԭ�����鲿��Ԫ������Ĳ��ֲ���Ҫ���⽻����<br>
 * --�ռ临�Ӷȣ�O(1)<br>
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
public class InsertionSort implements Sort {

	@Override
	public void sort(int[] data) {
		if(data == null || data.length <= 1) {
			return;
		}
		
		//��ͳʵ�֣���λ����
//		for(int i = 1; i < data.length; i++) {
//			for(int j = i - 1; j >= 0; j--) {
//				if(data[j + 1] > data[j]) {
//					//���Ż����м佻��������ʱ�������棬����Ҫʵ�ʽ��������ܻ�ߺܶ�
//					Util.swapPos(data, j + 1, j);
//				} else {
//					break;
//				}
//			}
//		}
		
		//�Ż���ֻ����Ƚϣ��������ʵ�ʽ��������ܴ�������
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
		return "��������";
	}
}