import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `
  <div class="container">
    <h1>BloodBown NHB</h1>
    
    <nav>
		<a routerLink="/home" routerLinkActive="active">Home</a>
    </nav>
  </div>
  <router-outlet></router-outlet>
  `,
  styleUrls: ['./app.component.css']
})

export class AppComponent {
	constructor(){}
}




