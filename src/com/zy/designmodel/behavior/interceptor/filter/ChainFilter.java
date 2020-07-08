package com.zy.designmodel.behavior.interceptor.filter;

import com.zy.designmodel.behavior.interceptor.Filter;
import com.zy.designmodel.behavior.interceptor.http.Request;
import com.zy.designmodel.behavior.interceptor.http.Response;

import java.util.ArrayList;
import java.util.List;

public class ChainFilter implements Filter {

    private List<Filter> filters=new ArrayList<Filter>();

    int index=0;


    public void addFilter(Filter filter){
        filters.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response,ChainFilter chain) {
        if(index==filters.size()){
            //最终的业务执行流程
            System.out.println("request.str->"+request.getRequestStr());
            System.out.println("resopnse.str->"+response.getRespondStr());
            }
        Filter f=filters.get(index);
        index++;
        f.doFilter(request,response,chain);
    }

    public static void main(String args[]){
        //设定过滤规则，对msg字符串进行过滤处理
        String msg = ":):,<script>,敏感,被就业,网络授课";
        //设置str
        Request request=new Request();
        request.setRequestStr(msg);
        //设置str
        Response response=new Response();
        response.setRespondStr(msg);
        //添加Filter过滤器
        ChainFilter chainFilter=new ChainFilter();
        chainFilter.addFilter(new HTMLFilter());
        chainFilter.addFilter(new SensitiveFilter());
        chainFilter.addFilter(new FaceFilter());
        //执行过滤
        chainFilter.doFilter(request,response,chainFilter);
    }
}
