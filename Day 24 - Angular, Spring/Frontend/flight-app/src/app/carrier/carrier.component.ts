import { Component } from '@angular/core';
import { FlightService } from '../services/flight.service';
import { Flight } from 'src/models/flight';

@Component({
  selector: 'app-carrier',
  templateUrl: './carrier.component.html',
  styleUrls: ['./carrier.component.css']
})
export class CarrierComponent {

  flights:Flight[] = [];
  carriers: string[] = ['Jet', 'Indigo', 'AirIndia', 'Vistara'];
  carrier:string = "";

  constructor(private service: FlightService) { }

  search(){
    this.service.findByCarrier(this.carrier).subscribe(data=>this.flights=data);
  }
}
