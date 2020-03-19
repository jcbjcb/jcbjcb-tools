package com.github.jcbjcb.tools.common.rest;

import com.github.jcbjcb.tools.common.biz.BaseBiz;
import com.github.jcbjcb.tools.common.util.ObjectRestResponse;
import com.github.jcbjcb.tools.common.util.Query;
import com.github.jcbjcb.tools.common.util.TableRestResponse;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Slf4j
public class QueryBaseController<Biz extends BaseBiz,Entity> implements ISelectBasicApi<Entity>{
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected Biz baseBiz;

    @Override
    public ObjectRestResponse<Entity> get(@PathVariable int id){
        ObjectRestResponse<Entity> entityObjectRestResponse = new ObjectRestResponse<>();
        Object o = baseBiz.selectById(id);
        entityObjectRestResponse.setData((Entity)o);
        return entityObjectRestResponse;
    }

    @Override
    public List<Entity> all(){
        return baseBiz.selectListAll();
    }

    @Override
    public TableRestResponse<Entity> list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        PageInfo<Entity> pageInfo = baseBiz.selectByQuery(query);
        return new TableRestResponse<>(pageInfo.getList());
    }
}
