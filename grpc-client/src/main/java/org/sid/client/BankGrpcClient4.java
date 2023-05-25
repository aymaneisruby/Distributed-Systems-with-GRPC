package org.sid.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.sid.stubs.Bank;
import org.sid.stubs.BankServiceGrpc;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class BankGrpcClient4 {
    public static void main(String[] args) throws IOException {

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();

        BankServiceGrpc.BankServiceStub asyncStub = BankServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrencyRequest request = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("USD")
                .setAmount(6500)
                .build();
        StreamObserver<Bank.ConvertCurrencyRequest> performstream =  asyncStub.performStream(new StreamObserver<Bank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Bank.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println("*********************");
                System.out.println(convertCurrencyResponse);
                System.out.println("*********************");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("END");
            }
        });

        Timer timer=new Timer();
        timer.schedule(new TimerTask()
        {
            int counter=0;
            @Override
            public void run()
            {
                Bank.ConvertCurrencyRequest currencyRequest= Bank.ConvertCurrencyRequest.newBuilder()
                        .setAmount(Math.random()*7000)
                        .build();
                performstream.onNext(currencyRequest);
                System.out.println("=================> Counter = "+counter);
                ++counter;
                if(counter==10){
                    performstream.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);

        System.out.println(".....♥");
        System.in.read();
    }
}
