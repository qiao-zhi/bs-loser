package cn.qs.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 推荐信息
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("recommand")
public class RecommandController {
	private static final Logger logger = LoggerFactory.getLogger(RecommandController.class);
	private String baseFilePath = "recommand";
	
	
}
