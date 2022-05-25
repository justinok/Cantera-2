import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Tarea, TareaService } from 'src/app/SERVICE/tarea.service';

/**
 *  La clase add.component.ts nos sirve para usar la funcion de agregar
 *  un nuevo registro telefonico
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */

// Llamamos los componentes necesarios
@Component({
  selector: 'app-add',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})


export class AgregarComponent implements OnInit {

  // Inicializamos las variables de ls bases de datos
  tareaNueva: Tarea={id:'',name:'',number:'',e_mail:'',born_date:'',
    Finalizado:false};

  // Le pasamos al constructor el servicio de la tarea y la ruta
  constructor(private tareaService: TareaService, private router:Router) { }

  ngOnInit(): void {

  }

  // Creamos la funcion de agregar un nuevo registro telefonico
  agregarTarea(){
    this.tareaService.saveTarea(this.tareaNueva).subscribe(
      res=>{
        console.log(res);
        this.router.navigate(['/start']);
      },
      err=>console.log(err)
    );
  }

}
