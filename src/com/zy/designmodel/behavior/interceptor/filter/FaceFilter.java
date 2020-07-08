package com.zy.designmodel.behavior.interceptor.filter;

import com.zy.designmodel.behavior.interceptor.Filter;
import com.zy.designmodel.behavior.interceptor.http.Request;
import com.zy.designmodel.behavior.interceptor.http.Response;

public class FaceFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, ChainFilter chain) {
        String reqStr=request.getRequestStr();
        reqStr=reqStr.replace(":):", "^V^") + "----FaceFilter()";
        request.setRequestStr(reqStr);

        chain.doFilter(request, response, chain);

        String resStr=response.getRespondStr()+"---FaceFilter()";
        response.setRespondStr(resStr);
    }
}
