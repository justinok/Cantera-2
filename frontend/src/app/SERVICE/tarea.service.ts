import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
/**
 *  Esta es presuntamente la clase mas improtante.
 *  Es aqui donde llamamos el trabajo que hicimos previamente en java y SQL
 *  llamaremos la informacion que mandamos desde alla y la incorporaremos a
 *  este proyecto como una tarea
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */


@Injectable({
  providedIn: 'root'
})
export class TareaService {

  // Aqui debemos pasar el url que generamos en el proyecto CRUD contenido
  // en este mismo repositorio

  url='http://localhost:8080/api/tareas';
  constructor(private http: HttpClient) { }

  /**
   * Traemos las funciones CRUD que creamos previmanete
   */
  getTareas():Observable<any>
  {
    return this.http.get(this.url);
  }

  getUnaTarea(id: string):Observable<any>
  {
    return this.http.get(this.url+'/'+id);
  }

  saveTarea(tarea: Tarea):Observable<any>
  {
    return this.http.post(this.url, tarea);
  }

  editTarea(id:string, tarea: Tarea):Observable<any>
  {
    return this.http.put(this.url+'/'+id, tarea);
  }

  deleteTarea(id:string):Observable<any>
  {
    return this.http.delete(this.url+'/'+id);
  }
}

/**
 * En vez de crear otra clase se exporta la interface desde aqui mismo
 */

export interface Tarea{
  id: String;
  name: String;
  number: String;
  e_mail: String;
  born_date: String;
  Finalizado: Boolean;

}
