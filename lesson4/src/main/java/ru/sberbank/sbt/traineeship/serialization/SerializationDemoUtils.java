package ru.sberbank.sbt.traineeship.serialization;

import java.util.Date;

/**
 * Created by ����� on 10.04.2016.
 */
public class SerializationDemoUtils {
    public static Person createPerson() {
        Person person = new Person();
        person.setFirstName("������");
        person.setMiddleName("����");
        person.setLastName("��������");
        person.setBirthDate(new Date());
        person.setGender(Person.Gender.MALE);
        Address address = new Address();
        address.setCity("����");
        address.setStreet("��������");
        person.setAddress(address);
        return person;
    }
}
