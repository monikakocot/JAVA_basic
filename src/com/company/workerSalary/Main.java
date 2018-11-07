package com.company.workerSalary;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;

/*Output = the sum of the salary of all employees
 */
public class Main {

    public static void main(String[] args) {

        Employee janek =new Employee("Jan","Kowalski",3000);
        Employee alek = new Employee("Alex","Maliniak",2000.50);
        Employee zosia = new Employee("Zosia","Ogryzek",6500.50);

        System.out.println();
        List<Employee> employees = Employee.getAllEmployees();
/*albo
List<Employe> employees=(List<Employe>)
Employe.getAllemployees();
*/
        System.out.println();
        for(Employee employee:employees)

            System.out.println(employee);

        System.out.println();
        System.out.println("Sum of the salary of all employees");
        System.out.println(Employee.sumAllSalaries());
    }

}


