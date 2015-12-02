package com.alimuya.frameplu.utils.ecrypt;

import org.junit.Assert;
import org.junit.Test;

public class EncryptUtilsTest {
	@Test
	public void testString(){
		String key="123dasda";
		String content="fadsaahiakjlfsejfkljsekll445456a";
		String eee = EncryptUtils.AESEncrypt(content, key);
		String newContent=EncryptUtils.AESDecode(eee, key);
		Assert.assertEquals(content, newContent);
	}
	
	
	@Test
	public void testMd5(){
		String content="fadsaahiakjlfsejfkljsekll445456a";
		String result = EncryptUtils.md5(content);
		Assert.assertEquals("59b859945404576ce812513572421654", result);
	}
	
	@Test
	public void testSha1(){
		String content="fadsaahiakjlfsejfkljsekll445456a";
		String result = EncryptUtils.sha1(content);
		Assert.assertEquals("5610dbf48252864317bad887822a18230462123e", result);
	}
}
