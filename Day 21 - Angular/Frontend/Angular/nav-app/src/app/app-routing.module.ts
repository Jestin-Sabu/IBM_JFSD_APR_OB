import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ListComponent } from './list/list.component';
import { SearchComponent } from './search/search.component';
import { SortComponent } from './sort/sort.component';

const routes: Routes = [
  {path: 'add', component:AddComponent},
  {path: 'list', component:ListComponent},
  {path: 'search', component:SearchComponent},
  {path: 'sort', component:SortComponent},
  {path: '**', redirectTo:'/add', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
