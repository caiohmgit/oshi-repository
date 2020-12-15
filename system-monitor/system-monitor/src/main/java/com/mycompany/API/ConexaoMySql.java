

package com.mycompany.API;

import org.apache.commons.dbcp2.BasicDataSource;


public class ConexaoMySql {
    
    private BasicDataSource datasource;

    public ConexaoMySql() {
        this.datasource = new BasicDataSource();

        this.datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        this.datasource.setUrl("jdbc:mysql://172.17.0.2:3306/machinetech");

        this.datasource.setUsername("root");

        this.datasource.setPassword("urubu100");
    }

    public BasicDataSource getDatasource() {
        return datasource;
    }

}
