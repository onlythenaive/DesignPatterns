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
package com.ilyagubarev.designpatterns.creational.builder;

/**
 * Concrete builder for ProductAlpha.
 *
 * @see ProductBuilder
 *
 * @version 1.01, 03 September 2013
 * @since 03 September 2013
 * @author Ilya Gubarev
 */
public final class ProductAlphaBuilder implements ProductBuilder {

    private Integer _x;
    private Integer _y;
    private Integer _z;    

    @Override
    public Product getProduct() {
        StringBuilder code = new StringBuilder();
        code.append(_x != null ? "X" + _x : "");
        code.append(_y != null ? "Y" + _y : "");
        code.append(_z != null ? "Z" + _z : "");
        return new ProductAlpha(code.toString());
    }

    @Override
    public void setMarkX(int x) {
        _x = x;
    }

    @Override
    public void setMarkY(int y) {
        _y = y;
    }

    @Override
    public void setMarkZ(int z) {
        _z = z;
    }
}
