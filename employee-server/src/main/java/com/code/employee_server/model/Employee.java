package com.code.employee_server.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
