package com.company.jaxws.servlet.service;

import javax.jws.WebService;

@WebService(serviceName = "CalculatorImpl", portName = "CalculatorPort",
    endpointInterface = "com.company.jaxws.servlet.service.Calculator",
    targetNamespace = "http://service.servlet.jaxws.company.com")
public class CalculatorService implements Calculator {

  @Override
  public int add(int a, int b) {
    return a + b;

  }
}
