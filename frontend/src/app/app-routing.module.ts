import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/app.pages';



const routes: Routes = [
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },{
    path: 'home',
    component:HomeComponent
  }/*,
  { friendly reminder for lazy load
    path: 'location',
    loadChildren: './pages/+location/location.module#LocationModule'          
  }*/
]

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]

})
export class AppRoutingModule { }
