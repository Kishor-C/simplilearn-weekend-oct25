import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwoWayDemo } from './two-way-demo';

describe('TwoWayDemo', () => {
  let component: TwoWayDemo;
  let fixture: ComponentFixture<TwoWayDemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TwoWayDemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TwoWayDemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
