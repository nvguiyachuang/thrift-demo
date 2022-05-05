package org.example;

import com.liyao.service.HelloService;
import org.apache.thrift.TException;
 
public class HelloServiceImpl implements HelloService.Iface {
    @Override
    public String helloString(String s) throws TException {
        return s + "xx";
    }
}