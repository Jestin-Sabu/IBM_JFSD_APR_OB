import { Component } from '@angular/core';
import { Flight } from 'src/models/flight';
import { FlightService } from '../services/flight.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {

  flights: Flight[] = [];

  constructor(private service: FlightService){
    this.service.getAll().subscribe(data=>this.flights=data);
  }

  delete(code:number){
    this.service.delete(code).subscribe(data=>this.flights=data);
    location.reload();
  }
}
