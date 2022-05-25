import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgregarComponent } from './agregar.component';

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
describe('AgregarComponent', () => {
  let component: AgregarComponent;
  let fixture: ComponentFixture<AgregarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AgregarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AgregarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
