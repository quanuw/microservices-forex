package com.springboot.microservice.forex.springbootmicroserviceforexservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue, Long> {
        ExchangeValue findByFromAndTo(String from, String to);
}
