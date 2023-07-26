import { Component } from '@angular/core';
import { Flight } from 'src/models/flight';
import { FlightService } from '../services/flight.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  flight:Flight = new Flight();
  flag:boolean = false;

  constructor(private service: FlightService) { }

  search(){
    this.service.findById(this.flight.code).subscribe(data=>{
      this.flight = data;
      this.flag = true;
    });
  }

}
