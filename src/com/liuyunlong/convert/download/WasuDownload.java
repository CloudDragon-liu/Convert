package com.liuyunlong.convert.download;

public class WasuDownload extends BaseDownload {
	private static WasuDownload INSTANCE;

	public static WasuDownload getInstance() {
		if (null == INSTANCE) {
			INSTANCE = new WasuDownload();
		}
		return INSTANCE;
	}

	public void start() {
		super.httprequest("wasu");
	}
}
