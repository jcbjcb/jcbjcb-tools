package ${package};

import com.github.jcbjcb.tools.common.rest.IBaseApi;
import org.springframework.cloud.openfeign.FeignClient;

<#assign dateTime = .now>
/**
* @description ${tableClass.shortClassName}控制层
* @author  jcb
* @since  ${dateTime?string["yyyy-MM-dd HH:mm:ss"]}
*/
@FeignClient(value = "<#noparse>${</#noparse>${serverId}:${serverId}}",path = "${tableClass.variableName}")
public interface ${tableClass.shortClassName}${feignSuffix}<Entity> extends IBaseApi<Entity> {

}