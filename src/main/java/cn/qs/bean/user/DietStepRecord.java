package cn.qs.bean.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 饮食和运动记录表
 * 
 * @author QiaoLiQiang
 * @time 2019年4月22日下午10:25:21
 */
@Entity
public class DietStepRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String creatorusername;

	private String diets;// 饮食
	private String dietsheat;// 摄入热量

	private String sports;// 运动信息
	private String sportsheat;// 消耗热量

	private Integer stepnumber;// 步数
	private Integer stepsequence;// 同一天步数排名(定时任务去修改)

	private String recommendvideo;// 推荐视频
	private String remark;//用作日期字段

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreatorusername() {
		return creatorusername;
	}

	public void setCreatorusername(String creatorusername) {
		this.creatorusername = creatorusername;
	}

	public String getDiets() {
		return diets;
	}

	public void setDiets(String diets) {
		this.diets = diets;
	}

	public String getDietsheat() {
		return dietsheat;
	}

	public void setDietsheat(String dietsheat) {
		this.dietsheat = dietsheat;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getSportsheat() {
		return sportsheat;
	}

	public void setSportsheat(String sportsheat) {
		this.sportsheat = sportsheat;
	}

	public Integer getStepnumber() {
		return stepnumber;
	}

	public void setStepnumber(Integer stepnumber) {
		this.stepnumber = stepnumber;
	}

	public Integer getStepsequence() {
		return stepsequence;
	}

	public void setStepsequence(Integer stepsequence) {
		this.stepsequence = stepsequence;
	}

	public String getRecommendvideo() {
		return recommendvideo;
	}

	public void setRecommendvideo(String recommendvideo) {
		this.recommendvideo = recommendvideo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "DietStepRecord [id=" + id + ", creatorusername=" + creatorusername + ", diets=" + diets + ", dietsheat="
				+ dietsheat + ", sports=" + sports + ", sportsheat=" + sportsheat + ", stepnumber=" + stepnumber
				+ ", stepsequence=" + stepsequence + ", recommendvideo=" + recommendvideo + ", remark=" + remark + "]";
	}

}