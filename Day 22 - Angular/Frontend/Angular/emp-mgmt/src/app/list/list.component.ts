import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/employee.model';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{
  employees: Employee[] = [];
  constructor(private service: EmployeeService){}
  ngOnInit(): void {
    this.employees = this.service.getAll();
  }

  delete(index:number){
    this.employees = this.service.delEmployee(index);
  }

}
