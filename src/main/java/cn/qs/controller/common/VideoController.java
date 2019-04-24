package cn.qs.controller.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.common.Video;
import cn.qs.service.common.VideoService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.FileHandleUtil;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.SystemUtils;
import cn.qs.utils.UUIDUtil;
import cn.qs.utils.ValidateCheck;

/**
 * 减肥套餐管理
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("video")
public class VideoController {
	private static final Logger logger = LoggerFactory.getLogger(VideoController.class);
	private String baseFilePath = "video";

	@Autowired
	private VideoService videoService;

	/**
	 * 跳转到显示列表
	 * 
	 * @return
	 */
	@RequestMapping("list")
	public String list() {
		return baseFilePath + "/list";
	}

	/**
	 * 跳转到添加列表
	 * 
	 * @return
	 */
	@RequestMapping("/add")
	public String add(ModelMap map) {
		map.put("bodys", DefaultValue.BODY_LOCATIONS);
		map.put("bmis", DefaultValue.BMI_VALUES);

		return baseFilePath + "/add";
	}

	@RequestMapping("/doAdd")
	@ResponseBody
	public JSONResultUtil<String> doAdd(MultipartFile file, Video video, HttpServletRequest request) {
		if (file == null) {
			return JSONResultUtil.error("文件接收失败");
		}
		logger.debug("file -> {},viewId ->{}", file.getOriginalFilename());

		String fileOriName = file.getOriginalFilename();// 获取原名称
		String fileNowName = UUIDUtil.getUUID2() + "." + FilenameUtils.getExtension(fileOriName);// 生成唯一的名字
		try {
			FileHandleUtil.uploadSpringMVCFile(file, fileNowName);

		} catch (Exception e) {
			logger.error("uploadPicture error", e);
			return JSONResultUtil.error("文件接收失败");
		}

		String id = UUIDUtil.getUUID();
		video.setCreatetime(new Date());
		video.setCreatorusername(SystemUtils.getLoginUsername(request));
		video.setId(id);
		video.setFilesize((float) file.getSize());
		video.setOriname(fileOriName);
		video.setPath(fileNowName);

		videoService.add(video);

		return JSONResultUtil.ok();
	}

	@RequestMapping("pages")
	@ResponseBody
	public PageInfo<Video> pages(@RequestParam Map condition) {
		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<Video> videos = new ArrayList<Video>();
		try {
			videos = videoService.listByCondition(condition);
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}
		PageInfo<Video> pageInfo = new PageInfo<Video>(videos);

		return pageInfo;
	}

	@RequestMapping("delete")
	@ResponseBody
	public JSONResultUtil delete(String id) {
		videoService.delete(id);
		return JSONResultUtil.ok();
	}

	@RequestMapping("update")
	public String update(String id, ModelMap map, HttpServletRequest request) {
		Video video = videoService.findById(id);
		map.addAttribute("video", video);
		map.put("bodys", DefaultValue.BODY_LOCATIONS);
		map.put("bmis", DefaultValue.BMI_VALUES);

		return baseFilePath + "/update";
	}

	@RequestMapping("doUpdate")
	@ResponseBody
	public JSONResultUtil doUpdate(Video plan) {
		videoService.update(plan);
		return JSONResultUtil.ok();
	}

	@RequestMapping("watchVideo")
	public String watchVideo(String path, ModelMap map) {
		map.put("path", path);
		return baseFilePath + "/watchVideo";
	}
}
