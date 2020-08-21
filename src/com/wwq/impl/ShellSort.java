package com.wwq.impl;

import com.wwq.Sort;
import com.wwq.util.Util;

/**
 * ϣ������ʵ�֣����������Ż��棬����ԶԶ������ͨ�Ĳ������򣩡������ã���Ϊ���ȶ���<br>
 * --�������ڲ�������Ļ����ϣ�ȷ��һ�����n�����ݼ��ȡ���ֳ�һ�����ź���Ȼ�󰴼��n+1���ٷֳ�һ�����ź����Դ����ƣ�����ٰ���������ʽ����һ�Σ�
 * �����ƶ������Ȳ��������٣�������ƶ�����С<br>
 * --ƽ��ʱ�临�Ӷȣ�O(n^1.3)<br>
 * ----����ð������죬����Ҫÿ��Ԫ�ض��ȶԣ���ѡ������죬��ԭ�����鲿��Ԫ����������������Ҫ���⽻����<br>
 * --�ռ临�Ӷȣ�O(1)<br>
 * --�������ǲ��ȶ���<br>
 * --���ڱȽ�����
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:19:14
 */
public class ShellSort implements Sort {

	@Override
	public void sort(int[] data) {
		if(data == null || data.length <= 1) {
			return;
		}
		
		//�̶����
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
		
		
		//�԰������ȹ̶��������Ч�ʸߣ�
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
		
		//knuth������У�3h+1���ȶ԰���Ч�ʸߣ�
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
		return "ϣ������";
	}
}