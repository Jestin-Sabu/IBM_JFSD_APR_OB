const Person = require("./person").Person

class Employee extends Person{
    constructor(name, age, salary){
        super(name, age);
        this.salary = salary;
    }

    payslip = () => {
        this.print();
        console.log("Salary: " + this.salary);
    }
}

let e = new Employee("Polo", 25, "45000");
e.payslip();