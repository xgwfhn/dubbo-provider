package dubbo.common;

import java.io.Serializable;

public class UserInfoExcepiton extends Exception implements Serializable  {
	private String msg;
	private String code;
	public UserInfoExcepiton(String msg,String code){
		this.msg=msg;
		this.code=code;
	}
	public UserInfoExcepiton(){
		
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
