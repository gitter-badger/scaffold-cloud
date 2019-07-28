package com.cms.scaffold.micro.sys.api;

import com.cms.scaffold.common.base.ResponseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhang
 * 用于测试的API接口
 * 接口、实现分离
 */
public interface SysOperateApi {

    @RequestMapping(value = "/sysOperate/listOperates", method = RequestMethod.GET)
    ResponseModel listOperates(@RequestParam("pid") Long pid);
}
