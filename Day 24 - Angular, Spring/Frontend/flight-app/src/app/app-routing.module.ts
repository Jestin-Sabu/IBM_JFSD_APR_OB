import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ListComponent } from './list/list.component';
import { SearchComponent } from './search/search.component';
import { RouteComponent } from './route/route.component';
import { CarrierComponent } from './carrier/carrier.component';

const routes: Routes = [
  {path: 'add', component: AddComponent},
  {path: 'list', component: ListComponent},
  {path: 'search', component: SearchComponent},
  {path: 'route', component: RouteComponent},
  {path: 'carrier', component: CarrierComponent},
  {path: '', redirectTo: '/list', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
