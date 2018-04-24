package org.hinsteny.share.result;

import java.io.Serializable;

/**
 * base-result class
 *
 * @author Hinsteny
 * @version $ID: BaseResult 2018-04-11 10:11 All rights reserved.$
 */
public abstract class BaseResult implements Serializable {

    /**
     * 状态
     */
    private boolean success = false;

    /**
     * 结果码
     */
    private String resultCode;

    /**
     * 结果描述
     */
    private String resultDesc;

    public BaseResult(boolean success) {
        this.success = success;
    }

    public BaseResult(boolean success, String resultCode, String resultDesc) {
        this.success = success;
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "success=" + success +
                ", resultCode='" + resultCode + '\'' +
                ", resultDesc='" + resultDesc + '\'' +
                '}';
    }

}
