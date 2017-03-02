import { Component } from '@angular/core';
@Component({
    selector: 'library',
    templateUrl: './library.html',
    styleUrls:[ './library.css' ]/*,
    providers: [???]*/
})

export class LibraryComponent {
    abilities: {name:string,description:string,type:string}[]= [{name:"dodge",description:"dodges",type:"agility"},
    {name:"mighty blow", description:"+1", type:"strength"}, {name:"block", description:"blocks", type:"general"}];
}




