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
 * Unique and expensive-to-create product family. If such a product is
 * being cloned its identifier should be still unique.
 *
 * @see ExpensiveProduct
 *
 * @version 1.01, 03 September 2013
 * @since 03 September 2013
 * @author Ilya Gubarev
 */
public abstract class UniqueProduct implements ExpensiveProduct {

    /**
     * Generates a new UUID string to be used as a product identifier.
     *
     * @return a new UUID string.
     */
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    private String _id;

    /**
     * Creates a new instance of UniqueProduct.
     *
     * @param id a product identifier.
     */
    public UniqueProduct(String id) {
        _id = id;
    }

    /**
     * Gets an identifier of the product.
     *
     * @return a product identifier.
     */
    public String getId() {
        return _id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        UniqueProduct result = (UniqueProduct) super.clone();
        result._id = generateId();
        return result;
    }
}
