import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StyleClassDemo } from './style-class-demo';

describe('StyleClassDemo', () => {
  let component: StyleClassDemo;
  let fixture: ComponentFixture<StyleClassDemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [StyleClassDemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StyleClassDemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
