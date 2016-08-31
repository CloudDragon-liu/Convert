package com.liuyunlong.convert;

import java.util.ArrayList;
import java.util.List;

import com.liuyunlong.convert.core.BaseConvert;
import com.liuyunlong.convert.core.ConvertFactory;

/**
 * 转换入口函数
 * 
 * @author samsung
 *
 */
public class Main {

	public static void main(String[] args) {
		String sources = "wasu,sohu,letv";
		List<BaseConvert> converts = new ArrayList<>();
		converts = ConvertFactory.getInstance().getConverts(sources);
		if (null != converts && converts.size() > 0) {
			for (BaseConvert baseConvert : converts) {
				baseConvert.convert();
			}
		}
	}
}
