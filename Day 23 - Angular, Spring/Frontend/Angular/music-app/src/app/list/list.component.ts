import { Component, OnInit } from '@angular/core';
import { Album } from 'src/album.model';
import { AlbumService } from '../services/album.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css'],
})
export class ListComponent implements OnInit {
  albums: Album[] = [];
  constructor(private service: AlbumService) {}
  ngOnInit(): void {
    // this.albums = this.service.getAll();
    this.service.getAll().subscribe((data) => (this.albums = data));
  }

  delete(index: number){
    var ans=confirm("Are you sure to delete?");
    if(ans)
    this.service.delAlbum(index)
  }
}
