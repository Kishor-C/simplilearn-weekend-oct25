import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropertyDemo } from './property-demo';

describe('PropertyDemo', () => {
  let component: PropertyDemo;
  let fixture: ComponentFixture<PropertyDemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PropertyDemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PropertyDemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
