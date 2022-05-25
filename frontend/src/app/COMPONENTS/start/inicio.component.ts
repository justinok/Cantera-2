import { Component, OnInit } from '@angular/core';
import { TareaService } from 'src/app/SERVICE/tarea.service';
/**
 *  En esta clase llamamos a la pagina de inicio donde listaremos los registros
 *  telefonicos y daremos la opcion de eliminar un determinado registro
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */
@Component({
  selector: 'app-start',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  // creamos una lista como vasija para pasarle los registros

  lista:any=[];
  constructor(private tareaService: TareaService) { }

  ngOnInit(): void {
    this.listarTareas();
  }

  // Listamos todos los registros telefonicos que tenemos
  listarTareas()
  {
    this.tareaService.getTareas().subscribe(
      res=>{
        this.lista=res;
        console.log(res);
      },
      err=>console.log(err)
    );

  }

  // eliminamos los registros telefonicos que no deseamos
  eliminar(id:string)
  {
    this.tareaService.deleteTarea(id).subscribe(
      res=>{this.ngOnInit();},
      err=>console.log(err)
    );
  }

}
