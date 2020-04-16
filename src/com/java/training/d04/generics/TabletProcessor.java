package com.java.training.d04.generics;

import com.java.training.d03.product.Tablet;

import java.util.List;

public class TabletProcessor extends AbstractProductProcessor<Tablet> {

    @Override
    public void process(Tablet tablet) {

    }

    @Override
    public List<?> getElements() {
        return null;
    }
}
