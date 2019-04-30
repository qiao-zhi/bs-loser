package cn.qs.service.impl.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.math.FloatRange;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.common.LosePlan;
import cn.qs.bean.common.Video;
import cn.qs.mapper.common.LosePlanMapper;
import cn.qs.mapper.common.VideoMapper;
import cn.qs.service.user.RecommandService;

@Service
public class RecommandServiceImpl implements RecommandService {

	@Autowired
	private VideoMapper videoMapper;

	@Autowired
	private LosePlanMapper losePlanMapper;

	@Override
	public List<Video> getVideos(String body, Float bMI) {
		List<Video> videos = videoMapper.selectByExample(null);
		if (CollectionUtils.isEmpty(videos)) {
			return new ArrayList<Video>();
		}

		Iterator<Video> iterator = videos.iterator();
		while (iterator.hasNext()) {
			Video video = iterator.next();

			// 过滤基数
			String healthRadix = StringUtils.defaultString(video.getHealthRadix(), "*");
			if ("*".equals(healthRadix) || StringUtils.isBlank(healthRadix)) {
				continue;
			}

			String[] split = healthRadix.split("-");
			FloatRange floatRange = new FloatRange(Float.valueOf(split[0]), Float.valueOf(split[1]));
			if (!floatRange.containsFloat(bMI)) {
				iterator.remove();
			}

			// 过滤身体部位
			if ("*".equals(body) || "*".equals(video.getBodylocation())) {
				continue;
			}
			if (!body.equals(video.getBodylocation())) {
				iterator.remove();
			}
		}

		return videos;
	}

	@Override
	public List<LosePlan> getPlans(String body, Float bMI) {
		List<LosePlan> videos = losePlanMapper.selectByExample(null);
		if (CollectionUtils.isEmpty(videos)) {
			return new ArrayList<LosePlan>();
		}

		Iterator<LosePlan> iterator = videos.iterator();
		while (iterator.hasNext()) {
			LosePlan video = iterator.next();

			// 过滤基数
			String healthRadix = StringUtils.defaultString(video.getHealthRadix(), "*");
			if ("*".equals(healthRadix) || StringUtils.isBlank(healthRadix)) {
				continue;
			}

			String[] split = healthRadix.split("-");
			FloatRange floatRange = new FloatRange(Float.valueOf(split[0]), Float.valueOf(split[1]));
			if (!floatRange.containsFloat(bMI)) {
				iterator.remove();
			}

			// 过滤身体部位
			if ("*".equals(body) || "*".equals(video.getBodylocation())) {
				continue;
			}
			if (!body.equals(video.getBodylocation())) {
				iterator.remove();
			}
		}

		return videos;
	}

}
