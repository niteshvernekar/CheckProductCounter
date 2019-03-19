package com.checkoutcounter.handler;

import java.util.List;

/**
 * 
 */
public interface Handler<O,I> {
    O handle(I input);

    O handle(int id);

    List<O> handle();
}
