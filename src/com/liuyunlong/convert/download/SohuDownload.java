package com.liuyunlong.convert.download;

public class SohuDownload extends BaseDownload {
	private static SohuDownload INSTANCE;

	public static SohuDownload getInstance() {
		if (null == INSTANCE) {
			INSTANCE = new SohuDownload();
		}
		return INSTANCE;
	}

	public void start() {
		super.httprequest("sohu");
	}

}
