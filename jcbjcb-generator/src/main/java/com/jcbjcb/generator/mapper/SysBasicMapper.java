package com.jcbjcb.generator.mapper;

import com.jcbjcb.tools.common.mapper.BaseMapper;
import com.jcbjcb.generator.entity.SysBasic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @description SysBasic数据层
 * @author  jcb
 * @since  2020-03-19 16:58:29
*/
@Mapper
@Repository
public interface SysBasicMapper extends BaseMapper<SysBasic> {

}
