package com.wulian.common;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import net.sf.json.JSONObject;

public class ReturnString {
	
	public static InputStream ErrortoJson(String cause)
	{
		InputStream inputStream = null;
		JSONObject json = new JSONObject();
		json.put(ComConst.Flag, 0);
		json.put(ComConst.Result, cause);
		try {
			inputStream = new ByteArrayInputStream((json.toString()).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputStream;
	}
	
	public static InputStream RighttoJson(String cause)
	{
		InputStream inputStream = null;
		JSONObject json = new JSONObject();
		json.put(ComConst.Flag, 1);
		json.put(ComConst.Result, cause);
		try {
			inputStream = new ByteArrayInputStream((json.toString()).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputStream;
	}
}
