package io.mosip.sbi.capacitor.plugin.model;

public class CaptureDto {

	private String digitalId;
	private String bioType;
	private String deviceCode;
	private String deviceServiceVersion;
	private String bioSubType;
	private String purpose;
	private String env;
	private String bioValue;
	private String domainUri;
	private String transactionId;
	private String timestamp;
	private String requestedScore;
	private float qualityScore;

	public String getDomainUri() {
		return domainUri;
	}

	public void setDomainUri(String domainUri) {
		this.domainUri = domainUri;
	}

	public String getDigitalId() {
		return digitalId;
	}

	public void setDigitalId(String digitalId) {
		this.digitalId = digitalId;
	}

	public String getBioType() {
		return bioType;
	}

	public void setBioType(String bioType) {
		this.bioType = bioType;
	}

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getDeviceServiceVersion() {
		return deviceServiceVersion;
	}

	public void setDeviceServiceVersion(String deviceServiceVersion) {
		this.deviceServiceVersion = deviceServiceVersion;
	}

	public String getBioSubType() {
		return bioSubType;
	}

	public void setBioSubType(String bioSubType) {
		this.bioSubType = bioSubType;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getBioValue() {
		return bioValue;
	}

	public void setBioValue(String bioValue) {
		this.bioValue = bioValue;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getRequestedScore() {
		return requestedScore;
	}

	public void setRequestedScore(String requestedScore) {
		this.requestedScore = requestedScore;
	}

	public float getQualityScore() {
		return qualityScore;
	}

	public void setQualityScore(float qualityScore) {
		this.qualityScore = qualityScore;
	}

	@Override
	public String toString() {
		return "CaptureDto [digitalId=" + digitalId + ", bioType=" + bioType + ", deviceCode=" + deviceCode
				+ ", deviceServiceVersion=" + deviceServiceVersion + ", bioSubType=" + bioSubType + ", purpose="
				+ purpose + ", env=" + env + ", domainUri=" + domainUri + ", transactionId=" + transactionId
				+ ", timestamp=" + timestamp + ", requestedScore=" + requestedScore + ", qualityScore=" + qualityScore
				+ "]";
	}
}
