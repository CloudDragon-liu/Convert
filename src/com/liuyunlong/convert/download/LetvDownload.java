package com.liuyunlong.convert.download;

public class LetvDownload extends BaseDownload {

	private static LetvDownload INSTANCE;

	public static LetvDownload getInstance() {
		if (null == INSTANCE) {
			INSTANCE = new LetvDownload();
		}
		return INSTANCE;
	}

	public void start() {
		super.httprequest("letv");
	}
}
