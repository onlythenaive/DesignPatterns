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
 * Component interface.
 *
 * @version 1.01, 04 September 2013
 * @since 04 September 2013
 * @author Ilya Gubarev
 */
public interface Component {

    /**
     * Gets all the children components.
     * 
     * @return children components.
     */
    Iterable<Component> getChildren();

    /**
     * Gets a parent component.
     *
     * @return parent component.
     */
    Component getParent();

    /**
     * Checks if the component has no children.
     *
     * @return true if the component has no children.
     */
    boolean isLeaf();

    /**
     * Checks if the component has no parent.
     *
     * @return true if the component has no parent.
     */
    boolean isRoot();

    /**
     * Adds specified component to the children.
     *
     * @param component a component to add.
     */
    void addChild(Component component);

    /**
     * Removes specified component from the children.
     *
     * @param component a child component.
     */
    void removeChild(Component component);

    /**
     * Component operation.
     */
    void operation();
}
