package com.example.customnaming;

import org.jvnet.hyperjaxb3.ejb.strategy.mapping.Mapping;
import org.jvnet.hyperjaxb3.ejb.strategy.naming.impl.DefaultNaming;

public class CustomNaming extends DefaultNaming {

    @Override
    public String getName(Mapping context, final String draftName) {
        throw new RuntimeException();
//        String name = super.getName(context, draftName);
//        if (name.endsWith("_")) {
//            return name.replace("_", "") + "_";
//        } else {
//            return name.replace("_", "");
//        }
    }
}
