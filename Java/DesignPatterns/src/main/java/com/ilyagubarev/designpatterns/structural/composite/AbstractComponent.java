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
 * Abstract component implementation.
 *
 * @see Component
 *
 * @version 1.01, 04 September 2013
 * @since 04 September 2013
 * @author Ilya Gubarev
 */
public abstract class AbstractComponent implements Component {

    private Component _parent;

    @Override
    public Component getParent() {
        return _parent;
    }

    @Override
    public boolean isRoot() {
        return _parent == null;
    }

    void setParent(Component component) {
        _parent = component;
    }
}
