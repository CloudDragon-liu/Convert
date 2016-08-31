package com.liuyunlong.convert.core;

import com.liuyunlong.convert.download.LetvDownload;

public class LetvConvert extends BaseConvert {

	@Override
	protected void doConvert() {
		super.doConvert();
		System.out.println("LevtConvert begin");
		LetvDownload.getInstance().start();
	}
}
