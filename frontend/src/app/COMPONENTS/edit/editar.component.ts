import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Tarea, TareaService } from 'src/app/SERVICE/tarea.service';

/**
 *  Esta clase sirve para editar un registro telefonico dado, solicita el
 *  Id y luego edita los componentes de este registro
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */

// Llamdo de los componentes
@Component({
  selector: 'app-edit',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})

export class EditarComponent implements OnInit {

  // Inicializamos las variables que editaremos
  id:string="";
  tareaActual: Tarea={id:'',name:'',number:'',e_mail:'',born_date:'',Finalizado:false};
  constructor(
    private tareaService:TareaService,
    private antivateRouter: ActivatedRoute,
    private router:Router
    ) { }

  ngOnInit(): void {
    this.id= this.antivateRouter.snapshot.params.id;
    this.tareaService.getUnaTarea(this.id).subscribe(
      res=>{
        this.tareaActual=res;
      },

      err=>console.log(err)
    );
  }


  // Creamos la funcion que llamaremos para editar un registro telefonico
  guardad(){
    this.tareaService.editTarea(this.id, this.tareaActual).subscribe(
      res=>{
        this.router.navigate(['/start']);
      },

      err=>console.log(err)
    );
  }

}
