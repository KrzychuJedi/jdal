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
package org.jdal.swing.report;


import javax.swing.JComboBox;
import javax.swing.JComponent;

import org.jdal.reporting.ReportType;
import org.jdal.swing.AbstractView;
import org.jdal.swing.form.BoxFormBuilder;
import org.jdal.swing.form.FormUtils;

/**
 * @author Jose A. Corbacho
 *
 */
public class ReportTypeView extends AbstractView<ReportType>{

	private JComboBox type = FormUtils.newCombo(25);
	
	
	public ReportTypeView(){
		this(new ReportType());
	}
	
	public ReportTypeView(ReportType model){
		setModel(model);
	}
	
	public void init(){
		bind(type, "name");
		doRefresh();
	}
	
	@Override
	protected JComponent buildPanel() {
		// Build Form
		BoxFormBuilder b = new BoxFormBuilder();
		
		b.add("Tipo: ", type);
		
		return b.getForm();
	}
	
	public JComboBox getType(){
		return type;
	}
}
