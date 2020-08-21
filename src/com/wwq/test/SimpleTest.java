package com.wwq.test;

import org.junit.Test;

import com.wwq.Sort;
import com.wwq.util.TestUtil;

/**
 * 简单测试
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:54:23
 */
public class SimpleTest {

	/**
	 * 开始测试
	 */
	@Test
	public void start() {
		Sort[] executes = TestUtil.getAllSortExecuter();
		for(Sort execute : executes) {
			TestUtil.simple(execute);
		}
	}
}
