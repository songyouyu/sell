package com.imooc.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 * Created by songyouyu on 2018/5/22
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 4506917780999541165L;

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;

}
