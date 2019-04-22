package cn.qs.bean.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 个人减肥计划
 * 
 * @author QiaoLiQiang
 * @time 2019年4月22日下午9:49:54
 */
@Entity
public class UserLosePlan {
	@Id
	private String id;

	private String creatorusername;// 创建者username
	private String plantitle;// 计划主题
	private String plancontent;// 计划内容
	private Date createtime;// 创建时间
	private Date plandate;// 计划日期

	private String hasfinished;// 是否结束

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatorusername() {
		return creatorusername;
	}

	public void setCreatorusername(String creatorusername) {
		this.creatorusername = creatorusername;
	}

	public String getPlantitle() {
		return plantitle;
	}

	public void setPlantitle(String plantitle) {
		this.plantitle = plantitle;
	}

	public String getPlancontent() {
		return plancontent;
	}

	public void setPlancontent(String plancontent) {
		this.plancontent = plancontent;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getPlandate() {
		return plandate;
	}

	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}

	public String getHasfinished() {
		return hasfinished;
	}

	public void setHasfinished(String hasfinished) {
		this.hasfinished = hasfinished;
	}

}
