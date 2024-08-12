package com.Poker.Mysql.Kyc.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="application_users")
public class ApplicationUserSourav {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="user_id")
	 private Integer userId;
	 
	 @Column(name ="app_id")
	 private Integer appId;
	 
	 @Column(name ="app_user_id")
	 private Integer appUserId;
	 
	 @Column(name ="email_id")
	 private String emailId;
	 
	 @Column(name ="user_name")
	 private String username;
	 
	 @Column(name ="mobile_num")
	 private String mobileNum;
	 
	  @Column(name ="is_kyc_verified")
	  private Boolean isKycVerified;
	  
	  @Column(name = "is_pan_verified")
	  private Boolean isPanVerified;
	  
	  @Column(name = "is_bank_verified")
	  private Boolean isBankVerified;
	  
	  @Column(name = "is_selfie_verified")
	  private Boolean isSelfieVerified;
	  
	  @Column(name = "is_selfie_mandatory")
	  private Boolean isSelfieMandatory;
	  
	  @Column(name = "added_on")
	  private Date addedOn;
	  
	  @Column(name = "modified_on")
	  private Date modifiedOn;
	  
	  
	public ApplicationUserSourav() {
		
	}


	public ApplicationUserSourav(int userId, Integer appId, Integer appUserId, String emailId, String username,
			String mobileNum, Boolean isKycVerified, Boolean isPanVerified, Boolean isBankVerified,
			Boolean isSelfieVerified, Boolean isSelfieMandatory, Date addedOn, Date modifiedOn) {
		
		this.userId = userId;
		this.appId = appId;
		this.appUserId = appUserId;
		this.emailId = emailId;
		this.username = username;
		this.mobileNum = mobileNum;
		this.isKycVerified = isKycVerified;
		this.isPanVerified = isPanVerified;
		this.isBankVerified = isBankVerified;
		this.isSelfieVerified = isSelfieVerified;
		this.isSelfieMandatory = isSelfieMandatory;
		this.addedOn = addedOn;
		this.modifiedOn = modifiedOn;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Integer getAppId() {
		return appId;
	}


	public void setAppId(Integer appId) {
		this.appId = appId;
	}


	public Integer getAppUserId() {
		return appUserId;
	}


	public void setAppUserId(Integer appUserId) {
		this.appUserId = appUserId;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getMobileNum() {
		return mobileNum;
	}


	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}


	public Boolean getIsKycVerified() {
		return isKycVerified;
	}


	public void setIsKycVerified(Boolean isKycVerified) {
		this.isKycVerified = isKycVerified;
	}


	public Boolean getIsPanVerified() {
		return isPanVerified;
	}


	public void setIsPanVerified(Boolean isPanVerified) {
		this.isPanVerified = isPanVerified;
	}


	public Boolean getIsBankVerified() {
		return isBankVerified;
	}


	public void setIsBankVerified(Boolean isBankVerified) {
		this.isBankVerified = isBankVerified;
	}


	public Boolean getIsSelfieVerified() {
		return isSelfieVerified;
	}


	public void setIsSelfieVerified(Boolean isSelfieVerified) {
		this.isSelfieVerified = isSelfieVerified;
	}


	public Boolean getIsSelfieMandatory() {
		return isSelfieMandatory;
	}


	public void setIsSelfieMandatory(Boolean isSelfieMandatory) {
		this.isSelfieMandatory = isSelfieMandatory;
	}


	public Date getAddedOn() {
		return addedOn;
	}


	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}


	public Date getModifiedOn() {
		return modifiedOn;
	}


	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	
	 
	  
	

}
