package com.company.jaxws.ejb.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.rmi.RemoteException;

@WebService(name = "RandomGeneratorPort",
    targetNamespace = "http://service.ejb.jaxws.aci.com")
public interface RandomGenerator extends java.rmi.Remote {

  @WebMethod(operationName = "randomInt1")
  public int randomInt() throws RemoteException;

  @WebMethod(operationName = "randomInt2")
  public int randomInt(@WebParam(name = "bound") int bound) throws RemoteException;
}
