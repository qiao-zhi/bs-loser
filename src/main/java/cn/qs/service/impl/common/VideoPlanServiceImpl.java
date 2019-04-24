package cn.qs.service.impl.common;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.common.Video;
import cn.qs.bean.common.VideoExample;
import cn.qs.bean.common.VideoExample.Criteria;
import cn.qs.mapper.common.VideoMapper;
import cn.qs.service.common.VideoService;

@Service
public class VideoPlanServiceImpl implements VideoService {

	@Autowired
	private VideoMapper videoMapper;

	@Override
	public void add(Video t) {
		videoMapper.insert(t);
	}

	@Override
	public void delete(String id) {
		videoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Video findById(String id) {
		return videoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Video> listByCondition(Map condition) {
		VideoExample example = new VideoExample();
		Criteria criteria = example.createCriteria();

		return videoMapper.selectByExample(example);
	}

	@Override
	public void update(Video t) {
		videoMapper.updateByPrimaryKeySelective(t);
	}
}
