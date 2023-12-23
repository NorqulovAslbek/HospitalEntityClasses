package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        HospitalEntity hospitalEntity=new HospitalEntity();
        hospitalEntity.setCode(UUID.randomUUID().toString());
        hospitalEntity.setName("AAA");
        hospitalEntity.setAddress("Toshkent");
        hospitalEntity.setErName("AAA");
        session.save(hospitalEntity);

        TransportEntity transportEntity=new TransportEntity();
        transportEntity.setHospitalEntity(hospitalEntity);
        transportEntity.setTransportType(TransportType.CAR);
        session.save(transportEntity);

        TransportEntity transportEntity1=new TransportEntity();
        transportEntity1.setHospitalEntity(hospitalEntity);
        transportEntity1.setTransportType(TransportType.HELICOPTER);
        session.save(transportEntity1);


        t.commit();

    }

}