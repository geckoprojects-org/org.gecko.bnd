/**
 * Copyright (c) 2012 - 2021 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package {{basePackageName}};

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.Dictionary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.dictionary.Dictionaries;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * This is your example OSGi integration test class
 * @since 1.0
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
public class ExampleIntegrationTest {
	
	public interface MyTest {
		int getTest();
	}
	
	/**
	 * Setup the services and maybe mock the services.
	 * The registered services are unregistered after the test
	 * @param bc the {@link BundleContext} that closes after each test
	 */
	@BeforeEach
	private void setupServices(@InjectBundleContext BundleContext bc) {
		Dictionary<String, Object> eventAdminProperties = Dictionaries.dictionaryOf(Constants.SERVICE_RANKING, 1000);
		EventAdmin eventAdmin = mock(EventAdmin.class);
		bc.registerService(EventAdmin.class, eventAdmin, eventAdminProperties);
		
		MyTest myTest = mock(MyTest.class);
		bc.registerService(MyTest.class, myTest, null);
	}
	
	@Test
	public void testEventAdminExists(@InjectService EventAdmin eventAdmin, @InjectService ServiceAware<MyTest> myTestAware) {
		assertNotNull(eventAdmin);
		assertThat(myTestAware.getServices()).hasSize(1);
		
		assertThatExceptionOfType(IllegalStateException.class).isThrownBy(() -> {
			throw new IllegalStateException("Test");
		});
		Mockito.verify(eventAdmin, Mockito.never()).postEvent(Mockito.any(Event.class));
	}
	
}
