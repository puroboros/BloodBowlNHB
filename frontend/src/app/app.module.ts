import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Logger, Options as LoggerOptions, Level as LoggerLevel  } from 'angular2-logger/core';
import { HttpModule, Http } from '@angular/http';

import { AppComponent } from './app.component';


import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './app.pages';
import { ProfileComponent } from './app.pages';
import { BBNavbarModule } from './components/app.components';

import {TranslateModule, TranslateLoader} from '@ngx-translate/core';
import {TranslateHttpLoader} from '@ngx-translate/http-loader'

export function HttpLoaderFactory(http: Http) {
    return new TranslateHttpLoader(http);
}

@NgModule({
 imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpModule,
    BBNavbarModule,
    TranslateModule.forRoot({
            loader: {
                provide: TranslateLoader,
                useFactory: HttpLoaderFactory,
                deps: [Http]
            }
        })
  ],
  declarations: [AppComponent, HomeComponent, ProfileComponent],
  bootstrap: [AppComponent],
  providers: [ Logger,  { provide: LoggerOptions, useValue: { level: LoggerLevel.INFO } } ]
})
export class AppModule { }
