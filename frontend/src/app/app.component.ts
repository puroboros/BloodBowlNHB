import { Component } from '@angular/core';

 declare var sergio: any;
@Component({
  selector: 'my-app',
  template: `
  <div class="container">
    <h1>NHB</h1>
    
    <nav>
    <a routerLink="/home" routerLinkActive="active">Home</a>
    </nav>
  </div>
  <router-outlet></router-outlet>
  `,
  styleUrls: ['./app.component.css']
})

export class AppComponent {
 

 
constructor(){
}
 

}




