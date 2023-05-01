package com.jsp.SpringbootCRUD.service;

import java.util.stream.Stream;

import com.jsp.SpringbootCRUD.dto.Employee;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.mockito.internal.progress.ArgumentMatcherStorage;


public class EmployeeArgumentsProvider implements ArgumentsProvider {
Employee employee=new Employee(11,null,1234567890,"john.doe@example.com","password123",65900.00);
Employee employeTwo=new Employee(11,"Prashant",1234567890,"pra.doe@example.com","password123",65900.00);
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
		return Stream.of(
				Arguments.of(employee)
//				Arguments.of(employeTwo)
		);
	}

}
