package cn.qs.bean.common;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 减肥视频(公共的)
 * 
 * @author QiaoLiQiang
 * @time 2019年4月22日下午9:46:47
 */
@Entity
public class Video {
	@Id
	private String id;

	private String oriname;

	private String path;

	private Date createtime;

	private String remark1;

	private String creatorusername;

	private Float filesize;

	private String bodylocation;// 适用于的身体位置

	private String healthRadix;// 适用于身体基数

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOriname() {
		return oriname;
	}

	public void setOriname(String oriname) {
		this.oriname = oriname;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getCreatorusername() {
		return creatorusername;
	}

	public void setCreatorusername(String creatorusername) {
		this.creatorusername = creatorusername;
	}

	public Float getFilesize() {
		return filesize;
	}

	public void setFilesize(Float filesize) {
		this.filesize = filesize;
	}

	public String getBodylocation() {
		return bodylocation;
	}

	public void setBodylocation(String bodylocation) {
		this.bodylocation = bodylocation;
	}

	public String getHealthRadix() {
		return healthRadix;
	}

	public void setHealthRadix(String healthRadix) {
		this.healthRadix = healthRadix;
	}
}