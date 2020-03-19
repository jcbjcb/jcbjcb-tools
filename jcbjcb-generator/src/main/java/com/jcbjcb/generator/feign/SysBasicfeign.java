package com.jcbjcb.generator.feign;

import com.jcbjcb.tools.common.rest.IBaseApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
* @description SysBasic控制层
* @author  jcb
* @since  2020-03-19 16:58:29
*/
@FeignClient(value = "${artifactId}",path = "/sysBasic")
public interface SysBasicfeign<Entity> extends IBaseApi<Entity> {

}
