import { Component, OnInit } from '@angular/core';
import { Album } from 'src/album.model';
import { AlbumService } from '../services/album.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css'],
})
export class SearchComponent implements OnInit {
  album: Album = new Album();
  flag: boolean = false;
  constructor(private service: AlbumService) {}
  ngOnInit(): void {}

  findAlbumById() {
    this.service.findById(this.album.id).subscribe((data) => (this.album = data));
    this.flag = true;
  }
}
