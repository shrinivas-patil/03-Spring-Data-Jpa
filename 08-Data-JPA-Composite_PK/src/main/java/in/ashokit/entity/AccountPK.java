package in.ashokit.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable //this is used for which class is having more than one primary key variables
public class AccountPK implements Serializable{
	
	private Integer accId;
	private String accType;
	private Long accNum;
	
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Long getAccNum() {
		return accNum;
	}
	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}
	@Override
	public String toString() {
		return "AccountPK [accId=" + accId + ", accType=" + accType + ", accNum=" + accNum + "]";
	}
	
	

}
