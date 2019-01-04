package com.dongzj.cache.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/23
 * Time: 17:39
 */
@Getter
@Setter
public class ResultVo implements Serializable {

    private static final long serialVersionUID = 5725515340638751462L;

    private boolean success;

    private String msg;

    private Object data;

    public static ResultVo fail(String msg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(false);
        resultVo.setMsg(msg);
        return resultVo;
    }

    public static ResultVo success(Object data) {
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(true);
        resultVo.setData(data);
        return resultVo;
    }
}
