package com.zy.designmodel.behavior.interceptor.filter;

import com.zy.designmodel.behavior.interceptor.Filter;
import com.zy.designmodel.behavior.interceptor.http.Request;
import com.zy.designmodel.behavior.interceptor.http.Response;

public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, ChainFilter chain) {
        String str=request.getRequestStr();
        str=str.replace("被就业","就业").replace("敏感","")
                +" ---sensitiveFilter()";
        request.setRequestStr(str);

        chain.doFilter(request,response,chain);

        String responStr=response.getRespondStr()+"---sensitiveFilter()";
        response.setRespondStr(responStr);
    }
}
