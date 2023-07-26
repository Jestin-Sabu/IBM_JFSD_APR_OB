import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ListComponent } from './list/list.component';
import { SearchComponent } from './search/search.component';
import { GenreComponent } from './genre/genre.component';
import { TitleComponent } from './title/title.component';
import { ArtistComponent } from './artist/artist.component';

const routes: Routes = [
  {path:'add', component:AddComponent},
  {path: 'list', component:ListComponent},
  {path: 'searchbyid', component:SearchComponent},
  {path: 'searchbytitle', component:TitleComponent},
  {path: 'searchbyartist', component:ArtistComponent},
  {path: 'searchbygenre', component:GenreComponent},
  {path: '**', redirectTo:'/list', pathMatch:'full'}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
