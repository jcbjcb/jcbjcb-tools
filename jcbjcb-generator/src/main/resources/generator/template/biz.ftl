package ${package};

import com.jcbjcb.tools.common.biz.BaseBiz;
import ${package?substring(0,package?last_index_of('.'))}.mapper.${tableClass.shortClassName}${mapperSuffix};
import ${tableClass.fullClassName};
import org.springframework.stereotype.Service;

<#assign dateTime = .now>
/**
* @description ${tableClass.shortClassName}业务层
* @author  jcb
* @since  ${dateTime?string["yyyy-MM-dd HH:mm:ss"]}
*/
@Service
public class ${tableClass.shortClassName}${bizSuffix} extends BaseBiz<${tableClass.shortClassName}${mapperSuffix}, ${tableClass.shortClassName}> {

}
