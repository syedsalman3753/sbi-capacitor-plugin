package io.mosip.sbi.capacitor.plugin.model;

import io.mosip.sbi.capacitor.plugin.model.ErrorDto;

public class CaptureRespDetail {

	private String specVersion;

	private String thumbprint;

	private String sessionKey;

	public String getSpecVersion() {
		return specVersion;
	}

	public void setThumbprint(String thumbprint) {
		this.thumbprint = thumbprint;
	}

	public String getThumbprint() {
		return thumbprint;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSpecVersion(String specVersion) {
		this.specVersion = specVersion;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

	private String data;
	private String hash;
	private ErrorDto error;

	public CaptureRespDetail() {
	}

	public CaptureRespDetail(String specVersion, String data, String hash, ErrorDto error) {
		this.specVersion = specVersion;
		this.data = data;
		this.hash = hash;
		this.error = error;
	}

	@Override
	public String toString() {
		return "CaptureRespDetail [specVersion=" + specVersion + ", data=" + data + ", hash="  + hash + ", sessionKey=" + sessionKey  + ", thumbprint=" + thumbprint + ", error="
				+ error + "]";
	}

}
