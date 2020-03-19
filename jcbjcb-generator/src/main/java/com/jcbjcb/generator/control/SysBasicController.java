package com.jcbjcb.generator.control;

import com.jcbjcb.tools.common.rest.BaseController;
import com.jcbjcb.generator.biz.SysBasicBiz;
import com.jcbjcb.generator.entity.SysBasic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @description SysBasic控制层
* @author  jcb
* @since  2020-03-19 16:58:29
*/
@RestController
@RequestMapping("/sysBasic")
public class SysBasicController extends BaseController<SysBasicBiz, SysBasic> {

}
