package com.control;


/**
 * 控件延迟加载
 * 
 * @author tom
 * 
 */
public interface LazyLoadControl {

	/**
	 * 标示使用了延迟加载
	 */
	public boolean isLazyLoad = true;

	/**
	 * 初始化的过程
	 * @param <T>
	 * @return		返回实例本身
	 */
	public LazyLoadControl init();
}

