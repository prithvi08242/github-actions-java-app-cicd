package com.example.employeemanagement;

import com.example.employeemanagement.controller.EmployeeController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeControllerTest {

    @Test
    void shouldReturnTwoEmployees() {
        EmployeeController controller = new EmployeeController();
        assertEquals(2, controller.getEmployees().size());
    }
}
