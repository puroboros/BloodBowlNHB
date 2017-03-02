import { Component } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'my-app',
  template: `
    <bbnav></bbnav>
  
  <div style="float:left">
  <div class="container-fluid">
    <router-outlet></router-outlet>
  </div>
  </div>
  `,
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  constructor(private translate: TranslateService) {
    this.translate.addLangs(["es", "en"]);
    this.translate.setDefaultLang('es');
    let browserLang: string = this.translate.getBrowserLang();
    this.translate.use(browserLang.match(/es|en/) ? browserLang : 'es');
  }
}