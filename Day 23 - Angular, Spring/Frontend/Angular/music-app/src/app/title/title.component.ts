import { Component } from '@angular/core';
import { Album } from 'src/album.model';
import { AlbumService } from '../services/album.service';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.css']
})
export class TitleComponent {
  album: Album = new Album();
  flag: boolean = false;
  constructor(private service: AlbumService) {}
  ngOnInit(): void {}

  findAlbumByTitle() {
    this.service.findByTitle(this.album.title).subscribe((data) => (this.album = data));
    this.flag = true;
  }
}
