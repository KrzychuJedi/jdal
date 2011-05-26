package lazy;

import info.joseluismartin.dao.Dao;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/*
 * Copyright 2009-2011 the original author or authors.
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

/**
 * @author Jose Luis Martin - (jlm@joseluismartin.info)
 *
 */
@ContextConfiguration(locations={"classpath*:/applicationContext.xml"})
public class LazyGuardTest extends AbstractJUnit4SpringContextTests {
	
	private static final Log log = LogFactory.getLog(LazyGuardTest.class);

	@Resource
	private Dao<Dog, Long> dogDao; 
	
	@Test
	public void testLazyInicialization() throws Exception {
		Dog dog = dogDao.get(1l);
		
		for (Cat cat : dog.getCats()) 
			log.info(cat.getName());
	}

}