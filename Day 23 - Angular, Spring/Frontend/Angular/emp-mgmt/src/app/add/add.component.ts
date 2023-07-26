import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/employee.model';
import { EmployeeService } from '../services/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css'],
})
export class AddComponent implements OnInit {
  emp: Employee = new Employee();
  posts: string[]=['Finance Manager', 'HR Manager', 'Project Manager', 'Product Manager', 'Marketing Manager']
  constructor(private service: EmployeeService, private route: Router) {}
  ngOnInit(): void {
    this.emp.hireDate=new Date();
  }

  saveEmployee(){
    this.service.addEmployee(this.emp);
    this.route.navigate(['list']);
  }
}
