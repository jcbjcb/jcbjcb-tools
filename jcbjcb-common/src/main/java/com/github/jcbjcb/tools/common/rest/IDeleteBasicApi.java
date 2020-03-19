package com.github.jcbjcb.tools.common.rest;

import com.github.jcbjcb.tools.common.util.ObjectRestResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jcb on 2020-03-19 10:30
 */
public interface IDeleteBasicApi<Entity> {

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    ObjectRestResponse<Entity> remove(@PathVariable int id);
}
