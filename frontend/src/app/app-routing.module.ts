import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from './COMPONENTS/add/agregar.component';
import { EditarComponent } from './COMPONENTS/edit/editar.component';
import { InicioComponent } from './COMPONENTS/start/inicio.component';

const routes: Routes = [
  {path:'', redirectTo:'start', pathMatch:'full'},

  {path:'start', component:InicioComponent},
  {path:'edit/:id', component: EditarComponent},
  {path:'add', component:AgregarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
