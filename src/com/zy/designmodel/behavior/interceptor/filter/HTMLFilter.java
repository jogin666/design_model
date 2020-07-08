package com.zy.designmodel.behavior.interceptor.filter;

import com.zy.designmodel.behavior.interceptor.Filter;
import com.zy.designmodel.behavior.interceptor.http.Request;
import com.zy.designmodel.behavior.interceptor.http.Response;

public class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, ChainFilter chain) {
        String str=request.getRequestStr();
        str=str.replace('<', '[')
                .replace('>', ']')+ "----HTMLFilter()";
        request.setRequestStr(str);

        chain.doFilter(request,response,chain);

        String resStr=response.getRespondStr()+"---HTMLFilter()";
        response.setRespondStr(resStr);
    }
}
