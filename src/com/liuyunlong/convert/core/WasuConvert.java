package com.liuyunlong.convert.core;

import com.liuyunlong.convert.download.WasuDownload;

public class WasuConvert extends BaseConvert {

	@Override
	protected void doConvert() {
		super.doConvert();
		System.out.println("WasuConvert begin");
		WasuDownload.getInstance().start();
	}

}
