package com.zy.designmodel.behavior.interceptor;

import com.zy.designmodel.behavior.interceptor.filter.ChainFilter;
import com.zy.designmodel.behavior.interceptor.http.Request;
import com.zy.designmodel.behavior.interceptor.http.Response;

public interface Filter {

    void doFilter(Request request, Response response, ChainFilter chain);
}
