import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignOperationComponent } from './assign-operation.component';

describe('AssignOperationComponent', () => {
  let component: AssignOperationComponent;
  let fixture: ComponentFixture<AssignOperationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AssignOperationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AssignOperationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
