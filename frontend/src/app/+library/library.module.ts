import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Http } from '@angular/http';
import { LibraryComponent } from './library.component';
import { LibraryRoutingModule } from './library.routing';
import { DataTableModule } from "primeng/primeng";
import { TranslateModule, TranslateLoader } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';

export function HttpLoaderFactory(http: Http) {
    return new TranslateHttpLoader(http);
}

@NgModule({
    imports: [ LibraryRoutingModule, FormsModule, DataTableModule,
    TranslateModule.forChild({
            loader: {
                provide: TranslateLoader,
                useFactory: HttpLoaderFactory,
                deps: [Http]
            }
        }) ],
    declarations: [ LibraryComponent ],
    exports: [ LibraryComponent ]
})
export class LibraryModule{}