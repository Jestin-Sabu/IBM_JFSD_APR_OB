import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Flight } from 'src/models/flight';

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  private static baseUri = "http://localhost:8880";

  flights: Flight[] = [];
  constructor(private http: HttpClient) { }

  addFlight(flight: Flight){
    this.http.post(FlightService.baseUri + "/flight", flight).subscribe(data=>data=flight);
  }

  findById(code:number){
    return this.http.get<Flight>(FlightService.baseUri + "/flight/" + code);
  }

  findByCarrier(carrier:string){
    return this.http.get<Flight[]>(FlightService.baseUri + "/flights/carrier/" + carrier);
  }

  findByRoute(source:string, destination:string){
    return this.http.get<Flight[]>(FlightService.baseUri + "/flights/route/" + source + "/" + destination);
  }

  getAll(){
    return this.http.get<Flight[]>(FlightService.baseUri + "/flights");
  }

  delete(code:number){
    this.http.delete(FlightService.baseUri + "/flight/" + code).subscribe(data=>data=code);
    return this.getAll();
  }

}
