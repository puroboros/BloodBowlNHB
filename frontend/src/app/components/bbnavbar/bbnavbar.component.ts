import { Component } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
@Component({
    selector: 'nhb-bbnav',
    templateUrl: './bbnavbar.html',
    styleUrls: ['./bbnavbar.css']/*,
    providers: [???]*/
})

export class BBNavbarComponent {
    toggle = '';
    constructor(private translate: TranslateService) {
    }
}


