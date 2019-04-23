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

	private String breakfast;// 早餐
	private Float breakfastheat;// 早餐热量
	private String lunch;// 午餐
	private Float lunchheat;// 午餐热量
	private String dinner;// 晚餐
	private Float dinnerheat;// 晚餐热量

	private Float sportnumber;// 运动时长
	private Integer stepnumber;// 步数
	private Integer stepsequence;// 同一天步数排名(定时任务去修改)

	private String recommendvider;// 推荐视频

	private String remark;

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

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getSportnumber() {
		return sportnumber;
	}

	public void setSportnumber(Float sportnumber) {
		this.sportnumber = sportnumber;
	}

	public Float getBreakfastheat() {
		return breakfastheat;
	}

	public void setBreakfastheat(Float breakfastheat) {
		this.breakfastheat = breakfastheat;
	}

	public Float getLunchheat() {
		return lunchheat;
	}

	public void setLunchheat(Float lunchheat) {
		this.lunchheat = lunchheat;
	}

	public Float getDinnerheat() {
		return dinnerheat;
	}

	public void setDinnerheat(Float dinnerheat) {
		this.dinnerheat = dinnerheat;
	}

	public String getRecommendvider() {
		return recommendvider;
	}

	public void setRecommendvider(String recommendvider) {
		this.recommendvider = recommendvider;
	}
}