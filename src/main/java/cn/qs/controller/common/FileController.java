package cn.qs.controller.common;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.utils.FileHandleUtil;

/**
 * 文件controller
 * 
 * @author Administrator
 *
 */
@Controller
public class FileController {
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);

	/**
	 * 根据文件路径请求文件
	 * 
	 * @param request
	 * @param response
	 * @param path
	 */
	@RequestMapping("/file")
	public void getFile(HttpServletRequest request, HttpServletResponse response, String path) {
		FileInputStream in = null;
		ServletOutputStream outputStream = null;
		try {
			File fileByName = FileHandleUtil.getFileByName(path);
			in = new FileInputStream(fileByName);
			outputStream = response.getOutputStream();
			IOUtils.copyLarge(in, outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(in);
			IOUtils.closeQuietly(outputStream);
		}
	}
}
