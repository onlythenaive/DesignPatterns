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
 * Alpha implementation of ExpensiveProduct.
 *
 * @see ExpensiveProduct
 *
 * @version 1.01, 03 September 2013
 * @since 03 September 2013
 * @author Ilya Gubarev
 */
public final class ProductAlpha implements ExpensiveProduct {

    /**
     * Creates a new instance of ProductAlpha.
     *
     * @param value a product value.
     * @return a new instance of ProductAlpha.
     */
    public static ProductAlpha create(String value) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new ProductAlpha(value);
    }

    private String _value;

    private ProductAlpha(String value) {
        _value = value;
    }

    @Override
    public String toString() {
        return String.format("[Alpha product: %s]", _value);
    }
}
