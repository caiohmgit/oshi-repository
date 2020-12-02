

package com.mycompany.API;

import org.springframework.jdbc.core.JdbcTemplate;


public class ConexaoMySqlExec {
    
    public static void main(String[] args) {
        
        ConexaoMySql conexaoMySql = new ConexaoMySql();
        CPU cpu = new CPU();
        Disk disco = new Disk();
        RAM memoria = new RAM();
                
        JdbcTemplate con = new JdbcTemplate(conexaoMySql.getDatasource());
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Inserindo dados");
            con.update("insert into DadosMaquina values(null, ?, ?, ?)", cpu.getCurrentPercent(), disco.getDiskPercent(0), memoria.getCurrentPercent());
            
        }
        
    }

}
