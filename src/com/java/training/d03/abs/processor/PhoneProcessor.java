package com.java.training.d03.abs.processor;

import com.java.training.d03.abs.AbstractProduct;
import com.java.training.d03.abs.Phone;

public class PhoneProcessor extends AbstractProductProcessor {

    @Override
    public void process(AbstractProduct product) {
        if (product instanceof Phone) {
            Phone phone = (Phone) product;
        }
    }
}
