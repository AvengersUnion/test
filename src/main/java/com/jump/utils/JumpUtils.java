package com.jump.utils;

import java.util.ArrayList;
import java.util.List;



/**
 * jump得工具类
 * @author 567
 *
 */
public class JumpUtils {

	/**
	 * 把以，分割的String转化为List
	 * @param ids
	 * @return
	 */
	public static List<Integer> stringToList(String ids){
		
		String[] split = ids.split(",");
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : split) {
			idList.add(Integer.parseInt(id));
		}
		return idList;
	}
	
}
