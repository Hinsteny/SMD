package org.hinsteny.share.result;

/**
 * @author Hinsteny
 * @version $ID: CommonResult 2018-04-11 10:13 All rights reserved.$
 */
public class CommonResult<T> extends BaseResult {

    private T result;

    public CommonResult(boolean success) {
        super(success);
    }

    public T getResult() {
        return result;
    }

    public CommonResult<T> setResult(T result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "result=" + result +
                "} " + super.toString();
    }
}
