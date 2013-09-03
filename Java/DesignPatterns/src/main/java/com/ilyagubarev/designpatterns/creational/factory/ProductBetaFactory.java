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
package com.ilyagubarev.designpatterns.creational.factory;

/**
 * Concrete ProductBeta factory.
 *
 * @see Product
 * @see ProductFactory
 *
 * @version 1.01, 03 September 2013
 * @since 03 September 2013
 * @author Ilya Gubarev
 */
public final class ProductBetaFactory extends ProductFactory {

    private static ProductBetaFactory INSTANCE;

    /**
     * Gets a single instance of ProductBetaFactory.
     *
     * @return an instance of ProductBetaFactory.
     */
    public static ProductBetaFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProductBetaFactory();
        }
        return INSTANCE;
    }

    private ProductBetaFactory() {

    }

    @Override
    public Product create(String id) {
        return new ProductBeta(id);
    }    
}
