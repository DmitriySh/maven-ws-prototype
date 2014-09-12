package com.company.jaxws.ejb.service;



import com.company.jaxws.ejb.service.RandomGenerator;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.concurrent.ThreadLocalRandom;

@Stateless
@WebService(portName = "RandomGeneratorPort",
    serviceName = "RandomGeneratorImpl",
    endpointInterface = "com.company.jaxws.ejb.service.RandomGenerator",
    targetNamespace = "http://service.ejb.jaxws.company.com")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@Remote(RandomGenerator.class)
public class RandomGeneratorService implements RandomGenerator {

  @Override
  public int randomInt() {
    return ThreadLocalRandom.current().nextInt();
  }

  @Override
  public int randomInt(int bound) {
    return ThreadLocalRandom.current().nextInt(bound);
  }
}
