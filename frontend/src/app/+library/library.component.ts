import { Component, OnInit } from '@angular/core';
import { LibraryService } from './library.service';
import { Skill } from './skill';
@Component({
    selector: 'library',
    templateUrl: './library.html',
    styleUrls: ['./library.css'],
    providers: [LibraryService]
})

export class LibraryComponent implements OnInit {
    abilities: Skill[];

    constructor(private libraryService: LibraryService) { }

    ngOnInit() {
        this.libraryService.findAll().then(data => {
            this.abilities = data;
        }, error => {
            console.log("haha");
        });

    }
}




