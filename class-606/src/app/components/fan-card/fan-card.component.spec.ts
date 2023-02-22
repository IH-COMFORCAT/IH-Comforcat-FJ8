import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FanCardComponent } from './fan-card.component';

describe('FanCardComponent', () => {
  let component: FanCardComponent;
  let fixture: ComponentFixture<FanCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FanCardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FanCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
