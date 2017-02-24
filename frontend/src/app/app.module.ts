import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule} from './app-routing.module';
import { HomeComponent } from './pages/app.pages';





@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpModule
  ],
  declarations: [AppComponent, HomeComponent],
  bootstrap: [AppComponent],
  providers: [ ]

})
export class AppModule { }
