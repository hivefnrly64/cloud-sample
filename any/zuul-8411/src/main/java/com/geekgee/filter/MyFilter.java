package com.geekgee.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/***
 **  @author : Chata
 **  @description : 
 **  @date : 2019/5/4 05:21
 ***/
@Component
public class MyFilter extends ZuulFilter {

    /**
       pre：路由之前
       routing：路由之时
       post： 路由之后
       error：发送错误调用
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext c = RequestContext.getCurrentContext();
        HttpServletRequest request = c.getRequest();
        String token = request.getParameter("token");
        if(null==token){
            c.setSendZuulResponse(false);
            c.setResponseStatusCode(233);
            try {
                c.getResponse().getWriter().write("you don't have token");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
