import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Album } from 'src/album.model';

@Injectable({
  providedIn: 'root',
})
export class AlbumService {
  // albums: Album[] = [];
  private static baseUri = 'http://localhost:8880';

  constructor(private http: HttpClient) {
    // this.http.get<Album[]>('../assets/albums.json').subscribe((data) => (this.albums = data));
  }

  addAlbum(a: Album) {
    // this.albums.push(a);
    this.http
      .post(AlbumService.baseUri + '/add', a)
      .subscribe((data) => (data = a));
  }

  getAll() {
    console.log(this.http.get<Album[]>(AlbumService.baseUri + '/albums'));

    return this.http.get<Album[]>(AlbumService.baseUri + '/albums');
  }

  findById(id: number) {
    return this.http.get<Album>(AlbumService.baseUri + '/album/' + id);
  }

  findByTitle(title: string) {
    return this.http.get<Album>(AlbumService.baseUri + '/album/title/' + title);
  }

  findByArtist(artist: string) {
    return this.http.get<Album[]>(
      AlbumService.baseUri + '/album/artist/' + artist
    );
  }

  findByGenre(genre: string) {
    return this.http.get<Album[]>(
      AlbumService.baseUri + '/album/genre/' + genre
    );
  }

  delAlbum(idx: number) {
    return this.http.delete<Album>(AlbumService.baseUri + '/album/' + idx);
  }
}
