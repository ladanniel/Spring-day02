package cn.tedu.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ValueBean {
	private Integer age;
	private String name;
	private List<String> like;
	private Set<String> city;
	private Map<String,Object> map;
	private Properties prop;
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLike(List<String> like) {
		this.like = like;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "ValueBean [age=" + age + ", name=" + name + ", like=" + like + ", city=" + city + ", map=" + map
				+ ", prop=" + prop + "]";
	}
	
	
	

}
