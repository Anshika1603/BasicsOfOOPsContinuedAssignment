package com.knoldus.Question5;
class SalesPerson
{
    int monthlySales;
    int QuarterlySales;
    int yearlySales;
    SalesPerson(int monthlySales, int quarterlySales, int yearlySales){
        this.monthlySales=monthlySales;
        this.QuarterlySales=quarterlySales;
        this.yearlySales=yearlySales;
    }
    int getTotalSales()
    {
        return monthlySales+QuarterlySales+yearlySales;
    }
}
public class SalesAnalysisTool {

    // Aggregation
    SalesPerson salesPerson;
    SalesAnalysisTool(SalesPerson salesPerson)
    {
        this.salesPerson=salesPerson;
    }
    public static void main(String[] args) {
        SalesPerson salesPerson1=new SalesPerson(50,100,200);
        SalesAnalysisTool salesAnalysisTool=new SalesAnalysisTool(salesPerson1);
        System.out.println("The total sales made by Salesperson 1: "+salesAnalysisTool.salesPerson.getTotalSales());
    }
}

