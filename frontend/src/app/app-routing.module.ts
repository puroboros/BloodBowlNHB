import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './app.pages';
import { ProfileComponent } from './app.pages';


const routes: Routes = [
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },{
    path: 'home',
    component:HomeComponent
  },{
    path: 'profile',
    component:ProfileComponent
  },
  {
    path: 'library',
    loadChildren: './+library/library.module#LibraryModule'          
  }
]

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]

})
export class AppRoutingModule { }
