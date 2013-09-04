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
package com.ilyagubarev.designpatterns.structural.composite;

/**
 * Abstract leaf component implementation.
 *
 * @see AbstractComponent
 *
 * @version 1.01, 04 September 2013
 * @since 04 September 2013
 * @author Ilya Gubarev
 */
public abstract class LeafComponent extends AbstractComponent {

    @Override
    public Iterable<Component> getChildren() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public void addChild(Component component) {
        throwNoChildrenException();
    }

    @Override
    public void removeChild(Component component) {
        throwNoChildrenException();
    }

    private void throwNoChildrenException() {
        throw new UnsupportedOperationException("leaf has no children");
    }
}
