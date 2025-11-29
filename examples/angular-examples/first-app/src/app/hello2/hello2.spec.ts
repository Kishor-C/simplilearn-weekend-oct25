import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Hello2 } from './hello2';

describe('Hello2', () => {
  let component: Hello2;
  let fixture: ComponentFixture<Hello2>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Hello2]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Hello2);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
