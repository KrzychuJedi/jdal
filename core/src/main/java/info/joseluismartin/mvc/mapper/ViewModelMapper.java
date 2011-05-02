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
package info.joseluismartin.mvc.mapper;

import java.util.Collection;

/**
 * View model to application model mapper for use with 
 * TableEditor.
 * 
 * @author Jose Luis Martin - (jlm@joseluismartin.info)
 */
@SuppressWarnings("unchecked")
public interface ViewModelMapper {
	/**
	 * Maps model to view model
	 * @param obj to convert to view model
	 * @return view model
	 */
	Object toViewModel(Object obj);
	/**
	 * maps view model to model
	 * @param obj voew model to convert to model
	 * @return model
	 */
	Object fromViewModel(Object obj);
	
	/** 
	 * Same from ViewModel,  but with collections
	 * @param collection the collection to convert
	 * @return converted collection
	 */
	Collection fromViewModelCollection(Collection collection);
	
	/**
	 * Same toViewModel, but with collections
	 * @param collection the collection to convert
	 * @return converted collection
	 */
	Collection toViewModelCollection(Collection collection);

}
