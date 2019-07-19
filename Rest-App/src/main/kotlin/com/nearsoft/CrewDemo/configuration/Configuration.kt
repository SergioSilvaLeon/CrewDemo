package com.nearsoft.CrewDemo.configuration

import com.nearsoft.CrewDemo.dao.RestDao
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {

    @Bean
    fun restDao(): RestDao {
        return RestDao()
    }


}