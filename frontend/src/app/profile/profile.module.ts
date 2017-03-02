import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ProfileComponent } from "./profile.component";
@NgModule({
    imports: [ ProfileComponent, FormsModule ],
    declarations: [ ProfileComponent ],
    exports: [ ProfileComponent ]
})
export class ProfileModule{}