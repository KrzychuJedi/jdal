/*
 * Copyright 2010-2015 Jose Luis Martin.
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
package org.jdal.ui.bind;

/**
 * Interface for Binder Factories
 * 
 * @author Jose Luis Martin
 * @since 1.1
 */
public interface BinderFactory  {
	
	/**
	 * Try to find a binder for a control Class, use super Class if none is configured.
	 * @param clazz Class to looking for
	 * @return a Binder for that class or null if none
	 */
	public PropertyBinder getBinder(Class<?> clazz);
}
