import { Component, OnInit } from '@angular/core';
import { Logger } from "angular2-logger/core";
@Component({
    selector: 'home',
    templateUrl: './home.html'
})

export class HomeComponent implements OnInit {
    constructor(private _logger: Logger){

    }

    ngOnInit(){
        this._logger.info("[HomeComponent].ngOnInit()!");
    }
}




