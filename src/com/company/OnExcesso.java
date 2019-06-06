package com.company;

import java.util.Date;
import java.util.EventObject;

public class OnExcesso extends EventObject {
    public Date data;
    public OnExcesso(Object source, Date data) {
        super(source);
        this.data = data;
    }
}
