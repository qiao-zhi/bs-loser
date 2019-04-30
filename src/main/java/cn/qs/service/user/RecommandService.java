package cn.qs.service.user;

import java.util.List;

import cn.qs.bean.common.LosePlan;
import cn.qs.bean.common.Video;

public interface RecommandService {

	List<Video> getVideos(String body, Float bMI);

	List<LosePlan> getPlans(String body, Float bMI);

}
