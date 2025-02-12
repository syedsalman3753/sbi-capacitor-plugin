package io.mosip.sbi.capacitor.plugin.model;

public class ErrorDto {

    private String errorCode;
    private String errorInfo;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

	@Override
	public String toString() {
		return "ErrorDto [errorCode=" + errorCode + ", errorInfo=" + errorInfo + "]";
	}
}
