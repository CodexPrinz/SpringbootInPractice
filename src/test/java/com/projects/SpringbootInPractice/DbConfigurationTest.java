package com.projects.SpringbootInPractice;

import com.projects.SpringbootInPractice.config.DbConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DbConfigurationTest {

    @Autowired  DbConfiguration dbConfiguration;

    @Test
    public void testDbConfig(){
        System.out.println(dbConfiguration.toString());
    }
}
