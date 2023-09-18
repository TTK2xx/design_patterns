package com.ttk.responsibilitychain.filtersrc;

/**
 * @Author TTK
 * @Description 模拟实现具体过滤器
 * @Version 1.0
 */
public class FirstFilter implements Filter {
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("过滤器1 前置处理");

        // 先执行所有request再倒序执行所有response
        chain.doFilter(req, res);

        System.out.println("过滤器1 后置处理");
    }
}
