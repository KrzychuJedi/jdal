/*
 * Copyright 2008-2015 Jose Luis Martin.
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
package org.jdal.xml;

/**
 * Interface to marshal/unmarshall java objects to/from xml.
 * Use to hide the xml binding framework.
 * 
 * @author Jose Luis Martin
 * @since 1.0
 */
public interface XMLMapper {
	
	/**
	 * Serialize an object to xml string
	 * @param obj the object to serialize
	 * @return xml string representation of obj.
	 */
	String serialize(Object obj);
	
	/**
	 * Deserialize a xml string to an java object
	 * @param xml to deserialize
	 * @return a java object.
	 */
	Object deserialize(String xml);
}
