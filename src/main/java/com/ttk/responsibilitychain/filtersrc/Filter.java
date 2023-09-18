package com.ttk.responsibilitychain.filtersrc;

/**
 * @Author TTK
 * @Description 模拟web过滤器Filter，属于是抽象处理者
 * @Version 1.0
 */
public interface Filter {
    public void doFilter(Request req,Response res,FilterChain c);
}
