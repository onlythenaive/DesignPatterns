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

import java.util.UUID;

/**
 * Products service class.
 *
 * @version 1.01, 03 September 2013
 * @since 03 September 2013
 * @author Ilya Gubarev
 */
public final class ProductsHelper {

    /**
     * Creates a new instance of Product and emulates an expensive operation.
     *
     * @param value a product value.
     * @param unique true if an unique product is needed.
     * @return a new instance of Product.
     */
    public static Product createProduct(int value, boolean unique) {
        Product result;
        if (unique) {
            result = new ConcreteUniqueProduct(generateId(), value);
        } else {
            result = new ConcreteProduct(value);
        }
        delay();
        return result;
    }

    static String generateId() {
        return UUID.randomUUID().toString();
    }

    private static void delay() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private ProductsHelper() {

    }
}
