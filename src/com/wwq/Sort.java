package com.wwq;

/**
 * 排序接口
 * 
 * @功能描述
 *       
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年5月28日 下午6:43:17
 */
public interface Sort {

	/**
	 * 排序
	 * @param data 数据
	 */
	void sort(int[] data);
	
	/**
	 * 获取标题
	 * @return
	 */
	String getTitle();
}