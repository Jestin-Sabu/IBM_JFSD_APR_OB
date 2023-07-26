import { Component } from '@angular/core';
import { Album } from 'src/album.model';
import { AlbumService } from '../services/album.service';

@Component({
  selector: 'app-artist',
  templateUrl: './artist.component.html',
  styleUrls: ['./artist.component.css'],
})
export class ArtistComponent {
  albums: Album[] = [];
  flag: boolean = false;
  artist: string = '';
  constructor(private service: AlbumService) {}
  ngOnInit(): void {}

  findAlbumByArtist() {
    this.service.findByArtist(this.artist).subscribe((data) => (this.albums = data));
    this.flag = true;
  }
}
