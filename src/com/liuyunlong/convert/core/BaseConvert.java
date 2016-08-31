package com.liuyunlong.convert.core;

public class BaseConvert {

	private String mSource;

	private Runnable mRunnable = new Runnable() {

		@Override
		public void run() {
			BaseConvert.this.doConvert();
		}
	};

	protected void doConvert() {

	}

	public String getmSource() {
		return mSource;
	}

	public void setmSource(String mSource) {
		this.mSource = mSource;
	}

	/**
	 * 每一个转换单独启用一个线程
	 */
	public void convert() {
		new Thread(mRunnable).start();
	}
}
