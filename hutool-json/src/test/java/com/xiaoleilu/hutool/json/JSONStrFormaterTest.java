package com.xiaoleilu.hutool.json;

import org.junit.Assert;
import org.junit.Test;

/**
 * JSON字符串格式化单元测试
 * @author looly
 *
 */
public class JSONStrFormaterTest {

	@Test
	public void formatTest() {
		String json = "{'age':23,'aihao':['pashan','movies'],'name':{'firstName':'zhang','lastName':'san','aihao':['pashan','movies','name':{'firstName':'zhang','lastName':'san','aihao':['pashan','movies']}]}}";
		String result = JSONStrFormater.format(json);
		Assert.assertNotNull(result);
	}
}
