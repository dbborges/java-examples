package xstreamXmlToObject;

import java.util.Date;

public class Client {

	private String name;
	private int code;
	private Date birthDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", code=" + code + ", birthDate=" + birthDate + "]";
	}
}