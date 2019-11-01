package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
    @Bean    
    public IRule myRule()
    {
//    	return new  RoundRobinRule();
//         return new RandomRule();
//         return new BestAvailableRule();
         return new MyRuleImpl();
         
    }
}
