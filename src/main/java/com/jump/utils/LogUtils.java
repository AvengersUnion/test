package com.jump.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;

/**
 * log4j得工具类
 * @author 567
 *
 */
public class LogUtils {

	private static Logger logger = Logger.getLogger("log4j.properties");
	
	/**
	 * 将异常输出到error日志中
	 * @param e 发生的异常
	 */
	public static void writeExceptiontoFile(Throwable e){
		
		//构建一个流
		StringWriter stringWriter= new StringWriter();
        PrintWriter writer= new PrintWriter(stringWriter);
        //把异常输入流中
        e.printStackTrace(writer);
        //过去异常
        StringBuffer buffer= stringWriter.getBuffer();
        //写入日志文件
        logger.error(buffer.toString());
        //关闭流
        writer.close();
        try {
			stringWriter.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
