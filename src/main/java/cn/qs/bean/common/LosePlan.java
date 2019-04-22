package cn.qs.bean.common;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 公共的减肥方案表(套餐)
 * 
 * @author QiaoLiQiang
 * @time 2019年4月22日下午10:40:15
 */
@Entity
public class LosePlan {
	@Id
	private String id;

	private String creatorusername;// 创建者username
	private String plantitle;// 方案主题
	private String plancontent;// 方案内容
	private Date createtime;// 创建时间

	private String bodylocation;// 适用于的身体位置
	private String healthRadix;// 适用于身体基数

	private String remark;

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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}