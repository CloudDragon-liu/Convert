package com.liuyunlong.convert.core;

import com.liuyunlong.convert.download.SohuDownload;

public class SohuConvert extends BaseConvert {

	@Override
	protected void doConvert() {
		super.doConvert();
		System.out.println("SohuConvert Begin");
		SohuDownload.getInstance().start();
	}
}
