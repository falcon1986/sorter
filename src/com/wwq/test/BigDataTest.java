package com.wwq.test;

import org.junit.Test;

import com.wwq.Sort;
import com.wwq.util.TestUtil;

/**
 * ������������
 * 
 * @��������
 *       
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��5��28�� ����6:54:23
 */
public class BigDataTest {

	/**
	 * ��ʼ����
	 */
	@Test
	public void start() {
		Sort[] executes = TestUtil.getAllSortExecuter();
		for(Sort execute : executes) {
			TestUtil.big(execute);
		}
	}
}
