/*
 * Copyright 2013 Ilya Gubarev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ilyagubarev.designpatterns.creational.prototype;

/**
 * Common implementation of supposed to be creation-expensive products family.
 *
 * @see Cloneable
 *
 * @version 1.02, 04 September 2013
 * @since 03 September 2013
 * @author Ilya Gubarev
 */
public abstract class Product implements Cloneable {

    private int _value;

    Product(int value) {
        expensiveOperation();
        _value = value;
    }

    /**
     * Gets a value of the product.
     *
     * @return a product value.
     */
    public int getValue() {
        return _value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private void expensiveOperation() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
