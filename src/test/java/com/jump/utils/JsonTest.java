package com.jump.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.DigestUtils;

import com.jump.utils.JsonUtils;

public class JsonTest {

	public static void main(String[] args) {
		
		/*Map<String,Object> json = new HashMap<String,Object>();
		json.put("error", 0);
		json.put("url", "http:....");
		
		System.out.println(JsonUtils.objectToJson(json));*/
		
		System.out.println(DigestUtils.md5DigestAsHex("123".getBytes()));

	}

}
