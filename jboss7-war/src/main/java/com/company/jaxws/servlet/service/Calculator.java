package com.company.jaxws.servlet.service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "CalculatorPort",
    targetNamespace = "http://service.servlet.jaxws.company.com")
public interface Calculator {

  @WebMethod
  public int add(@WebParam(name = "value1") int a,
      @WebParam(name = "value2") int b);
}
