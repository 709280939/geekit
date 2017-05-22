package com.base.dao;

public class DataSourceHolder {

    /**
     * @author wull
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static String getCurrentDataSource() {
        return (String) contextHolder.get();
    }

    public static void setDataSource(String dataSource) {
        contextHolder.set(dataSource);
    }

    public static void setDefaultDataSource() {
        contextHolder.set(null);
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }

}
