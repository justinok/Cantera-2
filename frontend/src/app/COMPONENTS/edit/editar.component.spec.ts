import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarComponent } from './editar.component';

/**
 * Clase generada por angular
 *
 * @author Angular
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */
describe('EditarComponent', () => {
  let component: EditarComponent;
  let fixture: ComponentFixture<EditarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
