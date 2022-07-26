package com.fierte.web.entity.dashboard;

public class DashboardMain {

    private DashboardOrders orders;
    private TopSellingItems[] top_selling_items;
    private SalesReport[] sales_report;
    private PopularCategories[] popular_categories;
    private Overview[] overview;

    public DashboardMain(){}

    public DashboardMain(DashboardOrders orders, TopSellingItems[] top_selling_items, SalesReport[] sales_report, PopularCategories[] popular_categories, Overview[] overview) {
        this.orders = orders;
        this.top_selling_items = top_selling_items;
        this.sales_report = sales_report;
        this.popular_categories = popular_categories;
        this.overview = overview;
    }

    public DashboardOrders getOrders() {
        return orders;
    }

    public void setOrders(DashboardOrders orders) {
        this.orders = orders;
    }

    public TopSellingItems[] getTop_selling_items() {
        return top_selling_items;
    }

    public void setTop_selling_items(TopSellingItems[] top_selling_items) {
        this.top_selling_items = top_selling_items;
    }

    public SalesReport[] getSales_report() {
        return sales_report;
    }

    public void setSales_report(SalesReport[] sales_report) {
        this.sales_report = sales_report;
    }

    public PopularCategories[] getPopular_categories() {
        return popular_categories;
    }

    public void setPopular_categories(PopularCategories[] popular_categories) {
        this.popular_categories = popular_categories;
    }

    public Overview[] getOverview() {
        return overview;
    }

    public void setOverview(Overview[] overview) {
        this.overview = overview;
    }
}
