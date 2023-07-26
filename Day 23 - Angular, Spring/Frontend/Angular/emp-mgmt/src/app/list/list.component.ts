import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/employee.model';
import { EmployeeService } from '../services/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{
  employees: Employee[] = [];
  constructor(private service: EmployeeService){}
  ngOnInit(): void {
    this.service.getAll().subscribe(data=>this.employees=data);
  }

  delete(index:number){
    this.service.delEmployee(index).subscribe(data=>this.employees=data);
    location.reload();    
  }

}
