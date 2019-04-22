package cn.qs.bean.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserHealthInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String username;
	private String fullname;
	private String sex;
	private Float height;// 身高
	private Float weight;// 体重(单位是kg)
	private Integer age;
	private String job;// 工作
	private String healthinfo;// 健康
	private String sportinfo;// 运动状况
	private Float healthRadix;// 健康基数
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHealthinfo() {
		return healthinfo;
	}

	public void setHealthinfo(String healthinfo) {
		this.healthinfo = healthinfo;
	}

	public String getSportinfo() {
		return sportinfo;
	}

	public void setSportinfo(String sportinfo) {
		this.sportinfo = sportinfo;
	}

	public Float getHealthRadix() {
		return healthRadix;
	}

	public void setHealthRadix(Float healthRadix) {
		this.healthRadix = healthRadix;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}