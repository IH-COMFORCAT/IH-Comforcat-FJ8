import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FanListComponent } from './fan-list.component';

describe('FanListComponent', () => {
  let component: FanListComponent;
  let fixture: ComponentFixture<FanListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FanListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FanListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
