package com.homeinns.web.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NgTest {
	@Test
	public void f() {

	}

	@Test(
	// 在指定的时间内启用3个线程并发测试本方法10次
	threadPoolSize = 3, invocationCount = 10, timeOut = 10000,
	// 等待测试方法t0测试结束后开始本测试
	dependsOnMethods = { "f" },
	// 指定测试数据源CLASS和数据源名称（参考注解@DataProvider），返回几条数据会跑测试方法几次
	dataProvider = "generate", dataProviderClass = GeneratorRandomNum.class,
	// 分组名称
	groups = { "checkin-test" })
	// 读取配置文件中的参数，配置如上，用@Optional设置默认值
	@Parameters({ "Name" })
	public void f1(@Optional("name") String name) {

	}
}
