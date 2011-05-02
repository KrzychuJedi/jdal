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
package info.joseluismartin.gui.report;

import java.sql.Date;

import net.sf.jasperreports.engine.JRParameter;

/**
 * @author Jose A. Corbacho
 *
 */
public class JRPropertyEditorFactory {

	public ReportParameterEditor getParameterEditor(JRParameter parameter) {
		System.out.println("Creating editor for parameter " + parameter.getName() + " with class " + parameter.getValueClass().getName());
		System.out.println("Parameter value class: " + parameter.getValueClass().getName());
		System.out.println("Parameter value class canonical name: " + parameter.getValueClass().getCanonicalName());
		Class<?> valueClass = parameter.getValueClass();
		ReportParameterEditor editor = null;
		if (valueClass.getName().equals("java.lang.String"))
			editor = new ReportStringParameterEditor();
		else if (valueClass.getName().equals("java.lang.Integer"))
			editor = new ReportIntegerParameterEditor();
		else if (valueClass.getName().equals("java.lang.Long")) {
			editor = new ReportLongParameterEditor();
			System.out.println("Creando editor para LONG");
		
		}
		else if (valueClass.isAssignableFrom(Date.class)) {
			editor = new DateReportParameterEditor();
		}
			
		else editor = new DefaultReportParameterEditor(valueClass);
		
		return editor;
	}

}
