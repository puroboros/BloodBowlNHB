import { Component, OnInit } from '@angular/core';
import { LibraryService } from './library.service';
import { Skill } from './skill';
@Component({
    selector: 'nhb-library',
    templateUrl: './library.html',
    styleUrls: ['./library.css'],
    providers: [LibraryService]
})

export class LibraryComponent implements OnInit {
    abilities: Skill[];

    constructor(private libraryService: LibraryService) { }

    ngOnInit() {
        this.libraryService.findAll().then(data => {
            this.abilities = data.content;
        }, error => {
            console.log("haha");
        });

    }
}
