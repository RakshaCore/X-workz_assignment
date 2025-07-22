package com.xworkz.xworkz.optional.external;

import java.util.Optional;

public class PersonDetail {

    public Optional<Long> getPhno(String name){

        if ("Roshan".equals(name)) {

            return Optional.ofNullable(91106764323L);
        }
        return Optional.empty();
    }

}
