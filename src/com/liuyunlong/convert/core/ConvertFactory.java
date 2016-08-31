package com.liuyunlong.convert.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Convert工厂类
 * 
 * @author samsung
 *
 */
public class ConvertFactory {

	private static ConvertFactory INSTANCE;

	public static ConvertFactory getInstance() {
		if (null == INSTANCE) {
			INSTANCE = new ConvertFactory();
		}
		return INSTANCE;
	}

	public List<BaseConvert> getConverts(String source) {
		List<BaseConvert> converts = new ArrayList<>();
		if (null != source && source.length() > 0) {
			String[] sources = source.split(",");
			if (null != sources && sources.length > 0) {
				for (int i = 0; i < sources.length; i++) {
					BaseConvert convert = new BaseConvert();
					convert = createConvert(sources[i]);
					if (null != convert) {
						converts.add(convert);
					}
				}
			}
		}
		return converts;
	}

	/**
	 * 生产Convert
	 * 
	 * @param string
	 * @return
	 */
	private BaseConvert createConvert(String string) {
		BaseConvert convert = null;
		if (null != string && string.length() > 0) {
			String className = getClassName(string);
			String param = string.toLowerCase();
			try {
				Class<?> cls = Class.forName(className);
				Method method = cls.getMethod("setmSource", String.class);
				Constructor<?> constructor = cls.getDeclaredConstructor();
				convert = (BaseConvert) constructor.newInstance();
				method.invoke(convert, param);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return convert;
	}

	/**
	 * 根据字符串获取全类名
	 * 
	 * @param string
	 * @return
	 */
	public String getClassName(String string) {
		String root = this.getClass().getPackage().getName();
		String firstUp = string.substring(0, 1).toUpperCase();
		String upString = firstUp + string.substring(1);
		String className = root + "." + upString + "Convert";
		return className;
	}
}
