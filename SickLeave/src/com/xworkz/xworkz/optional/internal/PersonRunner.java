package com.xworkz.xworkz.optional.internal;

import com.xworkz.xworkz.optional.external.PersonDetail;

import java.util.Optional;

public class PersonRunner {

    public static void main(String[] args) {

        PersonDetail personDetail = new PersonDetail();

        Optional<Long> phnon = personDetail.getPhno("raksha");

        if (phnon.isPresent()){
            System.out.println("Element is"+personDetail.);
        }

    }


}
