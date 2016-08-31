package com.liuyunlong.convert.download;

public class BaseDownload {

	public Object httprequest(String path) {
		return this.httprequest(path, null);
	}

	public Object httprequest(String path, String param) {
		System.out.println("this is " + path);
		if (null != param) {

		}
		return null;

	}
}
