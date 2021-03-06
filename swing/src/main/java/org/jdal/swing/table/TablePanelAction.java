/*
 * Copyright 2008-2011 the original author or authors.
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
package org.jdal.swing.table;

import org.jdal.beans.MessageSourceWrapper;
import org.jdal.swing.action.BeanAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;


/**
 * Base class for TablePanel Actions
 * 
 * @author Jose Luis Martin - (jlm@joseluismartin.info)
 */
@SuppressWarnings("rawtypes")
public abstract class TablePanelAction extends BeanAction {

	private static final long serialVersionUID = 1L;
	private TablePanel tablePanel;
	protected MessageSourceWrapper messageSource = new MessageSourceWrapper();

	public void init() {
		
	}
	
	/**
	 * @return the tablePanel
	 */
	public TablePanel getTablePanel() {
		return tablePanel;
	}
	/**
	 * @param tablePanel the tablePanel to set
	 */
	public void setTablePanel(TablePanel tablePanel) {
		this.tablePanel = tablePanel;
	}
	
	/**
	 * @return the messageSource
	 */
	public MessageSource getMessageSource() {
		return messageSource.getMessageSource();
	}

	/**
	 * @param messageSource the messageSource to set
	 */
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource.setMessageSource(messageSource);
	}
}
