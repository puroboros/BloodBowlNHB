import { Component } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
@Component({
    selector: 'bbnav',
    templateUrl: './bbnavbar.html',
    styleUrls: ['./bbnavbar.css']/*,
    providers: [???]*/
})

export class BBNavbarComponent {
    toggle: string = "";
    constructor(private translate: TranslateService) {
    }
}


