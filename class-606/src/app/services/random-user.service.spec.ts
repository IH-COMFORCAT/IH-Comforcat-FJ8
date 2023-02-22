import { TestBed } from '@angular/core/testing';

import { RandomUserService } from './random-user.service';

describe('RandomUserService', () => {
  let service: RandomUserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RandomUserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
