package com.example.basic.response;

import com.example.basic.utils.string.YazuoStringUtils;
import java.io.Serializable;
import lombok.Data;

/**
 * 响应对象
 *
 * @author lichunfeng
 */
@Data
public class RestResponse<T> implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4118386780685379201L;

    /**
     * 非异常调用栈索引位置
     */
    private static final int STACK_TRACE_ELEMENT_INX = 2;

    /**
     * 响应消息头
     */
    private RestResponseHeader header;

    /**
     * 响应消息体(泛型)
     */
    private T body = null;

    /**
     * 构造方法
     */
    public RestResponse() {
        super();
        this.header = new RestResponseHeader();
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param header 响应消息头
     * @param body 响应消息体(泛型)
     */
    public RestResponse(RestResponseHeader header, T body) {
        super();
        this.header = header;
        this.body = body;
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param header 响应消息头
     */
    public RestResponse(RestResponseHeader header) {
        super();
        this.header = header;
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param body 响应消息体(泛型)
     */
    public RestResponse(T body) {
        super();
        this.header = new RestResponseHeader();
        this.body = body;
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param code 状态码
     * @param message 状态描述
     */
    public RestResponse(String code, String message) {
        super();
        this.header = new RestResponseHeader(code, message);
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param code 状态码
     * @param message 状态描述
     * @param errTrace 异常堆栈信息
     */
    public RestResponse(String code, String message, String errTrace) {
        super();
        this.header = new RestResponseHeader(code, message, errTrace);
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param code 状态码
     * @param message 状态描述
     * @param errType 异常类型
     * @param errTrace 异常堆栈信息
     */
    public RestResponse(String code, String message, String errType, String errTrace) {
        super();
        this.header = new RestResponseHeader(code, message, errType, errTrace);
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param code 状态码
     * @param message 状态描述
     * @param subCode 二级状态码
     * @param subMessage 二级状态描述
     * @param errType 异常类型
     * @param errTrace 异常堆栈信息
     */
    public RestResponse(String code, String message, String subCode, String subMessage, String errType,
        String errTrace) {
        super();
        this.header = new RestResponseHeader(code, message, subCode, subMessage, errType, errTrace);
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 构造方法
     *
     * @param code 状态码
     * @param message 状态描述
     * @param body 响应消息体(泛型)
     */
    public RestResponse(String code, String message, T body) {
        super();
        this.header = new RestResponseHeader(code, message);
        this.body = body;
        makeStackTrace(Thread.currentThread().getStackTrace());
    }

    /**
     * 获取状态码
     *
     * @return 状态码
     */
    public String fetchCode() {
        return this.getHeader() != null ? this.getHeader().getCode() : null;
    }

    /**
     * 获取状态描述
     *
     * @return 状态描述
     */
    public String fetchMessage() {
        return this.getHeader() != null ? this.getHeader().getMessage() : null;
    }

    /**
     * 获取二级状态码
     *
     * @return 二级状态码
     */
    public String fetchSubCode() {
        return this.getHeader() != null ? this.getHeader().getSubCode() : null;
    }

    /**
     * 获取二级状态描述
     *
     * @return 二级状态描述
     */
    public String fetchSubMessage() {
        return this.getHeader() != null ? this.getHeader().getSubMessage() : null;
    }

    /**
     * 静态构造方法，处理成功
     */
    public static <T> RestResponse<T> success() {
        return new RestResponse<T>();
    }

    /**
     * 静态构造方法，处理成功
     *
     * @param body 响应消息体(泛型)
     */
    public static <T> RestResponse<T> success(T body) {
        return new RestResponse<T>(body);
    }

    /**
     * Code静态构造方法
     *
     * @param code 响应消息体(泛型)
     */
    public static <T> RestResponse<T> buildWithCode(String code) {
        RestResponse<T> rr = new RestResponse<T>(code, null);
        rr.makeStackTrace(Thread.currentThread().getStackTrace());
        return rr;
    }

    /**
     * 设置状态码
     *
     * @param code 状态码
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withCode(String code) {
        this.header.setCode(code);
        return this;
    }

    /**
     * 设置状态描述
     *
     * @param message 状态描述
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withMessage(String message) {
        this.header.setMessage(message);
        return this;
    }

    /**
     * 设置状态描述
     *
     * @param messagePattern 状态描述
     * @param argArray 替换参数
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withMessage(String messagePattern, Object... argArray) {
        this.header.setMessage(YazuoStringUtils.formatMessage(messagePattern, argArray));
        return this;
    }

    /**
     * 设置二级状态码
     *
     * @param subCode 二级状态码
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withSubCode(String subCode) {
        this.header.setSubCode(subCode);
        return this;
    }

    /**
     * 设置二级状态描述
     *
     * @param subMessage 二级状态描述
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withSubMessage(String subMessage) {
        this.header.setSubMessage(subMessage);
        return this;
    }

    /**
     * 设置二级状态描述
     *
     * @param subMessagePattern 二级状态描述
     * @param argArray 替换参数
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withSubMessage(String subMessagePattern, Object... argArray) {
        this.header.setSubMessage(YazuoStringUtils.formatMessage(subMessagePattern, argArray));
        return this;
    }

    /**
     * 设置异常类型
     *
     * @param errType 异常类型
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withErrType(String errType) {
        this.header.setType(errType);
        return this;
    }

    /**
     * 设置异常堆栈信息
     *
     * @param errTrace 异常堆栈信息
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withErrTrace(String errTrace) {
        this.header.setErrTrace(errTrace);
        return this;
    }

    /**
     * 设置响应消息体(泛型)
     *
     * @param body 响应消息体(泛型)
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withBody(T body) {
        this.body = body;
        return this;
    }

    /**
     * 设置响应消息体(泛型)
     *
     * @param stackTraceElements 调用栈
     */
    @SuppressWarnings("rawtypes")
    public RestResponse withStackTraceElements(StackTraceElement[] stackTraceElements) {
        this.header.setStackTraceElements(stackTraceElements);
        return this;
    }

    /**
     * 获取非异常调用栈元素
     *
     * @param stackTraceElements 调用栈列表
     */
    private void makeStackTrace(StackTraceElement[] stackTraceElements) {
        if (stackTraceElements != null && stackTraceElements.length > 1) {
            this.header.setStackTraceElements(new StackTraceElement[]{stackTraceElements[STACK_TRACE_ELEMENT_INX]});
        }
    }
}
