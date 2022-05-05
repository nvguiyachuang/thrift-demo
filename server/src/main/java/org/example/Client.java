package org.example;

import com.liyao.service.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {
    public static void main(String[] args) {
        System.out.println("客户端启动....");
        try (TTransport transport = new TSocket("localhost", 50005)) {
            TProtocol protocol = new TBinaryProtocol(transport);
            HelloService.Client client = new HelloService.Client(protocol);
            transport.open();
            String result = client.helloString("liyao");
            System.out.println(result);
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}