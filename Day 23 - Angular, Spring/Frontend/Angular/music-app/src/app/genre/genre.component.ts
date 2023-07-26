import { Component } from '@angular/core';
import { Album } from 'src/album.model';
import { AlbumService } from '../services/album.service';

@Component({
  selector: 'app-genre',
  templateUrl: './genre.component.html',
  styleUrls: ['./genre.component.css'],
})
export class GenreComponent {
  albums: Album[] = [];
  flag: boolean = false;
  genres: string[] = ['Rock', 'Jazz', 'Pop', 'HipHop'];
  genre: string = '';
  constructor(private service: AlbumService) {}
  ngOnInit(): void {}

  findAlbumByGenre() {
    this.service.findByGenre(this.genre).subscribe((data) => (this.albums = data));
    this.flag = true;
  }
}
