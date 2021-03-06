/*
 * Copyright 2009-2012 the original author or authors.
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
package org.jdal.vaadin.beans;

import org.jdal.beans.ListBeanDefinitionParser;
import org.jdal.beans.SimpleBeanDefinitionParser;
import org.jdal.vaadin.ui.action.ExitAction;
import org.jdal.vaadin.ui.action.NavigatorAction;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author Jose Luis Martin - (jlm@joseluismartin.info)
 *
 */
public class JdalVaadinNamespaceHandler extends NamespaceHandlerSupport {

	/**
	 * {@inheritDoc}
	 */
	public void init() {
		registerBeanDefinitionParser("defaults", new DefaultsBeanDefinitionParser());
		registerBeanDefinitionParser("table", new TableBeanDefinitionParser());
		registerBeanDefinitionParser("column", new ColumnBeanDefinitionParser());
		registerBeanDefinitionParser("editor", new EditorBeanDefinitionParser());
		registerBeanDefinitionParser("columns", new ListBeanDefinitionParser(BeanDefinition.SCOPE_PROTOTYPE));
		registerBeanDefinitionParser("actions", new ListBeanDefinitionParser(BeanDefinition.SCOPE_PROTOTYPE));
		registerBeanDefinitionParser("button-bar", new ButtonBarBeanDefinitionParser());
		registerBeanDefinitionParser("navigator-action", new SimpleBeanDefinitionParser(NavigatorAction.class));
		registerBeanDefinitionParser("exit-action", new SimpleBeanDefinitionParser(ExitAction.class));
	}

}

